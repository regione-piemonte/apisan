/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.mapper;

import it.csi.apisan.apisanpag.dto.apisanpag.Iuvmod1;

public class Iuvmod1Mapper extends BaseMapper<Iuvmod1, it.csi.apisan.apisanpag.dto.ptw.Iuvmod1> {

	@Override
	public it.csi.apisan.apisanpag.dto.ptw.Iuvmod1 to(Iuvmod1 source) {
		if(source==null) {
			return null;
		}
		it.csi.apisan.apisanpag.dto.ptw.Iuvmod1 i = new it.csi.apisan.apisanpag.dto.ptw.Iuvmod1();
		i.setDataAssegnazione(new DateStringMapper().to(source.getDataAssegnazione()));
		i.setIuv(source.getIuv());
		
		return i;
	}

	@Override
	public Iuvmod1 from(it.csi.apisan.apisanpag.dto.ptw.Iuvmod1 dest) {
		if(dest==null) {
			return null;
		}
		Iuvmod1 i = new Iuvmod1();
		i.setDataAssegnazione(new DateStringMapper().from(dest.getDataAssegnazione()));
		i.setIuv(dest.getIuv());

		return i;
	}

}
