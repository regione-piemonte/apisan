/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross.impl.mock;

import java.util.ArrayList;
import java.util.List;

import it.csi.apisan.apisancross.dto.apisancross.Nazione;
import it.csi.apisan.apisancross.dto.apisancross.Regione;

public class MockRegioni {
	
	private static MockRegioni self;
	private List<Regione> regioni;

	public MockRegioni() {
		
		regioni = new ArrayList<>();

		regioni.add(newRegione("001", "PIEMONTE", null));
		regioni.add(newRegione("003", "LOMBARDIA", null));
	}
	
	public static MockRegioni getInstance() {
		if(self==null) {
			self = new MockRegioni();
		}
		
		return self;
	}
	
	private Regione newRegione(String codiceIstat, String desc, Nazione nazione) {
		Regione r = new Regione();
		r.setCodiceIstat(codiceIstat);
		r.setDesc(desc);
		r.setNazione(nazione);
		return r;
	}

	public List<Regione> getRegioni() {
		return regioni;
	}

	
	
	

}
