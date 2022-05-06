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
 *         &lt;element name="GetListaRimborsiGPRResult" type="{http://csi.it}ListaRimborsiGPRResultType"/>
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
    "getListaRimborsiGPRResult"
})
@XmlRootElement(name = "GetListaRimborsiGPRResponse")
public class GetListaRimborsiGPRResponse {

    @XmlElement(name = "GetListaRimborsiGPRResult", required = true)
    protected ListaRimborsiGPRResultType getListaRimborsiGPRResult;

    /**
     * Recupera il valore della proprieta getListaRimborsiGPRResult.
     * 
     * @return
     *     possible object is
     *     {@link ListaRimborsiGPRResultType }
     *     
     */
    public ListaRimborsiGPRResultType getGetListaRimborsiGPRResult() {
        return getListaRimborsiGPRResult;
    }

    /**
     * Imposta il valore della proprieta getListaRimborsiGPRResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaRimborsiGPRResultType }
     *     
     */
    public void setGetListaRimborsiGPRResult(ListaRimborsiGPRResultType value) {
        this.getListaRimborsiGPRResult = value;
    }

}
