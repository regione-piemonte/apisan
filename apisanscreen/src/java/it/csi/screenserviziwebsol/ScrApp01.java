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
 *         &lt;element name="Credenziali" type="{http://www.csi.it/ScreenServiziWebSOL/}CredenzialiType"/>
 *         &lt;element name="Scr_App_01InParameters" type="{http://www.csi.it/ScreenServiziWebSOL/}Scr_App_01InParametersType"/>
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
    "credenziali",
    "scrApp01InParameters"
})
@XmlRootElement(name = "Scr_App_01")
public class ScrApp01 {

    @XmlElement(name = "Credenziali", required = true)
    protected CredenzialiType credenziali;
    @XmlElement(name = "Scr_App_01InParameters", required = true)
    protected ScrApp01InParametersType scrApp01InParameters;

    /**
     * Recupera il valore della proprietà credenziali.
     * 
     * @return
     *     possible object is
     *     {@link CredenzialiType }
     *     
     */
    public CredenzialiType getCredenziali() {
        return credenziali;
    }

    /**
     * Imposta il valore della proprietà credenziali.
     * 
     * @param value
     *     allowed object is
     *     {@link CredenzialiType }
     *     
     */
    public void setCredenziali(CredenzialiType value) {
        this.credenziali = value;
    }

    /**
     * Recupera il valore della proprietà scrApp01InParameters.
     * 
     * @return
     *     possible object is
     *     {@link ScrApp01InParametersType }
     *     
     */
    public ScrApp01InParametersType getScrApp01InParameters() {
        return scrApp01InParameters;
    }

    /**
     * Imposta il valore della proprietà scrApp01InParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link ScrApp01InParametersType }
     *     
     */
    public void setScrApp01InParameters(ScrApp01InParametersType value) {
        this.scrApp01InParameters = value;
    }

}
