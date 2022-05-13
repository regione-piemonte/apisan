/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.exception;

public class DMAResponseKOException extends RuntimeException {

    int    statusCodeReturnError;
    String codiceErrore;

    public DMAResponseKOException(int statusCodeReturnError, String codiceErrore) {
        this.statusCodeReturnError = statusCodeReturnError;
        this.codiceErrore          = codiceErrore;
    }

    public DMAResponseKOException(String message, int statusCodeReturnError, String codiceErrore) {
        super(message);
        this.statusCodeReturnError = statusCodeReturnError;
        this.codiceErrore          = codiceErrore;
    }

    public DMAResponseKOException(String message, Throwable cause, int statusCodeReturnError, String codiceErrore) {
        super(message, cause);
        this.statusCodeReturnError = statusCodeReturnError;
        this.codiceErrore          = codiceErrore;
    }

    public DMAResponseKOException(Throwable cause, int statusCodeReturnError, String codiceErrore) {
        super(cause);
        this.statusCodeReturnError = statusCodeReturnError;
        this.codiceErrore          = codiceErrore;
    }

    public DMAResponseKOException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int statusCodeReturnError, String codiceErrore) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.statusCodeReturnError = statusCodeReturnError;
        this.codiceErrore          = codiceErrore;
    }

    public int getStatusCodeReturnError() {
        return statusCodeReturnError;
    }

    public void setStatusCodeReturnError(int statusCodeReturnError) {
        this.statusCodeReturnError = statusCodeReturnError;
    }

    public String getCodiceErrore() {
        return codiceErrore;
    }

    public void setCodiceErrore(String codiceErrore) {
        this.codiceErrore = codiceErrore;
    }
}
