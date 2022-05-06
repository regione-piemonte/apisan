/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.dmacc;

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

    private final static QName _RequestAR_QNAME = new QName("http://dmacc.csi.it/", "requestAR");
    private final static QName _AnnullaRefertoSRResponse_QNAME = new QName("http://dmacc.csi.it/", "AnnullaRefertoSRResponse");
    private final static QName _RequestLR_QNAME = new QName("http://dmacc.csi.it/", "requestLR");
    private final static QName _GetRefertoSRResponse_QNAME = new QName("http://dmacc.csi.it/", "GetRefertoSRResponse");
    private final static QName _GetListaRefertiSRResponse_QNAME = new QName("http://dmacc.csi.it/", "GetListaRefertiSRResponse");
    private final static QName _RequestGR_QNAME = new QName("http://dmacc.csi.it/", "requestGR");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.dmacc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRefertoSRResponse }
     * 
     */
    public GetRefertoSRResponse createGetRefertoSRResponse() {
        return new GetRefertoSRResponse();
    }

    /**
     * Create an instance of {@link GetListaRefertiSRResponse }
     * 
     */
    public GetListaRefertiSRResponse createGetListaRefertiSRResponse() {
        return new GetListaRefertiSRResponse();
    }

    /**
     * Create an instance of {@link GetRefertoSR }
     * 
     */
    public GetRefertoSR createGetRefertoSR() {
        return new GetRefertoSR();
    }

    /**
     * Create an instance of {@link GetListaRefertiSR }
     * 
     */
    public GetListaRefertiSR createGetListaRefertiSR() {
        return new GetListaRefertiSR();
    }

    /**
     * Create an instance of {@link AnnullaRefertoSR }
     * 
     */
    public AnnullaRefertoSR createAnnullaRefertoSR() {
        return new AnnullaRefertoSR();
    }

    /**
     * Create an instance of {@link AnnullaRefertoSRResponse }
     * 
     */
    public AnnullaRefertoSRResponse createAnnullaRefertoSRResponse() {
        return new AnnullaRefertoSRResponse();
    }

    /**
     * Create an instance of {@link EnsMessagebody }
     * 
     */
    public EnsMessagebody createEnsMessagebody() {
        return new EnsMessagebody();
    }

    /**
     * Create an instance of {@link EnsResponse }
     * 
     */
    public EnsResponse createEnsResponse() {
        return new EnsResponse();
    }

    /**
     * Create an instance of {@link EnsRequest }
     * 
     */
    public EnsRequest createEnsRequest() {
        return new EnsRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnullaRefertoSR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "requestAR")
    public JAXBElement<AnnullaRefertoSR> createRequestAR(AnnullaRefertoSR value) {
        return new JAXBElement<AnnullaRefertoSR>(_RequestAR_QNAME, AnnullaRefertoSR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnullaRefertoSRResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "AnnullaRefertoSRResponse")
    public JAXBElement<AnnullaRefertoSRResponse> createAnnullaRefertoSRResponse(AnnullaRefertoSRResponse value) {
        return new JAXBElement<AnnullaRefertoSRResponse>(_AnnullaRefertoSRResponse_QNAME, AnnullaRefertoSRResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListaRefertiSR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "requestLR")
    public JAXBElement<GetListaRefertiSR> createRequestLR(GetListaRefertiSR value) {
        return new JAXBElement<GetListaRefertiSR>(_RequestLR_QNAME, GetListaRefertiSR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRefertoSRResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "GetRefertoSRResponse")
    public JAXBElement<GetRefertoSRResponse> createGetRefertoSRResponse(GetRefertoSRResponse value) {
        return new JAXBElement<GetRefertoSRResponse>(_GetRefertoSRResponse_QNAME, GetRefertoSRResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListaRefertiSRResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "GetListaRefertiSRResponse")
    public JAXBElement<GetListaRefertiSRResponse> createGetListaRefertiSRResponse(GetListaRefertiSRResponse value) {
        return new JAXBElement<GetListaRefertiSRResponse>(_GetListaRefertiSRResponse_QNAME, GetListaRefertiSRResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRefertoSR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "requestGR")
    public JAXBElement<GetRefertoSR> createRequestGR(GetRefertoSR value) {
        return new JAXBElement<GetRefertoSR>(_RequestGR_QNAME, GetRefertoSR.class, null, value);
    }

}
