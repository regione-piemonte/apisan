/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.service;

import static it.csi.apisan.apisanvac.util.JsonNodeUtils.asText;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import it.csi.apisan.apisanvac.common.DelegheRESTBaseService;
import it.csi.apisan.apisanvac.common.exception.RESTException;
import it.csi.apisan.apisanvac.model.ModelVaccinoNoDose;
import it.csi.apisan.apisanvac.model.PayloadVaccinazioneAppuntamentoPrenotazioneRichiesta;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdVaccinazioniAppuntamentiRichiestaPostService extends DelegheRESTBaseService {

	@Autowired
	private VacApiRestInvoker vacApiRestInvoker;

	private String cittadinoId;
	private String cfRichiedente;
	private PayloadVaccinazioneAppuntamentoPrenotazioneRichiesta payload;

	public CittadiniCitIdVaccinazioniAppuntamentiRichiestaPostService(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId,
			PayloadVaccinazioneAppuntamentoPrenotazioneRichiesta payloadVaccinazioneAppuntamentoPrenotazioneRichiesta,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request,
			HttpServletResponse response) {
		super(xRequestId, securityContext, httpHeaders, request, response);
		this.cittadinoId = citId;
		this.cfRichiedente = shibIdentitaCodiceFiscale;
		this.payload = payloadVaccinazioneAppuntamentoPrenotazioneRichiesta;
	}

	@Override
	protected Response execute() {
		checkUtenteAutorizzatoOrDelegato(cittadinoId);
		checkNotNull(cittadinoId,
				new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "cittadinoId non valorizzato"));
		checkNotNull(payload, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "payload non valorizzato"));

		JsonNode resp = invokeSetPropostaDiVaccinazione();

		boolean isSuccess = vacApiRestInvoker.isSuccess(resp);

		if (isSuccess) {
			String risposta = asText(resp.get("Message")); 
			return Response.ok(risposta).type(MediaType.APPLICATION_JSON_TYPE).build();
		} else {
			return Response.serverError().entity(resp.toString()).type(MediaType.APPLICATION_JSON_TYPE).build();
		}
	}

	private JsonNode invokeSetPropostaDiVaccinazione() {
		ObjectMapper om = new ObjectMapper();
		ObjectNode on = om.createObjectNode();
		ObjectNode propostaVaccinazione = om.createObjectNode();
		propostaVaccinazione.put("CodiceFiscaleRichiedente", cfRichiedente);
		propostaVaccinazione.put("Cognome", payload.getCognome());
		propostaVaccinazione.put("Nome", payload.getNome());

		propostaVaccinazione.put("Telefono", payload.getTelefono());
		propostaVaccinazione.put("Mail", payload.getMail());
		propostaVaccinazione.put("CodiceFiscaleVaccinato", cittadinoId);
		propostaVaccinazione.put("Note", payload.getNote());
		propostaVaccinazione.put("CentroVaccinale", payload.getCentroVaccinale());
		//ObjectNode vaccini = om.createObjectNode();
		ArrayNode vaccini = om.createArrayNode();
		
		for (ModelVaccinoNoDose vaccino : payload.getVaccini()) {
			ObjectNode vac = om.createObjectNode();
			vac.put("CodiceVaccino", vaccino.getCodice());
			vac.put("DescrizioneVaccino", vaccino.getDescrizione());
			vaccini.add(vac);
		}
		propostaVaccinazione.set("Vaccini", vaccini);
		on.set("PropostaVaccinazione", propostaVaccinazione);

		return vacApiRestInvoker.invoke("/AppuntamentoVaccinale/SetPropostaDiVaccinazione", HttpMethod.POST, on, null, null);

	}

}
