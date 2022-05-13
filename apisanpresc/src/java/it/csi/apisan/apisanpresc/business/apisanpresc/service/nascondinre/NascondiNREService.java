/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.business.apisanpresc.service.nascondinre;

import it.csi.apisan.apisanpresc.business.apisanpresc.exceptions.LogauditException;
import it.csi.apisan.apisanpresc.business.apisanpresc.service.ApisanPrescBaseService;
import it.csi.apisan.apisanpresc.common.ApiSanPrescConstants;
import it.csi.apisan.apisanpresc.dto.apisanpresc.ErroreDettaglio;
import it.csi.apisan.apisanpresc.soap.pro.PRORELWSClient;
import it.csi.apisan.apisanpresc.soap.pro.logaudit.LogAuditResponse;
import it.csi.apisan.apisanpresc.soap.pro.nascondinre.NascondiNreResponse;
import it.csi.apisan.apisanpresc.util.LogUtil;

public class NascondiNREService extends ApisanPrescBaseService<NascondiNREInvocation> {

    private static final String NASCONDI_NRE_SERVICE = "NascondiNREService";
    LogUtil _log = new LogUtil(this.getClass());

    public NascondiNREService() {

    }

    @Override
    public NascondiNREInvocation processRequest(NascondiNREInvocation nascondiNREInvocation) {

        try {
            _log.info("execute", "NascondiNRE service start...");

            logIncomingRequest(nascondiNREInvocation);
            invokeWsLogAudit(nascondiNREInvocation);
            invokeWsNascondiNRE(nascondiNREInvocation);
            logOutboundResponse(nascondiNREInvocation);
            exitFlow();

        } catch (LogauditException e) {
            _log.error("execute", e.getMessage(), e);
            returnErrorMessage(nascondiNREInvocation, NASCONDI_NRE_SERVICE, e, "invokeWsLogAudit");
        } catch (Exception e) {
            _log.error("execute", e.getMessage(), e);
            returnErrorMessage(nascondiNREInvocation, NASCONDI_NRE_SERVICE, e, NASCONDI_NRE_SERVICE);
        }

        return nascondiNREInvocation;
    }

    public void invokeWsLogAudit(NascondiNREInvocation nascondiNREInvocation) throws LogauditException {
        _log.info("execute", "invokeWsLogAudit");

        /* Populate data */
        String descrizioneAudit = "Accesso dell'utente " + nascondiNREInvocation.getCodiceFiscaleUtenteRich() + " al servizio " +
                nascondiNREInvocation.getXCodiceServizio() + " per nascondere/mostrare la ricetta "+ nascondiNREInvocation.getNre() +" del paziente " + nascondiNREInvocation.getCodiceFiscalePaziente();
        String codice                    = ApiSanPrescConstants.CODICE_PRO_NAS_RIC;
        String identificativoRich        = nascondiNREInvocation.getXRequestId();
        String servizioAppChiamante      = nascondiNREInvocation.getXCodiceServizio();
        String codiceFiscaleUtenteRich   = nascondiNREInvocation.getCodiceFiscaleUtenteRich();
        String identificatoIpRichiedente = nascondiNREInvocation.getIdentificativoIpRichiedente();
        String codiceFiscalePaziente     = nascondiNREInvocation.getCodiceFiscalePaziente();

        PRORELWSClient prorelwsClient = new PRORELWSClient();

        /* Execute call */
        LogAuditResponse logAuditResponse = null;
        try {
            logAuditResponse = prorelwsClient.logAudit(codiceFiscalePaziente, descrizioneAudit, codice, identificativoRich, servizioAppChiamante, codiceFiscaleUtenteRich, identificatoIpRichiedente);
        } catch (Exception e) {
            _log.error("invokeWsLogAudit", e.getMessage(), e);
            throw new LogauditException(e.getMessage());
        }

        nascondiNREInvocation.setLogAuditResponse(logAuditResponse);

    }

    private void invokeWsNascondiNRE(NascondiNREInvocation nri) throws Exception {
        _log.info("execute", "invokeWsNascondiNRE");

        /* Populate data */
        String  codiceFiscalePaziente     = nri.getCodiceFiscalePaziente();
        String  servizioAppChiamante      = nri.getXCodiceServizio();
        String  codiceFiscaleUtenteRich   = nri.getCodiceFiscaleUtenteRich();
        String  identificatoIpRichiedente = nri.getIdentificativoIpRichiedente();
        String  uuid                      = nri.getXRequestId();
        String  nre                       = nri.getNre();
        Boolean isNascosta                = nri.getNascosta();

        PRORELWSClient prorelwsClient = new PRORELWSClient();

        /* Execute call */
        NascondiNreResponse nascondiNreResponse = null;

        try {
            nascondiNreResponse = prorelwsClient.nascondiNre(isNascosta, nre, codiceFiscalePaziente, codiceFiscaleUtenteRich, identificatoIpRichiedente, servizioAppChiamante, uuid);
        } catch (Exception e) {
            _log.error("invokeWSNascondiNRE", e.getMessage(), e);
            throw new Exception(e.getMessage());
        }

        nri.setNascondiNreResponse(nascondiNreResponse);

    }


    private void exitFlow() {
        _log.info("exitFlow()", "ElencoRicetteNREService concluso");
    }

    private void logOutboundResponse(NascondiNREInvocation req) {
        _log.info("execute", "logOutboundResponse");

    }

    private void returnErrorMessage(NascondiNREInvocation invocation, String metodo, Exception e, String title) {
        ErroreDettaglio erroreDettaglio = new ErroreDettaglio();
        erroreDettaglio.put("metodo", metodo);
        erroreDettaglio.put("dettaglioErrore", e.getMessage());
        erroreDettaglio.put("causa", e.getCause() != null ? e.getCause().getMessage() : "");
        invocation.getErrore().getDetail().add(erroreDettaglio);
        invocation.getErrore().setStatus(500);
        invocation.getErrore().setTitle(title);
    }


    private void logIncomingRequest(NascondiNREInvocation request) {
        _log.info("execute", "logIncomingRequest");
    }


}

