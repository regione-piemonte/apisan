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
 *         &lt;element name="sottotipoScreen" type="{http://www.csi.it/GestUtility/}SottotipoScreenType" maxOccurs="unbounded" minOccurs="0"/>
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
    "sottotipoScreen",
    "out"
})
@XmlRootElement(name = "getSottotiposcreeningResponse")
public class GetSottotiposcreeningResponse {

    @XmlElement(nillable = true)
    protected List<SottotipoScreenType> sottotipoScreen;
    @XmlElement(required = true)
    protected ErroriType out;

    /**
     * Gets the value of the sottotipoScreen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sottotipoScreen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSottotipoScreen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SottotipoScreenType }
     * 
     * 
     */
    public List<SottotipoScreenType> getSottotipoScreen() {
        if (sottotipoScreen == null) {
            sottotipoScreen = new ArrayList<SottotipoScreenType>();
        }
        return this.sottotipoScreen;
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
