/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.util;

import org.codehaus.jettison.json.JSONException;

import java.util.Base64;
import java.util.regex.Pattern;

public class Utils {

    public static byte[] decodeBase64(String pdfEncoded) {

        return  Base64.getDecoder().decode(pdfEncoded);
    }

    public static boolean isBase64(String stringBase64){
        String regex ="([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)";

        Pattern patron = Pattern.compile(regex);

        if (!patron.matcher(stringBase64).matches()) {
            return false;
        } else {
            return true;
        }
    }

    public static byte[] base64toPDF(String base64) throws Exception {

        byte[] result = null;
        try {
            if (base64 != null && !("").equalsIgnoreCase(base64) && !("null").equalsIgnoreCase(base64)) {
                if (isBase64(base64)) {
                    result = decodeBase64(base64);
                } else {
                    throw new Exception("Base 64 not valid");
                }
            }

        } catch (JSONException e) {
            throw new Exception(e);
        }

        return result;
    }
}
