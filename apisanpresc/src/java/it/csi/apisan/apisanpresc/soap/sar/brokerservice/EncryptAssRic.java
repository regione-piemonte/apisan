/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.sar.brokerservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per encryptAssRic complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="encryptAssRic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assric" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "encryptAssRic", propOrder = {
    "assric"
})
public class EncryptAssRic {

    protected String assric;

    /**
     * Recupera il valore della property assric.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssric() {
        return assric;
    }

    /**
     * Imposta il valore della property assric.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssric(String value) {
        this.assric = value;
    }

}
