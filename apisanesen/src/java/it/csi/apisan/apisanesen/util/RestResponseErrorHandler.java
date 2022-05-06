/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

import it.csi.apisan.apisanesen.exception.RESTException;

public class RestResponseErrorHandler implements ResponseErrorHandler {
	
	private List<HttpStatus> httpStatus;
	
	
	
	public RestResponseErrorHandler(HttpStatus status){
		if(this.httpStatus == null) {
			this.httpStatus = new ArrayList();
		}
		this.httpStatus.add(status);
	}
	
	public RestResponseErrorHandler(List<HttpStatus> status){
		this.httpStatus= status;
	}
	
	@Override
	public void handleError(ClientHttpResponse resp) throws IOException {
		//int status, MediaType mediaType, Object entity, String messag
		String body = IOUtils.toString(resp.getBody(), StandardCharsets.UTF_8.name());
		throw new RESTException(resp.getRawStatusCode(), MediaType.APPLICATION_JSON_VALUE, body, body);
	}

	@Override
	public boolean hasError(ClientHttpResponse resp) throws IOException {
		if(!httpStatus.contains(resp.getStatusCode())  ) {
			return true;
		}
		return false;
	}

}
