/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.aura.auraws.services.central.ricercateam;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.aura.auraws.services.central.ricercateam package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.aura.auraws.services.central.ricercateam
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RicercaTEAMResponse }
     * 
     */
    public RicercaTEAMResponse createRicercaTEAMResponse() {
        return new RicercaTEAMResponse();
    }

    /**
     * Create an instance of {@link RicercaTEAM }
     * 
     */
    public RicercaTEAM createRicercaTEAM() {
        return new RicercaTEAM();
    }

}
