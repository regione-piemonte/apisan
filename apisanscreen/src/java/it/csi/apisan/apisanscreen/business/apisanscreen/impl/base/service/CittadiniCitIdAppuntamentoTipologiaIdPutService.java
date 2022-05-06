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

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.ScreenAnagraficaRESTBaseService;
import it.csi.apisan.apisanscreen.business.mapper.PayloadAppuntamentoModificaCreaAppuntamentoWEBInParametersTypeMapper;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelAppuntamentoDettaglio;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelUnitaOperativaLista;
import it.csi.apisan.apisanscreen.dto.apisanscreen.PayloadAppuntamentoModifica;
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
public class CittadiniCitIdAppuntamentoTipologiaIdPutService extends ScreenAnagraficaRESTBaseService {
	
	
	
	String tipologiaId; 
	String codiceInterno;
	String codiceInternoPrefisso; 
	PayloadAppuntamentoModifica payloadAppuntamentoModifica;
	private SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy"); 
	
	
	public CittadiniCitIdAppuntamentoTipologiaIdPutService(String citId, String tipologiaId, String codiceInterno,
			String codiceInternoPrefisso, PayloadAppuntamentoModifica payloadAppuntamentoModifica,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(citId, securityContext, httpHeaders);
	 
		this.tipologiaId = tipologiaId;  
		this.codiceInterno = codiceInterno;
		this.codiceInternoPrefisso = codiceInternoPrefisso; 
		this.payloadAppuntamentoModifica = payloadAppuntamentoModifica;
		
	}

