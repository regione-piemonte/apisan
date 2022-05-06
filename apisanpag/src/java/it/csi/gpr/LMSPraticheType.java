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
 * <p>Classe Java per LMSPraticheType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LMSPraticheType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRATICA" type="{http://csi.it}LMSPraticaTicketPagatiType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LMSPraticheType", propOrder = {
    "pratica"
})
public class LMSPraticheType {

    @XmlElement(name = "PRATICA")
    protected List<LMSPraticaTicketPagatiType> pratica;

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
     * {@link LMSPraticaTicketPagatiType }
     * 
     * 
     */
    public List<LMSPraticaTicketPagatiType> getPRATICA() {
        if (pratica == null) {
            pratica = new ArrayList<LMSPraticaTicketPagatiType>();
        }
        return this.pratica;
    }

}
