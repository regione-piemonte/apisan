/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.infodatiassistito;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.apisan.apisanvac.xml.infodatiassistito package. 
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

    private final static QName _InfoDatiAssistito_QNAME = new QName("", "Info_DatiAssistito");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.apisan.apisanvac.xml.infodatiassistito
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InfoDatiAssistito }
     * 
     */
    public InfoDatiAssistito createInfoDatiAssistito() {
        return new InfoDatiAssistito();
    }

    /**
     * Create an instance of {@link ArrayOfDTOVaccinoEssential }
     * 
     */
    public ArrayOfDTOVaccinoEssential createArrayOfDTOVaccinoEssential() {
        return new ArrayOfDTOVaccinoEssential();
    }

    /**
     * Create an instance of {@link DTOVaccinoEssential }
     * 
     */
    public DTOVaccinoEssential createDTOVaccinoEssential() {
        return new DTOVaccinoEssential();
    }

    /**
     * Create an instance of {@link DTODocumento }
     * 
     */
    public DTODocumento createDTODocumento() {
        return new DTODocumento();
    }

    /**
     * Create an instance of {@link DTOContatti }
     * 
     */
    public DTOContatti createDTOContatti() {
        return new DTOContatti();
    }

    /**
     * Create an instance of {@link ArrayOfDTODocumento }
     * 
     */
    public ArrayOfDTODocumento createArrayOfDTODocumento() {
        return new ArrayOfDTODocumento();
    }

    /**
     * Create an instance of {@link ResultSetPost }
     * 
     */
    public ResultSetPost createResultSetPost() {
        return new ResultSetPost();
    }

    /**
     * Create an instance of {@link SetContattoResult }
     * 
     */
    public SetContattoResult createSetContattoResult() {
        return new SetContattoResult();
    }

    /**
     * Create an instance of {@link Localita }
     * 
     */
    public Localita createLocalita() {
        return new Localita();
    }

    /**
     * Create an instance of {@link DTOPaziente }
     * 
     */
    public DTOPaziente createDTOPaziente() {
        return new DTOPaziente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoDatiAssistito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Info_DatiAssistito")
    public JAXBElement<InfoDatiAssistito> createInfoDatiAssistito(InfoDatiAssistito value) {
        return new JAXBElement<InfoDatiAssistito>(_InfoDatiAssistito_QNAME, InfoDatiAssistito.class, null, value);
    }

}
