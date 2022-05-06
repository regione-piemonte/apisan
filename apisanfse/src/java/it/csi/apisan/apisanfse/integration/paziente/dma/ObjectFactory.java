/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.paziente.dma;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import it.csi.apisan.apisanfse.integration.paziente.dmaccbl.SintesiElementoTipo;


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

    private final static QName _CodiceDocumentoDipartimentale_QNAME = new QName("http://dma.csi.it/", "codiceDocumentoDipartimentale");
    private final static QName _OscuraDocumento_QNAME = new QName("http://dma.csi.it/", "oscuraDocumento");
    private final static QName _Consenso_QNAME = new QName("http://dma.csi.it/", "consenso");
    private final static QName _TipoDati_QNAME = new QName("http://dma.csi.it/", "tipoDati");
    private final static QName _ComponenteLocale_QNAME = new QName("http://dma.csi.it/", "componenteLocale");
    private final static QName _DataFineRicerca_QNAME = new QName("http://dma.csi.it/", "dataFineRicerca");
    private final static QName _StrutturaSanitaria_QNAME = new QName("http://dma.csi.it/", "strutturaSanitaria");
    private final static QName _Paziente_QNAME = new QName("http://dma.csi.it/", "paziente");
    private final static QName _OscuraScaricoCittadino_QNAME = new QName("http://dma.csi.it/", "oscuraScaricoCittadino");
    private final static QName _Oscurato_QNAME = new QName("http://dma.csi.it/", "oscurato");
    private final static QName _FlagAbilitaInvioMailMmgFse_QNAME = new QName("http://dma.csi.it/", "flagAbilitaInvioMailMmgFse");
    private final static QName _TipoEventoNotifica_QNAME = new QName("http://dma.csi.it/", "tipoEventoNotifica");
    private final static QName _IdDocumentoIlec_QNAME = new QName("http://dma.csi.it/", "idDocumentoIlec");
    private final static QName _IdDocumento_QNAME = new QName("http://dma.csi.it/", "idDocumento");
    private final static QName _NreList_QNAME = new QName("http://dma.csi.it/", "nreList");
    private final static QName _PagatoTicket_QNAME = new QName("http://dma.csi.it/", "pagatoTicket");
    private final static QName _CodiceFiscalePaziente_QNAME = new QName("http://dma.csi.it/", "codiceFiscalePaziente");
    private final static QName _TicketPagato_QNAME = new QName("http://dma.csi.it/", "ticketPagato");
    private final static QName _Delega_QNAME = new QName("http://dma.csi.it/", "delega");
    private final static QName _Operazioni_QNAME = new QName("http://dma.csi.it/", "operazioni");
    private final static QName _Consultazione_QNAME = new QName("http://dma.csi.it/", "consultazione");
    private final static QName _Consultazioni_QNAME = new QName("http://dma.csi.it/", "consultazioni");
    private final static QName _Data_QNAME = new QName("http://dma.csi.it/", "data");
    private final static QName _IndirizzoEmailMmg_QNAME = new QName("http://dma.csi.it/", "indirizzoEmailMmg");
    private final static QName _Tipo_QNAME = new QName("http://dma.csi.it/", "tipo");
    private final static QName _Cardinalita_QNAME = new QName("http://dma.csi.it/", "cardinalita");
    private final static QName _Stato_QNAME = new QName("http://dma.csi.it/", "stato");
    private final static QName _CodFiscaleMMg_QNAME = new QName("http://dma.csi.it/", "codFiscaleMMg");
    private final static QName _TicketDaPagare_QNAME = new QName("http://dma.csi.it/", "ticketDaPagare");
    private final static QName _Id_QNAME = new QName("http://dma.csi.it/", "id");
    private final static QName _FlagScaricabile_QNAME = new QName("http://dma.csi.it/", "flagScaricabile");
    private final static QName _DataInizioRicerca_QNAME = new QName("http://dma.csi.it/", "dataInizioRicerca");
    private final static QName _FonteOscuramento_QNAME = new QName("http://dma.csi.it/", "fonteOscuramento");
    private final static QName _Richiedente_QNAME = new QName("http://dma.csi.it/", "richiedente");
    private final static QName _CodiceDipartimentaleDocumento_QNAME = new QName("http://dma.csi.it/", "codiceDipartimentaleDocumento");
    private final static QName _Nre_QNAME = new QName("http://dma.csi.it/", "nre");
    private final static QName _Codifiche_QNAME = new QName("http://dma.csi.it/", "codifiche");
    private final static QName _DataEsame_QNAME = new QName("http://dma.csi.it/", "dataEsame");
    private final static QName _ModalitaDiAlimentazione_QNAME = new QName("http://dma.csi.it/", "modalitaDiAlimentazione");
    private final static QName _ListaElencoCodiciFiscali_QNAME = new QName("http://dma.csi.it/", "listaElencoCodiciFiscali");
    private final static QName _ContattiPaziente_QNAME = new QName("http://dma.csi.it/", "contattiPaziente");
    private final static QName _Errori_QNAME = new QName("http://dma.csi.it/", "errori");
    private final static QName _TipoDocumento_QNAME = new QName("http://dma.csi.it/", "tipoDocumento");
    private final static QName _FlagAbilitaInvioMailMmg_QNAME = new QName("http://dma.csi.it/", "flagAbilitaInvioMailMmg");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.dma
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MetadatiPaziente }
     * 
     */
    public MetadatiPaziente createMetadatiPaziente() {
        return new MetadatiPaziente();
    }

    /**
     * Create an instance of {@link MetadatiPaziente.MapNotifiche }
     * 
     */
    public MetadatiPaziente.MapNotifiche createMetadatiPazienteMapNotifiche() {
        return new MetadatiPaziente.MapNotifiche();
    }

    /**
     * Create an instance of {@link StrutturaSanitaria }
     * 
     */
    public StrutturaSanitaria createStrutturaSanitaria() {
        return new StrutturaSanitaria();
    }

    /**
     * Create an instance of {@link ComponenteLocaleRispostaStato }
     * 
     */
    public ComponenteLocaleRispostaStato createComponenteLocaleRispostaStato() {
        return new ComponenteLocaleRispostaStato();
    }

    /**
     * Create an instance of {@link Consenso }
     * 
     */
    public Consenso createConsenso() {
        return new Consenso();
    }

    /**
     * Create an instance of {@link Paziente }
     * 
     */
    public Paziente createPaziente() {
        return new Paziente();
    }

    /**
     * Create an instance of {@link Richiedente }
     * 
     */
    public Richiedente createRichiedente() {
        return new Richiedente();
    }

    /**
     * Create an instance of {@link ModalitaDiAlimentazione }
     * 
     */
    public ModalitaDiAlimentazione createModalitaDiAlimentazione() {
        return new ModalitaDiAlimentazione();
    }

    /**
     * Create an instance of {@link ElencoCFAssistitoType }
     * 
     */
    public ElencoCFAssistitoType createElencoCFAssistitoType() {
        return new ElencoCFAssistitoType();
    }

    /**
     * Create an instance of {@link Codifica }
     * 
     */
    public Codifica createCodifica() {
        return new Codifica();
    }

    /**
     * Create an instance of {@link Delega }
     * 
     */
    public Delega createDelega() {
        return new Delega();
    }

    /**
     * Create an instance of {@link Errore }
     * 
     */
    public Errore createErrore() {
        return new Errore();
    }

    /**
     * Create an instance of {@link ContattiPaziente }
     * 
     */
    public ContattiPaziente createContattiPaziente() {
        return new ContattiPaziente();
    }

    /**
     * Create an instance of {@link AccessoConsultazione }
     * 
     */
    public AccessoConsultazione createAccessoConsultazione() {
        return new AccessoConsultazione();
    }

    /**
     * Create an instance of {@link AccessoOperazione }
     * 
     */
    public AccessoOperazione createAccessoOperazione() {
        return new AccessoOperazione();
    }

    /**
     * Create an instance of {@link EventoNotifica }
     * 
     */
    public EventoNotifica createEventoNotifica() {
        return new EventoNotifica();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link Indirizzo }
     * 
     */
    public Indirizzo createIndirizzo() {
        return new Indirizzo();
    }

    /**
     * Create an instance of {@link TipoFileDocumento }
     * 
     */
    public TipoFileDocumento createTipoFileDocumento() {
        return new TipoFileDocumento();
    }

    /**
     * Create an instance of {@link Disciplina }
     * 
     */
    public Disciplina createDisciplina() {
        return new Disciplina();
    }

    /**
     * Create an instance of {@link TipoEpisodio }
     * 
     */
    public TipoEpisodio createTipoEpisodio() {
        return new TipoEpisodio();
    }

    /**
     * Create an instance of {@link TipoReferto }
     * 
     */
    public TipoReferto createTipoReferto() {
        return new TipoReferto();
    }

    /**
     * Create an instance of {@link TipoAccessoConsultazione }
     * 
     */
    public TipoAccessoConsultazione createTipoAccessoConsultazione() {
        return new TipoAccessoConsultazione();
    }

    /**
     * Create an instance of {@link ApplicazioneRichiedente }
     * 
     */
    public ApplicazioneRichiedente createApplicazioneRichiedente() {
        return new ApplicazioneRichiedente();
    }

    /**
     * Create an instance of {@link ComponenteLocaleOperazione }
     * 
     */
    public ComponenteLocaleOperazione createComponenteLocaleOperazione() {
        return new ComponenteLocaleOperazione();
    }

    /**
     * Create an instance of {@link MetadatiMedicoPaziente }
     * 
     */
    public MetadatiMedicoPaziente createMetadatiMedicoPaziente() {
        return new MetadatiMedicoPaziente();
    }

    /**
     * Create an instance of {@link TipoDocumento }
     * 
     */
    public TipoDocumento createTipoDocumento() {
        return new TipoDocumento();
    }

    /**
     * Create an instance of {@link NotificaAPaziente }
     * 
     */
    public NotificaAPaziente createNotificaAPaziente() {
        return new NotificaAPaziente();
    }

    /**
     * Create an instance of {@link StudioMedico }
     * 
     */
    public StudioMedico createStudioMedico() {
        return new StudioMedico();
    }

    /**
     * Create an instance of {@link Branca }
     * 
     */
    public Branca createBranca() {
        return new Branca();
    }

    /**
     * Create an instance of {@link GruppoMisurazioni }
     * 
     */
    public GruppoMisurazioni createGruppoMisurazioni() {
        return new GruppoMisurazioni();
    }

    /**
     * Create an instance of {@link Taccuino }
     * 
     */
    public Taccuino createTaccuino() {
        return new Taccuino();
    }

    /**
     * Create an instance of {@link Profilo }
     * 
     */
    public Profilo createProfilo() {
        return new Profilo();
    }

    /**
     * Create an instance of {@link ArrayOfcodificacodifica }
     * 
     */
    public ArrayOfcodificacodifica createArrayOfcodificacodifica() {
        return new ArrayOfcodificacodifica();
    }

    /**
     * Create an instance of {@link TipoStudio }
     * 
     */
    public TipoStudio createTipoStudio() {
        return new TipoStudio();
    }

    /**
     * Create an instance of {@link CfAssistitoType }
     * 
     */
    public CfAssistitoType createCfAssistitoType() {
        return new CfAssistitoType();
    }

    /**
     * Create an instance of {@link RegimeDMA }
     * 
     */
    public RegimeDMA createRegimeDMA() {
        return new RegimeDMA();
    }

    /**
     * Create an instance of {@link NotificaDocumentoScaricabileTipo }
     * 
     */
    public NotificaDocumentoScaricabileTipo createNotificaDocumentoScaricabileTipo() {
        return new NotificaDocumentoScaricabileTipo();
    }

    /**
     * Create an instance of {@link ComponenteLocale }
     * 
     */
    public ComponenteLocale createComponenteLocale() {
        return new ComponenteLocale();
    }

    /**
     * Create an instance of {@link StatoDiNascita }
     * 
     */
    public StatoDiNascita createStatoDiNascita() {
        return new StatoDiNascita();
    }

    /**
     * Create an instance of {@link ComponenteLocaleServizio }
     * 
     */
    public ComponenteLocaleServizio createComponenteLocaleServizio() {
        return new ComponenteLocaleServizio();
    }

    /**
     * Create an instance of {@link AziendaSanitaria }
     * 
     */
    public AziendaSanitaria createAziendaSanitaria() {
        return new AziendaSanitaria();
    }

    /**
     * Create an instance of {@link UnitaOperativaSanitaria }
     * 
     */
    public UnitaOperativaSanitaria createUnitaOperativaSanitaria() {
        return new UnitaOperativaSanitaria();
    }

    /**
     * Create an instance of {@link ComuneDiNascita }
     * 
     */
    public ComuneDiNascita createComuneDiNascita() {
        return new ComuneDiNascita();
    }

    /**
     * Create an instance of {@link OrarioAperturaStudio }
     * 
     */
    public OrarioAperturaStudio createOrarioAperturaStudio() {
        return new OrarioAperturaStudio();
    }

    /**
     * Create an instance of {@link ArrayOfpazientepaziente }
     * 
     */
    public ArrayOfpazientepaziente createArrayOfpazientepaziente() {
        return new ArrayOfpazientepaziente();
    }

    /**
     * Create an instance of {@link EpisodioStato }
     * 
     */
    public EpisodioStato createEpisodioStato() {
        return new EpisodioStato();
    }

    /**
     * Create an instance of {@link PresenzaDatiILECRuolo }
     * 
     */
    public PresenzaDatiILECRuolo createPresenzaDatiILECRuolo() {
        return new PresenzaDatiILECRuolo();
    }

    /**
     * Create an instance of {@link ConsensoMatriceTipoDato }
     * 
     */
    public ConsensoMatriceTipoDato createConsensoMatriceTipoDato() {
        return new ConsensoMatriceTipoDato();
    }

    /**
     * Create an instance of {@link ValoriPrestazione }
     * 
     */
    public ValoriPrestazione createValoriPrestazione() {
        return new ValoriPrestazione();
    }

    /**
     * Create an instance of {@link TipoAccessoOperazione }
     * 
     */
    public TipoAccessoOperazione createTipoAccessoOperazione() {
        return new TipoAccessoOperazione();
    }

    /**
     * Create an instance of {@link DescrittoreMisurazione }
     * 
     */
    public DescrittoreMisurazione createDescrittoreMisurazione() {
        return new DescrittoreMisurazione();
    }

    /**
     * Create an instance of {@link ConsensoMatriceRuolo }
     * 
     */
    public ConsensoMatriceRuolo createConsensoMatriceRuolo() {
        return new ConsensoMatriceRuolo();
    }

    /**
     * Create an instance of {@link RuoloDMA }
     * 
     */
    public RuoloDMA createRuoloDMA() {
        return new RuoloDMA();
    }

    /**
     * Create an instance of {@link RiepilogoPaziente }
     * 
     */
    public RiepilogoPaziente createRiepilogoPaziente() {
        return new RiepilogoPaziente();
    }

    /**
     * Create an instance of {@link ComponenteLocaleTipo }
     * 
     */
    public ComponenteLocaleTipo createComponenteLocaleTipo() {
        return new ComponenteLocaleTipo();
    }

    /**
     * Create an instance of {@link Prestazione }
     * 
     */
    public Prestazione createPrestazione() {
        return new Prestazione();
    }

    /**
     * Create an instance of {@link ComponenteLocaleRisposta }
     * 
     */
    public ComponenteLocaleRisposta createComponenteLocaleRisposta() {
        return new ComponenteLocaleRisposta();
    }

    /**
     * Create an instance of {@link Ruolo }
     * 
     */
    public Ruolo createRuolo() {
        return new Ruolo();
    }

    /**
     * Create an instance of {@link ApplicativoVerticale }
     * 
     */
    public ApplicativoVerticale createApplicativoVerticale() {
        return new ApplicativoVerticale();
    }

    /**
     * Create an instance of {@link Medico }
     * 
     */
    public Medico createMedico() {
        return new Medico();
    }

    /**
     * Create an instance of {@link CanaleNotifica }
     * 
     */
    public CanaleNotifica createCanaleNotifica() {
        return new CanaleNotifica();
    }

    /**
     * Create an instance of {@link RichiedenteInfo }
     * 
     */
    public RichiedenteInfo createRichiedenteInfo() {
        return new RichiedenteInfo();
    }

    /**
     * Create an instance of {@link GiornoAperturaStudio }
     * 
     */
    public GiornoAperturaStudio createGiornoAperturaStudio() {
        return new GiornoAperturaStudio();
    }

    /**
     * Create an instance of {@link MetadatiPaziente.MapNotifiche.Entry }
     * 
     */
    public MetadatiPaziente.MapNotifiche.Entry createMetadatiPazienteMapNotificheEntry() {
        return new MetadatiPaziente.MapNotifiche.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "codiceDocumentoDipartimentale")
    public JAXBElement<String> createCodiceDocumentoDipartimentale(String value) {
        return new JAXBElement<String>(_CodiceDocumentoDipartimentale_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "oscuraDocumento")
    public JAXBElement<String> createOscuraDocumento(String value) {
        return new JAXBElement<String>(_OscuraDocumento_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Consenso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "consenso")
    public JAXBElement<Consenso> createConsenso(Consenso value) {
        return new JAXBElement<Consenso>(_Consenso_QNAME, Consenso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "tipoDati")
    public JAXBElement<String> createTipoDati(String value) {
        return new JAXBElement<String>(_TipoDati_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "componenteLocale")
    public JAXBElement<Object> createComponenteLocale(Object value) {
        return new JAXBElement<Object>(_ComponenteLocale_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "dataFineRicerca")
    public JAXBElement<XMLGregorianCalendar> createDataFineRicerca(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataFineRicerca_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrutturaSanitaria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "strutturaSanitaria")
    public JAXBElement<StrutturaSanitaria> createStrutturaSanitaria(StrutturaSanitaria value) {
        return new JAXBElement<StrutturaSanitaria>(_StrutturaSanitaria_QNAME, StrutturaSanitaria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Paziente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "paziente")
    public JAXBElement<Paziente> createPaziente(Paziente value) {
        return new JAXBElement<Paziente>(_Paziente_QNAME, Paziente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "oscuraScaricoCittadino")
    public JAXBElement<String> createOscuraScaricoCittadino(String value) {
        return new JAXBElement<String>(_OscuraScaricoCittadino_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "oscurato")
    public JAXBElement<String> createOscurato(String value) {
        return new JAXBElement<String>(_Oscurato_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiNo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "flagAbilitaInvioMailMmgFse")
    public JAXBElement<SiNo> createFlagAbilitaInvioMailMmgFse(SiNo value) {
        return new JAXBElement<SiNo>(_FlagAbilitaInvioMailMmgFse_QNAME, SiNo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventoNotificaTipoCodice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "tipoEventoNotifica")
    public JAXBElement<EventoNotificaTipoCodice> createTipoEventoNotifica(EventoNotificaTipoCodice value) {
        return new JAXBElement<EventoNotificaTipoCodice>(_TipoEventoNotifica_QNAME, EventoNotificaTipoCodice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "idDocumentoIlec")
    public JAXBElement<Long> createIdDocumentoIlec(Long value) {
        return new JAXBElement<Long>(_IdDocumentoIlec_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "idDocumento")
    public JAXBElement<Long> createIdDocumento(Long value) {
        return new JAXBElement<Long>(_IdDocumento_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "nreList")
    public JAXBElement<String> createNreList(String value) {
        return new JAXBElement<String>(_NreList_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "pagatoTicket")
    public JAXBElement<String> createPagatoTicket(String value) {
        return new JAXBElement<String>(_PagatoTicket_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "codiceFiscalePaziente")
    public JAXBElement<String> createCodiceFiscalePaziente(String value) {
        return new JAXBElement<String>(_CodiceFiscalePaziente_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "ticketPagato")
    public JAXBElement<Float> createTicketPagato(Float value) {
        return new JAXBElement<Float>(_TicketPagato_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "delega")
    public JAXBElement<Delega> createDelega(Delega value) {
        return new JAXBElement<Delega>(_Delega_QNAME, Delega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessoOperazione }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "operazioni")
    public JAXBElement<AccessoOperazione> createOperazioni(AccessoOperazione value) {
        return new JAXBElement<AccessoOperazione>(_Operazioni_QNAME, AccessoOperazione.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "consultazione")
    public JAXBElement<String> createConsultazione(String value) {
        return new JAXBElement<String>(_Consultazione_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessoConsultazione }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "consultazioni")
    public JAXBElement<AccessoConsultazione> createConsultazioni(AccessoConsultazione value) {
        return new JAXBElement<AccessoConsultazione>(_Consultazioni_QNAME, AccessoConsultazione.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "data")
    public JAXBElement<XMLGregorianCalendar> createData(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_Data_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "indirizzoEmailMmg")
    public JAXBElement<String> createIndirizzoEmailMmg(String value) {
        return new JAXBElement<String>(_IndirizzoEmailMmg_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SintesiElementoTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "tipo")
    public JAXBElement<SintesiElementoTipo> createTipo(SintesiElementoTipo value) {
        return new JAXBElement<SintesiElementoTipo>(_Tipo_QNAME, SintesiElementoTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "cardinalita")
    public JAXBElement<Integer> createCardinalita(Integer value) {
        return new JAXBElement<Integer>(_Cardinalita_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComponenteLocaleRispostaStato }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "stato")
    public JAXBElement<ComponenteLocaleRispostaStato> createStato(ComponenteLocaleRispostaStato value) {
        return new JAXBElement<ComponenteLocaleRispostaStato>(_Stato_QNAME, ComponenteLocaleRispostaStato.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "codFiscaleMMg")
    public JAXBElement<String> createCodFiscaleMMg(String value) {
        return new JAXBElement<String>(_CodFiscaleMMg_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "ticketDaPagare")
    public JAXBElement<Float> createTicketDaPagare(Float value) {
        return new JAXBElement<Float>(_TicketDaPagare_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "id")
    public JAXBElement<String> createId(String value) {
        return new JAXBElement<String>(_Id_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "flagScaricabile")
    public JAXBElement<String> createFlagScaricabile(String value) {
        return new JAXBElement<String>(_FlagScaricabile_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "dataInizioRicerca")
    public JAXBElement<XMLGregorianCalendar> createDataInizioRicerca(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataInizioRicerca_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "fonteOscuramento")
    public JAXBElement<String> createFonteOscuramento(String value) {
        return new JAXBElement<String>(_FonteOscuramento_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Richiedente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "richiedente")
    public JAXBElement<Richiedente> createRichiedente(Richiedente value) {
        return new JAXBElement<Richiedente>(_Richiedente_QNAME, Richiedente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "codiceDipartimentaleDocumento")
    public JAXBElement<String> createCodiceDipartimentaleDocumento(String value) {
        return new JAXBElement<String>(_CodiceDipartimentaleDocumento_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "nre")
    public JAXBElement<String> createNre(String value) {
        return new JAXBElement<String>(_Nre_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Codifica }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "codifiche")
    public JAXBElement<Codifica> createCodifiche(Codifica value) {
        return new JAXBElement<Codifica>(_Codifiche_QNAME, Codifica.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "dataEsame")
    public JAXBElement<XMLGregorianCalendar> createDataEsame(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataEsame_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModalitaDiAlimentazione }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "modalitaDiAlimentazione")
    public JAXBElement<ModalitaDiAlimentazione> createModalitaDiAlimentazione(ModalitaDiAlimentazione value) {
        return new JAXBElement<ModalitaDiAlimentazione>(_ModalitaDiAlimentazione_QNAME, ModalitaDiAlimentazione.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElencoCFAssistitoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "listaElencoCodiciFiscali")
    public JAXBElement<ElencoCFAssistitoType> createListaElencoCodiciFiscali(ElencoCFAssistitoType value) {
        return new JAXBElement<ElencoCFAssistitoType>(_ListaElencoCodiciFiscali_QNAME, ElencoCFAssistitoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContattiPaziente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "contattiPaziente")
    public JAXBElement<ContattiPaziente> createContattiPaziente(ContattiPaziente value) {
        return new JAXBElement<ContattiPaziente>(_ContattiPaziente_QNAME, ContattiPaziente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Errore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "errori")
    public JAXBElement<Errore> createErrori(Errore value) {
        return new JAXBElement<Errore>(_Errori_QNAME, Errore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "tipoDocumento")
    public JAXBElement<String> createTipoDocumento(String value) {
        return new JAXBElement<String>(_TipoDocumento_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiNo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "flagAbilitaInvioMailMmg")
    public JAXBElement<SiNo> createFlagAbilitaInvioMailMmg(SiNo value) {
        return new JAXBElement<SiNo>(_FlagAbilitaInvioMailMmg_QNAME, SiNo.class, null, value);
    }

}
