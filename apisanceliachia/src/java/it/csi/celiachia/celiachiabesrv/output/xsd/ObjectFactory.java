/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.celiachia.celiachiabesrv.output.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.celiachia.celiachiabesrv.output.xsd package. 
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

    private final static QName _BasicEsitoOutputEsito_QNAME = new QName("http://output.celiachiabesrv.celiachia.csi.it/xsd", "esito");
    private final static QName _EsitoCodice_QNAME = new QName("http://output.celiachiabesrv.celiachia.csi.it/xsd", "codice");
    private final static QName _StrutturaComune_QNAME = new QName("http://output.celiachiabesrv.celiachia.csi.it/xsd", "comune");
    private final static QName _StrutturaCap_QNAME = new QName("http://output.celiachiabesrv.celiachia.csi.it/xsd", "cap");
    private final static QName _StrutturaProvincia_QNAME = new QName("http://output.celiachiabesrv.celiachia.csi.it/xsd", "provincia");
    private final static QName _StrutturaId_QNAME = new QName("http://output.celiachiabesrv.celiachia.csi.it/xsd", "id");
    private final static QName _StrutturaNome_QNAME = new QName("http://output.celiachiabesrv.celiachia.csi.it/xsd", "nome");
    private final static QName _StrutturaIndirizzo_QNAME = new QName("http://output.celiachiabesrv.celiachia.csi.it/xsd", "indirizzo");
    private final static QName _ElencoErogazioniImporto_QNAME = new QName("http://output.celiachiabesrv.celiachia.csi.it/xsd", "importo");
    private final static QName _ElencoErogazioniData_QNAME = new QName("http://output.celiachiabesrv.celiachia.csi.it/xsd", "data");
    private final static QName _ElencoErogazioniStruttura_QNAME = new QName("http://output.celiachiabesrv.celiachia.csi.it/xsd", "struttura");
    private final static QName _AutorizzazioneDataValiditaInizio_QNAME = new QName("http://output.celiachiabesrv.celiachia.csi.it/xsd", "dataValiditaInizio");
    private final static QName _AutorizzazioneDataValiditaFine_QNAME = new QName("http://output.celiachiabesrv.celiachia.csi.it/xsd", "dataValiditaFine");
    private final static QName _ErogazioneFarmaciaCnu_QNAME = new QName("http://output.celiachiabesrv.celiachia.csi.it/xsd", "cnu");
    private final static QName _RicercaErogazioniAssistitoResponseErrore_QNAME = new QName("http://output.celiachiabesrv.celiachia.csi.it/xsd", "errore");
    private final static QName _BoRigeneraPinResponsePin_QNAME = new QName("http://output.celiachiabesrv.celiachia.csi.it/xsd", "pin");
    private final static QName _UsaPinDaQRCodeResponseCodiceAutorizzazione_QNAME = new QName("http://output.celiachiabesrv.celiachia.csi.it/xsd", "codiceAutorizzazione");
    private final static QName _VerificaSaldoAssistitoResponseDataInizio_QNAME = new QName("http://output.celiachiabesrv.celiachia.csi.it/xsd", "dataInizio");
    private final static QName _VerificaSaldoAssistitoResponseImportoTotale_QNAME = new QName("http://output.celiachiabesrv.celiachia.csi.it/xsd", "importoTotale");
    private final static QName _VerificaSaldoAssistitoResponseAutorizzazione_QNAME = new QName("http://output.celiachiabesrv.celiachia.csi.it/xsd", "autorizzazione");
    private final static QName _VerificaSaldoAssistitoResponseImportoDisponibile_QNAME = new QName("http://output.celiachiabesrv.celiachia.csi.it/xsd", "importoDisponibile");
    private final static QName _VerificaSaldoAssistitoResponseDataFine_QNAME = new QName("http://output.celiachiabesrv.celiachia.csi.it/xsd", "dataFine");
    private final static QName _ErroreDescrizione_QNAME = new QName("http://output.celiachiabesrv.celiachia.csi.it/xsd", "descrizione");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.celiachia.celiachiabesrv.output.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BoRigeneraPinResponse }
     * 
     */
    public BoRigeneraPinResponse createBoRigeneraPinResponse() {
        return new BoRigeneraPinResponse();
    }

    /**
     * Create an instance of {@link Errore }
     * 
     */
    public Errore createErrore() {
        return new Errore();
    }

    /**
     * Create an instance of {@link GetPinAssistitoResponse }
     * 
     */
    public GetPinAssistitoResponse createGetPinAssistitoResponse() {
        return new GetPinAssistitoResponse();
    }

    /**
     * Create an instance of {@link Autorizzazione }
     * 
     */
    public Autorizzazione createAutorizzazione() {
        return new Autorizzazione();
    }

    /**
     * Create an instance of {@link UsaPinDaQRCodeResponse }
     * 
     */
    public UsaPinDaQRCodeResponse createUsaPinDaQRCodeResponse() {
        return new UsaPinDaQRCodeResponse();
    }

    /**
     * Create an instance of {@link VerificaSaldoAssistitoResponse }
     * 
     */
    public VerificaSaldoAssistitoResponse createVerificaSaldoAssistitoResponse() {
        return new VerificaSaldoAssistitoResponse();
    }

    /**
     * Create an instance of {@link RigeneraPinResponse }
     * 
     */
    public RigeneraPinResponse createRigeneraPinResponse() {
        return new RigeneraPinResponse();
    }

    /**
     * Create an instance of {@link Esito }
     * 
     */
    public Esito createEsito() {
        return new Esito();
    }

    /**
     * Create an instance of {@link RicercaErogazioniAssistitoResponse }
     * 
     */
    public RicercaErogazioniAssistitoResponse createRicercaErogazioniAssistitoResponse() {
        return new RicercaErogazioniAssistitoResponse();
    }

    /**
     * Create an instance of {@link ElencoErogazioni }
     * 
     */
    public ElencoErogazioni createElencoErogazioni() {
        return new ElencoErogazioni();
    }

    /**
     * Create an instance of {@link ErogazioneFarmacia }
     * 
     */
    public ErogazioneFarmacia createErogazioneFarmacia() {
        return new ErogazioneFarmacia();
    }

    /**
     * Create an instance of {@link VerificaErogazioniFarmacieResponse }
     * 
     */
    public VerificaErogazioniFarmacieResponse createVerificaErogazioniFarmacieResponse() {
        return new VerificaErogazioniFarmacieResponse();
    }

    /**
     * Create an instance of {@link Struttura }
     * 
     */
    public Struttura createStruttura() {
        return new Struttura();
    }

    /**
     * Create an instance of {@link BasicEsitoOutput }
     * 
     */
    public BasicEsitoOutput createBasicEsitoOutput() {
        return new BasicEsitoOutput();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "esito", scope = BasicEsitoOutput.class)
    public JAXBElement<String> createBasicEsitoOutputEsito(String value) {
        return new JAXBElement<String>(_BasicEsitoOutputEsito_QNAME, String.class, BasicEsitoOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "codice", scope = Esito.class)
    public JAXBElement<String> createEsitoCodice(String value) {
        return new JAXBElement<String>(_EsitoCodice_QNAME, String.class, Esito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "comune", scope = Struttura.class)
    public JAXBElement<String> createStrutturaComune(String value) {
        return new JAXBElement<String>(_StrutturaComune_QNAME, String.class, Struttura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "cap", scope = Struttura.class)
    public JAXBElement<String> createStrutturaCap(String value) {
        return new JAXBElement<String>(_StrutturaCap_QNAME, String.class, Struttura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "provincia", scope = Struttura.class)
    public JAXBElement<String> createStrutturaProvincia(String value) {
        return new JAXBElement<String>(_StrutturaProvincia_QNAME, String.class, Struttura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "id", scope = Struttura.class)
    public JAXBElement<String> createStrutturaId(String value) {
        return new JAXBElement<String>(_StrutturaId_QNAME, String.class, Struttura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "nome", scope = Struttura.class)
    public JAXBElement<String> createStrutturaNome(String value) {
        return new JAXBElement<String>(_StrutturaNome_QNAME, String.class, Struttura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "indirizzo", scope = Struttura.class)
    public JAXBElement<String> createStrutturaIndirizzo(String value) {
        return new JAXBElement<String>(_StrutturaIndirizzo_QNAME, String.class, Struttura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Esito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "esito", scope = VerificaErogazioniFarmacieResponse.class)
    public JAXBElement<Esito> createVerificaErogazioniFarmacieResponseEsito(Esito value) {
        return new JAXBElement<Esito>(_BasicEsitoOutputEsito_QNAME, Esito.class, VerificaErogazioniFarmacieResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "importo", scope = ElencoErogazioni.class)
    public JAXBElement<Double> createElencoErogazioniImporto(Double value) {
        return new JAXBElement<Double>(_ElencoErogazioniImporto_QNAME, Double.class, ElencoErogazioni.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "data", scope = ElencoErogazioni.class)
    public JAXBElement<XMLGregorianCalendar> createElencoErogazioniData(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ElencoErogazioniData_QNAME, XMLGregorianCalendar.class, ElencoErogazioni.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Struttura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "struttura", scope = ElencoErogazioni.class)
    public JAXBElement<Struttura> createElencoErogazioniStruttura(Struttura value) {
        return new JAXBElement<Struttura>(_ElencoErogazioniStruttura_QNAME, Struttura.class, ElencoErogazioni.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "id", scope = ElencoErogazioni.class)
    public JAXBElement<String> createElencoErogazioniId(String value) {
        return new JAXBElement<String>(_StrutturaId_QNAME, String.class, ElencoErogazioni.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "dataValiditaInizio", scope = Autorizzazione.class)
    public JAXBElement<XMLGregorianCalendar> createAutorizzazioneDataValiditaInizio(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AutorizzazioneDataValiditaInizio_QNAME, XMLGregorianCalendar.class, Autorizzazione.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "dataValiditaFine", scope = Autorizzazione.class)
    public JAXBElement<XMLGregorianCalendar> createAutorizzazioneDataValiditaFine(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AutorizzazioneDataValiditaFine_QNAME, XMLGregorianCalendar.class, Autorizzazione.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "codice", scope = Autorizzazione.class)
    public JAXBElement<String> createAutorizzazioneCodice(String value) {
        return new JAXBElement<String>(_EsitoCodice_QNAME, String.class, Autorizzazione.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "cnu", scope = ErogazioneFarmacia.class)
    public JAXBElement<String> createErogazioneFarmaciaCnu(String value) {
        return new JAXBElement<String>(_ErogazioneFarmaciaCnu_QNAME, String.class, ErogazioneFarmacia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Errore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "errore", scope = RicercaErogazioniAssistitoResponse.class)
    public JAXBElement<Errore> createRicercaErogazioniAssistitoResponseErrore(Errore value) {
        return new JAXBElement<Errore>(_RicercaErogazioniAssistitoResponseErrore_QNAME, Errore.class, RicercaErogazioniAssistitoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "pin", scope = BoRigeneraPinResponse.class)
    public JAXBElement<String> createBoRigeneraPinResponsePin(String value) {
        return new JAXBElement<String>(_BoRigeneraPinResponsePin_QNAME, String.class, BoRigeneraPinResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Errore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "errore", scope = BoRigeneraPinResponse.class)
    public JAXBElement<Errore> createBoRigeneraPinResponseErrore(Errore value) {
        return new JAXBElement<Errore>(_RicercaErogazioniAssistitoResponseErrore_QNAME, Errore.class, BoRigeneraPinResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "codiceAutorizzazione", scope = UsaPinDaQRCodeResponse.class)
    public JAXBElement<String> createUsaPinDaQRCodeResponseCodiceAutorizzazione(String value) {
        return new JAXBElement<String>(_UsaPinDaQRCodeResponseCodiceAutorizzazione_QNAME, String.class, UsaPinDaQRCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Errore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "errore", scope = UsaPinDaQRCodeResponse.class)
    public JAXBElement<Errore> createUsaPinDaQRCodeResponseErrore(Errore value) {
        return new JAXBElement<Errore>(_RicercaErogazioniAssistitoResponseErrore_QNAME, Errore.class, UsaPinDaQRCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "pin", scope = RigeneraPinResponse.class)
    public JAXBElement<String> createRigeneraPinResponsePin(String value) {
        return new JAXBElement<String>(_BoRigeneraPinResponsePin_QNAME, String.class, RigeneraPinResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Errore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "errore", scope = RigeneraPinResponse.class)
    public JAXBElement<Errore> createRigeneraPinResponseErrore(Errore value) {
        return new JAXBElement<Errore>(_RicercaErogazioniAssistitoResponseErrore_QNAME, Errore.class, RigeneraPinResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "dataInizio", scope = VerificaSaldoAssistitoResponse.class)
    public JAXBElement<XMLGregorianCalendar> createVerificaSaldoAssistitoResponseDataInizio(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VerificaSaldoAssistitoResponseDataInizio_QNAME, XMLGregorianCalendar.class, VerificaSaldoAssistitoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "importoTotale", scope = VerificaSaldoAssistitoResponse.class)
    public JAXBElement<String> createVerificaSaldoAssistitoResponseImportoTotale(String value) {
        return new JAXBElement<String>(_VerificaSaldoAssistitoResponseImportoTotale_QNAME, String.class, VerificaSaldoAssistitoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Autorizzazione }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "autorizzazione", scope = VerificaSaldoAssistitoResponse.class)
    public JAXBElement<Autorizzazione> createVerificaSaldoAssistitoResponseAutorizzazione(Autorizzazione value) {
        return new JAXBElement<Autorizzazione>(_VerificaSaldoAssistitoResponseAutorizzazione_QNAME, Autorizzazione.class, VerificaSaldoAssistitoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "importoDisponibile", scope = VerificaSaldoAssistitoResponse.class)
    public JAXBElement<String> createVerificaSaldoAssistitoResponseImportoDisponibile(String value) {
        return new JAXBElement<String>(_VerificaSaldoAssistitoResponseImportoDisponibile_QNAME, String.class, VerificaSaldoAssistitoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "dataFine", scope = VerificaSaldoAssistitoResponse.class)
    public JAXBElement<XMLGregorianCalendar> createVerificaSaldoAssistitoResponseDataFine(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VerificaSaldoAssistitoResponseDataFine_QNAME, XMLGregorianCalendar.class, VerificaSaldoAssistitoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Errore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "errore", scope = VerificaSaldoAssistitoResponse.class)
    public JAXBElement<Errore> createVerificaSaldoAssistitoResponseErrore(Errore value) {
        return new JAXBElement<Errore>(_RicercaErogazioniAssistitoResponseErrore_QNAME, Errore.class, VerificaSaldoAssistitoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "descrizione", scope = Errore.class)
    public JAXBElement<String> createErroreDescrizione(String value) {
        return new JAXBElement<String>(_ErroreDescrizione_QNAME, String.class, Errore.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "codice", scope = Errore.class)
    public JAXBElement<String> createErroreCodice(String value) {
        return new JAXBElement<String>(_EsitoCodice_QNAME, String.class, Errore.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "pin", scope = GetPinAssistitoResponse.class)
    public JAXBElement<String> createGetPinAssistitoResponsePin(String value) {
        return new JAXBElement<String>(_BoRigeneraPinResponsePin_QNAME, String.class, GetPinAssistitoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Errore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", name = "errore", scope = GetPinAssistitoResponse.class)
    public JAXBElement<Errore> createGetPinAssistitoResponseErrore(Errore value) {
        return new JAXBElement<Errore>(_RicercaErogazioniAssistitoResponseErrore_QNAME, Errore.class, GetPinAssistitoResponse.class, value);
    }

}
