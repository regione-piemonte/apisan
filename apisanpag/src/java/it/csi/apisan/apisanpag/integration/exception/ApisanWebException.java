/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.integration.exception;

import it.csi.apisan.apisanpag.util.HttpCode;

public class ApisanWebException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ErrorCode status = HttpCode.OK;
	
	public ApisanWebException(ErrorCode errCode) {
		this.status = errCode;
	}
	
	public ErrorCode getErrorCode() {
		return status;
	}

	
	
	
}
