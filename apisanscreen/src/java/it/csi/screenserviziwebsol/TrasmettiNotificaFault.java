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
 *         &lt;element name="TrasmettiNotificaFault" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "trasmettiNotificaFault"
})
@XmlRootElement(name = "TrasmettiNotificaFault")
public class TrasmettiNotificaFault {

    @XmlElement(name = "TrasmettiNotificaFault", required = true)
    protected String trasmettiNotificaFault;

    /**
     * Recupera il valore della proprietà trasmettiNotificaFault.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrasmettiNotificaFault() {
        return trasmettiNotificaFault;
    }

    /**
     * Imposta il valore della proprietà trasmettiNotificaFault.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrasmettiNotificaFault(String value) {
        this.trasmettiNotificaFault = value;
    }

}
