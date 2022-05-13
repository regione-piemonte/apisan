/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.dma.elencoricetteservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.apisan.apisanpresc.soap.dma.elencoricetteservice package. 
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

    private final static QName _ElencoRicetteStampaPromemoriaResponse_QNAME = new QName("http://dmacc.csi.it/", "elencoRicetteStampaPromemoriaResponse");
    private final static QName _ElencoRicetteStampaPromemoriaRequest_QNAME = new QName("http://dmacc.csi.it/", "elencoRicetteStampaPromemoriaRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.apisan.apisanpresc.soap.dma.elencoricetteservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListaRicetteType }
     * 
     */
    public ListaRicetteType createListaRicetteType() {
        return new ListaRicetteType();
    }

    /**
     * Create an instance of {@link TipoRicetta }
     * 
     */
    public TipoRicetta createTipoRicetta() {
        return new TipoRicetta();
    }

    /**
     * Create an instance of {@link StatoRicetta }
     * 
     */
    public StatoRicetta createStatoRicetta() {
        return new StatoRicetta();
    }

    /**
     * Create an instance of {@link Errore }
     * 
     */
    public Errore createErrore() {
        return new Errore();
    }

    /**
     * Create an instance of {@link FiltroRicette }
     * 
     */
    public FiltroRicette createFiltroRicette() {
        return new FiltroRicette();
    }

    /**
     * Create an instance of {@link ListaErroriType }
     * 
     */
    public ListaErroriType createListaErroriType() {
        return new ListaErroriType();
    }

    /**
     * Create an instance of {@link Ricetta }
     * 
     */
    public Ricetta createRicetta() {
        return new Ricetta();
    }

    /**
     * Create an instance of {@link ElencoRicetteStampaPromemoriaRequest }
     * 
     */
    public ElencoRicetteStampaPromemoriaRequest createElencoRicetteStampaPromemoriaRequest() {
        return new ElencoRicetteStampaPromemoriaRequest();
    }

    /**
     * Create an instance of {@link ElencoRicetteStampaPromemoriaResponse }
     * 
     */
    public ElencoRicetteStampaPromemoriaResponse createElencoRicetteStampaPromemoriaResponse() {
        return new ElencoRicetteStampaPromemoriaResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ElencoRicetteStampaPromemoriaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "elencoRicetteStampaPromemoriaResponse")
    public JAXBElement<ElencoRicetteStampaPromemoriaResponse> createElencoRicetteStampaPromemoriaResponse(ElencoRicetteStampaPromemoriaResponse value) {
        return new JAXBElement<ElencoRicetteStampaPromemoriaResponse>(_ElencoRicetteStampaPromemoriaResponse_QNAME, ElencoRicetteStampaPromemoriaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElencoRicetteStampaPromemoriaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "elencoRicetteStampaPromemoriaRequest")
    public JAXBElement<ElencoRicetteStampaPromemoriaRequest> createElencoRicetteStampaPromemoriaRequest(ElencoRicetteStampaPromemoriaRequest value) {
        return new JAXBElement<ElencoRicetteStampaPromemoriaRequest>(_ElencoRicetteStampaPromemoriaRequest_QNAME, ElencoRicetteStampaPromemoriaRequest.class, null, value);
    }

}
