/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

public class IntegerLongMapper extends BaseMapper<Integer,Long> {

	@Override
	public Long to(Integer source) {
		if(source==null) {
			return null;
		}
			
		return source.longValue();
	}

	@Override
	public Integer from(Long dest) {
		if(dest==null) {
			return null;
		}
		return dest.intValue();
	}



	
	

}
