/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.screenserviziwebsol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per Scr_App_01OutParametersType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Scr_App_01OutParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="pStatoAssistita" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pCodAgenda" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pCodDipartimento" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pDipartimento" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pCodAzienda" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pAzienda" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pCodUnpr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pUnitaOperativa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PIndirizzo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pNumeroCivico" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pComune" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pTipoUnpr" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pDataReinv" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="pLongitudine" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pLatitudine" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pTipovStradario" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pPrepStradario" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pViaStradario" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pCivicoStradario" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pComuneStradario" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pCodErrore" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pDesErr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Scr_App_01OutParametersType")
public class ScrApp01OutParametersType {

    @XmlAttribute(name = "pStatoAssistita")
    protected String pStatoAssistita;
    @XmlAttribute(name = "pCodAgenda")
    protected Integer pCodAgenda;
    @XmlAttribute(name = "pCodDipartimento")
    protected Integer pCodDipartimento;
    @XmlAttribute(name = "pDipartimento")
    protected String pDipartimento;
    @XmlAttribute(name = "pCodAzienda")
    protected Integer pCodAzienda;
    @XmlAttribute(name = "pAzienda")
    protected String pAzienda;
    @XmlAttribute(name = "pCodUnpr")
    protected String pCodUnpr;
    @XmlAttribute(name = "pUnitaOperativa")
    protected String pUnitaOperativa;
    @XmlAttribute(name = "PIndirizzo")
    protected String pIndirizzo;
    @XmlAttribute(name = "pNumeroCivico")
    protected String pNumeroCivico;
    @XmlAttribute(name = "pComune")
    protected String pComune;
    @XmlAttribute(name = "pTipoUnpr")
    protected Integer pTipoUnpr;
    @XmlAttribute(name = "pDataReinv")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pDataReinv;
    @XmlAttribute(name = "pLongitudine")
    protected String pLongitudine;
    @XmlAttribute(name = "pLatitudine")
    protected String pLatitudine;
    @XmlAttribute(name = "pTipovStradario")
    protected String pTipovStradario;
    @XmlAttribute(name = "pPrepStradario")
    protected String pPrepStradario;
    @XmlAttribute(name = "pViaStradario")
    protected String pViaStradario;
    @XmlAttribute(name = "pCivicoStradario")
    protected String pCivicoStradario;
    @XmlAttribute(name = "pComuneStradario")
    protected String pComuneStradario;
    @XmlAttribute(name = "pCodErrore")
    protected Integer pCodErrore;
    @XmlAttribute(name = "pDesErr")
    protected String pDesErr;

