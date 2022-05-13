/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.test.ws;

import it.csi.apisan.apisanpresc.soap.pro.PRORELWSClient;
import it.csi.apisan.apisanpresc.soap.pro.elenconrenascosti.ElencoNreNascosti;
import it.csi.apisan.apisanpresc.soap.pro.elenconrenascosti.ElencoNreNascostiResponse;
import it.csi.apisan.apisanpresc.soap.pro.elenconrenascosti.EstremiPaziente;
import it.csi.apisan.apisanpresc.soap.pro.elenconrenascosti.Richiedente;
import it.csi.apisan.apisanpresc.soap.pro.logaudit.*;
import it.csi.apisan.apisanpresc.soap.pro.nascondinre.CodiceOperazione;
import it.csi.apisan.apisanpresc.soap.pro.nascondinre.EstremiRicetta;
import it.csi.apisan.apisanpresc.soap.pro.nascondinre.NascondiNreResponse;
import it.csi.apisan.apisanpresc.soap.pro.nascondinre.Operazione;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PRORELWSClientTEST {

    @Test
    public void elencoNreNascostiTest(){
        PRORELWSClient prorelwsClient = new PRORELWSClient();
        Richiedente richiedente = new Richiedente();
        ElencoNreNascosti elencoNreNascosti = new ElencoNreNascosti();
        EstremiPaziente estremiPaziente = new EstremiPaziente();


        richiedente.setCodiceFiscaleRichiedente("AAAAAA00B77B000F");
        richiedente.setIdentificativoIpRichiedente("123.11.2.34");
        richiedente.setServizioApplicativoChiamante("PRO");
        richiedente.setUuid("g1111");

        estremiPaziente.setCodiceFiscale("CRPYNN77A61B791K");

        elencoNreNascosti.setPaziente(estremiPaziente);
        elencoNreNascosti.setRichiedente(richiedente);

        String codiceFiscalePaziente = estremiPaziente.getCodiceFiscale();
        String codiceFiscaleRichiedente = richiedente.getCodiceFiscaleRichiedente();
        String identificatiIpRich = richiedente.getIdentificativoIpRichiedente();
        String servizioApplicativoChiamante = richiedente.getServizioApplicativoChiamante();
        String uuidRichiedente = richiedente.getUuid();
      // List<String> result = null;
//       prorelwsClient.elencoNreNascosti(codiceFiscalePaziente, codiceFiscaleRichiedente, identificatiIpRich, servizioApplicativoChiamante, uuidRichiedente);
        ElencoNreNascostiResponse result = prorelwsClient.elencoNreNascosti(codiceFiscalePaziente, codiceFiscaleRichiedente, identificatiIpRich, servizioApplicativoChiamante, uuidRichiedente);


        //Expect
        assertTrue(result != null);
    }

    @Test
    public void nascondiNreTest(){
        //setup
        PRORELWSClient prorelwsClient = new PRORELWSClient();
        EstremiPaziente estremiPaziente = new EstremiPaziente();
        EstremiRicetta estremiRicetta = new EstremiRicetta();
        Operazione operazione = new Operazione();
        it.csi.apisan.apisanpresc.soap.pro.nascondinre.Richiedente richiedente = new it.csi.apisan.apisanpresc.soap.pro.nascondinre.Richiedente()
        //When
        ;
        estremiPaziente.setCodiceFiscale("CRPYNN77A61B791K");
        estremiRicetta.setNre("010D00000000254");
        richiedente.setUuid("g1111");
        richiedente.setServizioApplicativoChiamante("PRO");
        richiedente.setIdentificativoIpRichiedente("123.11.2.34");
        richiedente.setCodiceFiscaleRichiedente("AAAAAA00B77B000F");
        operazione.setFlagOperazione(CodiceOperazione.RENDI_INVISIBILE);

        //Then
        String nre = estremiRicetta.getNre();
        String cf = estremiPaziente.getCodiceFiscale();
        String cfRichiedente = richiedente.getCodiceFiscaleRichiedente();
        String ipRichiedente = richiedente.getIdentificativoIpRichiedente();
        String servizioApplicativoChiamante = richiedente.getServizioApplicativoChiamante();
        String uuid = richiedente.getUuid();
        NascondiNreResponse response = prorelwsClient.nascondiNre(true,nre, cf, cfRichiedente, ipRichiedente, servizioApplicativoChiamante, uuid);
        //Expect
        assertTrue(response != null);
    }

    @Test
    public void logAuditTest(){
        //Setup
        PRORELWSClient prorelwsClient = new PRORELWSClient();
        Audit audit = new Audit();
        SistemaRichiedente sistemaRichiedente = new SistemaRichiedente();
        UtenteRichiedente utenteRichiedente = new UtenteRichiedente();
        LogAuditRequest logAuditRequest = new LogAuditRequest();

        //When
        audit.setCodice("TEST1");
        audit.setDescrizione("prova");
        audit.setDataOra("2019-04-02T00:00:00");
        logAuditRequest.setAudit(audit);

        sistemaRichiedente.setIdentificativoUnivocoRichiesta("1110");
        sistemaRichiedente.setServizioApplicativoChiamante("TEST");
        logAuditRequest.setSistemaRichiedente(sistemaRichiedente);

        utenteRichiedente.setCodiceFiscale("AAAAAA00B77B000F");
        utenteRichiedente.setIdentificativoIP("127.0.0.122");
        logAuditRequest.setUtenteRichiedente(utenteRichiedente);

        logAuditRequest.setCodiceFiscalePaziente("CRPYNN77A61B791K");
    

        //Then
        String codiceFiscale = logAuditRequest.getCodiceFiscalePaziente();
        String descrizioneAudit = audit.getDescrizione();
        String codice = audit.getCodice();
        String identificativoRichiesta = sistemaRichiedente.getIdentificativoUnivocoRichiesta();
        String servizioApplicativoChiamante = sistemaRichiedente.getServizioApplicativoChiamante();
        String codiceFiscaleUtenteRichiedente = utenteRichiedente.getCodiceFiscale();
        String identificativoIpUtenteRichiedente = utenteRichiedente.getIdentificativoIP();
        LogAuditResponse response = prorelwsClient.logAudit(codiceFiscale, descrizioneAudit, codice, identificativoRichiesta, servizioApplicativoChiamante, codiceFiscaleUtenteRichiedente, identificativoIpUtenteRichiedente);
        //Expect
        assertTrue(response!=null);
    }
}
