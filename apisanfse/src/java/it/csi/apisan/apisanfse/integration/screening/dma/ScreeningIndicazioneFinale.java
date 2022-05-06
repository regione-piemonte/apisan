/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.screening.dma;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per screeningIndicazioneFinale complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="screeningIndicazioneFinale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="giudizio" type="{http://dma.csi.it/}screeningGiudizio" minOccurs="0"/>
 *         &lt;element name="medici" type="{http://dma.csi.it/}screeningMedico" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "screeningIndicazioneFinale", propOrder = {
    "giudizio",
    "medici"
})
public class ScreeningIndicazioneFinale {

    protected ScreeningGiudizio giudizio;
    @XmlElement(nillable = true)
    protected List<ScreeningMedico> medici;

    /**
     * Recupera il valore della proprietà giudizio.
     * 
     * @return
     *     possible object is
     *     {@link ScreeningGiudizio }
     *     
     */
    public ScreeningGiudizio getGiudizio() {
        return giudizio;
    }

    /**
     * Imposta il valore della proprietà giudizio.
     * 
     * @param value
     *     allowed object is
     *     {@link ScreeningGiudizio }
     *     
     */
    public void setGiudizio(ScreeningGiudizio value) {
        this.giudizio = value;
    }

    /**
     * Gets the value of the medici property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medici property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedici().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScreeningMedico }
     * 
     * 
     */
    public List<ScreeningMedico> getMedici() {
        if (medici == null) {
            medici = new ArrayList<ScreeningMedico>();
        }
        return this.medici;
    }

}
