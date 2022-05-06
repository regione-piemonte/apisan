/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.integration.esenzioni.dmacc;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.14
 * 2021-01-18T13:19:14.602+01:00
 * Generated source version: 2.7.14
 * 
 */
@WebServiceClient(name = "EsenzioniService", 
                  wsdlLocation = "file:/C:/Users/Sestu/AppData/Local/Temp/tempdir6287067867073581497.tmp/EsenzioniService_1.wsdl",
                  targetNamespace = "http://dmacc.csi.it/") 
public class EsenzioniService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://dmacc.csi.it/", "EsenzioniService");
    public final static QName EsenzioniServicePort = new QName("http://dmacc.csi.it/", "EsenzioniServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Sestu/AppData/Local/Temp/tempdir6287067867073581497.tmp/EsenzioniService_1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(EsenzioniService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Sestu/AppData/Local/Temp/tempdir6287067867073581497.tmp/EsenzioniService_1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public EsenzioniService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EsenzioniService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EsenzioniService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public EsenzioniService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public EsenzioniService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public EsenzioniService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns EsenzioniService
     */
    @WebEndpoint(name = "EsenzioniServicePort")
    public EsenzioniService getEsenzioniServicePort() {
        return super.getPort(EsenzioniServicePort, EsenzioniService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EsenzioniService
     */
    @WebEndpoint(name = "EsenzioniServicePort")
    public EsenzioniService getEsenzioniServicePort(WebServiceFeature... features) {
        return super.getPort(EsenzioniServicePort, EsenzioniService.class, features);
    }

}