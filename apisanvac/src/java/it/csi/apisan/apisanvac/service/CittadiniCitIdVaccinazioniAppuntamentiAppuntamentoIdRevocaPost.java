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
import it.csi.apisan.apisanvac.model.PayloadVaccinazioneAppuntamentoAnnullamento;
import it.csi.apisan.apisanvac.model.PayloadVaccinazioneAppuntamentoAnnullamentoRichiesta;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdRevocaPost extends DelegheRESTBaseService {
	@Autowired
	private VacApiRestInvoker vacApiRestInvoker;

	private String cittadinoId;
	private String appuntamentoId;
	private PayloadVaccinazioneAppuntamentoAnnullamento payload;

	public CittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdRevocaPost(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String appuntamentoId,
			PayloadVaccinazioneAppuntamentoAnnullamento payloadVaccinazioneAppuntamentoAnnullamentoRichiesta,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request,
			HttpServletResponse response) {
		super(xRequestId, securityContext, httpHeaders, request, response);
		this.cittadinoId = citId;
		this.appuntamentoId = appuntamentoId;
		this.payload = payloadVaccinazioneAppuntamentoAnnullamentoRichiesta;
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
		on.put("IdAppuntamento", appuntamentoId);
		on.put("Note", payload.getNote());
		on.put("CodiceMotivoRevoca", payload.getMotivazione());
		on.put("MantieniConvocazioni", payload.isMantieniConvocazioni());

		return vacApiRestInvoker.invoke("/AppuntamentoVaccinale/SetRevocaAppuntamento", HttpMethod.POST, on,
				null, null);
	}

}
