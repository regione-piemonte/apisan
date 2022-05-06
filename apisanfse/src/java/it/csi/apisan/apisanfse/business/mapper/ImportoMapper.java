/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import java.math.BigDecimal;

import it.csi.apisan.apisanfse.dto.apisanfse.Importo;

public class ImportoMapper extends BaseMapper<Importo, BigDecimal> {
	
	@Override
	public BigDecimal to(Importo source) {
		if(source==null) {
			return null;
		}
		return source.getValore();
	}

	@Override
	public Importo from(BigDecimal dest) {
		if(dest==null) {
			return null;
		}
		Importo i = new Importo();
		i.setValore(dest);
		i.setValuta("EUR");
		return i;
	}
}
