/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross.impl.mock;

import java.util.ArrayList;
import java.util.List;

import it.csi.apisan.apisancross.dto.apisancross.Servizio;

public class MockServizi {
	
	private static MockServizi self;
	private List<Servizio> servizi;

	public MockServizi() {
		servizi = new ArrayList<>();

		Servizio rol = new Servizio();
		rol.setCodiceServizio("ROL");
		rol.setDescrizione("Ritiro referti online");
		rol.setDelegabile(true);
		rol.setObbligatorioArruolamento(true);
		rol.setArruolabile(true);
		
		Servizio ptw = new Servizio();
		ptw.setCodiceServizio("PTW");
		ptw.setDescrizione("Pagamento ticket online");
		
		ptw.setDelegabile(false);
		ptw.setObbligatorioArruolamento(false);
		ptw.setArruolabile(false);
		
		Servizio esenRed = new Servizio();
		esenRed.setCodiceServizio("ESENRED");
		esenRed.setDescrizione("Esenzioni per reddito");
		
		esenRed.setDelegabile(true);
		esenRed.setObbligatorioArruolamento(true);
		esenRed.setArruolabile(false);
		
		servizi.add(esenRed);
		servizi.add(ptw);
		servizi.add(rol);
		
	}
	
	public static MockServizi getInstance() {
		if(self==null) {
			self = new MockServizi();
		}
		
		return self;
	}

	public List<Servizio> getServizi() {
		return servizi;
	}

	
	
	

}
