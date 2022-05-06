/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.farmab.interfacews.msg.farab;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per elencoFarmacieType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="elencoFarmacieType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="farmaciaOccasionale" type="{http://farab.msg.interfacews.farmab.dma.csi.it/}farmaciaOccasionaleType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "elencoFarmacieType", propOrder = {
    "farmaciaOccasionale"
})
public class ElencoFarmacieType {

    @XmlElement(required = true)
    protected List<FarmaciaOccasionaleType> farmaciaOccasionale;

    /**
     * Gets the value of the farmaciaOccasionale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the farmaciaOccasionale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFarmaciaOccasionale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FarmaciaOccasionaleType }
     * 
     * 
     */
    public List<FarmaciaOccasionaleType> getFarmaciaOccasionale() {
        if (farmaciaOccasionale == null) {
            farmaciaOccasionale = new ArrayList<FarmaciaOccasionaleType>();
        }
        return this.farmaciaOccasionale;
    }

}
