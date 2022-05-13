/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.test;

import it.csi.apisan.apisanpresc.business.apisanpresc.service.dettaglioricette.DettaglioNREService;
import it.csi.apisan.apisanpresc.business.apisanpresc.service.dettaglioricette.DettaglioRicettaInvocation;
import it.csi.apisan.apisanpresc.common.ValidationResult;
import it.csi.apisan.apisanpresc.soap.pro.PRORELWSClient;
import it.csi.apisan.apisanpresc.soap.pro.logaudit.Audit;
import it.csi.apisan.apisanpresc.soap.pro.logaudit.LogAuditRequest;
import it.csi.apisan.apisanpresc.soap.pro.logaudit.SistemaRichiedente;
import it.csi.apisan.apisanpresc.soap.pro.logaudit.UtenteRichiedente;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DettaglioNreTest {

    private DettaglioRicettaInvocation result;

    //    @Test
//    void NascondiNreTest(){
//        // Setup
//
//        // When
//
//        // Then
//
//        // Expect
//    }
//
//    @Test
//    public void logAuditRequestValidationRequestOK() {
//        // Setup
//        ValidationResult   validationResult   = null;
//        LogAuditRequest    logAuditRequest    = new LogAuditRequest();
//        SistemaRichiedente sistemaRichiedente = new SistemaRichiedente();
//        Audit              audit              = new Audit();
//
//        // When
//        logAuditRequest.setServizioAppChiamante("TEST");
//        logAuditRequest.setCodiceFiscaleUtenteRich("CNDLGU82E05B180U");
//        logAuditRequest.setCodiceFiscalePaziente("CNDLGU82E05B180U");
//        logAuditRequest.setIdentificativoRich("luis");
//        logAuditRequest.setIdentificatoIpRichiedente("127.0.0.1");
//        logAuditRequest.setDescrizioneAudit("audit di test");
//        logAuditRequest.setSistemaRichiedente(sistemaRichiedente);
//        logAuditRequest.setAudit(audit);
//        // Then
//        validationResult = logAuditRequest.validate();
//
//        // Expect
//
//        assertTrue(validationResult != null);
//        assertTrue(validationResult.getValid());
//        assertTrue(validationResult.getErrorMessages() != null);
//        assertTrue(validationResult.getErrorMessages().size() == 0);
//        System.out.println(validationResult.toString());
//
//    }

    @Test
    public void logAuditRequestValidationRequestKO() {
        // Setup
        ValidationResult           validationResult           = null;
        DettaglioRicettaInvocation dettaglioRicettaInvocation = new DettaglioRicettaInvocation();
        Date                       dataInizio                 = new Date();
        Date                       dataFine                   = new Date();


        // When
        // Not all required property are setted
        dettaglioRicettaInvocation.setCodiceFiscalePaziente("A");
        dettaglioRicettaInvocation.setCodiceFiscaleUtenteRich("TEST");
        dettaglioRicettaInvocation.setDataFineRange(dataInizio);
        dettaglioRicettaInvocation.setDataFineRange(dataFine);
        // Then
        validationResult = dettaglioRicettaInvocation.validate();

        // Expect
        assertTrue(validationResult != null);
        assertTrue(!validationResult.getValid());
        assertTrue(validationResult.getErrorMessages() != null);
        assertTrue(validationResult.getErrorMessages().size() > 0);
        System.out.println(validationResult.toString());

    }

    @Test
    public void logAuditWSInvocation() {

        // Setup
        DettaglioNREService        dettaglioNREService = new DettaglioNREService();
        DettaglioRicettaInvocation req                 = new DettaglioRicettaInvocation();
        //NascondiNreResponse response = new NascondiNreResponse();
        Date               dataInizio         = new Date();
        Date               dataFine           = new Date();
        LogAuditRequest    logAuditRequest    = new LogAuditRequest();
        UtenteRichiedente  utenteRichiedente  = new UtenteRichiedente();
        SistemaRichiedente sistemaRichiedente = new SistemaRichiedente();

        // When
        //non tutti i parametri sono implementati
        req.setCodiceFiscalePaziente("A");
        req.setCodiceFiscaleUtenteRich("TEST");
        req.setDataInizioRange(dataInizio);
        req.setDataFineRange(dataFine);
        DettaglioRicettaInvocation result = null;

        //chiamo il prorelWsClient
        PRORELWSClient prorelWsClient = new PRORELWSClient();
        Audit          audit          = new Audit();
        audit.setCodice("TEST1");
        audit.setDataOra("2019-04-02T00:00:00");
        audit.setDescrizione("prova");

        //Sistema ed utente richiedente
        utenteRichiedente.setCodiceFiscale("AAAAAA00B77B000F");
        utenteRichiedente.setIdentificativoIP("127.0.0.32");
        sistemaRichiedente.setIdentificativoUnivocoRichiesta("1110");
        sistemaRichiedente.setServizioApplicativoChiamante("TEST");

        //inserisco i dati in logAudit:
        logAuditRequest.setAudit(audit);
        logAuditRequest.setSistemaRichiedente(sistemaRichiedente);

        //settaggio dei valori per il costruttore:
        String codice                            = audit.getCodice();
        String codiceFiscale                     = utenteRichiedente.getCodiceFiscale();
        String descrizioneAudit                  = audit.getDescrizione();
        String identificativoRichiesta           = sistemaRichiedente.getIdentificativoUnivocoRichiesta();
        String servizioApplicativoChiamante      = sistemaRichiedente.getServizioApplicativoChiamante();
        String codiceFiscaleUtenteRichiedente    = utenteRichiedente.getCodiceFiscale();
        String identificativoIpUtenteRichiedente = utenteRichiedente.getIdentificativoIP();

        // Then
        try {
            result = dettaglioNREService.processRequest(req);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
//        catch (IncomingRequestValidationException e) {
//            System.err.println(e.getMessage());
//        }
        prorelWsClient.logAudit(codiceFiscale, descrizioneAudit, codice, identificativoRichiesta, servizioApplicativoChiamante, codiceFiscaleUtenteRichiedente, identificativoIpUtenteRichiedente);
        // Expect
        System.out.println("logAuditRequest() -  " + result);
        assertTrue(!"".equals(result));
        assertTrue("SUCCESSO".equals(result) || "FALLIMENTO".equals(result) || "AVVISO".equals(result));
    }

//    @Test
//    public void callDettagliNRE() {
//        // Setup
//        DettaglioNREService                                                           dettaglioNREService = new DettaglioNREService();
//        DettaglioRicettaInvocation                                                    request             = new DettaglioRicettaInvocation();
//        DMAWSClient                                                                   dmawsClient         = new DMAWSClient();
//        it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta.EstremiRicetta  estremiRicetta      = new EstremiRicetta();
//        it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta.EstremiPaziente estremiPaziente     = new EstremiPaziente();
//        Richiedente                                                                   estremiRichiedente  = new Richiedente();
//        InformazioniRichiedente                                                       informazioniRichiedente = new InformazioniRichiedente();
//
//        // When
//
//        //Estremi paziente e ricetta e informazioniRichiedente
//        estremiRicetta.setNre("010D00000000254");
//        estremiRicetta.setRegionePrescrizione("RP");
//        estremiRicetta.setTipoPrescrizione("F");
//        estremiPaziente.setCodiceFiscale("CRPYNN77A61B791K");
//        estremiRichiedente.setServizioApplicativoChiamante("Servizio Attivo");
//        estremiRichiedente.setUuid("212313124123");
//        informazioniRichiedente.setCodiceFiscaleUtente("DDDDEEEEFFFFGGGG");
//        informazioniRichiedente.setContestoOperativo("DMA");
//        informazioniRichiedente.setIdentificativoIpRichiedente("127.0.0.2");
//        informazioniRichiedente.setRuoloUtente("Richiedente");
//
//        //Settaggio dei parametri di request   TODO finire di settarli per bene
//        request.setCodiceFiscalePaziente(estremiPaziente.getCodiceFiscale());
//        request.setDataInizioRange(new DateTime(2019, 7, 21, 0, 0, 0, 0).toDate());
//        request.setDataFineRange(new DateTime(2019, 12, 21, 0, 0, 0, 0).toDate());
//        request.setCodiceFiscaleUtenteRich(informazioniRichiedente.getCodiceFiscaleUtente());
//
//
//        //Setting dei parametri per il costruttore di prorel:
//        String nreRicetta                      = estremiRicetta.getNre();
//        String regionePrescrizione             = estremiRicetta.getRegionePrescrizione();
//        String tipoPrescrizione                = estremiRicetta.getTipoPrescrizione();
//        String codiceFiscaleRichiedente        = request.getCodiceFiscaleUtenteRich();
//        String contestoOpRichiedente           = informazioniRichiedente.getContestoOperativo();
//        String identificatoIpUtenteRichiedente = informazioniRichiedente.getIdentificativoIpRichiedente();
//        String ruoloUtenteRichiedente          = informazioniRichiedente.getRuoloUtente();
//        String codiceFiscalePaziente           = estremiPaziente.getCodiceFiscale();
//        String servizioApplicativoChiamante    = estremiRichiedente.getServizioApplicativoChiamante();
//        String uuidEstremiRichiedente          = estremiRichiedente.getUuid();
//        // Then
//
//        DettaglioRicettaInvocation result = null;
//        try {
//            result = dettaglioNREService.processRequest(request);
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
////         catch (IncomingRequestValidationException e) {
////            System.err.println(e.getMessage());
////        }
//
//        dmawsClient.invokeDettaglioRicetta(nreRicetta, regionePrescrizione, tipoPrescrizione, codiceFiscaleRichiedente, contestoOpRichiedente, identificatoIpUtenteRichiedente, ruoloUtenteRichiedente, codiceFiscalePaziente, servizioApplicativoChiamante, uuidEstremiRichiedente);
//        // Expect
//        assertNotNull(result);
//        System.out.println("callNascondiNre " + result);
//    }

    //CONTROLLI PARAMETRI IN INGRESSO DOPO AVER EFFETTUATO IL CONTROLLO DELEGA:

    //    @Test
//    public void controlloParametriIngressoCasoRegionaleTrueAndTipologiaP() {
//        // Setup
//        ElencoRicetteNREService      elencoRicetteNREService = new ElencoRicetteNREService();
//        ElencoRicetteNREReqContainer req                     = new ElencoRicetteNREReqContainer();
//        req.setTipologia("P");
//        req.setRegionale(true);
//
//        // When
//        int result = -1;
//        try {
//            result = elencoRicetteNREService.checkRequestAndCallSpecificWS(req);
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//
//        // Then
//
//        // Expect
//        assertTrue(result > -1);
//
//    }
//
//    @Test
//    public void controlloParametriIngressoCasoRegionaleTrueAndTipologiaF() {
//        // Setup
//        ElencoRicetteNREService      elencoRicetteNREService = new ElencoRicetteNREService();
//        ElencoRicetteNREReqContainer req                     = new ElencoRicetteNREReqContainer();
//        req.setTipologia("F");
//        req.setRegionale(true);
//
//        // When
//        int result = -1;
//        try {
//            result = elencoRicetteNREService.checkRequestAndCallSpecificWS(req);
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//
//        // Then
//
//        // Expect
//        assertTrue(result > 1);
//    }
//
//    @Test
//    public void controlloParametriIngressoCasoRegionaleTrueAndTipologiaNull() {
//        // Setup
//        ElencoRicetteNREService      elencoRicetteNREService = new ElencoRicetteNREService();
//        ElencoRicetteNREReqContainer req                     = new ElencoRicetteNREReqContainer();
//        req.setTipologia("F");
//        req.setRegionale(true);
//
//        // When
//        int result = -1;
//        try {
//            result = elencoRicetteNREService.checkRequestAndCallSpecificWS(req);
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//
//        // Then
//
//        // Expect
//        assertTrue(result > -1);
//    }


//    @Test
//    public void callDMADettaglioRicettaCaso3() {
//     /*   CONTESTO_OPERATIVO: costante PERSONAL;
//        IDENTIFICATIVO_IP_RICHIEDENTE: chiedo in che modo recuparlo;
//        RUOLO_UTENTE: devo chiedere;
//        SERVIZIO CHIAMANTE: deve contenere il valore del campo X-Codice-Servizio presente nell'header;
//       UUID: deve contenere il valore del campo X-Request-ID presente nell'header;
//        REGIONE_PRESCRIZIONE=RP o EXTRA_RP */
//
//        // Setup
//        DettaglioNREService        dettaglioNREService        = new DettaglioNREService();
//        DettaglioRicettaInvocation dettaglioRicettaInvocation = new DettaglioRicettaInvocation();
//        Date                       dataInizio                 = new Date();
//        Date                       dataFine                   = new Date();
//
//        String  HEADER_ShibIdentitaCodiceFiscale = "AAAAAA00B77B000F";
//        String  HEADER_XRequestID                = "";
//        String  HEADER_XCodiceServzio            = "";
//        String  PATH_Cf                          = "CRPYNN77A61B791K";
//        String  PATH_Tipologia                   = null;
//        Boolean PATH_Regionale                   = false;
//        Date    PATH_DataInizio                  = new DateTime(2019, 1, 1, 0, 0, 0, 0).toDate();
//        Date    PATH_DatFine                     = new DateTime(2019, 12, 31, 0, 0, 0, 0).toDate();
//        String  tipoPrescrizione                 = null;
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
//        dettaglioRicettaInvocation.setDataInizioRange(dataInizio);
//        dettaglioRicettaInvocation.setDataFineRange(dataFine);
//        dettaglioRicettaInvocation.setCodiceFiscalePaziente(PATH_Cf);
//        dettaglioRicettaInvocation.setCodiceFiscaleUtenteRich(HEADER_ShibIdentitaCodiceFiscale);
//        dettaglioRicettaInvocation.setContestoOperativo(contestoOperativo);
//        dettaglioRicettaInvocation.setRuoloUtente(ruoloUtente);
//        dettaglioRicettaInvocation.setIdentificatoIpRichiedente(identificativoIpRichiedente);
//        dettaglioRicettaInvocation.setServizioAppChiamante(servizioChiamante);
//        dettaglioRicettaInvocation.setUUUIDRichiedente(uuidRichiedente);
//        dettaglioRicettaInvocation.setRegionePrescrizione(regionePrescrizione);
//        dettaglioRicettaInvocation.setRegionale(PATH_Regionale);
//        dettaglioRicettaInvocation.setTipoPrescrizione(tipoPrescrizione);
//        dettaglioRicettaInvocation.setTipoPrescrizione(PATH_Tipologia);
//
//        // Impostazioni SAR
//        dettaglioRicettaInvocation.setNre(null);
//        dettaglioRicettaInvocation.setTipoRegime("DM");
//        dettaglioRicettaInvocation.setTipoRicetta("I");
//        dettaglioRicettaInvocation.setTipoPrescrizione("P");
//        dettaglioRicettaInvocation.setRicetteScadute("N");
//        dettaglioRicettaInvocation.setRicErogNonSSN("N");
//        dettaglioRicettaInvocation.setRegionePrescrizione("P");
//
//        // Then
//        DettaglioRicettaInvocation result = null;
//        try {
//            result = dettaglioNREService.processRequest(dettaglioRicettaInvocation);
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//        // Expect
//        assertNotNull(result);
//        System.out.println("callDMAElencoRicetteStampaPromemoriaWS " + result);
//    }


}

