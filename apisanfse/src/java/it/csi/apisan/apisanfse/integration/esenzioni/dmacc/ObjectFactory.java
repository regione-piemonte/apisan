/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.esenzioni.dmacc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.dmacc package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetEsenzioni_QNAME = new QName("http://dmacc.csi.it/", "getEsenzioni");
    private final static QName _GetEsenzioniResponse_QNAME = new QName("http://dmacc.csi.it/", "getEsenzioniResponse");
    private final static QName _Esenzioni_QNAME = new QName("http://dmacc.csi.it/", "esenzioni");
    private final static QName _EsenzioniResponse_QNAME = new QName("http://dmacc.csi.it/", "esenzioniResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.dmacc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EsenzioniResponse }
     * 
     */
    public EsenzioniResponse createEsenzioniResponse() {
        return new EsenzioniResponse();
    }

    /**
     * Create an instance of {@link EsenzioniRequest }
     * 
     */
    public EsenzioniRequest createEsenzioniRequest() {
        return new EsenzioniRequest();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EsenzioniRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getEsenzioni")
    public JAXBElement<EsenzioniRequest> createGetEsenzioni(EsenzioniRequest value) {
        return new JAXBElement<EsenzioniRequest>(_GetEsenzioni_QNAME, EsenzioniRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EsenzioniResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getEsenzioniResponse")
    public JAXBElement<EsenzioniResponse> createGetEsenzioniResponse(EsenzioniResponse value) {
        return new JAXBElement<EsenzioniResponse>(_GetEsenzioniResponse_QNAME, EsenzioniResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EsenzioniRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "esenzioni")
    public JAXBElement<EsenzioniRequest> createEsenzioni(EsenzioniRequest value) {
        return new JAXBElement<EsenzioniRequest>(_Esenzioni_QNAME, EsenzioniRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EsenzioniResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "esenzioniResponse")
    public JAXBElement<EsenzioniResponse> createEsenzioniResponse(EsenzioniResponse value) {
        return new JAXBElement<EsenzioniResponse>(_EsenzioniResponse_QNAME, EsenzioniResponse.class, null, value);
    }

}
