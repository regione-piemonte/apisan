/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.aura.auraws.services.central.anagrafesanitaria;

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
 *         &lt;element name="GetProfiloSanitarioResult" type="{http://AnagrafeSanitaria.central.services.auraws.aura.csi.it}soggettoAuraMsg"/>
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
    "getProfiloSanitarioResult"
})
@XmlRootElement(name = "GetProfiloSanitarioResponse")
public class GetProfiloSanitarioResponse {

    @XmlElement(name = "GetProfiloSanitarioResult", required = true)
    protected SoggettoAuraMsg getProfiloSanitarioResult;

    /**
     * Recupera il valore della proprietà getProfiloSanitarioResult.
     * 
     * @return
     *     possible object is
     *     {@link SoggettoAuraMsg }
     *     
     */
    public SoggettoAuraMsg getGetProfiloSanitarioResult() {
        return getProfiloSanitarioResult;
    }

    /**
     * Imposta il valore della proprietà getProfiloSanitarioResult.
     * 
     * @param value
     *     allowed object is
     *     {@link SoggettoAuraMsg }
     *     
     */
    public void setGetProfiloSanitarioResult(SoggettoAuraMsg value) {
        this.getProfiloSanitarioResult = value;
    }

}
