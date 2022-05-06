/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.apisanscreen.impl.base;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.xml.ws.Holder;

import org.apache.commons.lang3.StringUtils;

import it.csi.apisan.apisanscreen.exception.ErroreBuilder;
import it.csi.apisan.apisanscreen.exception.ErroreRESTException;
import it.csi.apisan.apisanscreen.util.ApisanScreenStatus;
import it.csi.apisan.apisanscreen.util.ConstantsScreen;
import it.csi.apisan.apisanscreen.util.ErrorServer;
import it.csi.apisan.apisanscreen.util.MappingCodiciErrore;
import it.csi.deleghe.deleghebe.ws.model.Richiedente;
import it.csi.gestutility.ErroriType;
import it.csi.screenserviziwebsol.CredenzialiType;

public abstract class ScreenRESTBaseService extends RESTBaseService {

	protected String shibIdentitaCodiceFiscale;
	protected String xRequestID;
	protected String xCodiceServizio;

	public ScreenRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);

		this.shibIdentitaCodiceFiscale = getHeaderParam("Shib-Identita-CodiceFiscale");
		this.xRequestID = getHeaderParam("X-Request-ID");
		this.xCodiceServizio = getHeaderParam("X-Codice-Servizio");
		logRequestContext();
	}

	public ScreenRESTBaseService(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);

		this.shibIdentitaCodiceFiscale = shibIdentitaCodiceFiscale;
		this.xRequestID = xRequestID;
		this.xCodiceServizio = xCodiceServizio;
		logRequestContext();
	}

	@Override
	public Response executeService() {
		if (StringUtils.isBlank(xRequestID)) {
			return ErroreBuilder.from(ApisanScreenStatus.PARAMETRO_NON_VALIDO, "X-Request-ID").exception().getResponse();
		}

		super.executeService();
		if (xRequestID != null && res != null && res.getMetadata() != null) {
			res.getMetadata().add("X-Request-ID", xRequestID);
		}

		return res;
	}

	protected boolean isUtenteAutorizzato(String cf) {
		return shibIdentitaCodiceFiscale != null && shibIdentitaCodiceFiscale.equalsIgnoreCase(cf);
	}

	protected void checkUtenteAutorizzato(String cf) {
		checkCondition(isUtenteAutorizzato(cf),
				ErroreBuilder.from(ApisanScreenStatus.UTENTE_NON_AUTORIZZATO).dettaglio("CODICE_FISCALE", cf).exception());
	}
	
	protected void checkOrarioValido(String orario, String nomeParametro) {
		checkCondition(isDataValido(orario, "HH:mm"), ErroreBuilder.from(ApisanScreenStatus.PARAMETRO_NON_VALIDO, nomeParametro).dettaglio("orario", orario).exception()); 
	}
	
	protected boolean isDataValido(String orario, String formato) {
		DateTimeFormatter dt = DateTimeFormatter.ofPattern(formato);
		try {
			 dt.parse(orario);
			 return true;
		} catch (DateTimeParseException e) {
			return false;
		}
	}
	
	protected void checkDataValida(String data, String formato, String nomeParametro) {
		checkCondition(isDataValido(data, formato), ErroreBuilder.from(ApisanScreenStatus.PARAMETRO_NON_VALIDO, nomeParametro).dettaglio("Data", data).exception());
	}
	
	protected boolean isCodiceFiscaleValido(String cf) {
		return cf != null && (cf.length() == 16);
//		 return cf != null &&
//		 cf.matches("[a-zA-Z]{6}\\d\\d[a-zA-Z]\\d\\d[a-zA-Z]\\d\\d\\d[a-zA-Z]");
	}

	protected void checkCodiceFiscaleValido(String cf) {
		checkCondition(isCodiceFiscaleValido(cf), ErroreBuilder.from(ApisanScreenStatus.CODICE_FISCALE_NON_VALIDO, cf)
				.dettaglio("CODICE_FISCALE", cf).exception());
	}

	protected String getHeaderParam(String headerParam) {
		List<String> values = httpHeaders.getRequestHeader(headerParam);
		if (values == null || values.isEmpty()) {
			return null;
		}
		return values.get(0);
	}

