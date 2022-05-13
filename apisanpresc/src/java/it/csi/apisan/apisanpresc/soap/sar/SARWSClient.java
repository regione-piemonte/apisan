/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.soap.sar;

import it.csi.apisan.apisanpresc.common.ApiSanPrescConstants;
import it.csi.apisan.apisanpresc.soap.ClientPasswordCallback;
import it.csi.apisan.apisanpresc.soap.sar.brokerservice.BrokerService;
import it.csi.apisan.apisanpresc.soap.sar.brokerservice.BrokerService_Service;
import it.csi.apisan.apisanpresc.soap.sar.visprescsol.DemVisualizzaPrescrittoPazienteSOL;
import it.csi.apisan.apisanpresc.soap.sar.visprescsol.VisualizzaPrescrittoPazienteSOLPT;
import it.csi.apisan.apisanpresc.soap.sar.visprescsol.VisualizzaPrescrittoPazienteSOLRicevuta;
import it.csi.apisan.apisanpresc.soap.sar.visprescsol.VisualizzaPrescrittoPazienteSOLRichiesta;
import it.csi.apisan.apisanpresc.util.ApisanPrescUtil;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.ws.security.handler.WSHandlerConstants;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class SARWSClient {

    private static final QName  SERVICE_NAME        = new QName("http://visualizzaprescrittopazientesol.xsd.dem.regione.piemonte.it", "demVisualizzaPrescrittoPazienteSOL");
    private static final QName  SERVICE_NAME_BROKER = new QName("http://relbl.csi.it/", "BrokerService");

	public VisualizzaPrescrittoPazienteSOLRicevuta invokeVisualizzaPrePazSOL(String cryptedCf, String cfRichiedente, Date iniRange, Date fineRange, String tipoPrescrizione, String tipoRegime, String tipoRicetta, String ricetteScadute, String ricErogNonSSN, String nre, String applicativoChiamante, String regionePrescrizione, String ipAddress) throws MalformedURLException {
        VisualizzaPrescrittoPazienteSOLRichiesta richiesta = new VisualizzaPrescrittoPazienteSOLRichiesta();
        VisualizzaPrescrittoPazienteSOLRicevuta  result    = new VisualizzaPrescrittoPazienteSOLRicevuta();

        richiesta.setCfAssistito(cryptedCf);
        richiesta.setNre(nre);
        richiesta.setTipoRegime(tipoRegime);
        richiesta.setRichiedente(cfRichiedente);
        richiesta.setTipoRicetta(tipoRicetta);
        richiesta.setTipoPrescrizione(tipoPrescrizione);
        richiesta.getStatoProcesso().add(ApiSanPrescConstants.SAR_CONSTANTS_STATOPROCESSO_3);
        richiesta.getStatoProcesso().add(ApiSanPrescConstants.SAR_CONSTANTS_STATOPROCESSO_5);
        richiesta.setDataIniRange(ApisanPrescUtil.toStringFromDate(iniRange, "yyyy-MM-dd"));
        richiesta.setDataFineRange(ApisanPrescUtil.toStringFromDate(fineRange, "yyyy-MM-dd"));
        richiesta.setRicetteScadute(ricetteScadute);
        richiesta.setRicErogNonSSN(ricErogNonSSN);
        richiesta.setRegionePrescrizione(regionePrescrizione);
        richiesta.setPinCode(ApiSanPrescConstants.SAR_TBD_PINCODE);
        richiesta.setApplicativoChiamante(applicativoChiamante);
        richiesta.setContestoOperativo("");
        richiesta.setIp_chiamante(ipAddress);
        // Execute
        URL                                wsdlURL = DemVisualizzaPrescrittoPazienteSOL.WSDL_LOCATION;
        DemVisualizzaPrescrittoPazienteSOL ss      = new DemVisualizzaPrescrittoPazienteSOL(wsdlURL, SERVICE_NAME);
        VisualizzaPrescrittoPazienteSOLPT  port    = ss.getDemVisualizzaPrescrittoPazienteSOL();

//Interceptor        
    /*    Client   client      = ClientProxy.getClient(port);
        Endpoint cxfEndpoint = client.getEndpoint();

       
        Map<String, Object>  inProps              = new HashMap<String, Object>();
        
        Map<String, Object> outProps = new HashMap<String, Object>();
        
        outProps.put("action", "UsernameToken");
        outProps.put(WSHandlerConstants.USER, ApiSanPrescConstants.SAR_AUTHENTICAION_USER);
        outProps.put(WSHandlerConstants.PASSWORD_TYPE, ApiSanPrescConstants.SAR_AUTHENTICAION_PASSWORD);
        
        
        WSS4JOutInterceptor outInterceptor = new WSS4JOutInterceptor(outProps);
        cxfEndpoint.getInInterceptors().add(new LoggingInInterceptor());
        cxfEndpoint.getOutInterceptors().add(new LoggingOutInterceptor());
        cxfEndpoint.getOutInterceptors().add(outInterceptor);*/

        BindingProvider prov = (BindingProvider) port;
        prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, ApiSanPrescConstants.SAR_AUTHENTICAION_USER);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, ApiSanPrescConstants.SAR_AUTHENTICAION_PASSWORD);
        prov.getRequestContext().put("schema-validation-enabled", false);
        
  
        //prov.getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, outProps);      
        
        result = port.visualizzaPrescrittoPazienteSOL(richiesta);

        return result;
    }

    public String encryptSarCFAss(String cf) {
        URL                   wsdlURL = BrokerService_Service.WSDL_LOCATION;
        BrokerService_Service ss      = new BrokerService_Service(wsdlURL, SERVICE_NAME_BROKER);
        BrokerService         port    = ss.getBrokerServicePort();
        BindingProvider       prov    = (BindingProvider) port;
        prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, ApiSanPrescConstants.SAR_ENCRYPT_USER);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, ApiSanPrescConstants.SAR_ENCRYPT_PASSWORD);

        String result = port.encryptCodAss(cf);

        return result;
    }

    public String decryptSarCfAss(String cf) {
        URL                   wsdlURL = BrokerService_Service.WSDL_LOCATION;
        BrokerService_Service ss      = new BrokerService_Service(wsdlURL, SERVICE_NAME_BROKER);
        BrokerService         port    = ss.getBrokerServicePort();
        String                result  = port.decryptCodAss(cf);


        return result;
    }

}
