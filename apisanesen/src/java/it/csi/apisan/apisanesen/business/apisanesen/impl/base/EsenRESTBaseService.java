/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.business.apisanesen.impl.base;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;

import org.springframework.web.client.HttpStatusCodeException;

import it.csi.apisan.apisanesen.dto.apisanesen.Errore;
import it.csi.apisan.apisanesen.exception.ErroreBuilder;
import it.csi.apisan.apisanesen.exception.ErroreRESTException;
import it.csi.apisan.apisanesen.util.ApisanEsenStatus;

public abstract class EsenRESTBaseService extends RESTBaseService {
	protected String shibIdentitaCodiceFiscale;
	protected String xRequestID;
	protected String xCodiceServizio;
	
	
	public EsenRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);

		this.shibIdentitaCodiceFiscale = getHeaderParam("Shib-Identita-CodiceFiscale");
		this.xRequestID = getHeaderParam("X-Request-ID");
		this.xCodiceServizio = getHeaderParam("X-Codice-Servizio");
		logRequestContext();
	}

	public EsenRESTBaseService(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);

		this.shibIdentitaCodiceFiscale = shibIdentitaCodiceFiscale;
		this.xRequestID = xRequestID;
		this.xCodiceServizio = xCodiceServizio;
		logRequestContext();
	}	
	
	@Override
	protected void handleException(Exception e) {
		final String METHOD_NAME = "handleException";
		if (e instanceof HttpStatusCodeException) {
			log.debug(METHOD_NAME, "Eccezione server o client del backend di esenred ", e);
			Errore errore = ErroreBuilder.from(((HttpStatusCodeException) e));
			res = new ErroreRESTException(errore).getResponse();
			return;
		} 
		super.handleException(e);
	}
	
	
	
	protected boolean isUtenteAutorizzato(String cf) {
		return shibIdentitaCodiceFiscale != null && shibIdentitaCodiceFiscale.equalsIgnoreCase(cf);
	}

	protected void checkUtenteAutorizzato(String cf) {
		checkCondition(isUtenteAutorizzato(cf), ErroreBuilder.from(ApisanEsenStatus.UTENTE_NON_AUTORIZZATO).dettaglio("CODICE_FISCALE", cf).exception());
	}

	protected boolean isCodiceFiscaleValido(String cf) {
		return cf != null && (cf.length() == 16);
		//return cf != null && cf.matches("[a-zA-Z]{6}\\d\\d[a-zA-Z]\\d\\d[a-zA-Z]\\d\\d\\d[a-zA-Z]");
	}

	protected void checkCodiceFiscaleValido(String cf) {
		checkCondition(isCodiceFiscaleValido(cf), ErroreBuilder.from(ApisanEsenStatus.CODICE_FISCALE_NON_VALIDO, cf).dettaglio("CODICE_FISCALE", cf).exception());
	}
	
	protected String getHeaderParam(String headerParam) {
		List<String> values = httpHeaders.getRequestHeader(headerParam);
		if (values == null || values.isEmpty()) {
			return null;
		}
		return values.get(0);
	}
	
	protected void logRequestContext() {
		log.info("logRequestContext", "shibIdentitaCodiceFiscale: %s - xRequestID: %s - xCodiceServizio: %s - UserPrincipal: %s", shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext!= null && securityContext.getUserPrincipal()!= null? securityContext.getUserPrincipal().getName() :"DEFAULT");
	}	
}
