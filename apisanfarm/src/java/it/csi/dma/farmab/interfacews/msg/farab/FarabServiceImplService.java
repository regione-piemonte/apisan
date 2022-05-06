/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.dma.farmab.interfacews.msg.farab;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.14
 * 2021-11-29T16:39:33.946+01:00
 * Generated source version: 2.7.14
 * 
 */
@WebServiceClient(name = "FarabServiceImplService", 
                  wsdlLocation = "file:/C:/Users/2048/AppData/Local/Temp/tempdir8129259641669955741.tmp/FarabService_1.wsdl",
                  targetNamespace = "http://farab.msg.interfacews.farmab.dma.csi.it/") 
public class FarabServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://farab.msg.interfacews.farmab.dma.csi.it/", "FarabServiceImplService");
    public final static QName FarabServiceImplPort = new QName("http://farab.msg.interfacews.farmab.dma.csi.it/", "FarabServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/2048/AppData/Local/Temp/tempdir8129259641669955741.tmp/FarabService_1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(FarabServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/2048/AppData/Local/Temp/tempdir8129259641669955741.tmp/FarabService_1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public FarabServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public FarabServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FarabServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public FarabServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public FarabServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public FarabServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns FarabService
     */
    @WebEndpoint(name = "FarabServiceImplPort")
    public FarabService getFarabServiceImplPort() {
        return super.getPort(FarabServiceImplPort, FarabService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FarabService
     */
    @WebEndpoint(name = "FarabServiceImplPort")
    public FarabService getFarabServiceImplPort(WebServiceFeature... features) {
        return super.getPort(FarabServiceImplPort, FarabService.class, features);
    }

}