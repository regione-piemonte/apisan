/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.business.apisanpresc.service.dettaglioricette;

import it.csi.apisan.apisanpresc.common.ValidableObject;
import it.csi.apisan.apisanpresc.dto.apisanpresc.Errore;
import it.csi.apisan.apisanpresc.dto.apisanpresc.ModelRicetta;
import it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta.DettaglioRicettaPrescrittaResponse;
import it.csi.apisan.apisanpresc.soap.pro.logaudit.LogAuditResponse;
import it.csi.apisan.apisanpresc.soap.sar.visprescsol.VisualizzaPrescrittoPazienteSOLRicevuta;

import java.util.ArrayList;
import java.util.Date;

public class DettaglioRicettaInvocation extends ValidableObject<DettaglioRicettaInvocation> {

    private Errore                                  errore         = new Errore();
    private String                                  codiceFiscaleUtenteRich;
    private String                                  codiceFiscalePaziente;
    private Boolean                                 regionale;
    private String                                  contestoOperativo;
    private String                                  xRequestID;
    private String                                  xCodiceServizio;
    private String                                  ruoloUtenteRichiedente;
    private String                                  regionePrescrizione;
    private String                                  identificativoIpRichiedente;
    private String                                  nre;
    private Date                                    dataInizioRange;
    private Date                                    dataFineRange;
    private ModelRicetta                            entityResponse = null;
    private String                                  ipRequest;
    private LogAuditResponse                        logAuditResponse;
    private VisualizzaPrescrittoPazienteSOLRicevuta visualizzaPrescrittoPazienteSOLRicevuta;
    private DettaglioRicettaPrescrittaResponse      dettaglioRicettaPrescrittaResponse;
    private String tipologia;

    public DettaglioRicettaInvocation() {
        errore.setCode("0");
        errore.setDetail(new ArrayList<>());
        errore.setStatus(-1);
        errore.setLinks(new ArrayList<>());
    }

    public void setCodiceFiscaleUtenteRich(String codiceFiscaleUtenteRich) {
        this.codiceFiscaleUtenteRich = codiceFiscaleUtenteRich;
    }

    public String getCodiceFiscaleUtenteRich() {
        return codiceFiscaleUtenteRich;
    }

    public void setCodiceFiscalePaziente(String codiceFiscalePaziente) {
        this.codiceFiscalePaziente = codiceFiscalePaziente;
    }

    public String getCodiceFiscalePaziente() {
        return codiceFiscalePaziente;
    }

    public void setRegionale(Boolean regionale) {
        this.regionale = regionale;
    }

    public Boolean getRegionale() {
        return regionale;
    }

    public void setContestoOperativo(String contestoOperativo) {
        this.contestoOperativo = contestoOperativo;
    }

    public String getContestoOperativo() {
        return contestoOperativo;
    }

    public void setXCodiceServizio(String xCodiceServizio) {
        this.xCodiceServizio = xCodiceServizio;
    }

    public String getXCodiceServizio() {
        return xCodiceServizio;
    }

    public void setxRequestID(String xRequestID) {

        this.xRequestID = xRequestID;
    }

    public String getxRequestID() {
        return xRequestID;
    }

    public void setRuoloUtenteRichiedente(String ruoloUtenteRichiedente) {
        this.ruoloUtenteRichiedente = ruoloUtenteRichiedente;
    }

    public String getRuoloUtenteRichiedente() {
        return ruoloUtenteRichiedente;
    }

    public void setRegionePrescrizione(String regionePrescrizione) {
        this.regionePrescrizione = regionePrescrizione;
    }

    public String getRegionePrescrizione() {
        return regionePrescrizione;
    }

    public void setIdentificativoIpRichiedente(String identificativoIpRichiedente) {
        this.identificativoIpRichiedente = identificativoIpRichiedente;
    }

    public String getIdentificativoIpRichiedente() {
        return identificativoIpRichiedente;
    }

    public void setNre(String nre) {
        this.nre = nre;
    }

    public String getNre() {
        return nre;
    }

    public void setDataInizioRange(Date dataInizioRange) {
        this.dataInizioRange = dataInizioRange;
    }

    public Date getDataInizioRange() {
        return dataInizioRange;
    }

    public void setDataFineRange(Date dataFineRange) {
        this.dataFineRange = dataFineRange;
    }

    public Date getDataFineRange() {
        return dataFineRange;
    }

    public String getxCodiceServizio() {
        return xCodiceServizio;
    }

    public void setxCodiceServizio(String xCodiceServizio) {
        this.xCodiceServizio = xCodiceServizio;
    }

    public ModelRicetta getEntityResponse() {
        return entityResponse;
    }

    public void setEntityResponse(ModelRicetta entityResponse) {
        this.entityResponse = entityResponse;
    }

    public String getIpRequest() {
        return ipRequest;
    }

    public void setIpRequest(String ipRequest) {
        this.ipRequest = ipRequest;
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

    public void setVisualizzaPrescrittoPazienteSOLRicevuta(VisualizzaPrescrittoPazienteSOLRicevuta visualizzaPrescrittoPazienteSOLRicevuta) {
        this.visualizzaPrescrittoPazienteSOLRicevuta = visualizzaPrescrittoPazienteSOLRicevuta;
    }

    public VisualizzaPrescrittoPazienteSOLRicevuta getVisualizzaPrescrittoPazienteSOLRicevuta() {
        return visualizzaPrescrittoPazienteSOLRicevuta;
    }

    public void setDettaglioRicettaPrescrittaResponse(DettaglioRicettaPrescrittaResponse dettaglioRicettaPrescrittaResponse) {
        this.dettaglioRicettaPrescrittaResponse = dettaglioRicettaPrescrittaResponse;
    }

    public DettaglioRicettaPrescrittaResponse getDettaglioRicettaPrescrittaResponse() {
        return dettaglioRicettaPrescrittaResponse;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public String getTipologia() {
        return tipologia;
    }
}
