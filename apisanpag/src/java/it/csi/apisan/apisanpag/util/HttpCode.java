/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.util;

import it.csi.apisan.apisanpag.integration.exception.ErrorCode;

public enum HttpCode implements ErrorCode {
	OK(200),
	CREATED(201),
	EMPTY(204),
	BAD_REQUEST(400),
	NOT_FOUND(404),
	INTERNAL_SERVER_ERROR(500);
	
	
	private final int number;
	
	private HttpCode(int num) {
		this.number = num;
	}

	@Override
	public int getNumberCode() {
		// TODO Auto-generated method stub
		return this.number;
	}
	
}
