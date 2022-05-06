/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanceliachia.business.apisanceliachia.mapper;

import java.math.BigDecimal;

public class BigDecimalDoubleMapper extends BaseMapper<BigDecimal, Double> {

	@Override
	public Double to(BigDecimal source) {
		if(source == null) {
			return null;
		}
		return new Double(source.doubleValue());
	}

	@Override
	public BigDecimal from(Double dest) {
		if(dest == null) {
			return null;
		}
		return BigDecimal.valueOf(dest);
		
	}

}
