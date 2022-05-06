/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross.impl.mock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import it.csi.apisan.apisancross.dto.apisancross.Comune;

public class MockComuniCSV {
	
	private List<Comune> comuni;
	
	
	private static MockComuniCSV self;
	
	private MockComuniCSV() {
		comuni = new ArrayList<>();
		initComuniFromFile();
		
	}
	
	private void initComuniFromFile() {
		String resourceName = "it/csi/apisan/apisancross/business/apisancross/impl/mock/ElencoComuniAttuali.csv";
		
		
		try (InputStream in = this.getClass().getClassLoader().getResourceAsStream(resourceName);
				BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
				Comune comune = newComune(line);
				System.out.println("comune: " + comune);
				comuni.add(comune);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
//		try (Stream<String> stream = Files.new.lines(Paths.get(fileName))) {
//			
//			stream.forEach(System.out::println);
//
//			stream.forEach(line -> {
//				Comune comune = newComune(line);
//				System.out.println("comune: "+comune);
//				comuni.add(comune);
//			});
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
	
	private Comune newComune(String line) {
		String[] split = line.split(";");
		//Codice Nazionale;Sigla Provincia;Denominazione Italiana;Denominazione Estera;Codice Catastale;Ufficio Catasto Terreni;Ufficio Catasto Fabbricati;Codice Conservatoria;Codice Istat;Data Costituzione;Attesa VCT Territorio;Attesa VCT Fabbricati
		//L219;TO;TORINO;;A1AA;TO;TO;TO10;001272;;;
		
//		torino.setCap("10100");
//		torino.setIstatProvincia("001");
//		torino.setIstatRegione("001");
//		torino.setIstatComuMockComuni.javane("001272");
//		torino.setDescComune("TORINO");
//		torino.setCodCatasto("L219");
		
		Comune c = new Comune();
		c.setDesc(split[2]);
		
		return c;
		
	}

	public static MockComuniCSV getInstance() {
		if(self==null) {
			self = new MockComuniCSV();
		}
		
		return self;
	}

	public List<Comune> getComuni() {
		return comuni;
	}
	
	public static void main(String[] args) {
		MockComuniCSV.getInstance();
	}

}
