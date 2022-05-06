/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.mapper;

import it.csi.apisan.apisanpag.dto.apisanpag.PraticaInCarrello;

public class PraticaInCarrelloMapper extends BaseMapper<PraticaInCarrello, it.csi.apisan.apisanpag.dto.ptw.PraticaInCarrello> {

	@Override
	public it.csi.apisan.apisanpag.dto.ptw.PraticaInCarrello to(PraticaInCarrello source) {

		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanpag.dto.ptw.PraticaInCarrello dest = new it.csi.apisan.apisanpag.dto.ptw.PraticaInCarrello();
		dest.setCodiceFiscale(source.getCodiceFiscale());
		dest.setNumeroPraticaRegionale(source.getNumeroPraticaRegionale());
		dest.setOpposizione730(source.getOpposizione730());
		
		return dest;
	}

	@Override
	public PraticaInCarrello from(it.csi.apisan.apisanpag.dto.ptw.PraticaInCarrello dest) {
		if(dest == null) {
			return null;
		}
		PraticaInCarrello source = new PraticaInCarrello();
		source.setCodiceFiscale(dest.getCodiceFiscale());
		source.setNumeroPraticaRegionale(dest.getNumeroPraticaRegionale());
		source.setOpposizione730(dest.getOpposizione730());
		
		return source;
	}

}
