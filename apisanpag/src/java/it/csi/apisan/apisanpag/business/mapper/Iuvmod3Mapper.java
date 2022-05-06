/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.mapper;

import it.csi.apisan.apisanpag.dto.apisanpag.Iuvmod3;

public class Iuvmod3Mapper extends BaseMapper<Iuvmod3, it.csi.apisan.apisanpag.dto.ptw.Iuvmod3> {

	@Override
	public it.csi.apisan.apisanpag.dto.ptw.Iuvmod3 to(Iuvmod3 source) {
		if(source==null) {
			return null;
		}
		it.csi.apisan.apisanpag.dto.ptw.Iuvmod3 i = new it.csi.apisan.apisanpag.dto.ptw.Iuvmod3();
		i.setDataAssegnazione(new DateStringMapper().to(source.getDataAssegnazione()));
		i.setIuv(source.getIuv());
		i.setApplicationCode(source.getApplicationCode());
		i.setAuxDigit(source.getAuxDigit());
		
		return i;
	}

	@Override
	public Iuvmod3 from(it.csi.apisan.apisanpag.dto.ptw.Iuvmod3 dest) {
		if(dest==null) {
			return null;
		}
		Iuvmod3 i = new Iuvmod3();
		i.setDataAssegnazione(new DateStringMapper().from(dest.getDataAssegnazione()));
		i.setIuv(dest.getIuv());
		i.setApplicationCode(dest.getApplicationCode());
		i.setAuxDigit(dest.getAuxDigit());

		return i;
	}

}
