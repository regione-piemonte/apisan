/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.business.apisanpresc.service;

import it.csi.apisan.apisanpresc.business.apisanpresc.DMAUtils;
import it.csi.apisan.apisanpresc.business.apisanpresc.exceptions.LogauditException;
import it.csi.apisan.apisanpresc.business.apisanpresc.exceptions.ScaricaPdfRicettaException;
import it.csi.apisan.apisanpresc.business.apisanpresc.service.stampapdf.StampaPDFRicetteReqInvocation;
import it.csi.apisan.apisanpresc.common.ApiSanPrescConstants;
import it.csi.apisan.apisanpresc.dto.apisanpresc.ErroreDettaglio;
import it.csi.apisan.apisanpresc.exception.DMAResponseKOException;
import it.csi.apisan.apisanpresc.exception.SARResponseKOException;
import it.csi.apisan.apisanpresc.report.ElencoRicetteForReportUtils;
import it.csi.apisan.apisanpresc.report.RicetteForReport;
import it.csi.apisan.apisanpresc.soap.dma.DMAWSClient;
import it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta.Errore;
import it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta.ListaErroriType;
import it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta.ScaricaPdfRicettaResponse;
import it.csi.apisan.apisanpresc.soap.pro.PRORELWSClient;
import it.csi.apisan.apisanpresc.soap.pro.logaudit.LogAuditResponse;
import it.csi.apisan.apisanpresc.soap.sar.SARWSClient;
import it.csi.apisan.apisanpresc.soap.sar.visprescsol.InfoRicettaType;
import it.csi.apisan.apisanpresc.soap.sar.visprescsol.VisualizzaPrescrittoPazienteSOLRicevuta;
import it.csi.apisan.apisanpresc.util.ApisanPrescUtil;
import it.csi.apisan.apisanpresc.util.LogUtil;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.*;


public class StampaPDFRicetteService extends ApisanPrescBaseService<StampaPDFRicetteReqInvocation> {

    private static final String STAMPA_PDF_RICETTE_SERVICE = "StampaNREService";
    LogUtil _log = new LogUtil(this.getClass());

    private final int FLOW_P_AND_TRUE = 1;
    private final int FLOW_F_OR_FALSE = 2;

    private JasperReport            jasperReport;
    private HashMap<String, Object> resultExecution = new HashMap<>();

    public StampaPDFRicetteService() {

    }

    @Override
    public StampaPDFRicetteReqInvocation processRequest(StampaPDFRicetteReqInvocation requestData) {
        try {
            _log.info("execute", "StampaPDFRicetteService start...");
            logIncomingRequest(requestData);
            invokeWsLogAudit(requestData);

          //modifica Egidio SAR01 da qua
            invokeWsScaricaPdfRicetta(requestData);
            _log.info("execute - FLOW_F_AND_FALSE", "Esito: success getting Pdf");
            logOutboundResponse(requestData);
            
            //20/07/2021 Egidio modifica per richiesta di Nicola, Liliana 
            if(requestData.getPdf() == null) {
            	if(requestData.getTipologia().equals("P")) {
            		invokeWsVisualizzaPrescrittoPaziente(requestData);
                    generatePDFFromRicettaSAR(requestData);
                    logOutboundResponse(requestData);
            	}
            }
            //20/07/2021 Egidio fine modifica 
            exitFlow();
          //modifica Egidio SAR01 a qua            
   
            //modifica Egidio SAR01 commento da qua
            /*
            switch (routeRequest(requestData)) {
                case FLOW_P_AND_TRUE: {
                    try {
                        invokeWsVisualizzaPrescrittoPaziente(requestData);
                        generatePDFFromRicettaSAR(requestData);
                        logOutboundResponse(requestData);
                        exitFlow();
                    } catch (SARResponseKOException e) {
                        _log.error("ERRORE SAR", e.getMessage());
                        returnErrorMessage(requestData, STAMPA_PDF_RICETTE_SERVICE, e, e.getStatusCodeReturnError());
                    } catch (Exception e) {
                        _log.error("execute", e.getMessage());
                        returnErrorMessage(requestData, STAMPA_PDF_RICETTE_SERVICE, e);
                    }
                }
                break;
                case FLOW_F_OR_FALSE: {
                    try {
                        invokeWsScaricaPdfRicetta(requestData);
                        _log.info("execute - FLOW_F_AND_FALSE", "Esito: success getting Pdf");
                        logOutboundResponse(requestData);
                        exitFlow();
                    } catch (DMAResponseKOException e) {
                        _log.error("ERRORE DMA", e.getMessage());
                        returnErrorMessage(requestData, STAMPA_PDF_RICETTE_SERVICE, e, e.getStatusCodeReturnError());
                    } catch (ScaricaPdfRicettaException e) {
                        _log.error("execute", e.getMessage());
                        returnErrorMessage(requestData, STAMPA_PDF_RICETTE_SERVICE, e);
                    }
                }
                break;

            }*/
            //modifica Egidio SAR01 commento a qua

        } catch (LogauditException e) {
            _log.error("execute", e.getMessage(), e);
            returnErrorMessage(requestData, STAMPA_PDF_RICETTE_SERVICE, e, 500, "invokeWsLogAudit");
        } catch (Exception e) {
            _log.error("execute", e.getMessage(), e);
            returnErrorMessage(requestData, STAMPA_PDF_RICETTE_SERVICE, e);
        }

        return requestData;
    }

