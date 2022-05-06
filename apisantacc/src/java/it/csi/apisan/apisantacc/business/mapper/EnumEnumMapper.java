/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.mapper;

public class EnumEnumMapper<T extends Enum<T>,S extends Enum<S>> extends BaseMapper<T,S>{
	
	private Class<T> t;
	private Class<S> s;
	
	public EnumEnumMapper(Class<T> t,Class<S> s) {
		this.t=t;
		this.s=s;
	}
		
	@Override
	public S to(T source) {
		if(source==null) {
			return null;
		}
		return Enum.valueOf(s,source.name());	
	}

	@Override
	public T from(S dest) {	
		if(dest==null) {
			return null;	
		}
		return Enum.valueOf(t,dest.name());		
	}
}
