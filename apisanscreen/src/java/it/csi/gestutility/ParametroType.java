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
 * <p>Classe Java per ParametroType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ParametroType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idParametro" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descParametro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nomeParametro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sezione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valParametro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParametroType", propOrder = {
    "idParametro",
    "descParametro",
    "nomeParametro",
    "sezione",
    "valParametro"
})
public class ParametroType {

    protected int idParametro;
    @XmlElement(required = true)
    protected String descParametro;
    @XmlElement(required = true)
    protected String nomeParametro;
    @XmlElement(required = true)
    protected String sezione;
    @XmlElement(required = true)
    protected String valParametro;

    /**
     * Recupera il valore della proprietà idParametro.
     * 
     */
    public int getIdParametro() {
        return idParametro;
    }

    /**
     * Imposta il valore della proprietà idParametro.
     * 
     */
    public void setIdParametro(int value) {
        this.idParametro = value;
    }

    /**
     * Recupera il valore della proprietà descParametro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescParametro() {
        return descParametro;
    }

    /**
     * Imposta il valore della proprietà descParametro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescParametro(String value) {
        this.descParametro = value;
    }

    /**
     * Recupera il valore della proprietà nomeParametro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeParametro() {
        return nomeParametro;
    }

    /**
     * Imposta il valore della proprietà nomeParametro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeParametro(String value) {
        this.nomeParametro = value;
    }

    /**
     * Recupera il valore della proprietà sezione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSezione() {
        return sezione;
    }

    /**
     * Imposta il valore della proprietà sezione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSezione(String value) {
        this.sezione = value;
    }

    /**
     * Recupera il valore della proprietà valParametro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValParametro() {
        return valParametro;
    }

    /**
     * Imposta il valore della proprietà valParametro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValParametro(String value) {
        this.valParametro = value;
    }

}
