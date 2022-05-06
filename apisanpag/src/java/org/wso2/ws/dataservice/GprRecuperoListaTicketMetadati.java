/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package org.wso2.ws.dataservice;

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
 *         &lt;element name="DAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AL" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "dal",
    "al"
})
@XmlRootElement(name = "GprRecuperoListaTicketMetadati")
public class GprRecuperoListaTicketMetadati {

    @XmlElement(name = "DAL", required = true, nillable = true)
    protected String dal;
    @XmlElement(name = "AL", required = true, nillable = true)
    protected String al;

    /**
     * Recupera il valore della proprieta dal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAL() {
        return dal;
    }

    /**
     * Imposta il valore della proprieta dal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAL(String value) {
        this.dal = value;
    }

    /**
     * Recupera il valore della proprieta al.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAL() {
        return al;
    }

    /**
     * Imposta il valore della proprieta al.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAL(String value) {
        this.al = value;
    }

}
