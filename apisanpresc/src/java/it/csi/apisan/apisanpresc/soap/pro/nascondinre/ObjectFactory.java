/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.pro.nascondinre;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.apisan.apisanpresc.soap.pro.nascondinre package. 
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

    private final static QName _NascondiNreResponse_QNAME = new QName("http://dmapro.csi.it/", "nascondiNreResponse");
    private final static QName _NascondiNreRequest_QNAME = new QName("http://dmapro.csi.it/", "nascondiNreRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.apisan.apisanpresc.soap.pro.nascondinre
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link NascondiNreResponse }
     * 
     */
    public NascondiNreResponse createNascondiNreResponse() {
        return new NascondiNreResponse();
    }

    /**
     * Create an instance of {@link NascondiNre }
     * 
     */
    public NascondiNre createNascondiNre() {
        return new NascondiNre();
    }

    /**
     * Create an instance of {@link EstremiPaziente }
     * 
     */
    public EstremiPaziente createEstremiPaziente() {
        return new EstremiPaziente();
    }

    /**
     * Create an instance of {@link Operazione }
     * 
     */
    public Operazione createOperazione() {
        return new Operazione();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link NascondiNreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmapro.csi.it/", name = "nascondiNreResponse")
    public JAXBElement<NascondiNreResponse> createNascondiNreResponse(NascondiNreResponse value) {
        return new JAXBElement<NascondiNreResponse>(_NascondiNreResponse_QNAME, NascondiNreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NascondiNre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmapro.csi.it/", name = "nascondiNreRequest")
    public JAXBElement<NascondiNre> createNascondiNreRequest(NascondiNre value) {
        return new JAXBElement<NascondiNre>(_NascondiNreRequest_QNAME, NascondiNre.class, null, value);
    }

}
