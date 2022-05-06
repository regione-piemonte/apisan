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
import it.csi.apisan.apisanvac.model.ModelCittadinoContatti;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdContattiVaccinazioniPutService extends DelegheRESTBaseService {

	@Autowired
	private VacApiRestInvoker vacApiRestInvoker;

	private String cittadinoId;
	private ModelCittadinoContatti payload;

	public CittadiniCitIdContattiVaccinazioniPutService(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Object payload, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
		super(xRequestId, securityContext, httpHeaders, request, response);
		this.cittadinoId = citId;
		this.payload = (ModelCittadinoContatti) payload;
	}

	@Override
	protected Response execute() {
		/* Validazione */

		checkUtenteAutorizzatoOrDelegato(cittadinoId);
		checkNotNull(cittadinoId,
				new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "cittadinoId non valorizzato"));
		checkNotNull(payload, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "payload non valorizzato"));

		JsonNode resp = invokeSetContattiAssistito();

		boolean isSuccess = vacApiRestInvoker.isSuccess(resp);

		if (isSuccess) {
			return Response.ok().type(MediaType.APPLICATION_JSON_TYPE).build();
		} else {
			return Response.serverError().entity(resp.toString()).type(MediaType.APPLICATION_JSON_TYPE).build();
		}

	}

	private JsonNode invokeSetContattiAssistito() {
		ObjectMapper om = new ObjectMapper();
		ObjectNode on = om.createObjectNode();
		ObjectNode contatto = om.createObjectNode();
		contatto.put("CodiceFiscale", cittadinoId);
		contatto.put("Telefono", payload.getTelefono());
		contatto.put("Telefono2", payload.getTelefono2());
		contatto.put("Telefono3", payload.getTelefono3());
		contatto.put("Email", payload.getEmail());
		on.set("Contatto", contatto);

		return vacApiRestInvoker.invoke("/DatiAssistito/SetContattiAssistito", HttpMethod.POST, on, null, null);

	}

}
