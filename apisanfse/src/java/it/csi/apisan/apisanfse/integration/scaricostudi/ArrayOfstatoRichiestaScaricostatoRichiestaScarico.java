/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.scaricostudi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfstatoRichiestaScaricostatoRichiestaScarico complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfstatoRichiestaScaricostatoRichiestaScarico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statoRichiestaScarico" type="{http://dma.csi.it/}statoRichiestaScarico" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfstatoRichiestaScaricostatoRichiestaScarico", namespace = "http://dma.csi.it/", propOrder = {
    "statoRichiestaScarico"
})
public class ArrayOfstatoRichiestaScaricostatoRichiestaScarico {

    @XmlElement(namespace = "http://dma.csi.it/", nillable = true)
    protected List<StatoRichiestaScarico> statoRichiestaScarico;

    /**
     * Gets the value of the statoRichiestaScarico property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statoRichiestaScarico property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatoRichiestaScarico().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatoRichiestaScarico }
     * 
     * 
     */
    public List<StatoRichiestaScarico> getStatoRichiestaScarico() {
        if (statoRichiestaScarico == null) {
            statoRichiestaScarico = new ArrayList<StatoRichiestaScarico>();
        }
        return this.statoRichiestaScarico;
    }

}
