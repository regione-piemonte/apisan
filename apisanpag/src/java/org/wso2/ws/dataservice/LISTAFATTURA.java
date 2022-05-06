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
 * <p>Classe Java per LISTA_FATTURA complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LISTA_FATTURA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ws.wso2.org/dataservice}ELENCO_PAGAMENTI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LISTA_FATTURA", propOrder = {
    "elencopagamenti"
})
public class LISTAFATTURA {

    @XmlElement(name = "ELENCO_PAGAMENTI")
    protected ELENCOPAGAMENTI elencopagamenti;

    /**
     * Recupera il valore della proprieta elencopagamenti.
     * 
     * @return
     *     possible object is
     *     {@link ELENCOPAGAMENTI }
     *     
     */
    public ELENCOPAGAMENTI getELENCOPAGAMENTI() {
        return elencopagamenti;
    }

    /**
     * Imposta il valore della proprieta elencopagamenti.
     * 
     * @param value
     *     allowed object is
     *     {@link ELENCOPAGAMENTI }
     *     
     */
    public void setELENCOPAGAMENTI(ELENCOPAGAMENTI value) {
        this.elencopagamenti = value;
    }

}
