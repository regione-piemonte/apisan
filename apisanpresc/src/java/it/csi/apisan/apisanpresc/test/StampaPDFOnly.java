/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.test;

import it.csi.apisan.apisanpresc.business.apisanpresc.service.StampaPDFRicetteService;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class StampaPDFOnly {

    @Test
    public void stampaSoloPdf() throws FileNotFoundException {
        StampaPDFRicetteService stampaPDFRicetteService = new StampaPDFRicetteService();
        stampaPDFRicetteService.generatePDFFromRicettaSAR(null);
    }
}
