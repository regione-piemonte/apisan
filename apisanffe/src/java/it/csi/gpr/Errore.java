/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Errore complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Errore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODICE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MESSAGGIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Errore", propOrder = {
    "codice",
    "messaggio"
})
public class Errore {

    @XmlElement(name = "CODICE", required = true)
    protected String codice;
    @XmlElement(name = "MESSAGGIO")
    protected String messaggio;

    /**
     * Recupera il valore della proprietà codice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICE() {
        return codice;
    }

    /**
     * Imposta il valore della proprietà codice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICE(String value) {
        this.codice = value;
    }

    /**
     * Recupera il valore della proprietà messaggio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESSAGGIO() {
        return messaggio;
    }

    /**
     * Imposta il valore della proprietà messaggio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESSAGGIO(String value) {
        this.messaggio = value;
    }

}
