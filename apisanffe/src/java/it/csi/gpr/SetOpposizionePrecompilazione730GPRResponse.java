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
 *         &lt;element name="SetOpposizionePrecompilazione730GPRResult" type="{http://csi.it}SetOpposizionePrecompilazione730GPRResultType"/>
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
    "setOpposizionePrecompilazione730GPRResult"
})
@XmlRootElement(name = "SetOpposizionePrecompilazione730GPRResponse")
public class SetOpposizionePrecompilazione730GPRResponse {

    @XmlElement(name = "SetOpposizionePrecompilazione730GPRResult", required = true)
    protected SetOpposizionePrecompilazione730GPRResultType setOpposizionePrecompilazione730GPRResult;

    /**
     * Recupera il valore della proprietà setOpposizionePrecompilazione730GPRResult.
     * 
     * @return
     *     possible object is
     *     {@link SetOpposizionePrecompilazione730GPRResultType }
     *     
     */
    public SetOpposizionePrecompilazione730GPRResultType getSetOpposizionePrecompilazione730GPRResult() {
        return setOpposizionePrecompilazione730GPRResult;
    }

    /**
     * Imposta il valore della proprietà setOpposizionePrecompilazione730GPRResult.
     * 
     * @param value
     *     allowed object is
     *     {@link SetOpposizionePrecompilazione730GPRResultType }
     *     
     */
    public void setSetOpposizionePrecompilazione730GPRResult(SetOpposizionePrecompilazione730GPRResultType value) {
        this.setOpposizionePrecompilazione730GPRResult = value;
    }

}
