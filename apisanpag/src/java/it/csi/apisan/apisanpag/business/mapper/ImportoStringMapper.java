/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.mapper;

import java.math.BigDecimal;

import it.csi.apisan.apisanpag.dto.apisanpag.Importo;

public class ImportoStringMapper extends BaseMapper<Importo, String> {

	@Override
	public String to(Importo source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Importo from(String dest) {
		if(dest == null) {
			return null;
		}
		Importo source = new Importo();
		source.setValore(new BigDecimal(dest));
		source.setValuta("EUR");
		return source;
	}

}
