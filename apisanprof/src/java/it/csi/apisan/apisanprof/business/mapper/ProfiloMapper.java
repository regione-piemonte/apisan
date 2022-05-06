/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.business.mapper;

import it.csi.apisan.apisanprof.dto.apisanprof.Profilo;
import it.csi.aura.auraws.services.central.anagrafesanitaria.SoggettoAuraBody;


public class ProfiloMapper extends BaseMapper<Profilo, SoggettoAuraBody> {

	@Override
	public SoggettoAuraBody to(Profilo source) {
		// TODO Auto-generated method stub
		SoggettoAuraBody dest = new SoggettoAuraBody();
		dest.setIdAura(source.getIdAura());
		dest.setInfoAnag(new InfoAnagraficheMapper().to(source.getInfoAnag()));
		dest.setInfoSan(new InfoSanitarieMapper().to(source.getInfoSan()));
		return dest;
	}

	@Override
	public Profilo from(SoggettoAuraBody dest) {
		// TODO Auto-generated method stub
		Profilo source = new Profilo();
		source.setIdAura(dest.getIdAura());
		source.setInfoAnag(new InfoAnagraficheMapper().from(dest.getInfoAnag()));
		source.setInfoSan(new InfoSanitarieMapper().from(dest.getInfoSan()));
		return source;
	}

}
