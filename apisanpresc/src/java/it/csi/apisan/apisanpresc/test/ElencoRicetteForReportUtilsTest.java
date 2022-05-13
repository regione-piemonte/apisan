/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.test;

import org.apache.commons.lang3.ObjectUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElencoRicetteForReportUtilsTest {

    private static String getTipoRicettaByCode(String tipoRic) {
        String result = "";
        if (tipoRic != null) {
            switch (tipoRic.trim()) {
                case "":
                    result = "Assist.SSN";
                    break;
                case "NA":
                    result = "TBD NA";
                    break;
                case "ND":
                    result = "TBD ND";
                    break;
                case "NE":
                    result = "TBD NE";
                    break;
                case "NX":
                    result = "TBD NX";
                    break;
            }
        } else {
            result = "Assist.SSN";
        }

        return result;
    }

    private static String getTipoRicettaByCodeNoIf(String tipoRic) {
        String result = "";
        String toCheck = tipoRic != null && !"".equals(tipoRic) ? tipoRic : "";
        switch (toCheck) {
            case "NA":
                result = "TBD NA";
                break;
            case "ND":
                result = "TBD ND";
                break;
            case "NE":
                result = "TBD NE";
                break;
            case "NX":
                result = "TBD NX";
                break;
            default:
                result = "Assist.SSN";
        }

        return result;
    }


   @Test
   public void testSwitch() {

        //Setup
       String tipoRic;
       String returnedTipo;
       // When
       tipoRic = null;
       //Then
       returnedTipo = getTipoRicettaByCodeNoIf(tipoRic);
       //Expect

       System.out.println(returnedTipo);
       assertTrue(returnedTipo!=null);

    }

}