/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
import it.csi.apisan.apisanvac.model.PayloadVaccinazioneAppuntamentoSpostamentoRichiesta;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdSpostamentoRichiestaPostService
		extends DelegheRESTBaseService {

	@Autowired
	private VacApiRestInvoker vacApiRestInvoker;

	private String cittadinoId;
	private String appuntamentoId;
	
	private PayloadVaccinazioneAppuntamentoSpostamentoRichiesta payload;

	public CittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdSpostamentoRichiestaPostService(
			String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio,
			String citId, String appuntamentoId,
			PayloadVaccinazioneAppuntamentoSpostamentoRichiesta payloadVaccinazioneAppuntamentoSpostamentoRichiesta,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request,
			HttpServletResponse response) {
		super(xRequestId, securityContext, httpHeaders, request, response);
		this.cittadinoId = citId;
		this.appuntamentoId = appuntamentoId;
		this.payload = payloadVaccinazioneAppuntamentoSpostamentoRichiesta;
		
	}

	@Override
	protected Response execute() {
		/* Validazione */

		checkUtenteAutorizzatoOrDelegato(cittadinoId);
		checkNotNull(cittadinoId,
				new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "cittadinoId non valorizzato"));
		checkNotNull(appuntamentoId,
				new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "appuntamentoId non valorizzato"));
		checkNotNull(payload, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "payload non valorizzato"));

		JsonNode resp = invokeSetPropostaVariazione();

		boolean isSuccess = vacApiRestInvoker.isSuccess(resp);

		if (isSuccess) {
			return Response.ok(resp).type(MediaType.APPLICATION_JSON_TYPE).build();
		} else {
			return Response.serverError().entity(resp.toString()).type(MediaType.APPLICATION_JSON_TYPE).build();
		}

	}

	private JsonNode invokeSetPropostaVariazione() {
		
		ObjectMapper om = new ObjectMapper();
		ObjectNode on = om.createObjectNode();
		ObjectNode propostaVariazione = om.createObjectNode();
		propostaVariazione.put("IdAppuntamento", appuntamentoId);
		propostaVariazione.put("Cognome", payload.getCognome());
		propostaVariazione.put("Nome", payload.getNome());
		propostaVariazione.put("CodiceFiscaleRichiedente", shibIdentitaCodiceFiscale); 
		propostaVariazione.put("CodiceFiscaleVaccinato", cittadinoId); 
		propostaVariazione.put("Telefono", payload.getTelefono());
		propostaVariazione.put("Mail", payload.getMail());
		propostaVariazione.put("Note", payload.getNote());
		propostaVariazione.put("MotivoVariazione", payload.getMotivazione());
		propostaVariazione.put("CentroVaccinale", payload.getCentroVaccinale());
		
		
		ArrayNode vaccini = om.createArrayNode();
		for (ModelVaccinoNoDose v : payload.getVaccini() ) {
			ObjectNode vac = om.createObjectNode();
			vac.put("CodiceVaccino", v.getCodice());
			vac.put("DescrizioneVaccino", v.getDescrizione());
			vaccini.add(vac);
		}
		propostaVariazione.set("Vaccini", vaccini);
		
		on.set("PropostaVaccinazione", propostaVariazione);
		
		// AppuntamentoVaccinale/SetIstanzaSpostamentoAppuntamento
		JsonNode resp = vacApiRestInvoker.invoke("/AppuntamentoVaccinale/SetPropostaDiSpostamento", HttpMethod.POST, on, null, null);
		//JsonNode resp = vacApiRestInvoker.invoke("/AppuntamentoVaccinale/SetIstanzaSpostamentoAppuntamento", HttpMethod.POST, on, null, null);
		
		return resp;
	}

}
