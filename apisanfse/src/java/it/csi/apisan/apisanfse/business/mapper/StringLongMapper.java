/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

public class StringLongMapper extends BaseMapper<String, Long >{

	@Override
	public Long to(String source) {
		if(source == null) {
			return null;
		}
		return Long.parseLong(source);
	}

	@Override
	public String from(Long dest) {
		if(dest == null) {
			return null;
		}
		return dest.toString();
	}

}
