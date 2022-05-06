/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.vaccinazionesclusa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.apisan.apisanvac.xml.vaccinazionesclusa package. 
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

    private final static QName _VaccinazioneEsclusa_QNAME = new QName("", "VaccinazioneEsclusa");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.apisan.apisanvac.xml.vaccinazionesclusa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VaccinazioneEsclusa }
     * 
     */
    public VaccinazioneEsclusa createVaccinazioneEsclusa() {
        return new VaccinazioneEsclusa();
    }

    /**
     * Create an instance of {@link ArrayOfDTOVaccinazioneEsclusa }
     * 
     */
    public ArrayOfDTOVaccinazioneEsclusa createArrayOfDTOVaccinazioneEsclusa() {
        return new ArrayOfDTOVaccinazioneEsclusa();
    }

    /**
     * Create an instance of {@link DTOVaccinazioneEsclusa }
     * 
     */
    public DTOVaccinazioneEsclusa createDTOVaccinazioneEsclusa() {
        return new DTOVaccinazioneEsclusa();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VaccinazioneEsclusa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VaccinazioneEsclusa")
    public JAXBElement<VaccinazioneEsclusa> createVaccinazioneEsclusa(VaccinazioneEsclusa value) {
        return new JAXBElement<VaccinazioneEsclusa>(_VaccinazioneEsclusa_QNAME, VaccinazioneEsclusa.class, null, value);
    }

}
