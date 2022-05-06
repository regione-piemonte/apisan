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
 * <p>Classe Java per CalendarioAziendaType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CalendarioAziendaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codAzienda" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="descAzienda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codGiorniProg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descGiorniProg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validita" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="oraProg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarioAziendaType", propOrder = {
    "codAzienda",
    "descAzienda",
    "codGiorniProg",
    "descGiorniProg",
    "validita",
    "oraProg"
})
public class CalendarioAziendaType {

    protected long codAzienda;
    @XmlElement(required = true)
    protected String descAzienda;
    protected String codGiorniProg;
    protected String descGiorniProg;
    protected Integer validita;
    protected String oraProg;

    /**
     * Recupera il valore della proprietà codAzienda.
     * 
     */
    public long getCodAzienda() {
        return codAzienda;
    }

    /**
     * Imposta il valore della proprietà codAzienda.
     * 
     */
    public void setCodAzienda(long value) {
        this.codAzienda = value;
    }

    /**
     * Recupera il valore della proprietà descAzienda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescAzienda() {
        return descAzienda;
    }

    /**
     * Imposta il valore della proprietà descAzienda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescAzienda(String value) {
        this.descAzienda = value;
    }

    /**
     * Recupera il valore della proprietà codGiorniProg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodGiorniProg() {
        return codGiorniProg;
    }

    /**
     * Imposta il valore della proprietà codGiorniProg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodGiorniProg(String value) {
        this.codGiorniProg = value;
    }

    /**
     * Recupera il valore della proprietà descGiorniProg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescGiorniProg() {
        return descGiorniProg;
    }

    /**
     * Imposta il valore della proprietà descGiorniProg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescGiorniProg(String value) {
        this.descGiorniProg = value;
    }

    /**
     * Recupera il valore della proprietà validita.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValidita() {
        return validita;
    }

    /**
     * Imposta il valore della proprietà validita.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValidita(Integer value) {
        this.validita = value;
    }

    /**
     * Recupera il valore della proprietà oraProg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOraProg() {
        return oraProg;
    }

    /**
     * Imposta il valore della proprietà oraProg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOraProg(String value) {
        this.oraProg = value;
    }

}
