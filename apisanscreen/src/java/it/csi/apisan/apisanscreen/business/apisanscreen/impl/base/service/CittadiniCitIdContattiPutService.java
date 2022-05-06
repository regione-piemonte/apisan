/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;
import javax.xml.ws.Holder;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.ScreenAnagraficaRESTBaseService;
import it.csi.apisan.apisanscreen.dto.apisanscreen.PayloadContattiModifica;
import it.csi.apisan.apisanscreen.exception.ErroreBuilder;
import it.csi.apisan.apisanscreen.util.ApisanScreenStatus;
import it.csi.apisan.apisanscreen.util.ConstantsScreen;
import it.csi.gestutility.ErroriType;
import it.csi.screenserviziwebsol.CredenzialiType;
import it.csi.screenserviziwebsol.ScrAna01OutParametersType;
import it.csi.screenserviziwebsol.SetSituazioneAssTelWEBFaultException;
import it.csi.screenserviziwebsol.SetSituazioneAssTelWEBInParametersType;
import it.csi.screenserviziwebsol.SetSituazioneAssTelWEBOutParametersType;
import it.csi.screenserviziwebsol.TipoScreenType;
import it.csi.screenserviziwebsol.TrasmettiNotificaFaultException;
import it.csi.screenserviziwebsol.TrasmettiNotificaInParametersType;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdContattiPutService extends ScreenAnagraficaRESTBaseService {
	
	private String codiceInterno; 
	private String codiceInternoPrefisso;
	private PayloadContattiModifica payloadContattiModifica;
	
	public CittadiniCitIdContattiPutService(String citId, String codiceInterno, String codiceInternoPrefisso, 
			PayloadContattiModifica payloadContattiModifica,SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(citId, securityContext, httpHeaders);
		this.codiceInterno = codiceInterno; 
		this.codiceInternoPrefisso = codiceInternoPrefisso;
		this.payloadContattiModifica = payloadContattiModifica;
	}


	@Override
	protected Response execute() {
		final String methodName = "execute";
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Utente non autorizzato");
		checkNotBlank(citId, "Cit Id non valorizzato");
		
		checkNotNull(codiceInterno, "Codice Interno non valorizzato");
		checkNotNull(codiceInternoPrefisso, "Codice Interno Prefisso non valorizzato");		
		checkNotNull(payloadContattiModifica, "Payload non valorizzato");
		
		checkNotBlank(codiceInterno, "Codice Interno non valorizzato");
		checkNotBlank(codiceInternoPrefisso, "Codice Interno Prefisso non valorizzato");
		checkUtenteAutorizzatoOrDelegato(citId);
		Integer codInterno = null;
		try {
			codInterno = Integer.valueOf(codiceInterno);
			
		} catch(NumberFormatException nfe) {
			throw ErroreBuilder.from(ApisanScreenStatus.PARAMETRO_NON_VALIDO, "Codice Interno").exception();
		}		
		
		checkIdInternoValido(codInterno, codiceInternoPrefisso);
		
		CredenzialiType credenziali = getCredenzialiType(citId);
		
		SetSituazioneAssTelWEBInParametersType inParam = new SetSituazioneAssTelWEBInParametersType();
		
		inParam.setICODIDINTERNO(codInterno);
		
		inParam.setIPREFIDINTERNO(codiceInternoPrefisso);
		
		inParam.setIIDUTENTE(ConstantsScreen.ID_UTENTE);
		inParam.setIUTENTEUVOS(ConstantsScreen.ID_UTENTE_VOS);
		
		inParam.setITIPOSCREENING(TipoScreenType.CV);
		
		riempiParamDaPayload(inParam);
		Holder<ErroriType> errori = new Holder<ErroriType>();
		
		Holder<SetSituazioneAssTelWEBOutParametersType> outParam = new Holder<SetSituazioneAssTelWEBOutParametersType>();  
		
		try {
			soapClient.setSituazioneAssTelWEB(credenziali, inParam, errori, outParam);
		} catch (SetSituazioneAssTelWEBFaultException e) {
			log.error(methodName, e.getMessage(), e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore durante la chiamata al servizio setSituazioneAssTelWEB").exception();
		}
		checkSuccesso(errori, CittadiniCitIdContattiPutService.class);
		//CDU-304 se la modifica è andata a buon fine e delegante diverso da delegato bisogna mandare trasmettinotificfa
		//BISOGNA RICHIAMARLO SEMPRE!!
		//richiamarlo sempre e cognome e nome ricavarli dalla src01Ana
		
		if (!shibIdentitaCodiceFiscale.equalsIgnoreCase(citId)) {
			try {
				ScrAna01OutParametersType assistito = chiamataScrAna(CittadiniCitIdContattiPutService.class);
				//DEVO INSERIRE nome e cognome dell'assistito -> assumo che assistito è sempre = al delegante
				TrasmettiNotificaInParametersType trasmettiNotificaInParameters = new TrasmettiNotificaInParametersType();
				if (assistito != null) {
					trasmettiNotificaInParameters = new TrasmettiNotificaInParametersType();
					trasmettiNotificaInParameters.setPCognome(assistito.getPCognome());
					trasmettiNotificaInParameters.setPNome(assistito.getPNome());
					trasmettiNotificaInParameters.setPComponente(ConstantsScreen.COMPONENTE_PER_NOTIFICA);
					trasmettiNotificaInParameters.setPTipoNotifica(3);
					trasmettiNotificaInParameters.setPTipoScreening(TipoScreenType.CV.value());
				}
				try {
					ErroriType erroriNotifica = soapClient.trasmettiNotifica(credenziali,
							trasmettiNotificaInParameters);
					checkSuccessoNotifica(erroriNotifica, CittadiniCitIdContattiPutService.class);
				} catch (TrasmettiNotificaFaultException e) {
					log.error(methodName, "Errore nel richiamo del servizio di notifica", e);
				}
			} catch (Exception e) {
				log.error(methodName, "ERRORE NOTIFICA", e);
			} 
		}
		return Response.status(204).build();
	}
	
	private void riempiParamDaPayload(SetSituazioneAssTelWEBInParametersType inParam) {
		inParam.setIEMAIL(payloadContattiModifica.getEmail());
		inParam.setITELALRTRES(payloadContattiModifica.getTelefono1());
		inParam.setITELALTDOM(payloadContattiModifica.getTelefono2());
	}

}
