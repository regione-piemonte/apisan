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
 * <p>Classe Java per VerificaAssistitaOutParametersType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VerificaAssistitaOutParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="pCodIdInterno" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pPrefIdInterno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pIndSesso" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "VerificaAssistitaOutParametersType")
public class VerificaAssistitaOutParametersType {

    @XmlAttribute(name = "pCodIdInterno")
    protected Integer pCodIdInterno;
    @XmlAttribute(name = "pPrefIdInterno")
    protected String pPrefIdInterno;
    @XmlAttribute(name = "pIndSesso")
    protected String pIndSesso;
    @XmlAttribute(name = "pCodErrore")
    protected Integer pCodErrore;
    @XmlAttribute(name = "pDesErr")
    protected String pDesErr;

    /**
     * Recupera il valore della proprietà pCodIdInterno.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPCodIdInterno() {
        return pCodIdInterno;
    }

    /**
     * Imposta il valore della proprietà pCodIdInterno.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPCodIdInterno(Integer value) {
        this.pCodIdInterno = value;
    }

    /**
     * Recupera il valore della proprietà pPrefIdInterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPrefIdInterno() {
        return pPrefIdInterno;
    }

    /**
     * Imposta il valore della proprietà pPrefIdInterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPrefIdInterno(String value) {
        this.pPrefIdInterno = value;
    }

    /**
     * Recupera il valore della proprietà pIndSesso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIndSesso() {
        return pIndSesso;
    }

    /**
     * Imposta il valore della proprietà pIndSesso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIndSesso(String value) {
        this.pIndSesso = value;
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
