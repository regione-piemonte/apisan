/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.exception;

import javax.ws.rs.core.MediaType;

import it.csi.apisan.apisancons.dto.apisancons.ErroreConsenso;

public class ErroreConsensoRESTException extends RESTException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1522352605066263535L;

	public ErroreConsensoRESTException(ErroreConsenso erroreCons, String message) {
		super(erroreCons.getStatus(), MediaType.APPLICATION_JSON_TYPE, erroreCons, message);
	}
	
	public ErroreConsensoRESTException(ErroreConsenso erroreCons) {
		super(erroreCons.getStatus(), MediaType.APPLICATION_JSON_TYPE, erroreCons, erroreCons.toString());
	}
}
