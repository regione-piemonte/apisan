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
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;

import it.csi.apisan.apisanvac.common.DelegheRESTBaseService;
import it.csi.apisan.apisanvac.model.ModelIstanzaModificaPrenotazione;
import it.csi.apisan.apisanvac.model.ModelVaccinoNoDose;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdVaccinazioniIstanzeModificaPrenotazioneTipologiaIstanzaGetService
		extends DelegheRESTBaseService {

	@Autowired
	private VacApiRestInvoker vacApiRestInvoker;
	
	private String citId;
	private String tipologia;
	
	public CittadiniCitIdVaccinazioniIstanzeModificaPrenotazioneTipologiaIstanzaGetService(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio,
			String citId, String tipologiaIstanza, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest request, HttpServletResponse response) {
		super(xRequestId, securityContext, httpHeaders, request, response);
		this.citId = citId;
		this.tipologia = tipologiaIstanza;
	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestId, "xRequestID non valorizzato");
		checkNotBlank(xCodiceServizio, "codice servizio non valorizzato");
		checkNotBlank(citId, "citId non valorizzato");
		checkNotBlank(tipologia, "tipologia non valorizzata");
		
		
		List<ModelIstanzaModificaPrenotazione> resp = invokeListaPropostaVaccinazione();

		return Response.ok(resp).type(MediaType.APPLICATION_JSON_TYPE).build();
	}
	
	
	private List<ModelIstanzaModificaPrenotazione> invokeListaPropostaVaccinazione(){
		JsonNode resp = null;
		try {
			StringBuilder url = new StringBuilder();
			url.append("/AppuntamentoVaccinale/GetListaProposteVaccinazione?CodiceFiscaleRichiedente=");
			url.append(citId);
			url.append("&tipologia=");
			url.append(tipologia);

			resp = vacApiRestInvoker
					.invoke( url.toString(), 
							 HttpMethod.GET, (JsonNode) null, null, null);
		} catch (org.springframework.web.client.HttpClientErrorException hcee) {

			String responseBodyAsString = hcee.getResponseBodyAsString();
			if (HttpStatus.BAD_REQUEST.equals(hcee.getStatusCode())
					&& responseBodyAsString.contains("Non ci sono istanze del tipo specificato")) {
				resp = null;
			} else {
				throw hcee;
			}
		}
		List<ModelIstanzaModificaPrenotazione> result = new ArrayList<>();
		if(resp == null) {
			return result;
		}

		Iterator<JsonNode> elements = resp.elements();

		while (elements.hasNext()) {
			JsonNode i = elements.next();

			ModelIstanzaModificaPrenotazione mimp = new ModelIstanzaModificaPrenotazione();
			//mimp.setEta(asInt(i.get("EtaInGiorni")));
			mimp.setDescrizioneStato(asText( i.get("DescrizioneStato")));
			mimp.setIdAppuntamento(asText( i.get("IdAppuntamento")));
			mimp.setIdIstanza(asText( i.get("IdIstanza")));
			mimp.setIdStato(asText(i.get("IdStato")));
			mimp.setMotivazione(asText(i.get("MotivoVariazione")));
			mimp.setNoteRichiesta(asText(i.get("NoteRichiesta")));
			mimp.setTipologiaIstanza(asText(i.get("TipoRichiesta")));			
			mimp.setCentroVaccinaleCodice(asText(i.get("CentroVaccinale")));
			mimp.setCentroVaccinaleDescrizione(asText(i.get("CentroVaccinalePazienteDescrizione")));
			mimp.setCentroVaccinaleIstanzaCodice(asText(i.get("CentroVaccinaleIstanza")));
			mimp.setCentroVaccinaleIstanzaDescrizione(asText(i.get("CentroVaccinaleIstanzaDescrizione")));
			mimp.setDataPresentazioneIstanza(asText(i.get("DataPresentazioneIstanza")));
			
			List<ModelVaccinoNoDose> vaccini = new ArrayList<>();
			JsonNode vacciniJn = i.get("Vaccini");
			if (vacciniJn != null) {
				Iterator<JsonNode> elementsVaccini = vacciniJn.elements();
				while (elementsVaccini.hasNext()) {
					JsonNode jsVaccino = elementsVaccini.next();
					ModelVaccinoNoDose mv = new ModelVaccinoNoDose();
					mv.setCodice(asText(jsVaccino.get("CodiceVaccino")));
					mv.setDescrizione(asText(jsVaccino.get("DescrizioneVaccino")));
					
					vaccini.add(mv);
				}
			}
			mimp.setVaccini(vaccini);
			result.add(mimp);
		}
		
		
		return result;
	}
	

}
