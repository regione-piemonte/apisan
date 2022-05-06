/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.utility.dmacc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import it.csi.apisan.apisanfse.integration.utility.dma.RichiedenteInfo;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.apisan.apisanfse.integration.utility.dmacc package. 
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

    private final static QName _GetMessaggiDiServizioRequest_QNAME = new QName("http://dmacc.csi.it/", "GetMessaggiDiServizioRequest");
    private final static QName _RichiedenteInfo_QNAME = new QName("http://dmacc.csi.it/", "richiedenteInfo");
    private final static QName _GetMessaggiDiServizio_QNAME = new QName("http://dmacc.csi.it/", "getMessaggiDiServizio");
    private final static QName _GetMessaggiDiServizioResponse_QNAME = new QName("http://dmacc.csi.it/", "GetMessaggiDiServizioResponse");
    private final static QName _SetAuditRequest_QNAME = new QName("http://dmacc.csi.it/", "SetAuditRequest");
    private final static QName _SetAuditResponse_QNAME = new QName("http://dmacc.csi.it/", "SetAuditResponse");
    private final static QName _SetAudit_QNAME = new QName("http://dmacc.csi.it/", "setAudit");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.apisan.apisanfse.integration.utility.dmacc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetAuditRequest }
     * 
     */
    public SetAuditRequest createSetAuditRequest() {
        return new SetAuditRequest();
    }

    /**
     * Create an instance of {@link SetAuditResponse }
     * 
     */
    public SetAuditResponse createSetAuditResponse() {
        return new SetAuditResponse();
    }

    /**
     * Create an instance of {@link GetMessaggiDiServizioRequest }
     * 
     */
    public GetMessaggiDiServizioRequest createGetMessaggiDiServizioRequest() {
        return new GetMessaggiDiServizioRequest();
    }

    /**
     * Create an instance of {@link GetMessaggiDiServizioResponse }
     * 
     */
    public GetMessaggiDiServizioResponse createGetMessaggiDiServizioResponse() {
        return new GetMessaggiDiServizioResponse();
    }

    /**
     * Create an instance of {@link ApplicativoVerticale }
     * 
     */
    public ApplicativoVerticale createApplicativoVerticale() {
        return new ApplicativoVerticale();
    }

    /**
     * Create an instance of {@link Codifica }
     * 
     */
    public Codifica createCodifica() {
        return new Codifica();
    }

    /**
     * Create an instance of {@link Errore }
     * 
     */
    public Errore createErrore() {
        return new Errore();
    }

    /**
     * Create an instance of {@link ApplicazioneRichiedente }
     * 
     */
    public ApplicazioneRichiedente createApplicazioneRichiedente() {
        return new ApplicazioneRichiedente();
    }

    /**
     * Create an instance of {@link ParametroAudit }
     * 
     */
    public ParametroAudit createParametroAudit() {
        return new ParametroAudit();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessaggiDiServizioRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "GetMessaggiDiServizioRequest")
    public JAXBElement<GetMessaggiDiServizioRequest> createGetMessaggiDiServizioRequest(GetMessaggiDiServizioRequest value) {
        return new JAXBElement<GetMessaggiDiServizioRequest>(_GetMessaggiDiServizioRequest_QNAME, GetMessaggiDiServizioRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RichiedenteInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "richiedenteInfo")
    public JAXBElement<RichiedenteInfo> createRichiedenteInfo(RichiedenteInfo value) {
        return new JAXBElement<RichiedenteInfo>(_RichiedenteInfo_QNAME, RichiedenteInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessaggiDiServizioRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getMessaggiDiServizio")
    public JAXBElement<GetMessaggiDiServizioRequest> createGetMessaggiDiServizio(GetMessaggiDiServizioRequest value) {
        return new JAXBElement<GetMessaggiDiServizioRequest>(_GetMessaggiDiServizio_QNAME, GetMessaggiDiServizioRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessaggiDiServizioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "GetMessaggiDiServizioResponse")
    public JAXBElement<GetMessaggiDiServizioResponse> createGetMessaggiDiServizioResponse(GetMessaggiDiServizioResponse value) {
        return new JAXBElement<GetMessaggiDiServizioResponse>(_GetMessaggiDiServizioResponse_QNAME, GetMessaggiDiServizioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAuditRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "SetAuditRequest")
    public JAXBElement<SetAuditRequest> createSetAuditRequest(SetAuditRequest value) {
        return new JAXBElement<SetAuditRequest>(_SetAuditRequest_QNAME, SetAuditRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAuditResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "SetAuditResponse")
    public JAXBElement<SetAuditResponse> createSetAuditResponse(SetAuditResponse value) {
        return new JAXBElement<SetAuditResponse>(_SetAuditResponse_QNAME, SetAuditResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAuditRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "setAudit")
    public JAXBElement<SetAuditRequest> createSetAudit(SetAuditRequest value) {
        return new JAXBElement<SetAuditRequest>(_SetAudit_QNAME, SetAuditRequest.class, null, value);
    }

}
