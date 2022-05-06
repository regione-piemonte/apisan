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
 *         &lt;element name="Set_Situazione_Ass_Ind_WEBOutParameters" type="{http://www.csi.it/ScreenServiziWebSOL/}Set_Situazione_Ass_Ind_WEBOutParametersType"/>
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
    "setSituazioneAssIndWEBOutParameters"
})
@XmlRootElement(name = "Set_Situazione_Ass_Ind_WEBResponse")
public class SetSituazioneAssIndWEBResponse {

    @XmlElement(name = "Errori", required = true)
    protected ErroriType errori;
    @XmlElement(name = "Set_Situazione_Ass_Ind_WEBOutParameters", required = true)
    protected SetSituazioneAssIndWEBOutParametersType setSituazioneAssIndWEBOutParameters;

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
     * Recupera il valore della proprietà setSituazioneAssIndWEBOutParameters.
     * 
     * @return
     *     possible object is
     *     {@link SetSituazioneAssIndWEBOutParametersType }
     *     
     */
    public SetSituazioneAssIndWEBOutParametersType getSetSituazioneAssIndWEBOutParameters() {
        return setSituazioneAssIndWEBOutParameters;
    }

    /**
     * Imposta il valore della proprietà setSituazioneAssIndWEBOutParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link SetSituazioneAssIndWEBOutParametersType }
     *     
     */
    public void setSetSituazioneAssIndWEBOutParameters(SetSituazioneAssIndWEBOutParametersType value) {
        this.setSituazioneAssIndWEBOutParameters = value;
    }

}
