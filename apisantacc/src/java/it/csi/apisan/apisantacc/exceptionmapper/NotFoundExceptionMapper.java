/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.exceptionmapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.jboss.resteasy.spi.NotFoundException;

import it.csi.apisan.apisantacc.exception.ErroreBuilder;

@Provider
public class NotFoundExceptionMapper implements ExceptionMapper<NotFoundException> {

    public Response toResponse(NotFoundException exception) {
    	
        return ErroreBuilder.from(Status.NOT_FOUND)
        		.title("Risorsa non trovata")
        		.throwable(exception)
        		.response();
    }
}