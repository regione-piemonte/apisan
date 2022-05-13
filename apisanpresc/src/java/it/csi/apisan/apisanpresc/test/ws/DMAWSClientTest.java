/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.test.ws;

import it.csi.apisan.apisanpresc.common.ApiSanPrescConstants;
import it.csi.apisan.apisanpresc.soap.dma.DMAWSClient;
import it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta.DettaglioRicettaPrescrittaRequest;
import it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta.DettaglioRicettaPrescrittaResponse;
import it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta.EstremiRicetta;
import it.csi.apisan.apisanpresc.soap.dma.elencoricetteservice.*;
import it.csi.apisan.apisanpresc.util.ApisanPrescUtil;
import org.junit.jupiter.api.Test;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceException;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DMAWSClientTest {

    @Test
    public void elencoRicettaPrescrittaTest() {

        //Setup
        DMAWSClient                          dmawsClient                          = new DMAWSClient();
        EstremiPaziente                      estremiPaziente                      = new EstremiPaziente();
        InformazioniRichiedente              informazioniRichiedente              = new InformazioniRichiedente();
        Richiedente                          richiedente                          = new Richiedente();
        FiltroRicette                        filtroRicette                        = new FiltroRicette();
        ElencoRicetteStampaPromemoriaRequest elencoRicetteStampaPromemoriaRequest = new ElencoRicetteStampaPromemoriaRequest();

        //When
        estremiPaziente.setCodiceFiscale("CRPYNN77A61B791K");
        informazioniRichiedente.setCodiceFiscaleUtente("AAAAAA00B77B000F");
        informazioniRichiedente.setContestoOperativo("PERSONAL");
        informazioniRichiedente.setIdentificativoIpRichiedente("123.11.2.34");
        informazioniRichiedente.setRuoloUtente("FSE");
        richiedente.setServizioApplicativoChiamante("FSE");
        richiedente.setUuid("g1010");
        filtroRicette.setTipoPrescrizione("F");
        filtroRicette.setRicetteScadute("N");
        filtroRicette.setRegionePrescrizione("RP");

        //Then
        String               codiceFiscalePaziente       = estremiPaziente.getCodiceFiscale();
        String               codiceFiscaleUtente         = informazioniRichiedente.getCodiceFiscaleUtente();
        String               contestoOperativo           = informazioniRichiedente.getContestoOperativo();
        String               identificativoIpRichiedente = informazioniRichiedente.getIdentificativoIpRichiedente();
        String               ruoloUtente          = informazioniRichiedente.getRuoloUtente();
        String               applicativoChiamante = richiedente.getServizioApplicativoChiamante();
        String               uuidRichiedente      = richiedente.getUuid();
        String               regionePrescrizione  = "RP";
        String               tipoPrescrizione     = "F";
        String               ricetteScadute       = "N";
        XMLGregorianCalendar dataInizio           = ApisanPrescUtil.toGregorianCalendarFromDateString("10-10-2019","dd-MM-yyyy");
        XMLGregorianCalendar dataFine             = ApisanPrescUtil.toGregorianCalendarFromDateString("11-10-2019","dd-MM-yyyy");


        ElencoRicetteStampaPromemoriaResponse response = dmawsClient.invokeElencoRicetteWs(codiceFiscalePaziente, codiceFiscaleUtente, contestoOperativo, identificativoIpRichiedente, ruoloUtente, applicativoChiamante, uuidRichiedente, regionePrescrizione, tipoPrescrizione, ricetteScadute, dataInizio, dataFine);

        //Expect
        assertTrue(response != null);
        assertTrue(response.getListaRicette() != null && response.getListaRicette().getRicetta() != null && response.getListaRicette().getRicetta().size() > 0);
    }

    @Test
    public void dettaglioRicettaPrescrittaTest() {

        //Setup
        DMAWSClient                                                                   dmawsClient                       = new DMAWSClient();
        DettaglioRicettaPrescrittaRequest                                             dettaglioRicettaPrescrittaRequest = new DettaglioRicettaPrescrittaRequest();
        EstremiRicetta                                                                estremiRicetta                    = new EstremiRicetta();
        it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta.EstremiPaziente estremiPaziente                   = new it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta.EstremiPaziente();
        InformazioniRichiedente                                                       informazioniRichiedente           = new InformazioniRichiedente();
        Richiedente                                                                   richiedente                       = new Richiedente();

        //When
        estremiRicetta.setNre("010D00000000254");
        estremiRicetta.setTipoPrescrizione("F");
        estremiRicetta.setRegionePrescrizione("RP");
        estremiPaziente.setCodiceFiscale("CRPYNN77A61B791K");
        informazioniRichiedente.setRuoloUtente("FSE");
        informazioniRichiedente.setIdentificativoIpRichiedente("123.11.2.34");
        informazioniRichiedente.setContestoOperativo("PERSONAL");
        informazioniRichiedente.setCodiceFiscaleUtente("AAAAAA00B77B000F");
        richiedente.setServizioApplicativoChiamante("FSE");
        richiedente.setUuid("g1111");
        //Then
        String nreRicetta                        = estremiRicetta.getNre();
        String regionePrescrizione               = estremiRicetta.getRegionePrescrizione();
        String tipoPrescrizione                  = estremiRicetta.getTipoPrescrizione();
        String codiceFiscaleRichiedente          = informazioniRichiedente.getCodiceFiscaleUtente();
        String contestoOpRichiedente             = informazioniRichiedente.getContestoOperativo();
        String identificativoIpUtenteRichiedente = informazioniRichiedente.getIdentificativoIpRichiedente();
        String ruoloUtenteRichiedente            = informazioniRichiedente.getRuoloUtente();
        String codiceFiscalePaziente             = estremiPaziente.getCodiceFiscale();
        String servizioApplicativoChiamante      = richiedente.getServizioApplicativoChiamante();
        String uuidEstremiRichiedente            = richiedente.getUuid();

        DettaglioRicettaPrescrittaResponse response = dmawsClient.invokeDettaglioRicetta(nreRicetta, regionePrescrizione, tipoPrescrizione, codiceFiscaleRichiedente, contestoOpRichiedente, identificativoIpUtenteRichiedente, ruoloUtenteRichiedente, codiceFiscalePaziente, servizioApplicativoChiamante, uuidEstremiRichiedente);

        //Expect
        assertTrue(response != null);

    }


    @Test
    public void elencoRicette() {
        ElencoRicetteStampaPromemoriaResponse elencoRicetteStampaPromemoriaResponse = null;

        String               codiceFiscalePaziente       = "SHNKSH84A27Z100H";
        String               codiceFiscaleutente         = "SHNKSH84A27Z100H";
        String               contestoOperativo           = ApiSanPrescConstants.CONTESTO_OPERATIVO;
        String               identificativoIpRichiedente = "127.0.0.1";
        String               applicativoChiamante        = "SANSOL";
        String               uuidRichiedente             = UUID.randomUUID().toString();
        XMLGregorianCalendar dataInizio                  = ApisanPrescUtil.toGregorianCalendarFromDateString("2019-10-30","yyyy-MM-dd");
        XMLGregorianCalendar dataFine                    = ApisanPrescUtil.toGregorianCalendarFromDateString("2019-11-16","yyyy-MM-dd");


        String regionePrescrizione = ApiSanPrescConstants.DMA_PARAM_REGIONE_PIEMONTE;
        String tipoPrescrizione    = "F";

        String ruoloUtente = ApiSanPrescConstants.RUOLO_UTENTE_ASS;
        String ricetteScadute = ApiSanPrescConstants.DMA_PARAM_RICETTESCADUTE_N;

        DMAWSClient dmawsClient = new DMAWSClient();

        /* Execute call */
        try {
            elencoRicetteStampaPromemoriaResponse = dmawsClient.invokeElencoRicetteWs(codiceFiscalePaziente, codiceFiscaleutente, contestoOperativo, identificativoIpRichiedente, ruoloUtente, applicativoChiamante, uuidRichiedente, regionePrescrizione, tipoPrescrizione, ricetteScadute, dataInizio, dataFine);
        } catch (Exception e) {
            throw new WebServiceException("invokeWsDMAElencoRicetteStampaPromemoriaWhenRegionaleIsFalse", e);
        }

        assertTrue(elencoRicetteStampaPromemoriaResponse != null);


    }
}
