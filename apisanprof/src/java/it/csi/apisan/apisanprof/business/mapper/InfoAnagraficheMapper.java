/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.business.mapper;

import it.csi.apisan.apisanprof.dto.apisanprof.InfoAnagrafiche;



public class InfoAnagraficheMapper extends BaseMapper<it.csi.apisan.apisanprof.dto.apisanprof.InfoAnagrafiche, it.csi.aura.auraws.services.central.anagrafesanitaria.InfoAnagrafiche> {

	@Override
	public it.csi.aura.auraws.services.central.anagrafesanitaria.InfoAnagrafiche to(InfoAnagrafiche source) {
		it.csi.aura.auraws.services.central.anagrafesanitaria.InfoAnagrafiche dest = new it.csi.aura.auraws.services.central.anagrafesanitaria.InfoAnagrafiche();
		dest.setDatiPrimari(new DatiPrimariMapper().to(source.getDatiPrimari()));
		dest.setDomicilio(new DatiSecondariMapper().to(source.getDomicilio()) );
		dest.setResidenza(new DatiSecondariMapper().to(source.getResidenza() ));
		return dest;
	}

	@Override
	public it.csi.apisan.apisanprof.dto.apisanprof.InfoAnagrafiche from(it.csi.aura.auraws.services.central.anagrafesanitaria.InfoAnagrafiche dest) {
		InfoAnagrafiche source = new InfoAnagrafiche();
		source.setDatiPrimari(new  DatiPrimariMapper().from(dest.getDatiPrimari()));
		source.setDomicilio(new DatiSecondariMapper().from(dest.getDomicilio()));
		source.setResidenza(new DatiSecondariMapper().from(dest.getResidenza()));
		
		return source;
	}

}
