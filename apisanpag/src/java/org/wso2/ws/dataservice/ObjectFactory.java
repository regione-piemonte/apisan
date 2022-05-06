/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package org.wso2.ws.dataservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.wso2.ws.dataservice package. 
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

    private final static QName _LISTAMETADATITICKET_QNAME = new QName("http://ws.wso2.org/dataservice", "LISTA_METADATI_TICKET");
    private final static QName _PAZIENTE_QNAME = new QName("http://ws.wso2.org/dataservice", "PAZIENTE");
    private final static QName _RecuperoListaTicketMetadatiResult_QNAME = new QName("http://ws.wso2.org/dataservice", "RecuperoListaTicketMetadatiResult");
    private final static QName _GetDatiSensibiliUtenteAziendaleResult_QNAME = new QName("http://ws.wso2.org/dataservice", "GetDatiSensibiliUtenteAziendaleResult");
    private final static QName _ERRORE_QNAME = new QName("http://ws.wso2.org/dataservice", "ERRORE");
    private final static QName _Risposta_QNAME = new QName("http://ws.wso2.org/dataservice", "risposta");
    private final static QName _PRENOTAZIONE_QNAME = new QName("http://ws.wso2.org/dataservice", "PRENOTAZIONE");
    private final static QName _CONFIGURAZIONELOTTI_QNAME = new QName("http://ws.wso2.org/dataservice", "CONFIGURAZIONE_LOTTI");
    private final static QName _ELENCOPAGAMENTI_QNAME = new QName("http://ws.wso2.org/dataservice", "ELENCO_PAGAMENTI");
    private final static QName _LISTAFATTURA_QNAME = new QName("http://ws.wso2.org/dataservice", "LISTA_FATTURA");
    private final static QName _LISTAPRENOTAZIONE_QNAME = new QName("http://ws.wso2.org/dataservice", "LISTA_PRENOTAZIONE");
    private final static QName _REQUESTSTATUS_QNAME = new QName("http://ws.wso2.org/dataservice", "REQUEST_STATUS");
    private final static QName _ELENCOPRESTAZIONI_QNAME = new QName("http://ws.wso2.org/dataservice", "ELENCO_PRESTAZIONI");
    private final static QName _EstrazioneListaTicketMetadatiResult_QNAME = new QName("http://ws.wso2.org/dataservice", "EstrazioneListaTicketMetadatiResult");
    private final static QName _DataServiceFault_QNAME = new QName("http://ws.wso2.org/dataservice", "DataServiceFault");
    private final static QName _PRATICA_QNAME = new QName("http://ws.wso2.org/dataservice", "PRATICA");
    private final static QName _GprListaDescrizioneStrutturaByNREResult_QNAME = new QName("http://ws.wso2.org/dataservice", "GprListaDescrizioneStrutturaByNREResult");
    private final static QName _GprRichiestaLottoIUVMultiResponse_QNAME = new QName("http://ws.wso2.org/dataservice", "GprRichiestaLottoIUVMultiResponse");
    private final static QName _PRESTAZIONE_QNAME = new QName("http://ws.wso2.org/dataservice", "PRESTAZIONE");
    private final static QName _GprEndpointPerGetListaFlussiFRDaInviareGPAResult_QNAME = new QName("http://ws.wso2.org/dataservice", "GprEndpointPerGetListaFlussiFRDaInviareGPAResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.wso2.ws.dataservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GprGetConfigLottoIUVCodiceAsrCodiceVersamento }
     * 
     */
    public GprGetConfigLottoIUVCodiceAsrCodiceVersamento createGprGetConfigLottoIUVCodiceAsrCodiceVersamento() {
        return new GprGetConfigLottoIUVCodiceAsrCodiceVersamento();
    }

    /**
     * Create an instance of {@link GprRecuperoListaTicketMetadatiUpdate }
     * 
     */
    public GprRecuperoListaTicketMetadatiUpdate createGprRecuperoListaTicketMetadatiUpdate() {
        return new GprRecuperoListaTicketMetadatiUpdate();
    }

    /**
     * Create an instance of {@link PRESTAZIONE }
     * 
     */
    public PRESTAZIONE createPRESTAZIONE() {
        return new PRESTAZIONE();
    }

    /**
     * Create an instance of {@link GprListaDescrizioneStrutturaByNRE }
     * 
     */
    public GprListaDescrizioneStrutturaByNRE createGprListaDescrizioneStrutturaByNRE() {
        return new GprListaDescrizioneStrutturaByNRE();
    }

    /**
     * Create an instance of {@link GprListaDescrizioneStrutturaByNREResult }
     * 
     */
    public GprListaDescrizioneStrutturaByNREResult createGprListaDescrizioneStrutturaByNREResult() {
        return new GprListaDescrizioneStrutturaByNREResult();
    }

    /**
     * Create an instance of {@link GprRichiestaLottoIUVMultiResponse }
     * 
     */
    public GprRichiestaLottoIUVMultiResponse createGprRichiestaLottoIUVMultiResponse() {
        return new GprRichiestaLottoIUVMultiResponse();
    }

    /**
     * Create an instance of {@link GprListaAvvisiUNP }
     * 
     */
    public GprListaAvvisiUNP createGprListaAvvisiUNP() {
        return new GprListaAvvisiUNP();
    }

    /**
     * Create an instance of {@link PRATICA }
     * 
     */
    public PRATICA createPRATICA() {
        return new PRATICA();
    }

    /**
     * Create an instance of {@link GprGetConfigLottoIUV }
     * 
     */
    public GprGetConfigLottoIUV createGprGetConfigLottoIUV() {
        return new GprGetConfigLottoIUV();
    }

    /**
     * Create an instance of {@link GprEndpointPerGetDatiSensibiliUtenteCentrale }
     * 
     */
    public GprEndpointPerGetDatiSensibiliUtenteCentrale createGprEndpointPerGetDatiSensibiliUtenteCentrale() {
        return new GprEndpointPerGetDatiSensibiliUtenteCentrale();
    }

    /**
     * Create an instance of {@link GprEstrazioneListaTicketMetadatiGPA }
     * 
     */
    public GprEstrazioneListaTicketMetadatiGPA createGprEstrazioneListaTicketMetadatiGPA() {
        return new GprEstrazioneListaTicketMetadatiGPA();
    }

    /**
     * Create an instance of {@link GprEndpointPerGetListaFlussiFRDaInviareGPA }
     * 
     */
    public GprEndpointPerGetListaFlussiFRDaInviareGPA createGprEndpointPerGetListaFlussiFRDaInviareGPA() {
        return new GprEndpointPerGetListaFlussiFRDaInviareGPA();
    }

    /**
     * Create an instance of {@link ELENCOPAGAMENTI }
     * 
     */
    public ELENCOPAGAMENTI createELENCOPAGAMENTI() {
        return new ELENCOPAGAMENTI();
    }

    /**
     * Create an instance of {@link PRENOTAZIONE }
     * 
     */
    public PRENOTAZIONE createPRENOTAZIONE() {
        return new PRENOTAZIONE();
    }

    /**
     * Create an instance of {@link CONFIGURAZIONELOTTI }
     * 
     */
    public CONFIGURAZIONELOTTI createCONFIGURAZIONELOTTI() {
        return new CONFIGURAZIONELOTTI();
    }

    /**
     * Create an instance of {@link RecuperoListaTicketMetadatiResult }
     * 
     */
    public RecuperoListaTicketMetadatiResult createRecuperoListaTicketMetadatiResult() {
        return new RecuperoListaTicketMetadatiResult();
    }

    /**
     * Create an instance of {@link GprEstrazioneListaTicketMetadatiGPAListaFatturaNested }
     * 
     */
    public GprEstrazioneListaTicketMetadatiGPAListaFatturaNested createGprEstrazioneListaTicketMetadatiGPAListaFatturaNested() {
        return new GprEstrazioneListaTicketMetadatiGPAListaFatturaNested();
    }

    /**
     * Create an instance of {@link GprEndpointPerAttivazioneRecuperoMetadati }
     * 
     */
    public GprEndpointPerAttivazioneRecuperoMetadati createGprEndpointPerAttivazioneRecuperoMetadati() {
        return new GprEndpointPerAttivazioneRecuperoMetadati();
    }

    /**
     * Create an instance of {@link GprEstrazioneListaTicketMetadatiGPAupdate }
     * 
     */
    public GprEstrazioneListaTicketMetadatiGPAupdate createGprEstrazioneListaTicketMetadatiGPAupdate() {
        return new GprEstrazioneListaTicketMetadatiGPAupdate();
    }

    /**
     * Create an instance of {@link GprRichiestaLottoIUVMulti }
     * 
     */
    public GprRichiestaLottoIUVMulti createGprRichiestaLottoIUVMulti() {
        return new GprRichiestaLottoIUVMulti();
    }

    /**
     * Create an instance of {@link DATASERVICERESPONSE }
     * 
     */
    public DATASERVICERESPONSE createDATASERVICERESPONSE() {
        return new DATASERVICERESPONSE();
    }

    /**
     * Create an instance of {@link GprEndpointPerGetListaFlussiFRDaInviareGPAResult }
     * 
     */
    public GprEndpointPerGetListaFlussiFRDaInviareGPAResult createGprEndpointPerGetListaFlussiFRDaInviareGPAResult() {
        return new GprEndpointPerGetListaFlussiFRDaInviareGPAResult();
    }

    /**
     * Create an instance of {@link GprEndpointPerGetListaTicketCF }
     * 
     */
    public GprEndpointPerGetListaTicketCF createGprEndpointPerGetListaTicketCF() {
        return new GprEndpointPerGetListaTicketCF();
    }

    /**
     * Create an instance of {@link ELENCOPRESTAZIONI }
     * 
     */
    public ELENCOPRESTAZIONI createELENCOPRESTAZIONI() {
        return new ELENCOPRESTAZIONI();
    }

    /**
     * Create an instance of {@link EstrazioneListaTicketMetadatiResult }
     * 
     */
    public EstrazioneListaTicketMetadatiResult createEstrazioneListaTicketMetadatiResult() {
        return new EstrazioneListaTicketMetadatiResult();
    }

    /**
     * Create an instance of {@link GprGetDatiSensibiliUtenteAziendale }
     * 
     */
    public GprGetDatiSensibiliUtenteAziendale createGprGetDatiSensibiliUtenteAziendale() {
        return new GprGetDatiSensibiliUtenteAziendale();
    }

    /**
     * Create an instance of {@link GprRecuperoListaTicketMetadati }
     * 
     */
    public GprRecuperoListaTicketMetadati createGprRecuperoListaTicketMetadati() {
        return new GprRecuperoListaTicketMetadati();
    }

    /**
     * Create an instance of {@link LISTAFATTURA }
     * 
     */
    public LISTAFATTURA createLISTAFATTURA() {
        return new LISTAFATTURA();
    }

    /**
     * Create an instance of {@link LISTAPRENOTAZIONE }
     * 
     */
    public LISTAPRENOTAZIONE createLISTAPRENOTAZIONE() {
        return new LISTAPRENOTAZIONE();
    }

    /**
     * Create an instance of {@link GprEstrazioneListaTicketMetadatiGPANested }
     * 
     */
    public GprEstrazioneListaTicketMetadatiGPANested createGprEstrazioneListaTicketMetadatiGPANested() {
        return new GprEstrazioneListaTicketMetadatiGPANested();
    }

    /**
     * Create an instance of {@link GprGetConfigLottoIUVCodiceAsr }
     * 
     */
    public GprGetConfigLottoIUVCodiceAsr createGprGetConfigLottoIUVCodiceAsr() {
        return new GprGetConfigLottoIUVCodiceAsr();
    }

    /**
     * Create an instance of {@link GetDatiSensibiliUtenteAziendaleResult }
     * 
     */
    public GetDatiSensibiliUtenteAziendaleResult createGetDatiSensibiliUtenteAziendaleResult() {
        return new GetDatiSensibiliUtenteAziendaleResult();
    }

    /**
     * Create an instance of {@link ERRORE }
     * 
     */
    public ERRORE createERRORE() {
        return new ERRORE();
    }

    /**
     * Create an instance of {@link Risposta }
     * 
     */
    public Risposta createRisposta() {
        return new Risposta();
    }

    /**
     * Create an instance of {@link GprEndpointPerEstrazioneTicketMetadatiGPR }
     * 
     */
    public GprEndpointPerEstrazioneTicketMetadatiGPR createGprEndpointPerEstrazioneTicketMetadatiGPR() {
        return new GprEndpointPerEstrazioneTicketMetadatiGPR();
    }

    /**
     * Create an instance of {@link PAZIENTE }
     * 
     */
    public PAZIENTE createPAZIENTE() {
        return new PAZIENTE();
    }

    /**
     * Create an instance of {@link GprEndpointPerAttivazioneAcquisizioneListaStatoTicket }
     * 
     */
    public GprEndpointPerAttivazioneAcquisizioneListaStatoTicket createGprEndpointPerAttivazioneAcquisizioneListaStatoTicket() {
        return new GprEndpointPerAttivazioneAcquisizioneListaStatoTicket();
    }

    /**
     * Create an instance of {@link GprInsertLogMessage }
     * 
     */
    public GprInsertLogMessage createGprInsertLogMessage() {
        return new GprInsertLogMessage();
    }

    /**
     * Create an instance of {@link GprListaRELByCF }
     * 
     */
    public GprListaRELByCF createGprListaRELByCF() {
        return new GprListaRELByCF();
    }

    /**
     * Create an instance of {@link LISTAMETADATITICKET }
     * 
     */
    public LISTAMETADATITICKET createLISTAMETADATITICKET() {
        return new LISTAMETADATITICKET();
    }

    /**
     * Create an instance of {@link LOTTOIUV }
     * 
     */
    public LOTTOIUV createLOTTOIUV() {
        return new LOTTOIUV();
    }

    /**
     * Create an instance of {@link FLUSSO }
     * 
     */
    public FLUSSO createFLUSSO() {
        return new FLUSSO();
    }

    /**
     * Create an instance of {@link NREDESCRIZIONE }
     * 
     */
    public NREDESCRIZIONE createNREDESCRIZIONE() {
        return new NREDESCRIZIONE();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTAMETADATITICKET }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wso2.org/dataservice", name = "LISTA_METADATI_TICKET")
    public JAXBElement<LISTAMETADATITICKET> createLISTAMETADATITICKET(LISTAMETADATITICKET value) {
        return new JAXBElement<LISTAMETADATITICKET>(_LISTAMETADATITICKET_QNAME, LISTAMETADATITICKET.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PAZIENTE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wso2.org/dataservice", name = "PAZIENTE")
    public JAXBElement<PAZIENTE> createPAZIENTE(PAZIENTE value) {
        return new JAXBElement<PAZIENTE>(_PAZIENTE_QNAME, PAZIENTE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperoListaTicketMetadatiResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wso2.org/dataservice", name = "RecuperoListaTicketMetadatiResult")
    public JAXBElement<RecuperoListaTicketMetadatiResult> createRecuperoListaTicketMetadatiResult(RecuperoListaTicketMetadatiResult value) {
        return new JAXBElement<RecuperoListaTicketMetadatiResult>(_RecuperoListaTicketMetadatiResult_QNAME, RecuperoListaTicketMetadatiResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDatiSensibiliUtenteAziendaleResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wso2.org/dataservice", name = "GetDatiSensibiliUtenteAziendaleResult")
    public JAXBElement<GetDatiSensibiliUtenteAziendaleResult> createGetDatiSensibiliUtenteAziendaleResult(GetDatiSensibiliUtenteAziendaleResult value) {
        return new JAXBElement<GetDatiSensibiliUtenteAziendaleResult>(_GetDatiSensibiliUtenteAziendaleResult_QNAME, GetDatiSensibiliUtenteAziendaleResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ERRORE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wso2.org/dataservice", name = "ERRORE")
    public JAXBElement<ERRORE> createERRORE(ERRORE value) {
        return new JAXBElement<ERRORE>(_ERRORE_QNAME, ERRORE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Risposta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wso2.org/dataservice", name = "risposta")
    public JAXBElement<Risposta> createRisposta(Risposta value) {
        return new JAXBElement<Risposta>(_Risposta_QNAME, Risposta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRENOTAZIONE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wso2.org/dataservice", name = "PRENOTAZIONE")
    public JAXBElement<PRENOTAZIONE> createPRENOTAZIONE(PRENOTAZIONE value) {
        return new JAXBElement<PRENOTAZIONE>(_PRENOTAZIONE_QNAME, PRENOTAZIONE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CONFIGURAZIONELOTTI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wso2.org/dataservice", name = "CONFIGURAZIONE_LOTTI")
    public JAXBElement<CONFIGURAZIONELOTTI> createCONFIGURAZIONELOTTI(CONFIGURAZIONELOTTI value) {
        return new JAXBElement<CONFIGURAZIONELOTTI>(_CONFIGURAZIONELOTTI_QNAME, CONFIGURAZIONELOTTI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ELENCOPAGAMENTI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wso2.org/dataservice", name = "ELENCO_PAGAMENTI")
    public JAXBElement<ELENCOPAGAMENTI> createELENCOPAGAMENTI(ELENCOPAGAMENTI value) {
        return new JAXBElement<ELENCOPAGAMENTI>(_ELENCOPAGAMENTI_QNAME, ELENCOPAGAMENTI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTAFATTURA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wso2.org/dataservice", name = "LISTA_FATTURA")
    public JAXBElement<LISTAFATTURA> createLISTAFATTURA(LISTAFATTURA value) {
        return new JAXBElement<LISTAFATTURA>(_LISTAFATTURA_QNAME, LISTAFATTURA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTAPRENOTAZIONE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wso2.org/dataservice", name = "LISTA_PRENOTAZIONE")
    public JAXBElement<LISTAPRENOTAZIONE> createLISTAPRENOTAZIONE(LISTAPRENOTAZIONE value) {
        return new JAXBElement<LISTAPRENOTAZIONE>(_LISTAPRENOTAZIONE_QNAME, LISTAPRENOTAZIONE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wso2.org/dataservice", name = "REQUEST_STATUS")
    public JAXBElement<String> createREQUESTSTATUS(String value) {
        return new JAXBElement<String>(_REQUESTSTATUS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ELENCOPRESTAZIONI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wso2.org/dataservice", name = "ELENCO_PRESTAZIONI")
    public JAXBElement<ELENCOPRESTAZIONI> createELENCOPRESTAZIONI(ELENCOPRESTAZIONI value) {
        return new JAXBElement<ELENCOPRESTAZIONI>(_ELENCOPRESTAZIONI_QNAME, ELENCOPRESTAZIONI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstrazioneListaTicketMetadatiResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wso2.org/dataservice", name = "EstrazioneListaTicketMetadatiResult")
    public JAXBElement<EstrazioneListaTicketMetadatiResult> createEstrazioneListaTicketMetadatiResult(EstrazioneListaTicketMetadatiResult value) {
        return new JAXBElement<EstrazioneListaTicketMetadatiResult>(_EstrazioneListaTicketMetadatiResult_QNAME, EstrazioneListaTicketMetadatiResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wso2.org/dataservice", name = "DataServiceFault")
    public JAXBElement<String> createDataServiceFault(String value) {
        return new JAXBElement<String>(_DataServiceFault_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRATICA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wso2.org/dataservice", name = "PRATICA")
    public JAXBElement<PRATICA> createPRATICA(PRATICA value) {
        return new JAXBElement<PRATICA>(_PRATICA_QNAME, PRATICA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GprListaDescrizioneStrutturaByNREResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wso2.org/dataservice", name = "GprListaDescrizioneStrutturaByNREResult")
    public JAXBElement<GprListaDescrizioneStrutturaByNREResult> createGprListaDescrizioneStrutturaByNREResult(GprListaDescrizioneStrutturaByNREResult value) {
        return new JAXBElement<GprListaDescrizioneStrutturaByNREResult>(_GprListaDescrizioneStrutturaByNREResult_QNAME, GprListaDescrizioneStrutturaByNREResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GprRichiestaLottoIUVMultiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wso2.org/dataservice", name = "GprRichiestaLottoIUVMultiResponse")
    public JAXBElement<GprRichiestaLottoIUVMultiResponse> createGprRichiestaLottoIUVMultiResponse(GprRichiestaLottoIUVMultiResponse value) {
        return new JAXBElement<GprRichiestaLottoIUVMultiResponse>(_GprRichiestaLottoIUVMultiResponse_QNAME, GprRichiestaLottoIUVMultiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRESTAZIONE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wso2.org/dataservice", name = "PRESTAZIONE")
    public JAXBElement<PRESTAZIONE> createPRESTAZIONE(PRESTAZIONE value) {
        return new JAXBElement<PRESTAZIONE>(_PRESTAZIONE_QNAME, PRESTAZIONE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GprEndpointPerGetListaFlussiFRDaInviareGPAResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wso2.org/dataservice", name = "GprEndpointPerGetListaFlussiFRDaInviareGPAResult")
    public JAXBElement<GprEndpointPerGetListaFlussiFRDaInviareGPAResult> createGprEndpointPerGetListaFlussiFRDaInviareGPAResult(GprEndpointPerGetListaFlussiFRDaInviareGPAResult value) {
        return new JAXBElement<GprEndpointPerGetListaFlussiFRDaInviareGPAResult>(_GprEndpointPerGetListaFlussiFRDaInviareGPAResult_QNAME, GprEndpointPerGetListaFlussiFRDaInviareGPAResult.class, null, value);
    }

}
