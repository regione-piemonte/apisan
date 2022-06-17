/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.soap.pro.logaudit;

import it.csi.apisan.apisanpresc.common.ApiSanPrescConstants;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 2.7.14
 * 2019-09-24T16:00:08.663+02:00
 * Generated source version: 2.7.14
 * 
 */
@WebServiceClient(name = "LogAuditService", 
                  wsdlLocation = ApiSanPrescConstants.PROREL_LOGAUDITSERVICE_WSDL,
                  targetNamespace = "http://dmapro.csi.it/") 
public class LogAuditService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://dmapro.csi.it/", "LogAuditService");
    public final static QName LogAuditServicePort = new QName("http://dmapro.csi.it/", "LogAuditServicePort");
    static {
        URL url = null;
        try {
            url = new URL(ApiSanPrescConstants.PROREL_LOGAUDITSERVICE_ENDPOINT);
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(LogAuditService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Workspace new/APISAN/apisanpresc/src/java/it/csi/apisan/apisanpresc/soap/pro/logaudit/LogAuditService6.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public LogAuditService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public LogAuditService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LogAuditService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public LogAuditService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public LogAuditService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public LogAuditService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns LogAuditService
     */
    @WebEndpoint(name = "LogAuditServicePort")
    public LogAuditService getLogAuditServicePort() {
        return super.getPort(LogAuditServicePort, LogAuditService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LogAuditService
     */
    @WebEndpoint(name = "LogAuditServicePort")
    public LogAuditService getLogAuditServicePort(WebServiceFeature... features) {
        return super.getPort(LogAuditServicePort, LogAuditService.class, features);
    }

}