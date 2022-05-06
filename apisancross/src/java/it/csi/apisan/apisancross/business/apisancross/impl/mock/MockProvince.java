/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross.impl.mock;

import java.util.ArrayList;
import java.util.List;

import it.csi.apisan.apisancross.dto.apisancross.Nazione;
import it.csi.apisan.apisancross.dto.apisancross.Provincia;
import it.csi.apisan.apisancross.dto.apisancross.Regione;

public class MockProvince {
	
	private static MockProvince self;
	private List<Provincia> province;

	public MockProvince() {
		province = new ArrayList<>();
		
		province.add(newProvincia("001", "TO", newRegione("001", "PIEMONTE", null)));
		province.add(newProvincia("006", "AL", newRegione("001", "PIEMONTE", null)));
		province.add(newProvincia("004", "CN", newRegione("001", "PIEMONTE", null)));
		province.add(newProvincia("005", "AT", newRegione("001", "PIEMONTE", null)));
		province.add(newProvincia("002", "VC", newRegione("001", "PIEMONTE", null)));
		province.add(newProvincia("003", "NO", newRegione("001", "PIEMONTE", null)));
		province.add(newProvincia("096", "BI", newRegione("001", "PIEMONTE", null)));
	}
	
	public static MockProvince getInstance() {
		if(self==null) {
			self = new MockProvince();
		}
		
		return self;
	}
	
	private Provincia newProvincia(String codiceIstat, String sigla, Regione regione) {
		Provincia p = new Provincia();
		p.setCodiceIstat(codiceIstat);
		p.setSigla(sigla);
		p.setRegione(regione);
		return p;
	}
	
	private Regione newRegione(String codiceIstat, String desc, Nazione nazione) {
		Regione r = new Regione();
		r.setCodiceIstat(codiceIstat);
		r.setDesc(desc);
		r.setNazione(nazione);
		return r;
	}

	public List<Provincia> getProvince() {
		return province;
	}
	
	

}
