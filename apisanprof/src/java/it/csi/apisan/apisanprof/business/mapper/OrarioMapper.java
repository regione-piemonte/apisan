/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.business.mapper;

import it.csi.apisan.apisanprof.dto.apisanprof.Orario;

public class OrarioMapper extends BaseMapper<Orario, it.csi.def.opessanws.opessan.FasceOrarie.Orario> {

	@Override
	public it.csi.def.opessanws.opessan.FasceOrarie.Orario to(Orario source) {
		// TODO Auto-generated method stub
		it.csi.def.opessanws.opessan.FasceOrarie.Orario dest = new it.csi.def.opessanws.opessan.FasceOrarie.Orario();
		dest.setOrarioFine(new DateXMLGregorianCalendarMapper().to(source.getOrarioFine()));
		dest.setOrarioInizio(new DateXMLGregorianCalendarMapper().to(source.getOrarioInizio()));
		return dest;
	}

	@Override
	public Orario from(it.csi.def.opessanws.opessan.FasceOrarie.Orario dest) {
		// TODO Auto-generated method stub
		Orario source = new Orario();
		source.setOrarioFine(new DateXMLGregorianCalendarMapper().from(dest.getOrarioFine()));
		source.setOrarioInizio(new DateXMLGregorianCalendarMapper().from(dest.getOrarioInizio()));
		
		return source;
	}

}
