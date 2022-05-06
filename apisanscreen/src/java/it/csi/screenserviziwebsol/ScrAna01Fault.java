/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.screenserviziwebsol;

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
 *         &lt;element name="Scr_Ana_01Fault" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "scrAna01Fault"
})
@XmlRootElement(name = "Scr_Ana_01Fault")
public class ScrAna01Fault {

    @XmlElement(name = "Scr_Ana_01Fault", required = true)
    protected String scrAna01Fault;

    /**
     * Recupera il valore della proprietà scrAna01Fault.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScrAna01Fault() {
        return scrAna01Fault;
    }

    /**
     * Imposta il valore della proprietà scrAna01Fault.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScrAna01Fault(String value) {
        this.scrAna01Fault = value;
    }

}
