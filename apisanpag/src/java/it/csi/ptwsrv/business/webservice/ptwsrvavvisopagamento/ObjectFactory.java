/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.ptwsrv.business.webservice.ptwsrvavvisopagamento;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.ptwsrv.business.webservice.ptwsrvavvisopagamento package. 
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

    private final static QName _AvvisoPagamento_QNAME = new QName("http://ptwsrvavvisopagamento.webservice.business.ptwsrv.csi.it/", "avvisoPagamento");
    private final static QName _AvvisoPagamentoResponse_QNAME = new QName("http://ptwsrvavvisopagamento.webservice.business.ptwsrv.csi.it/", "avvisoPagamentoResponse");
    private final static QName _AvvisoPagamentoException_QNAME = new QName("http://ptwsrvavvisopagamento.webservice.business.ptwsrv.csi.it/", "AvvisoPagamentoException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.ptwsrv.business.webservice.ptwsrvavvisopagamento
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AvvisoPagamento }
     * 
     */
    public AvvisoPagamento createAvvisoPagamento() {
        return new AvvisoPagamento();
    }

    /**
     * Create an instance of {@link AvvisoPagamentoResponse }
     * 
     */
    public AvvisoPagamentoResponse createAvvisoPagamentoResponse() {
        return new AvvisoPagamentoResponse();
    }

    /**
     * Create an instance of {@link AvvisoPagamentoException }
     * 
     */
    public AvvisoPagamentoException createAvvisoPagamentoException() {
        return new AvvisoPagamentoException();
    }

    /**
     * Create an instance of {@link ItemStampaAvvisoPagamento }
     * 
     */
    public ItemStampaAvvisoPagamento createItemStampaAvvisoPagamento() {
        return new ItemStampaAvvisoPagamento();
    }

    /**
     * Create an instance of {@link OutputAvvisoPagamento }
     * 
     */
    public OutputAvvisoPagamento createOutputAvvisoPagamento() {
        return new OutputAvvisoPagamento();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvvisoPagamento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ptwsrvavvisopagamento.webservice.business.ptwsrv.csi.it/", name = "avvisoPagamento")
    public JAXBElement<AvvisoPagamento> createAvvisoPagamento(AvvisoPagamento value) {
        return new JAXBElement<AvvisoPagamento>(_AvvisoPagamento_QNAME, AvvisoPagamento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvvisoPagamentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ptwsrvavvisopagamento.webservice.business.ptwsrv.csi.it/", name = "avvisoPagamentoResponse")
    public JAXBElement<AvvisoPagamentoResponse> createAvvisoPagamentoResponse(AvvisoPagamentoResponse value) {
        return new JAXBElement<AvvisoPagamentoResponse>(_AvvisoPagamentoResponse_QNAME, AvvisoPagamentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvvisoPagamentoException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ptwsrvavvisopagamento.webservice.business.ptwsrv.csi.it/", name = "AvvisoPagamentoException")
    public JAXBElement<AvvisoPagamentoException> createAvvisoPagamentoException(AvvisoPagamentoException value) {
        return new JAXBElement<AvvisoPagamentoException>(_AvvisoPagamentoException_QNAME, AvvisoPagamentoException.class, null, value);
    }

}
