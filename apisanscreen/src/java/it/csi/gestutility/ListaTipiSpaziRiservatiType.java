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
 * <p>Classe Java per listaTipiSpaziRiservatiType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="listaTipiSpaziRiservatiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoSpazioRiservato" type="{http://www.csi.it/GestUtility/}tipoSpazioRiservatoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaTipiSpaziRiservatiType", propOrder = {
    "tipoSpazioRiservato"
})
public class ListaTipiSpaziRiservatiType {

    @XmlElement(nillable = true)
    protected List<TipoSpazioRiservatoType> tipoSpazioRiservato;

    /**
     * Gets the value of the tipoSpazioRiservato property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipoSpazioRiservato property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipoSpazioRiservato().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoSpazioRiservatoType }
     * 
     * 
     */
    public List<TipoSpazioRiservatoType> getTipoSpazioRiservato() {
        if (tipoSpazioRiservato == null) {
            tipoSpazioRiservato = new ArrayList<TipoSpazioRiservatoType>();
        }
        return this.tipoSpazioRiservato;
    }

}
