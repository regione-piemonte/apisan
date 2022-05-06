/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.service;

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
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import it.csi.apisan.apisanvac.common.DelegheRESTBaseService;
import it.csi.apisan.apisanvac.common.exception.RESTException;
import it.csi.apisan.apisanvac.model.PayloadVaccinazioneAppuntamentoAnnullamentoRichiesta;
import it.csi.apisan.apisanvac.model.PayloadVaccinazioneAppuntamentoAnnullamentoRichiestaIstanza;
import it.csi.apisan.apisanvac.xml.appuntamentovaccinale.PropostaVariazione;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdRevocaRichiestaPost extends DelegheRESTBaseService {
	@Autowired
	private VacApiRestInvoker vacApiRestInvoker;
	
	String citId;
	String appuntamentoId;
	PayloadVaccinazioneAppuntamentoAnnullamentoRichiestaIstanza payload;
	
	public CittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdRevocaRichiestaPost( String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio,
			String citId, String appuntamentoId,
			PayloadVaccinazioneAppuntamentoAnnullamentoRichiestaIstanza payloadVaccinazioneAppuntamentoAnnullamentoRichiestaIstanza,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request,
			HttpServletResponse response) {
		super(xRequestId, securityContext, httpHeaders, request, response);
		this.citId = citId;
		this.appuntamentoId = appuntamentoId;
		this.payload = payloadVaccinazioneAppuntamentoAnnullamentoRichiestaIstanza;
	}

	@Override
	protected Response execute() {
		checkUtenteAutorizzatoOrDelegato(citId);
		checkNotNull(citId,
				new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "cittadinoId non valorizzato"));
		checkNotNull(appuntamentoId,
				new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "appuntamentoId non valorizzato"));
		
		checkNotNull(payload, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "payload non valorizzato"));
		
		JsonNode resp = invokeSetRevocaAppuntamento();
		boolean isSuccess = vacApiRestInvoker.isSuccess(resp);
		if (isSuccess) {
			return Response.status(HttpStatus.CREATED.value()).build();
		} else {
			return Response.serverError().entity(resp.toString()).type(MediaType.APPLICATION_JSON_TYPE).build();
		}
	}
	
	
	private JsonNode invokeSetRevocaAppuntamento() {
		ObjectMapper om = new ObjectMapper();
		ObjectNode on = om.createObjectNode();
		ObjectNode propostaVaccinazione = om.createObjectNode();
		
		propostaVaccinazione.put("CodiceFiscaleRichiedente", shibIdentitaCodiceFiscale);
		propostaVaccinazione.put("Telefono", payload.getTelefono());
		propostaVaccinazione.put("Mail", payload.getMail());
		propostaVaccinazione.put("CodiceFiscaleVaccinato", citId);
		propostaVaccinazione.put("Note", payload.getNote());
		propostaVaccinazione.put("IdAppuntamento", payload.getIdAppuntamento());
		propostaVaccinazione.put("CentroVaccinale", payload.getCentroVaccinale());
		propostaVaccinazione.put("MotivoVariazione", payload.getMotivazione());
		
		on.set("PropostaVaccinazione", propostaVaccinazione);
		
		return vacApiRestInvoker.invoke("/AppuntamentoVaccinale/SetPropostaDiRevoca", HttpMethod.POST, on,
				null, null);
	}

}
