/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.exceptionmapper;

import it.csi.apisan.apisanpresc.util.ErroreBuilder;
import org.jboss.resteasy.spi.UnauthorizedException;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class UnauthorizedExceptionMapper implements ExceptionMapper<UnauthorizedException> {

    public Response toResponse(UnauthorizedException exception) {
    	
        return ErroreBuilder.from(Status.UNAUTHORIZED)
        		.title("Autorizzazione negata")
        		.throwable(exception)
        		.response();
    }
}