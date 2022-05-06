/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.core.GenericTypeResolver;

public abstract class FseEtichettaGenericaBaseMapper<ModelEtichetta, D> extends BaseMapper<ModelEtichetta, D> {
	
	protected Class<ModelEtichetta> sourceClass;
	protected Class<?> destClass;
	
	FseEtichettaGenericaBaseMapper(Class clazz){
		Class<?>[] resolveTypeArguments = GenericTypeResolver.resolveTypeArguments(this.getClass(), FseEtichettaGenericaBaseMapper.class);
		//ResolvableType type = ResolvableType.forClass(clazz).as(D);
		sourceClass = (Class<ModelEtichetta>) resolveTypeArguments[0];
		destClass = resolveTypeArguments[1];
	}

	
	public D to (ModelEtichetta source) {
	return null;	
	}
	
	public ModelEtichetta from (D dest) {
		if(dest == null)
			return null;
		BeanWrapper source = new BeanWrapperImpl(sourceClass);
		
		BeanWrapper destWrapper = new BeanWrapperImpl(dest);
		
		copyProperty(destWrapper, source,  "testo");
		
		copyProperty(destWrapper, source,  "idEtichetta", "id");
		
		return (ModelEtichetta) source.getWrappedInstance();
		
	}
	
	
	private void copyProperty(BeanWrapper sourceWrapper, BeanWrapper destWrapper, String name) {
		copyProperty(sourceWrapper, destWrapper, name, name);
	}
		
		
	private void copyProperty(BeanWrapper sourceWrapper, BeanWrapper destWrapper, String sourceName, String destName) {
		Object codice = (String)sourceWrapper.getPropertyValue(sourceName);
		destWrapper.setPropertyValue(destName, codice);
	}
}
