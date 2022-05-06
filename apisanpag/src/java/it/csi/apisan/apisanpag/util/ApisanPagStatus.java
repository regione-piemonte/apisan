/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.util;

import java.util.IllegalFormatException;

public enum ApisanPagStatus {
	UTENTE_NON_AUTORIZZATO(401, "Utente non Autorizzato"), 
	CODICE_FISCALE_NON_VALIDO(421, "Codice Fiscale %s non valido");

	private int statusCode;
	private String descTemplate;

	ApisanPagStatus(int statusCode, String desc) {
		this.statusCode = statusCode;
		this.descTemplate = desc;
	}

	public int getStatusCode() {
		return statusCode;
	}

//	public RESTException getRestEception(Object... args) {
//		String desc = String.format(descTemplate, args);
//		return new RESTException(this.statusCode, MediaType.TEXT_PLAIN_TYPE, desc);
//	}
//
//	public RESTException getRestEception(MediaType mediaType, Object entity) {
//		return new RESTException(this.statusCode, mediaType, entity);
//	}
	
	public String getMessage(Object... args) {
		try {
			return String.format(descTemplate, args);
		} catch (IllegalFormatException ife) {
			ife.printStackTrace();
			return descTemplate;
		}
	}
}
