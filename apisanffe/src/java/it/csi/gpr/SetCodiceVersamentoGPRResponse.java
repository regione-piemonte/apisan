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
 *         &lt;element name="SetCodiceVersamentoGPRResult" type="{http://csi.it}SetCodiceVersamentoGPRResponseType"/>
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
    "setCodiceVersamentoGPRResult"
})
@XmlRootElement(name = "SetCodiceVersamentoGPRResponse")
public class SetCodiceVersamentoGPRResponse {

    @XmlElement(name = "SetCodiceVersamentoGPRResult", required = true)
    protected SetCodiceVersamentoGPRResponseType setCodiceVersamentoGPRResult;

    /**
     * Recupera il valore della proprietà setCodiceVersamentoGPRResult.
     * 
     * @return
     *     possible object is
     *     {@link SetCodiceVersamentoGPRResponseType }
     *     
     */
    public SetCodiceVersamentoGPRResponseType getSetCodiceVersamentoGPRResult() {
        return setCodiceVersamentoGPRResult;
    }

    /**
     * Imposta il valore della proprietà setCodiceVersamentoGPRResult.
     * 
     * @param value
     *     allowed object is
     *     {@link SetCodiceVersamentoGPRResponseType }
     *     
     */
    public void setSetCodiceVersamentoGPRResult(SetCodiceVersamentoGPRResponseType value) {
        this.setCodiceVersamentoGPRResult = value;
    }

}
