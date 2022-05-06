/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.util;

public enum TipoDelega {
	CONGIUNTA("CONGIUNTA");
	
	private String tipo;
	
	TipoDelega(String tipo){
		this.tipo = tipo;
	}
	
	public String toString() {
		return tipo;
	}
}
