/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.aura.auraws.services.central.ricercateam;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RicercaTEAM", targetNamespace = "http://RicercaTEAM.central.services.auraws.aura.csi.it", wsdlLocation = "http://10.102.40.77:57772/sanitxens_t1/AURA.WS.RicercaTEAM.cls?wsdl")
public class RicercaTEAM_Service
    extends Service
{

    private final static URL RICERCATEAM_WSDL_LOCATION;
    private final static WebServiceException RICERCATEAM_EXCEPTION;
    private final static QName RICERCATEAM_QNAME = new QName("http://RicercaTEAM.central.services.auraws.aura.csi.it", "RicercaTEAM");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.102.40.77:57772/sanitxens_t1/AURA.WS.RicercaTEAM.cls?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RICERCATEAM_WSDL_LOCATION = url;
        RICERCATEAM_EXCEPTION = e;
    }

    public RicercaTEAM_Service() {
        super(__getWsdlLocation(), RICERCATEAM_QNAME);
    }

    public RicercaTEAM_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), RICERCATEAM_QNAME, features);
    }

    public RicercaTEAM_Service(URL wsdlLocation) {
        super(wsdlLocation, RICERCATEAM_QNAME);
    }

    public RicercaTEAM_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RICERCATEAM_QNAME, features);
    }

    public RicercaTEAM_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RicercaTEAM_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RicercaTEAMSoap
     */
    @WebEndpoint(name = "RicercaTEAMSoap")
    public RicercaTEAMSoap getRicercaTEAMSoap() {
        return super.getPort(new QName("http://RicercaTEAM.central.services.auraws.aura.csi.it", "RicercaTEAMSoap"), RicercaTEAMSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RicercaTEAMSoap
     */
    @WebEndpoint(name = "RicercaTEAMSoap")
    public RicercaTEAMSoap getRicercaTEAMSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://RicercaTEAM.central.services.auraws.aura.csi.it", "RicercaTEAMSoap"), RicercaTEAMSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RICERCATEAM_EXCEPTION!= null) {
            throw RICERCATEAM_EXCEPTION;
        }
        return RICERCATEAM_WSDL_LOCATION;
    }

}
