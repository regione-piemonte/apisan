/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.paziente.dmaccbl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import it.csi.apisan.apisanfse.integration.paziente.dma.Paziente;
import it.csi.apisan.apisanfse.integration.paziente.dma.RichiedenteInfo;
import it.csi.apisan.apisanfse.integration.paziente.dma.RiepilogoPaziente;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.dmaccbl package. 
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

    private final static QName _NotificaDocumentoScaricabile_QNAME = new QName("http://dmaccbl.csi.it/", "notificaDocumentoScaricabile");
    private final static QName _InvioNotifichePazientiNRResponse_QNAME = new QName("http://dmaccbl.csi.it/", "invioNotifichePazientiNRResponse");
    private final static QName _GetMMGPazienteResponse_QNAME = new QName("http://dmaccbl.csi.it/", "getMMGPazienteResponse");
    private final static QName _GetInfoPazienteResponse_QNAME = new QName("http://dmaccbl.csi.it/", "getInfoPazienteResponse");
    private final static QName _GetAccessi_QNAME = new QName("http://dmaccbl.csi.it/", "getAccessi");
    private final static QName _SetDatiNotificaMMGResponse_QNAME = new QName("http://dmaccbl.csi.it/", "setDatiNotificaMMGResponse");
    private final static QName _GetCLDaInvocareResponse_QNAME = new QName("http://dmaccbl.csi.it/", "getCLDaInvocareResponse");
    private final static QName _GetRiepilogo_QNAME = new QName("http://dmaccbl.csi.it/", "getRiepilogo");
    private final static QName _GetDoNotificaMMGResponse_QNAME = new QName("http://dmaccbl.csi.it/", "getDoNotificaMMGResponse");
    private final static QName _GetPazienteByIdIrecResponse_QNAME = new QName("http://dmaccbl.csi.it/", "getPazienteByIdIrecResponse");
    private final static QName _VerificaRefertiInScadenzaResponse_QNAME = new QName("http://dmaccbl.csi.it/", "verificaRefertiInScadenzaResponse");
    private final static QName _InvioNotifichePazienti_QNAME = new QName("http://dmaccbl.csi.it/", "invioNotifichePazienti");
    private final static QName _InvioNotifichePazientiNAResponse_QNAME = new QName("http://dmaccbl.csi.it/", "invioNotifichePazientiNAResponse");
    private final static QName _GetAccessiResponse_QNAME = new QName("http://dmaccbl.csi.it/", "GetAccessiResponse");
    private final static QName _InvioNotifichePazientiNR_QNAME = new QName("http://dmaccbl.csi.it/", "invioNotifichePazientiNR");
    private final static QName _RichiedenteInfo_QNAME = new QName("http://dmaccbl.csi.it/", "richiedenteInfo");
    private final static QName _NotificaPresenzaDatiILEC_QNAME = new QName("http://dmaccbl.csi.it/", "notificaPresenzaDatiILEC");
    private final static QName _GetDatiNotificaMMGResponse_QNAME = new QName("http://dmaccbl.csi.it/", "getDatiNotificaMMGResponse");
    private final static QName _GetAccessi2Request_QNAME = new QName("http://dmaccbl.csi.it/", "GetAccessi2Request");
    private final static QName _InvioNotifichePazientiResponse_QNAME = new QName("http://dmaccbl.csi.it/", "invioNotifichePazientiResponse");
    private final static QName _RicercaPaziente_QNAME = new QName("http://dmaccbl.csi.it/", "ricercaPaziente");
    private final static QName _InvioNotifichePazientiNF_QNAME = new QName("http://dmaccbl.csi.it/", "invioNotifichePazientiNF");
    private final static QName _RiepilogoPaziente_QNAME = new QName("http://dmaccbl.csi.it/", "riepilogoPaziente");
    private final static QName _InvioNotifichePazientiNA_QNAME = new QName("http://dmaccbl.csi.it/", "invioNotifichePazientiNA");
    private final static QName _RicercaPazienteResponse_QNAME = new QName("http://dmaccbl.csi.it/", "ricercaPazienteResponse");
    private final static QName _GetDatiNotificaMMG_QNAME = new QName("http://dmaccbl.csi.it/", "getDatiNotificaMMG");
    private final static QName _GetMMGPaziente_QNAME = new QName("http://dmaccbl.csi.it/", "getMMGPaziente");
    private final static QName _NotificaPresenzaDatiILECResponse_QNAME = new QName("http://dmaccbl.csi.it/", "notificaPresenzaDatiILECResponse");
    private final static QName _NotificaDocumentoScaricabileResponse_QNAME = new QName("http://dmaccbl.csi.it/", "notificaDocumentoScaricabileResponse");
    private final static QName _InvioNotifichePazientiNFResponse_QNAME = new QName("http://dmaccbl.csi.it/", "invioNotifichePazientiNFResponse");
    private final static QName _PreparaNotifichePazientiNR_QNAME = new QName("http://dmaccbl.csi.it/", "preparaNotifichePazientiNR");
    private final static QName _SetInfoPaziente_QNAME = new QName("http://dmaccbl.csi.it/", "setInfoPaziente");
    private final static QName _GetPazienteByIdIrec_QNAME = new QName("http://dmaccbl.csi.it/", "getPazienteByIdIrec");
    private final static QName _SetDatiNotificaMMG_QNAME = new QName("http://dmaccbl.csi.it/", "setDatiNotificaMMG");
    private final static QName _GetAccessi2Response_QNAME = new QName("http://dmaccbl.csi.it/", "GetAccessi2Response");
    private final static QName _VerificaRefertiInScadenza_QNAME = new QName("http://dmaccbl.csi.it/", "verificaRefertiInScadenza");
    private final static QName _GetInfoPaziente_QNAME = new QName("http://dmaccbl.csi.it/", "getInfoPaziente");
    private final static QName _GetRiepilogoResponse_QNAME = new QName("http://dmaccbl.csi.it/", "getRiepilogoResponse");
    private final static QName _SetInfoPazienteResponse_QNAME = new QName("http://dmaccbl.csi.it/", "setInfoPazienteResponse");
    private final static QName _GetDoNotificaMMG_QNAME = new QName("http://dmaccbl.csi.it/", "getDoNotificaMMG");
    private final static QName _GetCLDaInvocare_QNAME = new QName("http://dmaccbl.csi.it/", "getCLDaInvocare");
    private final static QName _PreparaNotifichePazientiNRResponse_QNAME = new QName("http://dmaccbl.csi.it/", "preparaNotifichePazientiNRResponse");
    private final static QName _GetPazienteByIdIRECResponsePaziente_QNAME = new QName("", "paziente");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.dmaccbl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AlimentazioneElencoCodiciFiscali }
     * 
     */
    public AlimentazioneElencoCodiciFiscali createAlimentazioneElencoCodiciFiscali() {
        return new AlimentazioneElencoCodiciFiscali();
    }

    /**
     * Create an instance of {@link AlimentazioneElencoCodiciFiscaliResponse }
     * 
     */
    public AlimentazioneElencoCodiciFiscaliResponse createAlimentazioneElencoCodiciFiscaliResponse() {
        return new AlimentazioneElencoCodiciFiscaliResponse();
    }

    /**
     * Create an instance of {@link InvioNotifichePazientiResponse }
     * 
     */
    public InvioNotifichePazientiResponse createInvioNotifichePazientiResponse() {
        return new InvioNotifichePazientiResponse();
    }

    /**
     * Create an instance of {@link GetPazienteByIdIRECResponse }
     * 
     */
    public GetPazienteByIdIRECResponse createGetPazienteByIdIRECResponse() {
        return new GetPazienteByIdIRECResponse();
    }

    /**
     * Create an instance of {@link InvioNotifichePazienti }
     * 
     */
    public InvioNotifichePazienti createInvioNotifichePazienti() {
        return new InvioNotifichePazienti();
    }

    /**
     * Create an instance of {@link SetInfoPaziente }
     * 
     */
    public SetInfoPaziente createSetInfoPaziente() {
        return new SetInfoPaziente();
    }

    /**
     * Create an instance of {@link GetDoNotificaMMGResponse }
     * 
     */
    public GetDoNotificaMMGResponse createGetDoNotificaMMGResponse() {
        return new GetDoNotificaMMGResponse();
    }

    /**
     * Create an instance of {@link GetRiepilogo }
     * 
     */
    public GetRiepilogo createGetRiepilogo() {
        return new GetRiepilogo();
    }

    /**
     * Create an instance of {@link NotificaRefertoScaricabileResponse }
     * 
     */
    public NotificaRefertoScaricabileResponse createNotificaRefertoScaricabileResponse() {
        return new NotificaRefertoScaricabileResponse();
    }

    /**
     * Create an instance of {@link SetDatiNotificaMMGResponse }
     * 
     */
    public SetDatiNotificaMMGResponse createSetDatiNotificaMMGResponse() {
        return new SetDatiNotificaMMGResponse();
    }

    /**
     * Create an instance of {@link GetCLDaInvocareResponse }
     * 
     */
    public GetCLDaInvocareResponse createGetCLDaInvocareResponse() {
        return new GetCLDaInvocareResponse();
    }

    /**
     * Create an instance of {@link GetAccessi }
     * 
     */
    public GetAccessi createGetAccessi() {
        return new GetAccessi();
    }

    /**
     * Create an instance of {@link NotificaPresenzaDatiILECResponse }
     * 
     */
    public NotificaPresenzaDatiILECResponse createNotificaPresenzaDatiILECResponse() {
        return new NotificaPresenzaDatiILECResponse();
    }

    /**
     * Create an instance of {@link GetMMGPazienteResponse }
     * 
     */
    public GetMMGPazienteResponse createGetMMGPazienteResponse() {
        return new GetMMGPazienteResponse();
    }

    /**
     * Create an instance of {@link NotificaDocumentoScaricabile }
     * 
     */
    public NotificaDocumentoScaricabile createNotificaDocumentoScaricabile() {
        return new NotificaDocumentoScaricabile();
    }

    /**
     * Create an instance of {@link GetInfoPazienteResponse }
     * 
     */
    public GetInfoPazienteResponse createGetInfoPazienteResponse() {
        return new GetInfoPazienteResponse();
    }

    /**
     * Create an instance of {@link RicercaPazienteResponse }
     * 
     */
    public RicercaPazienteResponse createRicercaPazienteResponse() {
        return new RicercaPazienteResponse();
    }

    /**
     * Create an instance of {@link GetDatiNotificaMMG }
     * 
     */
    public GetDatiNotificaMMG createGetDatiNotificaMMG() {
        return new GetDatiNotificaMMG();
    }

    /**
     * Create an instance of {@link GetMMGPaziente }
     * 
     */
    public GetMMGPaziente createGetMMGPaziente() {
        return new GetMMGPaziente();
    }

    /**
     * Create an instance of {@link GetDoNotificaMMG }
     * 
     */
    public GetDoNotificaMMG createGetDoNotificaMMG() {
        return new GetDoNotificaMMG();
    }

    /**
     * Create an instance of {@link RicercaPaziente }
     * 
     */
    public RicercaPaziente createRicercaPaziente() {
        return new RicercaPaziente();
    }

    /**
     * Create an instance of {@link GetCLDaInvocare }
     * 
     */
    public GetCLDaInvocare createGetCLDaInvocare() {
        return new GetCLDaInvocare();
    }

    /**
     * Create an instance of {@link GetAccessi2Request }
     * 
     */
    public GetAccessi2Request createGetAccessi2Request() {
        return new GetAccessi2Request();
    }

    /**
     * Create an instance of {@link SetInfoPazienteResponse }
     * 
     */
    public SetInfoPazienteResponse createSetInfoPazienteResponse() {
        return new SetInfoPazienteResponse();
    }

    /**
     * Create an instance of {@link GetRiepilogoResponse }
     * 
     */
    public GetRiepilogoResponse createGetRiepilogoResponse() {
        return new GetRiepilogoResponse();
    }

    /**
     * Create an instance of {@link NotificaPresenzaDatiILEC }
     * 
     */
    public NotificaPresenzaDatiILEC createNotificaPresenzaDatiILEC() {
        return new NotificaPresenzaDatiILEC();
    }

    /**
     * Create an instance of {@link GetDatiNotificaMMGResponse }
     * 
     */
    public GetDatiNotificaMMGResponse createGetDatiNotificaMMGResponse() {
        return new GetDatiNotificaMMGResponse();
    }

    /**
     * Create an instance of {@link GetInfoPaziente }
     * 
     */
    public GetInfoPaziente createGetInfoPaziente() {
        return new GetInfoPaziente();
    }

    /**
     * Create an instance of {@link GetAccessiResponse }
     * 
     */
    public GetAccessiResponse createGetAccessiResponse() {
        return new GetAccessiResponse();
    }

    /**
     * Create an instance of {@link SetDatiNotificaMMG }
     * 
     */
    public SetDatiNotificaMMG createSetDatiNotificaMMG() {
        return new SetDatiNotificaMMG();
    }

    /**
     * Create an instance of {@link GetPazienteByIdIREC }
     * 
     */
    public GetPazienteByIdIREC createGetPazienteByIdIREC() {
        return new GetPazienteByIdIREC();
    }

    /**
     * Create an instance of {@link GetAccessi2Response }
     * 
     */
    public GetAccessi2Response createGetAccessi2Response() {
        return new GetAccessi2Response();
    }

    /**
     * Create an instance of {@link InfoAddendumReferto }
     * 
     */
    public InfoAddendumReferto createInfoAddendumReferto() {
        return new InfoAddendumReferto();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link SintesiElemento }
     * 
     */
    public SintesiElemento createSintesiElemento() {
        return new SintesiElemento();
    }

    /**
     * Create an instance of {@link HashMap }
     * 
     */
    public HashMap createHashMap() {
        return new HashMap();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificaDocumentoScaricabile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "notificaDocumentoScaricabile")
    public JAXBElement<NotificaDocumentoScaricabile> createNotificaDocumentoScaricabile(NotificaDocumentoScaricabile value) {
        return new JAXBElement<NotificaDocumentoScaricabile>(_NotificaDocumentoScaricabile_QNAME, NotificaDocumentoScaricabile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvioNotifichePazientiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "invioNotifichePazientiNRResponse")
    public JAXBElement<InvioNotifichePazientiResponse> createInvioNotifichePazientiNRResponse(InvioNotifichePazientiResponse value) {
        return new JAXBElement<InvioNotifichePazientiResponse>(_InvioNotifichePazientiNRResponse_QNAME, InvioNotifichePazientiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMMGPazienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "getMMGPazienteResponse")
    public JAXBElement<GetMMGPazienteResponse> createGetMMGPazienteResponse(GetMMGPazienteResponse value) {
        return new JAXBElement<GetMMGPazienteResponse>(_GetMMGPazienteResponse_QNAME, GetMMGPazienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoPazienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "getInfoPazienteResponse")
    public JAXBElement<GetInfoPazienteResponse> createGetInfoPazienteResponse(GetInfoPazienteResponse value) {
        return new JAXBElement<GetInfoPazienteResponse>(_GetInfoPazienteResponse_QNAME, GetInfoPazienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccessi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "getAccessi")
    public JAXBElement<GetAccessi> createGetAccessi(GetAccessi value) {
        return new JAXBElement<GetAccessi>(_GetAccessi_QNAME, GetAccessi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDatiNotificaMMGResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "setDatiNotificaMMGResponse")
    public JAXBElement<SetDatiNotificaMMGResponse> createSetDatiNotificaMMGResponse(SetDatiNotificaMMGResponse value) {
        return new JAXBElement<SetDatiNotificaMMGResponse>(_SetDatiNotificaMMGResponse_QNAME, SetDatiNotificaMMGResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCLDaInvocareResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "getCLDaInvocareResponse")
    public JAXBElement<GetCLDaInvocareResponse> createGetCLDaInvocareResponse(GetCLDaInvocareResponse value) {
        return new JAXBElement<GetCLDaInvocareResponse>(_GetCLDaInvocareResponse_QNAME, GetCLDaInvocareResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRiepilogo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "getRiepilogo")
    public JAXBElement<GetRiepilogo> createGetRiepilogo(GetRiepilogo value) {
        return new JAXBElement<GetRiepilogo>(_GetRiepilogo_QNAME, GetRiepilogo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoNotificaMMGResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "getDoNotificaMMGResponse")
    public JAXBElement<GetDoNotificaMMGResponse> createGetDoNotificaMMGResponse(GetDoNotificaMMGResponse value) {
        return new JAXBElement<GetDoNotificaMMGResponse>(_GetDoNotificaMMGResponse_QNAME, GetDoNotificaMMGResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPazienteByIdIRECResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "getPazienteByIdIrecResponse")
    public JAXBElement<GetPazienteByIdIRECResponse> createGetPazienteByIdIrecResponse(GetPazienteByIdIRECResponse value) {
        return new JAXBElement<GetPazienteByIdIRECResponse>(_GetPazienteByIdIrecResponse_QNAME, GetPazienteByIdIRECResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvioNotifichePazientiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "verificaRefertiInScadenzaResponse")
    public JAXBElement<InvioNotifichePazientiResponse> createVerificaRefertiInScadenzaResponse(InvioNotifichePazientiResponse value) {
        return new JAXBElement<InvioNotifichePazientiResponse>(_VerificaRefertiInScadenzaResponse_QNAME, InvioNotifichePazientiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvioNotifichePazienti }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "invioNotifichePazienti")
    public JAXBElement<InvioNotifichePazienti> createInvioNotifichePazienti(InvioNotifichePazienti value) {
        return new JAXBElement<InvioNotifichePazienti>(_InvioNotifichePazienti_QNAME, InvioNotifichePazienti.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvioNotifichePazientiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "invioNotifichePazientiNAResponse")
    public JAXBElement<InvioNotifichePazientiResponse> createInvioNotifichePazientiNAResponse(InvioNotifichePazientiResponse value) {
        return new JAXBElement<InvioNotifichePazientiResponse>(_InvioNotifichePazientiNAResponse_QNAME, InvioNotifichePazientiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccessiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "GetAccessiResponse")
    public JAXBElement<GetAccessiResponse> createGetAccessiResponse(GetAccessiResponse value) {
        return new JAXBElement<GetAccessiResponse>(_GetAccessiResponse_QNAME, GetAccessiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvioNotifichePazienti }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "invioNotifichePazientiNR")
    public JAXBElement<InvioNotifichePazienti> createInvioNotifichePazientiNR(InvioNotifichePazienti value) {
        return new JAXBElement<InvioNotifichePazienti>(_InvioNotifichePazientiNR_QNAME, InvioNotifichePazienti.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RichiedenteInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "richiedenteInfo")
    public JAXBElement<RichiedenteInfo> createRichiedenteInfo(RichiedenteInfo value) {
        return new JAXBElement<RichiedenteInfo>(_RichiedenteInfo_QNAME, RichiedenteInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificaPresenzaDatiILEC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "notificaPresenzaDatiILEC")
    public JAXBElement<NotificaPresenzaDatiILEC> createNotificaPresenzaDatiILEC(NotificaPresenzaDatiILEC value) {
        return new JAXBElement<NotificaPresenzaDatiILEC>(_NotificaPresenzaDatiILEC_QNAME, NotificaPresenzaDatiILEC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDatiNotificaMMGResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "getDatiNotificaMMGResponse")
    public JAXBElement<GetDatiNotificaMMGResponse> createGetDatiNotificaMMGResponse(GetDatiNotificaMMGResponse value) {
        return new JAXBElement<GetDatiNotificaMMGResponse>(_GetDatiNotificaMMGResponse_QNAME, GetDatiNotificaMMGResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccessi2Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "GetAccessi2Request")
    public JAXBElement<GetAccessi2Request> createGetAccessi2Request(GetAccessi2Request value) {
        return new JAXBElement<GetAccessi2Request>(_GetAccessi2Request_QNAME, GetAccessi2Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvioNotifichePazientiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "invioNotifichePazientiResponse")
    public JAXBElement<InvioNotifichePazientiResponse> createInvioNotifichePazientiResponse(InvioNotifichePazientiResponse value) {
        return new JAXBElement<InvioNotifichePazientiResponse>(_InvioNotifichePazientiResponse_QNAME, InvioNotifichePazientiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RicercaPaziente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "ricercaPaziente")
    public JAXBElement<RicercaPaziente> createRicercaPaziente(RicercaPaziente value) {
        return new JAXBElement<RicercaPaziente>(_RicercaPaziente_QNAME, RicercaPaziente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvioNotifichePazienti }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "invioNotifichePazientiNF")
    public JAXBElement<InvioNotifichePazienti> createInvioNotifichePazientiNF(InvioNotifichePazienti value) {
        return new JAXBElement<InvioNotifichePazienti>(_InvioNotifichePazientiNF_QNAME, InvioNotifichePazienti.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RiepilogoPaziente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "riepilogoPaziente")
    public JAXBElement<RiepilogoPaziente> createRiepilogoPaziente(RiepilogoPaziente value) {
        return new JAXBElement<RiepilogoPaziente>(_RiepilogoPaziente_QNAME, RiepilogoPaziente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvioNotifichePazienti }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "invioNotifichePazientiNA")
    public JAXBElement<InvioNotifichePazienti> createInvioNotifichePazientiNA(InvioNotifichePazienti value) {
        return new JAXBElement<InvioNotifichePazienti>(_InvioNotifichePazientiNA_QNAME, InvioNotifichePazienti.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RicercaPazienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "ricercaPazienteResponse")
    public JAXBElement<RicercaPazienteResponse> createRicercaPazienteResponse(RicercaPazienteResponse value) {
        return new JAXBElement<RicercaPazienteResponse>(_RicercaPazienteResponse_QNAME, RicercaPazienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDatiNotificaMMG }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "getDatiNotificaMMG")
    public JAXBElement<GetDatiNotificaMMG> createGetDatiNotificaMMG(GetDatiNotificaMMG value) {
        return new JAXBElement<GetDatiNotificaMMG>(_GetDatiNotificaMMG_QNAME, GetDatiNotificaMMG.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMMGPaziente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "getMMGPaziente")
    public JAXBElement<GetMMGPaziente> createGetMMGPaziente(GetMMGPaziente value) {
        return new JAXBElement<GetMMGPaziente>(_GetMMGPaziente_QNAME, GetMMGPaziente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificaPresenzaDatiILECResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "notificaPresenzaDatiILECResponse")
    public JAXBElement<NotificaPresenzaDatiILECResponse> createNotificaPresenzaDatiILECResponse(NotificaPresenzaDatiILECResponse value) {
        return new JAXBElement<NotificaPresenzaDatiILECResponse>(_NotificaPresenzaDatiILECResponse_QNAME, NotificaPresenzaDatiILECResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificaRefertoScaricabileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "notificaDocumentoScaricabileResponse")
    public JAXBElement<NotificaRefertoScaricabileResponse> createNotificaDocumentoScaricabileResponse(NotificaRefertoScaricabileResponse value) {
        return new JAXBElement<NotificaRefertoScaricabileResponse>(_NotificaDocumentoScaricabileResponse_QNAME, NotificaRefertoScaricabileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvioNotifichePazientiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "invioNotifichePazientiNFResponse")
    public JAXBElement<InvioNotifichePazientiResponse> createInvioNotifichePazientiNFResponse(InvioNotifichePazientiResponse value) {
        return new JAXBElement<InvioNotifichePazientiResponse>(_InvioNotifichePazientiNFResponse_QNAME, InvioNotifichePazientiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvioNotifichePazienti }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "preparaNotifichePazientiNR")
    public JAXBElement<InvioNotifichePazienti> createPreparaNotifichePazientiNR(InvioNotifichePazienti value) {
        return new JAXBElement<InvioNotifichePazienti>(_PreparaNotifichePazientiNR_QNAME, InvioNotifichePazienti.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetInfoPaziente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "setInfoPaziente")
    public JAXBElement<SetInfoPaziente> createSetInfoPaziente(SetInfoPaziente value) {
        return new JAXBElement<SetInfoPaziente>(_SetInfoPaziente_QNAME, SetInfoPaziente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPazienteByIdIREC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "getPazienteByIdIrec")
    public JAXBElement<GetPazienteByIdIREC> createGetPazienteByIdIrec(GetPazienteByIdIREC value) {
        return new JAXBElement<GetPazienteByIdIREC>(_GetPazienteByIdIrec_QNAME, GetPazienteByIdIREC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDatiNotificaMMG }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "setDatiNotificaMMG")
    public JAXBElement<SetDatiNotificaMMG> createSetDatiNotificaMMG(SetDatiNotificaMMG value) {
        return new JAXBElement<SetDatiNotificaMMG>(_SetDatiNotificaMMG_QNAME, SetDatiNotificaMMG.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccessi2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "GetAccessi2Response")
    public JAXBElement<GetAccessi2Response> createGetAccessi2Response(GetAccessi2Response value) {
        return new JAXBElement<GetAccessi2Response>(_GetAccessi2Response_QNAME, GetAccessi2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvioNotifichePazienti }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "verificaRefertiInScadenza")
    public JAXBElement<InvioNotifichePazienti> createVerificaRefertiInScadenza(InvioNotifichePazienti value) {
        return new JAXBElement<InvioNotifichePazienti>(_VerificaRefertiInScadenza_QNAME, InvioNotifichePazienti.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoPaziente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "getInfoPaziente")
    public JAXBElement<GetInfoPaziente> createGetInfoPaziente(GetInfoPaziente value) {
        return new JAXBElement<GetInfoPaziente>(_GetInfoPaziente_QNAME, GetInfoPaziente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRiepilogoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "getRiepilogoResponse")
    public JAXBElement<GetRiepilogoResponse> createGetRiepilogoResponse(GetRiepilogoResponse value) {
        return new JAXBElement<GetRiepilogoResponse>(_GetRiepilogoResponse_QNAME, GetRiepilogoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetInfoPazienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "setInfoPazienteResponse")
    public JAXBElement<SetInfoPazienteResponse> createSetInfoPazienteResponse(SetInfoPazienteResponse value) {
        return new JAXBElement<SetInfoPazienteResponse>(_SetInfoPazienteResponse_QNAME, SetInfoPazienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoNotificaMMG }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "getDoNotificaMMG")
    public JAXBElement<GetDoNotificaMMG> createGetDoNotificaMMG(GetDoNotificaMMG value) {
        return new JAXBElement<GetDoNotificaMMG>(_GetDoNotificaMMG_QNAME, GetDoNotificaMMG.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCLDaInvocare }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "getCLDaInvocare")
    public JAXBElement<GetCLDaInvocare> createGetCLDaInvocare(GetCLDaInvocare value) {
        return new JAXBElement<GetCLDaInvocare>(_GetCLDaInvocare_QNAME, GetCLDaInvocare.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvioNotifichePazientiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmaccbl.csi.it/", name = "preparaNotifichePazientiNRResponse")
    public JAXBElement<InvioNotifichePazientiResponse> createPreparaNotifichePazientiNRResponse(InvioNotifichePazientiResponse value) {
        return new JAXBElement<InvioNotifichePazientiResponse>(_PreparaNotifichePazientiNRResponse_QNAME, InvioNotifichePazientiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Paziente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "paziente", scope = GetPazienteByIdIRECResponse.class)
    public JAXBElement<Paziente> createGetPazienteByIdIRECResponsePaziente(Paziente value) {
        return new JAXBElement<Paziente>(_GetPazienteByIdIRECResponsePaziente_QNAME, Paziente.class, GetPazienteByIdIRECResponse.class, value);
    }

}
