/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.business.apisanpresc.service;

import it.csi.apisan.apisanpresc.soap.sar.visprescsol.ErroreRicettaType;

public class SARUtils {

    public static final String SAR_RICETTA_NON_TROVATA = "SAR_1121";

    /**
     * Manage errors SAR
     * <p>
     * N.B. Logica duplicata per specificare eventuali differenze.
     * TODO Mapping code error DMA
     *
     * @param errore
     * @return
     */
    public static String parseErrorSAR(ErroreRicettaType errore) {
        String esito       = errore.getEsito() != null ? errore.getEsito() : "";
        String codiceEsito = errore.getCodEsito() != null ? errore.getCodEsito() : "";
        String fonte       = errore.getProgPresc() != null ? errore.getProgPresc() : "";
        String tipoErrore  = errore.getTipoErrore() != null ? errore.getTipoErrore() : "";

        return getErrorMessage(esito, codiceEsito, fonte, tipoErrore);
    }

    private static String getErrorMessage(String esito, String codiceEsito, String fonte, String tipoErrore) {
        return esito + "#" + codiceEsito + "#" + fonte + "#" + tipoErrore;
    }

    public static int getStatusCodeByErrorDMA(String errorMessage) {
        int result = -1;

        if (errorMessage != null) {
            switch (errorMessage.trim().toUpperCase()) {
                case SAR_RICETTA_NON_TROVATA:
                    result = 404;
                    break;
                default:
                    result = 500;
            }
        }
        return result;
    }

}
