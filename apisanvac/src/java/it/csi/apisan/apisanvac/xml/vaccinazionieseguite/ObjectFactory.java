/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.vaccinazionieseguite;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.apisan.apisanvac.xml.vaccinazionieseguite package. 
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

    private final static QName _VaccinazioniEseguite_QNAME = new QName("", "VaccinazioniEseguite");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.apisan.apisanvac.xml.vaccinazionieseguite
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VaccinazioniEseguite }
     * 
     */
    public VaccinazioniEseguite createVaccinazioniEseguite() {
        return new VaccinazioniEseguite();
    }

    /**
     * Create an instance of {@link DTOSegnalazioneReazioniAvverse }
     * 
     */
    public DTOSegnalazioneReazioniAvverse createDTOSegnalazioneReazioniAvverse() {
        return new DTOSegnalazioneReazioniAvverse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VaccinazioniEseguite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VaccinazioniEseguite")
    public JAXBElement<VaccinazioniEseguite> createVaccinazioniEseguite(VaccinazioniEseguite value) {
        return new JAXBElement<VaccinazioniEseguite>(_VaccinazioniEseguite_QNAME, VaccinazioniEseguite.class, null, value);
    }

}
