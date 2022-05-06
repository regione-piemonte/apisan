/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.oscuramento.dmacc;

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

    private final static QName _SetOscuramentoResponse_QNAME = new QName("http://dmacc.csi.it/", "setOscuramentoResponse");
    private final static QName _SetOscuramento_QNAME = new QName("http://dmacc.csi.it/", "setOscuramento");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.dmacc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetOscuramento }
     * 
     */
    public SetOscuramento createSetOscuramento() {
        return new SetOscuramento();
    }

    /**
     * Create an instance of {@link SetOscuramentoResponse }
     * 
     */
    public SetOscuramentoResponse createSetOscuramentoResponse() {
        return new SetOscuramentoResponse();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SetOscuramentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "setOscuramentoResponse")
    public JAXBElement<SetOscuramentoResponse> createSetOscuramentoResponse(SetOscuramentoResponse value) {
        return new JAXBElement<SetOscuramentoResponse>(_SetOscuramentoResponse_QNAME, SetOscuramentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetOscuramento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "setOscuramento")
    public JAXBElement<SetOscuramento> createSetOscuramento(SetOscuramento value) {
        return new JAXBElement<SetOscuramento>(_SetOscuramento_QNAME, SetOscuramento.class, null, value);
    }

}
