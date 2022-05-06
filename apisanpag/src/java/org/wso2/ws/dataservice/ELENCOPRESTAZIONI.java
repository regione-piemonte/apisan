/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package org.wso2.ws.dataservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ELENCO_PRESTAZIONI complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ELENCO_PRESTAZIONI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ws.wso2.org/dataservice}PRESTAZIONE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ELENCO_PRESTAZIONI", propOrder = {
    "prestazione"
})
public class ELENCOPRESTAZIONI {

    @XmlElement(name = "PRESTAZIONE")
    protected PRESTAZIONE prestazione;

    /**
     * Recupera il valore della proprieta prestazione.
     * 
     * @return
     *     possible object is
     *     {@link PRESTAZIONE }
     *     
     */
    public PRESTAZIONE getPRESTAZIONE() {
        return prestazione;
    }

    /**
     * Imposta il valore della proprieta prestazione.
     * 
     * @param value
     *     allowed object is
     *     {@link PRESTAZIONE }
     *     
     */
    public void setPRESTAZIONE(PRESTAZIONE value) {
        this.prestazione = value;
    }

}
