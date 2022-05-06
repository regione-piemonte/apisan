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
 *         &lt;element name="SetAvvenutoPagamentoResult" type="{http://csi.it}Quietanza"/>
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
    "setAvvenutoPagamentoResult"
})
@XmlRootElement(name = "SetAvvenutoPagamentoResponse")
public class SetAvvenutoPagamentoResponse {

    @XmlElement(name = "SetAvvenutoPagamentoResult", required = true)
    protected Quietanza setAvvenutoPagamentoResult;

    /**
     * Recupera il valore della proprietà setAvvenutoPagamentoResult.
     * 
     * @return
     *     possible object is
     *     {@link Quietanza }
     *     
     */
    public Quietanza getSetAvvenutoPagamentoResult() {
        return setAvvenutoPagamentoResult;
    }

    /**
     * Imposta il valore della proprietà setAvvenutoPagamentoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Quietanza }
     *     
     */
    public void setSetAvvenutoPagamentoResult(Quietanza value) {
        this.setAvvenutoPagamentoResult = value;
    }

}
