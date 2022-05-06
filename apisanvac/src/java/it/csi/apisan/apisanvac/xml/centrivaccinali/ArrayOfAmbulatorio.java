/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.centrivaccinali;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfAmbulatorio complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAmbulatorio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ambulatorio" type="{}Ambulatorio" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAmbulatorio", propOrder = {
    "ambulatorio"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:04+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class ArrayOfAmbulatorio {

    @XmlElement(name = "Ambulatorio", nillable = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:04+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Ambulatorio> ambulatorio;

    /**
     * Gets the value of the ambulatorio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ambulatorio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmbulatorio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ambulatorio }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:04+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Ambulatorio> getAmbulatorio() {
        if (ambulatorio == null) {
            ambulatorio = new ArrayList<Ambulatorio>();
        }
        return this.ambulatorio;
    }

}
