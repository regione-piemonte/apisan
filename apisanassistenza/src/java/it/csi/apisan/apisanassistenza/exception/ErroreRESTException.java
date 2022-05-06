/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.exception;

import javax.ws.rs.core.MediaType;

import it.csi.apisan.apisanassistenza.dto.apisanassistenza.Errore;

public class ErroreRESTException extends RESTException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ErroreRESTException(Errore errore, String message) {
		super(errore.getStatus(), MediaType.APPLICATION_JSON_TYPE, errore, message);
	}
	
	public ErroreRESTException(Errore errore) {
		super(errore.getStatus(), MediaType.APPLICATION_JSON_TYPE, errore, errore.toString());
	}
	
}
