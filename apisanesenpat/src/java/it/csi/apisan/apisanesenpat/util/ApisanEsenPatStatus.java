/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.util;

import java.util.IllegalFormatException;

public enum ApisanEsenPatStatus {

    DELEGA_NON_VALIDA(403, "Delega non valida"),
    CODICE_FISCALE_NON_VALIDO(400, "Codice Fiscale %s non valido"),
    REFERTO_NON_TROVATO(404, "Referto non trovato"),
    RISORSA_NON_TROVATA(404, "Risorsa non trovata"),
    PARAMETRO_NON_VALIDO(400, "Parametro %s non valido"),
    PARAMETRO_NON_PRESENTE(400, "Parametro %s non presente"),
    UTENTE_NON_AUTORIZZATO (403, "Utente non autorizzato");


    private int statusCode;
    private String descTemplate;

    ApisanEsenPatStatus(int statusCode, String desc) {
        this.statusCode = statusCode;
        this.descTemplate = desc;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getMessage(Object... args) {
        try {
            return String.format(descTemplate, args);
        } catch (IllegalFormatException ife) {
            ife.printStackTrace();
            return descTemplate;
        }
    }

}
