/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.util;

import it.csi.apisan.apisanpresc.dto.apisanpresc.ModelStatoRicetta;

public class SarStatoRicettaUtility {

    public static String getName(ModelStatoRicetta.CodiceEnum codiceEnum) {

        String result = "";

        switch (codiceEnum) {
            case _3:
                result = "Prescritto";
                break;
            case _5:
                result = "Prenotato";
                break;
        }

        return result;
    }


}
