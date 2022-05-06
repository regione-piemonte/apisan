/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.mapper;

public class IntegerStringMapper extends BaseMapper<String,Integer>{

	@Override
	public Integer to(String source) {
		if(source==null) {
			return null;
		}
		return Integer.parseInt(source);
	}

	@Override
	public String from(Integer dest) {
		if(dest==null) {
			return null;
		}
		return dest.toString();
	}

}
