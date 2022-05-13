/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.test.ws;

import java.text.SimpleDateFormat;

public class SARWSClientTest {

    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

//    @Test
//    public void invokeVisualizzaPrePazSOLTest() {
//        // Given
//        SARWSClient sarwsClient = new SARWSClient();
//
//        // When
//        String cfPaziente       = "SHNKSH84A27Z100H";
//        String nre              = null;
//        String cfRichiedente    = "CRGMLN50S58I258W";
//        String tipoRegime       = "DM";
//        String tipoRicetta      = "     ";
//        String ricetteScadute   = "";
//        String ricErogNonSSN    = "";
//        Date   iniRange         = new Date();
//        Date   fineRange        = new Date();
//        String tipoPrescrizione = "P";
//        String applicativoChiamante = "APP";
//
//
//        //Then
//        try {
//            iniRange  = sdf.parse("01-02-2018");
//            fineRange = sdf.parse("10-02-2018");
//        } catch (ParseException e) {
//            System.err.println(e.getMessage());
//        }
//        VisualizzaPrescrittoPazienteSOLRicevuta response = sarwsClient.invokeVisualizzaPrePazSOL(cfPaziente, cfRichiedente, iniRange, fineRange, tipoPrescrizione, tipoRegime, tipoRicetta, ricetteScadute, ricErogNonSSN, nre, applicativoChiamante);
//
//        // Expect
//        assertTrue(response != null);
//        assertTrue(response.getElencoRicette() != null);
//        assertTrue(response.getElencoRicette().getInfoRicetta() != null);
//        assertTrue(response.getElencoRicette().getInfoRicetta().size() >= 1);
//    }

    /*@Test
    public void invokeCryptAss() {
        // Given
        SARWSClient sarwsClient = new SARWSClient();

        // When
        String cfPaziente = "CNDLGU82E50B180U";
        //Then
        String response = sarwsClient.encryptSarCFAss(cfPaziente);

        // Expect
        assertTrue(response != null);
        assertTrue(!"".equalsIgnoreCase(response));
        System.out.println(cfPaziente + " -> " + response);

    }

    @Test
    public void invokeCryptRic() {
        // Given
        SARWSClient sarwsClient = new SARWSClient();

        // When
        String cfPaziente = "CNDLGU82E50B180U";

        //Then
        String response = sarwsClient.encryptSarCFRich(cfPaziente);

        // Expect
        assertTrue(response != null);
        assertTrue(!"".equalsIgnoreCase(response));
        System.out.println(cfPaziente + " -> " + response);

    }

    @Test
    public void invokeDecryptAss() {
        // Given
        SARWSClient sarwsClient = new SARWSClient();
        String      cfPaziente  = "CNDLGU82E50B180U";

        // When
        String cfPazienteCrypted = ""; // TODO Aggiungere caso di test

        //Then
        String response = sarwsClient.decryptSarCfAss(cfPazienteCrypted);

        // Expect
        assertTrue(response != null);
        assertTrue(cfPaziente.equalsIgnoreCase(response));
        System.out.println(cfPaziente + " -> " + response);
    }

    @Test
    public void invokeDecryptRich() {
        // Given
        SARWSClient sarwsClient = new SARWSClient();
        String      cfPaziente  = "CNDLGU82E50B180U";

        // When
        String cfPazienteCrypted = "uKjlur3x/zLjs3Z2c6k6elqZI9TEgGA8BAG53nJosCA3FVZiGpqcWHogl06TYereTrjA3YL4Ezb6yCiX+5o8Pq6NAAtfvMVwAYXJo6J+Z5m/fK8oYo8BOrCI5lRRjnEd8os6qvVNo27oDvXYbGGsorFGesr6Cf9UtwMAYdtUlk4=";

        //Then
        String response = sarwsClient.decryptSarCfRich(cfPazienteCrypted);

        // Expect
        assertTrue(response != null);
        assertTrue(cfPaziente.equalsIgnoreCase(response));
        System.out.println(cfPaziente + " -> " + response);
    }*/
}
