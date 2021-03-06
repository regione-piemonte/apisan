/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.screening.wsdl.screenserviziwebsol.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import it.csi.screenserviziwebsol.ScreenServiziWebSOL;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.14
 * 2021-03-24T11:59:49.124+01:00
 * Generated source version: 2.7.14
 * 
 */
@WebServiceClient(name = "ScreenServiziWebSOLImplService", 
                  wsdlLocation = "file:/C:/Users/2048/AppData/Local/Temp/tempdir2622693717716673886.tmp/ScreenServiziWebSOLImplService_1.wsdl",
                  targetNamespace = "http://impl.screenserviziwebsol.wsdl.screening.csi.it/") 
public class ScreenServiziWebSOLImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.screenserviziwebsol.wsdl.screening.csi.it/", "ScreenServiziWebSOLImplService");
    public final static QName ScreenServiziWebSOLImplPort = new QName("http://impl.screenserviziwebsol.wsdl.screening.csi.it/", "ScreenServiziWebSOLImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/2048/AppData/Local/Temp/tempdir2622693717716673886.tmp/ScreenServiziWebSOLImplService_1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ScreenServiziWebSOLImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/2048/AppData/Local/Temp/tempdir2622693717716673886.tmp/ScreenServiziWebSOLImplService_1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ScreenServiziWebSOLImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ScreenServiziWebSOLImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ScreenServiziWebSOLImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ScreenServiziWebSOLImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ScreenServiziWebSOLImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ScreenServiziWebSOLImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ScreenServiziWebSOL
     */
    @WebEndpoint(name = "ScreenServiziWebSOLImplPort")
    public ScreenServiziWebSOL getScreenServiziWebSOLImplPort() {
        return super.getPort(ScreenServiziWebSOLImplPort, ScreenServiziWebSOL.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ScreenServiziWebSOL
     */
    @WebEndpoint(name = "ScreenServiziWebSOLImplPort")
    public ScreenServiziWebSOL getScreenServiziWebSOLImplPort(WebServiceFeature... features) {
        return super.getPort(ScreenServiziWebSOLImplPort, ScreenServiziWebSOL.class, features);
    }

}
