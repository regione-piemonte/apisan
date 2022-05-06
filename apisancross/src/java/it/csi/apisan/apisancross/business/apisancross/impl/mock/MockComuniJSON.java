/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross.impl.mock;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import it.csi.apisan.apisancross.business.apisancross.impl.service.ListaComuniFactory;
import it.csi.apisan.apisancross.dto.apisancross.Comune;

public class MockComuniJSON {
	
	private static MockComuniJSON self;
	private List<Comune> comuni;
	
	
	private MockComuniJSON() {
		comuni = new ArrayList<>();
		initComuniFromFile();
	}
	
	private void initComuniFromFile() {
		String resourceName = "it/csi/apisan/apisancross/business/apisancross/impl/mock/comuni.json";
		
		try (InputStream is = this.getClass().getClassLoader().getResourceAsStream(resourceName)) {
			
			this.comuni = ListaComuniFactory.of(is).getListaComuni();
			
		} catch (IOException e) {
			e.printStackTrace();
			throw new IllegalArgumentException("Impossibile inizializzare i comuni dal file: "+ resourceName);
		}
		
	}

	public static MockComuniJSON getInstance() {
		if(self==null) {
			self = new MockComuniJSON();
		}
		
		return self;
	}

	public List<Comune> getComuni() {
		return comuni;
	}
	
	public static void main(String[] args) {
		MockComuniJSON.getInstance().getComuni().stream().forEach(System.out::println);
	}

}
