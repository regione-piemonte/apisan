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
 * <p>Classe Java per CausaleType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CausaleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiceCausale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descrizioneCausale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoEsclusione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="durataEsclusione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="controlliContesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codStatoDestinazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CausaleType", propOrder = {
    "codiceCausale",
    "descrizioneCausale",
    "tipoEsclusione",
    "durataEsclusione",
    "controlliContesto",
    "codStatoDestinazione"
})
public class CausaleType {

    @XmlElement(required = true)
    protected String codiceCausale;
    @XmlElement(required = true)
    protected String descrizioneCausale;
    protected String tipoEsclusione;
    protected String durataEsclusione;
    protected String controlliContesto;
    protected String codStatoDestinazione;

    /**
     * Recupera il valore della proprietà codiceCausale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceCausale() {
        return codiceCausale;
    }

    /**
     * Imposta il valore della proprietà codiceCausale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceCausale(String value) {
        this.codiceCausale = value;
    }

    /**
     * Recupera il valore della proprietà descrizioneCausale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneCausale() {
        return descrizioneCausale;
    }

    /**
     * Imposta il valore della proprietà descrizioneCausale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneCausale(String value) {
        this.descrizioneCausale = value;
    }

    /**
     * Recupera il valore della proprietà tipoEsclusione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEsclusione() {
        return tipoEsclusione;
    }

    /**
     * Imposta il valore della proprietà tipoEsclusione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEsclusione(String value) {
        this.tipoEsclusione = value;
    }

    /**
     * Recupera il valore della proprietà durataEsclusione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurataEsclusione() {
        return durataEsclusione;
    }

    /**
     * Imposta il valore della proprietà durataEsclusione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurataEsclusione(String value) {
        this.durataEsclusione = value;
    }

    /**
     * Recupera il valore della proprietà controlliContesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlliContesto() {
        return controlliContesto;
    }

    /**
     * Imposta il valore della proprietà controlliContesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlliContesto(String value) {
        this.controlliContesto = value;
    }

    /**
     * Recupera il valore della proprietà codStatoDestinazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodStatoDestinazione() {
        return codStatoDestinazione;
    }

    /**
     * Imposta il valore della proprietà codStatoDestinazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodStatoDestinazione(String value) {
        this.codStatoDestinazione = value;
    }

}
