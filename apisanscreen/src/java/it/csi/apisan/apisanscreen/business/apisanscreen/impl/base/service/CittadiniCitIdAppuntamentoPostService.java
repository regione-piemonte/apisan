/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service;

import java.text.SimpleDateFormat;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;
import javax.xml.ws.Holder;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.ScreenAnagraficaRESTBaseService;
import it.csi.apisan.apisanscreen.business.mapper.PayloadAppuntamentoNiovoCreaAppuntamentoWEBInParametersTypeMapper;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelAppuntamentoDettaglio;
import it.csi.apisan.apisanscreen.dto.apisanscreen.PayloadAppuntamentoNiovo;
import it.csi.apisan.apisanscreen.exception.ErroreBuilder;
import it.csi.apisan.apisanscreen.util.ApisanScreenStatus;
import it.csi.apisan.apisanscreen.util.ConstantsScreen;
import it.csi.gestutility.ErroriType;
import it.csi.screenserviziwebsol.CreaAppuntamentoWEBFaultException;
import it.csi.screenserviziwebsol.CreaAppuntamentoWEBInParametersType;
import it.csi.screenserviziwebsol.CreaAppuntamentoWEBOutParametersType;
import it.csi.screenserviziwebsol.CredenzialiType;
import it.csi.screenserviziwebsol.ScrAna01OutParametersType;
import it.csi.screenserviziwebsol.TipoScreenType;
import it.csi.screenserviziwebsol.TrasmettiNotificaFaultException;
import it.csi.screenserviziwebsol.TrasmettiNotificaInParametersType;