    private int routeRequest(StampaPDFRicetteReqInvocation spdfri) {
        int result = 0;

        Boolean regionale = spdfri.getRegionale();
        String  tipologia = spdfri.getTipologia();

        if (tipologia.equals("P") && regionale) {
            result = FLOW_P_AND_TRUE;
        } else if (tipologia.equalsIgnoreCase("F") || !regionale) {
            result = FLOW_F_OR_FALSE;
        }
        return result;
    }


    private void exitFlow() {
        _log.info("exitFlow()", "ScaricaPdfRicettaService concluso");
    }

    private void logOutboundResponse(StampaPDFRicetteReqInvocation req) {
        _log.info("execute", "logOutboundResponse");

    }

    private void processPdfResponse(StampaPDFRicetteReqInvocation req) {
        _log.info("execute", "processPdfResponse");
    }


    private void returnErrorMessage(int statusCode, String detailError) {
        resultExecution = new HashMap<String, Object>();
        resultExecution.put("statusCode", statusCode);
        resultExecution.put("error", detailError);
    }

    private void logIncomingRequest(StampaPDFRicetteReqInvocation request) {
        _log.info("execute", "logIncomingRequest");
    }


    public void generatePDFFromRicettaSAR(StampaPDFRicetteReqInvocation requestData) throws FileNotFoundException {
        byte[]              fileContent = null;
        Map<String, Object> parameters  = new HashMap<>();  // Percorsi di eventuali loghi o subreports

        try {
            List<InfoRicettaType>  elencoInfoRicettaType = requestData.getVisualizzaPrescrittoPazienteSOLRicevuta().getElencoRicette().getInfoRicetta();
            List<RicetteForReport> elencoRicette         = ElencoRicetteForReportUtils.getListaRicette(elencoInfoRicettaType, requestData.getCodiceFiscalePaziente());

            JRBeanCollectionDataSource datasource       = new JRBeanCollectionDataSource(elencoRicette);
            InputStream                fileReportStream = this.getClass().getClassLoader().getResourceAsStream("it/csi/apisan/apisanpresc/ricetta_1a.jasper");
            JasperPrint                jasperPrint      = JasperFillManager.fillReport(fileReportStream, null, datasource);

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            JasperExportManager.exportReportToPdfStream(jasperPrint, baos);

            requestData.setPdf(baos.toByteArray());

        } catch (Exception e) {
            _log.error("generatePDFFromRicettaSAR", e.getMessage(), e);
        }

    }


