/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.test;

import it.csi.apisan.apisanpresc.business.apisanpresc.service.elencoricette.ElencoRicetteInvocation;
import it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta.StatoRicetta;
import it.csi.apisan.apisanpresc.util.ApisanPrescUtil;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UtilsTest {
    @Test
    void cambioDataFineValidita() throws Exception {

        // Setup
        ElencoRicetteInvocation req   = new ElencoRicetteInvocation();
        StatoRicetta            stato = new StatoRicetta();
        Date                    data  = new Date();
        // When
        String tipologia = "f";
        stato.setCodice("5");

        // Then
        Date risultato = ApisanPrescUtil.computedDataFineValidita(tipologia, stato.getCodice(), data);

        // Expect
        assertTrue(risultato != null);
        System.out.println(risultato);

    }
}
