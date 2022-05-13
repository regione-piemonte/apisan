/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.business.apisanpresc.service.nascondinre;

import it.csi.apisan.apisanpresc.dto.apisanpresc.Errore;
import it.csi.apisan.apisanpresc.soap.pro.logaudit.LogAuditResponse;
import it.csi.apisan.apisanpresc.soap.pro.nascondinre.NascondiNreResponse;

import java.util.ArrayList;

public class NascondiNREInvocation {

    private String              codice;
    private String              codiceFiscaleUtenteRich;
    private String              codiceFiscalePaziente;
    private String              nre;
    private String              contestoOperativo;
    private String              identificativoIpRichiedente;
    private String              ruoloUtente;
    private String              XCodiceServizio;
    private String              XRequestId;
    private Boolean             isNascosta;
    private LogAuditResponse    logAuditResponse;
    private Errore              errore = new Errore();
    private NascondiNreResponse nascondiNreResponse;


    public NascondiNREInvocation() {
        errore.setCode("0");
        errore.setDetail(new ArrayList<>());
        errore.setStatus(-1);
        errore.setLinks(new ArrayList<>());
    }


    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getCodice() {
        return codice;
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

    public void setNre(String nre) {
        this.nre = nre;
    }

    public String getNre() {
        return nre;
    }

    public void setContestoOperativo(String contestoOperativo) {
        this.contestoOperativo = contestoOperativo;
    }

    public String getContestoOperativo() {
        return contestoOperativo;
    }

    public void setIdentificativoIpRichiedente(String identificativoIpRichiedente) {
        this.identificativoIpRichiedente = identificativoIpRichiedente;
    }

    public String getIdentificativoIpRichiedente() {
        return identificativoIpRichiedente;
    }

    public void setRuoloUtente(String ruoloUtente) {
        this.ruoloUtente = ruoloUtente;
    }

    public String getRuoloUtente() {
        return ruoloUtente;
    }

    public void setXCodiceServizio(String xCodiceServizio) {
        this.XCodiceServizio = xCodiceServizio;
    }

    public String getXCodiceServizio() {
        return XCodiceServizio;
    }

    public void setXRequestId(String xRequestId) {
        this.XRequestId = xRequestId;
    }

    public String getXRequestId() {
        return XRequestId;
    }

    public void setIsNascosta(Boolean isNascosta) {
        this.isNascosta = isNascosta;
    }

    public Boolean getNascosta() {
        return isNascosta;
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

    public void setNascondiNreResponse(NascondiNreResponse nascondiNreResponse) {
        this.nascondiNreResponse = nascondiNreResponse;
    }

    public NascondiNreResponse getNascondiNreResponse() {
        return nascondiNreResponse;
    }
}
