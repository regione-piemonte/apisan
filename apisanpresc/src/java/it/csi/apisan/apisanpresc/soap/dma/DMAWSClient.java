/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.soap.dma;


import it.csi.apisan.apisanpresc.business.apisanpresc.service.elencoricette.ElencoRicetteUtil;
import it.csi.apisan.apisanpresc.common.ApiSanPrescConstants;
import it.csi.apisan.apisanpresc.soap.ClientPasswordCallback;
import it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta.*;
import it.csi.apisan.apisanpresc.soap.dma.elencoricetteservice.EstremiPaziente;
import it.csi.apisan.apisanpresc.soap.dma.elencoricetteservice.InformazioniRichiedente;
import it.csi.apisan.apisanpresc.soap.dma.elencoricetteservice.Ricetta;
import it.csi.apisan.apisanpresc.soap.dma.elencoricetteservice.Richiedente;
import it.csi.apisan.apisanpresc.soap.dma.elencoricetteservice.*;
import it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta.CCScaricaPdfRicettaService;
import it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta.CCScaricaPdfRicettaService_Service;
import it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta.ScaricaPdfRicettaRequest;
import it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta.ScaricaPdfRicettaResponse;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.ws.security.handler.WSHandlerConstants;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class DMAWSClient {


    public ElencoRicetteStampaPromemoriaResponse invokeElencoRicetteWs(String codiceFiscalePaziente, String codiceFiscaleutente, String contestoOperativo, String identificativoIpRichiedente, String ruoloUtente, String applicativoChiamante, String uuidRichiedente, String regionePrescrizione, String tipoPrescrizione, String ricetteScadute, XMLGregorianCalendar dataInizio, XMLGregorianCalendar dataFine) {
        URL                     wsdlURL      = CCElencoRicetteStampaPromemoriaService_Service.WSDL_LOCATION;
        HashMap<String, Object> result       = new HashMap<>();


        CCElencoRicetteStampaPromemoriaService_Service ss   = new CCElencoRicetteStampaPromemoriaService_Service(wsdlURL, CCElencoRicetteStampaPromemoriaService_Service.SERVICE);
        CCElencoRicetteStampaPromemoriaService         port = ss.getCCElencoRicetteStampaPromemoriaServicePort();

        Client   client      = ClientProxy.getClient(port);
        Endpoint cxfEndpoint = client.getEndpoint();

        /* Interceptors IN */
        Map<String, Object>  inProps              = new HashMap<String, Object>();
        LoggingInInterceptor loggingInInterceptor = new LoggingInInterceptor();

        /* Interceptors OUT */
        Map<String, Object> outProps = new HashMap<String, Object>();
        outProps.put("action", " UsernameToken " + WSHandlerConstants.TIMESTAMP);
        ClientPasswordCallback clientPasswordCallback = new ClientPasswordCallback();
        clientPasswordCallback.setPasswordDMA(ApiSanPrescConstants.DMA_PASSWORD_SOAP);
        clientPasswordCallback.setUserDMA(ApiSanPrescConstants.DMA_USER_SOAP);
        outProps.put("passwordCallbackRef", clientPasswordCallback);
        outProps.put("passwordType", "PasswordDigest"); // TODO CHECK
        outProps.put("user", ApiSanPrescConstants.DMA_USER_SOAP);
        WSS4JOutInterceptor outInterceptor = new WSS4JOutInterceptor(outProps);

        /* Append Interceptors */
        cxfEndpoint.getInInterceptors().add(loggingInInterceptor);
        cxfEndpoint.getOutInterceptors().add(new LoggingOutInterceptor());
        cxfEndpoint.getOutInterceptors().add(outInterceptor);


        BindingProvider bindingProviderPreCompRegCl = (BindingProvider) port;

        String soapAction = "http://dmacc.csi.it/ElencoRicetteStampaPromemoriaService";

        ((BindingProvider) bindingProviderPreCompRegCl).getRequestContext().put(BindingProvider.SOAPACTION_URI_PROPERTY,
                soapAction);
        bindingProviderPreCompRegCl.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                ApiSanPrescConstants.DMA_ELENCORICETTESTAMPAPROMEMORIA_ENDPOINT);

        ElencoRicetteStampaPromemoriaRequest request                 = new ElencoRicetteStampaPromemoriaRequest();
        FiltroRicette                        filtro                  = new FiltroRicette();
        Richiedente                          richiedente             = new Richiedente();
        InformazioniRichiedente              informazioniRichiedente = new InformazioniRichiedente();
        EstremiPaziente                      estremiPaziente         = new EstremiPaziente();


        //INIZIALIZZAZIONE DEL VALORI
        estremiPaziente.setCodiceFiscale(codiceFiscalePaziente);
        informazioniRichiedente.setCodiceFiscaleUtente(codiceFiscaleutente);
        informazioniRichiedente.setContestoOperativo(contestoOperativo);
        informazioniRichiedente.setIdentificativoIpRichiedente(identificativoIpRichiedente);
        informazioniRichiedente.setRuoloUtente(ruoloUtente);

        richiedente.setServizioApplicativoChiamante(applicativoChiamante);
        richiedente.setUuid(uuidRichiedente);

        filtro.setDataInizio(dataInizio);
        filtro.setDataFine(dataFine);
        filtro.setTipoPrescrizione(tipoPrescrizione);
        filtro.setRicetteScadute(ricetteScadute);
        filtro.setRegionePrescrizione(regionePrescrizione);

        request.setPaziente(estremiPaziente);
        request.setInformazioniRichiedente(informazioniRichiedente);
        request.setRichiedente(richiedente);
        request.setFiltro(filtro);

        /* Credentials */
        BindingProvider prov = (BindingProvider) port;
        prov.getRequestContext().put("schema-validation-enabled", false);
        prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, ApiSanPrescConstants.DMA_USER_SOAP);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, ApiSanPrescConstants.DMA_PASSWORD_SOAP);

        // Execute
        ElencoRicetteStampaPromemoriaResponse response = port.elencoRicetteStampaPromemoria(request);
        return response;

    }

    public DettaglioRicettaPrescrittaResponse invokeDettaglioRicetta(String nreRicetta, String regionePrescrizione, String tipoPrescrizione, String codiceFiscaleRichiedente, String contestoOpRichiedente, String identificatoIpUtenteRichiedente, String ruoloUtenteRichiedente, String codiceFiscalePaziente, String servizioApplicativoChiamante, String uuidEstremiRichiedente) {
        HashMap<String, Object> result       = new HashMap<>();

        URL                                         wsdlURL = CCDettaglioRicettaPrescrittaService_Service.WSDL_LOCATION;
        CCDettaglioRicettaPrescrittaService_Service ss      = new CCDettaglioRicettaPrescrittaService_Service(wsdlURL, CCDettaglioRicettaPrescrittaService_Service.SERVICE);
        CCDettaglioRicettaPrescrittaService         port    = ss.getCCDettaglioRicettaPrescrittaServicePort();

        Client   client      = ClientProxy.getClient(port);
        Endpoint cxfEndpoint = client.getEndpoint();

        /* Interceptors IN */
        Map<String, Object>  inProps              = new HashMap<String, Object>();
        LoggingInInterceptor loggingInInterceptor = new LoggingInInterceptor();

        /* Interceptors OUT */
        Map<String, Object> outProps = new HashMap<String, Object>();
        outProps.put("action", " UsernameToken " + WSHandlerConstants.TIMESTAMP);
        ClientPasswordCallback clientPasswordCallback = new ClientPasswordCallback();
        clientPasswordCallback.setPasswordDMA(ApiSanPrescConstants.DMA_PASSWORD_SOAP);
        clientPasswordCallback.setUserDMA(ApiSanPrescConstants.DMA_USER_SOAP);
        outProps.put("passwordCallbackRef", clientPasswordCallback);
        outProps.put("passwordType", "PasswordDigest"); // TODO CHECK
        outProps.put("user", ApiSanPrescConstants.DMA_USER_SOAP);
        WSS4JOutInterceptor outInterceptor = new WSS4JOutInterceptor(outProps);

        /* Append Interceptors */
        cxfEndpoint.getInInterceptors().add(loggingInInterceptor);
        cxfEndpoint.getOutInterceptors().add(new LoggingOutInterceptor());
        cxfEndpoint.getOutInterceptors().add(outInterceptor);

        BindingProvider bindingProviderPreCompRegCl = (BindingProvider) port;

        String soapAction = "http://dmacc.csi.it/DettaglioRicettaPrescrittaService";

        ((BindingProvider) bindingProviderPreCompRegCl).getRequestContext().put(BindingProvider.SOAPACTION_URI_PROPERTY, soapAction);
        bindingProviderPreCompRegCl.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, ApiSanPrescConstants.DMA_DETTAGLIORICETTAPRESCRITTA_ENDPOINT);

        DettaglioRicettaPrescrittaRequest request        = new DettaglioRicettaPrescrittaRequest();
        EstremiRicetta                    estremiRicetta = new EstremiRicetta();
        estremiRicetta.setNre(nreRicetta);
        estremiRicetta.setRegionePrescrizione(regionePrescrizione);
        estremiRicetta.setTipoPrescrizione(tipoPrescrizione);

        it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta.InformazioniRichiedente informazioniRichiedente = new it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta.InformazioniRichiedente();
        informazioniRichiedente.setCodiceFiscaleUtente(codiceFiscaleRichiedente);
        informazioniRichiedente.setContestoOperativo(contestoOpRichiedente);
        informazioniRichiedente.setIdentificativoIpRichiedente(identificatoIpUtenteRichiedente);
        informazioniRichiedente.setRuoloUtente(ruoloUtenteRichiedente);

        it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta.EstremiPaziente estremiPaziente = new it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta.EstremiPaziente();
        estremiPaziente.setCodiceFiscale(codiceFiscalePaziente);

        it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta.Richiedente estremiRichiedente = new it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta.Richiedente();
        estremiRichiedente.setServizioApplicativoChiamante(servizioApplicativoChiamante);
        estremiRichiedente.setUuid(uuidEstremiRichiedente);

        request.setEstremiRicetta(estremiRicetta);
        request.setInformazioniRichiedente(informazioniRichiedente);
        request.setPaziente(estremiPaziente);
        request.setRichiedente(estremiRichiedente);

        /* Credentials */
        BindingProvider prov = (BindingProvider) port;
        prov.getRequestContext().put("schema-validation-enabled", false);
        prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, ApiSanPrescConstants.DMA_USER_SOAP);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, ApiSanPrescConstants.DMA_PASSWORD_SOAP);

        // Request
        DettaglioRicettaPrescrittaResponse response = port.dettaglioRicettaPrescritta(request);
        return response;
    }


    public ScaricaPdfRicettaResponse invokeStampaPdfRicetteWs(String codiceFiscalePaziente, String codiceFiscaleutente, String contestoOperativo,
                                                              String identificativoIpRichiedente, String ruoloUtente, String applicativoChiamante,
                                                              String nre, String uuidRichiedente, String tipoPrescrizione, String regionePrescrizione) {

        URL wsdlURL = CCScaricaPdfRicettaService_Service.WSDL_LOCATION;

        CCScaricaPdfRicettaService_Service ss = new CCScaricaPdfRicettaService_Service(wsdlURL, CCScaricaPdfRicettaService_Service.SERVICE);
        CCScaricaPdfRicettaService port = ss.getCCScaricaPdfRicettaServicePort();


        Client   client      = ClientProxy.getClient(port);
        Endpoint cxfEndpoint = client.getEndpoint();

        /* Interceptors IN */
        Map<String, Object>  inProps              = new HashMap<String, Object>();
        LoggingInInterceptor loggingInInterceptor = new LoggingInInterceptor();

        /* Interceptors OUT */
        Map<String, Object> outProps = new HashMap<String, Object>();
        outProps.put("action", " UsernameToken " + WSHandlerConstants.TIMESTAMP);
        ClientPasswordCallback clientPasswordCallback = new ClientPasswordCallback();
        clientPasswordCallback.setPasswordDMA(ApiSanPrescConstants.DMA_PASSWORD_SOAP);
        clientPasswordCallback.setUserDMA(ApiSanPrescConstants.DMA_USER_SOAP);
        outProps.put("passwordCallbackRef", clientPasswordCallback);
        outProps.put("passwordType", "PasswordDigest"); // TODO CHECK
        outProps.put("user", ApiSanPrescConstants.DMA_USER_SOAP);
        WSS4JOutInterceptor outInterceptor = new WSS4JOutInterceptor(outProps);

        /* Append Interceptors */
        cxfEndpoint.getInInterceptors().add(loggingInInterceptor);
        cxfEndpoint.getOutInterceptors().add(new LoggingOutInterceptor());
        cxfEndpoint.getOutInterceptors().add(outInterceptor);

        BindingProvider bindingProviderPreCompRegCl = (BindingProvider) port;

        String soapAction = "http://dmacc.csi.it/ScaricaPDFRicettaService";

        ((BindingProvider) bindingProviderPreCompRegCl).getRequestContext().put(BindingProvider.SOAPACTION_URI_PROPERTY,
                soapAction);
        bindingProviderPreCompRegCl.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                ApiSanPrescConstants.DMA_PRO_STAMPARICETTAPDF_ADDRESS_PROPERTY);


        ScaricaPdfRicettaRequest request = new ScaricaPdfRicettaRequest();

        it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta.EstremiPaziente estremiPaziente = new it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta.EstremiPaziente();
        estremiPaziente.setCodiceFiscale(codiceFiscalePaziente);

        it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta.InformazioniRichiedente informazioniRichiedente = new it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta.InformazioniRichiedente();
        informazioniRichiedente.setCodiceFiscaleUtente(codiceFiscaleutente);
        informazioniRichiedente.setContestoOperativo(contestoOperativo);
        informazioniRichiedente.setIdentificativoIpRichiedente(identificativoIpRichiedente);
        informazioniRichiedente.setRuoloUtente(ruoloUtente);

        it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta.Richiedente richiedente = new it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta.Richiedente();
        richiedente.setServizioApplicativoChiamante(applicativoChiamante);
        richiedente.setUuid(uuidRichiedente);

        it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta.EstremiRicetta ricetta = new it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta.EstremiRicetta();
        ricetta.setTipoPrescrizione(tipoPrescrizione);
        ricetta.setRegionePrescrizione(regionePrescrizione);
        ricetta.setNre(nre);

        request.setPaziente(estremiPaziente);
        request.setInformazioniRichiedente(informazioniRichiedente);
        request.setRichiedente(richiedente);
        request.setEstremiRicetta(ricetta);

        /* Credentials */
        BindingProvider prov = (BindingProvider) port;
        prov.getRequestContext().put("schema-validation-enabled", false);
        prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, ApiSanPrescConstants.DMA_USER_SOAP);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, ApiSanPrescConstants.DMA_PASSWORD_SOAP);

        // Execute
        ScaricaPdfRicettaResponse response = port.scaricaPdfRicetta(request);

        return response;

    }

    private HashMap<String, Object> ricettaToMap(Ricetta ricetta) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("codiceFiscalePaziente", ricetta.getCodiceFiscalePaziente());
        result.put("completa", ricetta.getCompleta());
        result.put("dataCompilazione", ElencoRicetteUtil.toDate(ricetta.getDataCompilazione()));
        result.put("livelloCondifidenzialita", ricetta.getLivelloCondifidenzialita());
        result.put("medicoPrescrittore", ricetta.getMedicoPrescrittore());
        result.put("nre", ricetta.getNre());
        result.put("oid", ricetta.getOid());
        result.put("regionePrescrizione", ricetta.getRegionePrescrizione());
        result.put("stato", ricetta.getStato().getCodice() + ":" + ricetta.getStato().getDescrizione());
        result.put("tipologia", ricetta.getTipologia().getCodice() + ":" + ricetta.getTipologia().getDescrizione());

        return result;

    }
}
