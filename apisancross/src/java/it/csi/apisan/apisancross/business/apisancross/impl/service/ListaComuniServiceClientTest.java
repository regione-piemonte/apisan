/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross.impl.service;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonProcessingException;
import org.springframework.web.client.RestTemplate;

import it.csi.apisan.apisancross.dto.apisancross.Comune;

public class ListaComuniServiceClientTest {

	public static void main(String[] args) throws Exception {
		//test1();
		test2();
	}
	
	private static void test2() throws JsonProcessingException, IOException {
		ListaComuniServiceClient lcsc = new ListaComuniServiceClient();
		lcsc.setSmartDatanetBaseUrl("http://xxx.smartdatanet.it/api/"); //Limiti_ammin_1239/DataEntities
		List<Comune> entries = lcsc.getListaComuni();
		System.out.println(">>> entries: " + entries);
		System.out.println(">>> Totale Comuni ottenuti: " + entries.size());
	}


	private static void test1() {
		RestTemplate rt = new RestTemplate();
		String url = "http://api.smartdatanet.it/api/Limiti_ammin_1239/DataEntities?$format=json&$top=1000";
		String map = rt.getForObject(url, String.class);
		System.out.println("ListaComuniCache map: " + map);
	}
	
}
