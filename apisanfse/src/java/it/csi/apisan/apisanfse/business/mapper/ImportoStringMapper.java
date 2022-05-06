/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.Importo;

public class ImportoStringMapper extends BaseMapper<Importo, String> {
	
	@Override
	public String to(Importo source) {
		if(source==null) {
			return null;
		}
		return source.getValore().toString();
	}

	@Override
	public Importo from(String dest) {
		if(dest==null) {
			return null;
		}
		Importo i = new Importo();
		i.setValore(new BigDecimalStringMapper().from(dest));
		i.setValuta("EUR");
		return i;
	}
}