//	protected void checkSuccesso(ServiceResponse sr, boolean isArrayRit) {
//		String METHOD_NAME = "checkSuccesso";
//		if(!RisultatoCodice.SUCCESSO.equals(sr.getEsito()) || (sr.getErrori() != null && (sr.getErrori().size() > 0))) {
//			
//			
//			if(sr.getErrori()!=null) {
//				Optional<Errore> errDAR02 = sr.getErrori().stream().filter(errore -> {
//					return "DA.R02".equals(errore.getCodice());
//				}).findFirst();
//				
//				if(errDAR02.isPresent()) {
//					if(sr.getErrori().size()==1) {
//						//esco permettendo al chiamante di ritornare la lista vuota (in questo caso un 200 con lista vuota).
//						if(isArrayRit) {
//							return;
//						}else {
//							throw ErroreBuilder.from(ApisanAutStatus.RISORSA_NON_TROVATA).exception();
//						}
//						
//					}
//					throw ErroreBuilder.from(ApisanAutStatus.RISORSA_NON_TROVATA).exception();
//				}
//			}
//			
//			log.error(METHOD_NAME, "Risposta dal servizio %s andata in errore.", sr.getClass().getName());
//			throw toErroreRESTException(sr.getErrori());
//		}		
//	}

	protected  CredenzialiType getCredenzialiType(String citId) {
		CredenzialiType credenziali = new CredenzialiType();
		credenziali.setIdOperatore(ConstantsScreen.ID_OPERATORE);
		credenziali.setCodiceFiscaleDelegante(citId);
		credenziali.setCodiceFiscaleDelegato(shibIdentitaCodiceFiscale);
		return credenziali;
	}
	protected void checkSuccesso(Holder<ErroriType> errori, Class<?> methodName) {
		
		ErroriType errore = errori.value; 
		
		if (errore.getCodice() != 0) {
			log.error(methodName.getName(), "Risposta dal servizio %s andata in errore con codice $s. Errore: %s", methodName,
					errore.getCodice(), errore.getDescrizione());
			//prima cosa verifico se è un errore mappato
			//MappingCodiciErrore mappingCodiciErore = MappingCodiciErrore.get
			throw toErroreRESTException(errore);
		}
	}
	
	
	protected boolean checkSuccessoNotifica(Holder<ErroriType> errori, Class<?> methodName) {
		ErroriType errore = errori.value; 
		if (errore.getCodice() != 0) {
			log.error(methodName.getName(), "Risposta dal servizio %s andata in errore con codice $s. Errore: %s", methodName,
					errore.getCodice(), errore.getDescrizione());
			//prima cosa verifico se è un errore mappato
			//MappingCodiciErrore mappingCodiciErore = MappingCodiciErrore.get
			return false;
		}
		return true;
	}
	
	protected void checkSuccessoNotifica(ErroriType erroriNotifica,  Class<?> methodName) {
		if (erroriNotifica != null && erroriNotifica.getCodice() != 0){
			log.error(this.getClass().getSimpleName(), "Errore nel trasmettinotifica", methodName, erroriNotifica.getCodice(), erroriNotifica.getDescrizione());
		}
	}

	protected ErroreRESTException toErroreRESTException(ErroriType errori) {
		String title = "Errore esecuzione servizio " + this.getClass().getSimpleName();
		if(errori != null) {
			ErrorServer error = MappingCodiciErrore.getInstance().getErrorServerFromCodice(errori.getCodice());
			if(error != null) {
				return ErroreBuilder.from(error).title(errori.getDescrizione()).dettaglio("" + errori.getCodice(), errori.getDescrizione()).exception() ;
			}else {
				return  ErroreBuilder.from(502, "").title(title).exception() ;
			}
			
		}else {
			return toRESTErroreException(errori, 502, title);
		}
		
	}
	

	protected ErroreRESTException toRESTErroreException(ErroriType errori, int status, String msgDefault) {
		ErroreBuilder erroreBuilder = ErroreBuilder.from(status, "").title(msgDefault);
		return erroreBuilder.exception();
	}

	protected void logRequestContext() {
		log.info("logRequestContext",
				"shibIdentitaCodiceFiscale: %s - xRequestID: %s - xCodiceServizio: %s - UserPrincipal: %s",
				shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio,
				securityContext != null && securityContext.getUserPrincipal() != null
						? securityContext.getUserPrincipal().getName()
						: "DEFAULT");
	}

	protected Richiedente newRichiedente() {
		return new Richiedente(xRequestID, xCodiceServizio, shibIdentitaCodiceFiscale);
	}

}
