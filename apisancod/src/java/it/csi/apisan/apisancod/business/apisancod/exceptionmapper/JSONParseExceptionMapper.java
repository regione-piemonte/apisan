/*******************************************************************************

* Copyright Regione Piemonte - 2023

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancod.business.apisancod.exceptionmapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.codehaus.jackson.JsonParseException;

import it.csi.apisan.apisancod.exception.ErroreBuilder;

@Provider
public class JSONParseExceptionMapper implements ExceptionMapper<JsonParseException> {

	

	@Override
	public Response toResponse(JsonParseException arg0) {
		   return ErroreBuilder.from(Status.BAD_REQUEST)
	        		.title("Errore di parse nella request json non corretto")
	        		.response();
	}

}
