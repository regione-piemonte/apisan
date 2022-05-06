/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.util;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;

public class Utils {
    // TODO Log
    static LogUtil _log = new LogUtil(Utils.class);
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

    public static XMLGregorianCalendar toGregorianCalendarFromDate(Date dateToConvert) {
        XMLGregorianCalendar result = null;

        try {
            GregorianCalendar c = new GregorianCalendar();
            c.setTime(dateToConvert);
            result = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        } catch (Exception e) {
            _log.error("toGregorianCalendarFromDate", e.getMessage());
        }

        return result;

    }

    public static XMLGregorianCalendar toGregorianCalendarFromDateString(String dateToConvert, String pattern) {
        XMLGregorianCalendar result = null;
        SimpleDateFormat sdf    = new SimpleDateFormat(pattern);

        try {
            GregorianCalendar c = new GregorianCalendar();
            c.setTime(sdf.parse(dateToConvert));
            result = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        } catch (Exception e) {
            _log.error("toGregorianCalendarFromDateString", e.getMessage());
        }

        return result;

    }

    public static Date toDate(XMLGregorianCalendar xmlGregorianCalendar) {
        return xmlGregorianCalendar.toGregorianCalendar().getTime();
    }

    public static Date toDateFromString(String dateString, String pattern) {
        Date             result = null;
        SimpleDateFormat sdf    = new SimpleDateFormat(pattern);

        try {
            result = sdf.parse(dateString);
        } catch (Exception e) {
            _log.error("toDateFromString", e.getMessage());
        }

        return result;


    }
    
    public static JsonNode toJsonNode(String s) throws IOException {
		if (s == null) {
			return null;
		}
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readTree(s);
	}
    
    public static String toStringFromDate(Date dateToString, String pattern) {
        String           result = null;
        SimpleDateFormat sdf    = new SimpleDateFormat(pattern);

        try {
            result = sdf.format(dateToString);
        } catch (Exception e) {
            _log.error("toStringFromDate", e.getMessage());
        }

        return result;
    }
}
