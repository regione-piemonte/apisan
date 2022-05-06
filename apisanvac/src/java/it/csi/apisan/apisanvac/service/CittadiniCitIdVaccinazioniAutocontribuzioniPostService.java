/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.service;

import javax.servlet.http.HttpServletRequest;
import it.csi.apisan.apisanvac.util.JsonNodeUtils;
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
import it.csi.apisan.apisanvac.model.ModelVaccinoDose;
import it.csi.apisan.apisanvac.model.PayloadAutocontribuzione;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdVaccinazioniAutocontribuzioniPostService extends DelegheRESTBaseService {

	@Autowired
	private VacApiRestInvoker vacApiRestInvoker;

	private String cittadinoId;
	private PayloadAutocontribuzione payload;

	public CittadiniCitIdVaccinazioniAutocontribuzioniPostService(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId,
			PayloadAutocontribuzione payloadAutocontribuzione, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest request, HttpServletResponse response) {
		super(xRequestId, securityContext, httpHeaders, request, response);
		this.cittadinoId = citId;
		this.payload = payloadAutocontribuzione;
	}

	@Override
	protected Response execute() {
		checkUtenteAutorizzatoOrDelegato(cittadinoId);
		checkNotNull(cittadinoId,
				new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "cittadinoId non valorizzato"));
		checkNotNull(payload, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "payload non valorizzato"));

		JsonNode resp = invokeCaricaDocumentazioneVaccini();

		//boolean isSuccess = vacApiRestInvoker.isSuccess(resp);
		
		boolean isSuccess = resp!= null && "Salvataggio avvenuto con successo".equalsIgnoreCase(resp.asText());

		if (isSuccess) {
			return Response.ok().type(MediaType.APPLICATION_JSON_TYPE).build();
		} else {
			return Response.serverError().entity(resp.toString()).type(MediaType.APPLICATION_JSON_TYPE).build();
		}
	}

	

	private JsonNode invokeCaricaDocumentazioneVaccini() {
		ObjectMapper om = new ObjectMapper();
		ObjectNode on = om.createObjectNode();
		
		on.put("Descrizione", payload.getDescrizione());
		on.put("Tipologia", payload.getTipologia());

		on.put("NomeDocumento", payload.getNomeDocumento());
		on.put("Documento64", payload.getDocumento64());
		on.put("SoggettoEmittente", payload.getSoggettoEmittente());
		on.put("DataEmissione", payload.getDataEmissioneDocumento());
		
		on.put("CodiceFiscaleRichiedente", shibIdentitaCodiceFiscale);
		on.put("CodiceFiscale", cittadinoId);
		on.put("Convocazione", payload.getIdConvocazione());
		on.put("TelefonoRichiedente", payload.getTelefono());
		on.put("MailRichiedente", payload.getMail());
		on.put("IdAppuntamento", payload.getIdAppuntamento());
		on.put("CodiceMotivoEsclusione", payload.getMotivazione());
		ObjectNode vaccini = om.createObjectNode();
		for (ModelVaccinoDose vaccino : payload.getVaccinazioni()) {
			vaccini.put("codice", vaccino.getCodice());
			vaccini.put("dose", vaccino.getDose());
		}
		on.set("Vaccinazioni", vaccini);
		

		return vacApiRestInvoker.invoke("/Documento/CaricaDocumentazioneVaccini", HttpMethod.POST, on, null, null);

	}

}
