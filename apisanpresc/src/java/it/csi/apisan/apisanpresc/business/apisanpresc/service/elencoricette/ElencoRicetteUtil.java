/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.business.apisanpresc.service.elencoricette;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ElencoRicetteUtil {


    public static XMLGregorianCalendar getGregorianCalendarFromDate(Date dateToConvert) {
        XMLGregorianCalendar result = null;

        try {
            GregorianCalendar c = new GregorianCalendar();
            c.setTime(dateToConvert);
            result = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return result;

    }

    public static Date toDate(XMLGregorianCalendar xmlGregorianCalendar) {
        return xmlGregorianCalendar.toGregorianCalendar().getTime();
    }
}
