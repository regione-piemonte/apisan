/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.pro.nascondinre;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per operazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="operazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flagOperazione" type="{http://dmapro.csi.it/}codiceOperazione" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operazione", propOrder = {
    "flagOperazione"
})
public class Operazione {

    protected CodiceOperazione flagOperazione;

    /**
     * Recupera il valore della property flagOperazione.
     * 
     * @return
     *     possible object is
     *     {@link CodiceOperazione }
     *     
     */
    public CodiceOperazione getFlagOperazione() {
        return flagOperazione;
    }

    /**
     * Imposta il valore della property flagOperazione.
     * 
     * @param value
     *     allowed object is
     *     {@link CodiceOperazione }
     *     
     */
    public void setFlagOperazione(CodiceOperazione value) {
        this.flagOperazione = value;
    }

}
