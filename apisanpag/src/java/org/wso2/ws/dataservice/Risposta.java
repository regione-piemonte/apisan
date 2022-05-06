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
 * <p>Classe Java per risposta complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="risposta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ws.wso2.org/dataservice}CONFIGURAZIONE_LOTTI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "risposta", propOrder = {
    "configurazionelotti"
})
public class Risposta {

    @XmlElement(name = "CONFIGURAZIONE_LOTTI")
    protected CONFIGURAZIONELOTTI configurazionelotti;

    /**
     * Recupera il valore della proprieta configurazionelotti.
     * 
     * @return
     *     possible object is
     *     {@link CONFIGURAZIONELOTTI }
     *     
     */
    public CONFIGURAZIONELOTTI getCONFIGURAZIONELOTTI() {
        return configurazionelotti;
    }

    /**
     * Imposta il valore della proprieta configurazionelotti.
     * 
     * @param value
     *     allowed object is
     *     {@link CONFIGURAZIONELOTTI }
     *     
     */
    public void setCONFIGURAZIONELOTTI(CONFIGURAZIONELOTTI value) {
        this.configurazionelotti = value;
    }

}
