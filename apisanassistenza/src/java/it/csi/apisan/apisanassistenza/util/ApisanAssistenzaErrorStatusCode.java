/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.util;

import java.util.IllegalFormatException;

public enum ApisanAssistenzaErrorStatusCode {
	UTENTE_NON_AUTORIZZATO(401, "Utente non Autorizzato"), 
	CODICE_FISCALE_NON_VALIDO(400, "Codice Fiscale %s non valido"),
	CODICE_FISCALE_NON_CORRISPONDENTE(400, "Codice fiscale %s non corrispondente"),
	EMAIL_NON_VALIDA(400, "Email %s non valida"),
	IDENTIFICATIVO_RICHIESTA_NON_VALIDO(400, "Identificativo richiesta %s non valido"),
	RICHIESTA_NON_TROVATA(400, "La richiesta con identificativo %s e codice fiscale %s non è stata trovata"),
	PARAMETRO_NON_VALIDO(400, "Parametro %s non valido"), 
	CODICE_SERVIZIO_NON_VALIDO(400, "Codice servizio %s non valido"),
	ERRORE_SERVIZIO_INTERNO(400, "Errore chiamata servizio NEXTCRM: %s"),
	ERRORE_LETTURA_DOCUMENTO(400, "Errore lettura documento: %s"),
	BAD_REQUEST(400, "Parametro non presente o non valido"),
	ERRORE_GENERICO(500, "Errore generico %s"),
	OPERAZIONE_NON_IMPLEMENTATA(500, "La funzionalità non è disponibile");
	

	private int statusCode;
	private String descTemplate;

	ApisanAssistenzaErrorStatusCode(int statusCode, String desc) {
		this.statusCode = statusCode;
		this.descTemplate = desc;
	}

	public int getStatusCode() {
		return statusCode;
	}
	
	public String getMessage(Object... args) {
		try {
			return String.format(descTemplate, args);
		} catch (IllegalFormatException ife) {
			ife.printStackTrace();
			return descTemplate;
		}
	}
}
