/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.business.mapper;

import java.util.Iterator;

import it.csi.apisan.apisanprof.dto.apisanprof.GiornoApertura;
import it.csi.apisan.apisanprof.dto.apisanprof.Orario;
import it.csi.def.opessanws.opessan.FasceOrarie;

public class GiornoAperturaMapper extends BaseMapper<GiornoApertura, it.csi.def.opessanws.opessan.GiornoApertura> {

	@Override
	public it.csi.def.opessanws.opessan.GiornoApertura to(GiornoApertura source) {
		it.csi.def.opessanws.opessan.GiornoApertura dest = new it.csi.def.opessanws.opessan.GiornoApertura();
		//dest.setOrari(value);
		FasceOrarie fascia = new FasceOrarie();
		
		for(Iterator<Orario> iter = source.getFasceOrarie().iterator(); iter.hasNext();) {
			fascia.getOrario().add(new OrarioMapper().to(iter.next()));
		}
		dest.setOrari(fascia);
		dest.setGiorno(source.getGiorno());
		return dest;
	}

	@Override
	public GiornoApertura from(it.csi.def.opessanws.opessan.GiornoApertura dest) {
		// TODO Auto-generated method stub
		GiornoApertura source = new GiornoApertura();
		source.setGiorno(dest.getGiorno());
		
		source.setFasceOrarie(new OrarioMapper().fromList(dest.getOrari().getOrario()));
		return source;
	}

}
