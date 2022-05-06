/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.ScaricoStudiWSBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ScaricoStudiRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ScaricoStudiRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiceFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fuoriRegione" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="idReferto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="periodoConservazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strutturaSanitaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sistemaOperativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acessionNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="asr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScaricoStudiRequest", propOrder = {
    "codiceFiscale",
    "email",
    "fuoriRegione",
    "idReferto",
    "periodoConservazione",
    "pin",
    "strutturaSanitaria",
    "sistemaOperativo",
    "acessionNumbers",
    "asr"
})
public class ScaricoStudiRequest {

    protected String codiceFiscale;
    protected String email;
    protected Boolean fuoriRegione;
    protected String idReferto;
    protected String periodoConservazione;
    protected String pin;
    protected String strutturaSanitaria;
    protected String sistemaOperativo;
    protected String acessionNumbers;
    protected String asr;

    /**
     * Recupera il valore della propriet� codiceFiscale.
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
     * Imposta il valore della propriet� codiceFiscale.
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
     * Recupera il valore della propriet� email.
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
     * Imposta il valore della propriet� email.
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
     * Recupera il valore della propriet� fuoriRegione.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFuoriRegione() {
        return fuoriRegione;
    }

    /**
     * Imposta il valore della propriet� fuoriRegione.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFuoriRegione(Boolean value) {
        this.fuoriRegione = value;
    }

    /**
     * Recupera il valore della propriet� idReferto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdReferto() {
        return idReferto;
    }

    /**
     * Imposta il valore della propriet� idReferto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdReferto(String value) {
        this.idReferto = value;
    }

    /**
     * Recupera il valore della propriet� periodoConservazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodoConservazione() {
        return periodoConservazione;
    }

    /**
     * Imposta il valore della propriet� periodoConservazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodoConservazione(String value) {
        this.periodoConservazione = value;
    }

    /**
     * Recupera il valore della propriet� pin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Imposta il valore della propriet� pin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
    }

    /**
     * Recupera il valore della propriet� strutturaSanitaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrutturaSanitaria() {
        return strutturaSanitaria;
    }

    /**
     * Imposta il valore della propriet� strutturaSanitaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrutturaSanitaria(String value) {
        this.strutturaSanitaria = value;
    }

    /**
     * Recupera il valore della propriet� sistemaOperativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    /**
     * Imposta il valore della propriet� sistemaOperativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistemaOperativo(String value) {
        this.sistemaOperativo = value;
    }

    /**
     * Recupera il valore della propriet� acessionNumbers.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcessionNumbers() {
        return acessionNumbers;
    }

    /**
     * Imposta il valore della propriet� acessionNumbers.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcessionNumbers(String value) {
        this.acessionNumbers = value;
    }

    /**
     * Recupera il valore della propriet� asr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsr() {
        return asr;
    }

    /**
     * Imposta il valore della propriet� asr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsr(String value) {
        this.asr = value;
    }

}
