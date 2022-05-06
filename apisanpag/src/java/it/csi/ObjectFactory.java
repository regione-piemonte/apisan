/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi package. 
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

    private final static QName _ElencoRicevutePagamentiOnorati_QNAME = new QName("http://csi.it", "elencoRicevutePagamentiOnorati");
    private final static QName _ElencoTicketPagati_QNAME = new QName("http://csi.it", "elencoTicketPagati");
    private final static QName _ElencoRimborsiPagamento_QNAME = new QName("http://csi.it", "elencoRimborsiPagamento");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LmsGetRimborsiPagamentoByPratica }
     * 
     */
    public LmsGetRimborsiPagamentoByPratica createLmsGetRimborsiPagamentoByPratica() {
        return new LmsGetRimborsiPagamentoByPratica();
    }

    /**
     * Create an instance of {@link ElencoRimborsiPagamento }
     * 
     */
    public ElencoRimborsiPagamento createElencoRimborsiPagamento() {
        return new ElencoRimborsiPagamento();
    }

    /**
     * Create an instance of {@link LmsGetRicevutePagamentiOnoratiByPratica }
     * 
     */
    public LmsGetRicevutePagamentiOnoratiByPratica createLmsGetRicevutePagamentiOnoratiByPratica() {
        return new LmsGetRicevutePagamentiOnoratiByPratica();
    }

    /**
     * Create an instance of {@link ElencoTicketPagati }
     * 
     */
    public ElencoTicketPagati createElencoTicketPagati() {
        return new ElencoTicketPagati();
    }

    /**
     * Create an instance of {@link LmsGetTicketPagatiFunc }
     * 
     */
    public LmsGetTicketPagatiFunc createLmsGetTicketPagatiFunc() {
        return new LmsGetTicketPagatiFunc();
    }

    /**
     * Create an instance of {@link ElencoRicevutePagamentiOnorati }
     * 
     */
    public ElencoRicevutePagamentiOnorati createElencoRicevutePagamentiOnorati() {
        return new ElencoRicevutePagamentiOnorati();
    }

    /**
     * Create an instance of {@link RICEVUTAPAGAMENTO }
     * 
     */
    public RICEVUTAPAGAMENTO createRICEVUTAPAGAMENTO() {
        return new RICEVUTAPAGAMENTO();
    }

    /**
     * Create an instance of {@link RIMBORSOPAGAMENTO }
     * 
     */
    public RIMBORSOPAGAMENTO createRIMBORSOPAGAMENTO() {
        return new RIMBORSOPAGAMENTO();
    }

    /**
     * Create an instance of {@link PRATICA }
     * 
     */
    public PRATICA createPRATICA() {
        return new PRATICA();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElencoRicevutePagamentiOnorati }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "elencoRicevutePagamentiOnorati")
    public JAXBElement<ElencoRicevutePagamentiOnorati> createElencoRicevutePagamentiOnorati(ElencoRicevutePagamentiOnorati value) {
        return new JAXBElement<ElencoRicevutePagamentiOnorati>(_ElencoRicevutePagamentiOnorati_QNAME, ElencoRicevutePagamentiOnorati.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElencoTicketPagati }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "elencoTicketPagati")
    public JAXBElement<ElencoTicketPagati> createElencoTicketPagati(ElencoTicketPagati value) {
        return new JAXBElement<ElencoTicketPagati>(_ElencoTicketPagati_QNAME, ElencoTicketPagati.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElencoRimborsiPagamento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://csi.it", name = "elencoRimborsiPagamento")
    public JAXBElement<ElencoRimborsiPagamento> createElencoRimborsiPagamento(ElencoRimborsiPagamento value) {
        return new JAXBElement<ElencoRimborsiPagamento>(_ElencoRimborsiPagamento_QNAME, ElencoRimborsiPagamento.class, null, value);
    }

}
