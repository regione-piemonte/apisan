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
 *         &lt;element name="risposta" type="{http://csi.it}ModalitaErogazioneAmmissibiliGPRResultType"/>
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
    "risposta"
})
@XmlRootElement(name = "GetModalitaErogazioneAmmissibiliGPRResponse")
public class GetModalitaErogazioneAmmissibiliGPRResponse {

    @XmlElement(required = true)
    protected ModalitaErogazioneAmmissibiliGPRResultType risposta;

    /**
     * Recupera il valore della proprietà risposta.
     * 
     * @return
     *     possible object is
     *     {@link ModalitaErogazioneAmmissibiliGPRResultType }
     *     
     */
    public ModalitaErogazioneAmmissibiliGPRResultType getRisposta() {
        return risposta;
    }

    /**
     * Imposta il valore della proprietà risposta.
     * 
     * @param value
     *     allowed object is
     *     {@link ModalitaErogazioneAmmissibiliGPRResultType }
     *     
     */
    public void setRisposta(ModalitaErogazioneAmmissibiliGPRResultType value) {
        this.risposta = value;
    }

}
