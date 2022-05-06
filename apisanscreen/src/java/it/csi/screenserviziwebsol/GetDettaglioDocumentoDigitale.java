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
 *         &lt;element name="GetDettaglioDocumentoDigitaleInParameters" type="{http://www.csi.it/ScreenServiziWebSOL/}GetDettaglioDocumentoDigitaleInParametersType"/>
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
    "getDettaglioDocumentoDigitaleInParameters"
})
@XmlRootElement(name = "GetDettaglioDocumentoDigitale")
public class GetDettaglioDocumentoDigitale {

    @XmlElement(name = "Credenziali", required = true)
    protected CredenzialiType credenziali;
    @XmlElement(name = "GetDettaglioDocumentoDigitaleInParameters", required = true)
    protected GetDettaglioDocumentoDigitaleInParametersType getDettaglioDocumentoDigitaleInParameters;

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
     * Recupera il valore della proprietà getDettaglioDocumentoDigitaleInParameters.
     * 
     * @return
     *     possible object is
     *     {@link GetDettaglioDocumentoDigitaleInParametersType }
     *     
     */
    public GetDettaglioDocumentoDigitaleInParametersType getGetDettaglioDocumentoDigitaleInParameters() {
        return getDettaglioDocumentoDigitaleInParameters;
    }

    /**
     * Imposta il valore della proprietà getDettaglioDocumentoDigitaleInParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDettaglioDocumentoDigitaleInParametersType }
     *     
     */
    public void setGetDettaglioDocumentoDigitaleInParameters(GetDettaglioDocumentoDigitaleInParametersType value) {
        this.getDettaglioDocumentoDigitaleInParameters = value;
    }

}
