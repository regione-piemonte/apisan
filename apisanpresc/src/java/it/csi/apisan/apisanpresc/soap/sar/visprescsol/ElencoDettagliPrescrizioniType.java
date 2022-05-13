/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.sar.visprescsol;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per elencoDettagliPrescrizioniType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="elencoDettagliPrescrizioniType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DettaglioPrescrizione" type="{http://tipodati.xsd.dem.sanita.finanze.it}dettaglioPrescrizioneType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "elencoDettagliPrescrizioniType", propOrder = {
    "dettaglioPrescrizione"
})
public class ElencoDettagliPrescrizioniType {

    @XmlElement(name = "DettaglioPrescrizione", required = true)
    protected List<DettaglioPrescrizioneType> dettaglioPrescrizione;

    /**
     * Gets the value of the dettaglioPrescrizione property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dettaglioPrescrizione property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDettaglioPrescrizione().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DettaglioPrescrizioneType }
     * 
     * 
     */
    public List<DettaglioPrescrizioneType> getDettaglioPrescrizione() {
        if (dettaglioPrescrizione == null) {
            dettaglioPrescrizione = new ArrayList<DettaglioPrescrizioneType>();
        }
        return this.dettaglioPrescrizione;
    }

}
