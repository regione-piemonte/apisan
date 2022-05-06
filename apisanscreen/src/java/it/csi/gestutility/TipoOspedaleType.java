/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestutility;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TipoOspedaleType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TipoOspedaleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codTipoOspedale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="desTipoOspedale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="validita" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoOspedaleType", propOrder = {
    "codTipoOspedale",
    "desTipoOspedale",
    "validita"
})
public class TipoOspedaleType {

    @XmlElement(required = true)
    protected String codTipoOspedale;
    @XmlElement(required = true)
    protected String desTipoOspedale;
    @XmlElement(required = true)
    protected String validita;

    /**
     * Recupera il valore della proprietà codTipoOspedale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoOspedale() {
        return codTipoOspedale;
    }

    /**
     * Imposta il valore della proprietà codTipoOspedale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoOspedale(String value) {
        this.codTipoOspedale = value;
    }

    /**
     * Recupera il valore della proprietà desTipoOspedale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesTipoOspedale() {
        return desTipoOspedale;
    }

    /**
     * Imposta il valore della proprietà desTipoOspedale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesTipoOspedale(String value) {
        this.desTipoOspedale = value;
    }

    /**
     * Recupera il valore della proprietà validita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidita() {
        return validita;
    }

    /**
     * Imposta il valore della proprietà validita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidita(String value) {
        this.validita = value;
    }

}
