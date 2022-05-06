/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per dieta complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="dieta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="colazioneDescrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colazioneCalorie" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pranzoDescrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pranzoCalorie" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cenaDescrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cenaCalorie" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="spuntiniDescrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spuntiniCalorie" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dieta", propOrder = {
    "data",
    "colazioneDescrizione",
    "colazioneCalorie",
    "pranzoDescrizione",
    "pranzoCalorie",
    "cenaDescrizione",
    "cenaCalorie",
    "spuntiniDescrizione",
    "spuntiniCalorie"
})
public class Dieta {

    @XmlElement(namespace = "")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;
    @XmlElement(namespace = "")
    protected String colazioneDescrizione;
    @XmlElement(namespace = "")
    protected Integer colazioneCalorie;
    @XmlElement(namespace = "")
    protected String pranzoDescrizione;
    @XmlElement(namespace = "")
    protected Integer pranzoCalorie;
    @XmlElement(namespace = "")
    protected String cenaDescrizione;
    @XmlElement(namespace = "")
    protected Integer cenaCalorie;
    @XmlElement(namespace = "")
    protected String spuntiniDescrizione;
    @XmlElement(namespace = "")
    protected Integer spuntiniCalorie;

    /**
     * Recupera il valore della proprietà data.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Imposta il valore della proprietà data.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * Recupera il valore della proprietà colazioneDescrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColazioneDescrizione() {
        return colazioneDescrizione;
    }

    /**
     * Imposta il valore della proprietà colazioneDescrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColazioneDescrizione(String value) {
        this.colazioneDescrizione = value;
    }

    /**
     * Recupera il valore della proprietà colazioneCalorie.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getColazioneCalorie() {
        return colazioneCalorie;
    }

    /**
     * Imposta il valore della proprietà colazioneCalorie.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setColazioneCalorie(Integer value) {
        this.colazioneCalorie = value;
    }

    /**
     * Recupera il valore della proprietà pranzoDescrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPranzoDescrizione() {
        return pranzoDescrizione;
    }

    /**
     * Imposta il valore della proprietà pranzoDescrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPranzoDescrizione(String value) {
        this.pranzoDescrizione = value;
    }

    /**
     * Recupera il valore della proprietà pranzoCalorie.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPranzoCalorie() {
        return pranzoCalorie;
    }

    /**
     * Imposta il valore della proprietà pranzoCalorie.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPranzoCalorie(Integer value) {
        this.pranzoCalorie = value;
    }

    /**
     * Recupera il valore della proprietà cenaDescrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenaDescrizione() {
        return cenaDescrizione;
    }

    /**
     * Imposta il valore della proprietà cenaDescrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenaDescrizione(String value) {
        this.cenaDescrizione = value;
    }

    /**
     * Recupera il valore della proprietà cenaCalorie.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCenaCalorie() {
        return cenaCalorie;
    }

    /**
     * Imposta il valore della proprietà cenaCalorie.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCenaCalorie(Integer value) {
        this.cenaCalorie = value;
    }

    /**
     * Recupera il valore della proprietà spuntiniDescrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpuntiniDescrizione() {
        return spuntiniDescrizione;
    }

    /**
     * Imposta il valore della proprietà spuntiniDescrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpuntiniDescrizione(String value) {
        this.spuntiniDescrizione = value;
    }

    /**
     * Recupera il valore della proprietà spuntiniCalorie.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpuntiniCalorie() {
        return spuntiniCalorie;
    }

    /**
     * Imposta il valore della proprietà spuntiniCalorie.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpuntiniCalorie(Integer value) {
        this.spuntiniCalorie = value;
    }

}
