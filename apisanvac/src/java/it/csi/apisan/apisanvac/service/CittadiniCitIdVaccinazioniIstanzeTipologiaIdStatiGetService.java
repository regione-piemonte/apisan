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
import it.csi.apisan.apisanvac.model.ModelStatoIstanza;


@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdVaccinazioniIstanzeTipologiaIdStatiGetService extends DelegheRESTBaseService {
	@Autowired
	private VacApiRestInvoker vacApiRestInvoker;
	
	private String citId; 
	private String tipologiaId;
	
	
	public CittadiniCitIdVaccinazioniIstanzeTipologiaIdStatiGetService(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String tipologiaId,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request,
			HttpServletResponse response) {
		super(xRequestId, securityContext, httpHeaders, request, response);
		this.citId = citId; 
		this.tipologiaId = tipologiaId;		
	}

	@Override
	protected Response execute() {
		checkNotBlank(citId, "cittadinoId non valorizzato");
		checkUtenteAutorizzatoOrDelegato(citId);
		checkNotBlank(tipologiaId, "Id tipologia non valorizzato");
		
		
		
		List<ModelStatoIstanza> resp = invokeListaStatiIstanze();

		return Response.ok(resp).type(MediaType.APPLICATION_JSON_TYPE).build();
	}
	
	
	private List<ModelStatoIstanza> invokeListaStatiIstanze(){
		JsonNode resp = null;
		try {
			resp = vacApiRestInvoker
					.invoke("/Stati/GetListaStatiIstanze?Tipo="
							+ this.tipologiaId, HttpMethod.GET, (JsonNode) null, null, null);
		} catch (org.springframework.web.client.HttpClientErrorException hcee) {

			String responseBodyAsString = hcee.getResponseBodyAsString();
			if (HttpStatus.BAD_REQUEST.equals(hcee.getStatusCode())
					&& responseBodyAsString.contains("tipologia non presente")) {

				resp = null;
			} else {
				throw hcee;
			}
		}
		List<ModelStatoIstanza> result = new ArrayList<>();
		if (resp == null) {
			return result;
		}
		Iterator<JsonNode> elements = resp.elements();

		while (elements.hasNext()) {
			JsonNode i = elements.next();

			ModelStatoIstanza msi = new ModelStatoIstanza();
			msi.setCodice(asText(i.get("Id")));
			msi.setDescrizione(asText(i.get("Descrizione")));
			

			result.add(msi);
		}
		return result;
	}
	

}
