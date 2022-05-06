/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per richiedente complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="richiedente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicativoVerticale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificativoIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroTransazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ruolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "richiedente", propOrder = {
    "applicativoVerticale",
    "applicazione",
    "codiceFiscale",
    "identificativoIp",
    "numeroTransazione",
    "regime",
    "ruolo"
})
public class Richiedente {

    @XmlElement(namespace = "")
    protected String applicativoVerticale;
    @XmlElement(namespace = "")
    protected String applicazione;
    @XmlElement(namespace = "")
    protected String codiceFiscale;
    @XmlElement(namespace = "")
    protected String identificativoIp;
    @XmlElement(namespace = "")
    protected String numeroTransazione;
    @XmlElement(namespace = "")
    protected String regime;
    @XmlElement(namespace = "")
    protected String ruolo;

    /**
     * Recupera il valore della proprietà applicativoVerticale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicativoVerticale() {
        return applicativoVerticale;
    }

    /**
     * Imposta il valore della proprietà applicativoVerticale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicativoVerticale(String value) {
        this.applicativoVerticale = value;
    }

    /**
     * Recupera il valore della proprietà applicazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicazione() {
        return applicazione;
    }

    /**
     * Imposta il valore della proprietà applicazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicazione(String value) {
        this.applicazione = value;
    }

    /**
     * Recupera il valore della proprietà codiceFiscale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    /**
     * Imposta il valore della proprietà codiceFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscale(String value) {
        this.codiceFiscale = value;
    }

    /**
     * Recupera il valore della proprietà identificativoIp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificativoIp() {
        return identificativoIp;
    }

    /**
     * Imposta il valore della proprietà identificativoIp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificativoIp(String value) {
        this.identificativoIp = value;
    }

    /**
     * Recupera il valore della proprietà numeroTransazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTransazione() {
        return numeroTransazione;
    }

    /**
     * Imposta il valore della proprietà numeroTransazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTransazione(String value) {
        this.numeroTransazione = value;
    }

    /**
     * Recupera il valore della proprietà regime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegime() {
        return regime;
    }

    /**
     * Imposta il valore della proprietà regime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegime(String value) {
        this.regime = value;
    }

    /**
     * Recupera il valore della proprietà ruolo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuolo() {
        return ruolo;
    }

    /**
     * Imposta il valore della proprietà ruolo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuolo(String value) {
        this.ruolo = value;
    }

}
