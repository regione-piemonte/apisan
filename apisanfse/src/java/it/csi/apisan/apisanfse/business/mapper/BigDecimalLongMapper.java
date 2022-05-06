/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import java.math.BigDecimal;

public class BigDecimalLongMapper extends BaseMapper<BigDecimal,Long> {

	@Override
	public Long to(BigDecimal source) {
		if(source==null) {
			return null;
		}
			
		return source.longValue();
	}

	@Override
	public BigDecimal from(Long dest) {
		if(dest==null) {
			return null;
		}
		return new BigDecimal(dest);
	}



	
	

}
