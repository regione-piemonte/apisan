/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.sar.brokerservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per decryptCodAss complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="decryptCodAss">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "decryptCodAss", propOrder = {
    "codass"
})
public class DecryptCodAss {

    protected String codass;

    /**
     * Recupera il valore della property codass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodass() {
        return codass;
    }

    /**
     * Imposta il valore della property codass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodass(String value) {
        this.codass = value;
    }

}
