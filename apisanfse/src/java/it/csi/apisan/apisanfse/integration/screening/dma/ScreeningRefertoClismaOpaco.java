/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.screening.dma;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per screeningRefertoClismaOpaco complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="screeningRefertoClismaOpaco">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="polipi" type="{http://dma.csi.it/}screeningPolipoClisma" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "screeningRefertoClismaOpaco", propOrder = {
    "polipi"
})
public class ScreeningRefertoClismaOpaco {

    @XmlElement(nillable = true)
    protected List<ScreeningPolipoClisma> polipi;

    /**
     * Gets the value of the polipi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the polipi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolipi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScreeningPolipoClisma }
     * 
     * 
     */
    public List<ScreeningPolipoClisma> getPolipi() {
        if (polipi == null) {
            polipi = new ArrayList<ScreeningPolipoClisma>();
        }
        return this.polipi;
    }

}
