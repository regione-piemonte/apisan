/*******************************************************************************

* Copyright Regione Piemonte - 2023

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancod.business.apisancod.exceptionmapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.jboss.resteasy.spi.InternalServerErrorException;

import it.csi.apisan.apisancod.exception.ErroreBuilder;

@Provider
public class InternalServerErrorExceptionMapper implements ExceptionMapper<InternalServerErrorException> {

    public Response toResponse(InternalServerErrorException exception) {
    	
        return ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR)
        		.title("Si è verificato un errore")
        		.throwable(exception)
        		.response();
    }
}