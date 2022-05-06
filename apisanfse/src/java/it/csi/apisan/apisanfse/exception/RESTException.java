/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

public class RESTException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3536744145734865602L;
	private final int status;
	private final transient MediaType mediaType;
	private final transient Object entity;
	
	
	public RESTException(int status, MediaType mediaType, Object entity, String message) {
		super(message);
		this.status = status;
		this.mediaType = mediaType;
		this.entity = entity;
	}
	
	
	public int getStatus() {
		return this.status;
	}

	public MediaType getMediaType() {
		return mediaType;
	}

	public Object getEntity() {
		return entity;
	}
	
	public Response getResponse() {
		return getResponseBuilder().build();
	}
	
	public ResponseBuilder getResponseBuilder() {
		return Response.status(this.getStatus()).type(this.getMediaType()).entity(this.getEntity());
	}
	
	
}
