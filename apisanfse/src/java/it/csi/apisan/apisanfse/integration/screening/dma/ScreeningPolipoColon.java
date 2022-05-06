/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.screening.dma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per screeningPolipoColon complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="screeningPolipoColon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="polipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sede" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dimensione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="polipectomiaBiopsia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recupero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dimIsto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoIsto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displasia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "screeningPolipoColon", propOrder = {
    "polipo",
    "tipo",
    "sede",
    "dimensione",
    "polipectomiaBiopsia",
    "recupero",
    "dimIsto",
    "tipoIsto",
    "displasia"
})
public class ScreeningPolipoColon {

    protected String polipo;
    protected String tipo;
    protected String sede;
    protected String dimensione;
    protected String polipectomiaBiopsia;
    protected String recupero;
    protected String dimIsto;
    protected String tipoIsto;
    protected String displasia;

    /**
     * Recupera il valore della proprietà polipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolipo() {
        return polipo;
    }

    /**
     * Imposta il valore della proprietà polipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolipo(String value) {
        this.polipo = value;
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

    /**
     * Recupera il valore della proprietà sede.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSede() {
        return sede;
    }

    /**
     * Imposta il valore della proprietà sede.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSede(String value) {
        this.sede = value;
    }

    /**
     * Recupera il valore della proprietà dimensione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensione() {
        return dimensione;
    }

    /**
     * Imposta il valore della proprietà dimensione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensione(String value) {
        this.dimensione = value;
    }

    /**
     * Recupera il valore della proprietà polipectomiaBiopsia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolipectomiaBiopsia() {
        return polipectomiaBiopsia;
    }

    /**
     * Imposta il valore della proprietà polipectomiaBiopsia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolipectomiaBiopsia(String value) {
        this.polipectomiaBiopsia = value;
    }

    /**
     * Recupera il valore della proprietà recupero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecupero() {
        return recupero;
    }

    /**
     * Imposta il valore della proprietà recupero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecupero(String value) {
        this.recupero = value;
    }

    /**
     * Recupera il valore della proprietà dimIsto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimIsto() {
        return dimIsto;
    }

    /**
     * Imposta il valore della proprietà dimIsto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimIsto(String value) {
        this.dimIsto = value;
    }

    /**
     * Recupera il valore della proprietà tipoIsto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIsto() {
        return tipoIsto;
    }

    /**
     * Imposta il valore della proprietà tipoIsto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIsto(String value) {
        this.tipoIsto = value;
    }

    /**
     * Recupera il valore della proprietà displasia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplasia() {
        return displasia;
    }

    /**
     * Imposta il valore della proprietà displasia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplasia(String value) {
        this.displasia = value;
    }

}
