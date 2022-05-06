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
import it.csi.gestutility.ErroriType;


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
 *         &lt;element name="Errori" type="{http://www.csi.it/GestUtility/}ErroriType"/>
 *         &lt;element name="Get_Date_Disponibili_WEBOutParameters" type="{http://www.csi.it/ScreenServiziWebSOL/}Get_Date_Disponibili_WEBOutParametersType"/>
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
    "errori",
    "getDateDisponibiliWEBOutParameters"
})
@XmlRootElement(name = "Get_Date_Disponibili_WEBResponse")
public class GetDateDisponibiliWEBResponse {

    @XmlElement(name = "Errori", required = true)
    protected ErroriType errori;
    @XmlElement(name = "Get_Date_Disponibili_WEBOutParameters", required = true)
    protected GetDateDisponibiliWEBOutParametersType getDateDisponibiliWEBOutParameters;

    /**
     * Recupera il valore della proprietà errori.
     * 
     * @return
     *     possible object is
     *     {@link ErroriType }
     *     
     */
    public ErroriType getErrori() {
        return errori;
    }

    /**
     * Imposta il valore della proprietà errori.
     * 
     * @param value
     *     allowed object is
     *     {@link ErroriType }
     *     
     */
    public void setErrori(ErroriType value) {
        this.errori = value;
    }

    /**
     * Recupera il valore della proprietà getDateDisponibiliWEBOutParameters.
     * 
     * @return
     *     possible object is
     *     {@link GetDateDisponibiliWEBOutParametersType }
     *     
     */
    public GetDateDisponibiliWEBOutParametersType getGetDateDisponibiliWEBOutParameters() {
        return getDateDisponibiliWEBOutParameters;
    }

    /**
     * Imposta il valore della proprietà getDateDisponibiliWEBOutParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDateDisponibiliWEBOutParametersType }
     *     
     */
    public void setGetDateDisponibiliWEBOutParameters(GetDateDisponibiliWEBOutParametersType value) {
        this.getDateDisponibiliWEBOutParameters = value;
    }

}
