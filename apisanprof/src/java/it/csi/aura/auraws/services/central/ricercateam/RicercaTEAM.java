/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.aura.auraws.services.central.ricercateam;

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
 *         &lt;element name="CF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TEAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "cf",
    "team"
})
@XmlRootElement(name = "RicercaTEAM")
public class RicercaTEAM {

    @XmlElement(name = "CF")
    protected String cf;
    @XmlElement(name = "TEAM")
    protected String team;

    /**
     * Recupera il valore della proprietà cf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCF() {
        return cf;
    }

    /**
     * Imposta il valore della proprietà cf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCF(String value) {
        this.cf = value;
    }

    /**
     * Recupera il valore della proprietà team.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEAM() {
        return team;
    }

    /**
     * Imposta il valore della proprietà team.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEAM(String value) {
        this.team = value;
    }

}
