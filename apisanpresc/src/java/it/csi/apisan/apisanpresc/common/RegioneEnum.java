/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.common;

public enum RegioneEnum {
    PIEMONTE("Regione Piemonte", "010"),
    PUGLIA("Regione Puglia", "016");

    public String descrizione;
    public String codice;

    RegioneEnum(String descrizione, String codice) {
        this.descrizione = descrizione;
        this.codice      = codice;
    }


}
