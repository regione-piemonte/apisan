/*******************************************************************************

* Copyright Regione Piemonte - 2023

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancod.business.apisancod.exceptionmapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

import org.jboss.resteasy.spi.BadRequestException;

import it.csi.apisan.apisancod.exception.ErroreBuilder;

public class BadRequestExceptionMapper implements ExceptionMapper<BadRequestException> {

	public BadRequestExceptionMapper() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Response toResponse(BadRequestException exception) {
        return ErroreBuilder.from(Status.BAD_REQUEST)
        		.title("Errore nella request lato client")
        		.throwable(exception)
        		.response();
    }

}
