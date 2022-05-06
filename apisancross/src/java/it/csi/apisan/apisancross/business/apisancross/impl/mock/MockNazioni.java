/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross.impl.mock;

import java.util.ArrayList;
import java.util.List;

import it.csi.apisan.apisancross.dto.apisancross.Nazione;

public class MockNazioni {
	
	private static MockNazioni self;
	private List<Nazione> nazioni;

	public MockNazioni() {
		
		nazioni = new ArrayList<>();
		nazioni.add(newNazione("Z102", "Austria", "Europa",""));
		nazioni.add(newNazione("Z103", "Belgio", "Europa", "" ));
		nazioni.add(newNazione("Z107", "Danimarca", "Europa", ""));
		nazioni.add(newNazione("Z109", "Finlandia", "Europa",""));
		nazioni.add(newNazione("Z110", "Francia", "Europa",""));
		nazioni.add(newNazione("Z112", "Germania", "Europa",""));
		nazioni.add(newNazione("Z115", "Grecia", "Europa",""));
		nazioni.add(newNazione("Z116", "Irlanda", "Europa",""));
		nazioni.add(newNazione("Z120", "Lussemburgo", "Europa",""));
		nazioni.add(newNazione("Z126", "Paesi Bassi", "Europa",""));
		nazioni.add(newNazione("Z128", "Portogallo", "Europa",""));
		nazioni.add(newNazione("Z114", "Regno Unito", "Europa",""));
		nazioni.add(newNazione("Z131", "Spagna", "Europa",""));
		nazioni.add(newNazione("Z132", "Svezia", "Europa",""));
	}
	
	private Nazione newNazione(String codiceIstat, String desc, String continente, String territorio){
		Nazione n = new Nazione();
		n.setCodiceIstat(codiceIstat);
		n.setDesc(desc);
		//n.setContinente(continente);
		return n;
	}
	
	public static MockNazioni getInstance() {
		if(self==null) {
			self = new MockNazioni();
		}
		
		return self;
	}

	public List<Nazione> getNazioni() {
		return nazioni;
	}

	
	
	

}
