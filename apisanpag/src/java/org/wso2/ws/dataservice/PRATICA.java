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
 * <p>Classe Java per PRATICA complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PRATICA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IMPORTO_PRATICA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://ws.wso2.org/dataservice}PRENOTAZIONE"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRATICA", propOrder = {
    "importopratica",
    "prenotazione"
})
public class PRATICA {

    @XmlElement(name = "IMPORTO_PRATICA", required = true, nillable = true)
    protected String importopratica;
    @XmlElement(name = "PRENOTAZIONE", required = true)
    protected PRENOTAZIONE prenotazione;

    /**
     * Recupera il valore della proprieta importopratica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPORTOPRATICA() {
        return importopratica;
    }

    /**
     * Imposta il valore della proprieta importopratica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPORTOPRATICA(String value) {
        this.importopratica = value;
    }

    /**
     * Recupera il valore della proprieta prenotazione.
     * 
     * @return
     *     possible object is
     *     {@link PRENOTAZIONE }
     *     
     */
    public PRENOTAZIONE getPRENOTAZIONE() {
        return prenotazione;
    }

    /**
     * Imposta il valore della proprieta prenotazione.
     * 
     * @param value
     *     allowed object is
     *     {@link PRENOTAZIONE }
     *     
     */
    public void setPRENOTAZIONE(PRENOTAZIONE value) {
        this.prenotazione = value;
    }

}
