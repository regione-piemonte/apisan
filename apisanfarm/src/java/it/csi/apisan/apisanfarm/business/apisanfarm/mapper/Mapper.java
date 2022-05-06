/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.business.apisanfarm.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBElement;

public interface Mapper<S,D> {
	public D to(S source);
	
	public S from(D dest);
	
	
	default public List<D> toList(List<S> list){
		if(list==null) {
			return new ArrayList<>();
		}
		return list.stream().map(s -> to(s)).collect(Collectors.toList());
	}
	
	default public List<S> fromList(List<D> list){
		if(list==null) {
			return new ArrayList<>();
		}
		return list.stream().map(s -> from(s)).collect(Collectors.toList());
	}
	default public <T> T getJaxbElement( JAXBElement<T> dest){
		if(dest == null) {
			return null;
		}
		return  dest.getValue();
	}
}
