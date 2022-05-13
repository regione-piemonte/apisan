/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta package. 
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

    private final static QName _ScaricaPdfRicettaRequest_QNAME = new QName("http://dmacc.csi.it/", "scaricaPdfRicettaRequest");
    private final static QName _ScaricaPdfRicettaResponse_QNAME = new QName("http://dmacc.csi.it/", "scaricaPdfRicettaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ScaricaPdfRicettaResponse }
     * 
     */
    public ScaricaPdfRicettaResponse createScaricaPdfRicettaResponse() {
        return new ScaricaPdfRicettaResponse();
    }

    /**
     * Create an instance of {@link ScaricaPdfRicettaRequest }
     * 
     */
    public ScaricaPdfRicettaRequest createScaricaPdfRicettaRequest() {
        return new ScaricaPdfRicettaRequest();
    }

    /**
     * Create an instance of {@link EstremiPaziente }
     * 
     */
    public EstremiPaziente createEstremiPaziente() {
        return new EstremiPaziente();
    }

    /**
     * Create an instance of {@link InformazioniRichiedente }
     * 
     */
    public InformazioniRichiedente createInformazioniRichiedente() {
        return new InformazioniRichiedente();
    }

    /**
     * Create an instance of {@link Richiedente }
     * 
     */
    public Richiedente createRichiedente() {
        return new Richiedente();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link Errore }
     * 
     */
    public Errore createErrore() {
        return new Errore();
    }

    /**
     * Create an instance of {@link EstremiRicetta }
     * 
     */
    public EstremiRicetta createEstremiRicetta() {
        return new EstremiRicetta();
    }

    /**
     * Create an instance of {@link ListaErroriType }
     * 
     */
    public ListaErroriType createListaErroriType() {
        return new ListaErroriType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScaricaPdfRicettaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "scaricaPdfRicettaRequest")
    public JAXBElement<ScaricaPdfRicettaRequest> createScaricaPdfRicettaRequest(ScaricaPdfRicettaRequest value) {
        return new JAXBElement<ScaricaPdfRicettaRequest>(_ScaricaPdfRicettaRequest_QNAME, ScaricaPdfRicettaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScaricaPdfRicettaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "scaricaPdfRicettaResponse")
    public JAXBElement<ScaricaPdfRicettaResponse> createScaricaPdfRicettaResponse(ScaricaPdfRicettaResponse value) {
        return new JAXBElement<ScaricaPdfRicettaResponse>(_ScaricaPdfRicettaResponse_QNAME, ScaricaPdfRicettaResponse.class, null, value);
    }

}
