/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.pro.elenconrenascosti;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.apisan.apisanpresc.soap.pro.elenconrenascosti package. 
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

    private final static QName _ElencoNreNascostiRequest_QNAME = new QName("http://dmapro.csi.it/", "elencoNreNascostiRequest");
    private final static QName _ElencoNreNascostiResponse_QNAME = new QName("http://dmapro.csi.it/", "elencoNreNascostiResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.apisan.apisanpresc.soap.pro.elenconrenascosti
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
     * Create an instance of {@link ListaErroriType }
     * 
     */
    public ListaErroriType createListaErroriType() {
        return new ListaErroriType();
    }

    /**
     * Create an instance of {@link ElencoNreNascosti }
     * 
     */
    public ElencoNreNascosti createElencoNreNascosti() {
        return new ElencoNreNascosti();
    }

    /**
     * Create an instance of {@link ElencoNreNascostiResponse }
     * 
     */
    public ElencoNreNascostiResponse createElencoNreNascostiResponse() {
        return new ElencoNreNascostiResponse();
    }

    /**
     * Create an instance of {@link EstremiPaziente }
     * 
     */
    public EstremiPaziente createEstremiPaziente() {
        return new EstremiPaziente();
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
     * Create an instance of {@link ListaNreType }
     * 
     */
    public ListaNreType createListaNreType() {
        return new ListaNreType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElencoNreNascosti }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmapro.csi.it/", name = "elencoNreNascostiRequest")
    public JAXBElement<ElencoNreNascosti> createElencoNreNascostiRequest(ElencoNreNascosti value) {
        return new JAXBElement<ElencoNreNascosti>(_ElencoNreNascostiRequest_QNAME, ElencoNreNascosti.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElencoNreNascostiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmapro.csi.it/", name = "elencoNreNascostiResponse")
    public JAXBElement<ElencoNreNascostiResponse> createElencoNreNascostiResponse(ElencoNreNascostiResponse value) {
        return new JAXBElement<ElencoNreNascostiResponse>(_ElencoNreNascostiResponse_QNAME, ElencoNreNascostiResponse.class, null, value);
    }

}
