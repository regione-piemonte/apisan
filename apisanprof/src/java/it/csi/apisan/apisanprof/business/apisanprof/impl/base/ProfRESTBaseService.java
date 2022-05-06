/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.business.apisanprof.impl.base;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import it.csi.apisan.apisanprof.business.mapper.DettaglioMessageAuraMapper;
import it.csi.apisan.apisanprof.business.mapper.DettaglioMessageOpessanMapper;
import it.csi.apisan.apisanprof.dto.apisanprof.Dettaglio;
import it.csi.apisan.apisanprof.exception.ErroreBuilder;
import it.csi.apisan.apisanprof.exception.RESTException;
import it.csi.apisan.apisanprof.exception.RestErroreException;
import it.csi.apisan.apisanprof.util.ApisanProfStatus;
import it.csi.aura.auraws.services.central.anagrafefind.Message;


public abstract class ProfRESTBaseService extends RESTBaseService {

	protected String shibIdentitaCodiceFiscale;
	protected String xRequestID;
	protected String xCodiceServizio;
	
	
	public ProfRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);

		this.shibIdentitaCodiceFiscale = getHeaderParam("Shib-Identita-CodiceFiscale");
		this.xRequestID = getHeaderParam("X-Request-ID");
		this.xCodiceServizio = getHeaderParam("X-Codice-Servizio");
		logRequestContext();
	}
	
	public ProfRESTBaseService(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);

		this.shibIdentitaCodiceFiscale = shibIdentitaCodiceFiscale;
		this.xRequestID = xRequestID;
		this.xCodiceServizio = xCodiceServizio;
		logRequestContext();
	}
	
	@Override
	public Response executeService() {
		super.executeService();
		if(res != null && res.getMetadata() != null && xRequestID != null) {
			res.getMetadata().add("X-Request-ID", xRequestID);
		}
		
		return res;
	}
	
	protected boolean isUtenteAutorizzato(String cf) {
		return shibIdentitaCodiceFiscale != null && shibIdentitaCodiceFiscale.equalsIgnoreCase(cf);
	}

	protected void checkUtenteAutorizzato(String cf) {
		checkCondition(isUtenteAutorizzato(cf), ApisanProfStatus.UTENTE_NON_AUTORIZZATO.getRestException("Utente non autorizzato a compiere l'operazione"));
	}

	protected boolean isCodiceFiscaleValido(String cf) {
		return cf != null && (cf.length() == 16);
		//return cf != null && cf.matches("[a-zA-Z]{6}\\d\\d[a-zA-Z]\\d\\d[a-zA-Z]\\d\\d\\d[a-zA-Z]");
	}

	protected void checkCodiceFiscaleValido(String cf) {
		checkCondition(isCodiceFiscaleValido(cf), ApisanProfStatus.BAD_REQUEST.getRestException("Codice fiscale non valido"));
	}
	
	
	protected String getHeaderParam(String headerParam) {
		List<String> values = httpHeaders.getRequestHeader(headerParam);
		if (values == null || values.isEmpty()) {
			return null;
		}
		return values.get(0);
	}
	
	protected RESTException toRestAuraAnagrafeFindException(List<Message> errorAura) {
		return toRestAuraAnagrafeFindException(errorAura, 502,  "Errore invocazione servizio ", "Errore esecuzione servizio " + this.getClass().getSimpleName() , "Problema nella chiamata al servizio Aura" );
	}
	
	protected RESTException toRestAuraAnagrafeFindException(List<Message> errorAura, int status, String code, String message, String title) {
		List<Dettaglio> listaErr = new DettaglioMessageAuraMapper().fromList(errorAura);
		
		return new RestErroreException(new ErroreBuilder(status, code).getErrore( title, listaErr), message);
		
	}
	
	protected RESTException toRestOpessanStudiMediciException(List<it.csi.dto.opessanws.opessan.common.response.Message> errorOpessan) {
		return toRestOpessanStudiMediciException(errorOpessan, 502,  "Errore invocazione servizio ", "Errore esecuzione servizio " + this.getClass().getSimpleName() , "Problema nella chiamata al servizio Opessan" );
	}
	
	protected RESTException toRestOpessanStudiMediciException(List<it.csi.dto.opessanws.opessan.common.response.Message> errorOpessan, int status, String code, String message, String title) {
		List<Dettaglio> listaErr = new DettaglioMessageOpessanMapper().fromList(errorOpessan);
		return new RestErroreException( new ErroreBuilder(status, code).getErrore( title, listaErr), message);
	}
	
/*	protected RESTException toRESTException(List<Errore> errori) {
		return toRESTException(errori, 502, "Errore esecuzione servizio "+this.getClass().getSimpleName());
	}

	protected RESTException toRESTException(List<Errore> errori, int status, String msgDefault) {
		StringBuilder sb = new StringBuilder();
		errori.stream().forEach(e -> sb.append(e.getCodice()).append(" - ").append(e.getDescrizione()).append("\n"));
		
		String msg = sb.toString();
		if(StringUtils.isBlank(msg)) {
			msg = msgDefault;
		}
		
		return new RESTException(status, sb.toString());
	} */	
	
	protected void logRequestContext() {
		log.info("logRequestContext", "shibIdentitaCodiceFiscale: %s - xRequestID: %s - xCodiceServizio: %s - UserPrincipal: %s", shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext!= null && securityContext.getUserPrincipal()!= null? securityContext.getUserPrincipal().getName() :"DEFAULT");
	}

}
