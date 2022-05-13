/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.business.apisanpresc.service;

import it.csi.apisan.apisanpresc.common.ApiSanPrescConstants;
import it.csi.apisan.apisanpresc.exception.SARResponseKOException;
import it.csi.apisan.apisanpresc.soap.sar.visprescsol.ElencoErroriRicetteType;
import it.csi.apisan.apisanpresc.soap.sar.visprescsol.ErroreRicettaType;
import it.csi.apisan.apisanpresc.soap.sar.visprescsol.VisualizzaPrescrittoPazienteSOLRicevuta;

import java.util.Optional;

public abstract class ApisanPrescBaseService<T> {

    public abstract T processRequest(T t);

    protected void checkSARResponse(VisualizzaPrescrittoPazienteSOLRicevuta visualizzaPrescrittoPazienteSOLRicevuta, String methodName) throws SARResponseKOException {
        boolean hasError = Optional.ofNullable(visualizzaPrescrittoPazienteSOLRicevuta)
                .map(VisualizzaPrescrittoPazienteSOLRicevuta::getCodEsitoVisualizzazione)
                .filter(esito -> esito.equals(ApiSanPrescConstants.SAR_ESITO_ERRORE_CODE)).isPresent();

        if (hasError) {
            StringBuffer sbError = new StringBuffer("");
            visualizzaPrescrittoPazienteSOLRicevuta.getElencoErroriRicette().getErroreRicetta().forEach(errore -> {
                sbError.append(SARUtils.parseErrorSAR(errore));
            });


            /* Dalla lista errori, prendo il primo result */
            String codeErrorDma = Optional.ofNullable(visualizzaPrescrittoPazienteSOLRicevuta)
                    .map(VisualizzaPrescrittoPazienteSOLRicevuta::getElencoErroriRicette)
                    .map(ElencoErroriRicetteType::getErroreRicetta)
                    .map(errores -> errores.get(0))
                    .map(ErroreRicettaType::getCodEsito)
                    .orElse("");


            throw new SARResponseKOException("Errore SAR - " + methodName + " " + sbError.toString(), SARUtils.getStatusCodeByErrorDMA(codeErrorDma));
        }
    }

}
