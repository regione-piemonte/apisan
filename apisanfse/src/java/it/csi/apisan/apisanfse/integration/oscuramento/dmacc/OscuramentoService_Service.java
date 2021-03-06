/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.integration.oscuramento.dmacc;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.14
 * 2021-01-25T09:39:49.734+01:00
 * Generated source version: 2.7.14
 * 
 */
@WebServiceClient(name = "OscuramentoService", 
                  wsdlLocation = "file:/C:/Users/Sestu/AppData/Local/Temp/tempdir1201914280685385530.tmp/OscuramentoService_1.wsdl",
                  targetNamespace = "http://dmacc.csi.it/") 
public class OscuramentoService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://dmacc.csi.it/", "OscuramentoService");
    public final static QName OscuramentoServicePort = new QName("http://dmacc.csi.it/", "OscuramentoServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Sestu/AppData/Local/Temp/tempdir1201914280685385530.tmp/OscuramentoService_1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(OscuramentoService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Sestu/AppData/Local/Temp/tempdir1201914280685385530.tmp/OscuramentoService_1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public OscuramentoService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OscuramentoService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OscuramentoService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public OscuramentoService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public OscuramentoService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public OscuramentoService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns OscuramentoService
     */
    @WebEndpoint(name = "OscuramentoServicePort")
    public OscuramentoService getOscuramentoServicePort() {
        return super.getPort(OscuramentoServicePort, OscuramentoService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OscuramentoService
     */
    @WebEndpoint(name = "OscuramentoServicePort")
    public OscuramentoService getOscuramentoServicePort(WebServiceFeature... features) {
        return super.getPort(OscuramentoServicePort, OscuramentoService.class, features);
    }

}
