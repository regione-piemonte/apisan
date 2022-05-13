/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.soap.pro;

import it.csi.apisan.apisanpresc.soap.pro.elenconrenascosti.Richiedente;
import it.csi.apisan.apisanpresc.common.ApiSanPrescConstants;
import it.csi.apisan.apisanpresc.soap.ClientPasswordCallback;
import it.csi.apisan.apisanpresc.soap.pro.elenconrenascosti.*;
import it.csi.apisan.apisanpresc.soap.pro.logaudit.LogAuditService_Service;
import it.csi.apisan.apisanpresc.soap.pro.nascondinre.EstremiPaziente;
import it.csi.apisan.apisanpresc.soap.pro.nascondinre.*;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.ws.security.handler.WSHandlerConstants;

import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class PRORELWSClient {


    public it.csi.apisan.apisanpresc.soap.pro.logaudit.LogAuditResponse logAudit(String codiceFiscale, String descrizioneAudit, String codice, String identificativoRichiesta, String servizioApplicativoChiamante, String codiceFiscaleUtenteRichiedente, String identificativoIpUtenteRichiedente) {
        QName                                                               SERVICE_NAME      = new QName("http://dmapro.csi.it/", "LogAuditService");
        String                                                              _codice           = codice != null ? codice : "";
        String                                                              _descrizioneAudit = descrizioneAudit != null ? descrizioneAudit : "Nessuna Descrizione";
        DateTimeFormatter 													dtf 			  = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
    	LocalDateTime 														now 			  = LocalDateTime.now();
        String                                                              _date             = dtf.format(now); //"2019-04-02T00:00:00";
        it.csi.apisan.apisanpresc.soap.pro.logaudit.LogAuditResponse        response          = null;
        URL                                                                 wsdlURL           = LogAuditService_Service.WSDL_LOCATION;
        it.csi.apisan.apisanpresc.soap.pro.logaudit.LogAuditService_Service ss                = new it.csi.apisan.apisanpresc.soap.pro.logaudit.LogAuditService_Service(wsdlURL, SERVICE_NAME);
        it.csi.apisan.apisanpresc.soap.pro.logaudit.LogAuditService         port              = ss.getLogAuditServicePort();
        // Request
        it.csi.apisan.apisanpresc.soap.pro.logaudit.LogAuditRequest logAuditRequest = new it.csi.apisan.apisanpresc.soap.pro.logaudit.LogAuditRequest();
        logAuditRequest.setCodiceFiscalePaziente(codiceFiscale);

        it.csi.apisan.apisanpresc.soap.pro.logaudit.Audit audit = new it.csi.apisan.apisanpresc.soap.pro.logaudit.Audit();
        audit.setDescrizione(_descrizioneAudit);
        audit.setDataOra(_date);
        audit.setCodice(_codice);

        it.csi.apisan.apisanpresc.soap.pro.logaudit.SistemaRichiedente sistemaRichiedente = new it.csi.apisan.apisanpresc.soap.pro.logaudit.SistemaRichiedente();
        sistemaRichiedente.setIdentificativoUnivocoRichiesta(identificativoRichiesta);
        sistemaRichiedente.setServizioApplicativoChiamante(servizioApplicativoChiamante);

        it.csi.apisan.apisanpresc.soap.pro.logaudit.UtenteRichiedente utenteRichiedente = new it.csi.apisan.apisanpresc.soap.pro.logaudit.UtenteRichiedente();
        utenteRichiedente.setCodiceFiscale(codiceFiscaleUtenteRichiedente);
        utenteRichiedente.setIdentificativoIP(identificativoIpUtenteRichiedente);
        logAuditRequest.setAudit(audit);
        logAuditRequest.setSistemaRichiedente(sistemaRichiedente);
        logAuditRequest.setUtenteRichiedente(utenteRichiedente);

        Client   client      = ClientProxy.getClient(port);
        Endpoint cxfEndpoint = client.getEndpoint();

        /* Interceptors IN */
        LoggingInInterceptor loggingInInterceptor = new LoggingInInterceptor();

        /* Interceptors OUT */
        Map<String, Object> outProps = new HashMap<String, Object>();
        outProps.put("action", " UsernameToken "+ WSHandlerConstants.TIMESTAMP ); //
        ClientPasswordCallback clientPasswordCallback = new ClientPasswordCallback();
        clientPasswordCallback.setPasswordDMA(ApiSanPrescConstants.PRO_PASSWORD_SOAP);//
        clientPasswordCallback.setUserDMA(ApiSanPrescConstants.PRO_USER_SOAP);
        outProps.put("passwordCallbackRef", clientPasswordCallback);
        outProps.put("passwordType", "PasswordDigest");
        outProps.put("user", ApiSanPrescConstants.PRO_USER_SOAP);
        WSS4JOutInterceptor outInterceptor = new WSS4JOutInterceptor(outProps);

        /* Append Interceptors */
        cxfEndpoint.getInInterceptors().add(loggingInInterceptor);
        cxfEndpoint.getOutInterceptors().add(new LoggingOutInterceptor());
        cxfEndpoint.getOutInterceptors().add(outInterceptor);

        /* Credentials */
        BindingProvider prov = (BindingProvider) port;
        prov.getRequestContext().put("schema-validation-enabled", false);
        prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, ApiSanPrescConstants.PRO_USER_SOAP);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, ApiSanPrescConstants.PRO_PASSWORD_SOAP);
        
        response = port.logAudit(logAuditRequest);
        return response;
    }

    public ElencoNreNascostiResponse elencoNreNascosti(String codiceFiscalePaziente, String codiceFiscaleRichiedente, String identificativoIpRich, String servizioApplicativoChiamante, String uuidRichiedente) {
        QName                     SERVICE_NAME = new QName("http://dmapro.csi.it/", "ElencoNreNascostiService");
        ElencoNreNascostiResponse result       = null;

        URL                              wsdlURL = ElencoNreNascostiService_Service.WSDL_LOCATION;
        ElencoNreNascostiService_Service ss      = new ElencoNreNascostiService_Service(wsdlURL, SERVICE_NAME);
        ElencoNreNascostiService         port    = ss.getElencoNreNascostiServicePort();

        ElencoNreNascosti request = new ElencoNreNascosti();

        it.csi.apisan.apisanpresc.soap.pro.elenconrenascosti.EstremiPaziente estremiPaziente = new it.csi.apisan.apisanpresc.soap.pro.elenconrenascosti.EstremiPaziente();
        estremiPaziente.setCodiceFiscale(codiceFiscalePaziente);

        Richiedente richiedente = new Richiedente();
        richiedente.setCodiceFiscaleRichiedente(codiceFiscaleRichiedente);
        richiedente.setIdentificativoIpRichiedente(identificativoIpRich);
        richiedente.setServizioApplicativoChiamante(servizioApplicativoChiamante);
        richiedente.setUuid(uuidRichiedente);

        request.setPaziente(estremiPaziente);
        request.setRichiedente(richiedente);

        Client   client      = ClientProxy.getClient(port);
        Endpoint cxfEndpoint = client.getEndpoint();

        /* Interceptors IN */
        LoggingInInterceptor loggingInInterceptor = new LoggingInInterceptor();

        /* Interceptors OUT */
        Map<String, Object> outProps = new HashMap<String, Object>();
        outProps.put("action", " UsernameToken "+ WSHandlerConstants.TIMESTAMP ); //
        ClientPasswordCallback clientPasswordCallback = new ClientPasswordCallback();
        clientPasswordCallback.setPasswordDMA(ApiSanPrescConstants.PRO_PASSWORD_SOAP);//
        clientPasswordCallback.setUserDMA(ApiSanPrescConstants.PRO_USER_SOAP);
        outProps.put("passwordCallbackRef", clientPasswordCallback);
        outProps.put("passwordType", "PasswordDigest");
        outProps.put("user", ApiSanPrescConstants.PRO_USER_SOAP);
        WSS4JOutInterceptor outInterceptor = new WSS4JOutInterceptor(outProps);

        /* Append Interceptors */
        cxfEndpoint.getInInterceptors().add(loggingInInterceptor);
        cxfEndpoint.getOutInterceptors().add(new LoggingOutInterceptor());
        cxfEndpoint.getOutInterceptors().add(outInterceptor);

        /* Credentials */
        BindingProvider prov = (BindingProvider) port;
        prov.getRequestContext().put("schema-validation-enabled", false);
        prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, ApiSanPrescConstants.PRO_USER_SOAP);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, ApiSanPrescConstants.PRO_PASSWORD_SOAP);
        
        ElencoNreNascostiResponse response = port.elencoNreNascosti(request);

        if (response != null && response.getListaNre() != null) {
            result = response;
        }

        return result;
    }

    public NascondiNreResponse nascondiNre(Boolean isNascosta, String nre, String cf, String cfRichiedente, String ipRichiedente, String servizioApplicativoChiamante, String uuid) {

        final QName SERVICE_NAME = new QName("http://dmapro.csi.it/", "NascondiNreService");

        URL url= NascondiNreService_Service.WSDL_LOCATION;
        NascondiNreService_Service ss      = new NascondiNreService_Service(url, SERVICE_NAME);
        NascondiNreService         port    = ss.getNascondiNreServicePort();
        NascondiNre                request = new NascondiNre();

        EstremiRicetta estremiRicetta = new EstremiRicetta();
        estremiRicetta.setNre(nre);

        Operazione operazione = new Operazione();
        operazione.setFlagOperazione(isNascosta ? CodiceOperazione.RENDI_INVISIBILE : CodiceOperazione.RENDI_VISIBILE);

        EstremiPaziente estremiPaziente = new EstremiPaziente();
        estremiPaziente.setCodiceFiscale(cf);

        it.csi.apisan.apisanpresc.soap.pro.nascondinre.Richiedente richiedente = new it.csi.apisan.apisanpresc.soap.pro.nascondinre.Richiedente();
        richiedente.setCodiceFiscaleRichiedente(cfRichiedente);
        richiedente.setIdentificativoIpRichiedente(ipRichiedente);
        richiedente.setServizioApplicativoChiamante(servizioApplicativoChiamante);
        richiedente.setUuid(uuid);

        request.setEstremiRicetta(estremiRicetta);
        request.setOperazione(operazione);
        request.setPaziente(estremiPaziente);
        request.setRichiedente(richiedente);
        
        Client   client      = ClientProxy.getClient(port);
        Endpoint cxfEndpoint = client.getEndpoint();

        /* Interceptors IN */
        LoggingInInterceptor loggingInInterceptor = new LoggingInInterceptor();

        /* Interceptors OUT */
        Map<String, Object> outProps = new HashMap<String, Object>();
        outProps.put("action", " UsernameToken "+ WSHandlerConstants.TIMESTAMP ); //
        ClientPasswordCallback clientPasswordCallback = new ClientPasswordCallback();
        clientPasswordCallback.setPasswordDMA(ApiSanPrescConstants.PRO_PASSWORD_SOAP);//
        clientPasswordCallback.setUserDMA(ApiSanPrescConstants.PRO_USER_SOAP);
        outProps.put("passwordCallbackRef", clientPasswordCallback);
        outProps.put("passwordType", "PasswordDigest");
        outProps.put("user", ApiSanPrescConstants.PRO_USER_SOAP);
        WSS4JOutInterceptor outInterceptor = new WSS4JOutInterceptor(outProps);

        /* Append Interceptors */
        cxfEndpoint.getInInterceptors().add(loggingInInterceptor);
        cxfEndpoint.getOutInterceptors().add(new LoggingOutInterceptor());
        cxfEndpoint.getOutInterceptors().add(outInterceptor);

        /* Credentials */
        BindingProvider prov = (BindingProvider) port;
        prov.getRequestContext().put("schema-validation-enabled", false);
        prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, ApiSanPrescConstants.PRO_USER_SOAP);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, ApiSanPrescConstants.PRO_PASSWORD_SOAP);
        
        NascondiNreResponse response = port.nascondiNre(request);

        return response;

    }


}


