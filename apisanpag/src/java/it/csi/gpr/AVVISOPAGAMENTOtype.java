/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AVVISO_PAGAMENTOtype complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AVVISO_PAGAMENTOtype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AUXDIGIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="APPLICATION_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IUV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATA_ASSOCIAZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AVVISO_PAGAMENTOtype", propOrder = {
    "auxdigit",
    "applicationcode",
    "iuv",
    "dataassociazione"
})
public class AVVISOPAGAMENTOtype {

    @XmlElement(name = "AUXDIGIT")
    protected String auxdigit;
    @XmlElement(name = "APPLICATION_CODE")
    protected String applicationcode;
    @XmlElement(name = "IUV")
    protected String iuv;
    @XmlElement(name = "DATA_ASSOCIAZIONE")
    protected String dataassociazione;

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
     * Recupera il valore della proprieta dataassociazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAASSOCIAZIONE() {
        return dataassociazione;
    }

    /**
     * Imposta il valore della proprieta dataassociazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAASSOCIAZIONE(String value) {
        this.dataassociazione = value;
    }

}