    private void invokeWsLogAudit(StampaPDFRicetteReqInvocation stampaPDFRicetteReqInvocation) throws LogauditException {
        _log.info("execute", "invokeWsLogAudit");

        /* Populate data */
        String descrizioneAudit = "Accesso dell'utente " + stampaPDFRicetteReqInvocation.getCodiceFiscaleUtenteRich() + " al servizio " +
                stampaPDFRicetteReqInvocation.getXCodiceServizio() + " per stampare la ricetta "+ stampaPDFRicetteReqInvocation.getNre() +" del paziente " + stampaPDFRicetteReqInvocation.getCodiceFiscalePaziente();
        String codice                    = ApiSanPrescConstants.CODICE_PRO_STA_RIC;
        String identificativoRich        = stampaPDFRicetteReqInvocation.getxRequestID();
        String servizioAppChiamante      = stampaPDFRicetteReqInvocation.getXCodiceServizio();
        String codiceFiscaleUtenteRich   = stampaPDFRicetteReqInvocation.getCodiceFiscaleUtenteRich();
        String identificatoIpRichiedente = stampaPDFRicetteReqInvocation.getIpRequest();
        String codiceFiscalePaziente     = stampaPDFRicetteReqInvocation.getCodiceFiscalePaziente();

        PRORELWSClient prorelwsClient = new PRORELWSClient();

        /* Execute call */
        LogAuditResponse logAuditResponse = null;
        try {
            logAuditResponse = prorelwsClient.logAudit(codiceFiscalePaziente, descrizioneAudit, codice, identificativoRich, servizioAppChiamante, codiceFiscaleUtenteRich, identificatoIpRichiedente);
        } catch (Exception e) {
            _log.error("invokeWsLogAudit", e.getMessage(), e);
            throw new LogauditException(e.getMessage());
        }

        stampaPDFRicetteReqInvocation.setLogAuditResponse(logAuditResponse);

    }


    public void invokeWsVisualizzaPrescrittoPaziente(StampaPDFRicetteReqInvocation req) throws Exception {
        _log.info("execute", "invokeWsVisualizzaPrescrittoPaziente");

        SARWSClient                             sarwsClient                             = new SARWSClient();
        VisualizzaPrescrittoPazienteSOLRicevuta visualizzaPrescrittoPazienteSOLRicevuta = null;

        /* Wrapping parameters */
        String nre                  = req.getNre();
        String cfPaziente           = sarwsClient.encryptSarCFAss(req.getCodiceFiscalePaziente());
        String cfRichiedente        = req.getCodiceFiscaleUtenteRich();
        Date   inizioRange          = req.getDataInizioRange();
        Date   fineRange            = req.getDataFineRange();
        String applicativoChiamante = req.getXCodiceServizio();
        String ipaddress            = req.getIpRequest();

        /* Constants */
        String tipoPrescrizione    = req.getTipologia();
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
            throw new Exception(e.getMessage());
        }

        checkSARResponse(visualizzaPrescrittoPazienteSOLRicevuta, STAMPA_PDF_RICETTE_SERVICE);

