/*******************************************************************************

* Copyright Regione Piemonte - 2023

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancod.business.apisancod.impl.base;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;

import it.csi.apisan.apisancod.exception.ErroreBuilder;
import it.csi.apisan.apisancod.exception.ErroreRESTException;
import it.csi.apisan.apisancod.util.ApisanCodStatus;


public abstract class CodRESTBaseService extends RESTBaseService {

	protected String shibIdentitaCodiceFiscale;
	protected String xRequestID;
	protected String xCodiceServizio;
	protected String xForwardedFor;

	public CodRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);

		this.shibIdentitaCodiceFiscale = getHeaderParam("Shib-Identita-CodiceFiscale");
		this.xRequestID = getHeaderParam("X-Request-ID");
		this.xCodiceServizio = getHeaderParam("X-Codice-Servizio");
		this.xForwardedFor = getHeaderParam("X-Forwarded-For");
		logRequestContext();
	}

	
/*	public ConsRESTBaseService(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);

		this.shibIdentitaCodiceFiscale = shibIdentitaCodiceFiscale;
		this.xRequestID = xRequestID;
		this.xCodiceServizio = xCodiceServizio;
		logRequestContext();
	}*/
	
	@Override
	public Response executeService() {
		if(StringUtils.isBlank(xRequestID)) {
			res = ErroreBuilder.from(ApisanCodStatus.PARAMETRO_NON_VALIDO, "X-Request-ID").exception().getResponse();
			return res;
		}
		
		super.executeService();
		if(xRequestID!=null && res != null && res.getMetadata() != null) {
			res.getMetadata().add("X-Request-ID", xRequestID);
		}
		
		return res;
	}

	protected boolean isUtenteAutorizzato(String cf) {
		return shibIdentitaCodiceFiscale != null && shibIdentitaCodiceFiscale.equalsIgnoreCase(cf);
	}

	protected void checkUtenteAutorizzato(String cf) {
		checkCondition(isUtenteAutorizzato(cf), ErroreBuilder.from(ApisanCodStatus.UTENTE_NON_AUTORIZZATO).dettaglio("CODICE_FISCALE", cf).exception());
	}

	protected boolean isCodiceFiscaleValido(String cf) {
		return cf != null && (cf.length() == 16);
		//return cf != null && cf.matches("[a-zA-Z]{6}\\d\\d[a-zA-Z]\\d\\d[a-zA-Z]\\d\\d\\d[a-zA-Z]");
	}

	protected void checkCodiceFiscaleValido(String cf) {
		checkCondition(isCodiceFiscaleValido(cf), ErroreBuilder.from(ApisanCodStatus.CODICE_FISCALE_NON_VALIDO, cf).dettaglio("CODICE_FISCALE", cf).exception());
	}

	protected String getHeaderParam(String headerParam) {
		List<String> values = httpHeaders.getRequestHeader(headerParam);
		if (values == null || values.isEmpty()) {
			return null;
		}
		return values.get(0);
	}
	
/*	protected void checkSuccesso(ServiceResponse sr, boolean isArrayRit) {
		String METHOD_NAME = "checkSuccesso";
		if(!RisultatoCodice.SUCCESSO.equals(sr.getEsito()) || (sr.getErrori() != null && (sr.getErrori().size() > 0))) {
			
			
			if(sr.getErrori()!=null) {
				Optional<Errore> errDAR02 = sr.getErrori().stream().filter(errore -> {
					return "DA.R02".equals(errore.getCodice());
				}).findFirst();
				
				if(errDAR02.isPresent()) {
					if(sr.getErrori().size()==1) {
						//esco permettendo al chiamante di ritornare la lista vuota (in questo caso un 200 con lista vuota).
						if(isArrayRit) {
							return;
						}else {
							throw ErroreBuilder.from(ApisanAutStatus.RISORSA_NON_TROVATA).exception();
						}
						
					}
					throw ErroreBuilder.from(ApisanAutStatus.RISORSA_NON_TROVATA).exception();
				}
			}
			
			log.error(METHOD_NAME, "Risposta dal servizio %s andata in errore.", sr.getClass().getName());
			throw toErroreRESTException(sr.getErrori());
		}		
	}
	
	protected void checkSuccesso(ServiceResponse sr) {
		checkSuccesso(sr, true);
	}
	
	protected ErroreRESTException toErroreRESTException(List<Errore> errori) {
		return toRESTErroreException(errori, 502, "Errore esecuzione servizio "+this.getClass().getSimpleName());
	}

	protected ErroreRESTException toRESTErroreException(List<Errore> errori, int status, String msgDefault) {
		ErroreBuilder erroreBuilder = ErroreBuilder.from(status, "ERRORE_DELEGHEBE").title(msgDefault);
		
		if(errori!=null) {
			errori.stream().forEach(e -> erroreBuilder.dettaglio(e.getCodice(), e.getDescrizione()));
		}
		
		return erroreBuilder.exception();
	}
	protected Richiedente newRichiedente() {
		return new Richiedente(xRequestID, xCodiceServizio, shibIdentitaCodiceFiscale);
	}
	*/
	protected void logRequestContext() {
		log.info("logRequestContext", "shibIdentitaCodiceFiscale: %s - xRequestID: %s - xCodiceServizio: %s - UserPrincipal: %s - xForwardedFor: %s", shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext!= null && securityContext.getUserPrincipal()!= null? securityContext.getUserPrincipal().getName() :"DEFAULT", xForwardedFor);
	}

	
	
}
