/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documenti.dmacc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import it.csi.apisan.apisanfse.integration.documenti.dma.Etichetta;
import it.csi.apisan.apisanfse.integration.documenti.dma.RichiedenteInfo;


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

    private final static QName _IdentificativoDocumento_QNAME = new QName("http://dmacc.csi.it/", "identificativoDocumento");
    private final static QName _GetTuttiDocsResponse_QNAME = new QName("http://dmacc.csi.it/", "getTuttiDocsResponse");
    private final static QName _GetTuttiDocsRequest_QNAME = new QName("http://dmacc.csi.it/", "getTuttiDocsRequest");
    private final static QName _GetDettaglioDocumentoRequest_QNAME = new QName("http://dmacc.csi.it/", "GetDettaglioDocumentoRequest");
    private final static QName _GetDocumento_QNAME = new QName("http://dmacc.csi.it/", "getDocumento");
    private final static QName _VerificaDocumentoScaricabileRequest_QNAME = new QName("http://dmacc.csi.it/", "verificaDocumentoScaricabileRequest");
    private final static QName _GetConteggiRequest_QNAME = new QName("http://dmacc.csi.it/", "GetConteggiRequest");
    private final static QName _GetDocumentiEpisodio_QNAME = new QName("http://dmacc.csi.it/", "getDocumentiEpisodio");
    private final static QName _RegistraAvvenutoRitiroResponse_QNAME = new QName("http://dmacc.csi.it/", "registraAvvenutoRitiroResponse");
    private final static QName _GetMieiReferti_QNAME = new QName("http://dmacc.csi.it/", "getMieiReferti");
    private final static QName _AccessionNumber_QNAME = new QName("http://dmacc.csi.it/", "accessionNumber");
    private final static QName _GetDocumentiCorrelatiRequest_QNAME = new QName("http://dmacc.csi.it/", "getDocumentiCorrelatiRequest");
    private final static QName _FiltroEpisodi_QNAME = new QName("http://dmacc.csi.it/", "filtroEpisodi");
    private final static QName _VerificaDocumentoScaricabile_QNAME = new QName("http://dmacc.csi.it/", "verificaDocumentoScaricabile");
    private final static QName _GetDocumentiCorrelatiOSC_QNAME = new QName("http://dmacc.csi.it/", "getDocumentiCorrelatiOSC");
    private final static QName _GetDocumentiCorrelatiOSCRequest_QNAME = new QName("http://dmacc.csi.it/", "getDocumentiCorrelatiOSCRequest");
    private final static QName _RichiedenteInfo_QNAME = new QName("http://dmacc.csi.it/", "richiedenteInfo");
    private final static QName _GetRefertiRequest_QNAME = new QName("http://dmacc.csi.it/", "getRefertiRequest");
    private final static QName _MetadatiDocumento_QNAME = new QName("http://dmacc.csi.it/", "metadatiDocumento");
    private final static QName _GetMieiRefertiResponse_QNAME = new QName("http://dmacc.csi.it/", "getMieiRefertiResponse");
    private final static QName _GetSoloEpisodi_QNAME = new QName("http://dmacc.csi.it/", "getSoloEpisodi");
    private final static QName _GetDocumentoResponse_QNAME = new QName("http://dmacc.csi.it/", "getDocumentoResponse");
    private final static QName _Medico_QNAME = new QName("http://dmacc.csi.it/", "medico");
    private final static QName _GetTuttiDocs_QNAME = new QName("http://dmacc.csi.it/", "getTuttiDocs");
    private final static QName _GetDocumentiEpisodioRequest_QNAME = new QName("http://dmacc.csi.it/", "GetDocumentiEpisodioRequest");
    private final static QName _GetConteggiResponse_QNAME = new QName("http://dmacc.csi.it/", "GetConteggiResponse");
    private final static QName _GetDocumentiEpisodioResponse_QNAME = new QName("http://dmacc.csi.it/", "GetDocumentiEpisodioResponse");
    private final static QName _GetSoloEpisodiRequest_QNAME = new QName("http://dmacc.csi.it/", "GetSoloEpisodiRequest");
    private final static QName _CategoriaTipologia_QNAME = new QName("http://dmacc.csi.it/", "categoriaTipologia");
    private final static QName _GetDocumentiCorrelatiOSCResponse_QNAME = new QName("http://dmacc.csi.it/", "getDocumentiCorrelatiOSCResponse");
    private final static QName _RegistraAvvenutoRitiro_QNAME = new QName("http://dmacc.csi.it/", "registraAvvenutoRitiro");
    private final static QName _SmediazioneDocumentiRequest_QNAME = new QName("http://dmacc.csi.it/", "smediazioneDocumentiRequest");
    private final static QName _GetDettaglioDocumentoResponse_QNAME = new QName("http://dmacc.csi.it/", "GetDettaglioDocumentoResponse");
    private final static QName _Episodio_QNAME = new QName("http://dmacc.csi.it/", "episodio");
    private final static QName _Etichetta_QNAME = new QName("http://dmacc.csi.it/", "etichetta");
    private final static QName _GetMieiRefertiDocsResponse_QNAME = new QName("http://dmacc.csi.it/", "getMieiRefertiDocsResponse");
    private final static QName _FiltroDocs_QNAME = new QName("http://dmacc.csi.it/", "filtroDocs");
    private final static QName _RegistraAvvenutoRitiroRequest_QNAME = new QName("http://dmacc.csi.it/", "registraAvvenutoRitiroRequest");
    private final static QName _SmediazioneDocumentiResponse_QNAME = new QName("http://dmacc.csi.it/", "smediazioneDocumentiResponse");
    private final static QName _Documento_QNAME = new QName("http://dmacc.csi.it/", "documento");
    private final static QName _GetDocumentiCorrelati_QNAME = new QName("http://dmacc.csi.it/", "getDocumentiCorrelati");
    private final static QName _DocumentoAreaRossa_QNAME = new QName("http://dmacc.csi.it/", "documentoAreaRossa");
    private final static QName _GetMieiRefertiDocs_QNAME = new QName("http://dmacc.csi.it/", "getMieiRefertiDocs");
    private final static QName _GetDettaglioDocumento_QNAME = new QName("http://dmacc.csi.it/", "getDettaglioDocumento");
    private final static QName _GetSoloEpisodiResponse_QNAME = new QName("http://dmacc.csi.it/", "GetSoloEpisodiResponse");
    private final static QName _SmediazioneDocumenti_QNAME = new QName("http://dmacc.csi.it/", "smediazioneDocumenti");
    private final static QName _GetRefertiResponse_QNAME = new QName("http://dmacc.csi.it/", "GetRefertiResponse");
    private final static QName _VerificaDocumentoScaricabileResponse_QNAME = new QName("http://dmacc.csi.it/", "verificaDocumentoScaricabileResponse");
    private final static QName _GetDocumentiCorrelatiResponse_QNAME = new QName("http://dmacc.csi.it/", "getDocumentiCorrelatiResponse");
    private final static QName _GetConteggi_QNAME = new QName("http://dmacc.csi.it/", "getConteggi");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.dmacc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FiltroDocs }
     * 
     */
    public FiltroDocs createFiltroDocs() {
        return new FiltroDocs();
    }

    /**
     * Create an instance of {@link RegistraAvvenutoRitiroRequest }
     * 
     */
    public RegistraAvvenutoRitiroRequest createRegistraAvvenutoRitiroRequest() {
        return new RegistraAvvenutoRitiroRequest();
    }

    /**
     * Create an instance of {@link SmediazioneDocumentiResponse }
     * 
     */
    public SmediazioneDocumentiResponse createSmediazioneDocumentiResponse() {
        return new SmediazioneDocumentiResponse();
    }

    /**
     * Create an instance of {@link GetDocumentiCorrelatiRequest }
     * 
     */
    public GetDocumentiCorrelatiRequest createGetDocumentiCorrelatiRequest() {
        return new GetDocumentiCorrelatiRequest();
    }

    /**
     * Create an instance of {@link GetRefertiResponse }
     * 
     */
    public GetRefertiResponse createGetRefertiResponse() {
        return new GetRefertiResponse();
    }

    /**
     * Create an instance of {@link GetDettaglioDocumentoResponse }
     * 
     */
    public GetDettaglioDocumentoResponse createGetDettaglioDocumentoResponse() {
        return new GetDettaglioDocumentoResponse();
    }

    /**
     * Create an instance of {@link SmediazioneDocumentiRequest }
     * 
     */
    public SmediazioneDocumentiRequest createSmediazioneDocumentiRequest() {
        return new SmediazioneDocumentiRequest();
    }

    /**
     * Create an instance of {@link Episodio }
     * 
     */
    public Episodio createEpisodio() {
        return new Episodio();
    }

    /**
     * Create an instance of {@link VerificaDocumentoScaricabileResponse }
     * 
     */
    public VerificaDocumentoScaricabileResponse createVerificaDocumentoScaricabileResponse() {
        return new VerificaDocumentoScaricabileResponse();
    }

    /**
     * Create an instance of {@link GetDocumentiCorrelatiResponse }
     * 
     */
    public GetDocumentiCorrelatiResponse createGetDocumentiCorrelatiResponse() {
        return new GetDocumentiCorrelatiResponse();
    }

    /**
     * Create an instance of {@link GetConteggiRequest }
     * 
     */
    public GetConteggiRequest createGetConteggiRequest() {
        return new GetConteggiRequest();
    }

    /**
     * Create an instance of {@link GetRefertiRequest }
     * 
     */
    public GetRefertiRequest createGetRefertiRequest() {
        return new GetRefertiRequest();
    }

    /**
     * Create an instance of {@link GetSoloEpisodiResponse }
     * 
     */
    public GetSoloEpisodiResponse createGetSoloEpisodiResponse() {
        return new GetSoloEpisodiResponse();
    }

    /**
     * Create an instance of {@link GetDettaglioDocumentoRequest }
     * 
     */
    public GetDettaglioDocumentoRequest createGetDettaglioDocumentoRequest() {
        return new GetDettaglioDocumentoRequest();
    }

    /**
     * Create an instance of {@link DocumentoAreaRossa }
     * 
     */
    public DocumentoAreaRossa createDocumentoAreaRossa() {
        return new DocumentoAreaRossa();
    }

    /**
     * Create an instance of {@link VerificaDocumentoScaricabileRequest }
     * 
     */
    public VerificaDocumentoScaricabileRequest createVerificaDocumentoScaricabileRequest() {
        return new VerificaDocumentoScaricabileRequest();
    }

    /**
     * Create an instance of {@link GetDocumentiCorrelatiOSCRequest }
     * 
     */
    public GetDocumentiCorrelatiOSCRequest createGetDocumentiCorrelatiOSCRequest() {
        return new GetDocumentiCorrelatiOSCRequest();
    }

    /**
     * Create an instance of {@link RegistraAvvenutoRitiroResponse }
     * 
     */
    public RegistraAvvenutoRitiroResponse createRegistraAvvenutoRitiroResponse() {
        return new RegistraAvvenutoRitiroResponse();
    }

    /**
     * Create an instance of {@link GetDocumentiEpisodioRequest }
     * 
     */
    public GetDocumentiEpisodioRequest createGetDocumentiEpisodioRequest() {
        return new GetDocumentiEpisodioRequest();
    }

    /**
     * Create an instance of {@link FiltroEpisodi }
     * 
     */
    public FiltroEpisodi createFiltroEpisodi() {
        return new FiltroEpisodi();
    }

    /**
     * Create an instance of {@link AccessionNumber }
     * 
     */
    public AccessionNumber createAccessionNumber() {
        return new AccessionNumber();
    }

    /**
     * Create an instance of {@link GetTuttiDocsRequest }
     * 
     */
    public GetTuttiDocsRequest createGetTuttiDocsRequest() {
        return new GetTuttiDocsRequest();
    }

    /**
     * Create an instance of {@link GetDocumento }
     * 
     */
    public GetDocumento createGetDocumento() {
        return new GetDocumento();
    }

    /**
     * Create an instance of {@link IdentificativoDocumento }
     * 
     */
    public IdentificativoDocumento createIdentificativoDocumento() {
        return new IdentificativoDocumento();
    }

    /**
     * Create an instance of {@link GetTuttiDocsResponse }
     * 
     */
    public GetTuttiDocsResponse createGetTuttiDocsResponse() {
        return new GetTuttiDocsResponse();
    }

    /**
     * Create an instance of {@link GetConteggiResponse }
     * 
     */
    public GetConteggiResponse createGetConteggiResponse() {
        return new GetConteggiResponse();
    }

    /**
     * Create an instance of {@link GetDocumentiCorrelatiOSCResponse }
     * 
     */
    public GetDocumentiCorrelatiOSCResponse createGetDocumentiCorrelatiOSCResponse() {
        return new GetDocumentiCorrelatiOSCResponse();
    }

    /**
     * Create an instance of {@link GetDocumentiEpisodioResponse }
     * 
     */
    public GetDocumentiEpisodioResponse createGetDocumentiEpisodioResponse() {
        return new GetDocumentiEpisodioResponse();
    }

    /**
     * Create an instance of {@link GetSoloEpisodiRequest }
     * 
     */
    public GetSoloEpisodiRequest createGetSoloEpisodiRequest() {
        return new GetSoloEpisodiRequest();
    }

    /**
     * Create an instance of {@link CategoriaTipologia }
     * 
     */
    public CategoriaTipologia createCategoriaTipologia() {
        return new CategoriaTipologia();
    }

    /**
     * Create an instance of {@link GetDocumentoResponse }
     * 
     */
    public GetDocumentoResponse createGetDocumentoResponse() {
        return new GetDocumentoResponse();
    }

    /**
     * Create an instance of {@link Medico }
     * 
     */
    public Medico createMedico() {
        return new Medico();
    }

    /**
     * Create an instance of {@link MetadatiDocumento }
     * 
     */
    public MetadatiDocumento createMetadatiDocumento() {
        return new MetadatiDocumento();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link Errore }
     * 
     */
    public Errore createErrore() {
        return new Errore();
    }

    /**
     * Create an instance of {@link Documento }
     * 
     */
    public Documento createDocumento() {
        return new Documento();
    }

    /**
     * Create an instance of {@link EnsMessagebody }
     * 
     */
    public EnsMessagebody createEnsMessagebody() {
        return new EnsMessagebody();
    }

    /**
     * Create an instance of {@link DocumentoDMA }
     * 
     */
    public DocumentoDMA createDocumentoDMA() {
        return new DocumentoDMA();
    }

    /**
     * Create an instance of {@link TipoEpisodio }
     * 
     */
    public TipoEpisodio createTipoEpisodio() {
        return new TipoEpisodio();
    }

    /**
     * Create an instance of {@link ApplicazioneRichiedente }
     * 
     */
    public ApplicazioneRichiedente createApplicazioneRichiedente() {
        return new ApplicazioneRichiedente();
    }

    /**
     * Create an instance of {@link EnsResponse }
     * 
     */
    public EnsResponse createEnsResponse() {
        return new EnsResponse();
    }

    /**
     * Create an instance of {@link TipoDocumento }
     * 
     */
    public TipoDocumento createTipoDocumento() {
        return new TipoDocumento();
    }

    /**
     * Create an instance of {@link Branca }
     * 
     */
    public Branca createBranca() {
        return new Branca();
    }

    /**
     * Create an instance of {@link ElementiSmediazione }
     * 
     */
    public ElementiSmediazione createElementiSmediazione() {
        return new ElementiSmediazione();
    }

    /**
     * Create an instance of {@link EtichettaNumeroDocumenti }
     * 
     */
    public EtichettaNumeroDocumenti createEtichettaNumeroDocumenti() {
        return new EtichettaNumeroDocumenti();
    }

    /**
     * Create an instance of {@link Codifica }
     * 
     */
    public Codifica createCodifica() {
        return new Codifica();
    }

    /**
     * Create an instance of {@link AssettoOrganizzativo }
     * 
     */
    public AssettoOrganizzativo createAssettoOrganizzativo() {
        return new AssettoOrganizzativo();
    }

    /**
     * Create an instance of {@link Prestazione }
     * 
     */
    public Prestazione createPrestazione() {
        return new Prestazione();
    }

    /**
     * Create an instance of {@link ApplicativoVerticale }
     * 
     */
    public ApplicativoVerticale createApplicativoVerticale() {
        return new ApplicativoVerticale();
    }

    /**
     * Create an instance of {@link EnsRequest }
     * 
     */
    public EnsRequest createEnsRequest() {
        return new EnsRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificativoDocumento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "identificativoDocumento")
    public JAXBElement<IdentificativoDocumento> createIdentificativoDocumento(IdentificativoDocumento value) {
        return new JAXBElement<IdentificativoDocumento>(_IdentificativoDocumento_QNAME, IdentificativoDocumento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTuttiDocsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getTuttiDocsResponse")
    public JAXBElement<GetTuttiDocsResponse> createGetTuttiDocsResponse(GetTuttiDocsResponse value) {
        return new JAXBElement<GetTuttiDocsResponse>(_GetTuttiDocsResponse_QNAME, GetTuttiDocsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTuttiDocsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getTuttiDocsRequest")
    public JAXBElement<GetTuttiDocsRequest> createGetTuttiDocsRequest(GetTuttiDocsRequest value) {
        return new JAXBElement<GetTuttiDocsRequest>(_GetTuttiDocsRequest_QNAME, GetTuttiDocsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDettaglioDocumentoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "GetDettaglioDocumentoRequest")
    public JAXBElement<GetDettaglioDocumentoRequest> createGetDettaglioDocumentoRequest(GetDettaglioDocumentoRequest value) {
        return new JAXBElement<GetDettaglioDocumentoRequest>(_GetDettaglioDocumentoRequest_QNAME, GetDettaglioDocumentoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getDocumento")
    public JAXBElement<GetDocumento> createGetDocumento(GetDocumento value) {
        return new JAXBElement<GetDocumento>(_GetDocumento_QNAME, GetDocumento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaDocumentoScaricabileRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "verificaDocumentoScaricabileRequest")
    public JAXBElement<VerificaDocumentoScaricabileRequest> createVerificaDocumentoScaricabileRequest(VerificaDocumentoScaricabileRequest value) {
        return new JAXBElement<VerificaDocumentoScaricabileRequest>(_VerificaDocumentoScaricabileRequest_QNAME, VerificaDocumentoScaricabileRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConteggiRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "GetConteggiRequest")
    public JAXBElement<GetConteggiRequest> createGetConteggiRequest(GetConteggiRequest value) {
        return new JAXBElement<GetConteggiRequest>(_GetConteggiRequest_QNAME, GetConteggiRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentiEpisodioRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getDocumentiEpisodio")
    public JAXBElement<GetDocumentiEpisodioRequest> createGetDocumentiEpisodio(GetDocumentiEpisodioRequest value) {
        return new JAXBElement<GetDocumentiEpisodioRequest>(_GetDocumentiEpisodio_QNAME, GetDocumentiEpisodioRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistraAvvenutoRitiroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "registraAvvenutoRitiroResponse")
    public JAXBElement<RegistraAvvenutoRitiroResponse> createRegistraAvvenutoRitiroResponse(RegistraAvvenutoRitiroResponse value) {
        return new JAXBElement<RegistraAvvenutoRitiroResponse>(_RegistraAvvenutoRitiroResponse_QNAME, RegistraAvvenutoRitiroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRefertiRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getMieiReferti")
    public JAXBElement<GetRefertiRequest> createGetMieiReferti(GetRefertiRequest value) {
        return new JAXBElement<GetRefertiRequest>(_GetMieiReferti_QNAME, GetRefertiRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessionNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "accessionNumber")
    public JAXBElement<AccessionNumber> createAccessionNumber(AccessionNumber value) {
        return new JAXBElement<AccessionNumber>(_AccessionNumber_QNAME, AccessionNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentiCorrelatiRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getDocumentiCorrelatiRequest")
    public JAXBElement<GetDocumentiCorrelatiRequest> createGetDocumentiCorrelatiRequest(GetDocumentiCorrelatiRequest value) {
        return new JAXBElement<GetDocumentiCorrelatiRequest>(_GetDocumentiCorrelatiRequest_QNAME, GetDocumentiCorrelatiRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FiltroEpisodi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "filtroEpisodi")
    public JAXBElement<FiltroEpisodi> createFiltroEpisodi(FiltroEpisodi value) {
        return new JAXBElement<FiltroEpisodi>(_FiltroEpisodi_QNAME, FiltroEpisodi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaDocumentoScaricabileRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "verificaDocumentoScaricabile")
    public JAXBElement<VerificaDocumentoScaricabileRequest> createVerificaDocumentoScaricabile(VerificaDocumentoScaricabileRequest value) {
        return new JAXBElement<VerificaDocumentoScaricabileRequest>(_VerificaDocumentoScaricabile_QNAME, VerificaDocumentoScaricabileRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentiCorrelatiOSCRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getDocumentiCorrelatiOSC")
    public JAXBElement<GetDocumentiCorrelatiOSCRequest> createGetDocumentiCorrelatiOSC(GetDocumentiCorrelatiOSCRequest value) {
        return new JAXBElement<GetDocumentiCorrelatiOSCRequest>(_GetDocumentiCorrelatiOSC_QNAME, GetDocumentiCorrelatiOSCRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentiCorrelatiOSCRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getDocumentiCorrelatiOSCRequest")
    public JAXBElement<GetDocumentiCorrelatiOSCRequest> createGetDocumentiCorrelatiOSCRequest(GetDocumentiCorrelatiOSCRequest value) {
        return new JAXBElement<GetDocumentiCorrelatiOSCRequest>(_GetDocumentiCorrelatiOSCRequest_QNAME, GetDocumentiCorrelatiOSCRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRefertiRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getRefertiRequest")
    public JAXBElement<GetRefertiRequest> createGetRefertiRequest(GetRefertiRequest value) {
        return new JAXBElement<GetRefertiRequest>(_GetRefertiRequest_QNAME, GetRefertiRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadatiDocumento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "metadatiDocumento")
    public JAXBElement<MetadatiDocumento> createMetadatiDocumento(MetadatiDocumento value) {
        return new JAXBElement<MetadatiDocumento>(_MetadatiDocumento_QNAME, MetadatiDocumento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRefertiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getMieiRefertiResponse")
    public JAXBElement<GetRefertiResponse> createGetMieiRefertiResponse(GetRefertiResponse value) {
        return new JAXBElement<GetRefertiResponse>(_GetMieiRefertiResponse_QNAME, GetRefertiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSoloEpisodiRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getSoloEpisodi")
    public JAXBElement<GetSoloEpisodiRequest> createGetSoloEpisodi(GetSoloEpisodiRequest value) {
        return new JAXBElement<GetSoloEpisodiRequest>(_GetSoloEpisodi_QNAME, GetSoloEpisodiRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getDocumentoResponse")
    public JAXBElement<GetDocumentoResponse> createGetDocumentoResponse(GetDocumentoResponse value) {
        return new JAXBElement<GetDocumentoResponse>(_GetDocumentoResponse_QNAME, GetDocumentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Medico }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "medico")
    public JAXBElement<Medico> createMedico(Medico value) {
        return new JAXBElement<Medico>(_Medico_QNAME, Medico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTuttiDocsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getTuttiDocs")
    public JAXBElement<GetTuttiDocsRequest> createGetTuttiDocs(GetTuttiDocsRequest value) {
        return new JAXBElement<GetTuttiDocsRequest>(_GetTuttiDocs_QNAME, GetTuttiDocsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentiEpisodioRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "GetDocumentiEpisodioRequest")
    public JAXBElement<GetDocumentiEpisodioRequest> createGetDocumentiEpisodioRequest(GetDocumentiEpisodioRequest value) {
        return new JAXBElement<GetDocumentiEpisodioRequest>(_GetDocumentiEpisodioRequest_QNAME, GetDocumentiEpisodioRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConteggiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "GetConteggiResponse")
    public JAXBElement<GetConteggiResponse> createGetConteggiResponse(GetConteggiResponse value) {
        return new JAXBElement<GetConteggiResponse>(_GetConteggiResponse_QNAME, GetConteggiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentiEpisodioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "GetDocumentiEpisodioResponse")
    public JAXBElement<GetDocumentiEpisodioResponse> createGetDocumentiEpisodioResponse(GetDocumentiEpisodioResponse value) {
        return new JAXBElement<GetDocumentiEpisodioResponse>(_GetDocumentiEpisodioResponse_QNAME, GetDocumentiEpisodioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSoloEpisodiRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "GetSoloEpisodiRequest")
    public JAXBElement<GetSoloEpisodiRequest> createGetSoloEpisodiRequest(GetSoloEpisodiRequest value) {
        return new JAXBElement<GetSoloEpisodiRequest>(_GetSoloEpisodiRequest_QNAME, GetSoloEpisodiRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriaTipologia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "categoriaTipologia")
    public JAXBElement<CategoriaTipologia> createCategoriaTipologia(CategoriaTipologia value) {
        return new JAXBElement<CategoriaTipologia>(_CategoriaTipologia_QNAME, CategoriaTipologia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentiCorrelatiOSCResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getDocumentiCorrelatiOSCResponse")
    public JAXBElement<GetDocumentiCorrelatiOSCResponse> createGetDocumentiCorrelatiOSCResponse(GetDocumentiCorrelatiOSCResponse value) {
        return new JAXBElement<GetDocumentiCorrelatiOSCResponse>(_GetDocumentiCorrelatiOSCResponse_QNAME, GetDocumentiCorrelatiOSCResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistraAvvenutoRitiroRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "registraAvvenutoRitiro")
    public JAXBElement<RegistraAvvenutoRitiroRequest> createRegistraAvvenutoRitiro(RegistraAvvenutoRitiroRequest value) {
        return new JAXBElement<RegistraAvvenutoRitiroRequest>(_RegistraAvvenutoRitiro_QNAME, RegistraAvvenutoRitiroRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmediazioneDocumentiRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "smediazioneDocumentiRequest")
    public JAXBElement<SmediazioneDocumentiRequest> createSmediazioneDocumentiRequest(SmediazioneDocumentiRequest value) {
        return new JAXBElement<SmediazioneDocumentiRequest>(_SmediazioneDocumentiRequest_QNAME, SmediazioneDocumentiRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDettaglioDocumentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "GetDettaglioDocumentoResponse")
    public JAXBElement<GetDettaglioDocumentoResponse> createGetDettaglioDocumentoResponse(GetDettaglioDocumentoResponse value) {
        return new JAXBElement<GetDettaglioDocumentoResponse>(_GetDettaglioDocumentoResponse_QNAME, GetDettaglioDocumentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Episodio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "episodio")
    public JAXBElement<Episodio> createEpisodio(Episodio value) {
        return new JAXBElement<Episodio>(_Episodio_QNAME, Episodio.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRefertiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getMieiRefertiDocsResponse")
    public JAXBElement<GetRefertiResponse> createGetMieiRefertiDocsResponse(GetRefertiResponse value) {
        return new JAXBElement<GetRefertiResponse>(_GetMieiRefertiDocsResponse_QNAME, GetRefertiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FiltroDocs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "filtroDocs")
    public JAXBElement<FiltroDocs> createFiltroDocs(FiltroDocs value) {
        return new JAXBElement<FiltroDocs>(_FiltroDocs_QNAME, FiltroDocs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistraAvvenutoRitiroRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "registraAvvenutoRitiroRequest")
    public JAXBElement<RegistraAvvenutoRitiroRequest> createRegistraAvvenutoRitiroRequest(RegistraAvvenutoRitiroRequest value) {
        return new JAXBElement<RegistraAvvenutoRitiroRequest>(_RegistraAvvenutoRitiroRequest_QNAME, RegistraAvvenutoRitiroRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmediazioneDocumentiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "smediazioneDocumentiResponse")
    public JAXBElement<SmediazioneDocumentiResponse> createSmediazioneDocumentiResponse(SmediazioneDocumentiResponse value) {
        return new JAXBElement<SmediazioneDocumentiResponse>(_SmediazioneDocumentiResponse_QNAME, SmediazioneDocumentiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "documento")
    public JAXBElement<Object> createDocumento(Object value) {
        return new JAXBElement<Object>(_Documento_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentiCorrelatiRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getDocumentiCorrelati")
    public JAXBElement<GetDocumentiCorrelatiRequest> createGetDocumentiCorrelati(GetDocumentiCorrelatiRequest value) {
        return new JAXBElement<GetDocumentiCorrelatiRequest>(_GetDocumentiCorrelati_QNAME, GetDocumentiCorrelatiRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentoAreaRossa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "documentoAreaRossa")
    public JAXBElement<DocumentoAreaRossa> createDocumentoAreaRossa(DocumentoAreaRossa value) {
        return new JAXBElement<DocumentoAreaRossa>(_DocumentoAreaRossa_QNAME, DocumentoAreaRossa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRefertiRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getMieiRefertiDocs")
    public JAXBElement<GetRefertiRequest> createGetMieiRefertiDocs(GetRefertiRequest value) {
        return new JAXBElement<GetRefertiRequest>(_GetMieiRefertiDocs_QNAME, GetRefertiRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDettaglioDocumentoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getDettaglioDocumento")
    public JAXBElement<GetDettaglioDocumentoRequest> createGetDettaglioDocumento(GetDettaglioDocumentoRequest value) {
        return new JAXBElement<GetDettaglioDocumentoRequest>(_GetDettaglioDocumento_QNAME, GetDettaglioDocumentoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSoloEpisodiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "GetSoloEpisodiResponse")
    public JAXBElement<GetSoloEpisodiResponse> createGetSoloEpisodiResponse(GetSoloEpisodiResponse value) {
        return new JAXBElement<GetSoloEpisodiResponse>(_GetSoloEpisodiResponse_QNAME, GetSoloEpisodiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmediazioneDocumentiRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "smediazioneDocumenti")
    public JAXBElement<SmediazioneDocumentiRequest> createSmediazioneDocumenti(SmediazioneDocumentiRequest value) {
        return new JAXBElement<SmediazioneDocumentiRequest>(_SmediazioneDocumenti_QNAME, SmediazioneDocumentiRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRefertiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "GetRefertiResponse")
    public JAXBElement<GetRefertiResponse> createGetRefertiResponse(GetRefertiResponse value) {
        return new JAXBElement<GetRefertiResponse>(_GetRefertiResponse_QNAME, GetRefertiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaDocumentoScaricabileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "verificaDocumentoScaricabileResponse")
    public JAXBElement<VerificaDocumentoScaricabileResponse> createVerificaDocumentoScaricabileResponse(VerificaDocumentoScaricabileResponse value) {
        return new JAXBElement<VerificaDocumentoScaricabileResponse>(_VerificaDocumentoScaricabileResponse_QNAME, VerificaDocumentoScaricabileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentiCorrelatiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getDocumentiCorrelatiResponse")
    public JAXBElement<GetDocumentiCorrelatiResponse> createGetDocumentiCorrelatiResponse(GetDocumentiCorrelatiResponse value) {
        return new JAXBElement<GetDocumentiCorrelatiResponse>(_GetDocumentiCorrelatiResponse_QNAME, GetDocumentiCorrelatiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConteggiRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getConteggi")
    public JAXBElement<GetConteggiRequest> createGetConteggi(GetConteggiRequest value) {
        return new JAXBElement<GetConteggiRequest>(_GetConteggi_QNAME, GetConteggiRequest.class, null, value);
    }

}
