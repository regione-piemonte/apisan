/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.aura.auraws.services.central.anagrafesanitaria;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfinformazioniAltreInfo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfinformazioniAltreInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informazioni" type="{http://AnagrafeSanitaria.central.services.auraws.aura.csi.it}AltreInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfinformazioniAltreInfo", propOrder = {
    "informazioni"
})
public class ArrayOfinformazioniAltreInfo {

    @XmlElement(nillable = true)
    protected List<AltreInfo> informazioni;

    /**
     * Gets the value of the informazioni property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informazioni property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformazioni().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AltreInfo }
     * 
     * 
     */
    public List<AltreInfo> getInformazioni() {
        if (informazioni == null) {
            informazioni = new ArrayList<AltreInfo>();
        }
        return this.informazioni;
    }

}
