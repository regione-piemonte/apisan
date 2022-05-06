/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

import it.csi.apisan.apisanprof.dto.apisanprof.Errore;
import it.csi.apisan.apisanprof.util.ApisanProfStatus;

public class RestErroreException extends RESTException {
	
	private static final long serialVersionUID = 6008954693985604493L;

	public RestErroreException(Errore err, String message) {
		super(err.getStatus(), MediaType.APPLICATION_JSON_TYPE, err, message);
	}

	public RestErroreException(int status, String code, String message) {
		this(new ErroreBuilder(status, code).getErrore(), message);
	}

	public RestErroreException(ApisanProfStatus status, String code, String message) {
		this(new ErroreBuilder(status.getStatus(), code).getErrore(), message);
	}

	public RestErroreException(Status status, String code, String message) {
		this(new ErroreBuilder(status.getStatusCode(), code).getErrore(), message);
	}
	
}
