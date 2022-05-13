/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.business.apisanpresc;

public class DMAUtils {

    public static final String DMA_RICETTA_NON_TROVATA = "PRO-CC-0016";
    public static final String DMA_NO_ELENCORICETTE_PER_UTENTE = "PRO-CC-0015";

    /**
     * Manage errors DMA
     * <p>
     * N.B. Logica duplicata per specificare eventuali differenze.
     * TODO Mapping code error DMA
     *
     * @param errore
     * @return
     */
    public static String parseErrorDMA(Object errore) {

        String result = "";

        if (errore instanceof it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta.Errore) {
            it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta.Errore _errore     = (it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta.Errore) errore;
            String                                                               esito       = _errore.getEsitoErrore() != null ? _errore.getEsitoErrore() : "";
            String                                                               codiceEsito = _errore.getCodiceEsito() != null ? _errore.getCodiceEsito() : "";
            String                                                               fonte       = _errore.getFonte() != null ? _errore.getFonte() : "";
            String                                                               tipoErrore  = _errore.getTipoErrore() != null ? _errore.getTipoErrore() : "";

            result = getErrorMessage(esito, codiceEsito, fonte, tipoErrore);
        } else if (errore instanceof it.csi.apisan.apisanpresc.soap.dma.elencoricetteservice.Errore) {
            it.csi.apisan.apisanpresc.soap.dma.elencoricetteservice.Errore _errore     = (it.csi.apisan.apisanpresc.soap.dma.elencoricetteservice.Errore) errore;
            String                                                         esito       = _errore.getEsitoErrore() != null ? _errore.getEsitoErrore() : "";
            String                                                         codiceEsito = _errore.getCodiceEsito() != null ? _errore.getCodiceEsito() : "";
            String                                                         fonte       = _errore.getFonte() != null ? _errore.getFonte() : "";
            String                                                         tipoErrore  = _errore.getTipoErrore() != null ? _errore.getTipoErrore() : "";

            result = getErrorMessage(esito, codiceEsito, fonte, tipoErrore);
        } else if (errore instanceof  it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta.Errore) {
            it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta.Errore _errore = (it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta.Errore) errore;
            String esito = _errore.getEsitoErrore() != null ? _errore.getEsitoErrore() : "";
            String codiceEsito = _errore.getCodiceEsito() != null ? _errore.getCodiceEsito() : "";
            String fonte = _errore.getFonte() != null ? _errore.getFonte() : "";
            String tipoErrore = _errore.getTipoErrore() != null ? _errore.getTipoErrore() : "";

            result = getErrorMessage(esito, codiceEsito, fonte, tipoErrore);
        }

        return result;
    }

    private static String getErrorMessage(String esito, String codiceEsito, String fonte, String tipoErrore) {
        return esito + "#" + codiceEsito + "#" + fonte + "#" + tipoErrore;
    }

    public static int getStatusCodeByErrorDMA(String errorMessage) {
        int result = -1;

        if (errorMessage != null) {
            switch (errorMessage.trim().toUpperCase()) {
                case DMA_RICETTA_NON_TROVATA:
                    result = 404;
                    break;
                case DMA_NO_ELENCORICETTE_PER_UTENTE:
                    result = 200;
                    break;
                default:
                    result = 500;
            }
        }
        return result;
    }

}
