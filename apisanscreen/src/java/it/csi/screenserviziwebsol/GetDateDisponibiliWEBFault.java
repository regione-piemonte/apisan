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
 *         &lt;element name="Get_Date_Disponibili_WEBFault" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "getDateDisponibiliWEBFault"
})
@XmlRootElement(name = "Get_Date_Disponibili_WEBFault")
public class GetDateDisponibiliWEBFault {

    @XmlElement(name = "Get_Date_Disponibili_WEBFault", required = true)
    protected String getDateDisponibiliWEBFault;

    /**
     * Recupera il valore della proprietà getDateDisponibiliWEBFault.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDateDisponibiliWEBFault() {
        return getDateDisponibiliWEBFault;
    }

    /**
     * Imposta il valore della proprietà getDateDisponibiliWEBFault.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDateDisponibiliWEBFault(String value) {
        this.getDateDisponibiliWEBFault = value;
    }

}
