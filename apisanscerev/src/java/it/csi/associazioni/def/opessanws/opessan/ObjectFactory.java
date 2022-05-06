/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.associazioni.def.opessanws.opessan;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.def.opessanws.opessan package. 
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

    private final static QName _GetAssociazioniAggregazioni_QNAME = new QName("http://opessan.opessanws.def.csi.it/", "getAssociazioniAggregazioni");
    private final static QName _GetAssociazioniAggregazioniResponse_QNAME = new QName("http://opessan.opessanws.def.csi.it/", "getAssociazioniAggregazioniResponse");
    private final static QName _AssociazioniAggregazioniBodyDataInizio_QNAME = new QName("", "dataInizio");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.def.opessanws.opessan
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Associazioni }
     * 
     */
    public Associazioni createAssociazioni() {
        return new Associazioni();
    }

    /**
     * Create an instance of {@link GetAssociazioniAggregazioniResponse }
     * 
     */
    public GetAssociazioniAggregazioniResponse createGetAssociazioniAggregazioniResponse() {
        return new GetAssociazioniAggregazioniResponse();
    }

    /**
     * Create an instance of {@link GetAssociazioniAggregazioni }
     * 
     */
    public GetAssociazioniAggregazioni createGetAssociazioniAggregazioni() {
        return new GetAssociazioniAggregazioni();
    }

    /**
     * Create an instance of {@link ElencoAssociazioniAggregazioni }
     * 
     */
    public ElencoAssociazioniAggregazioni createElencoAssociazioniAggregazioni() {
        return new ElencoAssociazioniAggregazioni();
    }

    /**
     * Create an instance of {@link ElencoAssociazioniBody }
     * 
     */
    public ElencoAssociazioniBody createElencoAssociazioniBody() {
        return new ElencoAssociazioniBody();
    }

    /**
     * Create an instance of {@link RichiestaAssociazioniAggregazioni }
     * 
     */
    public RichiestaAssociazioniAggregazioni createRichiestaAssociazioniAggregazioni() {
        return new RichiestaAssociazioniAggregazioni();
    }

    /**
     * Create an instance of {@link AssociazioniAggregazioniBody }
     * 
     */
    public AssociazioniAggregazioniBody createAssociazioniAggregazioniBody() {
        return new AssociazioniAggregazioniBody();
    }

    /**
     * Create an instance of {@link InfoRapportoDiLavoro }
     * 
     */
    public InfoRapportoDiLavoro createInfoRapportoDiLavoro() {
        return new InfoRapportoDiLavoro();
    }

    /**
     * Create an instance of {@link InfoRapportiLavoro }
     * 
     */
    public InfoRapportiLavoro createInfoRapportiLavoro() {
        return new InfoRapportiLavoro();
    }

    /**
     * Create an instance of {@link Associazioni.AssociazioneAggregazione }
     * 
     */
    public Associazioni.AssociazioneAggregazione createAssociazioniAssociazioneAggregazione() {
        return new Associazioni.AssociazioneAggregazione();
    }

    /**
     * Create an instance of {@link GetAssociazioniAggregazioniResponse.Return }
     * 
     */
    public GetAssociazioniAggregazioniResponse.Return createGetAssociazioniAggregazioniResponseReturn() {
        return new GetAssociazioniAggregazioniResponse.Return();
    }

    /**
     * Create an instance of {@link GetAssociazioniAggregazioni.Arg0 }
     * 
     */
    public GetAssociazioniAggregazioni.Arg0 createGetAssociazioniAggregazioniArg0() {
        return new GetAssociazioniAggregazioni.Arg0();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssociazioniAggregazioni }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://opessan.opessanws.def.csi.it/", name = "getAssociazioniAggregazioni")
    public JAXBElement<GetAssociazioniAggregazioni> createGetAssociazioniAggregazioni(GetAssociazioniAggregazioni value) {
        return new JAXBElement<GetAssociazioniAggregazioni>(_GetAssociazioniAggregazioni_QNAME, GetAssociazioniAggregazioni.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssociazioniAggregazioniResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://opessan.opessanws.def.csi.it/", name = "getAssociazioniAggregazioniResponse")
    public JAXBElement<GetAssociazioniAggregazioniResponse> createGetAssociazioniAggregazioniResponse(GetAssociazioniAggregazioniResponse value) {
        return new JAXBElement<GetAssociazioniAggregazioniResponse>(_GetAssociazioniAggregazioniResponse_QNAME, GetAssociazioniAggregazioniResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dataInizio", scope = AssociazioniAggregazioniBody.class)
    public JAXBElement<XMLGregorianCalendar> createAssociazioniAggregazioniBodyDataInizio(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AssociazioniAggregazioniBodyDataInizio_QNAME, XMLGregorianCalendar.class, AssociazioniAggregazioniBody.class, value);
    }

}
