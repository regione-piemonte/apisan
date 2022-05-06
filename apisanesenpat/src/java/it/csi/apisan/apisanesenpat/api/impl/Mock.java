/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.api.impl;

import java.util.HashMap;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.map.ObjectMapper;

import it.csi.apisan.apisanesenpat.model.ModelEsenzioneAura;

public class Mock {
	
	static HashMap<String,String> mapResponse;
	
	static {
		mapResponse = new HashMap<String,String>();
		mapResponse.put("", "[  {    \"data_emissione\": \"string\",    \"data_scadenza\": \"string\",    \"revocabile\": true,    \"codice\": {      \"codice\": \"string\",      \"descrizione\": \"string\"    },    \"stato\": {      \"codice\": \"string\",      \"descrizione\": \"string\"    },    \"tipologia\": {      \"codice\": \"string\",      \"descrizione\": \"string\"    },    \"tipologia_invalidita\": {      \"codice\": \"string\",      \"descrizione\": \"string\"    },    \"malattia\": {      \"codice\": \"string\",      \"descrizione\": \"string\",      \"giorni_validita\": 0,      \"prestazioni\": [        {          \"codice\": \"string\",          \"descrizione\": \"string\"        }      ]    }  }]");
		mapResponse.put("SCLSCL00A55G273T","[\r\n" + 
				"  {\r\n" + 
				"    \"data_emissione\": \"2020-10-09T00:00Z\",\r\n" + 
				"    \"data_scadenza\": \"2020-10-09T00:00Z\",\r\n" + 
				"    \"revocabile\": true,\r\n" + 
				"    \"codice\": {\r\n" + 
				"      \"codice\": \"RN0970\",\r\n" + 
				"      \"descrizione\": \"Descrizione opzionale\"\r\n" + 
				"    },\r\n" + 
				"    \"stato\": {\r\n" + 
				"      \"codice\": null,\r\n" + 
				"      \"descrizione\": null\r\n" + 
				"    },\r\n" + 
				"    \"tipologia\": {\r\n" + 
				"      \"codice\": \"MR\",\r\n" + 
				"      \"descrizione\": \"Malattie Rare\"\r\n" + 
				"    },\r\n" + 
				"    \"tipologia_invalidita\": {\r\n" + 
				"      \"codice\": null,\r\n" + 
				"      \"descrizione\": null\r\n" + 
				"    },\r\n" + 
				"    \"malattia\": {\r\n" + 
				"      \"codice\": \"000\",\r\n" + 
				"      \"descrizione\": \"-\",\r\n" + 
				"      \"giorni_validita\": 0,\r\n" + 
				"      \"prestazioni\": [\r\n" + 
				"        {\r\n" + 
				"          \"codice\": \"287\",\r\n" + 
				"          \"descrizione\": \"LISTA PRESTAZIONI ESENTATE:Prestazioni di assistenza sanitaria incluse nei L.E.A. , efficaci ed appropriate per il trattamento ed il monitoraggio della malattia dalla quale e' affetto per la prevenzione degli ulteriori aggravamenti.LISTA FARMACI ESENTATI:Esenti tutte le prescrizioni farmaceutiche.I farmaci di fascia C sono concedibili esclusivamente come distribuzione diretta tramite la farmacia ospedaliera ditero presentazione di attestato di esenzione , piano terapeutico.\"\r\n" + 
				"        }\r\n" + 
				"      ]\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"]");
	}

	public Response getMockResponse(String cf) {
		ObjectMapper mapper = new ObjectMapper();
		ModelEsenzioneAura[] modelEsenzioneAura= null;
		StringBuffer json = new StringBuffer();
		json.append(mapResponse.get(cf));
		try {
			modelEsenzioneAura = mapper.readValue(json.toString(), ModelEsenzioneAura[].class);		
		} catch (Exception e) {
			e.printStackTrace();		
		}		

		Response.ResponseBuilder builder = Response.status(Response.Status.OK);        
        builder.entity(modelEsenzioneAura);
        builder.type(MediaType.APPLICATION_JSON_TYPE);        
        return builder.build();
	}

}
