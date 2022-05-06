/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.ptwsrv.business.webservice.ptwsrvavvisopagamento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per avvisoPagamentoResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="avvisoPagamentoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outputAvvisoPagamento" type="{http://ptwsrvavvisopagamento.webservice.business.ptwsrv.csi.it/}outputAvvisoPagamento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "avvisoPagamentoResponse", propOrder = {
    "outputAvvisoPagamento"
})
public class AvvisoPagamentoResponse {

    protected OutputAvvisoPagamento outputAvvisoPagamento;

    /**
     * Recupera il valore della proprieta outputAvvisoPagamento.
     * 
     * @return
     *     possible object is
     *     {@link OutputAvvisoPagamento }
     *     
     */
    public OutputAvvisoPagamento getOutputAvvisoPagamento() {
        return outputAvvisoPagamento;
    }

    /**
     * Imposta il valore della proprieta outputAvvisoPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputAvvisoPagamento }
     *     
     */
    public void setOutputAvvisoPagamento(OutputAvvisoPagamento value) {
        this.outputAvvisoPagamento = value;
    }

}
