/*******************************************************************************

* Copyright Regione Piemonte - 2023

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancod.exception;

import javax.ws.rs.core.MediaType;

import it.csi.apisan.apisancod.dto.apisancod.Errore;

public class ErroreRESTException extends RESTException {

	public ErroreRESTException(Errore errore, String message) {
		super(errore.getStatus(), MediaType.APPLICATION_JSON_TYPE, errore, message);
	}
	
	public ErroreRESTException(Errore errore) {
		super(errore.getStatus(), MediaType.APPLICATION_JSON_TYPE, errore, errore.toString());
	}
	
}
