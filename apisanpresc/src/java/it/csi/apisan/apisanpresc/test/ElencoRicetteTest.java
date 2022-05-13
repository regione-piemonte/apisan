/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.test;

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
public class ElencoRicetteTest {

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


//    @Test
//    public void callDMAElencoRicetteStampaPromemoriaWSCaso3() {
//        // Setup
//        ElencoRicetteService    elencoRicetteService             = new ElencoRicetteService();
//        ElencoRicetteInvocation reqElencoRicetteInvocation       = new ElencoRicetteInvocation();
//        Date                    dataInizio                       = new Date();
//        Date                    dataFine                         = new Date();
////        String                  HEADER_ShibIdentitaCodiceFiscale = "RSTGGG69A03L219K";
//        String                  HEADER_ShibIdentitaCodiceFiscale = "AAAAAA00B77B000F";
//        String                  HEADER_XRequestID                = "";
//        String                  HEADER_XCodiceServzio            = "";
//        String                  PATH_Cf                          = "CRPYNN77A61B791K";
//        String                  PATH_Tipologia                   = null;
//        Boolean                 PATH_Regionale                   = false;
//        Date                    PATH_DataInizio                  = new DateTime(2019, 1, 1, 0, 0, 0, 0).toDate();
//        Date                    PATH_DatFine                     = new DateTime(2019, 12, 31, 0, 0, 0, 0).toDate();
//        String                  tipoPrescrizione                 = null;
//
//        //---------------- DATI DA CAPIRE SE SONO HARDCODATI OPPURE NO
//        String contestoOperativo           = "PERSONAL";
//        String identificativoIpRichiedente = "123.11.2.34";
//        String ruoloUtente                 = "FSE";
//        String servizioChiamante           = "FSE";
//        String uuidRichiedente             = UUID.randomUUID().toString();
//        String regionePrescrizione         = "RP";
//
//
//        // When
//        reqElencoRicetteInvocation.setDataInizioRange(dataInizio);
//        reqElencoRicetteInvocation.setDataFineRange(dataFine);
//        reqElencoRicetteInvocation.setCodiceFiscalePaziente(PATH_Cf);
//        reqElencoRicetteInvocation.setCodiceFiscaleUtenteRich(HEADER_ShibIdentitaCodiceFiscale);
////        reqElencoRicetteInvocation.setContestoOperativo(contestoOperativo);
////        reqElencoRicetteInvocation.setRu(ruoloUtente);
//        reqElencoRicetteInvocation.setIpRequest(identificativoIpRichiedente);
//        reqElencoRicetteInvocation.setxCodiceServizio(servizioChiamante);
//        reqElencoRicetteInvocation.setxRequestID(uuidRichiedente);
//        reqElencoRicetteInvocation.setRegionePrescrizione(regionePrescrizione);
//        reqElencoRicetteInvocation.setRegionale(PATH_Regionale);
////        reqElencoRicetteInvocation.setp(tipoPrescrizione);
////        reqElencoRicetteInvocation.setTipoPrescrizione(PATH_Tipologia);
//
//        // Impostazioni SAR
////        reqElencoRicetteInvocation.setN(null);
////        reqElencoRicetteInvocation.setTipoRegime("DM");
////        reqElencoRicetteInvocation.s("I");
////        reqElencoRicetteInvocation.se("P");
////        reqElencoRicetteInvocation.setric("N");
////        reqElencoRicetteInvocation.setRicErogNonSSN("N");
////        reqElencoRicetteInvocation.setRegionePrescrizione("P");
//
//        // Then
//        ElencoRicetteInvocation result = null;
//        try {
//            result = elencoRicetteService.processRequest(reqElencoRicetteInvocation);
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//        // Expect
//        assertNotNull(result);
//        System.out.println("callDMAElencoRicetteStampaPromemoriaWS " + result);
//    }

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
