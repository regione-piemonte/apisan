/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.operatori.def.opessanws.opessan;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
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

    private final static QName _FindOperatoriPerAssociazione_QNAME = new QName("http://opessan.opessanws.def.csi.it/", "findOperatoriPerAssociazione");
    private final static QName _FindOperatoriPerAssociazioneResponse_QNAME = new QName("http://opessan.opessanws.def.csi.it/", "findOperatoriPerAssociazioneResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.def.opessanws.opessan
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindOperatoriPerAssociazione }
     * 
     */
    public FindOperatoriPerAssociazione createFindOperatoriPerAssociazione() {
        return new FindOperatoriPerAssociazione();
    }

    /**
     * Create an instance of {@link FindOperatoriPerAssociazioneResponse }
     * 
     */
    public FindOperatoriPerAssociazioneResponse createFindOperatoriPerAssociazioneResponse() {
        return new FindOperatoriPerAssociazioneResponse();
    }

    /**
     * Create an instance of {@link ElencoOperatoriPerAssociazione }
     * 
     */
    public ElencoOperatoriPerAssociazione createElencoOperatoriPerAssociazione() {
        return new ElencoOperatoriPerAssociazione();
    }

    /**
     * Create an instance of {@link ElencoOperatoriBody }
     * 
     */
    public ElencoOperatoriBody createElencoOperatoriBody() {
        return new ElencoOperatoriBody();
    }

    /**
     * Create an instance of {@link RichiestaOperatoriAssociazione }
     * 
     */
    public RichiestaOperatoriAssociazione createRichiestaOperatoriAssociazione() {
        return new RichiestaOperatoriAssociazione();
    }

    /**
     * Create an instance of {@link AssociazioneBody }
     * 
     */
    public AssociazioneBody createAssociazioneBody() {
        return new AssociazioneBody();
    }

    /**
     * Create an instance of {@link Associazione }
     * 
     */
    public Associazione createAssociazione() {
        return new Associazione();
    }

    /**
     * Create an instance of {@link ElencoOperatori }
     * 
     */
    public ElencoOperatori createElencoOperatori() {
        return new ElencoOperatori();
    }

    /**
     * Create an instance of {@link RapportoLavoro }
     * 
     */
    public RapportoLavoro createRapportoLavoro() {
        return new RapportoLavoro();
    }

    /**
     * Create an instance of {@link Operatore }
     * 
     */
    public Operatore createOperatore() {
        return new Operatore();
    }

    /**
     * Create an instance of {@link RapportiLavoro }
     * 
     */
    public RapportiLavoro createRapportiLavoro() {
        return new RapportiLavoro();
    }

    /**
     * Create an instance of {@link FindOperatoriPerAssociazione.Arg0 }
     * 
     */
    public FindOperatoriPerAssociazione.Arg0 createFindOperatoriPerAssociazioneArg0() {
        return new FindOperatoriPerAssociazione.Arg0();
    }

    /**
     * Create an instance of {@link FindOperatoriPerAssociazioneResponse.Return }
     * 
     */
    public FindOperatoriPerAssociazioneResponse.Return createFindOperatoriPerAssociazioneResponseReturn() {
        return new FindOperatoriPerAssociazioneResponse.Return();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOperatoriPerAssociazione }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://opessan.opessanws.def.csi.it/", name = "findOperatoriPerAssociazione")
    public JAXBElement<FindOperatoriPerAssociazione> createFindOperatoriPerAssociazione(FindOperatoriPerAssociazione value) {
        return new JAXBElement<FindOperatoriPerAssociazione>(_FindOperatoriPerAssociazione_QNAME, FindOperatoriPerAssociazione.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOperatoriPerAssociazioneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://opessan.opessanws.def.csi.it/", name = "findOperatoriPerAssociazioneResponse")
    public JAXBElement<FindOperatoriPerAssociazioneResponse> createFindOperatoriPerAssociazioneResponse(FindOperatoriPerAssociazioneResponse value) {
        return new JAXBElement<FindOperatoriPerAssociazioneResponse>(_FindOperatoriPerAssociazioneResponse_QNAME, FindOperatoriPerAssociazioneResponse.class, null, value);
    }

}
