/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.screenserviziwebsol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Scr_Ana_01OutParametersType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Scr_Ana_01OutParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="pCognome" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pNome" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pTessSanitaria" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pDataNascita" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pComuneRes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pProvinciaRes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pIndirizzoRes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pNumCivRes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pCapRes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pComuneAlt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pProvinciaAlt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pIndirizzoAlt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pNumCivAlt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pCapAlt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pCodInterno" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pPrefInterno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pTelefono1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pTelefono2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pTelefonoLocale1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pTelefonolocale2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pEMail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pCodErrore" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pDesErr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pStato" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Scr_Ana_01OutParametersType")
public class ScrAna01OutParametersType {

    @XmlAttribute(name = "pCognome")
    protected String pCognome;
    @XmlAttribute(name = "pNome")
    protected String pNome;
    @XmlAttribute(name = "pTessSanitaria")
    protected String pTessSanitaria;
    @XmlAttribute(name = "pDataNascita")
    protected String pDataNascita;
    @XmlAttribute(name = "pComuneRes")
    protected String pComuneRes;
    @XmlAttribute(name = "pProvinciaRes")
    protected String pProvinciaRes;
    @XmlAttribute(name = "pIndirizzoRes")
    protected String pIndirizzoRes;
    @XmlAttribute(name = "pNumCivRes")
    protected String pNumCivRes;
    @XmlAttribute(name = "pCapRes")
    protected String pCapRes;
    @XmlAttribute(name = "pComuneAlt")
    protected String pComuneAlt;
    @XmlAttribute(name = "pProvinciaAlt")
    protected String pProvinciaAlt;
    @XmlAttribute(name = "pIndirizzoAlt")
    protected String pIndirizzoAlt;
    @XmlAttribute(name = "pNumCivAlt")
    protected String pNumCivAlt;
    @XmlAttribute(name = "pCapAlt")
    protected String pCapAlt;
    @XmlAttribute(name = "pCodInterno")
    protected Integer pCodInterno;
    @XmlAttribute(name = "pPrefInterno")
    protected String pPrefInterno;
    @XmlAttribute(name = "pTelefono1")
    protected String pTelefono1;
    @XmlAttribute(name = "pTelefono2")
    protected String pTelefono2;
    @XmlAttribute(name = "pTelefonoLocale1")
    protected String pTelefonoLocale1;
    @XmlAttribute(name = "pTelefonolocale2")
    protected String pTelefonolocale2;
    @XmlAttribute(name = "pEMail")
    protected String peMail;
    @XmlAttribute(name = "pCodErrore")
    protected Integer pCodErrore;
    @XmlAttribute(name = "pDesErr")
    protected String pDesErr;
    @XmlAttribute(name = "pStato")
    protected String pStato;

