/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="arg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "arg"
})
@XmlRootElement(name = "DispacciaFlussoRendicontazioneRequest")
public class DispacciaFlussoRendicontazioneRequest {

    protected String arg;

    /**
     * Recupera il valore della proprieta arg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg() {
        return arg;
    }

    /**
     * Imposta il valore della proprieta arg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg(String value) {
        this.arg = value;
    }

}
