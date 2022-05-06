/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanceliachia.business.apisanceliachia.mapper;

import javax.xml.bind.JAXBElement;

public abstract class BaseMapper<S,D> implements Mapper<S, D> {
	
	public <T> T getJaxbElement( JAXBElement<T> dest){
		if(dest == null) {
			return null;
		}
		return  dest.getValue();
	}

}
