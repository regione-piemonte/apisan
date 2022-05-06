/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestutility;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getTipiRuoliOperatoreFault" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getTipiRuoliOperatoreFault"
})
@XmlRootElement(name = "getTipiRuoliOperatoreFault")
public class GetTipiRuoliOperatoreFault {

    @XmlElement(required = true)
    protected String getTipiRuoliOperatoreFault;

    /**
     * Recupera il valore della proprietà getTipiRuoliOperatoreFault.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetTipiRuoliOperatoreFault() {
        return getTipiRuoliOperatoreFault;
    }

    /**
     * Imposta il valore della proprietà getTipiRuoliOperatoreFault.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetTipiRuoliOperatoreFault(String value) {
        this.getTipiRuoliOperatoreFault = value;
    }

}
