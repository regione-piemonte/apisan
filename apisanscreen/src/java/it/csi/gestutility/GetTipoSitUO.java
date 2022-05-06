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
 *         &lt;element name="tipoSitUO" type="{http://www.csi.it/GestUtility/}TipoSitUOType" minOccurs="0"/>
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
    "tipoSitUO"
})
@XmlRootElement(name = "getTipoSitUO")
public class GetTipoSitUO {

    protected TipoSitUOType tipoSitUO;

    /**
     * Recupera il valore della proprietà tipoSitUO.
     * 
     * @return
     *     possible object is
     *     {@link TipoSitUOType }
     *     
     */
    public TipoSitUOType getTipoSitUO() {
        return tipoSitUO;
    }

    /**
     * Imposta il valore della proprietà tipoSitUO.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSitUOType }
     *     
     */
    public void setTipoSitUO(TipoSitUOType value) {
        this.tipoSitUO = value;
    }

}