        /* Response */
        req.setVisualizzaPrescrittoPazienteSOLRicevuta(visualizzaPrescrittoPazienteSOLRicevuta);
    }

    public void invokeWsScaricaPdfRicetta(StampaPDFRicetteReqInvocation req) throws ScaricaPdfRicettaException, DMAResponseKOException {
        _log.info("execute", "invokeWsScaricaPdfRicetta");

        ScaricaPdfRicettaResponse scaricaPdfRicettaResponse = null;

        String codiceFiscalePaziente       = req.getCodiceFiscalePaziente();
        String codiceFiscaleUtenteRich     = req.getCodiceFiscaleUtenteRich();
        String identificativoIpRichiedente = req.getIpRequest();
        String applicativoChiamante        = req.getXCodiceServizio();
        String uuidRichiedente             = req.getxRequestID();
        String nre                         = req.getNre();
        String tipoPrescrizione            = req.getTipologia();
        String ruoloUtente                 = ApisanPrescUtil.getRuoloDMA(codiceFiscalePaziente, codiceFiscaleUtenteRich);
        String contestoOperativo           = ApiSanPrescConstants.CONTESTO_OPERATIVO;
        String regionePrescrizione         = req.getRegionale() ? ApiSanPrescConstants.CONSTANTS_REGIONEPRESCRIZIONE_RP : ApiSanPrescConstants.CONSTANTS_REGIONEPRESCRIZIONE_AR;

        DMAWSClient dmawsClient = new DMAWSClient();

        /* Execute call */
        try {
            // scaricare ricette di farmaceutica prescritte in Piemonte e fuori
            // scaricare ricette di specialistica prescritte fuori
            scaricaPdfRicettaResponse = dmawsClient.invokeStampaPdfRicetteWs(codiceFiscalePaziente, codiceFiscaleUtenteRich, contestoOperativo, identificativoIpRichiedente, ruoloUtente, applicativoChiamante, nre, uuidRichiedente, tipoPrescrizione, regionePrescrizione);
        } catch (Exception e) {
            _log.error("invokeWsScaricaPdfRicetta", e.getMessage(), e);
            throw new ScaricaPdfRicettaException(e);
        }

        checkDMAResponse(scaricaPdfRicettaResponse);

        /* Response */
        req.setScaricaPdfRicettaResponse(scaricaPdfRicettaResponse);
        req.setPdf(scaricaPdfRicettaResponse.getPdf());
        
    }

    // TODO Creare una classe astratta base per le invocation, in modo da esternalizzare metodi accessori come questi
    private void returnErrorMessage(StampaPDFRicetteReqInvocation invocation, String metodo, Exception exception) {
        returnErrorMessage(invocation, metodo, exception, 500);
    }

    // TODO Creare una classe astratta base per le invocation, in modo da esternalizzare metodi accessori come questi
    private void returnErrorMessage(StampaPDFRicetteReqInvocation invocation, String metodo, Exception exception, int statusCode) {
        returnErrorMessage(invocation, metodo, exception, statusCode, exception.getMessage());
    }

    // TODO Creare una classe astratta base per le invocation, in modo da esternalizzare metodi accessori come questi
    private void returnErrorMessage(StampaPDFRicetteReqInvocation invocation, String metodo, Exception exception, int statusCode, String title) {
        ErroreDettaglio erroreDettaglio = new ErroreDettaglio();
        erroreDettaglio.put("metodo", metodo);
        erroreDettaglio.put("dettaglioErrore", exception.getMessage());
        erroreDettaglio.put("causa", exception.getCause() != null ? exception.getCause().getMessage() : "");
        invocation.getErrore().getDetail().add(erroreDettaglio);
        invocation.getErrore().setStatus(statusCode);
        invocation.getErrore().setTitle(title);
    }


    private void checkDMAResponse(ScaricaPdfRicettaResponse scaricaPdfRicettaResponse) throws DMAResponseKOException {
        boolean hasError = Optional.ofNullable(scaricaPdfRicettaResponse)
                .map(ScaricaPdfRicettaResponse::getEsito)
                .filter(esito -> esito.equals(ApiSanPrescConstants.DMA_ESITO_ERRORE_CODE)).isPresent();

        if (hasError) {
            StringBuffer sbError = new StringBuffer("");
            scaricaPdfRicettaResponse.getErrori().getErrore().forEach(errore -> {
                sbError.append(DMAUtils.parseErrorDMA(errore));
            });

            /* Dalla lista errori, prendo il primo result */
            String codeErrorDma = Optional.ofNullable(scaricaPdfRicettaResponse)
                    .map(ScaricaPdfRicettaResponse::getErrori)
                    .map(ListaErroriType::getErrore)
                    .map(errores -> errores.get(0))
                    .map(Errore::getCodiceEsito)
                    .orElse("");

            throw new DMAResponseKOException("Errore DMA - StampaRicetta:" + sbError.toString(), DMAUtils.getStatusCodeByErrorDMA(codeErrorDma), codeErrorDma);

        }
    }

}
