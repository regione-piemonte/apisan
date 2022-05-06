/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.appuntamentivaccinali;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.apisan.apisanvac.xml.appuntamentivaccinali package. 
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

    private final static QName _AppuntamentiVaccinali_QNAME = new QName("", "AppuntamentiVaccinali");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.apisan.apisanvac.xml.appuntamentivaccinali
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AppuntamentiVaccinali }
     * 
     */
    public AppuntamentiVaccinali createAppuntamentiVaccinali() {
        return new AppuntamentiVaccinali();
    }

    /**
     * Create an instance of {@link DTOVaccino }
     * 
     */
    public DTOVaccino createDTOVaccino() {
        return new DTOVaccino();
    }

    /**
     * Create an instance of {@link ArrayOfDTOConvocazione }
     * 
     */
    public ArrayOfDTOConvocazione createArrayOfDTOConvocazione() {
        return new ArrayOfDTOConvocazione();
    }

    /**
     * Create an instance of {@link DTOConvocazione }
     * 
     */
    public DTOConvocazione createDTOConvocazione() {
        return new DTOConvocazione();
    }

    /**
     * Create an instance of {@link ArrayOfDTOVaccino }
     * 
     */
    public ArrayOfDTOVaccino createArrayOfDTOVaccino() {
        return new ArrayOfDTOVaccino();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppuntamentiVaccinali }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AppuntamentiVaccinali")
    public JAXBElement<AppuntamentiVaccinali> createAppuntamentiVaccinali(AppuntamentiVaccinali value) {
        return new JAXBElement<AppuntamentiVaccinali>(_AppuntamentiVaccinali_QNAME, AppuntamentiVaccinali.class, null, value);
    }

}
