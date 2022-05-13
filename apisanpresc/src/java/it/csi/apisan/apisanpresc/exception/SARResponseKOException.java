/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.exception;

public class SARResponseKOException extends RuntimeException {

   int statusCodeReturnError;

    public SARResponseKOException(int statusCodeReturnError) {
        this.statusCodeReturnError = statusCodeReturnError;
    }

    public SARResponseKOException(String message, int statusCodeReturnError) {
        super(message);
        this.statusCodeReturnError = statusCodeReturnError;
    }

    public SARResponseKOException(String message, Throwable cause, int statusCodeReturnError) {
        super(message, cause);
        this.statusCodeReturnError = statusCodeReturnError;
    }

    public SARResponseKOException(Throwable cause, int statusCodeReturnError) {
        super(cause);
        this.statusCodeReturnError = statusCodeReturnError;
    }

    public SARResponseKOException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int statusCodeReturnError) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.statusCodeReturnError = statusCodeReturnError;
    }

    public int getStatusCodeReturnError() {
        return statusCodeReturnError;
    }
}
