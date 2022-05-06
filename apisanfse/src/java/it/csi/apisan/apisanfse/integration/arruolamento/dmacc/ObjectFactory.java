/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.arruolamento.dmacc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import it.csi.apisan.apisanfse.integration.arruolamento.dma.FascicoloArruolabile;
import it.csi.apisan.apisanfse.integration.arruolamento.dma.IsArruolabile;
import it.csi.apisan.apisanfse.integration.arruolamento.dma.IsArruolabileResponse;
import it.csi.apisan.apisanfse.integration.arruolamento.dma.RichiedenteArruolamento;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.apisan.apisanfse.integration.arruolamento.dmacc package. 
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

    private final static QName _IsArruolabileResponse_QNAME = new QName("http://dmacc.csi.it/", "isArruolabileResponse");
    private final static QName _RichiedenteArruolamento_QNAME = new QName("http://dmacc.csi.it/", "richiedenteArruolamento");
    private final static QName _GetPreferenzeArruolabilita_QNAME = new QName("http://dmacc.csi.it/", "getPreferenzeArruolabilita");
    private final static QName _SetPreferenzeArruolabilitaResponse_QNAME = new QName("http://dmacc.csi.it/", "setPreferenzeArruolabilitaResponse");
    private final static QName _Exception_QNAME = new QName("http://dmacc.csi.it/", "Exception");
    private final static QName _SetPreferenzeConsultazione_QNAME = new QName("http://dmacc.csi.it/", "setPreferenzeConsultazione");
    private final static QName _GetPreferenzeArruolabilitaResponse_QNAME = new QName("http://dmacc.csi.it/", "getPreferenzeArruolabilitaResponse");
    private final static QName _SetPreferenzeConsultazioneResponse_QNAME = new QName("http://dmacc.csi.it/", "setPreferenzeConsultazioneResponse");
    private final static QName _IsArruolabile_QNAME = new QName("http://dmacc.csi.it/", "isArruolabile");
    private final static QName _SetPreferenzeArruolabilita_QNAME = new QName("http://dmacc.csi.it/", "setPreferenzeArruolabilita");
    private final static QName _FascicoloArruolabile_QNAME = new QName("http://dmacc.csi.it/", "fascicoloArruolabile");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.apisan.apisanfse.integration.arruolamento.dmacc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsArruolabileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "isArruolabileResponse")
    public JAXBElement<IsArruolabileResponse> createIsArruolabileResponse(IsArruolabileResponse value) {
        return new JAXBElement<IsArruolabileResponse>(_IsArruolabileResponse_QNAME, IsArruolabileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RichiedenteArruolamento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "richiedenteArruolamento")
    public JAXBElement<RichiedenteArruolamento> createRichiedenteArruolamento(RichiedenteArruolamento value) {
        return new JAXBElement<RichiedenteArruolamento>(_RichiedenteArruolamento_QNAME, RichiedenteArruolamento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getPreferenzeArruolabilita")
    public JAXBElement<String> createGetPreferenzeArruolabilita(String value) {
        return new JAXBElement<String>(_GetPreferenzeArruolabilita_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "setPreferenzeArruolabilitaResponse")
    public JAXBElement<String> createSetPreferenzeArruolabilitaResponse(String value) {
        return new JAXBElement<String>(_SetPreferenzeArruolabilitaResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "setPreferenzeConsultazione")
    public JAXBElement<String> createSetPreferenzeConsultazione(String value) {
        return new JAXBElement<String>(_SetPreferenzeConsultazione_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "getPreferenzeArruolabilitaResponse")
    public JAXBElement<String> createGetPreferenzeArruolabilitaResponse(String value) {
        return new JAXBElement<String>(_GetPreferenzeArruolabilitaResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "setPreferenzeConsultazioneResponse")
    public JAXBElement<String> createSetPreferenzeConsultazioneResponse(String value) {
        return new JAXBElement<String>(_SetPreferenzeConsultazioneResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsArruolabile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "isArruolabile")
    public JAXBElement<IsArruolabile> createIsArruolabile(IsArruolabile value) {
        return new JAXBElement<IsArruolabile>(_IsArruolabile_QNAME, IsArruolabile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "setPreferenzeArruolabilita")
    public JAXBElement<String> createSetPreferenzeArruolabilita(String value) {
        return new JAXBElement<String>(_SetPreferenzeArruolabilita_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloArruolabile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "fascicoloArruolabile")
    public JAXBElement<FascicoloArruolabile> createFascicoloArruolabile(FascicoloArruolabile value) {
        return new JAXBElement<FascicoloArruolabile>(_FascicoloArruolabile_QNAME, FascicoloArruolabile.class, null, value);
    }

}
