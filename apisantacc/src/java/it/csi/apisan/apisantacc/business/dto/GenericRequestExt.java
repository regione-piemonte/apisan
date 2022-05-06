/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.dto;

import it.csi.apisan.apisantacc.business.apisantacc.impl.base.TaccTaccuinoRESTBaseServiceExt;
import it.csi.dma.dmaclbluc.RequestCommon;
import it.csi.dma.dmaclbluc.Richiedente;

public class GenericRequestExt<T extends RequestCommon> {
	
	T request;
	
	public GenericRequestExt(T request,TaccTaccuinoRESTBaseServiceExt service) {
		this.request=request;
		setCommonParameters(service);
	}

	private void setCommonParameters(TaccTaccuinoRESTBaseServiceExt service) {
		this.setPaziente(service.getCitId()).setTaccuino(service.getTaccuinoId()).setRichiedente(service.newRichiedenteTaccuino());
	}
	
	public GenericRequestExt<T> setRichiedente(Richiedente value) {
		this.request.setRichiedente(value);		
		return this;
	}
	
	public GenericRequestExt<T> setTaccuino(Long value) {
		this.request.setTaccuino(value);
		return this;
	}
	
	public GenericRequestExt<T>  setPaziente(String value) {
		this.request.setPaziente(value);
		return this;
	}
	
	public T getRequest() {
		return request;
	}

}
