/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.consensoini.dmacc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


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

    private final static QName _StatoConsensi_QNAME = new QName("http://dmacc.csi.it/", "statoConsensi");
    private final static QName _ComunicazioneConsensi_QNAME = new QName("http://dmacc.csi.it/", "comunicazioneConsensi");
    private final static QName _RecuperoInformativaResponse_QNAME = new QName("http://dmacc.csi.it/", "recuperoInformativaResponse");
    private final static QName _StatoConsensiResponse_QNAME = new QName("http://dmacc.csi.it/", "statoConsensiResponse");
    private final static QName _ComunicazioneConsensiResponse_QNAME = new QName("http://dmacc.csi.it/", "comunicazioneConsensiResponse");
    private final static QName _RecuperoInformativa_QNAME = new QName("http://dmacc.csi.it/", "recuperoInformativa");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.dmacc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ComunicazioneConsensiResponse }
     * 
     */
    public ComunicazioneConsensiResponse createComunicazioneConsensiResponse() {
        return new ComunicazioneConsensiResponse();
    }

    /**
     * Create an instance of {@link RecuperoInformativaExtRequeste }
     * 
     */
    public RecuperoInformativaExtRequeste createRecuperoInformativaExtRequeste() {
        return new RecuperoInformativaExtRequeste();
    }

    /**
     * Create an instance of {@link StatoConsensiExtRequeste }
     * 
     */
    public StatoConsensiExtRequeste createStatoConsensiExtRequeste() {
        return new StatoConsensiExtRequeste();
    }

    /**
     * Create an instance of {@link ComunicazioneConsensiExtRequeste }
     * 
     */
    public ComunicazioneConsensiExtRequeste createComunicazioneConsensiExtRequeste() {
        return new ComunicazioneConsensiExtRequeste();
    }

    /**
     * Create an instance of {@link StatoConsensiResponse }
     * 
     */
    public StatoConsensiResponse createStatoConsensiResponse() {
        return new StatoConsensiResponse();
    }

    /**
     * Create an instance of {@link RecuperoInformativaResponse }
     * 
     */
    public RecuperoInformativaResponse createRecuperoInformativaResponse() {
        return new RecuperoInformativaResponse();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatoConsensiExtRequeste }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "statoConsensi")
    public JAXBElement<StatoConsensiExtRequeste> createStatoConsensi(StatoConsensiExtRequeste value) {
        return new JAXBElement<StatoConsensiExtRequeste>(_StatoConsensi_QNAME, StatoConsensiExtRequeste.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComunicazioneConsensiExtRequeste }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "comunicazioneConsensi")
    public JAXBElement<ComunicazioneConsensiExtRequeste> createComunicazioneConsensi(ComunicazioneConsensiExtRequeste value) {
        return new JAXBElement<ComunicazioneConsensiExtRequeste>(_ComunicazioneConsensi_QNAME, ComunicazioneConsensiExtRequeste.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperoInformativaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "recuperoInformativaResponse")
    public JAXBElement<RecuperoInformativaResponse> createRecuperoInformativaResponse(RecuperoInformativaResponse value) {
        return new JAXBElement<RecuperoInformativaResponse>(_RecuperoInformativaResponse_QNAME, RecuperoInformativaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatoConsensiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "statoConsensiResponse")
    public JAXBElement<StatoConsensiResponse> createStatoConsensiResponse(StatoConsensiResponse value) {
        return new JAXBElement<StatoConsensiResponse>(_StatoConsensiResponse_QNAME, StatoConsensiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComunicazioneConsensiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "comunicazioneConsensiResponse")
    public JAXBElement<ComunicazioneConsensiResponse> createComunicazioneConsensiResponse(ComunicazioneConsensiResponse value) {
        return new JAXBElement<ComunicazioneConsensiResponse>(_ComunicazioneConsensiResponse_QNAME, ComunicazioneConsensiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperoInformativaExtRequeste }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "recuperoInformativa")
    public JAXBElement<RecuperoInformativaExtRequeste> createRecuperoInformativa(RecuperoInformativaExtRequeste value) {
        return new JAXBElement<RecuperoInformativaExtRequeste>(_RecuperoInformativa_QNAME, RecuperoInformativaExtRequeste.class, null, value);
    }

}
