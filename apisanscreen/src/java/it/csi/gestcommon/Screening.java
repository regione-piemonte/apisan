/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestcommon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Screening complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Screening">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="livelliMX" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="livelliCV" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="livelliCR" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Screening", propOrder = {
    "livelliMX",
    "livelliCV",
    "livelliCR"
})
public class Screening {

    @XmlElement(nillable = true)
    protected List<Integer> livelliMX;
    @XmlElement(type = Integer.class)
    protected List<Integer> livelliCV;
    @XmlElement(type = Integer.class)
    protected List<Integer> livelliCR;

    /**
     * Gets the value of the livelliMX property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the livelliMX property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLivelliMX().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getLivelliMX() {
        if (livelliMX == null) {
            livelliMX = new ArrayList<Integer>();
        }
        return this.livelliMX;
    }

    /**
     * Gets the value of the livelliCV property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the livelliCV property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLivelliCV().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getLivelliCV() {
        if (livelliCV == null) {
            livelliCV = new ArrayList<Integer>();
        }
        return this.livelliCV;
    }

    /**
     * Gets the value of the livelliCR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the livelliCR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLivelliCR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getLivelliCR() {
        if (livelliCR == null) {
            livelliCR = new ArrayList<Integer>();
        }
        return this.livelliCR;
    }

}