@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdAppuntamentoPostService extends ScreenAnagraficaRESTBaseService {
	
	
	String codiceInterno;
	String codiceInternoPrefisso; 
	PayloadAppuntamentoNiovo payloadAppuntamentoNiovo;
	private SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy"); 
	
	public CittadiniCitIdAppuntamentoPostService(String citId, String codiceInterno,
			String codiceInternoPrefisso, PayloadAppuntamentoNiovo payloadAppuntamentoNiovo,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(citId, securityContext, httpHeaders);
		this.codiceInterno = codiceInterno;
		this.codiceInternoPrefisso = codiceInternoPrefisso; 
		this.payloadAppuntamentoNiovo = payloadAppuntamentoNiovo;
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
		checkNotNull(payloadAppuntamentoNiovo, "Payload non valorizzato");
		
		checkNotBlank(codiceInterno, "Codice Interno non valorizzato");
		checkNotBlank(codiceInternoPrefisso, "Codice Interno Prefisso non valorizzato");
		checkPayloadValido();
		checkUtenteAutorizzatoOrDelegato(citId);
		
		Integer codInterno = null;
		try {
			codInterno = Integer.valueOf(codiceInterno);
			
		} catch(NumberFormatException nfe) {
			throw ErroreBuilder.from(ApisanScreenStatus.PARAMETRO_NON_VALIDO, "Codice Interno").exception();
		}		
		
		checkIdInternoValido(codInterno, codiceInternoPrefisso);
		
		CredenzialiType credenziali = getCredenzialiType(citId);
		
		CreaAppuntamentoWEBInParametersType inParam = new PayloadAppuntamentoNiovoCreaAppuntamentoWEBInParametersTypeMapper().to(payloadAppuntamentoNiovo);
		inParam.setICODIDINTERNO(codInterno);
		inParam.setIPREFIDINTERNO(codiceInternoPrefisso);
		inParam.setIIDUTENTE(ConstantsScreen.ID_UTENTE);
		inParam.setIUTENTEUVOS(ConstantsScreen.ID_UTENTE_VOS);
		
		Holder<ErroriType> errori = new Holder<ErroriType>();
		
		Holder<CreaAppuntamentoWEBOutParametersType> outParam = new Holder<CreaAppuntamentoWEBOutParametersType>();
		
		try {
			soapClient.creaAppuntamentoWEB(credenziali, inParam, errori, outParam);
		} catch (CreaAppuntamentoWEBFaultException e) {
			log.error(methodName, e.getMessage(), e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore durante la chiamata al servizio creaAppuntamentoWEB").exception();
		}
		checkSuccesso(errori, CittadiniCitIdAppuntamentoPostService.class);
		
		//2.8	CDU-307 richiamo il servizio di trasmettinotifica
		//DEVO INSERIRE nome e cognome dell'assistito
		//Controllo da rimettere dopo che avranno fatto i test 
		if (!citId.equalsIgnoreCase(shibIdentitaCodiceFiscale)) {
			try {
				ScrAna01OutParametersType assistito = chiamataScrAna(CittadiniCitIdAppuntamentoPostService.class);
				if (assistito != null) {
					TrasmettiNotificaInParametersType trasmettiNotificaInParameters = new TrasmettiNotificaInParametersType();
					trasmettiNotificaInParameters.setPCognome(assistito.getPCognome());
					trasmettiNotificaInParameters.setPNome(assistito.getPNome());
					trasmettiNotificaInParameters.setPComponente(ConstantsScreen.COMPONENTE_PER_NOTIFICA);
					trasmettiNotificaInParameters.setPTipoNotifica(1);
					trasmettiNotificaInParameters.setPTipoScreening(payloadAppuntamentoNiovo.getTipologiaCodice());
					trasmettiNotificaInParameters.setPDataAppuntamento(sd.format(payloadAppuntamentoNiovo.getData()));
					trasmettiNotificaInParameters.setPOraAppuntamento(payloadAppuntamentoNiovo.getOra());
					//trasmettiNotificaInParameters.setPUnitaOperativa(payloadAppuntamentoNiovo.getUnitaOperativaCodice());

					
					//rivedere la chiamata sulle unita operative
					/*ModelUnitaOperativaLista unita = getUnitaOperativa(codInterno, this.codiceInternoPrefisso,
							payloadAppuntamentoNiovo.getTipologiaCodice(), CittadiniCitIdAppuntamentoPostService.class,
							payloadAppuntamentoNiovo.getUnitaOperativaCodice(), payloadAppuntamentoNiovo.getAslCodice().toString());*/
					
					ModelAppuntamentoDettaglio unita = getUnitaOperativa(codInterno, this.codiceInternoPrefisso,
							payloadAppuntamentoNiovo.getTipologiaCodice(), CittadiniCitIdAppuntamentoPostService.class);

					if (unita != null) {
						trasmettiNotificaInParameters.setPUnitaOperativa(unita.getUnitaOperativaDescrizione());
						if (unita.getIndirizzoGeo() != null) {
							String prepStradario =  unita.getIndirizzoGeo().getPrepStradario() != null ? " " + unita.getIndirizzoGeo().getPrepStradario() + " ": " ";  
							String indirizzo = unita.getIndirizzoGeo().getTipoViaStradario() + " " + prepStradario + unita.getIndirizzoGeo().getVia() ;
							trasmettiNotificaInParameters.setPIndirizzo(unita.getUnitaOperativaIndirizzo());
							trasmettiNotificaInParameters.setPNumeroCivico(unita.getUnitaOperativaCivico());
							trasmettiNotificaInParameters.setPComune(unita.getUnitaOperativaComune());							
						} 
					}
					try {
						ErroriType erroriNotifica = soapClient.trasmettiNotifica(credenziali,
								trasmettiNotificaInParameters);
						checkSuccessoNotifica(erroriNotifica, CittadiniCitIdAppuntamentoPostService.class);
					} catch (TrasmettiNotificaFaultException e) {
						log.error(methodName, "Errore nel richiamo del servizio di notifica", e);
					}
				}
			} catch (Exception e) {
				log.error(methodName, "ERRORE NOTIFICA", e);
			} 
		}
		return Response.ok().build();
	}
	
	
	private void checkPayloadValido() {
		//TODO verificare i dati che possono essere null o meno
		checkNotNull(payloadAppuntamentoNiovo.getAgendaCodice(), "Codice azienda non valorizzato");
		checkNotNull(payloadAppuntamentoNiovo.getAslCodice(), "Codice asl non valorizzato");
		checkNotNull(payloadAppuntamentoNiovo.getDipartimentoCodice(), "Codice dipartimento non valorizzato");
		checkNotNull(payloadAppuntamentoNiovo.getData(), "Data Appuntamento non valorizzata");
		checkNotNull(payloadAppuntamentoNiovo.getTipologiaCodice(), "Tipologia non valorizzata");
		checkNotBlank(payloadAppuntamentoNiovo.getTipologiaCodice(), "Tipologia non valorizzata");
		checkNotEmpty(payloadAppuntamentoNiovo.getOraFine(), "Ora fine non valorizzata");
		checkNotEmpty(payloadAppuntamentoNiovo.getOraInizio(), "Ora inizio non valorizzata");
		checkNotEmpty(payloadAppuntamentoNiovo.getOraSlot(), "Ora slot non valorizzata");
		checkNotEmpty(payloadAppuntamentoNiovo.getOra(), "Ora  non valorizzata");
		
		
		TipoScreenType tipoScreen = null;
		try {
			tipoScreen = TipoScreenType.fromValue(payloadAppuntamentoNiovo.getTipologiaCodice());
		}catch(IllegalArgumentException e) {
			throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Tipologia").exception();
		}
		checkOrarioValido(payloadAppuntamentoNiovo.getOraFine(), "ora fine");
		checkOrarioValido(payloadAppuntamentoNiovo.getOraInizio(), "ora inizio");
		checkOrarioValido(payloadAppuntamentoNiovo.getOraSlot(), "ora slot");
		checkOrarioValido(payloadAppuntamentoNiovo.getOra(), "ora");
		
		
	}

}
