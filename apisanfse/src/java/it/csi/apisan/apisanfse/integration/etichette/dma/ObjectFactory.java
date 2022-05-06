/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.etichette.dma;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.apisan.apisanfse.integration.etichette.dma package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.apisan.apisanfse.integration.etichette.dma
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListaIdEtichette }
     * 
     */
    public ListaIdEtichette createListaIdEtichette() {
        return new ListaIdEtichette();
    }

    /**
     * Create an instance of {@link Ruolo }
     * 
     */
    public Ruolo createRuolo() {
        return new Ruolo();
    }

    /**
     * Create an instance of {@link Etichetta }
     * 
     */
    public Etichetta createEtichetta() {
        return new Etichetta();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link Documento }
     * 
     */
    public Documento createDocumento() {
        return new Documento();
    }

    /**
     * Create an instance of {@link RichiedenteInfo }
     * 
     */
    public RichiedenteInfo createRichiedenteInfo() {
        return new RichiedenteInfo();
    }

    /**
     * Create an instance of {@link ListaEtichette }
     * 
     */
    public ListaEtichette createListaEtichette() {
        return new ListaEtichette();
    }

}
