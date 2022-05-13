/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.business.apisanpresc.service.stampapdf;

import it.csi.apisan.apisanpresc.dto.apisanpresc.Errore;
import it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta.ScaricaPdfRicettaResponse;
import it.csi.apisan.apisanpresc.soap.pro.logaudit.LogAuditResponse;
import it.csi.apisan.apisanpresc.soap.sar.visprescsol.VisualizzaPrescrittoPazienteSOLRicevuta;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StampaPDFRicetteReqInvocation {

    SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy HH:mm:ss");

    private Boolean                                  regionale;
    private String                                   tipologia;
    private String                                   codiceFiscalePaziente;
    private String                                   codiceFiscaleUtenteRich;
    private String                                   nre;
    private String                                   tipoPrescrizione;
    private Boolean                                  completoFlag = false;
    private byte[]                                   pdf; // ritornato o generato
    private String                                   pinCode      = "n/wVtAmtnCyBx/hPb7RO8Zcird9FKmu9kqh2xbvjCIubaO00nJ37//OEbZ5lyzv8C3ApbfTqR/UuKMShtB4j+4cbcJKUr6uKpCbKT+6N845DjKYCI1QiywYs7ytjN7L9rEtIiB/IEy2Bs8wN4qW5j94MqOrpoFw+cg0zVogIp10=";
    private List<String>                             erroriList   = new ArrayList<String>();
    private VisualizzaPrescrittoPazienteSOLRicevuta  visualizzaPrescrittoPazienteSOLRicevuta;
    private String                                   nreRicetta;
    private Date                                     dataInizioRange;
    private Date                                     dataFineRange;
    private String                                   tipoRegime;
    private String                                   tipoRicetta;
    private String                                   ricetteScadute;
    private String                                   ricErogNonSSN;
    private String XCodiceServizio;
    private String ipRequest;
    private String xRequestID;
    private LogAuditResponse logAuditResponse;
    private Errore errore = new Errore();
    private ScaricaPdfRicettaResponse scaricaPdfRicettaResponse;


    public StampaPDFRicetteReqInvocation() {
        errore.setCode("0");
        errore.setDetail(new ArrayList<>());
        errore.setStatus(-1);
        errore.setLinks(new ArrayList<>());
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    public Boolean getRegionale() {
        return regionale;
    }

    public void setRegionale(Boolean regionale) {
        this.regionale = regionale;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public String getCodiceFiscalePaziente() {
        return codiceFiscalePaziente;
    }

    public void setCodiceFiscalePaziente(String codiceFiscalePaziente) {
        this.codiceFiscalePaziente = codiceFiscalePaziente;
    }

    public String getCodiceFiscaleUtenteRich() {
        return codiceFiscaleUtenteRich;
    }

    public void setCodiceFiscaleUtenteRich(String codiceFiscaleUtenteRich) {
        this.codiceFiscaleUtenteRich = codiceFiscaleUtenteRich;
    }

    public String getNre() {
        return nre;
    }

    public void setNre(String nre) {
        this.nre = nre;
    }

    public String getTipoPrescrizione() {
        return tipoPrescrizione;
    }

    public void setTipoPrescrizione(String tipoPrescrizione) {
        this.tipoPrescrizione = tipoPrescrizione;
    }

    public Boolean getCompletoFlag() {
        return completoFlag;
    }

    public void setCompletoFlag(Boolean completoFlag) {
        this.completoFlag = completoFlag;
    }

    public byte[] getPdf() {
        return pdf;
    }

    public void setPdf(byte[] pdf) {
        this.pdf = pdf;
    }


    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public List<String> getErroriList() {
        return erroriList;
    }

    public void setErroriList(List<String> erroriList) {
        this.erroriList = erroriList;
    }

    public void setVisualizzaPrescrittoPazienteSOLRicevuta(VisualizzaPrescrittoPazienteSOLRicevuta visualizzaPrescrittoPazienteSOLRicevuta) {
        this.visualizzaPrescrittoPazienteSOLRicevuta = visualizzaPrescrittoPazienteSOLRicevuta;
    }

    public VisualizzaPrescrittoPazienteSOLRicevuta getVisualizzaPrescrittoPazienteSOLRicevuta() {
        return visualizzaPrescrittoPazienteSOLRicevuta;
    }

    public String getNreRicetta() {
        return nreRicetta;
    }

    public void setNreRicetta(String nreRicetta) {
        this.nreRicetta = nreRicetta;
    }

    public Date getDataInizioRange() {
        return dataInizioRange;
    }

    public void setDataInizioRange(Date dataInizioRange) {
        this.dataInizioRange = dataInizioRange;
    }

    public Date getDataFineRange() {
        return dataFineRange;
    }

    public void setDataFineRange(Date dataFineRange) {
        this.dataFineRange = dataFineRange;
    }

    public String getTipoRegime() {
        return tipoRegime;
    }

    public void setTipoRegime(String tipoRegime) {
        this.tipoRegime = tipoRegime;
    }

    public String getTipoRicetta() {
        return tipoRicetta;
    }

    public void setTipoRicetta(String tipoRicetta) {
        this.tipoRicetta = tipoRicetta;
    }

    public String getRicetteScadute() {
        return ricetteScadute;
    }

    public void setRicetteScadute(String ricetteScadute) {
        this.ricetteScadute = ricetteScadute;
    }

    public String getRicErogNonSSN() {
        return ricErogNonSSN;
    }

    public void setRicErogNonSSN(String ricErogNonSSN) {
        this.ricErogNonSSN = ricErogNonSSN;
    }

    public void setXCodiceServizio(String xCodiceServizio) {
        this.XCodiceServizio = xCodiceServizio;
    }

    public String getXCodiceServizio() {
        return XCodiceServizio;
    }

    public void setIpRequest(String ipRequest) {
        this.ipRequest = ipRequest;
    }

    public String getIpRequest() {
        return ipRequest;
    }

    public void setxRequestID(String xRequestID) {
        this.xRequestID = xRequestID;
    }

    public String getxRequestID() {
        return xRequestID;
    }

    public void setLogAuditResponse(LogAuditResponse logAuditResponse) {
        this.logAuditResponse = logAuditResponse;
    }

    public LogAuditResponse getLogAuditResponse() {
        return logAuditResponse;
    }

    public Errore getErrore() {
        return errore;
    }

    public void setErrore(Errore errore) {
        this.errore = errore;
    }

    public void setScaricaPdfRicettaResponse(ScaricaPdfRicettaResponse scaricaPdfRicettaResponse) {
        this.scaricaPdfRicettaResponse = scaricaPdfRicettaResponse;
    }

    public ScaricaPdfRicettaResponse getScaricaPdfRicettaResponse() {
        return scaricaPdfRicettaResponse;
    }
}


