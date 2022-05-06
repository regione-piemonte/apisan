/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.gpr package. 
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

    private final static QName _RimborsoTypeDATAEMISSIONE_QNAME = new QName("http://csi.it", "DATA_EMISSIONE");
    private final static QName _RimborsoTypeCODICEVERSAMENTO_QNAME = new QName("http://csi.it", "CODICE_VERSAMENTO");
    private final static QName _RimborsoTypeAVVISOPAGAMENTO_QNAME = new QName("http://csi.it", "AVVISO_PAGAMENTO");
    private final static QName _RimborsoTypeNUMERORIMBORSO_QNAME = new QName("http://csi.it", "NUMERO_RIMBORSO");
    private final static QName _RimborsoTypePRATICAPAGATACONCREDITO_QNAME = new QName("http://csi.it", "PRATICA_PAGATA_CON_CREDITO");
    private final static QName _RimborsoTypeIUVMOD1_QNAME = new QName("http://csi.it", "IUV_MOD1");
    private final static QName _LMSPraticaTicketPagatiTypeMODALITARIMBORSO_QNAME = new QName("http://csi.it", "MODALITA_RIMBORSO");
    private final static QName _LMSPraticaTicketPagatiTypeIMPORTODARIMBORSARE_QNAME = new QName("http://csi.it", "IMPORTO_DA_RIMBORSARE");
    private final static QName _LMSPraticaTicketPagatiTypeIMPORTORIMBORSATO_QNAME = new QName("http://csi.it", "IMPORTO_RIMBORSATO");
    private final static QName _GetListaRimborsiGPRRequestINEROGAZIONE_QNAME = new QName("http://csi.it", "IN_EROGAZIONE");
    private final static QName _GetListaRimborsiGPRRequestMOTIVOPAGAMENTO_QNAME = new QName("http://csi.it", "MOTIVO_PAGAMENTO");
    private final static QName _GetListaRimborsiGPRRequestSTATOTICKET_QNAME = new QName("http://csi.it", "STATO_TICKET");
    private final static QName _GetListaRimborsiGPRRequestDATADAL_QNAME = new QName("http://csi.it", "DATA_DAL");
    private final static QName _GetListaRimborsiGPRRequestIDASR_QNAME = new QName("http://csi.it", "ID_ASR");
    private final static QName _GetListaRimborsiGPRRequestDATAAL_QNAME = new QName("http://csi.it", "DATA_AL");
    private final static QName _GetListaRimborsiGPRRequestCODICESERVIZIO_QNAME = new QName("http://csi.it", "CODICE_SERVIZIO");
    private final static QName _RispostaMultiIuvLISTAIUV_QNAME = new QName("http://csi.it", "LISTA_IUV");
    private final static QName _ElencoPagamentiTypeIMPORTORICEVUTA_QNAME = new QName("http://csi.it", "IMPORTO_RICEVUTA");
    private final static QName _ElencoPagamentiTypeFLAGPAGAMENTOANTICIPATO_QNAME = new QName("http://csi.it", "FLAGPAGAMENTOANTICIPATO");
    private final static QName _ElencoPagamentiTypeNUMEROSPORTELLO_QNAME = new QName("http://csi.it", "NUMERO_SPORTELLO");
    private final static QName _ElencoPagamentiTypeDATARICEVUTA_QNAME = new QName("http://csi.it", "DATA_RICEVUTA");
    private final static QName _ElencoPagamentiTypeFLAGTIPOSPESA_QNAME = new QName("http://csi.it", "FLAGTIPOSPESA");
    private final static QName _ElencoPagamentiTypeDATAEMISSIONE_QNAME = new QName("http://csi.it", "DATAEMISSIONE");
    private final static QName _ElencoPagamentiTypeTIPOSPESA_QNAME = new QName("http://csi.it", "TIPOSPESA");
    private final static QName _ElencoPagamentiTypeNUMERORICEVUTA_QNAME = new QName("http://csi.it", "NUMERO_RICEVUTA");
    private final static QName _SetModalitaErogazioneRimborsoGPRRequestIBAN_QNAME = new QName("http://csi.it", "IBAN");
    private final static QName _PrenotazioneRIMBORSOINEROGAZIONE_QNAME = new QName("http://csi.it", "RIMBORSO_IN_EROGAZIONE");
    private final static QName _PrenotazioneIBANRIMBORSO_QNAME = new QName("http://csi.it", "IBAN_RIMBORSO");
    private final static QName _ModalitaAmmissibileTypeIMPORTOMINBONIFICO_QNAME = new QName("http://csi.it", "IMPORTO_MIN_BONIFICO");
    private final static QName _GetModalitaErogazioneAmmissibiliGPRRequestDATARIFERIMENTO_QNAME = new QName("http://csi.it", "DATA_RIFERIMENTO");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.gpr
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EchoResponse }
     * 
     */
    public EchoResponse createEchoResponse() {
        return new EchoResponse();
    }

    /**
     * Create an instance of {@link AttivazioneAcquisizioneListaStatoTicket }
     * 
     */
    public AttivazioneAcquisizioneListaStatoTicket createAttivazioneAcquisizioneListaStatoTicket() {
        return new AttivazioneAcquisizioneListaStatoTicket();
    }

    /**
     * Create an instance of {@link LMSGetTicketPagatiRequest }
     * 
     */
    public LMSGetTicketPagatiRequest createLMSGetTicketPagatiRequest() {
        return new LMSGetTicketPagatiRequest();
    }

    /**
     * Create an instance of {@link LMSGetTicketPagatiRequestType }
     * 
     */
    public LMSGetTicketPagatiRequestType createLMSGetTicketPagatiRequestType() {
        return new LMSGetTicketPagatiRequestType();
    }

    /**
     * Create an instance of {@link GetModalitaErogazioneAmmissibiliGPRResponse }
     * 
     */
    public GetModalitaErogazioneAmmissibiliGPRResponse createGetModalitaErogazioneAmmissibiliGPRResponse() {
        return new GetModalitaErogazioneAmmissibiliGPRResponse();
    }

    /**
     * Create an instance of {@link ModalitaErogazioneAmmissibiliGPRResultType }
     * 
     */
    public ModalitaErogazioneAmmissibiliGPRResultType createModalitaErogazioneAmmissibiliGPRResultType() {
        return new ModalitaErogazioneAmmissibiliGPRResultType();
    }

    /**
     * Create an instance of {@link SetAssociazioneIUVTicketGPR }
     * 
     */
    public SetAssociazioneIUVTicketGPR createSetAssociazioneIUVTicketGPR() {
        return new SetAssociazioneIUVTicketGPR();
    }

    /**
     * Create an instance of {@link RichiestaAssociazioneIUVTicket }
     * 
     */
    public RichiestaAssociazioneIUVTicket createRichiestaAssociazioneIUVTicket() {
        return new RichiestaAssociazioneIUVTicket();
    }

    /**
     * Create an instance of {@link GetImportoTicketResponse }
     * 
     */
    public GetImportoTicketResponse createGetImportoTicketResponse() {
        return new GetImportoTicketResponse();
    }

    /**
     * Create an instance of {@link Importi }
     * 
     */
    public Importi createImporti() {
        return new Importi();
    }

    /**
     * Create an instance of {@link GprListaAvvisiUNP }
     * 
     */
    public GprListaAvvisiUNP createGprListaAvvisiUNP() {
        return new GprListaAvvisiUNP();
    }

    /**
     * Create an instance of {@link Avviso }
     * 
     */
    public Avviso createAvviso() {
        return new Avviso();
    }

    /**
     * Create an instance of {@link GetMultiIUVGPR }
     * 
     */
    public GetMultiIUVGPR createGetMultiIUVGPR() {
        return new GetMultiIUVGPR();
    }

    /**
     * Create an instance of {@link RichiestaMultiIuv }
     * 
     */
    public RichiestaMultiIuv createRichiestaMultiIuv() {
        return new RichiestaMultiIuv();
    }

    /**
     * Create an instance of {@link GetListaRimborsiGPR }
     * 
     */
    public GetListaRimborsiGPR createGetListaRimborsiGPR() {
        return new GetListaRimborsiGPR();
    }

    /**
     * Create an instance of {@link GetListaRimborsiGPRRequest }
     * 
     */
    public GetListaRimborsiGPRRequest createGetListaRimborsiGPRRequest() {
        return new GetListaRimborsiGPRRequest();
    }

    /**
     * Create an instance of {@link AttivazioneRecuperoMetadatiResponse }
     * 
     */
    public AttivazioneRecuperoMetadatiResponse createAttivazioneRecuperoMetadatiResponse() {
        return new AttivazioneRecuperoMetadatiResponse();
    }

    /**
     * Create an instance of {@link SetModalitaErogazioneRimborsoGPRResponse }
     * 
     */
    public SetModalitaErogazioneRimborsoGPRResponse createSetModalitaErogazioneRimborsoGPRResponse() {
        return new SetModalitaErogazioneRimborsoGPRResponse();
    }

    /**
     * Create an instance of {@link SetModalitaErogazioneRimborsoGPRResultType }
     * 
     */
    public SetModalitaErogazioneRimborsoGPRResultType createSetModalitaErogazioneRimborsoGPRResultType() {
        return new SetModalitaErogazioneRimborsoGPRResultType();
    }

    /**
     * Create an instance of {@link GetImportoTicket }
     * 
     */
    public GetImportoTicket createGetImportoTicket() {
        return new GetImportoTicket();
    }

    /**
     * Create an instance of {@link Richiesta }
     * 
     */
    public Richiesta createRichiesta() {
        return new Richiesta();
    }

    /**
     * Create an instance of {@link LMSGetTicketPagatiResponse }
     * 
     */
    public LMSGetTicketPagatiResponse createLMSGetTicketPagatiResponse() {
        return new LMSGetTicketPagatiResponse();
    }

    /**
     * Create an instance of {@link LMSGetTicketPagatiResponseType }
     * 
     */
    public LMSGetTicketPagatiResponseType createLMSGetTicketPagatiResponseType() {
        return new LMSGetTicketPagatiResponseType();
    }

    /**
     * Create an instance of {@link Errore }
     * 
     */
    public Errore createErrore() {
        return new Errore();
    }

    /**
     * Create an instance of {@link SetAvvenutoPagamentoResponse }
     * 
     */
    public SetAvvenutoPagamentoResponse createSetAvvenutoPagamentoResponse() {
        return new SetAvvenutoPagamentoResponse();
    }

    /**
     * Create an instance of {@link Quietanza }
     * 
     */
    public Quietanza createQuietanza() {
        return new Quietanza();
    }

    /**
     * Create an instance of {@link EstrazioneListaTicketMetadatiGPRResponse }
     * 
     */
    public EstrazioneListaTicketMetadatiGPRResponse createEstrazioneListaTicketMetadatiGPRResponse() {
        return new EstrazioneListaTicketMetadatiGPRResponse();
    }

    /**
     * Create an instance of {@link GetConfigLottoIUVGPRResponse }
     * 
     */
    public GetConfigLottoIUVGPRResponse createGetConfigLottoIUVGPRResponse() {
        return new GetConfigLottoIUVGPRResponse();
    }

    /**
     * Create an instance of {@link RispostaGetConfigLottoIUVGPRResponse }
     * 
     */
    public RispostaGetConfigLottoIUVGPRResponse createRispostaGetConfigLottoIUVGPRResponse() {
        return new RispostaGetConfigLottoIUVGPRResponse();
    }

    /**
     * Create an instance of {@link AttivazioneRecuperoMetadati }
     * 
     */
    public AttivazioneRecuperoMetadati createAttivazioneRecuperoMetadati() {
        return new AttivazioneRecuperoMetadati();
    }

    /**
     * Create an instance of {@link GetDatiSensibiliUtenteCentraleResponse }
     * 
     */
    public GetDatiSensibiliUtenteCentraleResponse createGetDatiSensibiliUtenteCentraleResponse() {
        return new GetDatiSensibiliUtenteCentraleResponse();
    }

    /**
     * Create an instance of {@link LMSGetRicevutaResponse }
     * 
     */
    public LMSGetRicevutaResponse createLMSGetRicevutaResponse() {
        return new LMSGetRicevutaResponse();
    }

    /**
     * Create an instance of {@link LMSGetRicevutaResponseType }
     * 
     */
    public LMSGetRicevutaResponseType createLMSGetRicevutaResponseType() {
        return new LMSGetRicevutaResponseType();
    }

    /**
     * Create an instance of {@link LMSGetRicevutaRequest }
     * 
     */
    public LMSGetRicevutaRequest createLMSGetRicevutaRequest() {
        return new LMSGetRicevutaRequest();
    }

    /**
     * Create an instance of {@link LMSGetRicevutaRequestType }
     * 
     */
    public LMSGetRicevutaRequestType createLMSGetRicevutaRequestType() {
        return new LMSGetRicevutaRequestType();
    }

    /**
     * Create an instance of {@link GetAvvisiUNPGPR }
     * 
     */
    public GetAvvisiUNPGPR createGetAvvisiUNPGPR() {
        return new GetAvvisiUNPGPR();
    }

    /**
     * Create an instance of {@link AvvisoRequest }
     * 
     */
    public AvvisoRequest createAvvisoRequest() {
        return new AvvisoRequest();
    }

    /**
     * Create an instance of {@link EstrazioneListaTicketMetadatiGPR }
     * 
     */
    public EstrazioneListaTicketMetadatiGPR createEstrazioneListaTicketMetadatiGPR() {
        return new EstrazioneListaTicketMetadatiGPR();
    }

    /**
     * Create an instance of {@link GetMultiIUVGPRResponse }
     * 
     */
    public GetMultiIUVGPRResponse createGetMultiIUVGPRResponse() {
        return new GetMultiIUVGPRResponse();
    }

    /**
     * Create an instance of {@link RispostaMultiIuv }
     * 
     */
    public RispostaMultiIuv createRispostaMultiIuv() {
        return new RispostaMultiIuv();
    }

    /**
     * Create an instance of {@link GetListaTicketCFResponse }
     * 
     */
    public GetListaTicketCFResponse createGetListaTicketCFResponse() {
        return new GetListaTicketCFResponse();
    }

    /**
     * Create an instance of {@link Echo }
     * 
     */
    public Echo createEcho() {
        return new Echo();
    }

    /**
     * Create an instance of {@link SetAssociazioneIUVTicketGPRResponse }
     * 
     */
    public SetAssociazioneIUVTicketGPRResponse createSetAssociazioneIUVTicketGPRResponse() {
        return new SetAssociazioneIUVTicketGPRResponse();
    }

    /**
     * Create an instance of {@link RispostaAssociazioneIUVTicket }
     * 
     */
    public RispostaAssociazioneIUVTicket createRispostaAssociazioneIUVTicket() {
        return new RispostaAssociazioneIUVTicket();
    }

    /**
     * Create an instance of {@link GetDatiSensibiliUtenteCentrale }
     * 
     */
    public GetDatiSensibiliUtenteCentrale createGetDatiSensibiliUtenteCentrale() {
        return new GetDatiSensibiliUtenteCentrale();
    }

    /**
     * Create an instance of {@link SetModalitaErogazioneRimborsoGPR }
     * 
     */
    public SetModalitaErogazioneRimborsoGPR createSetModalitaErogazioneRimborsoGPR() {
        return new SetModalitaErogazioneRimborsoGPR();
    }

    /**
     * Create an instance of {@link SetModalitaErogazioneRimborsoGPRRequest }
     * 
     */
    public SetModalitaErogazioneRimborsoGPRRequest createSetModalitaErogazioneRimborsoGPRRequest() {
        return new SetModalitaErogazioneRimborsoGPRRequest();
    }

    /**
     * Create an instance of {@link GetSingleIuvGPRResponse }
     * 
     */
    public GetSingleIuvGPRResponse createGetSingleIuvGPRResponse() {
        return new GetSingleIuvGPRResponse();
    }

    /**
     * Create an instance of {@link RispostaIuv }
     * 
     */
    public RispostaIuv createRispostaIuv() {
        return new RispostaIuv();
    }

    /**
     * Create an instance of {@link GetListaTicketCF }
     * 
     */
    public GetListaTicketCF createGetListaTicketCF() {
        return new GetListaTicketCF();
    }

    /**
     * Create an instance of {@link SetAvvenutoPagamento }
     * 
     */
    public SetAvvenutoPagamento createSetAvvenutoPagamento() {
        return new SetAvvenutoPagamento();
    }

    /**
     * Create an instance of {@link Pagamento }
     * 
     */
    public Pagamento createPagamento() {
        return new Pagamento();
    }

    /**
     * Create an instance of {@link DispacciaFlussoRendicontazioneRequest }
     * 
     */
    public DispacciaFlussoRendicontazioneRequest createDispacciaFlussoRendicontazioneRequest() {
        return new DispacciaFlussoRendicontazioneRequest();
    }

    /**
     * Create an instance of {@link DispacciaFlussoRendicontazioneResponse }
     * 
     */
    public DispacciaFlussoRendicontazioneResponse createDispacciaFlussoRendicontazioneResponse() {
        return new DispacciaFlussoRendicontazioneResponse();
    }

    /**
     * Create an instance of {@link DispFlRendRespResultType }
     * 
     */
    public DispFlRendRespResultType createDispFlRendRespResultType() {
        return new DispFlRendRespResultType();
    }

    /**
     * Create an instance of {@link GetListaRimborsiGPRResponse }
     * 
     */
    public GetListaRimborsiGPRResponse createGetListaRimborsiGPRResponse() {
        return new GetListaRimborsiGPRResponse();
    }

    /**
     * Create an instance of {@link ListaRimborsiGPRResultType }
     * 
     */
    public ListaRimborsiGPRResultType createListaRimborsiGPRResultType() {
        return new ListaRimborsiGPRResultType();
    }

    /**
     * Create an instance of {@link AttivazioneAcquisizioneListaStatoTicketResponse }
     * 
     */
    public AttivazioneAcquisizioneListaStatoTicketResponse createAttivazioneAcquisizioneListaStatoTicketResponse() {
        return new AttivazioneAcquisizioneListaStatoTicketResponse();
    }

    /**
     * Create an instance of {@link GetSingleIuvGPR }
     * 
     */
    public GetSingleIuvGPR createGetSingleIuvGPR() {
        return new GetSingleIuvGPR();
    }

    /**
     * Create an instance of {@link RichiestaIuv }
     * 
     */
    public RichiestaIuv createRichiestaIuv() {
        return new RichiestaIuv();
    }

    /**
     * Create an instance of {@link GetConfigLottoIUVGPR }
     * 
     */
    public GetConfigLottoIUVGPR createGetConfigLottoIUVGPR() {
        return new GetConfigLottoIUVGPR();
    }

    /**
     * Create an instance of {@link RichiestaGetConfigLottoIUV }
     * 
     */
    public RichiestaGetConfigLottoIUV createRichiestaGetConfigLottoIUV() {
        return new RichiestaGetConfigLottoIUV();
    }

    /**
     * Create an instance of {@link GetModalitaErogazioneAmmissibiliGPR }
     * 
     */
    public GetModalitaErogazioneAmmissibiliGPR createGetModalitaErogazioneAmmissibiliGPR() {
        return new GetModalitaErogazioneAmmissibiliGPR();
    }

    /**
     * Create an instance of {@link GetModalitaErogazioneAmmissibiliGPRRequest }
     * 
     */
    public GetModalitaErogazioneAmmissibiliGPRRequest createGetModalitaErogazioneAmmissibiliGPRRequest() {
        return new GetModalitaErogazioneAmmissibiliGPRRequest();
    }

    /**
     * Create an instance of {@link LMSRicevutaDettPraticaRicevutaType }
     * 
     */
    public LMSRicevutaDettPraticaRicevutaType createLMSRicevutaDettPraticaRicevutaType() {
        return new LMSRicevutaDettPraticaRicevutaType();
    }

    /**
     * Create an instance of {@link ListaModalitaErogazioneType }
     * 
     */
    public ListaModalitaErogazioneType createListaModalitaErogazioneType() {
        return new ListaModalitaErogazioneType();
    }

    /**
     * Create an instance of {@link ConfigurazioneLotti }
     * 
     */
    public ConfigurazioneLotti createConfigurazioneLotti() {
        return new ConfigurazioneLotti();
    }

    /**
     * Create an instance of {@link ArrayOfPRESTAZIONEPrestazione }
     * 
     */
    public ArrayOfPRESTAZIONEPrestazione createArrayOfPRESTAZIONEPrestazione() {
        return new ArrayOfPRESTAZIONEPrestazione();
    }

    /**
     * Create an instance of {@link LMSPraticaTicketPagatiType }
     * 
     */
    public LMSPraticaTicketPagatiType createLMSPraticaTicketPagatiType() {
        return new LMSPraticaTicketPagatiType();
    }

    /**
     * Create an instance of {@link LISTANREtype }
     * 
     */
    public LISTANREtype createLISTANREtype() {
        return new LISTANREtype();
    }

    /**
     * Create an instance of {@link Paziente }
     * 
     */
    public Paziente createPaziente() {
        return new Paziente();
    }

    /**
     * Create an instance of {@link ListaRimborsiType }
     * 
     */
    public ListaRimborsiType createListaRimborsiType() {
        return new ListaRimborsiType();
    }

    /**
     * Create an instance of {@link LMSPraticheType }
     * 
     */
    public LMSPraticheType createLMSPraticheType() {
        return new LMSPraticheType();
    }

    /**
     * Create an instance of {@link Prenotazione }
     * 
     */
    public Prenotazione createPrenotazione() {
        return new Prenotazione();
    }

    /**
     * Create an instance of {@link Prestazione }
     * 
     */
    public Prestazione createPrestazione() {
        return new Prestazione();
    }

    /**
     * Create an instance of {@link ElencoPagamentiType }
     * 
     */
    public ElencoPagamentiType createElencoPagamentiType() {
        return new ElencoPagamentiType();
    }

    /**
     * Create an instance of {@link LMSRicevutaRTDettPraticaRicevutaType }
     * 
     */
    public LMSRicevutaRTDettPraticaRicevutaType createLMSRicevutaRTDettPraticaRicevutaType() {
        return new LMSRicevutaRTDettPraticaRicevutaType();
    }

    /**
     * Create an instance of {@link ArrayOfPRATICAListaPrenotazioni }
     * 
     */
    public ArrayOfPRATICAListaPrenotazioni createArrayOfPRATICAListaPrenotazioni() {
        return new ArrayOfPRATICAListaPrenotazioni();
    }

    /**
     * Create an instance of {@link LMSAttRicRimbPraticaRicevutaType }
     * 
     */
    public LMSAttRicRimbPraticaRicevutaType createLMSAttRicRimbPraticaRicevutaType() {
        return new LMSAttRicRimbPraticaRicevutaType();
    }

    /**
     * Create an instance of {@link ListaFatturaType }
     * 
     */
    public ListaFatturaType createListaFatturaType() {
        return new ListaFatturaType();
    }

    /**
     * Create an instance of {@link LMSDettRicTelPraticaRicevutaType }
     * 
     */
    public LMSDettRicTelPraticaRicevutaType createLMSDettRicTelPraticaRicevutaType() {
        return new LMSDettRicTelPraticaRicevutaType();
    }

    /**
     * Create an instance of {@link AVVISOPAGAMENTOtype }
     * 
     */
    public AVVISOPAGAMENTOtype createAVVISOPAGAMENTOtype() {
        return new AVVISOPAGAMENTOtype();
    }

    /**
     * Create an instance of {@link LMSPraticaRicevutaType }
     * 
     */
    public LMSPraticaRicevutaType createLMSPraticaRicevutaType() {
        return new LMSPraticaRicevutaType();
    }

    /**
     * Create an instance of {@link RimborsoType }
     * 
     */
    public RimborsoType createRimborsoType() {
        return new RimborsoType();
    }

    /**
     * Create an instance of {@link LMSDettEsitiPagPraticaRicevutaType }
     * 
     */
    public LMSDettEsitiPagPraticaRicevutaType createLMSDettEsitiPagPraticaRicevutaType() {
        return new LMSDettEsitiPagPraticaRicevutaType();
    }

    /**
     * Create an instance of {@link LMSDettPraticaRicevutaType }
     * 
     */
    public LMSDettPraticaRicevutaType createLMSDettPraticaRicevutaType() {
        return new LMSDettPraticaRicevutaType();
    }

    /**
     * Create an instance of {@link ModalitaAmmissibileType }
     * 
     */
    public ModalitaAmmissibileType createModalitaAmmissibileType() {
        return new ModalitaAmmissibileType();
    }

    /**
     * Create an instance of {@link LMSRicevuteRimborsoPagamentoType }
     * 
     */
    public LMSRicevuteRimborsoPagamentoType createLMSRicevuteRimborsoPagamentoType() {
        return new LMSRicevuteRimborsoPagamentoType();
    }

    /**
     * Create an instance of {@link LMSRicevutePagamentoTicketPagatiType }
     * 
     */
    public LMSRicevutePagamentoTicketPagatiType createLMSRicevutePagamentoTicketPagatiType() {
        return new LMSRicevutePagamentoTicketPagatiType();
    }

    /**
     * Create an instance of {@link LMSRimborsiUtilizzatiType }
     * 
     */
    public LMSRimborsiUtilizzatiType createLMSRimborsiUtilizzatiType() {
        return new LMSRimborsiUtilizzatiType();
    }

    /**
     * Create an instance of {@link LMSRimborsoUtilizzatoType }
     * 
     */
    public LMSRimborsoUtilizzatoType createLMSRimborsoUtilizzatoType() {
        return new LMSRimborsoUtilizzatoType();
    }

    /**
     * Create an instance of {@link ListaPrenotazione }
     * 
     */
    public ListaPrenotazione createListaPrenotazione() {
        return new ListaPrenotazione();
    }

    /**
     * Create an instance of {@link LMSEsitoDettPraticaRicevutaType }
     * 
     */
    public LMSEsitoDettPraticaRicevutaType createLMSEsitoDettPraticaRicevutaType() {
        return new LMSEsitoDettPraticaRicevutaType();
    }

    /**
     * Create an instance of {@link Dati }
     * 
     */
    public Dati createDati() {
        return new Dati();
    }

    /**
     * Create an instance of {@link LMSRimborsoDettPraticaRicevutaType }
     * 
     */
    public LMSRimborsoDettPraticaRicevutaType createLMSRimborsoDettPraticaRicevutaType() {
        return new LMSRimborsoDettPraticaRicevutaType();
    }

    /**
     * Create an instance of {@link ListaIuv }
     * 
     */
    public ListaIuv createListaIuv() {
        return new ListaIuv();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "DATA_EMISSIONE", scope = RimborsoType.class)
    public JAXBElement<String> createRimborsoTypeDATAEMISSIONE(String value) {
        return new JAXBElement<String>(_RimborsoTypeDATAEMISSIONE_QNAME, String.class, RimborsoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "CODICE_VERSAMENTO", scope = RimborsoType.class)
    public JAXBElement<String> createRimborsoTypeCODICEVERSAMENTO(String value) {
        return new JAXBElement<String>(_RimborsoTypeCODICEVERSAMENTO_QNAME, String.class, RimborsoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AVVISOPAGAMENTOtype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "AVVISO_PAGAMENTO", scope = RimborsoType.class)
    public JAXBElement<AVVISOPAGAMENTOtype> createRimborsoTypeAVVISOPAGAMENTO(AVVISOPAGAMENTOtype value) {
        return new JAXBElement<AVVISOPAGAMENTOtype>(_RimborsoTypeAVVISOPAGAMENTO_QNAME, AVVISOPAGAMENTOtype.class, RimborsoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "NUMERO_RIMBORSO", scope = RimborsoType.class)
    public JAXBElement<String> createRimborsoTypeNUMERORIMBORSO(String value) {
        return new JAXBElement<String>(_RimborsoTypeNUMERORIMBORSO_QNAME, String.class, RimborsoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "PRATICA_PAGATA_CON_CREDITO", scope = RimborsoType.class)
    public JAXBElement<String> createRimborsoTypePRATICAPAGATACONCREDITO(String value) {
        return new JAXBElement<String>(_RimborsoTypePRATICAPAGATACONCREDITO_QNAME, String.class, RimborsoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "IUV_MOD1", scope = RimborsoType.class)
    public JAXBElement<String> createRimborsoTypeIUVMOD1(String value) {
        return new JAXBElement<String>(_RimborsoTypeIUVMOD1_QNAME, String.class, RimborsoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "MODALITA_RIMBORSO", scope = LMSPraticaTicketPagatiType.class)
    public JAXBElement<BigInteger> createLMSPraticaTicketPagatiTypeMODALITARIMBORSO(BigInteger value) {
        return new JAXBElement<BigInteger>(_LMSPraticaTicketPagatiTypeMODALITARIMBORSO_QNAME, BigInteger.class, LMSPraticaTicketPagatiType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "IMPORTO_DA_RIMBORSARE", scope = LMSPraticaTicketPagatiType.class)
    public JAXBElement<String> createLMSPraticaTicketPagatiTypeIMPORTODARIMBORSARE(String value) {
        return new JAXBElement<String>(_LMSPraticaTicketPagatiTypeIMPORTODARIMBORSARE_QNAME, String.class, LMSPraticaTicketPagatiType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "IMPORTO_RIMBORSATO", scope = LMSPraticaTicketPagatiType.class)
    public JAXBElement<String> createLMSPraticaTicketPagatiTypeIMPORTORIMBORSATO(String value) {
        return new JAXBElement<String>(_LMSPraticaTicketPagatiTypeIMPORTORIMBORSATO_QNAME, String.class, LMSPraticaTicketPagatiType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "IN_EROGAZIONE", scope = GetListaRimborsiGPRRequest.class)
    public JAXBElement<String> createGetListaRimborsiGPRRequestINEROGAZIONE(String value) {
        return new JAXBElement<String>(_GetListaRimborsiGPRRequestINEROGAZIONE_QNAME, String.class, GetListaRimborsiGPRRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "CODICE_VERSAMENTO", scope = GetListaRimborsiGPRRequest.class)
    public JAXBElement<String> createGetListaRimborsiGPRRequestCODICEVERSAMENTO(String value) {
        return new JAXBElement<String>(_RimborsoTypeCODICEVERSAMENTO_QNAME, String.class, GetListaRimborsiGPRRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "MOTIVO_PAGAMENTO", scope = GetListaRimborsiGPRRequest.class)
    public JAXBElement<String> createGetListaRimborsiGPRRequestMOTIVOPAGAMENTO(String value) {
        return new JAXBElement<String>(_GetListaRimborsiGPRRequestMOTIVOPAGAMENTO_QNAME, String.class, GetListaRimborsiGPRRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "MODALITA_RIMBORSO", scope = GetListaRimborsiGPRRequest.class)
    public JAXBElement<BigInteger> createGetListaRimborsiGPRRequestMODALITARIMBORSO(BigInteger value) {
        return new JAXBElement<BigInteger>(_LMSPraticaTicketPagatiTypeMODALITARIMBORSO_QNAME, BigInteger.class, GetListaRimborsiGPRRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "STATO_TICKET", scope = GetListaRimborsiGPRRequest.class)
    public JAXBElement<BigInteger> createGetListaRimborsiGPRRequestSTATOTICKET(BigInteger value) {
        return new JAXBElement<BigInteger>(_GetListaRimborsiGPRRequestSTATOTICKET_QNAME, BigInteger.class, GetListaRimborsiGPRRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "DATA_DAL", scope = GetListaRimborsiGPRRequest.class)
    public JAXBElement<String> createGetListaRimborsiGPRRequestDATADAL(String value) {
        return new JAXBElement<String>(_GetListaRimborsiGPRRequestDATADAL_QNAME, String.class, GetListaRimborsiGPRRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "ID_ASR", scope = GetListaRimborsiGPRRequest.class)
    public JAXBElement<String> createGetListaRimborsiGPRRequestIDASR(String value) {
        return new JAXBElement<String>(_GetListaRimborsiGPRRequestIDASR_QNAME, String.class, GetListaRimborsiGPRRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "DATA_AL", scope = GetListaRimborsiGPRRequest.class)
    public JAXBElement<String> createGetListaRimborsiGPRRequestDATAAL(String value) {
        return new JAXBElement<String>(_GetListaRimborsiGPRRequestDATAAL_QNAME, String.class, GetListaRimborsiGPRRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "CODICE_SERVIZIO", scope = GetListaRimborsiGPRRequest.class)
    public JAXBElement<String> createGetListaRimborsiGPRRequestCODICESERVIZIO(String value) {
        return new JAXBElement<String>(_GetListaRimborsiGPRRequestCODICESERVIZIO_QNAME, String.class, GetListaRimborsiGPRRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaIuv }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "LISTA_IUV", scope = RispostaMultiIuv.class)
    public JAXBElement<ListaIuv> createRispostaMultiIuvLISTAIUV(ListaIuv value) {
        return new JAXBElement<ListaIuv>(_RispostaMultiIuvLISTAIUV_QNAME, ListaIuv.class, RispostaMultiIuv.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "IMPORTO_RICEVUTA", scope = ElencoPagamentiType.class)
    public JAXBElement<String> createElencoPagamentiTypeIMPORTORICEVUTA(String value) {
        return new JAXBElement<String>(_ElencoPagamentiTypeIMPORTORICEVUTA_QNAME, String.class, ElencoPagamentiType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "FLAGPAGAMENTOANTICIPATO", scope = ElencoPagamentiType.class)
    public JAXBElement<String> createElencoPagamentiTypeFLAGPAGAMENTOANTICIPATO(String value) {
        return new JAXBElement<String>(_ElencoPagamentiTypeFLAGPAGAMENTOANTICIPATO_QNAME, String.class, ElencoPagamentiType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "NUMERO_SPORTELLO", scope = ElencoPagamentiType.class)
    public JAXBElement<String> createElencoPagamentiTypeNUMEROSPORTELLO(String value) {
        return new JAXBElement<String>(_ElencoPagamentiTypeNUMEROSPORTELLO_QNAME, String.class, ElencoPagamentiType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "DATA_RICEVUTA", scope = ElencoPagamentiType.class)
    public JAXBElement<String> createElencoPagamentiTypeDATARICEVUTA(String value) {
        return new JAXBElement<String>(_ElencoPagamentiTypeDATARICEVUTA_QNAME, String.class, ElencoPagamentiType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "FLAGTIPOSPESA", scope = ElencoPagamentiType.class)
    public JAXBElement<String> createElencoPagamentiTypeFLAGTIPOSPESA(String value) {
        return new JAXBElement<String>(_ElencoPagamentiTypeFLAGTIPOSPESA_QNAME, String.class, ElencoPagamentiType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "DATAEMISSIONE", scope = ElencoPagamentiType.class)
    public JAXBElement<String> createElencoPagamentiTypeDATAEMISSIONE(String value) {
        return new JAXBElement<String>(_ElencoPagamentiTypeDATAEMISSIONE_QNAME, String.class, ElencoPagamentiType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AVVISOPAGAMENTOtype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "AVVISO_PAGAMENTO", scope = ElencoPagamentiType.class)
    public JAXBElement<AVVISOPAGAMENTOtype> createElencoPagamentiTypeAVVISOPAGAMENTO(AVVISOPAGAMENTOtype value) {
        return new JAXBElement<AVVISOPAGAMENTOtype>(_RimborsoTypeAVVISOPAGAMENTO_QNAME, AVVISOPAGAMENTOtype.class, ElencoPagamentiType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "TIPOSPESA", scope = ElencoPagamentiType.class)
    public JAXBElement<String> createElencoPagamentiTypeTIPOSPESA(String value) {
        return new JAXBElement<String>(_ElencoPagamentiTypeTIPOSPESA_QNAME, String.class, ElencoPagamentiType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "NUMERO_RICEVUTA", scope = ElencoPagamentiType.class)
    public JAXBElement<String> createElencoPagamentiTypeNUMERORICEVUTA(String value) {
        return new JAXBElement<String>(_ElencoPagamentiTypeNUMERORICEVUTA_QNAME, String.class, ElencoPagamentiType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "IUV_MOD1", scope = ElencoPagamentiType.class)
    public JAXBElement<String> createElencoPagamentiTypeIUVMOD1(String value) {
        return new JAXBElement<String>(_RimborsoTypeIUVMOD1_QNAME, String.class, ElencoPagamentiType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "IBAN", scope = SetModalitaErogazioneRimborsoGPRRequest.class)
    public JAXBElement<String> createSetModalitaErogazioneRimborsoGPRRequestIBAN(String value) {
        return new JAXBElement<String>(_SetModalitaErogazioneRimborsoGPRRequestIBAN_QNAME, String.class, SetModalitaErogazioneRimborsoGPRRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "MODALITA_RIMBORSO", scope = Prenotazione.class)
    public JAXBElement<String> createPrenotazioneMODALITARIMBORSO(String value) {
        return new JAXBElement<String>(_LMSPraticaTicketPagatiTypeMODALITARIMBORSO_QNAME, String.class, Prenotazione.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "IMPORTO_DA_RIMBORSARE", scope = Prenotazione.class)
    public JAXBElement<String> createPrenotazioneIMPORTODARIMBORSARE(String value) {
        return new JAXBElement<String>(_LMSPraticaTicketPagatiTypeIMPORTODARIMBORSARE_QNAME, String.class, Prenotazione.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "RIMBORSO_IN_EROGAZIONE", scope = Prenotazione.class)
    public JAXBElement<String> createPrenotazioneRIMBORSOINEROGAZIONE(String value) {
        return new JAXBElement<String>(_PrenotazioneRIMBORSOINEROGAZIONE_QNAME, String.class, Prenotazione.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "IBAN_RIMBORSO", scope = Prenotazione.class)
    public JAXBElement<String> createPrenotazioneIBANRIMBORSO(String value) {
        return new JAXBElement<String>(_PrenotazioneIBANRIMBORSO_QNAME, String.class, Prenotazione.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "IMPORTO_RIMBORSATO", scope = Prenotazione.class)
    public JAXBElement<String> createPrenotazioneIMPORTORIMBORSATO(String value) {
        return new JAXBElement<String>(_LMSPraticaTicketPagatiTypeIMPORTORIMBORSATO_QNAME, String.class, Prenotazione.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "IMPORTO_MIN_BONIFICO", scope = ModalitaAmmissibileType.class)
    public JAXBElement<String> createModalitaAmmissibileTypeIMPORTOMINBONIFICO(String value) {
        return new JAXBElement<String>(_ModalitaAmmissibileTypeIMPORTOMINBONIFICO_QNAME, String.class, ModalitaAmmissibileType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "DATA_RIFERIMENTO", scope = GetModalitaErogazioneAmmissibiliGPRRequest.class)
    public JAXBElement<String> createGetModalitaErogazioneAmmissibiliGPRRequestDATARIFERIMENTO(String value) {
        return new JAXBElement<String>(_GetModalitaErogazioneAmmissibiliGPRRequestDATARIFERIMENTO_QNAME, String.class, GetModalitaErogazioneAmmissibiliGPRRequest.class, value);
    }

}
