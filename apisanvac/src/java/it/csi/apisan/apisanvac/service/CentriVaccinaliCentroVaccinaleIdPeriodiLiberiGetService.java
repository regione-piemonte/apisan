/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.service;

import static it.csi.apisan.apisanvac.util.JsonNodeUtils.asText;

import java.io.IOException;
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
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import it.csi.apisan.apisanvac.common.DelegheRESTBaseService;
import it.csi.apisan.apisanvac.common.ErroreBuilder;
import it.csi.apisan.apisanvac.model.ModelAmbulatorio;
import it.csi.apisan.apisanvac.model.ModelAmbulatorioOrario;
import it.csi.apisan.apisanvac.model.ModelAsl;
import it.csi.apisan.apisanvac.model.ModelCentroVaccinale;
import it.csi.apisan.apisanvac.model.ModelIstanza;
import it.csi.apisan.apisanvac.model.ModelSlotTemporale;
import it.csi.apisan.apisanvac.model.ModelVaccino;
import it.csi.apisan.apisanvac.util.FilterCentriVaccinali;
import it.csi.apisan.apisanvac.util.FilterPeriodiLiberi;
import it.csi.apisan.apisanvac.util.FilterUtil;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CentriVaccinaliCentroVaccinaleIdPeriodiLiberiGetService extends DelegheRESTBaseService{

	@Autowired
	private VacApiRestInvoker vacApiRestInvoker;
	
	private String centroVaccinaleId;
	
	private String utente;
	private String filter;
	private FilterPeriodiLiberi filtroCentriVaccinali;
	
	public CentriVaccinaliCentroVaccinaleIdPeriodiLiberiGetService(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String centroVaccinaleId, String filter,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request,
			HttpServletResponse response) {
		super(xRequestId, securityContext, httpHeaders, request, response);
		this.centroVaccinaleId = centroVaccinaleId;
		this.filter = filter;
		this.utente = shibIdentitaCodiceFiscale ;
	}

	@Override
	protected Response execute() {
		checkNotBlank(filter, "filter non valorizzato");
		checkUtenteAutorizzatoOrDelegato(utente);
		filtroCentriVaccinali = FilterUtil.init(FilterPeriodiLiberi.class, filter);
		if(filtroCentriVaccinali == null) {
			throw ErroreBuilder.from(Status.BAD_REQUEST).title("Filter non valido").dettaglio("Filter:","filter non valido").exception();
		}
		
		List<ModelSlotTemporale> resp = invokeGetSlotLiberi(filter);

		return Response.ok(resp).type(MediaType.APPLICATION_JSON_TYPE).build();
	}

	private List<ModelSlotTemporale> invokeGetSlotLiberi(String filter) {


		JsonNode resp = null;
		 ObjectMapper mapper = new ObjectMapper();	
			
		try {
			//payload = mapper.readTree(filter);
			//uso il filtro per riempire il payload
			
			ObjectMapper om = new ObjectMapper();
			ObjectNode on = om.createObjectNode();
			ObjectNode appuntamento = om.createObjectNode();
			if(filtroCentriVaccinali.getCodicePaziente().getEq() != null) {
				appuntamento.put("CodicePaziente", filtroCentriVaccinali.getCodicePaziente().getEq());
			}
			
			appuntamento.put("CodiceConsultorio", centroVaccinaleId);
			if(filtroCentriVaccinali.getDataInizio().getEq() != null) {
				appuntamento.put("DataInizio", filtroCentriVaccinali.getDataInizio().getEq());
			}
			if(filtroCentriVaccinali.getDataFine().getEq() != null) {
				appuntamento.put("DataFine", filtroCentriVaccinali.getDataFine().getEq());
			}
			
			if(filtroCentriVaccinali.getCodiceAmbulatorio() != null) {
				appuntamento.put("CodiceAmbulatorio", filtroCentriVaccinali.getCodiceAmbulatorio().getEq());
			}
			
			on.set("Appuntamento", appuntamento);
			
			
			resp = vacApiRestInvoker.invoke("/AppuntamentoVaccinale/RicercaPeriodiLiberi" , HttpMethod.POST, on, null, null);
		} catch (org.springframework.web.client.HttpClientErrorException hcee) {

			String responseBodyAsString = hcee.getResponseBodyAsString();
			if (HttpStatus.BAD_REQUEST.equals(hcee.getStatusCode())
					&& responseBodyAsString.contains("Non ci sono slot liberi")) {
				// Quando non trova elementi ritorna 400 con:
//				{
//				    "Message": "Non ci sono istanze per questo assistito"
//				}
				resp = null;
			} else {
				throw hcee;
			}
		}

		List<ModelSlotTemporale> result = new ArrayList<>();
		if (resp == null) {
			return result;
		}

		Iterator<JsonNode> elements = resp.elements();

		while (elements.hasNext()) {
			JsonNode i = elements.next();

			ModelSlotTemporale mst = new ModelSlotTemporale();
			mst.setDataAppuntamento(asText(i.get("DataAppuntamento")));
			mst.setCodiceAmbulatorio(asText(i.get("Codice")));
			mst.setDescrizione(asText(i.get("Descrizione")));
			
			result.add(mst);
		}

		return result;
	
	}

}
