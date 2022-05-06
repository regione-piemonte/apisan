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

import it.csi.apisan.apisanvac.common.VacRESTBaseService;
import it.csi.apisan.apisanvac.model.ModelMotivazioneOmissioneDifferimento;
import it.csi.apisan.apisanvac.model.ModelMotivazioneRevocaSpostamento;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class MotivazioniDifferimentoGetService extends VacRESTBaseService {

	@Autowired
	private VacApiRestInvoker vacApiRestInvoker;
	
	public MotivazioniDifferimentoGetService(String xRequestID, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
		super(xRequestID, securityContext, httpHeaders, request, response);
		
	}

	

	@Override
	protected Response execute() {
		checkNotBlank(xRequestId, "xRequestID non valorizzato");
		checkNotBlank(xCodiceServizio, "codice servizio non valorizzato");
		List<ModelMotivazioneRevocaSpostamento> resp = invokeMotivazionerevocaSpostamento();
		
		
		return Response.ok(resp).type(MediaType.APPLICATION_JSON_TYPE).build();
	}
	
	
	private List<ModelMotivazioneRevocaSpostamento> invokeMotivazionerevocaSpostamento(){
		JsonNode resp = null;
		try {
			resp = vacApiRestInvoker
					.invoke( "/AppuntamentoVaccinale/GetListaMotiviSpostamentoRevocaAppuntamento", 
							 HttpMethod.GET, (JsonNode) null, null, null);
		} catch (org.springframework.web.client.HttpClientErrorException hcee) {

			String responseBodyAsString = hcee.getResponseBodyAsString();
			if (HttpStatus.BAD_REQUEST.equals(hcee.getStatusCode())) {
				resp = null;
			} else {
				throw hcee;
			}
		}
		List<ModelMotivazioneRevocaSpostamento> result = new ArrayList<>();
		if (resp == null) {
			return result;
		}
		Iterator<JsonNode> elements = resp.elements();

		while (elements.hasNext()) {
			JsonNode i = elements.next();

			ModelMotivazioneRevocaSpostamento mrs = new ModelMotivazioneRevocaSpostamento();
			mrs.setCodice(asText(i.get("Id")));
			mrs.setDescrizione(asText(i.get("Descrizione")));
			

			result.add(mrs);
		}
		return result;
		
	}

}
