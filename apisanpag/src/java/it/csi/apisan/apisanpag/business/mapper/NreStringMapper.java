/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.mapper;

import it.csi.apisan.apisanpag.dto.apisanpag.Nre;

public class NreStringMapper extends BaseMapper<Nre, String> {

	@Override
	public String to(Nre source) {
		if(source == null) {
			return null;
		}
		String dest = source.getId();
		return dest;
	}

	@Override
	public Nre from(String dest) {
		if(dest == null) {
			return null;
		}
		Nre source = new Nre();
		source.setId(dest);
		return source;
	}

}
