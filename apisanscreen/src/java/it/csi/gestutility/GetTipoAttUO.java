/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestutility;

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
 *         &lt;element name="tipoAttivitaUO" type="{http://www.csi.it/GestUtility/}TipoAttivitaUOType" minOccurs="0"/>
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
    "tipoAttivitaUO"
})
@XmlRootElement(name = "getTipoAttUO")
public class GetTipoAttUO {

    protected TipoAttivitaUOType tipoAttivitaUO;

    /**
     * Recupera il valore della proprietà tipoAttivitaUO.
     * 
     * @return
     *     possible object is
     *     {@link TipoAttivitaUOType }
     *     
     */
    public TipoAttivitaUOType getTipoAttivitaUO() {
        return tipoAttivitaUO;
    }

    /**
     * Imposta il valore della proprietà tipoAttivitaUO.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoAttivitaUOType }
     *     
     */
    public void setTipoAttivitaUO(TipoAttivitaUOType value) {
        this.tipoAttivitaUO = value;
    }

}
