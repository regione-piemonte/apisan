/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.util;

public enum TipoOscuramento {
	
	DOCPER ("DOCUMENTO_PERSONALE"),
	DOC ("DOCUMENTO"),
	ESE ("ESENZIONI"),
	SCR ("EVENTO_SCREENING");
	
	
	private String tipo;
	
	TipoOscuramento(String tipo){
		this.tipo = tipo;
	}
	
	public String toString() {
		return tipo;
	}
}
