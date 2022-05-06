/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import java.math.BigDecimal;

public class BigDecimalStringMapper extends BaseMapper<BigDecimal,String> {

	@Override
	public String to(BigDecimal source) {
		if(source==null) {
			return null;
		}
			
		return source.toString();
	}

	@Override
	public BigDecimal from(String dest) {
		if(dest==null) {
			return null;
		}
		return new BigDecimal(dest);
	}



	
	

}
