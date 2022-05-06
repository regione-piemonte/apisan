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
 * <p>Classe Java per screeningDettaglio complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="screeningDettaglio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prestazioni" type="{http://dma.csi.it/}screeningPrestazione" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="giudiziDiagnostici" type="{http://dma.csi.it/}screeningGiudizioDiagnostico" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="indicazioneFinale" type="{http://dma.csi.it/}screeningIndicazioneFinale" minOccurs="0"/>
 *         &lt;element name="interventoErogato" type="{http://dma.csi.it/}screeningTrattamentoErogato" minOccurs="0"/>
 *         &lt;element name="refertoColonscopia" type="{http://dma.csi.it/}screeningRefertoColonscopia" minOccurs="0"/>
 *         &lt;element name="refertoClismaOpaco" type="{http://dma.csi.it/}screeningRefertoClismaOpaco" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "screeningDettaglio", propOrder = {
    "prestazioni",
    "giudiziDiagnostici",
    "indicazioneFinale",
    "interventoErogato",
    "refertoColonscopia",
    "refertoClismaOpaco"
})
public class ScreeningDettaglio {

    @XmlElement(nillable = true)
    protected List<ScreeningPrestazione> prestazioni;
    @XmlElement(nillable = true)
    protected List<ScreeningGiudizioDiagnostico> giudiziDiagnostici;
    protected ScreeningIndicazioneFinale indicazioneFinale;
    protected ScreeningTrattamentoErogato interventoErogato;
    protected ScreeningRefertoColonscopia refertoColonscopia;
    protected ScreeningRefertoClismaOpaco refertoClismaOpaco;

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
     * Gets the value of the giudiziDiagnostici property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giudiziDiagnostici property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiudiziDiagnostici().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScreeningGiudizioDiagnostico }
     * 
     * 
     */
    public List<ScreeningGiudizioDiagnostico> getGiudiziDiagnostici() {
        if (giudiziDiagnostici == null) {
            giudiziDiagnostici = new ArrayList<ScreeningGiudizioDiagnostico>();
        }
        return this.giudiziDiagnostici;
    }

    /**
     * Recupera il valore della proprietà indicazioneFinale.
     * 
     * @return
     *     possible object is
     *     {@link ScreeningIndicazioneFinale }
     *     
     */
    public ScreeningIndicazioneFinale getIndicazioneFinale() {
        return indicazioneFinale;
    }

    /**
     * Imposta il valore della proprietà indicazioneFinale.
     * 
     * @param value
     *     allowed object is
     *     {@link ScreeningIndicazioneFinale }
     *     
     */
    public void setIndicazioneFinale(ScreeningIndicazioneFinale value) {
        this.indicazioneFinale = value;
    }

    /**
     * Recupera il valore della proprietà interventoErogato.
     * 
     * @return
     *     possible object is
     *     {@link ScreeningTrattamentoErogato }
     *     
     */
    public ScreeningTrattamentoErogato getInterventoErogato() {
        return interventoErogato;
    }

    /**
     * Imposta il valore della proprietà interventoErogato.
     * 
     * @param value
     *     allowed object is
     *     {@link ScreeningTrattamentoErogato }
     *     
     */
    public void setInterventoErogato(ScreeningTrattamentoErogato value) {
        this.interventoErogato = value;
    }

    /**
     * Recupera il valore della proprietà refertoColonscopia.
     * 
     * @return
     *     possible object is
     *     {@link ScreeningRefertoColonscopia }
     *     
     */
    public ScreeningRefertoColonscopia getRefertoColonscopia() {
        return refertoColonscopia;
    }

    /**
     * Imposta il valore della proprietà refertoColonscopia.
     * 
     * @param value
     *     allowed object is
     *     {@link ScreeningRefertoColonscopia }
     *     
     */
    public void setRefertoColonscopia(ScreeningRefertoColonscopia value) {
        this.refertoColonscopia = value;
    }

    /**
     * Recupera il valore della proprietà refertoClismaOpaco.
     * 
     * @return
     *     possible object is
     *     {@link ScreeningRefertoClismaOpaco }
     *     
     */
    public ScreeningRefertoClismaOpaco getRefertoClismaOpaco() {
        return refertoClismaOpaco;
    }

    /**
     * Imposta il valore della proprietà refertoClismaOpaco.
     * 
     * @param value
     *     allowed object is
     *     {@link ScreeningRefertoClismaOpaco }
     *     
     */
    public void setRefertoClismaOpaco(ScreeningRefertoClismaOpaco value) {
        this.refertoClismaOpaco = value;
    }

}
