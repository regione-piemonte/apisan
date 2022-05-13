/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.util;

import java.util.HashMap;

public class ReportPrescUtils {

    public static final String REGEX = "\\|";
    private static LogUtil _log = new LogUtil(ReportPrescUtils.class);

    public static final String INDIRIZZO_RESULT = "indirizzoResult";
    public static final String CAP_RESULT       = "capResult";
    public static final String CITTA_RESULT     = "cittaResult";
    public static final String PROV_RESULT      = "provResult";

    public static HashMap<String, String> getIndirizzo(String indirizzo) {

        HashMap<String, String> result = new HashMap<>();

     /* - Una stringa  in tal caso la mostriamo nel campo INDIRIZZO
        -	Una stringa contenente dei |, tipicamente :  INDIRIZZO|CAP|CITTA'| PROV
        In tal caso i valori devono essere spacchettati nei campi INDIRIZZO, CAP, CITTA’ e PROVINCIA. Laddove esistono i valori si compilano , dove non vi sono  non deve essere visualizzato nulla
     */
        try {

            if (indirizzo.contains("|")) {
                result.put(INDIRIZZO_RESULT, indirizzo.split(REGEX)[0].trim());
                result.put(CAP_RESULT, indirizzo.split(REGEX)[1].trim());
                result.put(CITTA_RESULT, indirizzo.split(REGEX)[2].trim());
                result.put(PROV_RESULT, indirizzo.split(REGEX)[3].trim());
            } else {
                result.put(INDIRIZZO_RESULT, indirizzo.trim());
                result.put(CAP_RESULT, "");
                result.put(CITTA_RESULT, "");
                result.put(PROV_RESULT, "");
            }

        } catch (Exception e) {
            _log.error("getNreDetails", e.getMessage(), e);
        }

        return result;
    }

}