    /**
     * Recupera il valore della proprietà pCognome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCognome() {
        return pCognome;
    }

    /**
     * Imposta il valore della proprietà pCognome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCognome(String value) {
        this.pCognome = value;
    }

    /**
     * Recupera il valore della proprietà pNome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNome() {
        return pNome;
    }

    /**
     * Imposta il valore della proprietà pNome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNome(String value) {
        this.pNome = value;
    }

    /**
     * Recupera il valore della proprietà pTessSanitaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTessSanitaria() {
        return pTessSanitaria;
    }

    /**
     * Imposta il valore della proprietà pTessSanitaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTessSanitaria(String value) {
        this.pTessSanitaria = value;
    }

    /**
     * Recupera il valore della proprietà pDataNascita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDataNascita() {
        return pDataNascita;
    }

    /**
     * Imposta il valore della proprietà pDataNascita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDataNascita(String value) {
        this.pDataNascita = value;
    }

    /**
     * Recupera il valore della proprietà pComuneRes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPComuneRes() {
        return pComuneRes;
    }

    /**
     * Imposta il valore della proprietà pComuneRes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPComuneRes(String value) {
        this.pComuneRes = value;
    }

    /**
     * Recupera il valore della proprietà pProvinciaRes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPProvinciaRes() {
        return pProvinciaRes;
    }

    /**
     * Imposta il valore della proprietà pProvinciaRes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPProvinciaRes(String value) {
        this.pProvinciaRes = value;
    }

    /**
     * Recupera il valore della proprietà pIndirizzoRes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIndirizzoRes() {
        return pIndirizzoRes;
    }

    /**
     * Imposta il valore della proprietà pIndirizzoRes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIndirizzoRes(String value) {
        this.pIndirizzoRes = value;
    }

    /**
     * Recupera il valore della proprietà pNumCivRes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNumCivRes() {
        return pNumCivRes;
    }

    /**
     * Imposta il valore della proprietà pNumCivRes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNumCivRes(String value) {
        this.pNumCivRes = value;
    }

    /**
     * Recupera il valore della proprietà pCapRes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCapRes() {
        return pCapRes;
    }

    /**
     * Imposta il valore della proprietà pCapRes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCapRes(String value) {
        this.pCapRes = value;
    }

    /**
     * Recupera il valore della proprietà pComuneAlt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPComuneAlt() {
        return pComuneAlt;
    }

    /**
     * Imposta il valore della proprietà pComuneAlt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPComuneAlt(String value) {
        this.pComuneAlt = value;
    }

    /**
     * Recupera il valore della proprietà pProvinciaAlt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPProvinciaAlt() {
        return pProvinciaAlt;
    }

    /**
     * Imposta il valore della proprietà pProvinciaAlt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPProvinciaAlt(String value) {
        this.pProvinciaAlt = value;
    }

    /**
     * Recupera il valore della proprietà pIndirizzoAlt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIndirizzoAlt() {
        return pIndirizzoAlt;
    }

    /**
     * Imposta il valore della proprietà pIndirizzoAlt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIndirizzoAlt(String value) {
        this.pIndirizzoAlt = value;
    }

    /**
     * Recupera il valore della proprietà pNumCivAlt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNumCivAlt() {
        return pNumCivAlt;
    }

    /**
     * Imposta il valore della proprietà pNumCivAlt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNumCivAlt(String value) {
        this.pNumCivAlt = value;
    }

    /**
     * Recupera il valore della proprietà pCapAlt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCapAlt() {
        return pCapAlt;
    }

    /**
     * Imposta il valore della proprietà pCapAlt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCapAlt(String value) {
        this.pCapAlt = value;
    }

    /**
     * Recupera il valore della proprietà pCodInterno.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPCodInterno() {
        return pCodInterno;
    }

    /**
     * Imposta il valore della proprietà pCodInterno.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPCodInterno(Integer value) {
        this.pCodInterno = value;
    }

    /**
     * Recupera il valore della proprietà pPrefInterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPrefInterno() {
        return pPrefInterno;
    }

    /**
     * Imposta il valore della proprietà pPrefInterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPrefInterno(String value) {
        this.pPrefInterno = value;
    }

    /**
     * Recupera il valore della proprietà pTelefono1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTelefono1() {
        return pTelefono1;
    }

    /**
     * Imposta il valore della proprietà pTelefono1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTelefono1(String value) {
        this.pTelefono1 = value;
    }

    /**
     * Recupera il valore della proprietà pTelefono2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTelefono2() {
        return pTelefono2;
    }

    /**
     * Imposta il valore della proprietà pTelefono2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTelefono2(String value) {
        this.pTelefono2 = value;
    }

    /**
     * Recupera il valore della proprietà pTelefonoLocale1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTelefonoLocale1() {
        return pTelefonoLocale1;
    }

    /**
     * Imposta il valore della proprietà pTelefonoLocale1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTelefonoLocale1(String value) {
        this.pTelefonoLocale1 = value;
    }

    /**
     * Recupera il valore della proprietà pTelefonolocale2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTelefonolocale2() {
        return pTelefonolocale2;
    }

    /**
     * Imposta il valore della proprietà pTelefonolocale2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTelefonolocale2(String value) {
        this.pTelefonolocale2 = value;
    }

    /**
     * Recupera il valore della proprietà peMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPEMail() {
        return peMail;
    }

    /**
     * Imposta il valore della proprietà peMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPEMail(String value) {
        this.peMail = value;
    }

    /**
     * Recupera il valore della proprietà pCodErrore.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPCodErrore() {
        return pCodErrore;
    }

    /**
     * Imposta il valore della proprietà pCodErrore.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPCodErrore(Integer value) {
        this.pCodErrore = value;
    }

    /**
     * Recupera il valore della proprietà pDesErr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDesErr() {
        return pDesErr;
    }

    /**
     * Imposta il valore della proprietà pDesErr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDesErr(String value) {
        this.pDesErr = value;
    }

    /**
     * Recupera il valore della proprietà pStato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPStato() {
        return pStato;
    }

    /**
     * Imposta il valore della proprietà pStato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPStato(String value) {
        this.pStato = value;
    }

}
