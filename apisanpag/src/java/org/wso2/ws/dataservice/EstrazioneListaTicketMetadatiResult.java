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
 * <p>Classe Java per EstrazioneListaTicketMetadatiResult complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EstrazioneListaTicketMetadatiResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ws.wso2.org/dataservice}LISTA_METADATI_TICKET" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstrazioneListaTicketMetadatiResult", propOrder = {
    "listametadatiticket"
})
public class EstrazioneListaTicketMetadatiResult {

    @XmlElement(name = "LISTA_METADATI_TICKET")
    protected LISTAMETADATITICKET listametadatiticket;

    /**
     * Recupera il valore della proprieta listametadatiticket.
     * 
     * @return
     *     possible object is
     *     {@link LISTAMETADATITICKET }
     *     
     */
    public LISTAMETADATITICKET getLISTAMETADATITICKET() {
        return listametadatiticket;
    }

    /**
     * Imposta il valore della proprieta listametadatiticket.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTAMETADATITICKET }
     *     
     */
    public void setLISTAMETADATITICKET(LISTAMETADATITICKET value) {
        this.listametadatiticket = value;
    }

}
