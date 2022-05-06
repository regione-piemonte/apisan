/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.mapper;

public class StringEnumMapper<T extends Enum<T>> extends BaseMapper<T,String>{
	
	private Class<T> e;
	
	public StringEnumMapper(Class<T> e) {
		this.e=e;
	}
		
	@Override
	public String to(T source) {
		if(source==null) {
			return null;
		}
		return source.name();
	}

	@Override
	public T from(String dest) {	
		if(dest==null) {
			return null;	
		}
		return Enum.valueOf(e,dest);		
	}
}
