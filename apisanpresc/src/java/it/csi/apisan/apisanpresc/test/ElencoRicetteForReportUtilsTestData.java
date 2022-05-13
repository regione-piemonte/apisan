/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.test;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.*;

class ElencoRicetteForReportUtilsTestData {

    @Test
    public void dataTest() throws ParseException {

        //Setup

        SimpleDateFormat sFrom = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
        SimpleDateFormat sTo = new SimpleDateFormat("dd-MM-yyyy");



        //When

        String date = "2018-01-26 08:12:13";



        //Then

        String result = sTo.format(sFrom.parse(date));

        //Expect
        assert(result!="");
        System.out.println(result);

    }
}