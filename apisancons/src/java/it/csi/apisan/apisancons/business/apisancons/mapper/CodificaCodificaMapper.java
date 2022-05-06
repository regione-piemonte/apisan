/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.business.apisancons.mapper;

import it.csi.apisan.apisancons.dto.apisancons.Codifica;

public class CodificaCodificaMapper extends BaseMapper<Codifica, it.csi.apisan.apisancons.integration.conspref.consprefbe.Codifica> {

	@Override
	public it.csi.apisan.apisancons.integration.conspref.consprefbe.Codifica to(Codifica source) {
		it.csi.apisan.apisancons.integration.conspref.consprefbe.Codifica dest = new it.csi.apisan.apisancons.integration.conspref.consprefbe.Codifica();
		
		dest.setCodice(source.getCodice());
		dest.setDescrizione(source.getDescrizione());
		
		return dest;
	}

	@Override
	public Codifica from(it.csi.apisan.apisancons.integration.conspref.consprefbe.Codifica dest) {
		Codifica source = new Codifica();
		source.setCodice(dest.getCodice());
		source.setDescrizione(dest.getDescrizione());
		return source;
	}
	

}
