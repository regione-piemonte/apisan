/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.mapper;

public class BooleanStringMapper extends BaseMapper<Boolean, String> {

	@Override
	public String to(Boolean source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean from(String dest) {
		if(dest == null) {
			return null;
		}
		return new Boolean(dest.equalsIgnoreCase("SI"));
		
	}

}
