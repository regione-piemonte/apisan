/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.service;

import java.time.ZoneOffset;

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
import it.csi.apisan.apisanvac.model.PayloadReazioneAvversa;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdReazioneAvversaPostService extends DelegheRESTBaseService {

	@Autowired
	private VacApiRestInvoker vacApiRestInvoker;

	private String cittadinoId;
	private PayloadReazioneAvversa payload;
	private String cfRichiedente;

	public CittadiniCitIdReazioneAvversaPostService(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, PayloadReazioneAvversa payload,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request,
			HttpServletResponse response) {
		super(xRequestId, securityContext, httpHeaders, request, response);
		this.cittadinoId = citId;
		this.payload = payload;
		this.cfRichiedente = shibIdentitaCodiceFiscale;
	}

	@Override
	protected Response execute() {
		/* Validazione */

		checkUtenteAutorizzatoOrDelegato(cittadinoId);
		checkNotNull(cittadinoId,
				new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "cittadinoId non valorizzato"));
		checkNotNull(payload, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "payload non valorizzato"));

		JsonNode resp = invokeSetSegnalazioneReazioniAvverse();

		boolean isSuccess = vacApiRestInvoker.isSuccess(resp);

		if (isSuccess) {
			return Response.ok(resp).type(MediaType.APPLICATION_JSON_TYPE).build();
		} else {
			return Response.serverError().entity(resp.toString()).type(MediaType.APPLICATION_JSON_TYPE).build();
		}
	}

	private JsonNode invokeSetSegnalazioneReazioniAvverse() {
		ObjectMapper om = new ObjectMapper();
		ObjectNode on = om.createObjectNode();
		ObjectNode segnalazione = om.createObjectNode();
		/*String dataSegnalazione = payload.getDataReazione().toString();
		String dataSegnalazioneInst = payload.getDataReazione().toInstant().toString();
		String dataSegnalazioneInstantOffset = payload.getDataReazione().toInstant().atOffset(ZoneOffset.UTC).toString();
		
		
		System.out.println("dataSegnalazione: " + dataSegnalazione);
		System.out.println("DataSegnalazione instantOffset: " + dataSegnalazioneInstantOffset);
		System.out.println("DataSegnalazione inst: " + dataSegnalazioneInst);
		*/
		segnalazione.put("CodiceFiscaleRichiedente", cfRichiedente);
		segnalazione.put("CognomeSegnalatore", ""); // FIXME Manca nell' oggetto
		segnalazione.put("NomeSegnalatore", ""); // FIXME Manca nell' oggetto
		segnalazione.put("CodiceFiscaleSegnalatore", cittadinoId);
		segnalazione.put("TelefonoSegnalatore", payload.getTelefono());
		segnalazione.put("EmailSegnalatore", payload.getMail());
		segnalazione.put("CFAssistito", cittadinoId);
		segnalazione.put("FarmacoConcomitante", payload.getFarmaco());
		segnalazione.put("NoteSegnalazione", payload.getNote());
		//segnalazione.put("DataReazione", payload.getDataReazione().toString());
		segnalazione.put("DataReazione", payload.getDataReazione());
		segnalazione.put("Tipologia", payload.getTipologia());
		segnalazione.put("ProgressivoAssociazione", payload.getIdVaccinazione());

		on.set("Segnalazione", segnalazione);

		return vacApiRestInvoker.invoke("/VaccinazioniEseguite/SetSegnalazioneReazioniAvverse", HttpMethod.POST, on,
				null, null);

	}

}
