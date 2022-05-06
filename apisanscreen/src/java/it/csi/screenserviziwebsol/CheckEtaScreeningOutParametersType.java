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
 * <p>Classe Java per Check_Eta_ScreeningOutParametersType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Check_Eta_ScreeningOutParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="flag" type="{http://www.w3.org/2001/XMLSchema}int" />
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
@XmlType(name = "Check_Eta_ScreeningOutParametersType")
public class CheckEtaScreeningOutParametersType {

    @XmlAttribute(name = "flag")
    protected Integer flag;
    @XmlAttribute(name = "pCodErrore")
    protected Integer pCodErrore;
    @XmlAttribute(name = "pDesErr")
    protected String pDesErr;

    /**
     * Recupera il valore della proprietà flag.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * Imposta il valore della proprietà flag.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlag(Integer value) {
        this.flag = value;
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
