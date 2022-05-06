/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

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
 *         &lt;element name="SetModalitaErogazioneRimborsoGPRResult" type="{http://csi.it}SetModalitaErogazioneRimborsoGPRResultType"/>
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
    "setModalitaErogazioneRimborsoGPRResult"
})
@XmlRootElement(name = "SetModalitaErogazioneRimborsoGPRResponse")
public class SetModalitaErogazioneRimborsoGPRResponse {

    @XmlElement(name = "SetModalitaErogazioneRimborsoGPRResult", required = true)
    protected SetModalitaErogazioneRimborsoGPRResultType setModalitaErogazioneRimborsoGPRResult;

    /**
     * Recupera il valore della proprieta setModalitaErogazioneRimborsoGPRResult.
     * 
     * @return
     *     possible object is
     *     {@link SetModalitaErogazioneRimborsoGPRResultType }
     *     
     */
    public SetModalitaErogazioneRimborsoGPRResultType getSetModalitaErogazioneRimborsoGPRResult() {
        return setModalitaErogazioneRimborsoGPRResult;
    }

    /**
     * Imposta il valore della proprieta setModalitaErogazioneRimborsoGPRResult.
     * 
     * @param value
     *     allowed object is
     *     {@link SetModalitaErogazioneRimborsoGPRResultType }
     *     
     */
    public void setSetModalitaErogazioneRimborsoGPRResult(SetModalitaErogazioneRimborsoGPRResultType value) {
        this.setModalitaErogazioneRimborsoGPRResult = value;
    }

}
