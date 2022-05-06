/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestutility;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="causali" type="{http://www.csi.it/GestUtility/}CausaleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="out" type="{http://www.csi.it/GestUtility/}ErroriType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "causali",
    "out"
})
@XmlRootElement(name = "getCausaliEsclusioneResponse")
public class GetCausaliEsclusioneResponse {

    @XmlElement(nillable = true)
    protected List<CausaleType> causali;
    @XmlElement(required = true)
    protected ErroriType out;

    /**
     * Gets the value of the causali property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the causali property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCausali().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CausaleType }
     * 
     * 
     */
    public List<CausaleType> getCausali() {
        if (causali == null) {
            causali = new ArrayList<CausaleType>();
        }
        return this.causali;
    }

    /**
     * Recupera il valore della proprietà out.
     * 
     * @return
     *     possible object is
     *     {@link ErroriType }
     *     
     */
    public ErroriType getOut() {
        return out;
    }

    /**
     * Imposta il valore della proprietà out.
     * 
     * @param value
     *     allowed object is
     *     {@link ErroriType }
     *     
     */
    public void setOut(ErroriType value) {
        this.out = value;
    }

}
