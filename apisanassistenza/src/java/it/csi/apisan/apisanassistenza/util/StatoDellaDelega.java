/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.util;

public enum StatoDellaDelega {
	ATTIVA("ATTIVA"),
	INSCADENZA("IN SCADENZA"),
	REVOCATA("REVOCATA"),
	RIFIUTATA("RIFIUTATA"),
	SCADUTA("SCADUTA");
	
	
	private String stato;
	
	StatoDellaDelega(String stato){
		this.stato = stato;
	}
	
	@Override
	public String toString() {
		return stato;
	}
}
