/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.business.apisanpresc.service.dettaglioricette;

import it.csi.apisan.apisanpresc.business.apisanpresc.DMAUtils;
import it.csi.apisan.apisanpresc.business.apisanpresc.exceptions.LogauditException;
import it.csi.apisan.apisanpresc.business.apisanpresc.service.ApisanPrescBaseService;
import it.csi.apisan.apisanpresc.common.ApiSanPrescConstants;
import it.csi.apisan.apisanpresc.dto.apisanpresc.ErroreDettaglio;
import it.csi.apisan.apisanpresc.exception.DMAResponseKOException;
import it.csi.apisan.apisanpresc.exception.RicettaNascostaException;
import it.csi.apisan.apisanpresc.exception.SARResponseKOException;
import it.csi.apisan.apisanpresc.soap.dma.DMAWSClient;
import it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta.DettaglioRicettaPrescrittaResponse;
import it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta.Errore;
import it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta.ListaErroriType;
import it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta.Ricetta;
import it.csi.apisan.apisanpresc.soap.pro.PRORELWSClient;
import it.csi.apisan.apisanpresc.soap.pro.elenconrenascosti.ElencoNreNascostiResponse;
import it.csi.apisan.apisanpresc.soap.pro.elenconrenascosti.ListaNreType;
import it.csi.apisan.apisanpresc.soap.pro.logaudit.LogAuditResponse;
import it.csi.apisan.apisanpresc.soap.sar.SARWSClient;
import it.csi.apisan.apisanpresc.soap.sar.visprescsol.ElencoRicetteType;
import it.csi.apisan.apisanpresc.soap.sar.visprescsol.InfoRicettaType;
import it.csi.apisan.apisanpresc.soap.sar.visprescsol.VisualizzaPrescrittoPazienteSOLRicevuta;
import it.csi.apisan.apisanpresc.util.ApisanPrescUtil;
import it.csi.apisan.apisanpresc.util.LogUtil;
import it.csi.apisan.apisanpresc.util.RicettaModelUtil;

