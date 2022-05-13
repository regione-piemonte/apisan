/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.util;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import it.csi.apisan.apisanpresc.common.ApiSanPrescConstants;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.GregorianCalendar;

public class ApisanPrescUtil {

    static LogUtil _log = new LogUtil(ApisanPrescUtil.class);

    public static XMLGregorianCalendar toGregorianCalendarFromDate(Date dateToConvert) {
        XMLGregorianCalendar result = null;

        try {
            GregorianCalendar c = new GregorianCalendar();
            c.setTime(dateToConvert);
            result = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        } catch (Exception e) {
            _log.error("toGregorianCalendarFromDate", e.getMessage(), e);
        }

        return result;

    }

    public static XMLGregorianCalendar toGregorianCalendarFromDateString(String dateToConvert, String pattern) {
        XMLGregorianCalendar result = null;
        SimpleDateFormat     sdf    = new SimpleDateFormat(pattern);

        try {
            GregorianCalendar c = new GregorianCalendar();
            c.setTime(sdf.parse(dateToConvert));
            result = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        } catch (Exception e) {
            _log.error("toGregorianCalendarFromDateString", e.getMessage(), e);
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
            _log.error("toDateFromString", e.getMessage(), e);
        }

        return result;


    }

    public static String toStringFromDate(Date dateToString, String pattern) {
        String           result = null;
        SimpleDateFormat sdf    = new SimpleDateFormat(pattern);

        try {
            result = sdf.format(dateToString);
        } catch (Exception e) {
            _log.error("toStringFromDate", e.getMessage(), e);
        }

        return result;
    }


//         Se tipo prescrizione F (farmaceutica) -> Data fine validita' = data prescrizione + 31gg
//         Se tipo prescrizione P (specialistica) -e lo stato = 3 -> data fine validita = data prescr + 180gg
//         Se tipo prescrizione P e stato = 5 (presa in carico - prenotata) -> data fine validita' = 31/12/2099

    public static Date computedDataFineValidita(String tipologia, String stato, Date dataRicetta) {

        Date result = null;
        try {
            if (tipologia.equalsIgnoreCase("f")) {
                result = asDate(LocalDateTime.from(dataRicetta.toInstant().atZone(ZoneId.of("Europe/Rome"))).plusDays(31));
            } else if (tipologia.equalsIgnoreCase("p") && stato.equals("3")) {
                result = asDate(LocalDateTime.from(dataRicetta.toInstant().atZone(ZoneId.of("Europe/Rome"))).plusDays(180));
            } else if (tipologia.equalsIgnoreCase("p") && stato.equals("5")) {
                String datafissata = "31/12/2099";
                result = new SimpleDateFormat("dd/MM/yyyy").parse(datafissata);
            } else {
                _log.error("computedDataFineValidita", "computedDataFineValidita() values not valid" + ":" + tipologia + ":" + stato + ":" + dataRicetta.toString());
            }
        } catch (ParseException e) {
            _log.error("computedDataFineValidita", e.getMessage());
        }

        return result;

    }

    public static Date asDate(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 
     * @param codiceFiscalePaziente
     * @param codiceFiscaleutente
     * @return
     */
    public static String getRuoloDMA(String codiceFiscalePaziente, String codiceFiscaleutente) {
		String ruoloUtente;
		if(codiceFiscalePaziente.equals(codiceFiscaleutente))
        	ruoloUtente = ApiSanPrescConstants.RUOLO_UTENTE_ASS;
        else
        	ruoloUtente = ApiSanPrescConstants.RUOLO_UTENTE_DEL;
		return ruoloUtente;
	}
}
