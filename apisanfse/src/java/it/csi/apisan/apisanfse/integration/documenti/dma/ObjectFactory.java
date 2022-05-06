/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documenti.dma;

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

    private final static QName _LinkImmagini_QNAME = new QName("http://dma.csi.it/", "linkImmagini");
    private final static QName _AccessionNumber_QNAME = new QName("http://dma.csi.it/", "accessionNumber");
    private final static QName _Consenso_QNAME = new QName("http://dma.csi.it/", "consenso");
    private final static QName _Criptato_QNAME = new QName("http://dma.csi.it/", "criptato");
    private final static QName _ElementiElaborati_QNAME = new QName("http://dma.csi.it/", "elementiElaborati");
    private final static QName _ElementiProcessati_QNAME = new QName("http://dma.csi.it/", "elementiProcessati");
    private final static QName _Paziente_QNAME = new QName("http://dma.csi.it/", "paziente");
    private final static QName _LinkImmaginiStazioneRefertante_QNAME = new QName("http://dma.csi.it/", "linkImmaginiStazioneRefertante");
    private final static QName _Oscurato_QNAME = new QName("http://dma.csi.it/", "oscurato");
    private final static QName _IdDocumento_QNAME = new QName("http://dma.csi.it/", "idDocumento");
    private final static QName _PeriodoMassimoMediazione_QNAME = new QName("http://dma.csi.it/", "periodoMassimoMediazione");
    private final static QName _IdEpisodio_QNAME = new QName("http://dma.csi.it/", "idEpisodio");
    private final static QName _Delega_QNAME = new QName("http://dma.csi.it/", "delega");
    private final static QName _MetadatiDocumento_QNAME = new QName("http://dma.csi.it/", "metadatiDocumento");
    private final static QName _NumeroTotaleDocumenti_QNAME = new QName("http://dma.csi.it/", "numeroTotaleDocumenti");
    private final static QName _NumeroMaxProcessiSmediazione_QNAME = new QName("http://dma.csi.it/", "numeroMaxProcessiSmediazione");
    private final static QName _ElencoIdEClDocSmediati_QNAME = new QName("http://dma.csi.it/", "elencoIdEClDocSmediati");
    private final static QName _Episodi_QNAME = new QName("http://dma.csi.it/", "episodi");
    private final static QName _Documento_QNAME = new QName("http://dma.csi.it/", "documento");
    private final static QName _Episodio_QNAME = new QName("http://dma.csi.it/", "episodio");
    private final static QName _ComponentiLocaliInterrogate_QNAME = new QName("http://dma.csi.it/", "componentiLocaliInterrogate");
    private final static QName _NumeroTotaleEpisodi_QNAME = new QName("http://dma.csi.it/", "numeroTotaleEpisodi");
    private final static QName _ElementiScartati_QNAME = new QName("http://dma.csi.it/", "elementiScartati");
    private final static QName _ListaNre_QNAME = new QName("http://dma.csi.it/", "listaNre");
    private final static QName _Richiedente_QNAME = new QName("http://dma.csi.it/", "richiedente");
    private final static QName _IdDipartimentale_QNAME = new QName("http://dma.csi.it/", "idDipartimentale");
    private final static QName _Codifiche_QNAME = new QName("http://dma.csi.it/", "codifiche");
    private final static QName _ModalitaDiAlimentazione_QNAME = new QName("http://dma.csi.it/", "modalitaDiAlimentazione");
    private final static QName _FirmatoDigitalmente_QNAME = new QName("http://dma.csi.it/", "firmatoDigitalmente");
    private final static QName _Errori_QNAME = new QName("http://dma.csi.it/", "errori");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.dma
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LinkImmagine }
     * 
     */
    public LinkImmagine createLinkImmagine() {
        return new LinkImmagine();
    }

    /**
     * Create an instance of {@link Episodio }
     * 
     */
    public Episodio createEpisodio() {
        return new Episodio();
    }

    /**
     * Create an instance of {@link Consenso }
     * 
     */
    public Consenso createConsenso() {
        return new Consenso();
    }

    /**
     * Create an instance of {@link LinkImmagineStazioneRefertante }
     * 
     */
    public LinkImmagineStazioneRefertante createLinkImmagineStazioneRefertante() {
        return new LinkImmagineStazioneRefertante();
    }

    /**
     * Create an instance of {@link ComponenteLocaleRisposta }
     * 
     */
    public ComponenteLocaleRisposta createComponenteLocaleRisposta() {
        return new ComponenteLocaleRisposta();
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
     * Create an instance of {@link MetadatiDocumento }
     * 
     */
    public MetadatiDocumento createMetadatiDocumento() {
        return new MetadatiDocumento();
    }

    /**
     * Create an instance of {@link TipoFirma }
     * 
     */
    public TipoFirma createTipoFirma() {
        return new TipoFirma();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link Documento }
     * 
     */
    public Documento createDocumento() {
        return new Documento();
    }

    /**
     * Create an instance of {@link TipoFileDocumento }
     * 
     */
    public TipoFileDocumento createTipoFileDocumento() {
        return new TipoFileDocumento();
    }

    /**
     * Create an instance of {@link Etichetta }
     * 
     */
    public Etichetta createEtichetta() {
        return new Etichetta();
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
     * Create an instance of {@link Oscuramento }
     * 
     */
    public Oscuramento createOscuramento() {
        return new Oscuramento();
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
     * Create an instance of {@link LuogoASU }
     * 
     */
    public LuogoASU createLuogoASU() {
        return new LuogoASU();
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
     * Create an instance of {@link RegimeDMA }
     * 
     */
    public RegimeDMA createRegimeDMA() {
        return new RegimeDMA();
    }

    /**
     * Create an instance of {@link Regione }
     * 
     */
    public Regione createRegione() {
        return new Regione();
    }

    /**
     * Create an instance of {@link StrutturaSanitaria }
     * 
     */
    public StrutturaSanitaria createStrutturaSanitaria() {
        return new StrutturaSanitaria();
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
     * Create an instance of {@link Azienda }
     * 
     */
    public Azienda createAzienda() {
        return new Azienda();
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
     * Create an instance of {@link AssettoOrganizzativo }
     * 
     */
    public AssettoOrganizzativo createAssettoOrganizzativo() {
        return new AssettoOrganizzativo();
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
     * Create an instance of {@link ComponenteLocaleRispostaStato }
     * 
     */
    public ComponenteLocaleRispostaStato createComponenteLocaleRispostaStato() {
        return new ComponenteLocaleRispostaStato();
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
     * Create an instance of {@link RichiedenteInfo }
     * 
     */
    public RichiedenteInfo createRichiedenteInfo() {
        return new RichiedenteInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkImmagine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "linkImmagini")
    public JAXBElement<LinkImmagine> createLinkImmagini(LinkImmagine value) {
        return new JAXBElement<LinkImmagine>(_LinkImmagini_QNAME, LinkImmagine.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "accessionNumber")
    public JAXBElement<String> createAccessionNumber(String value) {
        return new JAXBElement<String>(_AccessionNumber_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SiNo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "criptato")
    public JAXBElement<SiNo> createCriptato(SiNo value) {
        return new JAXBElement<SiNo>(_Criptato_QNAME, SiNo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "elementiElaborati")
    public JAXBElement<Integer> createElementiElaborati(Integer value) {
        return new JAXBElement<Integer>(_ElementiElaborati_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "elementiProcessati")
    public JAXBElement<Integer> createElementiProcessati(Integer value) {
        return new JAXBElement<Integer>(_ElementiProcessati_QNAME, Integer.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkImmagineStazioneRefertante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "linkImmaginiStazioneRefertante")
    public JAXBElement<LinkImmagineStazioneRefertante> createLinkImmaginiStazioneRefertante(LinkImmagineStazioneRefertante value) {
        return new JAXBElement<LinkImmagineStazioneRefertante>(_LinkImmaginiStazioneRefertante_QNAME, LinkImmagineStazioneRefertante.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "idDocumento")
    public JAXBElement<String> createIdDocumento(String value) {
        return new JAXBElement<String>(_IdDocumento_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "periodoMassimoMediazione")
    public JAXBElement<Long> createPeriodoMassimoMediazione(Long value) {
        return new JAXBElement<Long>(_PeriodoMassimoMediazione_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "idEpisodio")
    public JAXBElement<String> createIdEpisodio(String value) {
        return new JAXBElement<String>(_IdEpisodio_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadatiDocumento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "metadatiDocumento")
    public JAXBElement<MetadatiDocumento> createMetadatiDocumento(MetadatiDocumento value) {
        return new JAXBElement<MetadatiDocumento>(_MetadatiDocumento_QNAME, MetadatiDocumento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "numeroTotaleDocumenti")
    public JAXBElement<Integer> createNumeroTotaleDocumenti(Integer value) {
        return new JAXBElement<Integer>(_NumeroTotaleDocumenti_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "numeroMaxProcessiSmediazione")
    public JAXBElement<Long> createNumeroMaxProcessiSmediazione(Long value) {
        return new JAXBElement<Long>(_NumeroMaxProcessiSmediazione_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "elencoIdEClDocSmediati")
    public JAXBElement<String> createElencoIdEClDocSmediati(String value) {
        return new JAXBElement<String>(_ElencoIdEClDocSmediati_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Episodio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "episodi")
    public JAXBElement<Episodio> createEpisodi(Episodio value) {
        return new JAXBElement<Episodio>(_Episodi_QNAME, Episodio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "documento")
    public JAXBElement<byte[]> createDocumento(byte[] value) {
        return new JAXBElement<byte[]>(_Documento_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Episodio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "episodio")
    public JAXBElement<Episodio> createEpisodio(Episodio value) {
        return new JAXBElement<Episodio>(_Episodio_QNAME, Episodio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComponenteLocaleRisposta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "componentiLocaliInterrogate")
    public JAXBElement<ComponenteLocaleRisposta> createComponentiLocaliInterrogate(ComponenteLocaleRisposta value) {
        return new JAXBElement<ComponenteLocaleRisposta>(_ComponentiLocaliInterrogate_QNAME, ComponenteLocaleRisposta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "numeroTotaleEpisodi")
    public JAXBElement<Integer> createNumeroTotaleEpisodi(Integer value) {
        return new JAXBElement<Integer>(_NumeroTotaleEpisodi_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "elementiScartati")
    public JAXBElement<Integer> createElementiScartati(Integer value) {
        return new JAXBElement<Integer>(_ElementiScartati_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "listaNre")
    public JAXBElement<String> createListaNre(String value) {
        return new JAXBElement<String>(_ListaNre_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "idDipartimentale")
    public JAXBElement<String> createIdDipartimentale(String value) {
        return new JAXBElement<String>(_IdDipartimentale_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ModalitaDiAlimentazione }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "modalitaDiAlimentazione")
    public JAXBElement<ModalitaDiAlimentazione> createModalitaDiAlimentazione(ModalitaDiAlimentazione value) {
        return new JAXBElement<ModalitaDiAlimentazione>(_ModalitaDiAlimentazione_QNAME, ModalitaDiAlimentazione.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiNo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "firmatoDigitalmente")
    public JAXBElement<SiNo> createFirmatoDigitalmente(SiNo value) {
        return new JAXBElement<SiNo>(_FirmatoDigitalmente_QNAME, SiNo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Errore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "errori")
    public JAXBElement<Errore> createErrori(Errore value) {
        return new JAXBElement<Errore>(_Errori_QNAME, Errore.class, null, value);
    }

}
