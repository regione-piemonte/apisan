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
import it.csi.apisan.apisanvac.model.ModelContattiTemporanei;
import static it.csi.apisan.apisanvac.util.JsonNodeUtils.asText;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdContattiTemporaneiGetService extends DelegheRESTBaseService {
	
	@Autowired
	private VacApiRestInvoker vacApiRestInvoker;
	
	String citId;
	
	
	public CittadiniCitIdContattiTemporaneiGetService(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
		super(xRequestId, securityContext, httpHeaders, request, response);
		this.citId = citId;
	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestId, "xRequestID non valorizzato");
		checkNotBlank(xCodiceServizio, "codice servizio non valorizzato");
		checkNotNull(shibIdentitaCodiceFiscale, "Identita non valorizzata");
		checkNotBlank(shibIdentitaCodiceFiscale, "Identita non valorizzata");
		checkNotBlank(citId, "citId non valorizzato");
		checkUtenteAutorizzatoOrDelegato(citId);
		
		ModelContattiTemporanei resp = invokeIndirizzoTemporaneo();
		
		return Response.ok(resp).type(MediaType.APPLICATION_JSON_TYPE).build();
	}
	
	
	
	private ModelContattiTemporanei invokeIndirizzoTemporaneo() {
		
		JsonNode resp = null;
		try {
			StringBuilder url = new StringBuilder();
			url.append("/DatiAssistito/GetIndirizzoTemporaneo?CodiceFiscale=");
			url.append(citId);
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
		
		if(resp == null) {
			throw ErroreBuilder.from(Status.NOT_FOUND).title("Contatti temporanei non trovati").exception();
		}
		
		
		
		ModelContattiTemporanei contatti = new ModelContattiTemporanei();
		contatti.setDataFineValidita(asText(resp.get("FineIT")));
		contatti.setDataInizioValidita(asText(resp.get("InizioIT")));
		contatti.setTelefono(asText(resp.get( "Telefono")));
		contatti.setEmail(asText(resp.get("Mail")));
		contatti.setIndirizzoTemporaneo(asText(resp.get("IndirizzoTemporaneo"))); 
		contatti.setComune(asText(resp.get("DescrizioneComune")));
		
		return contatti;
	}
}
