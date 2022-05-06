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
 * <p>Classe Java per tipoSpazioRiservatoType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="tipoSpazioRiservatoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pkSpazioRiservato" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descSpazioRiservato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codSpazioRiservato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoSpazioRiservatoType", propOrder = {
    "pkSpazioRiservato",
    "descSpazioRiservato",
    "valido",
    "codSpazioRiservato",
    "tipo"
})
public class TipoSpazioRiservatoType {

    protected int pkSpazioRiservato;
    @XmlElement(required = true)
    protected String descSpazioRiservato;
    protected String valido;
    protected String codSpazioRiservato;
    @XmlElement(required = true)
    protected String tipo;

    /**
     * Recupera il valore della proprietà pkSpazioRiservato.
     * 
     */
    public int getPkSpazioRiservato() {
        return pkSpazioRiservato;
    }

    /**
     * Imposta il valore della proprietà pkSpazioRiservato.
     * 
     */
    public void setPkSpazioRiservato(int value) {
        this.pkSpazioRiservato = value;
    }

    /**
     * Recupera il valore della proprietà descSpazioRiservato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescSpazioRiservato() {
        return descSpazioRiservato;
    }

    /**
     * Imposta il valore della proprietà descSpazioRiservato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescSpazioRiservato(String value) {
        this.descSpazioRiservato = value;
    }

    /**
     * Recupera il valore della proprietà valido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValido() {
        return valido;
    }

    /**
     * Imposta il valore della proprietà valido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValido(String value) {
        this.valido = value;
    }

    /**
     * Recupera il valore della proprietà codSpazioRiservato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodSpazioRiservato() {
        return codSpazioRiservato;
    }

    /**
     * Imposta il valore della proprietà codSpazioRiservato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodSpazioRiservato(String value) {
        this.codSpazioRiservato = value;
    }

    /**
     * Recupera il valore della proprietà tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Imposta il valore della proprietà tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

}
