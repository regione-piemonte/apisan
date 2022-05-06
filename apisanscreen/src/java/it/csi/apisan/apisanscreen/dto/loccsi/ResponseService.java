/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.dto.loccsi;

import okhttp3.Headers;

public class ResponseService <T> {
	private Headers headers;
	private T body;
	
	
	public ResponseService(Headers headers, T body) {
		this.headers = headers;
		this.body = body;
	}
	
	public ResponseService() {

	}
	
	public void setHeaders(Headers headers) {
		this.headers = headers;
	}
	
	public Headers getHeaders() {
		return headers;
	}

	public void setBody(T body) {
		this.body = body;
	}
	
	
	public T getBody() {
		return (T) this.body;
	}
}
