/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package org.wso2.ws.dataservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per NREDESCRIZIONE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="NREDESCRIZIONE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NRE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESCRIZIONE_STRUTTURA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NREDESCRIZIONE", propOrder = {
    "nre",
    "descrizionestruttura"
})
public class NREDESCRIZIONE {

    @XmlElement(name = "NRE", required = true, nillable = true)
    protected String nre;
    @XmlElement(name = "DESCRIZIONE_STRUTTURA", required = true, nillable = true)
    protected String descrizionestruttura;

    /**
     * Recupera il valore della proprieta nre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRE() {
        return nre;
    }

    /**
     * Imposta il valore della proprieta nre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRE(String value) {
        this.nre = value;
    }

    /**
     * Recupera il valore della proprieta descrizionestruttura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIZIONESTRUTTURA() {
        return descrizionestruttura;
    }

    /**
     * Imposta il valore della proprieta descrizionestruttura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIZIONESTRUTTURA(String value) {
        this.descrizionestruttura = value;
    }

}
