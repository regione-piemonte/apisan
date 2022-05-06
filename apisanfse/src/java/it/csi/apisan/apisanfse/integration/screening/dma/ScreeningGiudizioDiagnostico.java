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
 * <p>Classe Java per screeningGiudizioDiagnostico complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="screeningGiudizioDiagnostico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prestazioni" type="{http://dma.csi.it/}screeningPrestazione" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "screeningGiudizioDiagnostico", propOrder = {
    "prestazioni",
    "giudizio",
    "medici"
})
public class ScreeningGiudizioDiagnostico {

    @XmlElement(nillable = true)
    protected List<ScreeningPrestazione> prestazioni;
    protected ScreeningGiudizio giudizio;
    @XmlElement(nillable = true)
    protected List<ScreeningMedico> medici;

    /**
     * Gets the value of the prestazioni property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prestazioni property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrestazioni().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScreeningPrestazione }
     * 
     * 
     */
    public List<ScreeningPrestazione> getPrestazioni() {
        if (prestazioni == null) {
            prestazioni = new ArrayList<ScreeningPrestazione>();
        }
        return this.prestazioni;
    }

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
