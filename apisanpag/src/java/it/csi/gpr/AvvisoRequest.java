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
 * <p>Classe Java per AvvisoRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AvvisoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UUID_PTB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvvisoRequest", propOrder = {
    "gg",
    "ni",
    "uuidptb"
})
public class AvvisoRequest {

    @XmlElement(name = "GG")
    protected String gg;
    @XmlElement(name = "NI")
    protected String ni;
    @XmlElement(name = "UUID_PTB")
    protected String uuidptb;

    /**
     * Recupera il valore della proprieta gg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGG() {
        return gg;
    }

    /**
     * Imposta il valore della proprieta gg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGG(String value) {
        this.gg = value;
    }

    /**
     * Recupera il valore della proprieta ni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNI() {
        return ni;
    }

    /**
     * Imposta il valore della proprieta ni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNI(String value) {
        this.ni = value;
    }

    /**
     * Recupera il valore della proprieta uuidptb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUIDPTB() {
        return uuidptb;
    }

    /**
     * Imposta il valore della proprieta uuidptb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUIDPTB(String value) {
        this.uuidptb = value;
    }

}
