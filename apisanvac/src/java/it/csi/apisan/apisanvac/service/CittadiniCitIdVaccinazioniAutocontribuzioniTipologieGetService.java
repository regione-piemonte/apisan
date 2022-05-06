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
import it.csi.apisan.apisanvac.model.ModelAmbulatorio;
import it.csi.apisan.apisanvac.model.ModelAmbulatorioOrario;
import it.csi.apisan.apisanvac.model.ModelAsl;
import it.csi.apisan.apisanvac.model.ModelCentroVaccinale;
import it.csi.apisan.apisanvac.model.ModelReazioneAvversa;
import it.csi.apisan.apisanvac.model.ModelTipologieAutocontribuzione;


@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdVaccinazioniAutocontribuzioniTipologieGetService extends DelegheRESTBaseService {
	@Autowired
	private VacApiRestInvoker vacApiRestInvoker;

	private String cittadinoId;
	public CittadiniCitIdVaccinazioniAutocontribuzioniTipologieGetService(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request,
			HttpServletResponse response) {
		super(xRequestId, securityContext, httpHeaders, request, response);
		this.cittadinoId = citId;
	}

	@Override
	protected Response execute() {
		
		checkUtenteAutorizzatoOrDelegato(cittadinoId);

		List<ModelTipologieAutocontribuzione> resp = invokeGetTipologiaReazioneAvversa();

		return Response.ok(resp).type(MediaType.APPLICATION_JSON_TYPE).build();
	}

	private List<ModelTipologieAutocontribuzione> invokeGetTipologiaReazioneAvversa() {

		JsonNode resp = null;
		try {
			resp = vacApiRestInvoker.invoke("/VaccinazioniEseguite/GetTipologiaReazioniAvverse", HttpMethod.GET, (JsonNode) null,
					null, null);
		} catch (org.springframework.web.client.HttpClientErrorException hcee) {

			String responseBodyAsString = hcee.getResponseBodyAsString();
			if (HttpStatus.BAD_REQUEST.equals(hcee.getStatusCode())
					&& responseBodyAsString.contains("Non ci sono reazioni avverse")) {
				// Quando non trova elementi ritorna 400 con:
//				{
//				    "Message": "Non ci sono istanze per questo assistito"
//				}
				resp = null;
			} else {
				throw hcee;
			}
		}
		// resp = fakeResponseTest(resp);

		List<ModelTipologieAutocontribuzione> result = new ArrayList<>();
		if (resp == null) {
			return result;
		}

		Iterator<JsonNode> elements = resp.elements();

		while (elements.hasNext()) {
			JsonNode i = elements.next();

			ModelTipologieAutocontribuzione mta = new ModelTipologieAutocontribuzione();
			mta.setCodice(asText(i.get("IdCodice")));
			mta.setDescrizione(asText(i.get("Descrizione")));

			result.add(mta);
		}

		return result;
	
	}

}
