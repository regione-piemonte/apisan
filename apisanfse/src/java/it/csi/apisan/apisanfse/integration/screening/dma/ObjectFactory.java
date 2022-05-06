/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.screening.dma;

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

    private final static QName _Consenso_QNAME = new QName("http://dma.csi.it/", "consenso");
    private final static QName _Richiedente_QNAME = new QName("http://dma.csi.it/", "richiedente");
    private final static QName _PazienteSOL_QNAME = new QName("http://dma.csi.it/", "pazienteSOL");
    private final static QName _Delega_QNAME = new QName("http://dma.csi.it/", "delega");
    private final static QName _Paziente_QNAME = new QName("http://dma.csi.it/", "paziente");
    private final static QName _ScreeningDettaglio_QNAME = new QName("http://dma.csi.it/", "screeningDettaglio");
    private final static QName _ModalitaDiAlimentazione_QNAME = new QName("http://dma.csi.it/", "modalitaDiAlimentazione");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.dma
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PazienteSOL }
     * 
     */
    public PazienteSOL createPazienteSOL() {
        return new PazienteSOL();
    }

    /**
     * Create an instance of {@link Delega }
     * 
     */
    public Delega createDelega() {
        return new Delega();
    }

    /**
     * Create an instance of {@link Richiedente }
     * 
     */
    public Richiedente createRichiedente() {
        return new Richiedente();
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
     * Create an instance of {@link ScreeningDettaglio }
     * 
     */
    public ScreeningDettaglio createScreeningDettaglio() {
        return new ScreeningDettaglio();
    }

    /**
     * Create an instance of {@link Screening }
     * 
     */
    public Screening createScreening() {
        return new Screening();
    }

    /**
     * Create an instance of {@link Errore }
     * 
     */
    public Errore createErrore() {
        return new Errore();
    }

    /**
     * Create an instance of {@link ScreeningGiudizioDiagnostico }
     * 
     */
    public ScreeningGiudizioDiagnostico createScreeningGiudizioDiagnostico() {
        return new ScreeningGiudizioDiagnostico();
    }

    /**
     * Create an instance of {@link ScreeningGiudizio }
     * 
     */
    public ScreeningGiudizio createScreeningGiudizio() {
        return new ScreeningGiudizio();
    }

    /**
     * Create an instance of {@link TipoFileDocumento }
     * 
     */
    public TipoFileDocumento createTipoFileDocumento() {
        return new TipoFileDocumento();
    }

    /**
     * Create an instance of {@link ScreeningEsameTipo }
     * 
     */
    public ScreeningEsameTipo createScreeningEsameTipo() {
        return new ScreeningEsameTipo();
    }

    /**
     * Create an instance of {@link InformazioniSistemiScreening }
     * 
     */
    public InformazioniSistemiScreening createInformazioniSistemiScreening() {
        return new InformazioniSistemiScreening();
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
     * Create an instance of {@link ScreeningPolipoClisma }
     * 
     */
    public ScreeningPolipoClisma createScreeningPolipoClisma() {
        return new ScreeningPolipoClisma();
    }

    /**
     * Create an instance of {@link ScreeningIndicazioneFinale }
     * 
     */
    public ScreeningIndicazioneFinale createScreeningIndicazioneFinale() {
        return new ScreeningIndicazioneFinale();
    }

    /**
     * Create an instance of {@link ScreeningTrattamentoErogato }
     * 
     */
    public ScreeningTrattamentoErogato createScreeningTrattamentoErogato() {
        return new ScreeningTrattamentoErogato();
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
     * Create an instance of {@link ScreeningPolipoColon }
     * 
     */
    public ScreeningPolipoColon createScreeningPolipoColon() {
        return new ScreeningPolipoColon();
    }

    /**
     * Create an instance of {@link Profilo }
     * 
     */
    public Profilo createProfilo() {
        return new Profilo();
    }

    /**
     * Create an instance of {@link ScreeningPrestazione }
     * 
     */
    public ScreeningPrestazione createScreeningPrestazione() {
        return new ScreeningPrestazione();
    }

    /**
     * Create an instance of {@link ArrayOfcodificacodifica }
     * 
     */
    public ArrayOfcodificacodifica createArrayOfcodificacodifica() {
        return new ArrayOfcodificacodifica();
    }

    /**
     * Create an instance of {@link ScreeningTrattamento }
     * 
     */
    public ScreeningTrattamento createScreeningTrattamento() {
        return new ScreeningTrattamento();
    }

    /**
     * Create an instance of {@link RegimeDMA }
     * 
     */
    public RegimeDMA createRegimeDMA() {
        return new RegimeDMA();
    }

    /**
     * Create an instance of {@link ScreeningRefertoColonscopia }
     * 
     */
    public ScreeningRefertoColonscopia createScreeningRefertoColonscopia() {
        return new ScreeningRefertoColonscopia();
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
     * Create an instance of {@link Codifica }
     * 
     */
    public Codifica createCodifica() {
        return new Codifica();
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
     * Create an instance of {@link ScreeningTipo }
     * 
     */
    public ScreeningTipo createScreeningTipo() {
        return new ScreeningTipo();
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
     * Create an instance of {@link ScreeningEsame }
     * 
     */
    public ScreeningEsame createScreeningEsame() {
        return new ScreeningEsame();
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
     * Create an instance of {@link ScreeningRefertoClismaOpaco }
     * 
     */
    public ScreeningRefertoClismaOpaco createScreeningRefertoClismaOpaco() {
        return new ScreeningRefertoClismaOpaco();
    }

    /**
     * Create an instance of {@link ApplicativoVerticale }
     * 
     */
    public ApplicativoVerticale createApplicativoVerticale() {
        return new ApplicativoVerticale();
    }

    /**
     * Create an instance of {@link ScreeningMedico }
     * 
     */
    public ScreeningMedico createScreeningMedico() {
        return new ScreeningMedico();
    }

    /**
     * Create an instance of {@link PazienteScreening }
     * 
     */
    public PazienteScreening createPazienteScreening() {
        return new PazienteScreening();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Richiedente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "richiedente")
    public JAXBElement<Richiedente> createRichiedente(Richiedente value) {
        return new JAXBElement<Richiedente>(_Richiedente_QNAME, Richiedente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PazienteSOL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "pazienteSOL")
    public JAXBElement<PazienteSOL> createPazienteSOL(PazienteSOL value) {
        return new JAXBElement<PazienteSOL>(_PazienteSOL_QNAME, PazienteSOL.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Paziente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "paziente")
    public JAXBElement<Paziente> createPaziente(Paziente value) {
        return new JAXBElement<Paziente>(_Paziente_QNAME, Paziente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScreeningDettaglio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "screeningDettaglio")
    public JAXBElement<ScreeningDettaglio> createScreeningDettaglio(ScreeningDettaglio value) {
        return new JAXBElement<ScreeningDettaglio>(_ScreeningDettaglio_QNAME, ScreeningDettaglio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModalitaDiAlimentazione }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "modalitaDiAlimentazione")
    public JAXBElement<ModalitaDiAlimentazione> createModalitaDiAlimentazione(ModalitaDiAlimentazione value) {
        return new JAXBElement<ModalitaDiAlimentazione>(_ModalitaDiAlimentazione_QNAME, ModalitaDiAlimentazione.class, null, value);
    }

}
