/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.def.opessanws.opessan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per StudioMedico complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StudioMedico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="denominazione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="qualifica" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="indicatoreAmbCondiviso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="indicatoreAmbPubblico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="indirizzo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numCivico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comune" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codASL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telPrimario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telSecondario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giorniApertura" type="{http://opessan.opessanws.def.csi.it/}GiorniApertura" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudioMedico", propOrder = {
    "denominazione",
    "qualifica",
    "tipo",
    "indicatoreAmbCondiviso",
    "indicatoreAmbPubblico",
    "indirizzo",
    "numCivico",
    "comune",
    "cap",
    "codASL",
    "asl",
    "email",
    "telPrimario",
    "telSecondario",
    "giorniApertura"
})
public class StudioMedico {

    @XmlElement(required = true)
    protected String denominazione;
    @XmlElement(required = true)
    protected String qualifica;
    protected int tipo;
    @XmlElement(required = true)
    protected String indicatoreAmbCondiviso;
    @XmlElement(required = true)
    protected String indicatoreAmbPubblico;
    @XmlElement(required = true)
    protected String indirizzo;
    @XmlElement(required = true)
    protected String numCivico;
    @XmlElement(required = true)
    protected String comune;
    protected String cap;
    protected String codASL;
    @XmlElement(name = "ASL")
    protected String asl;
    @XmlElement(required = true)
    protected String email;
    protected String telPrimario;
    protected String telSecondario;
    protected GiorniApertura giorniApertura;

    /**
     * Recupera il valore della proprietà denominazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenominazione() {
        return denominazione;
    }

    /**
     * Imposta il valore della proprietà denominazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenominazione(String value) {
        this.denominazione = value;
    }

    /**
     * Recupera il valore della proprietà qualifica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifica() {
        return qualifica;
    }

    /**
     * Imposta il valore della proprietà qualifica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifica(String value) {
        this.qualifica = value;
    }

    /**
     * Recupera il valore della proprietà tipo.
     * 
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * Imposta il valore della proprietà tipo.
     * 
     */
    public void setTipo(int value) {
        this.tipo = value;
    }

    /**
     * Recupera il valore della proprietà indicatoreAmbCondiviso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicatoreAmbCondiviso() {
        return indicatoreAmbCondiviso;
    }

    /**
     * Imposta il valore della proprietà indicatoreAmbCondiviso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicatoreAmbCondiviso(String value) {
        this.indicatoreAmbCondiviso = value;
    }

    /**
     * Recupera il valore della proprietà indicatoreAmbPubblico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicatoreAmbPubblico() {
        return indicatoreAmbPubblico;
    }

    /**
     * Imposta il valore della proprietà indicatoreAmbPubblico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicatoreAmbPubblico(String value) {
        this.indicatoreAmbPubblico = value;
    }

    /**
     * Recupera il valore della proprietà indirizzo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndirizzo() {
        return indirizzo;
    }

    /**
     * Imposta il valore della proprietà indirizzo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndirizzo(String value) {
        this.indirizzo = value;
    }

    /**
     * Recupera il valore della proprietà numCivico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCivico() {
        return numCivico;
    }

    /**
     * Imposta il valore della proprietà numCivico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCivico(String value) {
        this.numCivico = value;
    }

    /**
     * Recupera il valore della proprietà comune.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComune() {
        return comune;
    }

    /**
     * Imposta il valore della proprietà comune.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComune(String value) {
        this.comune = value;
    }

    /**
     * Recupera il valore della proprietà cap.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCap() {
        return cap;
    }

    /**
     * Imposta il valore della proprietà cap.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCap(String value) {
        this.cap = value;
    }

    /**
     * Recupera il valore della proprietà codASL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodASL() {
        return codASL;
    }

    /**
     * Imposta il valore della proprietà codASL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodASL(String value) {
        this.codASL = value;
    }

    /**
     * Recupera il valore della proprietà asl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASL() {
        return asl;
    }

    /**
     * Imposta il valore della proprietà asl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASL(String value) {
        this.asl = value;
    }

    /**
     * Recupera il valore della proprietà email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Imposta il valore della proprietà email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Recupera il valore della proprietà telPrimario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelPrimario() {
        return telPrimario;
    }

    /**
     * Imposta il valore della proprietà telPrimario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelPrimario(String value) {
        this.telPrimario = value;
    }

    /**
     * Recupera il valore della proprietà telSecondario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelSecondario() {
        return telSecondario;
    }

    /**
     * Imposta il valore della proprietà telSecondario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelSecondario(String value) {
        this.telSecondario = value;
    }

    /**
     * Recupera il valore della proprietà giorniApertura.
     * 
     * @return
     *     possible object is
     *     {@link GiorniApertura }
     *     
     */
    public GiorniApertura getGiorniApertura() {
        return giorniApertura;
    }

    /**
     * Imposta il valore della proprietà giorniApertura.
     * 
     * @param value
     *     allowed object is
     *     {@link GiorniApertura }
     *     
     */
    public void setGiorniApertura(GiorniApertura value) {
        this.giorniApertura = value;
    }

}
