/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.vaccinazione;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.apisan.apisanvac.xml.vaccinazione package. 
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

    private final static QName _VaccinazioneEseguita_QNAME = new QName("", "VaccinazioneEseguita");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.apisan.apisanvac.xml.vaccinazione
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VaccinazioneEseguita }
     * 
     */
    public VaccinazioneEseguita createVaccinazioneEseguita() {
        return new VaccinazioneEseguita();
    }

    /**
     * Create an instance of {@link PostResult }
     * 
     */
    public PostResult createPostResult() {
        return new PostResult();
    }

    /**
     * Create an instance of {@link DTOPagato }
     * 
     */
    public DTOPagato createDTOPagato() {
        return new DTOPagato();
    }

    /**
     * Create an instance of {@link Associazione }
     * 
     */
    public Associazione createAssociazione() {
        return new Associazione();
    }

    /**
     * Create an instance of {@link ArrayOfAssociazione }
     * 
     */
    public ArrayOfAssociazione createArrayOfAssociazione() {
        return new ArrayOfAssociazione();
    }

    /**
     * Create an instance of {@link Vaccinazione }
     * 
     */
    public Vaccinazione createVaccinazione() {
        return new Vaccinazione();
    }

    /**
     * Create an instance of {@link Reazione }
     * 
     */
    public Reazione createReazione() {
        return new Reazione();
    }

    /**
     * Create an instance of {@link DTO }
     * 
     */
    public DTO createDTO() {
        return new DTO();
    }

    /**
     * Create an instance of {@link ArrayOfVaccinazione }
     * 
     */
    public ArrayOfVaccinazione createArrayOfVaccinazione() {
        return new ArrayOfVaccinazione();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VaccinazioneEseguita }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VaccinazioneEseguita")
    public JAXBElement<VaccinazioneEseguita> createVaccinazioneEseguita(VaccinazioneEseguita value) {
        return new JAXBElement<VaccinazioneEseguita>(_VaccinazioneEseguita_QNAME, VaccinazioneEseguita.class, null, value);
    }

}
