/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.dma;

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

    private final static QName _AccessionNumbers_QNAME = new QName("http://dma.csi.it/", "accessionNumbers");
    private final static QName _Codifiche_QNAME = new QName("http://dma.csi.it/", "codifiche");
    private final static QName _ModalitaDiAlimentazione_QNAME = new QName("http://dma.csi.it/", "modalitaDiAlimentazione");
    private final static QName _Errori_QNAME = new QName("http://dma.csi.it/", "errori");
    private final static QName _MetadatiDocumenti_QNAME = new QName("http://dma.csi.it/", "metadatiDocumenti");
    private final static QName _Consenso_QNAME = new QName("http://dma.csi.it/", "consenso");
    private final static QName _Documenti_QNAME = new QName("http://dma.csi.it/", "documenti");
    private final static QName _Paziente_QNAME = new QName("http://dma.csi.it/", "paziente");
    private final static QName _RisposteComponentiLocali_QNAME = new QName("http://dma.csi.it/", "risposteComponentiLocali");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.dma
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DocumentoSR }
     * 
     */
    public DocumentoSR createDocumentoSR() {
        return new DocumentoSR();
    }

    /**
     * Create an instance of {@link Errore }
     * 
     */
    public Errore createErrore() {
        return new Errore();
    }

    /**
     * Create an instance of {@link MetadatiDocumentoSR }
     * 
     */
    public MetadatiDocumentoSR createMetadatiDocumentoSR() {
        return new MetadatiDocumentoSR();
    }

    /**
     * Create an instance of {@link Consenso }
     * 
     */
    public Consenso createConsenso() {
        return new Consenso();
    }

    /**
     * Create an instance of {@link ModalitaDiAlimentazione }
     * 
     */
    public ModalitaDiAlimentazione createModalitaDiAlimentazione() {
        return new ModalitaDiAlimentazione();
    }

    /**
     * Create an instance of {@link Paziente }
     * 
     */
    public Paziente createPaziente() {
        return new Paziente();
    }

    /**
     * Create an instance of {@link Codifica }
     * 
     */
    public Codifica createCodifica() {
        return new Codifica();
    }

    /**
     * Create an instance of {@link ComponenteLocaleRisposta }
     * 
     */
    public ComponenteLocaleRisposta createComponenteLocaleRisposta() {
        return new ComponenteLocaleRisposta();
    }

    /**
     * Create an instance of {@link EventoNotifica }
     * 
     */
    public EventoNotifica createEventoNotifica() {
        return new EventoNotifica();
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
     * Create an instance of {@link TipoCartellaPersonale }
     * 
     */
    public TipoCartellaPersonale createTipoCartellaPersonale() {
        return new TipoCartellaPersonale();
    }

    /**
     * Create an instance of {@link EnteEmittenteEsenzione }
     * 
     */
    public EnteEmittenteEsenzione createEnteEmittenteEsenzione() {
        return new EnteEmittenteEsenzione();
    }

    /**
     * Create an instance of {@link TipoAccessoConsultazione }
     * 
     */
    public TipoAccessoConsultazione createTipoAccessoConsultazione() {
        return new TipoAccessoConsultazione();
    }

    /**
     * Create an instance of {@link Richiedente }
     * 
     */
    public Richiedente createRichiedente() {
        return new Richiedente();
    }

    /**
     * Create an instance of {@link ConsensoPerRuolo }
     * 
     */
    public ConsensoPerRuolo createConsensoPerRuolo() {
        return new ConsensoPerRuolo();
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
     * Create an instance of {@link ArrayOfaccessionNumbersItemString }
     * 
     */
    public ArrayOfaccessionNumbersItemString createArrayOfaccessionNumbersItemString() {
        return new ArrayOfaccessionNumbersItemString();
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
     * Create an instance of {@link Configurazione }
     * 
     */
    public Configurazione createConfigurazione() {
        return new Configurazione();
    }

    /**
     * Create an instance of {@link PazienteOncologico }
     * 
     */
    public PazienteOncologico createPazienteOncologico() {
        return new PazienteOncologico();
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
     * Create an instance of {@link RegimeDMA }
     * 
     */
    public RegimeDMA createRegimeDMA() {
        return new RegimeDMA();
    }

    /**
     * Create an instance of {@link ArrayOfconsensoPerRuoloconsensoPerRuolo }
     * 
     */
    public ArrayOfconsensoPerRuoloconsensoPerRuolo createArrayOfconsensoPerRuoloconsensoPerRuolo() {
        return new ArrayOfconsensoPerRuoloconsensoPerRuolo();
    }

    /**
     * Create an instance of {@link NotificaDocumentoScaricabileTipo }
     * 
     */
    public NotificaDocumentoScaricabileTipo createNotificaDocumentoScaricabileTipo() {
        return new NotificaDocumentoScaricabileTipo();
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
     * Create an instance of {@link ArrayOferroreerrore }
     * 
     */
    public ArrayOferroreerrore createArrayOferroreerrore() {
        return new ArrayOferroreerrore();
    }

    /**
     * Create an instance of {@link ArrayOfcomponenteLocaleServiziocomponenteLocaleServizio }
     * 
     */
    public ArrayOfcomponenteLocaleServiziocomponenteLocaleServizio createArrayOfcomponenteLocaleServiziocomponenteLocaleServizio() {
        return new ArrayOfcomponenteLocaleServiziocomponenteLocaleServizio();
    }

    /**
     * Create an instance of {@link EpisodioStato }
     * 
     */
    public EpisodioStato createEpisodioStato() {
        return new EpisodioStato();
    }

    /**
     * Create an instance of {@link TipoContributo }
     * 
     */
    public TipoContributo createTipoContributo() {
        return new TipoContributo();
    }

    /**
     * Create an instance of {@link ConsensoMatriceTipoDato }
     * 
     */
    public ConsensoMatriceTipoDato createConsensoMatriceTipoDato() {
        return new ConsensoMatriceTipoDato();
    }

    /**
     * Create an instance of {@link ArrayOfcomponenteLocaleOperazionecomponenteLocaleOperazione }
     * 
     */
    public ArrayOfcomponenteLocaleOperazionecomponenteLocaleOperazione createArrayOfcomponenteLocaleOperazionecomponenteLocaleOperazione() {
        return new ArrayOfcomponenteLocaleOperazionecomponenteLocaleOperazione();
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
     * Create an instance of {@link ComponenteLocaleRispostaStato }
     * 
     */
    public ComponenteLocaleRispostaStato createComponenteLocaleRispostaStato() {
        return new ComponenteLocaleRispostaStato();
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
     * Create an instance of {@link CatalogoLog }
     * 
     */
    public CatalogoLog createCatalogoLog() {
        return new CatalogoLog();
    }

    /**
     * Create an instance of {@link ArrayOfcomponenteLocaleRispostacomponenteLocaleRisposta }
     * 
     */
    public ArrayOfcomponenteLocaleRispostacomponenteLocaleRisposta createArrayOfcomponenteLocaleRispostacomponenteLocaleRisposta() {
        return new ArrayOfcomponenteLocaleRispostacomponenteLocaleRisposta();
    }

    /**
     * Create an instance of {@link PazienteROPVA }
     * 
     */
    public PazienteROPVA createPazienteROPVA() {
        return new PazienteROPVA();
    }

    /**
     * Create an instance of {@link Prestazione }
     * 
     */
    public Prestazione createPrestazione() {
        return new Prestazione();
    }

    /**
     * Create an instance of {@link ArrayOfdocumentoSRdocumentoSR }
     * 
     */
    public ArrayOfdocumentoSRdocumentoSR createArrayOfdocumentoSRdocumentoSR() {
        return new ArrayOfdocumentoSRdocumentoSR();
    }

    /**
     * Create an instance of {@link DiagnosiEsenzione }
     * 
     */
    public DiagnosiEsenzione createDiagnosiEsenzione() {
        return new DiagnosiEsenzione();
    }

    /**
     * Create an instance of {@link ArrayOfmetadatiDocumentoSRmetadatiDocumentoSR }
     * 
     */
    public ArrayOfmetadatiDocumentoSRmetadatiDocumentoSR createArrayOfmetadatiDocumentoSRmetadatiDocumentoSR() {
        return new ArrayOfmetadatiDocumentoSRmetadatiDocumentoSR();
    }

    /**
     * Create an instance of {@link CanaleNotifica }
     * 
     */
    public CanaleNotifica createCanaleNotifica() {
        return new CanaleNotifica();
    }

    /**
     * Create an instance of {@link Esenzione }
     * 
     */
    public Esenzione createEsenzione() {
        return new Esenzione();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "accessionNumbers")
    public JAXBElement<String> createAccessionNumbers(String value) {
        return new JAXBElement<String>(_AccessionNumbers_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Errore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "errori")
    public JAXBElement<Errore> createErrori(Errore value) {
        return new JAXBElement<Errore>(_Errori_QNAME, Errore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadatiDocumentoSR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "metadatiDocumenti")
    public JAXBElement<MetadatiDocumentoSR> createMetadatiDocumenti(MetadatiDocumentoSR value) {
        return new JAXBElement<MetadatiDocumentoSR>(_MetadatiDocumenti_QNAME, MetadatiDocumentoSR.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentoSR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "documenti")
    public JAXBElement<DocumentoSR> createDocumenti(DocumentoSR value) {
        return new JAXBElement<DocumentoSR>(_Documenti_QNAME, DocumentoSR.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ComponenteLocaleRisposta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "risposteComponentiLocali")
    public JAXBElement<ComponenteLocaleRisposta> createRisposteComponentiLocali(ComponenteLocaleRisposta value) {
        return new JAXBElement<ComponenteLocaleRisposta>(_RisposteComponentiLocali_QNAME, ComponenteLocaleRisposta.class, null, value);
    }

}
