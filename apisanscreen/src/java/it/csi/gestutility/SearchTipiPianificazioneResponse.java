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
 *         &lt;element name="tipiPianificazione" type="{http://www.csi.it/GestUtility/}tipoPianificazioneType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="errori" type="{http://www.csi.it/GestUtility/}ErroriType" minOccurs="0"/>
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
    "tipiPianificazione",
    "errori"
})
@XmlRootElement(name = "searchTipiPianificazioneResponse")
public class SearchTipiPianificazioneResponse {

    @XmlElement(nillable = true)
    protected List<TipoPianificazioneType> tipiPianificazione;
    protected ErroriType errori;

    /**
     * Gets the value of the tipiPianificazione property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipiPianificazione property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipiPianificazione().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoPianificazioneType }
     * 
     * 
     */
    public List<TipoPianificazioneType> getTipiPianificazione() {
        if (tipiPianificazione == null) {
            tipiPianificazione = new ArrayList<TipoPianificazioneType>();
        }
        return this.tipiPianificazione;
    }

    /**
     * Recupera il valore della proprietà errori.
     * 
     * @return
     *     possible object is
     *     {@link ErroriType }
     *     
     */
    public ErroriType getErrori() {
        return errori;
    }

    /**
     * Imposta il valore della proprietà errori.
     * 
     * @param value
     *     allowed object is
     *     {@link ErroriType }
     *     
     */
    public void setErrori(ErroriType value) {
        this.errori = value;
    }

}
