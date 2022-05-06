/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.business.mapper;

import it.csi.apisan.apisanprof.dto.apisanprof.DatiSecondari;



public class DatiSecondariMapper extends BaseMapper<DatiSecondari, it.csi.aura.auraws.services.central.anagrafesanitaria.DatiSecondari> {

	@Override
	public it.csi.aura.auraws.services.central.anagrafesanitaria.DatiSecondari to(DatiSecondari source) {
		// TODO Auto-generated method stub
		it.csi.aura.auraws.services.central.anagrafesanitaria.DatiSecondari dest = new it.csi.aura.auraws.services.central.anagrafesanitaria.DatiSecondari();
		dest.setCap(source.getCap());
		dest.setCodComune(source.getCodComune());
		dest.setCodStato(source.getCodStato());
		dest.setDataFine(new DateXMLGregorianCalendarMapper().to(source.getDataFine()));
		dest.setDataInizio(new DateXMLGregorianCalendarMapper().to(source.getDataInizio() ));
		dest.setDescComune(source.getDescComune());
		dest.setDescStato(source.getDescStato());
		dest.setIndirizzo(source.getIndirizzo());
		dest.setNumCivico(source.getNumCivico());
		dest.setStatoResidenza(source.getStatoResidenza());
		dest.setTelefono(source.getTelefono());
		return dest;
	}

	@Override
	public DatiSecondari from(it.csi.aura.auraws.services.central.anagrafesanitaria.DatiSecondari dest) {
		// TODO Auto-generated method stub
		DatiSecondari source = new DatiSecondari();
		source.setCap(dest.getCap());
		source.setCodComune(dest.getCodComune());
		source.setCodStato(dest.getCodStato());
		source.setDataFine(new DateXMLGregorianCalendarMapper().from(dest.getDataFine()));
		source.setDataInizio(new DateXMLGregorianCalendarMapper().from(dest.getDataInizio() ));
		source.setDescComune(dest.getDescComune());
		source.setDescStato(dest.getDescStato());
		source.setIndirizzo(dest.getIndirizzo());
		source.setNumCivico(dest.getNumCivico());
		source.setStatoResidenza(dest.getStatoResidenza());
		source.setTelefono(dest.getTelefono());
		return source;
	}
	
}
