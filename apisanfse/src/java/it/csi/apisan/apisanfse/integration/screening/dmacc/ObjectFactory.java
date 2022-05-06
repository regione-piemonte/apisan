/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.screening.dmacc;

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

    private final static QName _GetScreeningResponse_QNAME = new QName("http://dmacc.csi.it/", "getScreeningResponse");
    private final static QName _ScreeningResponse_QNAME = new QName("http://dmacc.csi.it/", "screeningResponse");
    private final static QName _Screening_QNAME = new QName("http://dmacc.csi.it/", "screening");
    private final static QName _GetScreening_QNAME = new QName("http://dmacc.csi.it/", "getScreening");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.dmacc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ScreeningRequest }
     * 
     */
    public ScreeningRequest createScreeningRequest() {
        return new ScreeningRequest();
    }

    /**
     * Create an instance of {@link ScreeningResponse }
     * 
     */
    public ScreeningResponse createScreeningResponse() {
        return new ScreeningResponse();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScreeningResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getScreeningResponse")
    public JAXBElement<ScreeningResponse> createGetScreeningResponse(ScreeningResponse value) {
        return new JAXBElement<ScreeningResponse>(_GetScreeningResponse_QNAME, ScreeningResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScreeningResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "screeningResponse")
    public JAXBElement<ScreeningResponse> createScreeningResponse(ScreeningResponse value) {
        return new JAXBElement<ScreeningResponse>(_ScreeningResponse_QNAME, ScreeningResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScreeningRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "screening")
    public JAXBElement<ScreeningRequest> createScreening(ScreeningRequest value) {
        return new JAXBElement<ScreeningRequest>(_Screening_QNAME, ScreeningRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScreeningRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getScreening")
    public JAXBElement<ScreeningRequest> createGetScreening(ScreeningRequest value) {
        return new JAXBElement<ScreeningRequest>(_GetScreening_QNAME, ScreeningRequest.class, null, value);
    }

}
