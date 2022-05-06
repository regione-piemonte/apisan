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
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;

import it.csi.apisan.apisanvac.common.DelegheRESTBaseService;
import it.csi.apisan.apisanvac.common.ErroreBuilder;
import it.csi.apisan.apisanvac.model.ModelIstanzaAutocontribuzione;
import it.csi.apisan.apisanvac.model.ModelIstanzaModificaPrenotazione;
import it.csi.apisan.apisanvac.model.ModelVaccinoNoDose;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdVaccinazioniIstanzeAutocontribuzioneTipologiaIstanzaGetService
		extends DelegheRESTBaseService {

	@Autowired
	private VacApiRestInvoker vacApiRestInvoker;
	
	private String cittadinoId;
	private String tipologiaIstanza;
	
	public CittadiniCitIdVaccinazioniIstanzeAutocontribuzioneTipologiaIstanzaGetService(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio,
			String citId, String tipologiaIstanza, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest request, HttpServletResponse response) {
		super(xRequestId, securityContext, httpHeaders, request, response);
		this.cittadinoId = citId;
		this.tipologiaIstanza = tipologiaIstanza;
	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestId, "xRequestID non valorizzato");
		checkNotBlank(xCodiceServizio, "codice servizio non valorizzato");
		checkNotBlank(cittadinoId, "citId non valorizzato");
		checkNotBlank(tipologiaIstanza, "tipologia non valorizzata");
		
		List<ModelIstanzaAutocontribuzione> resp = invokeListaIstanzeDocumentazione();
		
		return Response.ok(resp).type(MediaType.APPLICATION_JSON_TYPE).build();
	}
	
	
	private List<ModelIstanzaAutocontribuzione> invokeListaIstanzeDocumentazione(){
		JsonNode resp = null;
		try {
			StringBuilder url = new StringBuilder();
			url.append("/Documento/GetListaIstanzeDocumentazione?CodiceFiscaleRichiedente=");
			url.append(cittadinoId);
			url.append("&tipologia=");
			url.append(tipologiaIstanza);

			resp = vacApiRestInvoker
					.invoke( url.toString(), 
							 HttpMethod.GET, (JsonNode) null, null, null);
		} catch (org.springframework.web.client.HttpClientErrorException hcee) {

			String responseBodyAsString = hcee.getResponseBodyAsString();
			if (HttpStatus.BAD_REQUEST.equals(hcee.getStatusCode()) //Nessun elemento trovato
					&& responseBodyAsString.contains("Nessun elemento trovato")) {
				resp = null;
			} else  if (HttpStatus.BAD_REQUEST.equals(hcee.getStatusCode()) //Nessun elemento trovato
					&& responseBodyAsString.contains("Tipologia non supportata")) {
				throw ErroreBuilder.from(Status.BAD_REQUEST).title(responseBodyAsString).dettaglio("PARAMETRO NON VALIDO", responseBodyAsString).exception();
			}
			
			else {
				throw hcee;
			}
		}
		List<ModelIstanzaAutocontribuzione> result = new ArrayList<>();
		if(resp == null) {
			return result;
		}

		Iterator<JsonNode> elements = resp.elements();

		while (elements.hasNext()) {
			JsonNode i = elements.next();

			ModelIstanzaAutocontribuzione miac = new ModelIstanzaAutocontribuzione();
			
			miac.setDataRichiesta(asText(i.get("DataInserimento")));
			miac.setDescrizioneStato(asText( i.get("DescrizioneStato")));
			miac.setIdAppuntamento(asText( i.get("IdAppuntamento")));
			miac.setIdConvocazione(asText( i.get("IdAppuntamento")));
			miac.setIdIstanza(asText( i.get("IdIstanza")));
			miac.setIdStato(asText(i.get("IdStato")));
			//miac.setMotivazione(asText(i.get("MotivoVariazione")));
			miac.setNoteRichiesta(asText(i.get("Note")));
			miac.setNoteRisposta(asText(i.get("NoteRisposta")));
			//miac.setTipologiaIstanza(asText(i.get("TipoRichiesta")));
			
			result.add(miac);
		}
		
		
		return result;		
	}
}
