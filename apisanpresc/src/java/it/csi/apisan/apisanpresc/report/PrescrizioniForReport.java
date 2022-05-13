/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.report;

import it.csi.apisan.apisanpresc.soap.sar.visprescsol.DettaglioPrescrizioneType;
import it.csi.apisan.apisanpresc.util.SARResponseUtils;

public class PrescrizioniForReport {

    private String prescrizione;
    private String nota;
    private String quantita;

    public PrescrizioniForReport(DettaglioPrescrizioneType dettaglioPrescrizioneType) {

        String prescrizioneText = (dettaglioPrescrizioneType.getCodProdPrest() + " (" + dettaglioPrescrizioneType.getCodCatalogoPrescr() + ") - " + dettaglioPrescrizioneType.getDescrProdPrest() + "\n" + getTipoAccessoByCode(dettaglioPrescrizioneType.getTipoAccesso()));

        this.prescrizione = prescrizioneText;
        this.nota         = SARResponseUtils.generateNota(dettaglioPrescrizioneType);
        this.quantita     = dettaglioPrescrizioneType.getQuantita() != null ? dettaglioPrescrizioneType.getQuantita() : "";
    }

    private String getTipoAccessoByCode(String tipoAccesso) {
        String result = "";
        if (tipoAccesso != null && !"".equals(tipoAccesso)) {
            switch (tipoAccesso.trim()) {
                case "0":
                    result = "ALTRA TIPOLOGIA DI ACCESSO";
                    break;
                case "1":
                    result = "PRIMO ACCESSO";
                    break;
            }
        }
        return result;

    }

    public PrescrizioniForReport() {
        this.prescrizione = "";
        this.nota         = "";
        this.quantita     = "";
    }

    public String getPrescrizione() {
        return prescrizione;
    }

    public void setPrescrizione(String prescrizione) {
        this.prescrizione = prescrizione;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getQuantita() {
        return quantita;
    }

    public void setQuantita(String quantita) {
        this.quantita = quantita;
    }
}
