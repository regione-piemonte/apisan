/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.ScaricoStudiWSBean;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.dma package. 
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

    private final static QName _ScaricoStudiRequest_QNAME = new QName("http://dmass.csi.it/", "ScaricoStudiRequest");
    private final static QName _SetPacchettoCancellatoResponse_QNAME = new QName("http://dmass.csi.it/", "SetPacchettoCancellatoResponse");
    private final static QName _ScaricoStudiResponse_QNAME = new QName("http://dmass.csi.it/", "ScaricoStudiResponse");
    private final static QName _VerificaStatoRichiestaRequest_QNAME = new QName("http://dmass.csi.it/", "VerificaStatoRichiestaRequest");
    private final static QName _VerificaStatoRichiestaResponse_QNAME = new QName("http://dmass.csi.it/", "VerificaStatoRichiestaResponse");
    private final static QName _SetPacchettoCancellatoRequest_QNAME = new QName("http://dmass.csi.it/", "SetPacchettoCancellatoRequest");
    private final static QName _GetElencoPacchettiScadutiRequest_QNAME = new QName("http://dmass.csi.it/", "GetElencoPacchettiScadutiRequest");
    private final static QName _AggiornaStatoRichiestaRequest_QNAME = new QName("http://dmass.csi.it/", "AggiornaStatoRichiestaRequest");
    private final static QName _AggiornaStatoRichiestaResponse_QNAME = new QName("http://dmass.csi.it/", "AggiornaStatoRichiestaResponse");
    private final static QName _VerificaStatoListaRichiesteRequest_QNAME = new QName("http://dmass.csi.it/", "VerificaStatoListaRichiesteRequest");
    private final static QName _CancellaPacchettoResponse_QNAME = new QName("http://dmass.csi.it/", "CancellaPacchettoResponse");
    private final static QName _CancellaPacchettoRequest_QNAME = new QName("http://dmass.csi.it/", "CancellaPacchettoRequest");
    private final static QName _GetElencoPacchettiScadutiResponse_QNAME = new QName("http://dmass.csi.it/", "GetElencoPacchettiScadutiResponse");
    private final static QName _VerificaStatoRichiesta2Request_QNAME = new QName("http://dmass.csi.it/", "VerificaStatoRichiesta2Request");
    private final static QName _VerificaStatoListaRichiesteResponse_QNAME = new QName("http://dmass.csi.it/", "VerificaStatoListaRichiesteResponse");
    private final static QName _VerificaStatoRichiesta2Response_QNAME = new QName("http://dmass.csi.it/", "VerificaStatoRichiesta2Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.dma
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link VerificaStatoRichiesta2Request }
     * 
     */
    public VerificaStatoRichiesta2Request createVerificaStatoRichiesta2Request() {
        return new VerificaStatoRichiesta2Request();
    }

    /**
     * Create an instance of {@link VerificaStatoListaRichiesteResponse }
     * 
     */
    public VerificaStatoListaRichiesteResponse createVerificaStatoListaRichiesteResponse() {
        return new VerificaStatoListaRichiesteResponse();
    }

    /**
     * Create an instance of {@link VerificaStatoRichiesta2Response }
     * 
     */
    public VerificaStatoRichiesta2Response createVerificaStatoRichiesta2Response() {
        return new VerificaStatoRichiesta2Response();
    }

    /**
     * Create an instance of {@link GetElencoPacchettiScadutiResponse }
     * 
     */
    public GetElencoPacchettiScadutiResponse createGetElencoPacchettiScadutiResponse() {
        return new GetElencoPacchettiScadutiResponse();
    }

    /**
     * Create an instance of {@link AggiornaStatoRichiestaResponse }
     * 
     */
    public AggiornaStatoRichiestaResponse createAggiornaStatoRichiestaResponse() {
        return new AggiornaStatoRichiestaResponse();
    }

    /**
     * Create an instance of {@link VerificaStatoListaRichiesteRequest }
     * 
     */
    public VerificaStatoListaRichiesteRequest createVerificaStatoListaRichiesteRequest() {
        return new VerificaStatoListaRichiesteRequest();
    }

    /**
     * Create an instance of {@link CancellaPacchettoResponse }
     * 
     */
    public CancellaPacchettoResponse createCancellaPacchettoResponse() {
        return new CancellaPacchettoResponse();
    }

    /**
     * Create an instance of {@link CancellaPacchettoRequest }
     * 
     */
    public CancellaPacchettoRequest createCancellaPacchettoRequest() {
        return new CancellaPacchettoRequest();
    }

    /**
     * Create an instance of {@link AggiornaStatoRichiestaRequest }
     * 
     */
    public AggiornaStatoRichiestaRequest createAggiornaStatoRichiestaRequest() {
        return new AggiornaStatoRichiestaRequest();
    }

    /**
     * Create an instance of {@link SetPacchettoCancellatoRequest }
     * 
     */
    public SetPacchettoCancellatoRequest createSetPacchettoCancellatoRequest() {
        return new SetPacchettoCancellatoRequest();
    }

    /**
     * Create an instance of {@link GetElencoPacchettiScadutiRequest }
     * 
     */
    public GetElencoPacchettiScadutiRequest createGetElencoPacchettiScadutiRequest() {
        return new GetElencoPacchettiScadutiRequest();
    }

    /**
     * Create an instance of {@link ScaricoStudiResponse }
     * 
     */
    public ScaricoStudiResponse createScaricoStudiResponse() {
        return new ScaricoStudiResponse();
    }

    /**
     * Create an instance of {@link VerificaStatoRichiestaRequest }
     * 
     */
    public VerificaStatoRichiestaRequest createVerificaStatoRichiestaRequest() {
        return new VerificaStatoRichiestaRequest();
    }

    /**
     * Create an instance of {@link VerificaStatoRichiestaResponse }
     * 
     */
    public VerificaStatoRichiestaResponse createVerificaStatoRichiestaResponse() {
        return new VerificaStatoRichiestaResponse();
    }

    /**
     * Create an instance of {@link SetPacchettoCancellatoResponse }
     * 
     */
    public SetPacchettoCancellatoResponse createSetPacchettoCancellatoResponse() {
        return new SetPacchettoCancellatoResponse();
    }

    /**
     * Create an instance of {@link ScaricoStudiRequest }
     * 
     */
    public ScaricoStudiRequest createScaricoStudiRequest() {
        return new ScaricoStudiRequest();
    }

    /**
     * Create an instance of {@link ElencoPacchetti }
     * 
     */
    public ElencoPacchetti createElencoPacchetti() {
        return new ElencoPacchetti();
    }

    /**
     * Create an instance of {@link Errore }
     * 
     */
    public Errore createErrore() {
        return new Errore();
    }

    /**
     * Create an instance of {@link Codifica }
     * 
     */
    public Codifica createCodifica() {
        return new Codifica();
    }

    /**
     * Create an instance of {@link StatoRichiestaScarico }
     * 
     */
    public StatoRichiestaScarico createStatoRichiestaScarico() {
        return new StatoRichiestaScarico();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScaricoStudiRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmass.csi.it/", name = "ScaricoStudiRequest")
    public JAXBElement<ScaricoStudiRequest> createScaricoStudiRequest(ScaricoStudiRequest value) {
        return new JAXBElement<ScaricoStudiRequest>(_ScaricoStudiRequest_QNAME, ScaricoStudiRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPacchettoCancellatoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmass.csi.it/", name = "SetPacchettoCancellatoResponse")
    public JAXBElement<SetPacchettoCancellatoResponse> createSetPacchettoCancellatoResponse(SetPacchettoCancellatoResponse value) {
        return new JAXBElement<SetPacchettoCancellatoResponse>(_SetPacchettoCancellatoResponse_QNAME, SetPacchettoCancellatoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScaricoStudiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmass.csi.it/", name = "ScaricoStudiResponse")
    public JAXBElement<ScaricoStudiResponse> createScaricoStudiResponse(ScaricoStudiResponse value) {
        return new JAXBElement<ScaricoStudiResponse>(_ScaricoStudiResponse_QNAME, ScaricoStudiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaStatoRichiestaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmass.csi.it/", name = "VerificaStatoRichiestaRequest")
    public JAXBElement<VerificaStatoRichiestaRequest> createVerificaStatoRichiestaRequest(VerificaStatoRichiestaRequest value) {
        return new JAXBElement<VerificaStatoRichiestaRequest>(_VerificaStatoRichiestaRequest_QNAME, VerificaStatoRichiestaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaStatoRichiestaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmass.csi.it/", name = "VerificaStatoRichiestaResponse")
    public JAXBElement<VerificaStatoRichiestaResponse> createVerificaStatoRichiestaResponse(VerificaStatoRichiestaResponse value) {
        return new JAXBElement<VerificaStatoRichiestaResponse>(_VerificaStatoRichiestaResponse_QNAME, VerificaStatoRichiestaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPacchettoCancellatoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmass.csi.it/", name = "SetPacchettoCancellatoRequest")
    public JAXBElement<SetPacchettoCancellatoRequest> createSetPacchettoCancellatoRequest(SetPacchettoCancellatoRequest value) {
        return new JAXBElement<SetPacchettoCancellatoRequest>(_SetPacchettoCancellatoRequest_QNAME, SetPacchettoCancellatoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetElencoPacchettiScadutiRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmass.csi.it/", name = "GetElencoPacchettiScadutiRequest")
    public JAXBElement<GetElencoPacchettiScadutiRequest> createGetElencoPacchettiScadutiRequest(GetElencoPacchettiScadutiRequest value) {
        return new JAXBElement<GetElencoPacchettiScadutiRequest>(_GetElencoPacchettiScadutiRequest_QNAME, GetElencoPacchettiScadutiRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggiornaStatoRichiestaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmass.csi.it/", name = "AggiornaStatoRichiestaRequest")
    public JAXBElement<AggiornaStatoRichiestaRequest> createAggiornaStatoRichiestaRequest(AggiornaStatoRichiestaRequest value) {
        return new JAXBElement<AggiornaStatoRichiestaRequest>(_AggiornaStatoRichiestaRequest_QNAME, AggiornaStatoRichiestaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggiornaStatoRichiestaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmass.csi.it/", name = "AggiornaStatoRichiestaResponse")
    public JAXBElement<AggiornaStatoRichiestaResponse> createAggiornaStatoRichiestaResponse(AggiornaStatoRichiestaResponse value) {
        return new JAXBElement<AggiornaStatoRichiestaResponse>(_AggiornaStatoRichiestaResponse_QNAME, AggiornaStatoRichiestaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaStatoListaRichiesteRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmass.csi.it/", name = "VerificaStatoListaRichiesteRequest")
    public JAXBElement<VerificaStatoListaRichiesteRequest> createVerificaStatoListaRichiesteRequest(VerificaStatoListaRichiesteRequest value) {
        return new JAXBElement<VerificaStatoListaRichiesteRequest>(_VerificaStatoListaRichiesteRequest_QNAME, VerificaStatoListaRichiesteRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancellaPacchettoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmass.csi.it/", name = "CancellaPacchettoResponse")
    public JAXBElement<CancellaPacchettoResponse> createCancellaPacchettoResponse(CancellaPacchettoResponse value) {
        return new JAXBElement<CancellaPacchettoResponse>(_CancellaPacchettoResponse_QNAME, CancellaPacchettoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancellaPacchettoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmass.csi.it/", name = "CancellaPacchettoRequest")
    public JAXBElement<CancellaPacchettoRequest> createCancellaPacchettoRequest(CancellaPacchettoRequest value) {
        return new JAXBElement<CancellaPacchettoRequest>(_CancellaPacchettoRequest_QNAME, CancellaPacchettoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetElencoPacchettiScadutiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmass.csi.it/", name = "GetElencoPacchettiScadutiResponse")
    public JAXBElement<GetElencoPacchettiScadutiResponse> createGetElencoPacchettiScadutiResponse(GetElencoPacchettiScadutiResponse value) {
        return new JAXBElement<GetElencoPacchettiScadutiResponse>(_GetElencoPacchettiScadutiResponse_QNAME, GetElencoPacchettiScadutiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaStatoRichiesta2Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmass.csi.it/", name = "VerificaStatoRichiesta2Request")
    public JAXBElement<VerificaStatoRichiesta2Request> createVerificaStatoRichiesta2Request(VerificaStatoRichiesta2Request value) {
        return new JAXBElement<VerificaStatoRichiesta2Request>(_VerificaStatoRichiesta2Request_QNAME, VerificaStatoRichiesta2Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaStatoListaRichiesteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmass.csi.it/", name = "VerificaStatoListaRichiesteResponse")
    public JAXBElement<VerificaStatoListaRichiesteResponse> createVerificaStatoListaRichiesteResponse(VerificaStatoListaRichiesteResponse value) {
        return new JAXBElement<VerificaStatoListaRichiesteResponse>(_VerificaStatoListaRichiesteResponse_QNAME, VerificaStatoListaRichiesteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaStatoRichiesta2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmass.csi.it/", name = "VerificaStatoRichiesta2Response")
    public JAXBElement<VerificaStatoRichiesta2Response> createVerificaStatoRichiesta2Response(VerificaStatoRichiesta2Response value) {
        return new JAXBElement<VerificaStatoRichiesta2Response>(_VerificaStatoRichiesta2Response_QNAME, VerificaStatoRichiesta2Response.class, null, value);
    }

}
