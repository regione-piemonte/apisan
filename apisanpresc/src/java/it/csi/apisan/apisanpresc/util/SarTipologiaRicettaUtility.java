/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.util;

import it.csi.apisan.apisanpresc.dto.apisanpresc.ModelStatoRicetta;
import it.csi.apisan.apisanpresc.dto.apisanpresc.ModelTipologiaRicetta;

public class SarTipologiaRicettaUtility {

    public static String getName(ModelTipologiaRicetta.CodiceEnum codiceEnum) {

        String result = "";

        switch (codiceEnum) {
            case F:
                result = "Farmaceutica";
                break;
            case P:
                result = "Specialistica";
                break;
        }

        return result;
    }


}
