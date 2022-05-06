/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

public class RESTException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4237633919024080387L;
	private int status;
	private MediaType mediaType;
	private Object entity;
	
	public RESTException(int status, MediaType mediaType, Object entity, String message) {
		super(message);
		this.status = status;
		this.mediaType = mediaType;
		this.entity = entity;
	}
	
//	public RESTException(int status, MediaType mediaType, Object entity) {
//		super();
//		this.status = status;
//		this.mediaType = mediaType;
//		this.entity = entity;
//	}
//
//	public RESTException(Status  status, MediaType mediaType, Object entity) {
//		this(status.getStatusCode(),mediaType,entity);
//	}
//	
//	public RESTException(HttpCode status, MediaType mediaType, Object entity) {
//		this(status.getNumberCode(),mediaType,entity);
//	}
	
	public int getStatus() {
		return this.status;
	}

	public MediaType getMediaType() {
		return mediaType;
	}

	public void setMediaType(MediaType mediaType) {
		this.mediaType = mediaType;
	}

	public Object getEntity() {
		return entity;
	}

	public void setEntity(Object entity) {
		this.entity = entity;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public Response getResponse() {
		return getResponseBuilder().build();
	}
	
	public ResponseBuilder getResponseBuilder() {
		return Response.status(this.getStatus()).type(this.getMediaType()).entity(this.getEntity());
	}

}
