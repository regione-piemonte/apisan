/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.service;

import static it.csi.apisan.apisanvac.util.JsonNodeUtils.asInt;
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
import it.csi.apisan.apisanvac.model.ModelIstanzaReazioneAvversa;
import it.csi.apisan.apisanvac.model.ModelReazioneAvversa;
import it.csi.apisan.apisanvac.model.ModelVaccino;
import it.csi.apisan.apisanvac.util.Utils;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdReazioniAvverseGetService extends DelegheRESTBaseService{
	@Autowired
	private VacApiRestInvoker vacApiRestInvoker;
	
	private String cittadinoId;
	
	public CittadiniCitIdReazioniAvverseGetService(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
		super(xRequestId, securityContext, httpHeaders, request, response);
		this.cittadinoId = citId;
	}


	@Override protected Response execute() {
        checkNotBlank(cittadinoId, "cittadinoId non valorizzato");
        checkUtenteAutorizzatoOrDelegato(cittadinoId);

        List<ModelIstanzaReazioneAvversa> resp = invokeGetListaReazioniAvverse();

        return Response.ok(resp).type(MediaType.APPLICATION_JSON_TYPE).build();
	}


	private List<ModelIstanzaReazioneAvversa> invokeGetListaReazioniAvverse() {
		JsonNode resp = null;
		try {
			resp = vacApiRestInvoker.invoke("/VaccinazioniEseguite/GetListaSegnalazioniReazioniAvverse?CodiceFiscale="+this.cittadinoId, 
					HttpMethod.GET, (JsonNode)null, null, null);
		} catch (org.springframework.web.client.HttpClientErrorException hcee) {

			String responseBodyAsString = hcee.getResponseBodyAsString();
			if(HttpStatus.BAD_REQUEST.equals(hcee.getStatusCode()) 
					&& (responseBodyAsString.contains("Non ci sono reazioni avverse per questo assistito") || responseBodyAsString.contains("Codice fiscale non presente")
							||  responseBodyAsString.contains("Nessuna Segnalazione"))  ) {

				resp = null;
			} else if(hcee.getStatusCode().value() > 399 && hcee.getStatusCode().value() < 499) {
				try {
					JsonNode respExc = Utils.toJsonNode(responseBodyAsString);
					String title = asText(respExc.get( "Message"));
					throw ErroreBuilder.from(hcee.getStatusCode().value(), hcee.getStatusCode().toString()).title(title).exception();
				}catch(IOException ioe) {
					throw ErroreBuilder.from(hcee.getStatusCode().value(), hcee.getStatusCode().toString()).title(hcee.getMessage()).exception();
				}


			} 
			else {
				throw hcee;
			}
		}
		//resp = fakeResponseTest(resp);
		
		List<ModelIstanzaReazioneAvversa> result = new ArrayList<>();
		if(resp == null) {
			return result;
		}
		
		Iterator<JsonNode> elements = resp.elements();

		while(elements.hasNext()) {
			JsonNode i = elements.next();
			
			ModelIstanzaReazioneAvversa mrv = new ModelIstanzaReazioneAvversa();
			//mrv.setIdVaccinazione(idVaccinazione);
			mrv.setIdIstanza(asText(i.get("Id")));
			mrv.setFarmaco(asText(i.get("FarmacoConcomitante")));
			mrv.setNote(asText(i.get("NoteSegnalazione")));
			mrv.setDataReazione(asText(i.get("DataReazione")));
			mrv.setTipologia(asText(i.get("Tipologia")));
			mrv.setIdStato(asText(i.get("IdStato")));
			mrv.setDescrizioneStato(asText(i.get("StatoDescrizione")));
			mrv.setNoteRisposta(asText(i.get("NoteRisposta")));
			mrv.setIdVaccinazione(asText(i.get("ProgressivoAssociazione")));
			//mrv.(asText(i.get("ProgressivoAssociazione"))); FIXME ID vaccinazione?
			
			List<ModelVaccino> vaccini = new ArrayList<>();
			JsonNode vacciniJn = i.get("Vaccinazione");
				if(vacciniJn!=null) {
					Iterator<JsonNode> elementsVaccini = vacciniJn.elements();
					while (elementsVaccini.hasNext()) {
						JsonNode jsVaccino = elementsVaccini.next();
						ModelVaccino mv = new ModelVaccino();
						mv.setCodice(asText(jsVaccino.get("AssociazioneCodice")));
						mv.setDescrizione(asText(jsVaccino.get("AssociazioneDescrizione")));
						mv.setDose(asInt(jsVaccino.get("AssociazioneDescrizione")));						
						vaccini.add(mv);
					}
				}
			mrv.setVaccini(vaccini);
			
			
			
			result.add(mrv);
		}
		
		return result;
	}
}
