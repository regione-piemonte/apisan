/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.service;

import static it.csi.apisan.apisanvac.util.JsonNodeUtils.asText;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import it.csi.apisan.apisanvac.common.DelegheRESTBaseService;
import it.csi.apisan.apisanvac.common.ErroreBuilder;
import it.csi.apisan.apisanvac.common.exception.RESTException;
import it.csi.apisan.apisanvac.model.ModelAppuntamentoCreato;
import it.csi.apisan.apisanvac.model.ModelVaccino;
import it.csi.apisan.apisanvac.model.ModelVaccinoNoDose;
import it.csi.apisan.apisanvac.model.PayloadVaccinazioneAppuntamentoPrenotazione;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdVaccinazioniAppuntamentiPostService extends DelegheRESTBaseService {
	@Autowired
	private VacApiRestInvoker vacApiRestInvoker;
	
	private String cittadinoId;
	private PayloadVaccinazioneAppuntamentoPrenotazione payload;
	
	public CittadiniCitIdVaccinazioniAppuntamentiPostService(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId,
			PayloadVaccinazioneAppuntamentoPrenotazione payloadVaccinazioneAppuntamentoPrenotazione,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request,
			HttpServletResponse response) {
		super(xRequestId, securityContext, httpHeaders, request, response);
		this.cittadinoId = citId;
		this.payload = payloadVaccinazioneAppuntamentoPrenotazione;
	}


	@Override
	protected Response execute() {
		checkUtenteAutorizzatoOrDelegato(cittadinoId);
		checkNotNull(cittadinoId,
				new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "cittadinoId non valorizzato"));
		checkNotNull(payload, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "payload non valorizzato"));
		ModelAppuntamentoCreato resp = null;
		resp =		invokeSetRichiestaAppuntamento();
		return Response.ok(resp).type(MediaType.APPLICATION_JSON_TYPE).build();
	}

	
	private ModelAppuntamentoCreato invokeSetRichiestaAppuntamento() {
		ObjectMapper om = new ObjectMapper();
		ObjectNode on = om.createObjectNode();
		ObjectNode prenotazione = om.createObjectNode();
		//prenotazione.put("CodiceFiscale", cittadinoId);
		prenotazione.put("DataConvocazione", payload.getDataConvocazione());
		prenotazione.put("DataAppuntamento", payload.getDataAppuntamento());
		prenotazione.put("CodiceConsultorio", payload.getCentroVaccinale());
		prenotazione.put("CodiceAmbulatorio", payload.getCodiceAmbulatorio());
		prenotazione.put("CodicePaziente", payload.getCodicePaziente());
				
		ArrayNode vaccini = om.createArrayNode();
		for (ModelVaccinoNoDose v : payload.getVaccini() ) {
			ObjectNode vac = om.createObjectNode();
			vac.put("CodiceVaccino", v.getCodice());
			vac.put("DescrizioneVaccino", v.getDescrizione());
			vaccini.add(vac);
		}
		prenotazione.set("Vaccini", vaccini);
		on.set("prenotazione", prenotazione);
		
		JsonNode resp = vacApiRestInvoker.invoke("/AppuntamentoVaccinale/SetPrenotazioneAppuntamento", HttpMethod.POST, on , null, null);
		
		boolean isFailed = vacApiRestInvoker.isFailed(resp);
		if(isFailed) {
			String title = asText(resp.get("Message"));
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title(title).exception();
		}
		
		
		ModelAppuntamentoCreato appuntamento = new ModelAppuntamentoCreato();
		appuntamento.setIdConvocazione(asText(resp.get("IdConvocazione")));
		
		//appuntamento.setDataAppuntamento( asText(resppren.get("DataAppuntamento")));
		
		//JsonNode resp = vacApiRestInvoker.invoke("/AppuntamentoVaccinale/SetPrenotazioneAppuntamento", HttpMethod.POST, on , null, null);
		
		
		
		//return vacApiRestInvoker.invoke("/AppuntamentoVaccinale/SetPrenotazioneAppuntamento", HttpMethod.POST, on, null, null);
		return appuntamento;

	}
	
	private static String toString(ObjectNode jn) throws JsonProcessingException {
		if (jn == null) {
			return null;
		}
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(jn);
	}

}
