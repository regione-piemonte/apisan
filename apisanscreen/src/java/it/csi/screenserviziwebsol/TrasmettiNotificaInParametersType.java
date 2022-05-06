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
 * <p>Classe Java per TrasmettiNotificaInParametersType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TrasmettiNotificaInParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="pComponente" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pTipoNotifica" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pTipoScreening" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pNome" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pCognome" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pDataAppuntamento" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pOraAppuntamento" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pUnitaOperativa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pIndirizzo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pNumeroCivico" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pComune" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrasmettiNotificaInParametersType")
public class TrasmettiNotificaInParametersType {

    @XmlAttribute(name = "pComponente")
    protected String pComponente;
    @XmlAttribute(name = "pTipoNotifica")
    protected Integer pTipoNotifica;
    @XmlAttribute(name = "pTipoScreening")
    protected String pTipoScreening;
    @XmlAttribute(name = "pNome")
    protected String pNome;
    @XmlAttribute(name = "pCognome")
    protected String pCognome;
    @XmlAttribute(name = "pDataAppuntamento")
    protected String pDataAppuntamento;
    @XmlAttribute(name = "pOraAppuntamento")
    protected String pOraAppuntamento;
    @XmlAttribute(name = "pUnitaOperativa")
    protected String pUnitaOperativa;
    @XmlAttribute(name = "pIndirizzo")
    protected String pIndirizzo;
    @XmlAttribute(name = "pNumeroCivico")
    protected String pNumeroCivico;
    @XmlAttribute(name = "pComune")
    protected String pComune;

    /**
     * Recupera il valore della proprietà pComponente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPComponente() {
        return pComponente;
    }

    /**
     * Imposta il valore della proprietà pComponente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPComponente(String value) {
        this.pComponente = value;
    }

    /**
     * Recupera il valore della proprietà pTipoNotifica.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPTipoNotifica() {
        return pTipoNotifica;
    }

    /**
     * Imposta il valore della proprietà pTipoNotifica.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPTipoNotifica(Integer value) {
        this.pTipoNotifica = value;
    }

    /**
     * Recupera il valore della proprietà pTipoScreening.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTipoScreening() {
        return pTipoScreening;
    }

    /**
     * Imposta il valore della proprietà pTipoScreening.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTipoScreening(String value) {
        this.pTipoScreening = value;
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
     * Recupera il valore della proprietà pDataAppuntamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDataAppuntamento() {
        return pDataAppuntamento;
    }

    /**
     * Imposta il valore della proprietà pDataAppuntamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDataAppuntamento(String value) {
        this.pDataAppuntamento = value;
    }

    /**
     * Recupera il valore della proprietà pOraAppuntamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOraAppuntamento() {
        return pOraAppuntamento;
    }

    /**
     * Imposta il valore della proprietà pOraAppuntamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOraAppuntamento(String value) {
        this.pOraAppuntamento = value;
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

}
