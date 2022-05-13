/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.exceptionmapper;

import it.csi.apisan.apisanpresc.util.ErroreBuilder;
import org.jboss.resteasy.spi.Failure;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


@Provider
public class FailureMapper implements ExceptionMapper<Failure> {

    public Response toResponse(Failure exception) {
    	
    	
    	int status = exception.getResponse().getStatus(); //exception.getErrorCode();
    	
    	Status s = Status.fromStatusCode(status!=0?status:500);
    	if(s==null) {
    		s = Status.INTERNAL_SERVER_ERROR;
    	}
    	
        return ErroreBuilder.from(s)
        		.throwable(exception)
        		.dettaglio("error_code", ""+status)
        		.dettaglio("exception_class", exception.getClass().getSimpleName())
        		.response();
    }
}