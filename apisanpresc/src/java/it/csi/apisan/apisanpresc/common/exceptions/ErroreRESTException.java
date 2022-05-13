/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.common.exceptions;

import it.csi.apisan.apisanpresc.common.exceptions.RESTException;
import it.csi.apisan.apisanpresc.dto.apisanpresc.Errore;

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
