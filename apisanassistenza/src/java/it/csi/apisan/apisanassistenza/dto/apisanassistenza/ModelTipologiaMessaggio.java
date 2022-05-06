/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.dto.apisanassistenza;

public enum ModelTipologiaMessaggio {
	
	CITTADINO("cittadino"),
	OPERATORE("operatore"),
	AUTOMATICO("automatico");
	
	private String autore;
	
	ModelTipologiaMessaggio(String autore){
		this.autore = autore;
	}
	
	@Override
	public String toString() {
		return autore;
	}
}