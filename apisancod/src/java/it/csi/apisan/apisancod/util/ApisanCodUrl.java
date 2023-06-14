/*******************************************************************************

* Copyright Regione Piemonte - 2023

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancod.util;

import java.util.IllegalFormatException;

public enum ApisanCodUrl {
	ABILITAZIONE("cittadini/%s/abilitazione?cf_medico=%s"),
	INFO_MEDICO("cittadini/%s/info-medico"),
	NUOVA_CONVERSAZIONE("cittadini/%s/conversazioni"),
	LISTA_CONVERSAZIONI("cittadini/%s/conversazioni?"),
	LISTA_MESSAGGI("cittadini/%s/conversazioni/%s/messaggi?"),
	NUOVO_MESSAGGIO("cittadini/%s/conversazioni/%s/messaggi"),
	MODIFICA_MESSAGGIO("cittadini/%s/conversazioni/%s/messaggi/%s"),
	LETTURA_MESSAGGIO("cittadini/%s/conversazioni/%s/messaggi/%s/letto");
	
	private String relativeUrl;
	
	ApisanCodUrl(String url){
		this.relativeUrl = url;
	}
	
	public String getUrlClient(Object... args) {
		try {
			return String.format(relativeUrl, args);
		} catch (IllegalFormatException e) {
			//se si usa bene non deve capitare
			e.printStackTrace();
			return relativeUrl;
		}
	}
}
