/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service;

import java.util.List;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;

import it.csi.apisan.apisanassistenza.dto.apisanassistenza.IdentitaDigitale;
import it.csi.apisan.apisanassistenza.exception.ErroreBuilder;
import it.csi.apisan.apisanassistenza.util.ApisanAssistenzaErrorStatusCode;
import it.csi.apisan.apisanassistenza.util.ConstantApisanAssistenza;

public abstract class AssistenzaRESTBaseService extends RESTBaseService {

	protected String shibIdentitaCodiceFiscale;
	protected String shibIdentitaEmail;
	protected String xRequestID;
	protected String xCodiceServizio;
	protected String xForwardedFor;
	protected IdentitaDigitale identitaDigitale;

	public AssistenzaRESTBaseService() {
		super();
	}

	public AssistenzaRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);

		this.shibIdentitaCodiceFiscale = getHeaderParam("Shib-Identita-CodiceFiscale");
		this.shibIdentitaEmail = getHeaderParam("Shib-Email");
		this.xRequestID = getHeaderParam("X-Request-Id");
		this.xForwardedFor = getHeaderParam("X-Forwarded-For");
		this.xCodiceServizio = getHeaderParam("X-Codice-Servizio");

		buildIdentitaDigitale();

		logRequestContext();
	}

	private void buildIdentitaDigitale() {
		this.identitaDigitale = new IdentitaDigitale();
		if (this.shibIdentitaCodiceFiscale != null && !stringHasNotValue(this.shibIdentitaCodiceFiscale))
			this.identitaDigitale.setCodiceFiscale(this.shibIdentitaCodiceFiscale);
		if (this.shibIdentitaEmail != null && !stringHasNotValue(this.shibIdentitaEmail))
			this.identitaDigitale.setEmail(this.shibIdentitaEmail);
				
		
	}

	/*
	 * public ConsRESTBaseService(String shibIdentitaCodiceFiscale, String
	 * xRequestID, String xCodiceServizio, SecurityContext securityContext,
	 * HttpHeaders httpHeaders) { super(securityContext, httpHeaders);
	 * 
	 * this.shibIdentitaCodiceFiscale = shibIdentitaCodiceFiscale; this.xRequestID =
	 * xRequestID; this.xCodiceServizio = xCodiceServizio; logRequestContext(); }
	 */

	@Override
	public Response executeService() {
		super.executeService();
		addHeaderRequestId();
		return res;
	}

	protected void validateCommonRequiredData() {
		checkForRequired(xRequestID, "Il dato Request-Id deve essere presente e valorizzato correttamente");
		checkForRequired(xForwardedFor, "Il dato Forwarded-For deve essere presente e valorizzato correttamente");
		checkForRequired(xCodiceServizio, "Il dato Codice Servizio deve essere presente e valorizzato correttamente");
		checkCodiceServizioValido(xCodiceServizio);
	}

	protected void validateRequiredAndValidCodiceFiscaleIdentitaDigitale() {
		checkForRequired(shibIdentitaCodiceFiscale, "Il dato Codice Fiscale dell'identità digitale deve essere presente e valorizzato correttamente");
		checkCodiceFiscaleValido(shibIdentitaCodiceFiscale);
		// checkCodiceFiscaleUgualeAdAltroCodiceFiscaleStessoUtente(shibIdentitaCodiceFiscale, codiceFiscaleDaConfrontare);
	}
	
	protected void validateRequiredAndValidCodiceFiscaleFromParam(String codiceFiscaleFromUri) {
		checkForRequired(codiceFiscaleFromUri, "Il parametro Codice Fiscale deve essere presente e valorizzato correttamente");
		checkCodiceFiscaleValido(codiceFiscaleFromUri);
		// checkCodiceFiscaleUgualeAdAltroCodiceFiscaleStessoUtente(shibIdentitaCodiceFiscale, codiceFiscaleDaConfrontare);
	}	

	protected void validateRequiredEmailIdentitaDigitale(String codiceFiscaleDaConfrontare) {
		checkForRequired(shibIdentitaEmail,
				"Il dato Email dell'identità digitale deve essere presente e valorizzato correttamente");
		// checkEmailValid(shibIdentitaEmail, "Il dato Email dell'identità digitale deve
		// valorizzato correttamente");
	}

	protected void validateOptionalCodiceFiscaleIdentitaDigitale() {
		if (stringHasNotValue(shibIdentitaCodiceFiscale))
			return;
		checkCodiceFiscaleValido(shibIdentitaCodiceFiscale);
	}

	protected void validateOptionalEmailIdentitaDigitale() {
		if (stringHasNotValue(shibIdentitaEmail))
			return;
		checkEmailValid(shibIdentitaEmail);
	}

	private void addHeaderRequestId() {
		if (xRequestID != null && res != null && res.getMetadata() != null) {
			res.getMetadata().add("X-Request-ID", xRequestID);
		}
	}

	protected boolean isUtenteAutorizzato(String cf) {
		return shibIdentitaCodiceFiscale != null && shibIdentitaCodiceFiscale.equalsIgnoreCase(cf);
	}

	protected void checkUtenteAutorizzato(String cf) {
		checkCondition(isUtenteAutorizzato(cf),
				ErroreBuilder.from(ApisanAssistenzaErrorStatusCode.UTENTE_NON_AUTORIZZATO)
						.dettaglio("CODICE_FISCALE", cf).exception());
	}

	protected boolean isCodiceFiscaleValido(String cf) {
		return cf != null && (cf.length() == 16);
	}

	protected boolean isValidEmailAddress(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";
		Pattern pattern = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pattern.matcher(email).matches();
	}

	protected void checkCodiceFiscaleValido(String cf) {
		Boolean checkCodiceFiscale = isCodiceFiscaleValido(cf);
		log.info("checkCodiceFiscaleValido", cf + " " + checkCodiceFiscale.toString());
		checkCondition(checkCodiceFiscale,
				ErroreBuilder.from(ApisanAssistenzaErrorStatusCode.CODICE_FISCALE_NON_VALIDO, cf)
						.dettaglio("CODICE_FISCALE", cf).exception());
	}

	protected void checkEmailValid(String email) {
		Boolean check = isValidEmailAddress(email);
		log.info("checkEmailValid", email + " " + check.toString());
		checkCondition(check, ErroreBuilder.from(ApisanAssistenzaErrorStatusCode.EMAIL_NON_VALIDA, email)
				.dettaglio("INDIRIZZO_EMAIL", email).exception());
	}

	protected void checkCodiceFiscaleUgualeAdAltroCodiceFiscaleStessoUtente(String cf, String cfConfronto) {
		log.info("checkCodiceFiscaleUgualeAdAltroCodiceFiscaleStessoUtente", cf + " " + cfConfronto);
		checkCondition(cf.equalsIgnoreCase(cfConfronto),
				ErroreBuilder.from(ApisanAssistenzaErrorStatusCode.CODICE_FISCALE_NON_CORRISPONDENTE, cf)
						.dettaglio("CODICE FISCALE IDENTITA' DIGITALE", cf)
						.dettaglio("CODICE FISCALE PARAMETRO", cfConfronto).exception());
	}

	protected void checkCodiceIdentificativoRichiestaValido(String richiestaId) {
		Boolean checkIdentificativoRichiesta = isNumeric(richiestaId);
		log.info("checkCodiceIdentificativoRichiestaValido",
				richiestaId + " " + checkIdentificativoRichiesta.toString());
		checkCondition(checkIdentificativoRichiesta,
				ErroreBuilder.from(ApisanAssistenzaErrorStatusCode.IDENTIFICATIVO_RICHIESTA_NON_VALIDO, richiestaId)
						.dettaglio("IDENTIFICATIVO_RICHIESTA", richiestaId).exception());
	}

	protected void checkCodiceIdentificativoDocumentoValido(String documentoId) {
		Boolean checkIdentificativoDocumento = isNumeric(documentoId);
		log.info("checkCodiceIdentificativoDocumentoValido",
				documentoId + " " + checkIdentificativoDocumento.toString());
		checkCondition(checkIdentificativoDocumento,
				ErroreBuilder.from(ApisanAssistenzaErrorStatusCode.IDENTIFICATIVO_RICHIESTA_NON_VALIDO, documentoId)
						.dettaglio("IDENTIFICATIVO_DOCUMENTO", documentoId).exception());
	}

	protected boolean isCodiceServizioValido(String codiceServizio) {
		return (codiceServizio != null)
				&& (codiceServizio.toUpperCase().equals(ConstantApisanAssistenza.CODICE_SERVIZIO.toUpperCase()));
	}

	protected void checkCodiceServizioValido(String codiceServizio) {
		Boolean check = isCodiceServizioValido(codiceServizio);
		log.info("checkCodiceServizioValido", codiceServizio + " " + check.toString(), this.getClass().getSimpleName());
		checkCondition(isCodiceServizioValido(codiceServizio),
				ErroreBuilder.from(ApisanAssistenzaErrorStatusCode.CODICE_SERVIZIO_NON_VALIDO, codiceServizio)
						.dettaglio("CODICE_SERVIZIO", codiceServizio).exception());
	}

	protected String getHeaderParam(String headerParam) {
		List<String> values = httpHeaders.getRequestHeader(headerParam);
		if (values == null || values.isEmpty()) {
			return null;
		}
		return values.get(0);
	}

	/*
	 * protected void checkSuccesso(ServiceResponse sr, boolean isArrayRit) { String
	 * METHOD_NAME = "checkSuccesso";
	 * if(!RisultatoCodice.SUCCESSO.equals(sr.getEsito()) || (sr.getErrori() != null
	 * && (sr.getErrori().size() > 0))) {
	 * 
	 * 
	 * if(sr.getErrori()!=null) { Optional<Errore> errDAR02 =
	 * sr.getErrori().stream().filter(errore -> { return
	 * "DA.R02".equals(errore.getCodice()); }).findFirst();
	 * 
	 * if(errDAR02.isPresent()) { if(sr.getErrori().size()==1) { //esco permettendo
	 * al chiamante di ritornare la lista vuota (in questo caso un 200 con lista
	 * vuota). if(isArrayRit) { return; }else { throw
	 * ErroreBuilder.from(ApisanAutStatus.RISORSA_NON_TROVATA).exception(); }
	 * 
	 * } throw ErroreBuilder.from(ApisanAutStatus.RISORSA_NON_TROVATA).exception();
	 * } }
	 * 
	 * log.error(METHOD_NAME, "Risposta dal servizio %s andata in errore.",
	 * sr.getClass().getName()); throw toErroreRESTException(sr.getErrori()); } }
	 * 
	 * protected void checkSuccesso(ServiceResponse sr) { checkSuccesso(sr, true); }
	 * 
	 * protected ErroreRESTException toErroreRESTException(List<Errore> errori) {
	 * return toRESTErroreException(errori, 502,
	 * "Errore esecuzione servizio "+this.getClass().getSimpleName()); }
	 * 
	 * protected ErroreRESTException toRESTErroreException(List<Errore> errori, int
	 * status, String msgDefault) { ErroreBuilder erroreBuilder =
	 * ErroreBuilder.from(status, "ERRORE_DELEGHEBE").title(msgDefault);
	 * 
	 * if(errori!=null) { errori.stream().forEach(e ->
	 * erroreBuilder.dettaglio(e.getCodice(), e.getDescrizione())); }
	 * 
	 * return erroreBuilder.exception(); } protected Richiedente newRichiedente() {
	 * return new Richiedente(xRequestID, xCodiceServizio,
	 * shibIdentitaCodiceFiscale); }
	 */
	protected void logRequestContext() {
		log.info("logRequestContext",
				"shibIdentitaCodiceFiscale: %s - shibIdentitaEmail: %s - xRequestID: %s - xCodiceServizio: %s - UserPrincipal: %s - xForwardedFor: %s",
				shibIdentitaCodiceFiscale, shibIdentitaEmail, xRequestID, xCodiceServizio,
				securityContext != null && securityContext.getUserPrincipal() != null
						? securityContext.getUserPrincipal().getName()
						: "DEFAULT",
				xForwardedFor);
	}

}
