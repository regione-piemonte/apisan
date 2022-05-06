/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.util;

public enum GiornoSettimana {
	LUNEDI("Lunedi"),
	MARTEDI("Martedi"),
	MERCOLEDI("Mercoledi"),
	GIOVEDI("Giovedi"),
	VENERDI("Venerdi"),
	SABATO("Sabato"),
	DOMENICA("Domenica");
	
	private String value;
	
	GiornoSettimana(String giorno){
		this.value = giorno;
	}
	
	public String value() {
		return this.value;
	}
}
