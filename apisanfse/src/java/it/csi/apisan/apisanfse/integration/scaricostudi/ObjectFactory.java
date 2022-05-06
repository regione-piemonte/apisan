/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.scaricostudi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.apisan.apisanfse.integration.scaricostudi package. 
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

    private final static QName _StatoRichiesta_QNAME = new QName("http://dma.csi.it/", "statoRichiesta");
    private final static QName _ScaricaStudiResponse_QNAME = new QName("http://dmacc.csi.it/", "scaricaStudiResponse");
    private final static QName _StatoRichiesteScarico_QNAME = new QName("http://dma.csi.it/", "statoRichiesteScarico");
    private final static QName _Dimensione_QNAME = new QName("http://dma.csi.it/", "dimensione");
    private final static QName _Esito_QNAME = new QName("http://dmacc.csi.it/", "esito");
    private final static QName _CancellaPacchettoResponse_QNAME = new QName("http://dmacc.csi.it/", "cancellaPacchettoResponse");
    private final static QName _VerificaStatoListaRichiesteResponse_QNAME = new QName("http://dmacc.csi.it/", "verificaStatoListaRichiesteResponse");
    private final static QName _Errori_QNAME = new QName("http://dma.csi.it/", "errori");
    private final static QName _PRequest1_QNAME = new QName("http://dmacc.csi.it/", "pRequest1");
    private final static QName _PRequest2_QNAME = new QName("http://dmacc.csi.it/", "pRequest2");
    private final static QName _PRequest3_QNAME = new QName("http://dmacc.csi.it/", "pRequest3");
    private final static QName _PRequest4_QNAME = new QName("http://dmacc.csi.it/", "pRequest4");
    private final static QName _IdPacchetto_QNAME = new QName("http://dma.csi.it/", "idPacchetto");
    private final static QName _VerificaStatoRichiestaResponse_QNAME = new QName("http://dmacc.csi.it/", "verificaStatoRichiestaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.apisan.apisanfse.integration.scaricostudi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CancellaPacchettoRes }
     * 
     */
    public CancellaPacchettoRes createCancellaPacchettoRes() {
        return new CancellaPacchettoRes();
    }

    /**
     * Create an instance of {@link VerificaStatoRichiestaRes }
     * 
     */
    public VerificaStatoRichiestaRes createVerificaStatoRichiestaRes() {
        return new VerificaStatoRichiestaRes();
    }

    /**
     * Create an instance of {@link CancellaPacchettoReq }
     * 
     */
    public CancellaPacchettoReq createCancellaPacchettoReq() {
        return new CancellaPacchettoReq();
    }

    /**
     * Create an instance of {@link ScaricaStudiReq }
     * 
     */
    public ScaricaStudiReq createScaricaStudiReq() {
        return new ScaricaStudiReq();
    }

    /**
     * Create an instance of {@link ScaricaStudiRes }
     * 
     */
    public ScaricaStudiRes createScaricaStudiRes() {
        return new ScaricaStudiRes();
    }

    /**
     * Create an instance of {@link VerificaStatoListaRichiesteRes }
     * 
     */
    public VerificaStatoListaRichiesteRes createVerificaStatoListaRichiesteRes() {
        return new VerificaStatoListaRichiesteRes();
    }

    /**
     * Create an instance of {@link VerificaStatoRichiestaReq }
     * 
     */
    public VerificaStatoRichiestaReq createVerificaStatoRichiestaReq() {
        return new VerificaStatoRichiestaReq();
    }

    /**
     * Create an instance of {@link VerificaStatoListaRichiesteReq }
     * 
     */
    public VerificaStatoListaRichiesteReq createVerificaStatoListaRichiesteReq() {
        return new VerificaStatoListaRichiesteReq();
    }

    /**
     * Create an instance of {@link ArrayOfidRefertoString }
     * 
     */
    public ArrayOfidRefertoString createArrayOfidRefertoString() {
        return new ArrayOfidRefertoString();
    }

    /**
     * Create an instance of {@link EnsMessagebody }
     * 
     */
    public EnsMessagebody createEnsMessagebody() {
        return new EnsMessagebody();
    }

    /**
     * Create an instance of {@link EnsResponse }
     * 
     */
    public EnsResponse createEnsResponse() {
        return new EnsResponse();
    }

    /**
     * Create an instance of {@link EnsRequest }
     * 
     */
    public EnsRequest createEnsRequest() {
        return new EnsRequest();
    }

    /**
     * Create an instance of {@link StatoRichiestaScarico }
     * 
     */
    public StatoRichiestaScarico createStatoRichiestaScarico() {
        return new StatoRichiestaScarico();
    }

    /**
     * Create an instance of {@link Errore }
     * 
     */
    public Errore createErrore() {
        return new Errore();
    }

    /**
     * Create an instance of {@link Codifica }
     * 
     */
    public Codifica createCodifica() {
        return new Codifica();
    }

    /**
     * Create an instance of {@link ArrayOferroreerrore }
     * 
     */
    public ArrayOferroreerrore createArrayOferroreerrore() {
        return new ArrayOferroreerrore();
    }

    /**
     * Create an instance of {@link ArrayOfstatoRichiestaScaricostatoRichiestaScarico }
     * 
     */
    public ArrayOfstatoRichiestaScaricostatoRichiestaScarico createArrayOfstatoRichiestaScaricostatoRichiestaScarico() {
        return new ArrayOfstatoRichiestaScaricostatoRichiestaScarico();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatoRichiesta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "statoRichiesta")
    public JAXBElement<StatoRichiesta> createStatoRichiesta(StatoRichiesta value) {
        return new JAXBElement<StatoRichiesta>(_StatoRichiesta_QNAME, StatoRichiesta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScaricaStudiRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "scaricaStudiResponse")
    public JAXBElement<ScaricaStudiRes> createScaricaStudiResponse(ScaricaStudiRes value) {
        return new JAXBElement<ScaricaStudiRes>(_ScaricaStudiResponse_QNAME, ScaricaStudiRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatoRichiestaScarico }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "statoRichiesteScarico")
    public JAXBElement<StatoRichiestaScarico> createStatoRichiesteScarico(StatoRichiestaScarico value) {
        return new JAXBElement<StatoRichiestaScarico>(_StatoRichiesteScarico_QNAME, StatoRichiestaScarico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "dimensione")
    public JAXBElement<Long> createDimensione(Long value) {
        return new JAXBElement<Long>(_Dimensione_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoCodice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "esito")
    public JAXBElement<RisultatoCodice> createEsito(RisultatoCodice value) {
        return new JAXBElement<RisultatoCodice>(_Esito_QNAME, RisultatoCodice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancellaPacchettoRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "cancellaPacchettoResponse")
    public JAXBElement<CancellaPacchettoRes> createCancellaPacchettoResponse(CancellaPacchettoRes value) {
        return new JAXBElement<CancellaPacchettoRes>(_CancellaPacchettoResponse_QNAME, CancellaPacchettoRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaStatoListaRichiesteRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "verificaStatoListaRichiesteResponse")
    public JAXBElement<VerificaStatoListaRichiesteRes> createVerificaStatoListaRichiesteResponse(VerificaStatoListaRichiesteRes value) {
        return new JAXBElement<VerificaStatoListaRichiesteRes>(_VerificaStatoListaRichiesteResponse_QNAME, VerificaStatoListaRichiesteRes.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CancellaPacchettoReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "pRequest1")
    public JAXBElement<CancellaPacchettoReq> createPRequest1(CancellaPacchettoReq value) {
        return new JAXBElement<CancellaPacchettoReq>(_PRequest1_QNAME, CancellaPacchettoReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScaricaStudiReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "pRequest2")
    public JAXBElement<ScaricaStudiReq> createPRequest2(ScaricaStudiReq value) {
        return new JAXBElement<ScaricaStudiReq>(_PRequest2_QNAME, ScaricaStudiReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaStatoRichiestaReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "pRequest3")
    public JAXBElement<VerificaStatoRichiestaReq> createPRequest3(VerificaStatoRichiestaReq value) {
        return new JAXBElement<VerificaStatoRichiestaReq>(_PRequest3_QNAME, VerificaStatoRichiestaReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaStatoListaRichiesteReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "pRequest4")
    public JAXBElement<VerificaStatoListaRichiesteReq> createPRequest4(VerificaStatoListaRichiesteReq value) {
        return new JAXBElement<VerificaStatoListaRichiesteReq>(_PRequest4_QNAME, VerificaStatoListaRichiesteReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "idPacchetto")
    public JAXBElement<String> createIdPacchetto(String value) {
        return new JAXBElement<String>(_IdPacchetto_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaStatoRichiestaRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "verificaStatoRichiestaResponse")
    public JAXBElement<VerificaStatoRichiestaRes> createVerificaStatoRichiestaResponse(VerificaStatoRichiestaRes value) {
        return new JAXBElement<VerificaStatoRichiestaRes>(_VerificaStatoRichiestaResponse_QNAME, VerificaStatoRichiestaRes.class, null, value);
    }

}
