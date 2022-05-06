/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.middleware.exceptions;

public class MiddlewareException extends RuntimeException {
    int    statusCodeException = 500;
    String message;

    public MiddlewareException(int statusCodeException, String message, Throwable cause) {
        super(message, cause);
        this.statusCodeException = statusCodeException;
        this.message             = message;
    }

    public MiddlewareException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }
}
