/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.common.exception;

import it.csi.apisan.apisanvac.model.Errore;

import javax.ws.rs.core.MediaType;

public class ErroreRESTException extends RESTException {

    private static final long serialVersionUID = -6454021553481738359L;

    public ErroreRESTException(Errore errore, String message) {
        super(errore.getStatus(), MediaType.APPLICATION_JSON_TYPE, errore, message);
    }

    public ErroreRESTException(Errore errore) {
        super(errore.getStatus(), MediaType.APPLICATION_JSON_TYPE, errore, errore.toString());
    }


}
