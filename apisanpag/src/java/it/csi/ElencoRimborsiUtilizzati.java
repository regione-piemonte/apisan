/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per elencoRimborsiUtilizzati complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="elencoRimborsiUtilizzati">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RIMBORSO_UTILIZZATO" type="{http://csi.it}RIMBORSO_UTILIZZATO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "elencoRimborsiUtilizzati", namespace = "http://csi.it", propOrder = {
    "rimborsoutilizzato"
})
public class ElencoRimborsiUtilizzati {

    @XmlElement(name = "RIMBORSO_UTILIZZATO", namespace = "http://csi.it")
    protected List<RIMBORSOUTILIZZATO> rimborsoutilizzato;

    /**
     * Gets the value of the rimborsoutilizzato property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rimborsoutilizzato property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRIMBORSOUTILIZZATO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RIMBORSOUTILIZZATO }
     * 
     * 
     */
    public List<RIMBORSOUTILIZZATO> getRIMBORSOUTILIZZATO() {
        if (rimborsoutilizzato == null) {
            rimborsoutilizzato = new ArrayList<RIMBORSOUTILIZZATO>();
        }
        return this.rimborsoutilizzato;
    }

}
