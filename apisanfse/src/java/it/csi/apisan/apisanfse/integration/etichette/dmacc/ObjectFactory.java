/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.etichette.dmacc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import it.csi.apisan.apisanfse.integration.etichette.dma.Documento;
import it.csi.apisan.apisanfse.integration.etichette.dma.Etichetta;
import it.csi.apisan.apisanfse.integration.etichette.dma.ListaEtichette;
import it.csi.apisan.apisanfse.integration.etichette.dma.ListaIdEtichette;
import it.csi.apisan.apisanfse.integration.etichette.dma.RichiedenteInfo;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.apisan.apisanfse.integration.etichette.dmacc package. 
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

    private final static QName _GetListaEtichetteResponse_QNAME = new QName("http://dmacc.csi.it/", "GetListaEtichetteResponse");
    private final static QName _AssociaDisassociaEtichette_QNAME = new QName("http://dmacc.csi.it/", "associaDisassociaEtichette");
    private final static QName _RichiedenteInfo_QNAME = new QName("http://dmacc.csi.it/", "richiedenteInfo");
    private final static QName _GetListaEtichette_QNAME = new QName("http://dmacc.csi.it/", "getListaEtichette");
    private final static QName _UpdateEtichetta_QNAME = new QName("http://dmacc.csi.it/", "updateEtichetta");
    private final static QName _UpdateEtichettaPersonale_QNAME = new QName("http://dmacc.csi.it/", "updateEtichettaPersonale");
    private final static QName _UpdateEtichettaPersonaleResponse_QNAME = new QName("http://dmacc.csi.it/", "updateEtichettaPersonaleResponse");
    private final static QName _Etichetta_QNAME = new QName("http://dmacc.csi.it/", "etichetta");
    private final static QName _Documento_QNAME = new QName("http://dmacc.csi.it/", "documento");
    private final static QName _SetEtichetta_QNAME = new QName("http://dmacc.csi.it/", "setEtichetta");
    private final static QName _AssociaDisassociaEtichetteResponse_QNAME = new QName("http://dmacc.csi.it/", "associaDisassociaEtichetteResponse");
    private final static QName _ListaEtichette_QNAME = new QName("http://dmacc.csi.it/", "listaEtichette");
    private final static QName _EtichetteResponse_QNAME = new QName("http://dmacc.csi.it/", "EtichetteResponse");
    private final static QName _SetEtichettaPersonaleResponse_QNAME = new QName("http://dmacc.csi.it/", "setEtichettaPersonaleResponse");
    private final static QName _ListaIdEtichette_QNAME = new QName("http://dmacc.csi.it/", "listaIdEtichette");
    private final static QName _SetEtichettaPersonale_QNAME = new QName("http://dmacc.csi.it/", "setEtichettaPersonale");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.apisan.apisanfse.integration.etichette.dmacc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EtichetteResponse }
     * 
     */
    public EtichetteResponse createEtichetteResponse() {
        return new EtichetteResponse();
    }

    /**
     * Create an instance of {@link SetEtichettaRequest }
     * 
     */
    public SetEtichettaRequest createSetEtichettaRequest() {
        return new SetEtichettaRequest();
    }

    /**
     * Create an instance of {@link GetListaEtichetteRequest }
     * 
     */
    public GetListaEtichetteRequest createGetListaEtichetteRequest() {
        return new GetListaEtichetteRequest();
    }

    /**
     * Create an instance of {@link UpdateEtichettaRequest }
     * 
     */
    public UpdateEtichettaRequest createUpdateEtichettaRequest() {
        return new UpdateEtichettaRequest();
    }

    /**
     * Create an instance of {@link GetListaEtichetteResponse }
     * 
     */
    public GetListaEtichetteResponse createGetListaEtichetteResponse() {
        return new GetListaEtichetteResponse();
    }

    /**
     * Create an instance of {@link AssociaDisassociaEtichetteRequest }
     * 
     */
    public AssociaDisassociaEtichetteRequest createAssociaDisassociaEtichetteRequest() {
        return new AssociaDisassociaEtichetteRequest();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListaEtichetteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "GetListaEtichetteResponse")
    public JAXBElement<GetListaEtichetteResponse> createGetListaEtichetteResponse(GetListaEtichetteResponse value) {
        return new JAXBElement<GetListaEtichetteResponse>(_GetListaEtichetteResponse_QNAME, GetListaEtichetteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociaDisassociaEtichetteRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "associaDisassociaEtichette")
    public JAXBElement<AssociaDisassociaEtichetteRequest> createAssociaDisassociaEtichette(AssociaDisassociaEtichetteRequest value) {
        return new JAXBElement<AssociaDisassociaEtichetteRequest>(_AssociaDisassociaEtichette_QNAME, AssociaDisassociaEtichetteRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListaEtichetteRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getListaEtichette")
    public JAXBElement<GetListaEtichetteRequest> createGetListaEtichette(GetListaEtichetteRequest value) {
        return new JAXBElement<GetListaEtichetteRequest>(_GetListaEtichette_QNAME, GetListaEtichetteRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEtichettaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "updateEtichetta")
    public JAXBElement<UpdateEtichettaRequest> createUpdateEtichetta(UpdateEtichettaRequest value) {
        return new JAXBElement<UpdateEtichettaRequest>(_UpdateEtichetta_QNAME, UpdateEtichettaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEtichettaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "updateEtichettaPersonale")
    public JAXBElement<UpdateEtichettaRequest> createUpdateEtichettaPersonale(UpdateEtichettaRequest value) {
        return new JAXBElement<UpdateEtichettaRequest>(_UpdateEtichettaPersonale_QNAME, UpdateEtichettaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EtichetteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "updateEtichettaPersonaleResponse")
    public JAXBElement<EtichetteResponse> createUpdateEtichettaPersonaleResponse(EtichetteResponse value) {
        return new JAXBElement<EtichetteResponse>(_UpdateEtichettaPersonaleResponse_QNAME, EtichetteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Etichetta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "etichetta")
    public JAXBElement<Etichetta> createEtichetta(Etichetta value) {
        return new JAXBElement<Etichetta>(_Etichetta_QNAME, Etichetta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Documento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "documento")
    public JAXBElement<Documento> createDocumento(Documento value) {
        return new JAXBElement<Documento>(_Documento_QNAME, Documento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetEtichettaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "setEtichetta")
    public JAXBElement<SetEtichettaRequest> createSetEtichetta(SetEtichettaRequest value) {
        return new JAXBElement<SetEtichettaRequest>(_SetEtichetta_QNAME, SetEtichettaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EtichetteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "associaDisassociaEtichetteResponse")
    public JAXBElement<EtichetteResponse> createAssociaDisassociaEtichetteResponse(EtichetteResponse value) {
        return new JAXBElement<EtichetteResponse>(_AssociaDisassociaEtichetteResponse_QNAME, EtichetteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaEtichette }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "listaEtichette")
    public JAXBElement<ListaEtichette> createListaEtichette(ListaEtichette value) {
        return new JAXBElement<ListaEtichette>(_ListaEtichette_QNAME, ListaEtichette.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EtichetteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "EtichetteResponse")
    public JAXBElement<EtichetteResponse> createEtichetteResponse(EtichetteResponse value) {
        return new JAXBElement<EtichetteResponse>(_EtichetteResponse_QNAME, EtichetteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EtichetteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "setEtichettaPersonaleResponse")
    public JAXBElement<EtichetteResponse> createSetEtichettaPersonaleResponse(EtichetteResponse value) {
        return new JAXBElement<EtichetteResponse>(_SetEtichettaPersonaleResponse_QNAME, EtichetteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaIdEtichette }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "listaIdEtichette")
    public JAXBElement<ListaIdEtichette> createListaIdEtichette(ListaIdEtichette value) {
        return new JAXBElement<ListaIdEtichette>(_ListaIdEtichette_QNAME, ListaIdEtichette.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetEtichettaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "setEtichettaPersonale")
    public JAXBElement<SetEtichettaRequest> createSetEtichettaPersonale(SetEtichettaRequest value) {
        return new JAXBElement<SetEtichettaRequest>(_SetEtichettaPersonale_QNAME, SetEtichettaRequest.class, null, value);
    }

}
