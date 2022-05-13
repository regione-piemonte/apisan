/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.business.apisanpresc.service.elencoricette;

import it.csi.apisan.apisanpresc.dto.apisanpresc.Errore;
import it.csi.apisan.apisanpresc.dto.apisanpresc.ModelRicetta;
import it.csi.apisan.apisanpresc.soap.dma.elencoricetteservice.ElencoRicetteStampaPromemoriaResponse;
import it.csi.apisan.apisanpresc.soap.pro.elenconrenascosti.ElencoNreNascostiResponse;
import it.csi.apisan.apisanpresc.soap.pro.logaudit.LogAuditResponse;
import it.csi.apisan.apisanpresc.soap.sar.visprescsol.VisualizzaPrescrittoPazienteSOLRicevuta;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ElencoRicetteInvocation {


    private Boolean regionale;
    private String  tipologia;
    private String  codiceFiscalePaziente;                    //citId
    private String  codiceFiscaleUtenteRich;                  //Shib-Identita-CodiceFiscale
    private Date    dataInizioRange;
    private Date    dataFineRange;
    private String  xCodiceServizio;
    private String  xRequestID;

    private List<ModelRicetta>                      entityResponse = new ArrayList<>();
    private VisualizzaPrescrittoPazienteSOLRicevuta visualizzaPrescrittoPazienteSOLRicevuta;
    private ElencoRicetteStampaPromemoriaResponse   elencoRicetteStampaPromemoriaResponse;
    private ElencoNreNascostiResponse               elencoNreNascostiResponse;
    private Errore                                  errore         = new Errore();
    private String                                  ipRequest;
    private LogAuditResponse                        logAuditResponse;
    private String                                  regionePrescrizione;

    public ElencoRicetteInvocation() {
        errore.setCode("0");
        errore.setDetail(new ArrayList<>());
        errore.setStatus(-1);
        errore.setLinks(new ArrayList<>());
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

    public String getxCodiceServizio() {
        return xCodiceServizio;
    }

    public void setxCodiceServizio(String xCodiceServizio) {
        this.xCodiceServizio = xCodiceServizio;
    }

    public String getxRequestID() {
        return xRequestID;
    }

    public void setxRequestID(String xRequestID) {
        this.xRequestID = xRequestID;
    }

    public List<ModelRicetta> getEntityResponse() {
        return entityResponse;
    }

    public void setEntityResponse(List<ModelRicetta> entityResponse) {
        this.entityResponse = entityResponse;
    }


    public void setVisualizzaPrescrittoPazienteSOLRicevuta(VisualizzaPrescrittoPazienteSOLRicevuta visualizzaPrescrittoPazienteSOLRicevuta) {
        this.visualizzaPrescrittoPazienteSOLRicevuta = visualizzaPrescrittoPazienteSOLRicevuta;
    }

    public VisualizzaPrescrittoPazienteSOLRicevuta getVisualizzaPrescrittoPazienteSOLRicevuta() {
        return visualizzaPrescrittoPazienteSOLRicevuta;
    }

    public Errore getErrore() {
        return errore;
    }

    public void setErrore(Errore errore) {
        this.errore = errore;
    }

    public String getIpRequest() {
        return ipRequest;
    }

    public void setIpRequest(String ipRequest) {
        this.ipRequest = ipRequest;
    }

    public void setElencoRicetteStampaPromemoriaResponse(ElencoRicetteStampaPromemoriaResponse elencoRicetteStampaPromemoriaResponse) {
        this.elencoRicetteStampaPromemoriaResponse = elencoRicetteStampaPromemoriaResponse;
    }

    public ElencoRicetteStampaPromemoriaResponse getElencoRicetteStampaPromemoriaResponse() {
        return elencoRicetteStampaPromemoriaResponse;
    }

    public void setLogAuditResponse(LogAuditResponse logAuditResponse) {
        this.logAuditResponse = logAuditResponse;
    }

    public LogAuditResponse getLogAuditResponse() {
        return logAuditResponse;
    }

    public void setElencoNreNascostiResponse(ElencoNreNascostiResponse elencoNreNascostiResponse) {
        this.elencoNreNascostiResponse = elencoNreNascostiResponse;
    }

    public ElencoNreNascostiResponse getElencoNreNascostiResponse() {
        return elencoNreNascostiResponse;
    }

    public void setRegionePrescrizione(String regionePrescrizione) {
        this.regionePrescrizione = regionePrescrizione;
    }

    public String getRegionePrescrizione() {
        return regionePrescrizione;
    }
}
