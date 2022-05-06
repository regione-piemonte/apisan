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
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import it.csi.apisan.apisanvac.common.DelegheRESTBaseService;
import it.csi.apisan.apisanvac.common.exception.RESTException;
import it.csi.apisan.apisanvac.model.PayloadModificaIndirizzo;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdDomicilioVaccinazioniPutService extends DelegheRESTBaseService {
	@Autowired
	private VacApiRestInvoker vacApiRestInvoker;

	String cittadinoId;
	PayloadModificaIndirizzo payload;

	public CittadiniCitIdDomicilioVaccinazioniPutService(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId,
			PayloadModificaIndirizzo payloadModificaIndirizzo, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest request, HttpServletResponse response) {
		super(xRequestId, securityContext, httpHeaders, request, response);
		this.cittadinoId = citId;
		this.payload =  payloadModificaIndirizzo;
	}

	@Override
	protected Response execute() {
		/* Validazione */

		checkUtenteAutorizzatoOrDelegato(cittadinoId);
		checkNotNull(cittadinoId,
				new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "_cittadinoId non valorizzato"));
		checkNotNull(payload, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "payload non valorizzato"));

		JsonNode resp = invokeSetDomicilioVac();

		boolean isSuccess = vacApiRestInvoker.isSuccess(resp);

		if (isSuccess) {
			return Response.ok().type(MediaType.APPLICATION_JSON_TYPE).build();
		} else {
			return Response.serverError().entity(resp.toString()).type(MediaType.APPLICATION_JSON_TYPE).build();
		}

	}

	private JsonNode invokeSetDomicilioVac() {
		ObjectMapper om = new ObjectMapper();
		ObjectNode on = om.createObjectNode();
		ObjectNode indirizzoTemporaneo = om.createObjectNode();
		indirizzoTemporaneo.put("CodiceFiscale", cittadinoId);
		indirizzoTemporaneo.put("IndirizzoTemporaneo", payload.getIndirizzoTemporaneo());
		indirizzoTemporaneo.put("Comune", payload.getComune());
		indirizzoTemporaneo.put("CAP", payload.getCap());
		indirizzoTemporaneo.put("InizioIT", payload.getDataInizio());
		indirizzoTemporaneo.put("FineIT", payload.getDataFine());
		indirizzoTemporaneo.put("Telefono", payload.getTelefono());
		indirizzoTemporaneo.put("Mail", payload.getMail());

		on.set("indirizzoTemporaneo", indirizzoTemporaneo);

		return vacApiRestInvoker.invoke("/DatiAssistito/SetIndirizzoTemporaneo", HttpMethod.POST, on, null, null);
		
	}

}
