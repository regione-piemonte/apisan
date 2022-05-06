/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.arruolamento.dma;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.apisan.apisanfse.integration.arruolamento.dma package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.apisan.apisanfse.integration.arruolamento.dma
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IsArruolabile }
     * 
     */
    public IsArruolabile createIsArruolabile() {
        return new IsArruolabile();
    }

    /**
     * Create an instance of {@link FascicoloArruolabile }
     * 
     */
    public FascicoloArruolabile createFascicoloArruolabile() {
        return new FascicoloArruolabile();
    }

    /**
     * Create an instance of {@link IsArruolabileResponse }
     * 
     */
    public IsArruolabileResponse createIsArruolabileResponse() {
        return new IsArruolabileResponse();
    }

    /**
     * Create an instance of {@link RichiedenteArruolamento }
     * 
     */
    public RichiedenteArruolamento createRichiedenteArruolamento() {
        return new RichiedenteArruolamento();
    }

}
