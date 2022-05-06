/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.dto;

import it.csi.dma.dmaclbluc.Richiedente;

public class ModelRequestCommon {
	
	protected String citId;
	protected Long taccuinoId;
	protected Richiedente richiedenteTaccuino;
	
	public String getCitId() {
		return citId;
	}
	public void setCitId(String citId) {
		this.citId = citId;
	}
	public Long getTaccuinoId() {
		return taccuinoId;
	}
	public void setTaccuinoId(Long taccuinoId) {
		this.taccuinoId = taccuinoId;
	}
	public Richiedente getRichiedenteTaccuino() {
		return richiedenteTaccuino;
	}
	public void setRichiedenteTaccuino(Richiedente richiedenteTaccuino) {
		this.richiedenteTaccuino = richiedenteTaccuino;
	}
	
	
	

}
