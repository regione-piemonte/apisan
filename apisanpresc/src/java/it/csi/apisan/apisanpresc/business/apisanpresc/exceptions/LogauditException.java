/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.business.apisanpresc.exceptions;

public class LogauditException extends Exception {
    public LogauditException() {
    }

    public LogauditException(String message) {
        super(message);
    }

    public LogauditException(String message, Throwable cause) {
        super(message, cause);
    }

    public LogauditException(Throwable cause) {
        super(cause);
    }

    public LogauditException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
