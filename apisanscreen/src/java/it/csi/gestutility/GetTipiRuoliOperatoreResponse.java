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
import it.csi.gestoperatore.RuoloType;


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
 *         &lt;element name="err" type="{http://www.csi.it/GestUtility/}ErroriType"/>
 *         &lt;element name="tipoRuoloOperatore" type="{http://www.csi.it/gestOperatore/}ruoloType" maxOccurs="unbounded" minOccurs="0"/>
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
    "err",
    "tipoRuoloOperatore"
})
@XmlRootElement(name = "getTipiRuoliOperatoreResponse")
public class GetTipiRuoliOperatoreResponse {

    @XmlElement(required = true)
    protected ErroriType err;
    @XmlElement(nillable = true)
    protected List<RuoloType> tipoRuoloOperatore;

    /**
     * Recupera il valore della proprietà err.
     * 
     * @return
     *     possible object is
     *     {@link ErroriType }
     *     
     */
    public ErroriType getErr() {
        return err;
    }

    /**
     * Imposta il valore della proprietà err.
     * 
     * @param value
     *     allowed object is
     *     {@link ErroriType }
     *     
     */
    public void setErr(ErroriType value) {
        this.err = value;
    }

    /**
     * Gets the value of the tipoRuoloOperatore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipoRuoloOperatore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipoRuoloOperatore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuoloType }
     * 
     * 
     */
    public List<RuoloType> getTipoRuoloOperatore() {
        if (tipoRuoloOperatore == null) {
            tipoRuoloOperatore = new ArrayList<RuoloType>();
        }
        return this.tipoRuoloOperatore;
    }

}