    /**
     * Recupera il valore della proprietà pStatoAssistita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPStatoAssistita() {
        return pStatoAssistita;
    }

    /**
     * Imposta il valore della proprietà pStatoAssistita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPStatoAssistita(String value) {
        this.pStatoAssistita = value;
    }

    /**
     * Recupera il valore della proprietà pCodAgenda.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPCodAgenda() {
        return pCodAgenda;
    }

    /**
     * Imposta il valore della proprietà pCodAgenda.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPCodAgenda(Integer value) {
        this.pCodAgenda = value;
    }

    /**
     * Recupera il valore della proprietà pCodDipartimento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPCodDipartimento() {
        return pCodDipartimento;
    }

    /**
     * Imposta il valore della proprietà pCodDipartimento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPCodDipartimento(Integer value) {
        this.pCodDipartimento = value;
    }

    /**
     * Recupera il valore della proprietà pDipartimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDipartimento() {
        return pDipartimento;
    }

    /**
     * Imposta il valore della proprietà pDipartimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDipartimento(String value) {
        this.pDipartimento = value;
    }

    /**
     * Recupera il valore della proprietà pCodAzienda.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPCodAzienda() {
        return pCodAzienda;
    }

    /**
     * Imposta il valore della proprietà pCodAzienda.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPCodAzienda(Integer value) {
        this.pCodAzienda = value;
    }

    /**
     * Recupera il valore della proprietà pAzienda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAzienda() {
        return pAzienda;
    }

    /**
     * Imposta il valore della proprietà pAzienda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAzienda(String value) {
        this.pAzienda = value;
    }

    /**
     * Recupera il valore della proprietà pCodUnpr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCodUnpr() {
        return pCodUnpr;
    }

    /**
     * Imposta il valore della proprietà pCodUnpr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCodUnpr(String value) {
        this.pCodUnpr = value;
    }

    /**
     * Recupera il valore della proprietà pUnitaOperativa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPUnitaOperativa() {
        return pUnitaOperativa;
    }

    /**
     * Imposta il valore della proprietà pUnitaOperativa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPUnitaOperativa(String value) {
        this.pUnitaOperativa = value;
    }

    /**
     * Recupera il valore della proprietà pIndirizzo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIndirizzo() {
        return pIndirizzo;
    }

    /**
     * Imposta il valore della proprietà pIndirizzo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIndirizzo(String value) {
        this.pIndirizzo = value;
    }

    /**
     * Recupera il valore della proprietà pNumeroCivico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNumeroCivico() {
        return pNumeroCivico;
    }

    /**
     * Imposta il valore della proprietà pNumeroCivico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNumeroCivico(String value) {
        this.pNumeroCivico = value;
    }

    /**
     * Recupera il valore della proprietà pComune.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPComune() {
        return pComune;
    }

    /**
     * Imposta il valore della proprietà pComune.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPComune(String value) {
        this.pComune = value;
    }

    /**
     * Recupera il valore della proprietà pTipoUnpr.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPTipoUnpr() {
        return pTipoUnpr;
    }

    /**
     * Imposta il valore della proprietà pTipoUnpr.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPTipoUnpr(Integer value) {
        this.pTipoUnpr = value;
    }

    /**
     * Recupera il valore della proprietà pDataReinv.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPDataReinv() {
        return pDataReinv;
    }

    /**
     * Imposta il valore della proprietà pDataReinv.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPDataReinv(XMLGregorianCalendar value) {
        this.pDataReinv = value;
    }

    /**
     * Recupera il valore della proprietà pLongitudine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLongitudine() {
        return pLongitudine;
    }

    /**
     * Imposta il valore della proprietà pLongitudine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLongitudine(String value) {
        this.pLongitudine = value;
    }

    /**
     * Recupera il valore della proprietà pLatitudine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLatitudine() {
        return pLatitudine;
    }

    /**
     * Imposta il valore della proprietà pLatitudine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLatitudine(String value) {
        this.pLatitudine = value;
    }

    /**
     * Recupera il valore della proprietà pTipovStradario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTipovStradario() {
        return pTipovStradario;
    }

    /**
     * Imposta il valore della proprietà pTipovStradario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTipovStradario(String value) {
        this.pTipovStradario = value;
    }

    /**
     * Recupera il valore della proprietà pPrepStradario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPrepStradario() {
        return pPrepStradario;
    }

    /**
     * Imposta il valore della proprietà pPrepStradario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPrepStradario(String value) {
        this.pPrepStradario = value;
    }

    /**
     * Recupera il valore della proprietà pViaStradario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPViaStradario() {
        return pViaStradario;
    }

    /**
     * Imposta il valore della proprietà pViaStradario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPViaStradario(String value) {
        this.pViaStradario = value;
    }

    /**
     * Recupera il valore della proprietà pCivicoStradario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCivicoStradario() {
        return pCivicoStradario;
    }

    /**
     * Imposta il valore della proprietà pCivicoStradario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCivicoStradario(String value) {
        this.pCivicoStradario = value;
    }

    /**
     * Recupera il valore della proprietà pComuneStradario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPComuneStradario() {
        return pComuneStradario;
    }

    /**
     * Imposta il valore della proprietà pComuneStradario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPComuneStradario(String value) {
        this.pComuneStradario = value;
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

}
