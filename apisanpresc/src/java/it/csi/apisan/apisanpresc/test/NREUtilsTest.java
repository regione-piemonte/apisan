/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.test;

import it.csi.apisan.apisanpresc.report.ElencoRicetteForReportUtils;
import it.csi.apisan.apisanpresc.util.NREUtils;
import it.csi.apisan.apisanpresc.util.ReportPrescUtils;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class NREUtilsTest {
    @Test
    public void testSplitNRE() {

        String nre = "010D00000000245";

        //il codice deve essere composto da due parti separate: la prima parte contiene i dati relativi al codice Regione/Provincia (3 cifre), e il codice di raggruppamento del lotto (2 cifre), mentre la seconda parte contiene i dati identificativi del lotto (1 cifra) e il codice del lotto+progressivo (9 cifre). Le regole di composizione dell’NRE sono presenti nei documenti di progetto;
        // la parte alfanumerica sottostante il codice a barre deve riportare i valori delimitati da un asterisco iniziale e finale.

        HashMap<String, String> result = NREUtils.getNreDetails(nre);

        assertTrue(result != null);

    }

    @Test
    public void testSplitAddressNormal() {

        String indirizzo = "Via Roma 1";

        HashMap<String, String> result = ReportPrescUtils.getIndirizzo(indirizzo);

        assertTrue(result != null);
        assertTrue(result.containsKey(ReportPrescUtils.INDIRIZZO_RESULT));
        assertTrue(result.get(ReportPrescUtils.INDIRIZZO_RESULT).equals("Via Roma 1"));

    }

    @Test
    public void testSplitAddressWithPipe() {

        String indirizzo = "Via Roma 1 | 10100 | Roma | RM ";

        HashMap<String, String> result = ReportPrescUtils.getIndirizzo(indirizzo);

        assertTrue(result != null);
        assertTrue(result.containsKey(ReportPrescUtils.INDIRIZZO_RESULT));
        assertTrue(result.get(ReportPrescUtils.INDIRIZZO_RESULT).equals("Via Roma 1"));

    }
    @Test
    public void testMappingTipoPresc() {

        String test1 = "U ";
        String test2 = "B ";
        String test3 = "d ";
        String test4 = "P ";
        String test5 = " ";

        String result1 = "";
        String result2 = "";
        String result3 = "";
        String result4 = "";
        String result5 = "";
/*
 * TODO: verificare
        result1 = ElencoRicetteForReportUtils.getPrioritaByClasse(test1);
        result2 = ElencoRicetteForReportUtils.getPrioritaByClasse(test2);
        result3 = ElencoRicetteForReportUtils.getPrioritaByClasse(test3);
        result4 = ElencoRicetteForReportUtils.getPrioritaByClasse(test4);
        result5 = ElencoRicetteForReportUtils.getPrioritaByClasse(test5);
*/
        assertTrue(result1.equals("URGENTE"));
        assertTrue(result2.equals("BREVE"));
        assertTrue(result3.equals("DIFFERITA"));
        assertTrue(result4.equals("PROGRAMMABILE"));
        assertTrue(result5.equals(""));

    }
}