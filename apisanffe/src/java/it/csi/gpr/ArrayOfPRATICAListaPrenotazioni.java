/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfPRATICAListaPrenotazioni complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPRATICAListaPrenotazioni">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRATICA" type="{http://csi.it}ListaPrenotazione" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPRATICAListaPrenotazioni", propOrder = {
    "pratica"
})
public class ArrayOfPRATICAListaPrenotazioni {

    @XmlElement(name = "PRATICA", nillable = true)
    protected List<ListaPrenotazione> pratica;

    /**
     * Gets the value of the pratica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pratica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPRATICA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListaPrenotazione }
     * 
     * 
     */
    public List<ListaPrenotazione> getPRATICA() {
        if (pratica == null) {
            pratica = new ArrayList<ListaPrenotazione>();
        }
        return this.pratica;
    }

}
