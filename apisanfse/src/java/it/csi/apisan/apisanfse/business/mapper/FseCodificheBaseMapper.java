/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import java.util.List;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.core.GenericTypeResolver;


public abstract class FseCodificheBaseMapper<S, D extends it.csi.apisan.apisanfse.integration.dma.Codifica> extends BaseMapper<S, D > {
	
	protected List<it.csi.apisan.apisanfse.integration.dma.Codifica> codifiche;
	protected Class<?> sourceClass;
	protected Class<?> destClass;

	public FseCodificheBaseMapper(List<it.csi.apisan.apisanfse.integration.dma.Codifica> codifiche) {
		this.codifiche = codifiche;
		Class<?>[] resolveTypeArguments = GenericTypeResolver.resolveTypeArguments(this.getClass(), FseCodificheBaseMapper.class);
		sourceClass = resolveTypeArguments[0];
		destClass = resolveTypeArguments[1];
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public D to(S source) {
		if(source==null) {
			return null;
		}
		
		BeanWrapper sourceWrapper = new BeanWrapperImpl(source);
		BeanWrapper destWrapper = new BeanWrapperImpl(destClass);
		
		copyProperty(sourceWrapper, destWrapper, "codice");
		copyProperty(sourceWrapper, destWrapper, "descrizione");
		copyProperty(sourceWrapper, destWrapper, "riferimento");
		
		return (D) destWrapper.getWrappedInstance();
	}


	
	@SuppressWarnings("unchecked")
	@Override
	public S from(D dest) {
		if(dest==null) {
			return null;
		}
		BeanWrapper sourceWrapper = new BeanWrapperImpl(sourceClass);
		it.csi.apisan.apisanfse.integration.dma.Codifica codifica = getCodifica(dest.getRiferimento());
		if(codifica!=null) {
			sourceWrapper.setPropertyValue("codice", codifica.getCodice());
			sourceWrapper.setPropertyValue("descrizione", codifica.getDescrizione());
		}else {
			sourceWrapper.setPropertyValue("codice", dest.getCodice());
			sourceWrapper.setPropertyValue("descrizione", dest.getDescrizione());
		}
		sourceWrapper.setPropertyValue("riferimento", dest.getRiferimento());
		
		return (S) sourceWrapper.getWrappedInstance();
	}
	
	
	protected it.csi.apisan.apisanfse.integration.dma.Codifica getCodifica(String riferimento) {
		if(codifiche==null) {
			return null;
		}
		
		return codifiche.stream().filter(c -> c.getRiferimento().equalsIgnoreCase(riferimento) ).findFirst( ).orElse(null);
	}
	
	
	private void copyProperty(BeanWrapper sourceWrapper, BeanWrapper destWrapper, String name) {
		copyProperty(sourceWrapper, destWrapper, name, name);
	}
		
		
	private void copyProperty(BeanWrapper sourceWrapper, BeanWrapper destWrapper, String sourceName, String destName) {
		String codice = (String)sourceWrapper.getPropertyValue(sourceName);
		destWrapper.setPropertyValue(destName, codice);
	}
	
}
