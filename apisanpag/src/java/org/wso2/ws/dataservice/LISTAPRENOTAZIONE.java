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
 * <p>Classe Java per LISTA_PRENOTAZIONE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LISTA_PRENOTAZIONE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ws.wso2.org/dataservice}PRATICA"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LISTA_PRENOTAZIONE", propOrder = {
    "pratica"
})
public class LISTAPRENOTAZIONE {

    @XmlElement(name = "PRATICA", required = true)
    protected PRATICA pratica;

    /**
     * Recupera il valore della proprieta pratica.
     * 
     * @return
     *     possible object is
     *     {@link PRATICA }
     *     
     */
    public PRATICA getPRATICA() {
        return pratica;
    }

    /**
     * Imposta il valore della proprieta pratica.
     * 
     * @param value
     *     allowed object is
     *     {@link PRATICA }
     *     
     */
    public void setPRATICA(PRATICA value) {
        this.pratica = value;
    }

}
