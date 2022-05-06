/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.business.apisancons.mapper;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.core.GenericTypeResolver;

public abstract class GenericCodificaMapper<S, D extends it.csi.apisan.apisancons.integration.conspref.consprefbe.Codifica> extends BaseMapper<S, D> {
	protected Class<?> sourceClass;
	protected Class<?> destClass;
	
	
	public GenericCodificaMapper() {
		Class<?>[] resolveTypeArguments = GenericTypeResolver.resolveTypeArguments(this.getClass(), GenericCodificaMapper.class);
		sourceClass = resolveTypeArguments[0];
		destClass = resolveTypeArguments[1];
	}
	
	@Override
	public D to(S source) {
		if(source == null) {
			return null;
		}
		
		BeanWrapper sourceWrapper = new BeanWrapperImpl(source);
		BeanWrapper destWrapper = new BeanWrapperImpl(destClass);
		
		copyProperty(sourceWrapper, destWrapper, "codice");
		copyProperty(sourceWrapper, destWrapper, "descrizione");
		return (D) destWrapper.getWrappedInstance();
	}

	@Override
	public S from(D dest) {
		if(dest == null) {
			return null;
		}
		BeanWrapper sourceWrapper = new BeanWrapperImpl(sourceClass);
		BeanWrapper destWrapper = new BeanWrapperImpl(dest);
		
		copyProperty(destWrapper, sourceWrapper, "codice");
		copyProperty(destWrapper, sourceWrapper,  "descrizione");
		return (S) sourceWrapper.getWrappedInstance();		
		
	}
	
	private void copyProperty(BeanWrapper sourceWrapper, BeanWrapper destWrapper, String name) {
		copyProperty(sourceWrapper, destWrapper, name, name);
	}
		
		
	private void copyProperty(BeanWrapper sourceWrapper, BeanWrapper destWrapper, String sourceName, String destName) {
		String codice = (String)sourceWrapper.getPropertyValue(sourceName);
		destWrapper.setPropertyValue(destName, codice);
	}	

}
