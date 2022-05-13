/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.test;

public class NascondiNreTest {

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
//        // Expect
//
//        assertTrue(validationResult != null);
//        assertTrue(validationResult.getValid());
//        assertTrue(validationResult.getErrorMessages() != null);
//        assertTrue(validationResult.getErrorMessages().size() == 0);
//        System.out.println(validationResult.toString());
//
//    }
//        @Test
//    public void logAuditRequestValidationRequestKO() {
//        // Setup
//            ValidationResult validationResult= null;
//            NascondiNRERequestData nascondiNreLogAuditServiceRequest = new NascondiNRERequestData();
//            Date dataInizio = new Date();
//            Date dataFine = new Date();
//
//
//        // When
//        // Not all required property are setted
//        nascondiNreLogAuditServiceRequest.setCodiceFiscalePaziente("A");
//        nascondiNreLogAuditServiceRequest.setCodiceFiscaleUtenteRich("TEST");
//        nascondiNreLogAuditServiceRequest.setNre("12");
//        nascondiNreLogAuditServiceRequest.setDataFineRange(dataInizio);
//        nascondiNreLogAuditServiceRequest.setDataFineRange(dataFine);
//        nascondiNreLogAuditServiceRequest.setUUID(UUID.randomUUID().toString());
//        // Then
//        validationResult = nascondiNreLogAuditServiceRequest.validate();
//
//        // Expect
//        assertTrue(validationResult != null);
//        assertTrue(!validationResult.getValid());
//        assertTrue(validationResult.getErrorMessages() != null);
//        assertTrue(validationResult.getErrorMessages().size() > 0);
//        System.out.println(validationResult.toString());
//
//    }

//    @Test
//    public void logAuditWSInvocation() {
//
//        // Setup
//        NascondiNREService    nascondiNREService = new NascondiNREService();
//        NascondiNREInvocation req                = new NascondiNREInvocation();
//        NascondiNreResponse   response           = new NascondiNreResponse();
//        Date                  dataInizio         = new Date();
//        Date                  dataFine           = new Date();
//        LogAuditRequest       logAuditRequest    = new LogAuditRequest();
//        UtenteRichiedente     utenteRichiedente  = new UtenteRichiedente();
//        SistemaRichiedente    sistemaRichiedente = new SistemaRichiedente();
//
//        // When
//        req.setCodiceFiscalePaziente("A");
//        req.setCodiceFiscaleUtenteRich("TEST");
//        req.setNre("12");
//        req.setDataInizioRange(dataInizio);
//        req.setDataFineRange(dataFine);
//        req.setUUID(UUID.randomUUID().toString());
//        NascondiNREInvocation result = null;
//
//        //chiamo il prorelWsClient
//        PRORELWSClient prorelWsClient = new PRORELWSClient();
//        Audit          audit          = new Audit();
//        audit.setCodice("TEST1");
//        audit.setDataOra("2019-04-02T00:00:00");
//        audit.setDescrizione("prova");
//
//        //Sistema ed utente richiedente
//        utenteRichiedente.setCodiceFiscale("AAAAAA00B77B000F");
//        utenteRichiedente.setIdentificativoIP("127.0.0.32");
//        sistemaRichiedente.setIdentificativoUnivocoRichiesta("1110");
//        sistemaRichiedente.setServizioApplicativoChiamante("TEST");
//
//        //inserisco i dati in logAudit:
//        logAuditRequest.setAudit(audit);
//        logAuditRequest.setSistemaRichiedente(sistemaRichiedente);
//
//        //settaggio dei valori per il costruttore:
//        String codice                            = audit.getCodice();
//        String codiceFiscale                     = utenteRichiedente.getCodiceFiscale();
//        String descrizioneAudit                  = audit.getDescrizione();
//        String identificativoRichiesta           = sistemaRichiedente.getIdentificativoUnivocoRichiesta();
//        String servizioApplicativoChiamante      = sistemaRichiedente.getServizioApplicativoChiamante();
//        String codiceFiscaleUtenteRichiedente    = utenteRichiedente.getCodiceFiscale();
//        String identificativoIpUtenteRichiedente = utenteRichiedente.getCodiceFiscale();
////         String data = audit.getDataOra();  (???)
//        // Then
//        try {
//            result = nascondiNREService.processRequest(req);
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
////        catch (IncomingRequestValidationException e) {
////            System.err.println(e.getMessage());
////        }
//        prorelWsClient.logAudit(codiceFiscale, descrizioneAudit, codice, identificativoRichiesta, servizioApplicativoChiamante, codiceFiscaleUtenteRichiedente, identificativoIpUtenteRichiedente);
//        // Expect
//        System.out.println("logAuditRequest() -  " + result);
//        assertTrue(!"".equals(result));
//        assertTrue("SUCCESSO".equals(result) || "FALLIMENTO".equals(result) || "AVVISO".equals(result));
//    }
//
//    @Test
//    public void callNascondiNRE() {
//        // Setup
//        NascondiNREService    nascondiNREService = new NascondiNREService();
//        NascondiNREInvocation request            = new NascondiNREInvocation();
//        PRORELWSClient        prorelWsClient     = new PRORELWSClient();
//        EstremiRicetta        estremiRicetta     = new EstremiRicetta();
//        EstremiPaziente       estremiPaziente    = new EstremiPaziente();
//        Richiedente           richiedente        = new Richiedente();
//
//        // When
//
//        //Estremi paziente e ricetta e richiedente
//        estremiRicetta.setNre("13");
//        estremiPaziente.setCodiceFiscale("DRRFRC95T02L049Z");
//        richiedente.setCodiceFiscaleRichiedente("AAAABBBBCCCCDDDD");
//        richiedente.setIdentificativoIpRichiedente("192.293.293.21");
//        richiedente.setServizioApplicativoChiamante("TEST");
//        richiedente.setUuid("Aldasamklasd");
//
//
//        //Settaggio dei parametri di request
//        request.setCodiceFiscalePaziente(estremiPaziente.getCodiceFiscale());
//        request.setDataInizioRange(new DateTime(2019, 7, 21, 0, 0, 0, 0).toDate());
//        request.setDataFineRange(new DateTime(2019, 12, 21, 0, 0, 0, 0).toDate());
//        request.setCodiceFiscaleUtenteRich("DRRFRC95T02L049Z");
//        request.setNre(estremiRicetta.getNre());
//        request.setUUID(UUID.randomUUID().toString());
//
//
//        //Setting dei parametri per il costruttore di prorel:
//        String nre                          = estremiRicetta.getNre();
//        String cfRichiedente                = request.getCodiceFiscaleUtenteRich();
//        String cf                           = request.getCodiceFiscalePaziente();
//        String ipRichiedente                = richiedente.getIdentificativoIpRichiedente();
//        String servizioApplicativoChiamante = richiedente.getServizioApplicativoChiamante();
//        String uuid                         = richiedente.getUuid();
//        // Then
//
//        NascondiNREInvocation result = null;
//        try {
//            result = nascondiNREService.processRequest(request);
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
////         catch (IncomingRequestValidationException e) {
////            System.err.println(e.getMessage());
////        }
//
//        prorelWsClient.nascondiNre(true,nre, cf, cfRichiedente, ipRichiedente, servizioApplicativoChiamante, uuid);
//
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

}
