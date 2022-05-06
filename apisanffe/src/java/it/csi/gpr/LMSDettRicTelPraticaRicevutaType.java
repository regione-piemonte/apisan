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
 * <p>Classe Java per LMSDettRicTelPraticaRicevutaType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LMSDettRicTelPraticaRicevutaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RICEVUTA" type="{http://csi.it}LMSRicevutaRTDettPraticaRicevutaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LMSDettRicTelPraticaRicevutaType", propOrder = {
    "ricevuta"
})
public class LMSDettRicTelPraticaRicevutaType {

    @XmlElement(name = "RICEVUTA")
    protected List<LMSRicevutaRTDettPraticaRicevutaType> ricevuta;

    /**
     * Gets the value of the ricevuta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ricevuta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRICEVUTA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LMSRicevutaRTDettPraticaRicevutaType }
     * 
     * 
     */
    public List<LMSRicevutaRTDettPraticaRicevutaType> getRICEVUTA() {
        if (ricevuta == null) {
            ricevuta = new ArrayList<LMSRicevutaRTDettPraticaRicevutaType>();
        }
        return this.ricevuta;
    }

}
