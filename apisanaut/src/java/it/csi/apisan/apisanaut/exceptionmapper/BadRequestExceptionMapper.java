/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.exceptionmapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.jboss.resteasy.spi.BadRequestException;

import it.csi.apisan.apisanaut.exception.ErroreBuilder;

@Provider
public class BadRequestExceptionMapper implements ExceptionMapper<BadRequestException> {

    public Response toResponse(BadRequestException exception) {
    	
        return ErroreBuilder.from(Status.BAD_REQUEST)
        		.title("Errore nella request lato client")
        		.throwable(exception)
        		.response();
    }
}