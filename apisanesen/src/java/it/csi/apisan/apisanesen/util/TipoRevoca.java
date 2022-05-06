/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.util;

public enum TipoRevoca {
	
	AUTOCERTIFICATA("AUTOCERTIFICATA"),
	CERTIFICATA("CERTIFICATA"),
	AUTOCERTIFICATA_SISTEMA_ESTERNO("CERTIFICATA SISTEMA ESTERNO");
	
	private String tiporevoca;
	
	
	TipoRevoca(String tipo){
		this.tiporevoca = tipo;
	}
	
	public String getTipoRevoca() {
		return this.tiporevoca;
	}
}
