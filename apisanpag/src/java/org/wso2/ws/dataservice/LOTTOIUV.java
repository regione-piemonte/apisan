/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package org.wso2.ws.dataservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per LOTTO_IUV complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LOTTO_IUV">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ESITO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NUM_IUV_RICHIESTA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IUV" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AUXDIGIT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="APPLICATION_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOTTO_IUV", propOrder = {
    "esito",
    "numiuvrichiesta",
    "iuv",
    "auxdigit",
    "applicationcode"
})
public class LOTTOIUV {

    @XmlElement(name = "ESITO", required = true, nillable = true)
    protected String esito;
    @XmlElement(name = "NUM_IUV_RICHIESTA", required = true, nillable = true)
    protected String numiuvrichiesta;
    @XmlElement(name = "IUV", required = true, nillable = true)
    protected String iuv;
    @XmlElement(name = "AUXDIGIT", required = true, nillable = true)
    protected String auxdigit;
    @XmlElement(name = "APPLICATION_CODE", required = true, nillable = true)
    protected String applicationcode;

    /**
     * Recupera il valore della proprieta esito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESITO() {
        return esito;
    }

    /**
     * Imposta il valore della proprieta esito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESITO(String value) {
        this.esito = value;
    }

    /**
     * Recupera il valore della proprieta numiuvrichiesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMIUVRICHIESTA() {
        return numiuvrichiesta;
    }

    /**
     * Imposta il valore della proprieta numiuvrichiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMIUVRICHIESTA(String value) {
        this.numiuvrichiesta = value;
    }

    /**
     * Recupera il valore della proprieta iuv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIUV() {
        return iuv;
    }

    /**
     * Imposta il valore della proprieta iuv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIUV(String value) {
        this.iuv = value;
    }

    /**
     * Recupera il valore della proprieta auxdigit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUXDIGIT() {
        return auxdigit;
    }

    /**
     * Imposta il valore della proprieta auxdigit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUXDIGIT(String value) {
        this.auxdigit = value;
    }

    /**
     * Recupera il valore della proprieta applicationcode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPLICATIONCODE() {
        return applicationcode;
    }

    /**
     * Imposta il valore della proprieta applicationcode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPLICATIONCODE(String value) {
        this.applicationcode = value;
    }

}
