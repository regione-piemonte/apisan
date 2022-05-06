/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import it.csi.apisan.apisanvac.model.ModelVaccinoNoDose;
import it.csi.apisan.apisanvac.model.PayloadVaccinazioneAppuntamentoAnnullamentoRichiesta;

public class ApisanvacTest {

	public ApisanvacTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//PayloadVaccinazioneAppuntamentoAnnullamentoRichiesta ric = new PayloadVaccinazioneAppuntamentoAnnullamentoRichiesta();
		//ric.setNote("note");
		
		//System.out.println(getStringFromObject(ric));
		String str1 = "note: note perchÚ Þ bravo";
		byte[] bytes = str1.getBytes(StandardCharsets.UTF_8);
		 
		String utf8EncodedString = new String(bytes, StandardCharsets.UTF_8);
		System.out.println("utf8EncodedString: " + utf8EncodedString);
		
		
		String str2 = "note: note perchè è bravo";
	
		byte[] bytes2 = str2.getBytes(StandardCharsets.UTF_8);
		System.out.println("str2: " + str2);
		String utf8EncodedString2 = new String(bytes2, StandardCharsets.UTF_8);
		System.out.println("utf8EncodedString2: " + utf8EncodedString2);
		
		ObjectMapper om1 = new ObjectMapper();
		
		ObjectNode propostaVaccinazione = om1.createObjectNode();
		propostaVaccinazione.put("CodiceFiscaleRichiedente", "BSOGDE76D20L219N");
		propostaVaccinazione.put("note", str2);
		
		System.out.println("Note: " + getStringFromObject(propostaVaccinazione));
		
		
		ObjectMapper om = new ObjectMapper();
		ObjectNode on = om.createObjectNode();
		ObjectNode prenotazione = om.createObjectNode();
		//prenotazione.put("CodiceFiscale", cittadinoId);
		prenotazione.put("DataConvocazione", "2019-10-31T00:00:00");
		prenotazione.put("DataAppuntamento", "2019-10-31T00:00:00");
		prenotazione.put("CodiceConsultorio", "cosnultorio");
		prenotazione.put("CodiceAmbulatorio", "ambulatorio");
		prenotazione.put("CodicePaziente", "codicepaziente");
		
		ArrayNode vaccini = om.createArrayNode();
		
		for (int i = 0; i<2; i++ ) {
			
			ObjectNode vac = om.createObjectNode();
			vac.put("CodiceVaccino", "codice"+1);
			vac.put("DescrizioneVaccino", "descrizione"+i);			
			vaccini.add(vac);
			
		}
		prenotazione.set("Vaccini", vaccini);
		on.set("prenotazione", prenotazione);
		
		System.out.println("payload: " + getStringFromObject(on));
	}
	
	
	public static String getStringFromObject(Object obj) {
		if (obj == null) {
			return null;
		}
		ObjectMapper objectMapper = new ObjectMapper();
		String json = null;
		try {
			json = objectMapper.writeValueAsString(obj);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return json; 
	}

}
