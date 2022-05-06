/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.mapper;

import it.csi.apisan.apisanpag.dto.apisanpag.PraticaDaRimborsare;

public class PraticadaRimborsareMapper extends BaseMapper<PraticaDaRimborsare, it.csi.apisan.apisanpag.dto.ptw.PraticaDaRimborsare> {

	@Override
	public it.csi.apisan.apisanpag.dto.ptw.PraticaDaRimborsare to(PraticaDaRimborsare source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanpag.dto.ptw.PraticaDaRimborsare dest = new it.csi.apisan.apisanpag.dto.ptw.PraticaDaRimborsare();
		dest.setCodiceFiscale(source.getCodiceFiscale());
		dest.setNumeroPraticaRegionale(source.getNumeroPraticaRegionale());
		return dest;
	}

	@Override
	public PraticaDaRimborsare from(it.csi.apisan.apisanpag.dto.ptw.PraticaDaRimborsare dest) {
		if(dest == null) {
			return null;
		}
		PraticaDaRimborsare source = new PraticaDaRimborsare();
		source.setCodiceFiscale(dest.getCodiceFiscale());
		source.setNumeroPraticaRegionale(dest.getNumeroPraticaRegionale());
		return source;
	}

}
