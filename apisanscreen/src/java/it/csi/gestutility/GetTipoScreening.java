/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestutility;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="listaTipoScreening" type="{http://www.csi.it/GestUtility/}listaTipoScreeningType"/>
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
    "listaTipoScreening"
})
@XmlRootElement(name = "getTipoScreening")
public class GetTipoScreening {

    @XmlElement(required = true)
    protected ListaTipoScreeningType listaTipoScreening;

    /**
     * Recupera il valore della proprietà listaTipoScreening.
     * 
     * @return
     *     possible object is
     *     {@link ListaTipoScreeningType }
     *     
     */
    public ListaTipoScreeningType getListaTipoScreening() {
        return listaTipoScreening;
    }

    /**
     * Imposta il valore della proprietà listaTipoScreening.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaTipoScreeningType }
     *     
     */
    public void setListaTipoScreening(ListaTipoScreeningType value) {
        this.listaTipoScreening = value;
    }

}
