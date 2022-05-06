/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestutility;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per listaTipoAgendaType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="listaTipoAgendaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoAgenda" type="{http://www.csi.it/GestUtility/}TipoAgendaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaTipoAgendaType", propOrder = {
    "tipoAgenda"
})
public class ListaTipoAgendaType {

    @XmlElement(nillable = true)
    protected List<TipoAgendaType> tipoAgenda;

    /**
     * Gets the value of the tipoAgenda property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipoAgenda property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipoAgenda().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoAgendaType }
     * 
     * 
     */
    public List<TipoAgendaType> getTipoAgenda() {
        if (tipoAgenda == null) {
            tipoAgenda = new ArrayList<TipoAgendaType>();
        }
        return this.tipoAgenda;
    }

}
