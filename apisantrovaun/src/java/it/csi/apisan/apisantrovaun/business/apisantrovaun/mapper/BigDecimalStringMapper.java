/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantrovaun.business.apisantrovaun.mapper;

import java.math.BigDecimal;

public class BigDecimalStringMapper extends BaseMapper<BigDecimal, String> {

	@Override
	public String to(BigDecimal source) {
		if(source == null) {
			return null;
		}
		String dest = new String(source.toString());
		return dest;
	}

	@Override
	public BigDecimal from(String dest) {
		if(dest == null) {
			return null;
		}
		BigDecimal source = new BigDecimal(dest);
		return source;
	}

}
