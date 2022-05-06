/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.centrivaccinali;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.apisan.apisanvac.xml.centrivaccinali package. 
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

    private final static QName _CentriVaccinali_QNAME = new QName("", "CentriVaccinali");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.apisan.apisanvac.xml.centrivaccinali
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CentriVaccinali }
     * 
     */
    public CentriVaccinali createCentriVaccinali() {
        return new CentriVaccinali();
    }

    /**
     * Create an instance of {@link ArrayOfOrario }
     * 
     */
    public ArrayOfOrario createArrayOfOrario() {
        return new ArrayOfOrario();
    }

    /**
     * Create an instance of {@link Ambulatorio }
     * 
     */
    public Ambulatorio createAmbulatorio() {
        return new Ambulatorio();
    }

    /**
     * Create an instance of {@link Orario }
     * 
     */
    public Orario createOrario() {
        return new Orario();
    }

    /**
     * Create an instance of {@link ArrayOfAmbulatorio }
     * 
     */
    public ArrayOfAmbulatorio createArrayOfAmbulatorio() {
        return new ArrayOfAmbulatorio();
    }

    /**
     * Create an instance of {@link CentroVaccinale }
     * 
     */
    public CentroVaccinale createCentroVaccinale() {
        return new CentroVaccinale();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CentriVaccinali }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CentriVaccinali")
    public JAXBElement<CentriVaccinali> createCentriVaccinali(CentriVaccinali value) {
        return new JAXBElement<CentriVaccinali>(_CentriVaccinali_QNAME, CentriVaccinali.class, null, value);
    }

}