	@Override
	protected Response execute() {
		final String methodName = "execute";
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Utente non autorizzato");
		checkNotBlank(citId, "Cit Id non valorizzato");
		checkNotBlank(tipologiaId, "TipologiaId Id non valorizzato");
		
		checkNotNull(codiceInterno, "Codice Interno non valorizzato");
		checkNotNull(codiceInternoPrefisso, "Codice Interno Prefisso non valorizzato");		
		checkNotNull(payloadAppuntamentoModifica, "Payload non valorizzato");
		
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
		
		TipoScreenType tipoScreen = null;
		try {
			tipoScreen = TipoScreenType.fromValue(tipologiaId);
		}catch(IllegalArgumentException e) {
			throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Tipologia").exception();
		}
		
		checkIdInternoValido(codInterno, codiceInternoPrefisso);
		
		CredenzialiType credenziali = getCredenzialiType(citId);
		
		CreaAppuntamentoWEBInParametersType inParam = new PayloadAppuntamentoModificaCreaAppuntamentoWEBInParametersTypeMapper().to(payloadAppuntamentoModifica);
		
		inParam.setICODIDINTERNO(codInterno);
		inParam.setIPREFIDINTERNO(codiceInternoPrefisso);
		inParam.setITIPOSCREENING(tipoScreen);
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
		
		checkSuccesso(errori, CittadiniCitIdContattiPutService.class);
		//controllo commentato per eseguire i test  
		if (!citId.equalsIgnoreCase(shibIdentitaCodiceFiscale)) {
			try {
				ScrAna01OutParametersType assistito = chiamataScrAna(CittadiniCitIdAppuntamentoTipologiaIdPutService.class);
				
				if (assistito != null) {
					TrasmettiNotificaInParametersType trasmettiNotificaInParameters = new TrasmettiNotificaInParametersType();
					trasmettiNotificaInParameters.setPCognome(assistito.getPCognome());
					trasmettiNotificaInParameters.setPNome(assistito.getPNome());
					trasmettiNotificaInParameters.setPComponente(ConstantsScreen.COMPONENTE_PER_NOTIFICA);
					trasmettiNotificaInParameters.setPTipoNotifica(2);
					trasmettiNotificaInParameters.setPTipoScreening(tipologiaId);
					trasmettiNotificaInParameters.setPDataAppuntamento(sd.format(payloadAppuntamentoModifica.getData()));
					trasmettiNotificaInParameters.setPOraAppuntamento(payloadAppuntamentoModifica.getOra());
					//trasmettiNotificaInParameters.setPUnitaOperativa(payloadAppuntamentoModifica.getUnitaOperativaCodice());
					
					/*ModelUnitaOperativaLista unita = getUnitaOperativa(codInterno, this.codiceInternoPrefisso,
							tipologiaId, CittadiniCitIdAppuntamentoPostService.class,
							payloadAppuntamentoModifica.getUnitaOperativaCodice(), payloadAppuntamentoModifica.getAslCodice().toString());*/
					
					ModelAppuntamentoDettaglio unita = getUnitaOperativa(codInterno, this.codiceInternoPrefisso, tipologiaId, CittadiniCitIdAppuntamentoPostService.class);
					 
					if (unita != null) {
						trasmettiNotificaInParameters.setPUnitaOperativa(unita.getUnitaOperativaDescrizione());
						if (unita.getIndirizzoGeo() != null) {
							//String prepStradario = unita.getIndirizzoGeo().getPrepStradario() != null ? " " + unita.getIndirizzoGeo().getPrepStradario() + " ": " ";  
							//String indirizzo = unita.getIndirizzoGeo().getTipoViaStradario() + " " + prepStradario + unita.getIndirizzoGeo().getVia() ;
							trasmettiNotificaInParameters.setPIndirizzo(unita.getUnitaOperativaIndirizzo());
							trasmettiNotificaInParameters.setPNumeroCivico(unita.getUnitaOperativaCivico());
							trasmettiNotificaInParameters.setPComune(unita.getUnitaOperativaComune());							
						} 
					}
					try {
						ErroriType erroriNotifica = soapClient.trasmettiNotifica(credenziali,
								trasmettiNotificaInParameters);
						checkSuccessoNotifica(erroriNotifica, CittadiniCitIdAppuntamentoTipologiaIdPutService.class);
					} catch (TrasmettiNotificaFaultException e) {
						log.error(methodName, "Errore nel richiamo del servizio di notifica", e);
					} 
				}
			} catch (Exception e) {
				log.error(methodName, "ERRORE NOTIFICA", e);
			}
		}
		return Response.status(204).build();
	}
	
	
	private void checkPayloadValido() {
		//TODO verificare i dati che possono essere null o meno
		checkNotNull(payloadAppuntamentoModifica.getAgendaCodice(), "Codice azienda non valorizzato");
		checkNotNull(payloadAppuntamentoModifica.getAslCodice(), "Codice asl non valorizzato");
		checkNotNull(payloadAppuntamentoModifica.getDipartimentoCodice(), "Codice dipartimento non valorizzato");
		checkNotNull(payloadAppuntamentoModifica.getData(), "Data Appuntamento non valorizzata");
		checkNotNull(payloadAppuntamentoModifica.getProgressivo(), "Numero Progressivo non valorizzato");
		try {
			Integer.parseInt(payloadAppuntamentoModifica.getProgressivo());
		}catch(NumberFormatException e) {
			throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Numero Progressivo").exception();
		}
		
		if(!StringUtils.isEmpty(payloadAppuntamentoModifica.getOraFine())) {
			checkOrarioValido(payloadAppuntamentoModifica.getOraFine(), "ora fine");
		}
		
		if(!StringUtils.isEmpty(payloadAppuntamentoModifica.getOraInizio())) {
			checkOrarioValido(payloadAppuntamentoModifica.getOraInizio(), "ora inizio");
		}
		
		if(!StringUtils.isEmpty(payloadAppuntamentoModifica.getOraSlot())) {
			checkOrarioValido(payloadAppuntamentoModifica.getOraSlot(), "ora slot");
		}
		
		if(!StringUtils.isEmpty(payloadAppuntamentoModifica.getOra())) {
			checkOrarioValido(payloadAppuntamentoModifica.getOra(), "ora");
		}
		
	}
}
