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
 *         &lt;element name="Crea_Appuntamento_WEBInParameters" type="{http://www.csi.it/ScreenServiziWebSOL/}Crea_Appuntamento_WEBInParametersType"/>
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
    "creaAppuntamentoWEBInParameters"
})
@XmlRootElement(name = "Crea_Appuntamento_WEB")
public class CreaAppuntamentoWEB {

    @XmlElement(name = "Credenziali", required = true)
    protected CredenzialiType credenziali;
    @XmlElement(name = "Crea_Appuntamento_WEBInParameters", required = true)
    protected CreaAppuntamentoWEBInParametersType creaAppuntamentoWEBInParameters;

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
     * Recupera il valore della proprietà creaAppuntamentoWEBInParameters.
     * 
     * @return
     *     possible object is
     *     {@link CreaAppuntamentoWEBInParametersType }
     *     
     */
    public CreaAppuntamentoWEBInParametersType getCreaAppuntamentoWEBInParameters() {
        return creaAppuntamentoWEBInParameters;
    }

    /**
     * Imposta il valore della proprietà creaAppuntamentoWEBInParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link CreaAppuntamentoWEBInParametersType }
     *     
     */
    public void setCreaAppuntamentoWEBInParameters(CreaAppuntamentoWEBInParametersType value) {
        this.creaAppuntamentoWEBInParameters = value;
    }

}
