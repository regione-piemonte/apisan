/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.mapper;

import it.csi.apisan.apisanpag.dto.apisanpag.Tesoriere;

public class TesoriereConverter extends BaseMapper<Tesoriere, it.csi.apisan.apisanpag.dto.ptw.Tesoriere> {

	@Override
	public it.csi.apisan.apisanpag.dto.ptw.Tesoriere to(Tesoriere source) {
		if(source==null) {
			return null;
		}
		it.csi.apisan.apisanpag.dto.ptw.Tesoriere t = new it.csi.apisan.apisanpag.dto.ptw.Tesoriere();
		t.setDescrizione(source.getDescrizione());
		t.setId(source.getId());
		t.setUrlLogo(source.getUrlLogo());
		return t;
	}

	@Override
	public Tesoriere from(it.csi.apisan.apisanpag.dto.ptw.Tesoriere dest) {
		if(dest==null) {
			return null;
		}
		Tesoriere t = new Tesoriere();
		t.setDescrizione(dest.getDescrizione());
		t.setId(dest.getId());
		t.setUrlLogo(dest.getUrlLogo());
		return t;
	}

}
