/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package org.wso2.ws.dataservice;

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
 *         &lt;element name="ASR" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "asr"
})
@XmlRootElement(name = "GprEndpointPerAttivazioneAcquisizioneListaStatoTicket")
public class GprEndpointPerAttivazioneAcquisizioneListaStatoTicket {

    @XmlElement(name = "ASR", required = true, nillable = true)
    protected String asr;

    /**
     * Recupera il valore della proprieta asr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASR() {
        return asr;
    }

    /**
     * Imposta il valore della proprieta asr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASR(String value) {
        this.asr = value;
    }

}
