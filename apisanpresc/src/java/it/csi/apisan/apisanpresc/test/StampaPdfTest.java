/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.test;

import it.csi.apisan.apisanpresc.business.apisanpresc.service.stampapdf.StampaPDFRicetteReqInvocation;
import it.csi.apisan.apisanpresc.business.apisanpresc.service.StampaPDFRicetteService;
import it.csi.apisan.apisanpresc.util.ApisanPrescUtil;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Caso di test per la funzionalita' elenco ricette
 * <p>
 * Parametri in ingresso:
 * <p>
 * - HEADER - Shib-Identita-CodiceFiscale
 * - HEADER - X-Request-ID
 * - HEADER - X-Codice-Servizio
 * - PATH   - cf (String)
 * - PATH   - tipologia (String)
 * - PATH   - regionale (boolean)
 * - PATH   - Data inizio (dd-MM-yyyy)
 * - PATH   - Data fine (dd-MM-yyyy)
 */
public class StampaPdfTest {

//    @Test
//    public void descrizioneMetodo() {
//        // Setup
//
//        // When
//
//        // Then
//
//        // Expect
//    }


    @Test
    public void stampaRicettaPDFwithSar() throws FileNotFoundException {
        // Setup
        StampaPDFRicetteService       stampaPDFRicetteService = new StampaPDFRicetteService();
        StampaPDFRicetteReqInvocation requestDataContainer    = new StampaPDFRicetteReqInvocation();
        requestDataContainer.setTipologia("P");
        requestDataContainer.setRegionale(true);
        requestDataContainer.setNreRicetta("010D14019800054");
        requestDataContainer.setCodiceFiscalePaziente("W+i5dOgdZKZFAUBEXL9C35kYNcjg9PKw4NJDAZNsRReRzXhm6dZEmeqE8oFHadKcyVqOxfdGnBg5NPUPGrzSzm9ouwTle6kghzGPU2MJWaSGlHxiIuf3CIl0zAhJqgRzLrazUqRvYF0ZBN1oPHWXxTW7Bg4dCDLwjgAEpX91Umk=");
        requestDataContainer.setCodiceFiscaleUtenteRich("CRGMLN50S58I258W");
        requestDataContainer.setDataInizioRange(ApisanPrescUtil.toDateFromString("2019-09-01", "yyyy-MM-dd"));
        requestDataContainer.setDataFineRange(ApisanPrescUtil.toDateFromString("2019-09-01", "yyyy-MM-dd"));
        requestDataContainer.setTipoPrescrizione("RP");
        requestDataContainer.setTipoRegime("DM");
        requestDataContainer.setTipoRicetta("");
        requestDataContainer.setRicetteScadute("");
        requestDataContainer.setRicErogNonSSN("");

        // When
        requestDataContainer = stampaPDFRicetteService.processRequest(requestDataContainer);

        // Then
        System.out.println(Arrays.toString(requestDataContainer.getPdf()));
        // Expect
        assertTrue(requestDataContainer.getPdf().length > 0);
    }

//    @Test
//    public void dettaglioRicettaPrescritta() {
//        // Setup
//        DettaglioNREService     dettaglioNREService = new DettaglioNREService();
//        DettaglioNRERequestData req                 = new DettaglioNRERequestData();
//        Date                    dataInizio          = new Date();
//        Date                    dataFine            = new Date();
//
////        String                  nreRicetta                      = "";
////        String                  regionePrescrizione             = "";
////        String                  tipoPrescrizione                = "";
////        String                  codiceFiscaleRichiedente        = "";
////        String                  contestoOpRichiedente           = "";
////        String                  identificatoIpUtenteRichiedente = "";
////        String                  ruoloUtenteRichiedente          = "";
////        String                  codiceFiscalePaziente           = "";
////        String                  servizioApplicativoChiamante    = "";
////        String                  uuidEstremiRichiedente          = "";
//        // When
//        req.setNreRicetta("010D00000000254");
//        req.setRegionePrescrizione("RP");
//        req.setTipoPrescrizione("F");
//        req.setCodiceFiscaleUtente("AAAAAA00B77B000F");
//        req.setContestoOperativo("PERSONAL");
//        req.setIdentficativoIpRichiedente("123.11.2.34");
//        req.setRuoloUtenteRichiedente("FSE");
//        req.setCodiceFiscalePazionte("CRPYNN77A61B791K");
//        req.setServizioApplicativoChiamante("FSE");
//        req.setUuidEstremiRichiedente("g1111");
//        req.setRegionale(true);
//        req.setTipologia("P");
//        req.setDataFineRange(dataFine);
//        req.setDataInizioRange(dataInizio);
//        // Then
//        DettaglioNRERequestData result = null;
//        try {
//            result = dettaglioNREService.execute(req);
//            //System.out.println(result);
//
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//
//        // Expect
//        assertNotNull(result);
//        System.out.println("calldettaglioRicettaPrescritta " + result);
//    }
}
