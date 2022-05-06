/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.business.mapper;

import it.csi.apisan.apisanesen.dto.apisanesen.Luogo;

public class LuogoLuogoMapper extends BaseMapper<Luogo, it.csi.apisan.apisanesen.dto.red.Luogo> {

	@Override
	public it.csi.apisan.apisanesen.dto.red.Luogo to(Luogo source) {
		it.csi.apisan.apisanesen.dto.red.Luogo dest = new it.csi.apisan.apisanesen.dto.red.Luogo();
		dest.setCodice(source.getCodice());
		dest.setDescrizione(source.getDescrizione());
		return dest;
	}

	@Override
	public Luogo from(it.csi.apisan.apisanesen.dto.red.Luogo dest) {
		// TODO Auto-generated method stub
		Luogo source = new Luogo();
		source.setCodice(dest.getCodice());
		source.setDescrizione(dest.getDescrizione());
		return source;
	}
	

}
