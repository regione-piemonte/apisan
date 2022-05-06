/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.exception;

import org.jboss.resteasy.spi.InternalServerErrorException;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


@Provider
public class InternalServerErrorExceptionMapper implements ExceptionMapper<InternalServerErrorException> {

    public Response toResponse(InternalServerErrorException exception) {

        return ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR)
                .title("Si è verificato un errore")
                .throwable(exception)
                .response();
    }
}