import javax.xml.ws.WebServiceException;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class DettaglioNREService extends ApisanPrescBaseService<DettaglioRicettaInvocation> {

    private static final String  DETTAGLIO_NRE_SERVICE = "DettaglioNREService";
    private              LogUtil _log                  = new LogUtil(this.getClass());

    private static final int FLOW_IS_SPECIALISTICA_AND_REG_TRUE = 1;
    private static final int FLOW_FARMACEUTICA_AND_REG_TRUE     = 2;
    private static final int FLOW_REG_FALSE                     = 3;

    HashMap<String, Object> resultExecution = new HashMap<>();

    public DettaglioNREService() {

    }

    @Override
    public DettaglioRicettaInvocation processRequest(DettaglioRicettaInvocation dettaglioRicettaInvocation) {

        try {
            _log.info("execute", "DettaglioRicetta service start...");

            logIncomingRequest(dettaglioRicettaInvocation);
            invokeWsLogAudit(dettaglioRicettaInvocation);

            switch (routeRequest(dettaglioRicettaInvocation)) {
                case FLOW_IS_SPECIALISTICA_AND_REG_TRUE: {
                    try {
                    	//modifica Egidio SAR01 da qua
                    	invokeWsDMADettaglioStampaPromemoriaWhenRegionaleIsTrue(dettaglioRicettaInvocation);
                        invokeWsVisualizzaPrescrittoPazienteSpecialistica(dettaglioRicettaInvocation);
                        processResponseForSpecialistica(dettaglioRicettaInvocation);
                        nascondiNreAndComplete(dettaglioRicettaInvocation);
                    } catch (SARResponseKOException e) {
                        _log.error("ERRORE SAR", e.getMessage(), e);
                        returnErrorMessage(dettaglioRicettaInvocation, DETTAGLIO_NRE_SERVICE, e, e.getStatusCodeReturnError());
                    } catch (RicettaNascostaException e) {
                        _log.error("execute", e.getMessage(), e);
                        returnErrorMessage(dettaglioRicettaInvocation, DETTAGLIO_NRE_SERVICE, e, 404);
                    }
                }
                break;
                case FLOW_FARMACEUTICA_AND_REG_TRUE: {
                    try {
                        invokeWsDMADettaglioStampaPromemoriaWhenRegionaleIsTrue(dettaglioRicettaInvocation);
                        invokeWsVisualizzaPrescrittoPazienteFarmaceutica(dettaglioRicettaInvocation);
                        processResponseForFarmaceutica(dettaglioRicettaInvocation);
                        nascondiNreAndComplete(dettaglioRicettaInvocation);
                    } catch (SARResponseKOException e) {
                        _log.error("ERRORE SAR", e.getMessage());
                        returnErrorMessage(dettaglioRicettaInvocation, DETTAGLIO_NRE_SERVICE, e, e.getStatusCodeReturnError());
                    } catch (DMAResponseKOException e) {
                        _log.error("ERRORE DMA", e.getMessage());
                        returnErrorMessage(dettaglioRicettaInvocation, DETTAGLIO_NRE_SERVICE, e, e.getStatusCodeReturnError());
                    } catch (RicettaNascostaException e) {
                        _log.error("execute", e.getMessage());
                        returnErrorMessage(dettaglioRicettaInvocation, DETTAGLIO_NRE_SERVICE, e, 404);
                    }
                }
                break;
                case FLOW_REG_FALSE: {
                    try {
                        invokeWsDMADettaglioStampaPromemoriaWhenRegionaleIsFalse(dettaglioRicettaInvocation);
                        processResponseDetailWhenRegionaleIsFalse(dettaglioRicettaInvocation);
                        nascondiNreAndComplete(dettaglioRicettaInvocation);
                    } catch (DMAResponseKOException e) {
                        _log.error("ERRORE DMA", e.getMessage());
                        returnErrorMessage(dettaglioRicettaInvocation, DETTAGLIO_NRE_SERVICE, e, e.getStatusCodeReturnError());
                    } catch (RicettaNascostaException e) {
                        _log.error("execute", e.getMessage());
                        returnErrorMessage(dettaglioRicettaInvocation, DETTAGLIO_NRE_SERVICE, e, 404);
                    }
                }
                break;
            }
        } catch (LogauditException e) {
            _log.error("execute", e.getMessage());
            returnErrorMessage(dettaglioRicettaInvocation, DETTAGLIO_NRE_SERVICE, e, 500, "invokeWsLogAudit");
        } catch (Exception e) {
            _log.error("execute", e.getMessage());
            returnErrorMessage(dettaglioRicettaInvocation, DETTAGLIO_NRE_SERVICE, e);
        }

        return dettaglioRicettaInvocation;
    }

    private void invokeWsVisualizzaPrescrittoPazienteFarmaceutica(DettaglioRicettaInvocation dettaglioRicettaInvocation) throws Exception, SARResponseKOException {
        _log.info("execute", "invokeWsVisualizzaPrescrittoPazienteFarmaceutica");

        SARWSClient                             sarwsClient                             = new SARWSClient();
        VisualizzaPrescrittoPazienteSOLRicevuta visualizzaPrescrittoPazienteSOLRicevuta = null;

        /* Wrapping parameters */
        String nre                  = null;
        String cfPaziente           = sarwsClient.encryptSarCFAss(dettaglioRicettaInvocation.getCodiceFiscalePaziente());
        String cfRichiedente        = dettaglioRicettaInvocation.getCodiceFiscaleUtenteRich();
        Date   inizioRange          = dettaglioRicettaInvocation.getDataInizioRange();
        Date   fineRange            = dettaglioRicettaInvocation.getDataFineRange();
        String applicativoChiamante = dettaglioRicettaInvocation.getxCodiceServizio();
        String ipaddress            = dettaglioRicettaInvocation.getIpRequest();

        /* Constants */
        String tipoPrescrizione    = ApiSanPrescConstants.SAR_PARAM_TIPOPRESCRIZIONE_FARMACEUTICA;
        String tipoRegime          = ApiSanPrescConstants.SAR_PARAM_TIPOREGIME_DM;
        String tipoRicetta         = ApiSanPrescConstants.SAR_PARAM_TIPO_RICETTA_I;
        String ricetteScadute      = ApiSanPrescConstants.SAR_PARAM_RICETTE_SCADUTE_N;
        String ricErogNonSSN       = ApiSanPrescConstants.SAR_RICEROG_NON_SSN;
        String regionePrescrizione = ApiSanPrescConstants.SAR_CONSTANTS_REGPRESC_P;


        /* Execute call */
        try {
            visualizzaPrescrittoPazienteSOLRicevuta = sarwsClient.invokeVisualizzaPrePazSOL(cfPaziente, cfRichiedente, inizioRange, fineRange, tipoPrescrizione, tipoRegime, tipoRicetta, ricetteScadute, ricErogNonSSN, nre, applicativoChiamante, regionePrescrizione, ipaddress);
        } catch (Exception e) {
            _log.error("invokeWsVisualizzaPrescrittoPazienteFarmaceutica", e.getMessage(), e);
        }

        checkSARResponse(visualizzaPrescrittoPazienteSOLRicevuta, DETTAGLIO_NRE_SERVICE);

        dettaglioRicettaInvocation.setVisualizzaPrescrittoPazienteSOLRicevuta(visualizzaPrescrittoPazienteSOLRicevuta);

    }

    private void nascondiNreAndComplete(DettaglioRicettaInvocation dettaglioRicettaInvocation) throws RicettaNascostaException {
        invokeWsElencoNreNascosti(dettaglioRicettaInvocation);
        logOutboundResponse(dettaglioRicettaInvocation);
        exitFlow();
    }

    private void exitFlow() {
        _log.info("exitFlow()", "ElencoRicetteNREService concluso");
    }

    private void logOutboundResponse(DettaglioRicettaInvocation req) {
        _log.info("execute", "logOutboundResponse");

    }

    // TODO Creare una classe astratta base per le invocation, in modo da esternalizzare metodi accessori come questi
    private void returnErrorMessage(DettaglioRicettaInvocation dettaglioRicettaInvocation, String metodo, Exception exception) {
        returnErrorMessage(dettaglioRicettaInvocation, metodo, exception, 500);
    }

    // TODO Creare una classe astratta base per le invocation, in modo da esternalizzare metodi accessori come questi
    private void returnErrorMessage(DettaglioRicettaInvocation dettaglioRicettaInvocation, String metodo, Exception exception, int statusCode) {
        returnErrorMessage(dettaglioRicettaInvocation, metodo, exception, statusCode, exception.getMessage());
    }

    // TODO Creare una classe astratta base per le invocation, in modo da esternalizzare metodi accessori come questi
    private void returnErrorMessage(DettaglioRicettaInvocation invocation, String metodo, Exception exception, int statusCode, String title) {
        ErroreDettaglio erroreDettaglio = new ErroreDettaglio();
        erroreDettaglio.put("metodo", metodo);
        erroreDettaglio.put("dettaglioErrore", exception.getMessage());
        erroreDettaglio.put("causa", exception.getCause() != null ? exception.getCause().getMessage() : "");
        invocation.getErrore().getDetail().add(erroreDettaglio);
        invocation.getErrore().setStatus(statusCode);
        invocation.getErrore().setTitle(title);
    }

    private void logIncomingRequest(DettaglioRicettaInvocation request) {
        _log.info("execute", "logIncomingRequest");
    }

    private void processResponseForSpecialistica(DettaglioRicettaInvocation dri) {
        // Da analisi, impostare il flag completo = true
    	 //modifica Egidio SAR01 commento da qua
       /* List<InfoRicettaType> elencoRicette = Optional.ofNullable(dri.getVisualizzaPrescrittoPazienteSOLRicevuta())
                .map(VisualizzaPrescrittoPazienteSOLRicevuta::getElencoRicette)
                .map(ElencoRicetteType::getInfoRicetta)
                .orElse(new ArrayList<>());
        elencoRicette.forEach(infoRicettaTypeFromSar -> {
            dri.setEntityResponse(RicettaModelUtil.makeModelRicetteFromSAR(infoRicettaTypeFromSar, dri.getCodiceFiscalePaziente(), false, true));
        });
        */
        //modifica Egidio SAR01 commento a qua
        
    	final Ricetta               dettaglioRicettaDMA;
        final List<InfoRicettaType> elencoRicetteSAR;
        final String                codiceFiscaleUtente = dri.getCodiceFiscalePaziente();

        /* Get data from responses... */
        dettaglioRicettaDMA = Optional.ofNullable(dri.getDettaglioRicettaPrescrittaResponse())
                .map(DettaglioRicettaPrescrittaResponse::getRicetta)
                .orElse(new Ricetta());
        elencoRicetteSAR    = Optional.ofNullable(dri.getVisualizzaPrescrittoPazienteSOLRicevuta())
                .map(VisualizzaPrescrittoPazienteSOLRicevuta::getElencoRicette)
                .map(ElencoRicetteType::getInfoRicetta)
                .orElse(new ArrayList<>());

        Optional<InfoRicettaType> isPresentInDMAAndSAR = elencoRicetteSAR.stream()
                .filter(infoRicettaType -> infoRicettaType.getNre().equals(dettaglioRicettaDMA.getNre()))
                .findFirst();

        if (isPresentInDMAAndSAR.isPresent()) {
            InfoRicettaType infoRicettaTypeSAR = isPresentInDMAAndSAR.get();
            dri.setEntityResponse(RicettaModelUtil.mergeDMAandSAR(dettaglioRicettaDMA, infoRicettaTypeSAR, codiceFiscaleUtente, ApiSanPrescConstants.TIPOLOGIA_PRESCRIZIONE_SPECIALISTICA_P));
        } else {
            dri.setEntityResponse(RicettaModelUtil.makeModelElencoRicetteFromDMA(dettaglioRicettaDMA, false, true, ApiSanPrescConstants.TIPOLOGIA_PRESCRIZIONE_SPECIALISTICA_P, false));
        }    	
        
    }

    private void processResponseDetailWhenRegionaleIsFalse(DettaglioRicettaInvocation eri) {
        eri.setEntityResponse(RicettaModelUtil.makeModelElencoRicetteFromDMA(eri.getDettaglioRicettaPrescrittaResponse().getRicetta(), false, false, ApiSanPrescConstants.TIPOLOGIA_PRESCRIZIONE_FARMACEUTICA_F, false));
    }

    private void processResponseForFarmaceutica(DettaglioRicettaInvocation dri) throws Exception {
        // Se ricetta presente in fascicolo (DMA) ma non in sar, non vengono popolati i dati di dettagli non disponibili da DMA, inoltre il flag di completo = false
        // Se i dati sono presenti su SAR, venongo popolati i dati di dettaglio mancanti, inoltre il flag completo = true
        // Se la ricetta e' presente nel sar e non nel DMA non viene considerata

        final Ricetta               dettaglioRicettaDMA;
        final List<InfoRicettaType> elencoRicetteSAR;
        final String                codiceFiscaleUtente = dri.getCodiceFiscalePaziente();

        /* Get data from responses... */
        dettaglioRicettaDMA = Optional.ofNullable(dri.getDettaglioRicettaPrescrittaResponse())
                .map(DettaglioRicettaPrescrittaResponse::getRicetta)
                .orElse(new Ricetta());
        elencoRicetteSAR    = Optional.ofNullable(dri.getVisualizzaPrescrittoPazienteSOLRicevuta())
                .map(VisualizzaPrescrittoPazienteSOLRicevuta::getElencoRicette)
                .map(ElencoRicetteType::getInfoRicetta)
                .orElse(new ArrayList<>());

        Optional<InfoRicettaType> isPresentInDMAAndSAR = elencoRicetteSAR.stream()
                .filter(infoRicettaType -> infoRicettaType.getNre().equals(dettaglioRicettaDMA.getNre()))
                .findFirst();

        if (isPresentInDMAAndSAR.isPresent()) {
            InfoRicettaType infoRicettaTypeSAR = isPresentInDMAAndSAR.get();
            dri.setEntityResponse(RicettaModelUtil.mergeDMAandSAR(dettaglioRicettaDMA, infoRicettaTypeSAR, codiceFiscaleUtente, ApiSanPrescConstants.TIPOLOGIA_PRESCRIZIONE_FARMACEUTICA_F));
        } else {
            dri.setEntityResponse(RicettaModelUtil.makeModelElencoRicetteFromDMA(dettaglioRicettaDMA, false, true, ApiSanPrescConstants.TIPOLOGIA_PRESCRIZIONE_FARMACEUTICA_F, false));
        }
    }

    public void invokeWsLogAudit(DettaglioRicettaInvocation dettaglioRicettaInvocation) throws LogauditException {
        _log.info("execute", "invokeWsLogAudit");

        /* Populate data */
        String descrizioneAudit = "Accesso dell'utente " + dettaglioRicettaInvocation.getCodiceFiscaleUtenteRich() + " al servizio " +
                dettaglioRicettaInvocation.getxCodiceServizio() + " per ricercare la ricetta "+ dettaglioRicettaInvocation.getNre() +" del paziente " + dettaglioRicettaInvocation.getCodiceFiscalePaziente();

        String codice                    = ApiSanPrescConstants.CODICE_PRO_DET_RIC;
        String identificativoRich        = dettaglioRicettaInvocation.getxRequestID();
        String servizioAppChiamante      = dettaglioRicettaInvocation.getxCodiceServizio();
        String codiceFiscaleUtenteRich   = dettaglioRicettaInvocation.getCodiceFiscaleUtenteRich();
        String identificatoIpRichiedente = dettaglioRicettaInvocation.getIpRequest();
        String codiceFiscalePaziente     = dettaglioRicettaInvocation.getCodiceFiscalePaziente();

        PRORELWSClient prorelwsClient = new PRORELWSClient();

        /* Execute call */
        LogAuditResponse logAuditResponse = null;
        try {
            logAuditResponse = prorelwsClient.logAudit(codiceFiscalePaziente, descrizioneAudit, codice, identificativoRich, servizioAppChiamante, codiceFiscaleUtenteRich, identificatoIpRichiedente);
        } catch (Exception e) {
            _log.error("invokeWsLogAudit", e.getMessage(), e);
            throw new LogauditException(e.getMessage());
        }

        dettaglioRicettaInvocation.setLogAuditResponse(logAuditResponse);

    }

    public void invokeWsDMADettaglioStampaPromemoriaWhenRegionaleIsTrue(DettaglioRicettaInvocation dri) throws DMAResponseKOException, WebServiceException {
        _log.info("execute", "invokeWsDMADettaglioStampaPromemoriaWhenRegionaleIsTrue");

        DettaglioRicettaPrescrittaResponse dettaglioRicettaPrescrittaResponse = null;
        DMAWSClient                        dmawsClient                        = new DMAWSClient();

        String nre                         = dri.getNre();
        String codiceFiscalePaziente       = dri.getCodiceFiscalePaziente();
        String codiceFiscaleutente         = dri.getCodiceFiscaleUtenteRich();
        String tipoPrescrizione            = dri.getTipologia();
        String identificativoIpRichiedente = dri.getIpRequest();
        String applicativoChiamante        = dri.getxCodiceServizio();
        String uuidRichiedente             = dri.getxRequestID();

        String contestoOperativo   = ApiSanPrescConstants.CONTESTO_OPERATIVO;
        String regionePrescrizione = ApiSanPrescConstants.DMA_PARAM_REGIONE_PIEMONTE;
        String ruoloUtente         = ApisanPrescUtil.getRuoloDMA(codiceFiscalePaziente, codiceFiscaleutente);

        /* Execute call */
        try {
            dettaglioRicettaPrescrittaResponse = dmawsClient.invokeDettaglioRicetta(nre, regionePrescrizione, tipoPrescrizione, codiceFiscaleutente, contestoOperativo, identificativoIpRichiedente, ruoloUtente, codiceFiscalePaziente, applicativoChiamante, uuidRichiedente);
        } catch (Exception e) {
            _log.error("invokeWsDMAElencoRicetteStampaPromemoriaWhenRegionaleIsFalse", e.getMessage(), e);
            throw new WebServiceException(e);
        }

        checkDMAResponse(dettaglioRicettaPrescrittaResponse);

        dri.setDettaglioRicettaPrescrittaResponse(dettaglioRicettaPrescrittaResponse);
    }

    public void invokeWsDMADettaglioStampaPromemoriaWhenRegionaleIsFalse(DettaglioRicettaInvocation dri) throws Exception {
        _log.info("execute", "invokeWsDMADettaglioStampaPromemoriaWhenRegionaleIsTrue");

        DettaglioRicettaPrescrittaResponse dettaglioRicettaPrescrittaResponse = null;
        DMAWSClient                        dmawsClient                        = new DMAWSClient();

        String nre                         = dri.getNre();
        String tipoPrescrizione            = dri.getTipologia();
        String codiceFiscalePaziente       = dri.getCodiceFiscalePaziente();
        String codiceFiscaleutente         = dri.getCodiceFiscaleUtenteRich();
        String identificativoIpRichiedente = dri.getIpRequest();
        String applicativoChiamante        = dri.getxCodiceServizio();
        String uuidRichiedente             = dri.getxRequestID();

        String contestoOperativo   = ApiSanPrescConstants.CONTESTO_OPERATIVO;
        String regionePrescrizione = ApiSanPrescConstants.DMA_PARAM_ALTRA_REGIONE;
        String ruoloUtente         = ApisanPrescUtil.getRuoloDMA(codiceFiscalePaziente, codiceFiscaleutente);

        /* Execute call */
        try {
            dettaglioRicettaPrescrittaResponse = dmawsClient.invokeDettaglioRicetta(nre, regionePrescrizione, tipoPrescrizione, codiceFiscaleutente, contestoOperativo, identificativoIpRichiedente, ruoloUtente, codiceFiscalePaziente, applicativoChiamante, uuidRichiedente);
        } catch (Exception e) {
            _log.error("invokeWsDMAElencoRicetteStampaPromemoriaWhenRegionaleIsFalse", e.getMessage(), e);
            throw new Exception(e);
        }

        checkDMAResponse(dettaglioRicettaPrescrittaResponse);

        dri.setDettaglioRicettaPrescrittaResponse(dettaglioRicettaPrescrittaResponse);
    }

    public void invokeWsVisualizzaPrescrittoPazienteSpecialistica(DettaglioRicettaInvocation dri) throws Exception {
        _log.info("execute", "invokeWsVisualizzaPrescrittoPazienteSpecialistica");

        SARWSClient                             sarwsClient                             = new SARWSClient();
        VisualizzaPrescrittoPazienteSOLRicevuta visualizzaPrescrittoPazienteSOLRicevuta = null;

        /* Wrapping parameters */
        String nre                  = dri.getNre();
        String cfPaziente           = sarwsClient.encryptSarCFAss(dri.getCodiceFiscalePaziente());
        String cfRichiedente        = dri.getCodiceFiscaleUtenteRich();
        Date   inizioRange          = dri.getDataInizioRange();
        Date   fineRange            = dri.getDataFineRange();
        String applicativoChiamante = dri.getxCodiceServizio();
        String ipaddress            = dri.getIpRequest();

        /* Constants */
        String tipoPrescrizione    = ApiSanPrescConstants.SAR_PARAM_TIPOPRESCRIZIONE_SPECIALISTICA;
        String tipoRegime          = ApiSanPrescConstants.SAR_PARAM_TIPOREGIME_DM;
        String tipoRicetta         = ApiSanPrescConstants.SAR_PARAM_TIPO_RICETTA_I;
        String ricetteScadute      = ApiSanPrescConstants.SAR_PARAM_RICETTE_SCADUTE_N;
        String ricErogNonSSN       = ApiSanPrescConstants.SAR_RICEROG_NON_SSN;
        String regionePrescrizione = ApiSanPrescConstants.SAR_CONSTANTS_REGPRESC_P;


        /* Execute call */
        try {
            visualizzaPrescrittoPazienteSOLRicevuta = sarwsClient.invokeVisualizzaPrePazSOL(cfPaziente, cfRichiedente, inizioRange, fineRange, tipoPrescrizione, tipoRegime, tipoRicetta, ricetteScadute, ricErogNonSSN, nre, applicativoChiamante, regionePrescrizione, ipaddress);
        } catch (Exception e) {
            _log.error("invokeWsVisualizzaPrescrittoPazienteSOL", e.getMessage(), e);
            throw new Exception(e);
        }

        checkSARResponse(visualizzaPrescrittoPazienteSOLRicevuta, DETTAGLIO_NRE_SERVICE);

        /* Response */
        dri.setVisualizzaPrescrittoPazienteSOLRicevuta(visualizzaPrescrittoPazienteSOLRicevuta);

    }

    public void invokeWsElencoNreNascosti(DettaglioRicettaInvocation dri) throws RicettaNascostaException, WebServiceException {
        _log.info("execute", "invokeWsElencoNreNascosti");

        ElencoNreNascostiResponse response = null;

        String codiceFiscalePaziente        = dri.getCodiceFiscalePaziente();
        String codiceFiscaleRichiedente     = dri.getCodiceFiscaleUtenteRich();
        String identificativoIpRich         = dri.getIdentificativoIpRichiedente();
        String servizioApplicativoChiamante = dri.getxCodiceServizio();
        String uuidRichiedente              = dri.getxRequestID();

        PRORELWSClient prorelwsClient = new PRORELWSClient();

        /* Execute call */
        try {
            /* Nel caso di dettaglio nre, se la ricetta è nascosta ritororna una eccezione 404, altimenti 500 */
            response = prorelwsClient.elencoNreNascosti(codiceFiscalePaziente, codiceFiscaleRichiedente, identificativoIpRich, servizioApplicativoChiamante, uuidRichiedente);
        } catch (Exception e) {
            _log.error("invokeWsElencoNreNascosti", e.getMessage(), e);
            throw new WebServiceException(e);
        }

        List<String> elencoNreNascosti = Optional.ofNullable(response)
                .map(ElencoNreNascostiResponse::getListaNre)
                .map(ListaNreType::getNre)
                .orElse(new ArrayList<String>());

        if (elencoNreNascosti.contains(dri.getNre())) {
            throw new RicettaNascostaException("La ricetta :" + dri.getNre() + " non puo' essere visualizzata perche' nascosta dall'utente");
        }

    }

    private int routeRequest(DettaglioRicettaInvocation dri) {

        int     result      = -1;
        boolean isRegionale = dri.getRegionale();
        String  tipologia   = dri.getTipologia();

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

    private void checkDMAResponse(DettaglioRicettaPrescrittaResponse dettaglioRicettaPrescrittaResponse) throws DMAResponseKOException {
        boolean hasError = Optional.ofNullable(dettaglioRicettaPrescrittaResponse)
                .map(DettaglioRicettaPrescrittaResponse::getEsito)
                .filter(esito -> esito.equals(ApiSanPrescConstants.DMA_ESITO_ERRORE_CODE)).isPresent();

        if (hasError) {
            StringBuffer             sbError          = new StringBuffer("");
            AtomicReference<Integer> resultStatusCode = null;
            dettaglioRicettaPrescrittaResponse.getErrori().getErrore().forEach(errore -> {
                sbError.append(DMAUtils.parseErrorDMA(errore));
            });

            /* Dalla lista errori, prendo il primo result */
            String codeErrorDma = Optional.ofNullable(dettaglioRicettaPrescrittaResponse)
                    .map(DettaglioRicettaPrescrittaResponse::getErrori)
                    .map(ListaErroriType::getErrore)
                    .map(errores -> errores.get(0))
                    .map(Errore::getCodiceEsito)
                    .orElse("");

            throw new DMAResponseKOException("Errore DMA - DettaglioRicetta:" + sbError.toString(), DMAUtils.getStatusCodeByErrorDMA(codeErrorDma), codeErrorDma);
        }
    }

}
