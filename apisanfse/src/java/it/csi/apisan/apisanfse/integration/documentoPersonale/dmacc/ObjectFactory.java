/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documentoPersonale.dmacc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import it.csi.apisan.apisanfse.integration.documentoPersonale.dma.RichiedenteInfo;


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

    private final static QName _RichiedenteInfo_QNAME = new QName("http://dmacc.csi.it/", "richiedenteInfo");
    private final static QName _GetDocumentoPersonale_QNAME = new QName("http://dmacc.csi.it/", "getDocumentoPersonale");
    private final static QName _GetDocumentoPersonaleResponse_QNAME = new QName("http://dmacc.csi.it/", "getDocumentoPersonaleResponse");
    private final static QName _DeleteDocumentoPersonale_QNAME = new QName("http://dmacc.csi.it/", "deleteDocumentoPersonale");
    private final static QName _DeleteDocumentoPersonaleResponse_QNAME = new QName("http://dmacc.csi.it/", "deleteDocumentoPersonaleResponse");
    private final static QName _SetDocumentoPersonaleResponse_QNAME = new QName("http://dmacc.csi.it/", "setDocumentoPersonaleResponse");
    private final static QName _SetDocumentoPersonale_QNAME = new QName("http://dmacc.csi.it/", "setDocumentoPersonale");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.dmacc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteDocumentoPersonaleResponse }
     * 
     */
    public DeleteDocumentoPersonaleResponse createDeleteDocumentoPersonaleResponse() {
        return new DeleteDocumentoPersonaleResponse();
    }

    /**
     * Create an instance of {@link SetDocumentoPersonale }
     * 
     */
    public SetDocumentoPersonale createSetDocumentoPersonale() {
        return new SetDocumentoPersonale();
    }

    /**
     * Create an instance of {@link SetDocumentoPersonaleResponse }
     * 
     */
    public SetDocumentoPersonaleResponse createSetDocumentoPersonaleResponse() {
        return new SetDocumentoPersonaleResponse();
    }

    /**
     * Create an instance of {@link GetDocumentoPersonale }
     * 
     */
    public GetDocumentoPersonale createGetDocumentoPersonale() {
        return new GetDocumentoPersonale();
    }

    /**
     * Create an instance of {@link GetDocumentoPersonaleResponse }
     * 
     */
    public GetDocumentoPersonaleResponse createGetDocumentoPersonaleResponse() {
        return new GetDocumentoPersonaleResponse();
    }

    /**
     * Create an instance of {@link DeleteDocumentoPersonale }
     * 
     */
    public DeleteDocumentoPersonale createDeleteDocumentoPersonale() {
        return new DeleteDocumentoPersonale();
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
     * Create an instance of {@link TipoDocumento }
     * 
     */
    public TipoDocumento createTipoDocumento() {
        return new TipoDocumento();
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
     * Create an instance of {@link TipoContributo }
     * 
     */
    public TipoContributo createTipoContributo() {
        return new TipoContributo();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentoPersonale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getDocumentoPersonale")
    public JAXBElement<GetDocumentoPersonale> createGetDocumentoPersonale(GetDocumentoPersonale value) {
        return new JAXBElement<GetDocumentoPersonale>(_GetDocumentoPersonale_QNAME, GetDocumentoPersonale.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentoPersonaleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getDocumentoPersonaleResponse")
    public JAXBElement<GetDocumentoPersonaleResponse> createGetDocumentoPersonaleResponse(GetDocumentoPersonaleResponse value) {
        return new JAXBElement<GetDocumentoPersonaleResponse>(_GetDocumentoPersonaleResponse_QNAME, GetDocumentoPersonaleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDocumentoPersonale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "deleteDocumentoPersonale")
    public JAXBElement<DeleteDocumentoPersonale> createDeleteDocumentoPersonale(DeleteDocumentoPersonale value) {
        return new JAXBElement<DeleteDocumentoPersonale>(_DeleteDocumentoPersonale_QNAME, DeleteDocumentoPersonale.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDocumentoPersonaleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "deleteDocumentoPersonaleResponse")
    public JAXBElement<DeleteDocumentoPersonaleResponse> createDeleteDocumentoPersonaleResponse(DeleteDocumentoPersonaleResponse value) {
        return new JAXBElement<DeleteDocumentoPersonaleResponse>(_DeleteDocumentoPersonaleResponse_QNAME, DeleteDocumentoPersonaleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDocumentoPersonaleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "setDocumentoPersonaleResponse")
    public JAXBElement<SetDocumentoPersonaleResponse> createSetDocumentoPersonaleResponse(SetDocumentoPersonaleResponse value) {
        return new JAXBElement<SetDocumentoPersonaleResponse>(_SetDocumentoPersonaleResponse_QNAME, SetDocumentoPersonaleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDocumentoPersonale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "setDocumentoPersonale")
    public JAXBElement<SetDocumentoPersonale> createSetDocumentoPersonale(SetDocumentoPersonale value) {
        return new JAXBElement<SetDocumentoPersonale>(_SetDocumentoPersonale_QNAME, SetDocumentoPersonale.class, null, value);
    }

}
