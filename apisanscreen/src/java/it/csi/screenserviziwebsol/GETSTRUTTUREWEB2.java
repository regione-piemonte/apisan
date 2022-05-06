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
 *         &lt;element name="GET_STRUTTURE_WEB2InParameters" type="{http://www.csi.it/ScreenServiziWebSOL/}GET_STRUTTURE_WEB2InParametersType"/>
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
    "getstruttureweb2InParameters"
})
@XmlRootElement(name = "GET_STRUTTURE_WEB2")
public class GETSTRUTTUREWEB2 {

    @XmlElement(name = "Credenziali", required = true)
    protected CredenzialiType credenziali;
    @XmlElement(name = "GET_STRUTTURE_WEB2InParameters", required = true)
    protected GETSTRUTTUREWEB2InParametersType getstruttureweb2InParameters;

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
     * Recupera il valore della proprietà getstruttureweb2InParameters.
     * 
     * @return
     *     possible object is
     *     {@link GETSTRUTTUREWEB2InParametersType }
     *     
     */
    public GETSTRUTTUREWEB2InParametersType getGETSTRUTTUREWEB2InParameters() {
        return getstruttureweb2InParameters;
    }

    /**
     * Imposta il valore della proprietà getstruttureweb2InParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link GETSTRUTTUREWEB2InParametersType }
     *     
     */
    public void setGETSTRUTTUREWEB2InParameters(GETSTRUTTUREWEB2InParametersType value) {
        this.getstruttureweb2InParameters = value;
    }

}
