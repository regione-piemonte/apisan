/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.Giudizio;
import it.csi.apisan.apisanfse.integration.screening.dma.Codifica;

public class GiudizioCodificaScreeningMapper<D extends Codifica> extends BaseMapper<Giudizio , D> {
		
	private D d;
	
	public GiudizioCodificaScreeningMapper(D d) {		
		this.d=d;
	}	
	 

	@Override
	public D to(Giudizio source) {	
		if(source == null)
			return null;
		d.setCodice(source.getCodice());
		d.setDescrizione(source.getDescrizione());		
		return d;
	}

	@Override
	public Giudizio from(D dest) {	
		if(dest == null)
			return null;
		Giudizio giudizio = new Giudizio();
		giudizio.setCodice(dest.getCodice());
		giudizio.setDescrizione(dest.getDescrizione());
		return giudizio;
	}
}
