/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.apisanpag.impl.base;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;

import it.csi.apisan.apisanpag.exception.ErroreBuilder;
import it.csi.apisan.apisanpag.util.ApisanPagStatus;

public abstract class PagRESTBaseService extends RESTBaseService {
	protected String shibIdentitaCodiceFiscale;
	protected String xRequestID;
	protected String xCodiceServizio;
	protected String xForwardedFor;

	public PagRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);

		this.shibIdentitaCodiceFiscale = getHeaderParam("Shib-Identita-CodiceFiscale");
		this.xRequestID = getHeaderParam("X-Request-ID");
		this.xCodiceServizio = getHeaderParam("X-Codice-Servizio");
		this.xForwardedFor = getHeaderParam("X-Forwarded-For");
		logRequestContext();
	}

	public PagRESTBaseService(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio, String xForwardedFor,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);

		this.shibIdentitaCodiceFiscale = shibIdentitaCodiceFiscale;
		this.xRequestID = xRequestID;
		this.xCodiceServizio = xCodiceServizio;
		this.xForwardedFor = xForwardedFor;
		logRequestContext();
	}

	protected boolean isUtenteAutorizzato(String cf) {
		  return shibIdentitaCodiceFiscale.equalsIgnoreCase(cf);	 
	}

	protected void checkUtenteAutorizzato(String cf) {
		checkCondition(isUtenteAutorizzato(cf), ErroreBuilder.from(ApisanPagStatus.UTENTE_NON_AUTORIZZATO).exception());
	}

	protected boolean isCodiceFiscaleValido(String cf) {
		  return (cf.length() == 16 || cf.length() == 11); 
		//return cf.matches("[a-zA-Z]{6}\\d\\d[a-zA-Z]\\d\\d[a-zA-Z]\\d\\d\\d[a-zA-Z]");
	}

	protected void checkCodiceFiscaleValido(String cf) {
		checkCondition(isCodiceFiscaleValido(cf), ErroreBuilder.from(ApisanPagStatus.CODICE_FISCALE_NON_VALIDO, cf).exception());
	}

	
	
	protected void logRequestContext() {
		log.info("logRequestContext", "shibIdentitaCodiceFiscale: %s - xRequestID: %s - xCodiceServizio: %s - UserPrincipal: %s - xForwardedFor: %s", shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext!= null && securityContext.getUserPrincipal()!= null? securityContext.getUserPrincipal().getName() :"DEFAULT", xForwardedFor);
	}
}
