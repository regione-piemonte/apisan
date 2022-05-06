/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.service;

import static it.csi.apisan.apisanvac.util.JsonNodeUtils.asText;
import static it.csi.apisan.apisanvac.util.Utils.toDateFromString;

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
import it.csi.apisan.apisanvac.model.ModelAmbulatorio;
import it.csi.apisan.apisanvac.model.ModelAmbulatorioOrario;
import it.csi.apisan.apisanvac.model.ModelCentroVaccinaleListElement;
import it.csi.apisan.apisanvac.model.ModelRangeDate;
import it.csi.apisan.apisanvac.model.ModelVaccinoNoDose;


@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdRangeDateGetService extends DelegheRESTBaseService {
	
	@Autowired
	private VacApiRestInvoker vacApiRestInvoker;
	
	private String citId;
	private String appuntamentoId;
	
	public CittadiniCitIdVaccinazioniAppuntamentiAppuntamentoIdRangeDateGetService(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String appuntamentoId,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request,
			HttpServletResponse response) {
		super(xRequestId, securityContext, httpHeaders, request, response);
		this.citId = citId;
		this.appuntamentoId = appuntamentoId;
	}

	@Override
	protected Response execute() {
		checkNotBlank(citId, "Impostare codice fiscale");
		checkNotBlank(appuntamentoId, "Impostare id dell'appuntamento");
		
		ModelRangeDate lista = invokeRangeDate();
		return Response.ok(lista).type(MediaType.APPLICATION_JSON_TYPE).build();
	}
	
	
	
	private ModelRangeDate invokeRangeDate(){
		JsonNode resp = null;
		List<ModelRangeDate> result = new ArrayList<>();
		try {
			resp = vacApiRestInvoker.invoke("/AppuntamentoVaccinale/GetIntervalloDateSpostamentoAppuntamento?idConvocazione=" + appuntamentoId, HttpMethod.GET, (JsonNode) null,
					null, null);
		} catch (org.springframework.web.client.HttpClientErrorException hcee) {
				throw hcee;			
		}
		
		if (!vacApiRestInvoker.isSuccess( resp)) {
			JsonNode message = resp.get("Message");
			
			if(idNonTrovato(message)) {
				throw ErroreBuilder.from(Status.NOT_FOUND).title("Id appuntamento non trovato").exception() ;
			}else {
				String title = message != null ? message.asText() : "Errore chiamata GetIntervalloDateSpostamentoAppuntamento";
				throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title(title).exception();
			}
			
		}

		Iterator<JsonNode> elements = resp.elements();

		ModelRangeDate mcv = new ModelRangeDate();
		mcv.setDataFine(asText(resp.get("DataFine")));
		mcv.setDataInizio(asText(resp.get("DataInizio")));


		
		return mcv;
	}
	
	private boolean idNonTrovato(JsonNode message) {
		return (message != null && message.asText().equalsIgnoreCase("Id convocazione non specificato o non presente"));
	}
}
