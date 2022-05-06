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
 *         &lt;element name="Get_Dettaglio_Strutture_WEBOutParameters" type="{http://www.csi.it/ScreenServiziWebSOL/}Get_Dettaglio_Strutture_WEBOutParametersType"/>
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
    "getDettaglioStruttureWEBOutParameters"
})
@XmlRootElement(name = "Get_Dettaglio_Strutture_WEBResponse")
public class GetDettaglioStruttureWEBResponse {

    @XmlElement(name = "Errori", required = true)
    protected ErroriType errori;
    @XmlElement(name = "Get_Dettaglio_Strutture_WEBOutParameters", required = true)
    protected GetDettaglioStruttureWEBOutParametersType getDettaglioStruttureWEBOutParameters;

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
     * Recupera il valore della proprietà getDettaglioStruttureWEBOutParameters.
     * 
     * @return
     *     possible object is
     *     {@link GetDettaglioStruttureWEBOutParametersType }
     *     
     */
    public GetDettaglioStruttureWEBOutParametersType getGetDettaglioStruttureWEBOutParameters() {
        return getDettaglioStruttureWEBOutParameters;
    }

    /**
     * Imposta il valore della proprietà getDettaglioStruttureWEBOutParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDettaglioStruttureWEBOutParametersType }
     *     
     */
    public void setGetDettaglioStruttureWEBOutParameters(GetDettaglioStruttureWEBOutParametersType value) {
        this.getDettaglioStruttureWEBOutParameters = value;
    }

}
