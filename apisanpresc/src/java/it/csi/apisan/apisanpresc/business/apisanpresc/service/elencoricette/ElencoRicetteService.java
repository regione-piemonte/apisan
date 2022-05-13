/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.business.apisanpresc.service.elencoricette;

import it.csi.apisan.apisanpresc.business.apisanpresc.DMAUtils;
import it.csi.apisan.apisanpresc.business.apisanpresc.exceptions.LogauditException;
import it.csi.apisan.apisanpresc.business.apisanpresc.service.ApisanPrescBaseService;
import it.csi.apisan.apisanpresc.common.ApiSanPrescConstants;
import it.csi.apisan.apisanpresc.dto.apisanpresc.ErroreDettaglio;
import it.csi.apisan.apisanpresc.exception.DMAResponseKOException;
import it.csi.apisan.apisanpresc.exception.SARResponseKOException;
import it.csi.apisan.apisanpresc.soap.dma.DMAWSClient;
import it.csi.apisan.apisanpresc.soap.dma.elencoricetteservice.*;
import it.csi.apisan.apisanpresc.soap.pro.PRORELWSClient;
import it.csi.apisan.apisanpresc.soap.pro.elenconrenascosti.ElencoNreNascostiResponse;
import it.csi.apisan.apisanpresc.soap.pro.logaudit.LogAuditResponse;
import it.csi.apisan.apisanpresc.soap.sar.SARWSClient;
import it.csi.apisan.apisanpresc.soap.sar.visprescsol.ElencoRicetteType;
import it.csi.apisan.apisanpresc.soap.sar.visprescsol.InfoRicettaType;
import it.csi.apisan.apisanpresc.soap.sar.visprescsol.VisualizzaPrescrittoPazienteSOLRicevuta;
import it.csi.apisan.apisanpresc.util.ApisanPrescUtil;
import it.csi.apisan.apisanpresc.util.LogUtil;
import it.csi.apisan.apisanpresc.util.RicettaModelUtil;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class ElencoRicetteService extends ApisanPrescBaseService<ElencoRicetteInvocation> {

    private static final String  ELENCO_RICETTE_SERVICE = "ElencoRicetteService";
    private              LogUtil _log                   = new LogUtil(this.getClass());

    private static final int FLOW_IS_SPECIALISTICA_AND_REG_TRUE = 1;
    private static final int FLOW_FARMACEUTICA_AND_REG_TRUE     = 2;
    private static final int FLOW_REG_FALSE                     = 3;

    public ElencoRicetteService() {

    }

    @Override
    public ElencoRicetteInvocation processRequest(ElencoRicetteInvocation elencoRicetteInvocation) {

        try {
            _log.info("execute", "ElencoRicette service start...");

            logIncomingRequest(elencoRicetteInvocation);
            invokeWsLogAudit(elencoRicetteInvocation);

            switch (routeRequest(elencoRicetteInvocation)) {
                case FLOW_IS_SPECIALISTICA_AND_REG_TRUE: {     //TODO (modifica Egidio SAR01) modificare questo passaggio
                    try {
                    	//modifica Egidio SAR01 da qua
                    	invokeWsDMAElencoRicetteStampaPromemoriaWhenRegionaleIsTrue(elencoRicetteInvocation);
                        invokeWsVisualizzaPrescrittoPazienteSpecialistica(elencoRicetteInvocation);
                    	//modifica Egidio SAR01 a qua
                        processResponseForSpecialistica(elencoRicetteInvocation);
                        nascondiNreAndComplete(elencoRicetteInvocation);
                    } catch (SARResponseKOException e) {
                        _log.error("ERRORE SAR", e.getMessage(), e);
                        returnErrorMessage(elencoRicetteInvocation, ELENCO_RICETTE_SERVICE, e, e.getStatusCodeReturnError());
                    } catch (DMAResponseKOException e) {
                        if (!DMAUtils.DMA_NO_ELENCORICETTE_PER_UTENTE.equals(e.getCodiceErrore())) {
                        	 _log.error("ERRORE DMA", e.getMessage(), e);
                            returnErrorMessage(elencoRicetteInvocation, ELENCO_RICETTE_SERVICE, e, e.getStatusCodeReturnError());
                        }
                    } 
                    catch (Exception e) {
                        _log.error("execute", e.getMessage(), e);
                        returnErrorMessage(elencoRicetteInvocation, ELENCO_RICETTE_SERVICE, e);
                    }
                }
                break;
                case FLOW_FARMACEUTICA_AND_REG_TRUE: {
                    try {
                        invokeWsDMAElencoRicetteStampaPromemoriaWhenRegionaleIsTrue(elencoRicetteInvocation);
                        invokeWsVisualizzaPrescrittoPazienteFarmaceutica(elencoRicetteInvocation);
                        processResponseForFarmaceutica(elencoRicetteInvocation);
                        nascondiNreAndComplete(elencoRicetteInvocation);
                    } catch (SARResponseKOException e) {
                        _log.error("ERRORE SAR", e.getMessage(), e);
                        returnErrorMessage(elencoRicetteInvocation, ELENCO_RICETTE_SERVICE, e, e.getStatusCodeReturnError());
                    } catch (DMAResponseKOException e) {
                        if (!DMAUtils.DMA_NO_ELENCORICETTE_PER_UTENTE.equals(e.getCodiceErrore())) {
                        	_log.error("ERRORE DMA", e.getMessage(), e);
                            returnErrorMessage(elencoRicetteInvocation, ELENCO_RICETTE_SERVICE, e, e.getStatusCodeReturnError());
                        }
                    } catch (Exception e) {
                        _log.error("execute", e.getMessage(), e);
                        returnErrorMessage(elencoRicetteInvocation, ELENCO_RICETTE_SERVICE, e);
                    }
                }
                break;
                case FLOW_REG_FALSE: {
                    try {
                        invokeWsDMAElencoRicetteStampaPromemoriaWhenRegionaleIsFalse(elencoRicetteInvocation);
                        processResponseWhenRegionaleIsFalse(elencoRicetteInvocation);
                        nascondiNreAndComplete(elencoRicetteInvocation);
                    } catch (DMAResponseKOException e) {
                        _log.error("ERRORE DMA", e.getMessage(), e);
                        if (!DMAUtils.DMA_NO_ELENCORICETTE_PER_UTENTE.equals(e.getCodiceErrore())) {
                            returnErrorMessage(elencoRicetteInvocation, ELENCO_RICETTE_SERVICE, e, e.getStatusCodeReturnError());
                        }
                    } catch (Exception e) {
                        _log.error("execute", e.getMessage(), e);
                        returnErrorMessage(elencoRicetteInvocation, ELENCO_RICETTE_SERVICE, e);
                    }
                }
                break;
            }

        } catch (LogauditException e) {
            _log.error("execute", e.getMessage(), e);
            returnErrorMessage(elencoRicetteInvocation, ELENCO_RICETTE_SERVICE, e, 500, "invokeWsLogAudit");
        } catch (
                Exception e) {
            _log.error("execute", e.getMessage(), e);
            returnErrorMessage(elencoRicetteInvocation, ELENCO_RICETTE_SERVICE, e);
        }

        return elencoRicetteInvocation;
    }

    private void nascondiNreAndComplete(ElencoRicetteInvocation elencoRicetteInvocation) throws Exception {
        invokeWsElencoNreNascosti(elencoRicetteInvocation);
        processResponseForNreNascosti(elencoRicetteInvocation);
        logOutboundResponse(elencoRicetteInvocation);
        exitFlow();
    }

    private void exitFlow() {
        _log.info("exitFlow()", "ElencoRicetteNREService concluso");
    }

    private void logOutboundResponse(ElencoRicetteInvocation elencoRicetteInvocation) {
        _log.info("execute", "logOutboundResponse");
    }

    private void processResponseForNreNascosti(ElencoRicetteInvocation eri) throws Exception {
        _log.info("execute", "processResponseForNreNascosti");
        final List<String> nreToHide;

        /* Check consistency*/
        if (eri.getElencoNreNascostiResponse() == null || eri.getElencoNreNascostiResponse().getListaNre() == null ||
                eri.getElencoNreNascostiResponse().getListaNre().getNre() == null || eri.getElencoNreNascostiResponse().getListaNre().getNre().size() == 0) {
            nreToHide = new ArrayList<>();
//            throw new Exception("NPE on elencoRicetteInvocation.getElencoNreNascostiResponse()");
        } else {
            nreToHide = eri.getElencoNreNascostiResponse().getListaNre().getNre();
        }
        // Nascondi ricette
        eri.getEntityResponse().stream().filter(modelRicetta -> nreToHide.contains(modelRicetta.getNre())).forEach(modelRicetta -> modelRicetta.setNascosta(true));
    }


    // TODO Creare una classe astratta base per le invocation, in modo da esternalizzare metodi accessori come questi
    private void returnErrorMessage(ElencoRicetteInvocation invocation, String metodo, Exception exception) {
        returnErrorMessage(invocation, metodo, exception, 500);
    }

    // TODO Creare una classe astratta base per le invocation, in modo da esternalizzare metodi accessori come questi
    private void returnErrorMessage(ElencoRicetteInvocation invocation, String metodo, Exception exception, int statusCode) {
        returnErrorMessage(invocation, metodo, exception, statusCode, exception.getMessage());
    }

    // TODO Creare una classe astratta base per le invocation, in modo da esternalizzare metodi accessori come questi
    private void returnErrorMessage(ElencoRicetteInvocation invocation, String metodo, Exception exception, int statusCode, String title) {
        ErroreDettaglio erroreDettaglio = new ErroreDettaglio();
        erroreDettaglio.put("metodo", metodo);
        erroreDettaglio.put("dettaglioErrore", exception.getMessage());
        erroreDettaglio.put("causa", exception.getCause() != null ? exception.getCause().getMessage() : "");
        invocation.getErrore().getDetail().add(erroreDettaglio);
        invocation.getErrore().setStatus(statusCode);
        invocation.getErrore().setTitle(title);
    }

    private void logIncomingRequest(ElencoRicetteInvocation request) {
        _log.info("execute", "logIncomingRequest");
    }

    private void processResponseForSpecialistica(ElencoRicetteInvocation eri) {
        // Da analisi, impostare il flag completo = true
    	
    	//modifica Egidio SAR01 da qua
    	final List<Ricetta>         elencoRicetteDMA;
    	final String                codiceFiscaleUtente = eri.getCodiceFiscalePaziente();
    	
    	 elencoRicetteDMA = Optional.ofNullable(eri.getElencoRicetteStampaPromemoriaResponse())
                 .map(ElencoRicetteStampaPromemoriaResponse::getListaRicette)
                 .map(ListaRicetteType::getRicetta)
                 .orElse(new ArrayList<>());
    	//modifica Egidio SAR01 a qua
    	  
        List<InfoRicettaType> elencoRicetteSAR = Optional.ofNullable(eri.getVisualizzaPrescrittoPazienteSOLRicevuta())
                .map(VisualizzaPrescrittoPazienteSOLRicevuta::getElencoRicette)
                .map(ElencoRicetteType::getInfoRicetta)
                .orElse(new ArrayList<>());
      //modifica Egidio SAR01 commento da qua
       /* elencoRicetteSAR.forEach(infoRicettaTypeFromSar -> {
            eri.getEntityResponse().add(RicettaModelUtil.makeModelRicetteFromSAR(infoRicettaTypeFromSar, eri.getCodiceFiscalePaziente(), false, true));
        });*/
       //modifica Egidio SAR01 commento a qua  
      //modifica Egidio SAR01 da qua
        elencoRicetteDMA.forEach(ricettaDMA -> {

            // Caso in cui e' presente sia in SAR che in DMA => Flag completo = true
            Optional<InfoRicettaType> isPresentInDMAAndSAR = elencoRicetteSAR.stream()
                    .filter(infoRicettaType -> infoRicettaType.getNre().equals(ricettaDMA.getNre()))
                    .findFirst();

            if (isPresentInDMAAndSAR.isPresent()) {
                InfoRicettaType infoRicettaTypeSAR = isPresentInDMAAndSAR.get();
                eri.getEntityResponse().add(RicettaModelUtil.mergeDMAandSAR(ricettaDMA, infoRicettaTypeSAR, codiceFiscaleUtente, ApiSanPrescConstants.TIPOLOGIA_PRESCRIZIONE_SPECIALISTICA_P));
            } else {
                eri.getEntityResponse().add(RicettaModelUtil.makeModelElencoRicetteFromDMA(ricettaDMA, false, true, ApiSanPrescConstants.TIPOLOGIA_PRESCRIZIONE_SPECIALISTICA_P, false));
            }
        });

      //modifica Egidio SAR01 a qua
    }

    private void processResponseWhenRegionaleIsFalse(ElencoRicetteInvocation eri) {
        List<Ricetta> elencoRicetteDMA = Optional.ofNullable(eri.getElencoRicetteStampaPromemoriaResponse())
                .map(ElencoRicetteStampaPromemoriaResponse::getListaRicette)
                .map(ListaRicetteType::getRicetta)
                .orElse(new ArrayList<>());
        elencoRicetteDMA.forEach(ricettaDMA -> {
            eri.getEntityResponse().add(RicettaModelUtil.makeModelElencoRicetteFromDMA(ricettaDMA, false, false, eri.getTipologia(), false));
        });
    }

    private void processResponseForFarmaceutica(ElencoRicetteInvocation eri) throws Exception {
        // Se ricetta presente in fascicolo (DMA) ma non in sar, non vengono popolati i dati di dettagli non disponibili da DMA, inoltre il flag di completo = false
        // Se i dati sono presenti su SAR, venongo popolati i dati di dettaglio mancanti, inoltre il flag completo = true
        // Se la ricetta e' presente nel sar e non nel DMA non viene considerata

        final List<Ricetta>         elencoRicetteDMA;
        final List<InfoRicettaType> elencoRicetteSAR;
        final String                codiceFiscaleUtente = eri.getCodiceFiscalePaziente();

        /* Get data from responses... */
        elencoRicetteDMA = Optional.ofNullable(eri.getElencoRicetteStampaPromemoriaResponse())
                .map(ElencoRicetteStampaPromemoriaResponse::getListaRicette)
                .map(ListaRicetteType::getRicetta)
                .orElse(new ArrayList<>());
        elencoRicetteSAR = Optional.ofNullable(eri.getVisualizzaPrescrittoPazienteSOLRicevuta())
                .map(VisualizzaPrescrittoPazienteSOLRicevuta::getElencoRicette)
                .map(ElencoRicetteType::getInfoRicetta)
                .orElse(new ArrayList<>());

        elencoRicetteDMA.forEach(ricettaDMA -> {

            // Caso in cui e' presente sia in SAR che in DMA => Flag completo = true
            Optional<InfoRicettaType> isPresentInDMAAndSAR = elencoRicetteSAR.stream()
                    .filter(infoRicettaType -> infoRicettaType.getNre().equals(ricettaDMA.getNre()))
                    .findFirst();

            if (isPresentInDMAAndSAR.isPresent()) {
                InfoRicettaType infoRicettaTypeSAR = isPresentInDMAAndSAR.get();
                eri.getEntityResponse().add(RicettaModelUtil.mergeDMAandSAR(ricettaDMA, infoRicettaTypeSAR, codiceFiscaleUtente, ApiSanPrescConstants.TIPOLOGIA_PRESCRIZIONE_FARMACEUTICA_F));
            } else {
                eri.getEntityResponse().add(RicettaModelUtil.makeModelElencoRicetteFromDMA(ricettaDMA, false, true, ApiSanPrescConstants.TIPOLOGIA_PRESCRIZIONE_FARMACEUTICA_F, false));
            }
        });


    }

    private int routeRequest(ElencoRicetteInvocation req) {

        int     result      = -1;
        boolean isRegionale = req.getRegionale();
        String  tipologia   = req.getTipologia();

        if (isRegionale && tipologia.equalsIgnoreCase("P")) {
            result = FLOW_IS_SPECIALISTICA_AND_REG_TRUE;
        }

        if (isRegionale && tipologia.equalsIgnoreCase("F")) {
            result = FLOW_FARMACEUTICA_AND_REG_TRUE;
        }

        if (!isRegionale) {
            result = FLOW_REG_FALSE;
        }

        return result;
    }


    private void invokeWsLogAudit(ElencoRicetteInvocation elencoRicetteInvocation) throws Exception {
        _log.info("execute", "invokeWsLogAudit");

        /* Populate data */
        String descrizioneAudit = "Accesso dell'utente " + elencoRicetteInvocation.getCodiceFiscaleUtenteRich() + " al servizio " +
                elencoRicetteInvocation.getxCodiceServizio() + " per ricercare le ricette del paziente " + elencoRicetteInvocation.getCodiceFiscalePaziente();
        String codice                    = ApiSanPrescConstants.CODICE_PRO_ELE_RIC;
        String identificativoRich        = elencoRicetteInvocation.getxRequestID();
        String servizioAppChiamante      = elencoRicetteInvocation.getxCodiceServizio();
        String codiceFiscaleUtenteRich   = elencoRicetteInvocation.getCodiceFiscaleUtenteRich();
        String identificatoIpRichiedente = elencoRicetteInvocation.getIpRequest();
        String codiceFiscalePaziente     = elencoRicetteInvocation.getCodiceFiscalePaziente();

        PRORELWSClient prorelwsClient = new PRORELWSClient();

        /* Execute call */
        LogAuditResponse logAuditResponse = null;
        try {
            logAuditResponse = prorelwsClient.logAudit(codiceFiscalePaziente, descrizioneAudit, codice, identificativoRich, servizioAppChiamante, codiceFiscaleUtenteRich, identificatoIpRichiedente);
        } catch (Exception e) {
        	e.printStackTrace();
            _log.error("invokeWsLogAudit", e.getMessage(), e);
            throw new LogauditException(e.getMessage());
        }

        elencoRicetteInvocation.setLogAuditResponse(logAuditResponse);

    }

    private void invokeWsDMAElencoRicetteStampaPromemoriaWhenRegionaleIsFalse(ElencoRicetteInvocation req) throws
            DMAResponseKOException, WebServiceException {
        _log.info("execute", "invokeWsDMAElencoRicetteStampaPromemoria");
        ElencoRicetteStampaPromemoriaResponse elencoRicetteStampaPromemoriaResponse = null;

        String               codiceFiscalePaziente       = req.getCodiceFiscalePaziente();
        String               codiceFiscaleutente         = req.getCodiceFiscaleUtenteRich();
        String               identificativoIpRichiedente = req.getIpRequest();
        String               applicativoChiamante        = req.getxCodiceServizio();
        String               uuidRichiedente             = req.getxRequestID();
        XMLGregorianCalendar dataInizio                  = ApisanPrescUtil.toGregorianCalendarFromDate(req.getDataInizioRange());
        XMLGregorianCalendar dataFine                    = ApisanPrescUtil.toGregorianCalendarFromDate(req.getDataFineRange());

        String contestoOperativo   = ApiSanPrescConstants.CONTESTO_OPERATIVO;
        String regionePrescrizione = ApiSanPrescConstants.DMA_PARAM_ALTRA_REGIONE;
        String tipoPrescrizione    = req.getTipologia();
        String ruoloUtente         = ApisanPrescUtil.getRuoloDMA(codiceFiscalePaziente, codiceFiscaleutente);
//        String ricetteScadute      = ApiSanPrescConstants.DMA_PARAM_RICETTESCADUTE_S;
        String ricetteScadute = ApiSanPrescConstants.DMA_PARAM_RICETTESCADUTE_N;

        DMAWSClient dmawsClient = new DMAWSClient();

        /* Execute call */
        try {
            elencoRicetteStampaPromemoriaResponse = dmawsClient.invokeElencoRicetteWs(codiceFiscalePaziente, codiceFiscaleutente, contestoOperativo, identificativoIpRichiedente, ruoloUtente, applicativoChiamante, uuidRichiedente, regionePrescrizione, tipoPrescrizione, ricetteScadute, dataInizio, dataFine);
        } catch (Exception e) {
        	e.printStackTrace();
            _log.error("invokeWsDMAElencoRicetteStampaPromemoriaWhenRegionaleIsFalse", e.getMessage(), e);
            throw new WebServiceException("invokeWsDMAElencoRicetteStampaPromemoriaWhenRegionaleIsFalse", e);
        }

        checkDMAResponse(elencoRicetteStampaPromemoriaResponse);

        req.setElencoRicetteStampaPromemoriaResponse(elencoRicetteStampaPromemoriaResponse);

    }

    private void invokeWsDMAElencoRicetteStampaPromemoriaWhenRegionaleIsTrue(ElencoRicetteInvocation req) throws
            DMAResponseKOException, WebServiceException {
        _log.info("execute", "invokeWsDMAElencoRicetteStampaPromemoria");
        ElencoRicetteStampaPromemoriaResponse elencoRicetteStampaPromemoriaResponse = null;

        String               codiceFiscalePaziente       = req.getCodiceFiscalePaziente();
        String               codiceFiscaleutente         = req.getCodiceFiscaleUtenteRich();
        String               contestoOperativo           = ApiSanPrescConstants.CONTESTO_OPERATIVO;
        String               identificativoIpRichiedente = req.getIpRequest();
        String               applicativoChiamante        = req.getxCodiceServizio();
        String               uuidRichiedente             = req.getxRequestID();
        XMLGregorianCalendar dataInizio                  = ApisanPrescUtil.toGregorianCalendarFromDate(req.getDataInizioRange());
        XMLGregorianCalendar dataFine                    = ApisanPrescUtil.toGregorianCalendarFromDate(req.getDataFineRange());


        String regionePrescrizione = ApiSanPrescConstants.DMA_PARAM_REGIONE_PIEMONTE;
        String tipoPrescrizione    = req.getTipologia();

        String ruoloUtente = getRuoloDMA(codiceFiscalePaziente, codiceFiscaleutente);
//        String ricetteScadute      = ApiSanPrescConstants.DMA_PARAM_RICETTESCADUTE_S;
        String ricetteScadute = ApiSanPrescConstants.DMA_PARAM_RICETTESCADUTE_N;

        DMAWSClient dmawsClient = new DMAWSClient();

        /* Execute call */
        try {
            elencoRicetteStampaPromemoriaResponse = dmawsClient.invokeElencoRicetteWs(codiceFiscalePaziente, codiceFiscaleutente, contestoOperativo, identificativoIpRichiedente, ruoloUtente, applicativoChiamante, uuidRichiedente, regionePrescrizione, tipoPrescrizione, ricetteScadute, dataInizio, dataFine);
        } catch (Exception e) {
            _log.error("invokeWsDMAElencoRicetteStampaPromemoriaWhenRegionaleIsTrue", e.getMessage(), e);
            throw new WebServiceException("invokeWsDMAElencoRicetteStampaPromemoriaWhenRegionaleIsTrue", e);
        }

        checkDMAResponse(elencoRicetteStampaPromemoriaResponse);

        req.setElencoRicetteStampaPromemoriaResponse(elencoRicetteStampaPromemoriaResponse);

    }

    private String getRuoloDMA(String codiceFiscalePaziente, String codiceFiscaleutente) {
        String ruoloUtente;
        if (codiceFiscalePaziente.equals(codiceFiscaleutente))
            ruoloUtente = ApiSanPrescConstants.RUOLO_UTENTE_ASS;
        else
            ruoloUtente = ApiSanPrescConstants.RUOLO_UTENTE_DEL;
        return ruoloUtente;
    }


    private void invokeWsVisualizzaPrescrittoPazienteSpecialistica(ElencoRicetteInvocation elencoRicetteInvocation) throws
            Exception {
        _log.info("execute", "invokeWsVisualizzaPrescrittoPazienteSpecialistica");

        SARWSClient                             sarwsClient                             = new SARWSClient();
        VisualizzaPrescrittoPazienteSOLRicevuta visualizzaPrescrittoPazienteSOLRicevuta = null;

        /* Wrapping parameters */
        String nre                  = null;
        String cfPaziente           = sarwsClient.encryptSarCFAss(elencoRicetteInvocation.getCodiceFiscalePaziente());
        String cfRichiedente        = elencoRicetteInvocation.getCodiceFiscaleUtenteRich();
        Date   inizioRange          = elencoRicetteInvocation.getDataInizioRange();
        Date   fineRange            = elencoRicetteInvocation.getDataFineRange();
        String applicativoChiamante = elencoRicetteInvocation.getxCodiceServizio();
        String ip_address           = elencoRicetteInvocation.getIpRequest();

        /* Constants */
        String tipoPrescrizione    = ApiSanPrescConstants.SAR_PARAM_TIPOPRESCRIZIONE_SPECIALISTICA;
        String tipoRegime          = ApiSanPrescConstants.SAR_PARAM_TIPOREGIME_DM;
        String tipoRicetta         = ApiSanPrescConstants.SAR_PARAM_TIPO_RICETTA_I;
        String ricetteScadute      = ApiSanPrescConstants.SAR_PARAM_RICETTE_SCADUTE_N;
        String ricErogNonSSN       = ApiSanPrescConstants.SAR_RICEROG_NON_SSN;
        String regionePrescrizione = ApiSanPrescConstants.SAR_CONSTANTS_REGPRESC_P;


        /* Execute call */
        try {
            visualizzaPrescrittoPazienteSOLRicevuta = sarwsClient.invokeVisualizzaPrePazSOL(cfPaziente, cfRichiedente, inizioRange, fineRange, tipoPrescrizione, tipoRegime, tipoRicetta, ricetteScadute, ricErogNonSSN, nre, applicativoChiamante, regionePrescrizione, ip_address);
        } catch (Exception e) {
            _log.error("invokeWsVisualizzaPrescrittoPazienteSpecialistica", e.getMessage(), e);
            throw new Exception("invokeWsVisualizzaPrescrittoPazienteSpecialistica", e);

        }

        checkSARResponse(visualizzaPrescrittoPazienteSOLRicevuta, ELENCO_RICETTE_SERVICE);

        /* Response */
        elencoRicetteInvocation.setVisualizzaPrescrittoPazienteSOLRicevuta(visualizzaPrescrittoPazienteSOLRicevuta);

    }

    private void invokeWsVisualizzaPrescrittoPazienteFarmaceutica(ElencoRicetteInvocation elencoRicetteInvocation) throws
            Exception {
        _log.info("execute", "invokeWsVisualizzaPrescrittoPaziente");

        SARWSClient                             sarwsClient                             = new SARWSClient();
        VisualizzaPrescrittoPazienteSOLRicevuta visualizzaPrescrittoPazienteSOLRicevuta = null;

        /* Wrapping parameters */
        String nre                  = null;
        String cfPaziente           = sarwsClient.encryptSarCFAss(elencoRicetteInvocation.getCodiceFiscalePaziente());
        String cfRichiedente        = elencoRicetteInvocation.getCodiceFiscaleUtenteRich();
        Date   inizioRange          = elencoRicetteInvocation.getDataInizioRange();
        Date   fineRange            = elencoRicetteInvocation.getDataFineRange();
        String applicativoChiamante = elencoRicetteInvocation.getxCodiceServizio();
        String ip_address           = elencoRicetteInvocation.getIpRequest();

        /* Constants */
        String tipoPrescrizione    = ApiSanPrescConstants.SAR_PARAM_TIPOPRESCRIZIONE_FARMACEUTICA;
        String tipoRegime          = ApiSanPrescConstants.SAR_PARAM_TIPOREGIME_DM;
        String tipoRicetta         = ApiSanPrescConstants.SAR_PARAM_TIPO_RICETTA_I;
        String ricetteScadute      = ApiSanPrescConstants.SAR_PARAM_RICETTE_SCADUTE_N;
        String ricErogNonSSN       = ApiSanPrescConstants.SAR_RICEROG_NON_SSN;
        String regionePrescrizione = ApiSanPrescConstants.SAR_CONSTANTS_REGPRESC_P;


        /* Execute call */
        try {
            visualizzaPrescrittoPazienteSOLRicevuta = sarwsClient.invokeVisualizzaPrePazSOL(cfPaziente, cfRichiedente, inizioRange, fineRange, tipoPrescrizione, tipoRegime, tipoRicetta, ricetteScadute, ricErogNonSSN, nre, applicativoChiamante, regionePrescrizione, ip_address);
        } catch (Exception e) {
            _log.error("invokeWsVisualizzaPrescrittoPazienteFarmaceutica", e.getMessage(), e);
        }

        checkSARResponse(visualizzaPrescrittoPazienteSOLRicevuta, ELENCO_RICETTE_SERVICE);

        elencoRicetteInvocation.setVisualizzaPrescrittoPazienteSOLRicevuta(visualizzaPrescrittoPazienteSOLRicevuta);
    }

    private void invokeWsElencoNreNascosti(ElencoRicetteInvocation elencoRicetteInvocation) throws Exception {
        _log.info("execute", "invokeWsElencoNreNascosti");

        ElencoNreNascostiResponse elencoNreNascostiResponse = null;

        String codiceFiscalePaziente        = elencoRicetteInvocation.getCodiceFiscalePaziente();
        String codiceFiscaleRichiedente     = elencoRicetteInvocation.getCodiceFiscaleUtenteRich();
        String identificativoIpRich         = elencoRicetteInvocation.getIpRequest();
        String servizioApplicativoChiamante = elencoRicetteInvocation.getxCodiceServizio();
        String uuidRichiedente              = elencoRicetteInvocation.getxRequestID();

        PRORELWSClient prorelwsClient = new PRORELWSClient();

        /* Execute call */
        try {
            elencoNreNascostiResponse = prorelwsClient.elencoNreNascosti(codiceFiscalePaziente, codiceFiscaleRichiedente, identificativoIpRich, servizioApplicativoChiamante, uuidRichiedente);
        } catch (Exception e) {
            _log.error("invokeWsElencoNreNascosti", e.getMessage(), e);
            throw new Exception("invokeWsElencoNreNascosti", e);
        }

        elencoRicetteInvocation.setElencoNreNascostiResponse(elencoNreNascostiResponse);
    }

    private void checkDMAResponse(ElencoRicetteStampaPromemoriaResponse elencoRicetteStampaPromemoriaResponse) throws DMAResponseKOException {
        boolean hasError = Optional.ofNullable(elencoRicetteStampaPromemoriaResponse)
                .map(ElencoRicetteStampaPromemoriaResponse::getEsito)
                .filter(esito -> esito.equals(ApiSanPrescConstants.DMA_ESITO_ERRORE_CODE)).isPresent();

        if (hasError) {
            StringBuffer sbError = new StringBuffer("");
            elencoRicetteStampaPromemoriaResponse.getErrori().getErrore().forEach(errore -> {
                sbError.append(DMAUtils.parseErrorDMA(errore));
            });


            /* Dalla lista errori, prendo il primo result */
            String codeErrorDma = Optional.ofNullable(elencoRicetteStampaPromemoriaResponse)
                    .map(ElencoRicetteStampaPromemoriaResponse::getErrori)
                    .map(ListaErroriType::getErrore)
                    .map(errores -> errores.get(0))
                    .map(Errore::getCodiceEsito)
                    .orElse("");


            throw new DMAResponseKOException("Errore DMA - ElencoRicette:" + sbError.toString(), DMAUtils.getStatusCodeByErrorDMA(codeErrorDma), codeErrorDma);
        }
    }

}
