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
 * <p>Classe Java per listaTipoPrelievoUoType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="listaTipoPrelievoUoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoPrelievoUo" type="{http://www.csi.it/GestUtility/}TipoPrelievoUoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaTipoPrelievoUoType", propOrder = {
    "tipoPrelievoUo"
})
public class ListaTipoPrelievoUoType {

    @XmlElement(nillable = true)
    protected List<TipoPrelievoUoType> tipoPrelievoUo;

    /**
     * Gets the value of the tipoPrelievoUo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipoPrelievoUo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipoPrelievoUo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoPrelievoUoType }
     * 
     * 
     */
    public List<TipoPrelievoUoType> getTipoPrelievoUo() {
        if (tipoPrelievoUo == null) {
            tipoPrelievoUo = new ArrayList<TipoPrelievoUoType>();
        }
        return this.tipoPrelievoUo;
    }

}
