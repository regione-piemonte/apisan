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
 *         &lt;element name="calendarioAzienda" type="{http://www.csi.it/GestUtility/}CalendarioAziendaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="err" type="{http://www.csi.it/GestUtility/}ErroriType"/>
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
    "calendarioAzienda",
    "err"
})
@XmlRootElement(name = "getCalendarioProcedureResponse")
public class GetCalendarioProcedureResponse {

    @XmlElement(nillable = true)
    protected List<CalendarioAziendaType> calendarioAzienda;
    @XmlElement(required = true)
    protected ErroriType err;

    /**
     * Gets the value of the calendarioAzienda property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calendarioAzienda property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalendarioAzienda().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CalendarioAziendaType }
     * 
     * 
     */
    public List<CalendarioAziendaType> getCalendarioAzienda() {
        if (calendarioAzienda == null) {
            calendarioAzienda = new ArrayList<CalendarioAziendaType>();
        }
        return this.calendarioAzienda;
    }

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

}
