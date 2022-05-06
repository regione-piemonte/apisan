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
import it.csi.apisan.apisanvac.model.ModelCentroVaccinaleListElement;
import it.csi.apisan.apisanvac.model.ModelIstanza;
import it.csi.apisan.apisanvac.model.ModelVaccino;
import it.csi.apisan.apisanvac.model.ModelVaccinoNoDose;
import it.csi.apisan.apisanvac.util.FilterCentriVaccinali;
import it.csi.apisan.apisanvac.util.FilterUtil;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class centriVaccinaliGetService extends DelegheRESTBaseService {

	@Autowired
	private VacApiRestInvoker vacApiRestInvoker;

	private String filter;
	private String utente;

	public centriVaccinaliGetService(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor,
			String xCodiceServizio, String filter, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest request, HttpServletResponse response) {
		super(xRequestId, securityContext, httpHeaders, request, response);
		this.filter = filter;
		this.utente = shibIdentitaCodiceFiscale;
	}

	@Override
	protected Response execute() {
		checkNotBlank(filter, "filter non valorizzato");
		checkUtenteAutorizzatoOrDelegato(utente);
		
		FilterCentriVaccinali filtroCentriVaccinali = FilterUtil.init(FilterCentriVaccinali.class, filter);
	
		String	idAsr = filtroCentriVaccinali.getAsl().getEq();
		
		checkNotNull(idAsr, "Filtro errato");
		
		String associazione = (filtroCentriVaccinali.getAssociazione() != null && filtroCentriVaccinali.getAssociazione().getEq() != null)? filtroCentriVaccinali.getAssociazione().getEq() : "";
		
		String tipoCentro = (filtroCentriVaccinali.getTipoCentro() != null && filtroCentriVaccinali.getTipoCentro().getEq() != null)? "&TipoCentro=" + filtroCentriVaccinali.getTipoCentro().getEq() : "";
		
		String filtro = "CodiceAzienda=" + idAsr + "&CodiceAssociazione=" + associazione  + tipoCentro ;
		
		List<ModelCentroVaccinaleListElement> resp = invokeGetCentriVaccinali(filtro);

		return Response.ok(resp).type(MediaType.APPLICATION_JSON_TYPE).build();
	}

	private List<ModelCentroVaccinaleListElement> invokeGetCentriVaccinali(String filtro) {

		JsonNode resp = null;
		try {
			resp = vacApiRestInvoker.invoke("/CentriVaccinali/Get?" + filtro, HttpMethod.GET, (JsonNode) null,
					null, null);
		} catch (org.springframework.web.client.HttpClientErrorException hcee) {

			String responseBodyAsString = hcee.getResponseBodyAsString();
			if (HttpStatus.BAD_REQUEST.equals(hcee.getStatusCode())
					&& responseBodyAsString.contains("Non ci sono centri vaccinali")) {
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

		List<ModelCentroVaccinaleListElement> result = new ArrayList<>();
		if (resp == null) {
			return result;
		}

		Iterator<JsonNode> elements = resp.elements();

		while (elements.hasNext()) {
			JsonNode i = elements.next();
			
			
			ModelCentroVaccinaleListElement mcv = new ModelCentroVaccinaleListElement();
			mcv.setCodice(asText(i.get("Codice")));
			mcv.setDescrizione(asText(i.get("Descrizione")));
			mcv.setComune(asText(i.get("Comune")));
			mcv.setIndirizzo(asText(i.get("Indirizzo")));
			mcv.setNote(asText(i.get("Note")));
			mcv.setTelefono(asText(i.get("Telefono")));
			mcv.setMail(verificaNull(asText(i.get("Mail"))));
			mcv.setAsl(verificaNull(asText(i.get("AslCodice"))));

			List<ModelAmbulatorio> ambulatori = new ArrayList<>();
			JsonNode ambulatoriJn = i.get("Ambulatori");
			if (ambulatoriJn != null) {
				Iterator<JsonNode> elementsAmbulatori = ambulatoriJn.elements();
				while (elementsAmbulatori.hasNext()) {
					JsonNode jsVaccino = elementsAmbulatori.next();
					ModelAmbulatorio ma = new ModelAmbulatorio();
					ma.setCodice(asText(jsVaccino.get("Codice")));
					ma.setDescrizione(asText(jsVaccino.get("Descrizione")));
					
					List<ModelAmbulatorioOrario> ambulatorioOrario = new ArrayList<>();
					JsonNode ambulatorioOrarioJn = jsVaccino.get("Orari");
					if (ambulatorioOrarioJn != null) {
						Iterator<JsonNode> elementsAmbulatorioOrario = ambulatorioOrarioJn.elements();
						while (elementsAmbulatorioOrario.hasNext()) {
							JsonNode jsOrario = elementsAmbulatorioOrario.next();
							ModelAmbulatorioOrario mao = new ModelAmbulatorioOrario();
							String giorno = asText(jsOrario.get("Giorno"));
							
							mao.setGiorno(asText(jsOrario.get("Giorno")));
							mao.setOraInizioAm(asText(jsOrario.get("OraInizioAM")));
							mao.setOraFineAm(asText(jsOrario.get("OraFineAM")));
							mao.setOraInizioPm(asText(jsOrario.get("OraInizioPM")));
							mao.setOraFinePm(asText(jsOrario.get("OraFinePM")));
							ambulatorioOrario.add(mao);
						}
						ma.setOrari(ambulatorioOrario);
						
					}
					
					//Associazioni
					List<ModelVaccinoNoDose> associazioni = new ArrayList<ModelVaccinoNoDose>();
					JsonNode associazioniPrenotabili = jsVaccino.get("AssociazioniPrenotabili");
					if(associazioniPrenotabili != null) {
						Iterator<JsonNode> elementsAssociazioni = associazioniPrenotabili.elements();
						while(elementsAssociazioni.hasNext()) {
							JsonNode jsAssociazione = elementsAssociazioni.next();
							ModelVaccinoNoDose modelvaccNoDose = new ModelVaccinoNoDose();
							modelvaccNoDose.setCodice(asText(jsAssociazione.get("Codice") ));
							modelvaccNoDose.setDescrizione(asText(jsAssociazione.get("Descrizione") ));
							associazioni.add(modelvaccNoDose);
						}							
					}
					ma.setAssociazioni(associazioni);
					ambulatori.add(ma);
				}
			}
			mcv.setAmbulatori(ambulatori);

			result.add(mcv);
		}

		return result;
	}
	
	private static String verificaNull(String par) {
		if(par == null) {
			return "";
		}
		else if(par.equalsIgnoreCase("null")) {
			return "";
		}else {
			return par;
		}
	}

}
