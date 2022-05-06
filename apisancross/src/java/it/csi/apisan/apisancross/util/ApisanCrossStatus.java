/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.util;

import java.util.IllegalFormatException;

public enum ApisanCrossStatus {

	UTENTE_NON_AUTORIZZATO(401, "Utente non Autorizzato"), 
	CODICE_FISCALE_NON_VALIDO(400, "Codice Fiscale %s non valido"), 
	PARAMETRO_NON_VALIDO(400, "Parametro %s non valido");

	private int statusCode;
	private String descTemplate;

	ApisanCrossStatus(int statusCode, String desc) {
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

//	public RESTException getRestException(Object... args) {
//		String desc = String.format(descTemplate, args);
//		return new RESTException(this.statusCode, MediaType.TEXT_PLAIN_TYPE, desc, desc);
//	}
//
//	public RESTException getRestException(MediaType mediaType, Object entity, String message) {
//		return new RESTException(this.statusCode, mediaType, entity, message);
//	}
}
