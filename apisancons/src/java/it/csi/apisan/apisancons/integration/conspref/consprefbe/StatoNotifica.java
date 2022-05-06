/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.integration.conspref.consprefbe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per statoNotifica complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="statoNotifica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codASR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dipartimentale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statoConsenso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statoNotifica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statoDecodificato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statoNotifica", propOrder = {
    "consId",
    "uuid",
    "codASR",
    "dipartimentale",
    "statoConsenso",
    "statoNotifica",
    "statoDecodificato"
})
public class StatoNotifica {

    protected Integer consId;
    protected String uuid;
    protected String codASR;
    protected String dipartimentale;
    protected String statoConsenso;
    protected String statoNotifica;
    protected String statoDecodificato;

    /**
     * Recupera il valore della proprietà consId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsId() {
        return consId;
    }

    /**
     * Imposta il valore della proprietà consId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsId(Integer value) {
        this.consId = value;
    }

    /**
     * Recupera il valore della proprietà uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Imposta il valore della proprietà uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Recupera il valore della proprietà codASR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodASR() {
        return codASR;
    }

    /**
     * Imposta il valore della proprietà codASR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodASR(String value) {
        this.codASR = value;
    }

    /**
     * Recupera il valore della proprietà dipartimentale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDipartimentale() {
        return dipartimentale;
    }

    /**
     * Imposta il valore della proprietà dipartimentale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDipartimentale(String value) {
        this.dipartimentale = value;
    }

    /**
     * Recupera il valore della proprietà statoConsenso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatoConsenso() {
        return statoConsenso;
    }

    /**
     * Imposta il valore della proprietà statoConsenso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatoConsenso(String value) {
        this.statoConsenso = value;
    }

    /**
     * Recupera il valore della proprietà statoNotifica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatoNotifica() {
        return statoNotifica;
    }

    /**
     * Imposta il valore della proprietà statoNotifica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatoNotifica(String value) {
        this.statoNotifica = value;
    }

    /**
     * Recupera il valore della proprietà statoDecodificato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatoDecodificato() {
        return statoDecodificato;
    }

    /**
     * Imposta il valore della proprietà statoDecodificato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatoDecodificato(String value) {
        this.statoDecodificato = value;
    }

}
