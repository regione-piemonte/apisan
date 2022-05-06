/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanceliachia.util;

public enum StatoDelega {
	ATTIVA("ATTIVA"),
	INSCADENZA("IN SCADENZA"),
	REVOCATA("REVOCATA"),
	RIFIUTATA("RIFIUTATA"),
	SCADUTA("SCADUTA");
	
	
	private String stato;
	
	StatoDelega(String stato){
		this.stato = stato;
	}
	
	public String toString() {
		return stato;
	}
}