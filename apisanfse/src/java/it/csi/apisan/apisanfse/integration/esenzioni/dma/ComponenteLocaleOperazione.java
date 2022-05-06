/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.esenzioni.dma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per componenteLocaleOperazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="componenteLocaleOperazione">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dma.csi.it/}codifica">
 *       &lt;sequence>
 *         &lt;element name="TimeoutMaxElaborazione" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "componenteLocaleOperazione", propOrder = {
    "timeoutMaxElaborazione"
})
public class ComponenteLocaleOperazione
    extends Codifica
{

    @XmlElement(name = "TimeoutMaxElaborazione")
    protected Long timeoutMaxElaborazione;

    /**
     * Recupera il valore della proprietà timeoutMaxElaborazione.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeoutMaxElaborazione() {
        return timeoutMaxElaborazione;
    }

    /**
     * Imposta il valore della proprietà timeoutMaxElaborazione.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeoutMaxElaborazione(Long value) {
        this.timeoutMaxElaborazione = value;
    }

}
