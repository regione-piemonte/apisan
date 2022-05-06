/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import it.csi.apisan.apisanassistenza.exception.ErroreBuilder;
import it.csi.apisan.apisanassistenza.util.ApisanAssistenzaErrorStatusCode;
import it.csi.apisan.apisanassistenza.util.StatoDellaDelega;
import it.csi.deleghe.deleghebe.ws.DelegheCittadiniService;
import it.csi.deleghe.deleghebe.ws.model.Cittadino;
import it.csi.deleghe.deleghebe.ws.model.Richiedente;
import it.csi.deleghe.deleghebe.ws.model.RisultatoCodice;
import it.csi.deleghe.deleghebe.ws.msg.GetDeleganti;
import it.csi.deleghe.deleghebe.ws.msg.GetDelegantiResponse;

public abstract class AssistenzaDelegheRESTBaseService extends AssistenzaRESTBaseService {

	@Autowired
	protected DelegheCittadiniService delegheCittadiniService;

	@Value("${serviceAssistenzaName}")
	private String serviceAssistenzaName;

	public AssistenzaDelegheRESTBaseService() {
		super();
	}

	public AssistenzaDelegheRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
	}

	protected void checkUtenteAutorizzatoOrDelegato(String cf) {
		checkUtenteAutorizzatoOrDelegato(cf, serviceAssistenzaName);
	}

	// aggiunta nella condizione che l'utente sia delegato
	protected void checkUtenteAutorizzatoOrDelegato(String cf, String codiceServizio) {
		log.info("checkUtenteAutorizzatoOrDelegato", "cf spid %s - cf param %s", shibIdentitaCodiceFiscale, cf);
		checkNotNull(shibIdentitaCodiceFiscale,
				ErroreBuilder.from(ApisanAssistenzaErrorStatusCode.UTENTE_NON_AUTORIZZATO).exception());
		if (!isUtenteAutorizzato(cf)) {
			checkCondition(isUtenteDelegato(cf, codiceServizio),
					ErroreBuilder.from(ApisanAssistenzaErrorStatusCode.UTENTE_NON_AUTORIZZATO).exception());
		}
	}

	protected boolean isUtenteDelegato(String cf, String codiceServizio) {
		log.info("isUtenteDelegato", "BEGIN");
		final String METHOD_NAME = "isUtenteDelegato";
		GetDeleganti getDeleganti = new GetDeleganti();
		Richiedente richiedente = new Richiedente(
				xRequestID, xCodiceServizio, shibIdentitaCodiceFiscale);
		getDeleganti.setRichiedente(richiedente);

		Cittadino cittDelegante = new Cittadino();
		cittDelegante.setCodiceFiscale(cf);
		getDeleganti.setCittadinoDelegante(cittDelegante);
		getDeleganti.setCodiciServizio(Arrays.asList(codiceServizio));
		getDeleganti.setStatiDelega(Arrays.asList(StatoDellaDelega.ATTIVA.toString(), StatoDellaDelega.INSCADENZA.toString()));

		Cittadino cittDelegato = new Cittadino();
		cittDelegato.setCodiceFiscale(shibIdentitaCodiceFiscale);
		getDeleganti.setCittadinoDelegato(cittDelegato);

		// per verificare se il cf in path abbia delegato l'utente nell'header
		// (shibidentitacf) preferisco fare una chiamata sui deleganti (ovvero chi ha
		// effettuato l'autenticazione
		// richiama il servizio per vedere se il cf del path sia un suo delegante in
		// questo modo per l'audit la catena ha preciso chi effettua la chiamata
		GetDelegantiResponse delegantiResponse = delegheCittadiniService.getDelegantiService(getDeleganti);

		if (!RisultatoCodice.SUCCESSO.equals(delegantiResponse.getEsito())) {
			List<it.csi.deleghe.deleghebe.ws.model.Errore> errori = delegantiResponse.getErrori();
			if (errori != null) {
				log.error(METHOD_NAME, "Errore getDelegatiService service:");
				errori.forEach(e -> {
					log.error(METHOD_NAME, "   Codice: %s, Descrizione: %s", e.getCodice(), e.getDescrizione());
				});
			}

			return false;
		}
		log.info("isUtenteDelegato", "END");
		return isPresenteDeleganteAttivo(delegantiResponse, codiceServizio);
	}

	private boolean isPresenteDeleganteAttivo(GetDelegantiResponse gdResp, String servizioName) {
		log.info("isPresenteDeleganteAttivo", "BEGIN");
		boolean presentiDeleghe = (gdResp.getDeleganti() != null && !gdResp.getDeleganti().isEmpty());
		log.info("isPresenteDeleganteAttivo", "presentiDeleghe, %s", presentiDeleghe);
		boolean attivoDeleghe = (presentiDeleghe && gdResp.getDeleganti().stream()
				.anyMatch(c -> c.getDeleghe().stream()
						.filter(delegaServizio -> servizioName.equals(delegaServizio.getCodiceServizio())
								&& (StatoDellaDelega.ATTIVA.toString().equals(delegaServizio.getStatoDelega())
										|| StatoDellaDelega.INSCADENZA.toString().equals(delegaServizio.getStatoDelega())))
						.anyMatch(delega -> delega.getDataInizioDelega().compareTo(new Date()) <= 0
								&& delega.getDataFineDelega().compareTo(new Date()) >= 0)));
		log.info("isPresenteDeleganteAttivo", "attivoDeleghe, %s", attivoDeleghe);
		return attivoDeleghe;
	}
	
}
