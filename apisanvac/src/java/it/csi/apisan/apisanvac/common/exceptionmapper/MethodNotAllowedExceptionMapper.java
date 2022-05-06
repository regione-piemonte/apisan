/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.common.exceptionmapper;

import it.csi.apisan.apisanvac.common.ErroreBuilder;
import org.jboss.resteasy.spi.MethodNotAllowedException;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


@Provider
public class MethodNotAllowedExceptionMapper implements ExceptionMapper<MethodNotAllowedException> {

    public Response toResponse(MethodNotAllowedException exception) {
    	
        return ErroreBuilder.from(Status.BAD_REQUEST)
        		.title("Request method non permesso")
        		.throwable(exception)
        		.response();
    }
}