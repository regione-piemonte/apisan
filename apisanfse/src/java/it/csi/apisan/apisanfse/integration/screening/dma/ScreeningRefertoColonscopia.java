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
 * <p>Classe Java per screeningRefertoColonscopia complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="screeningRefertoColonscopia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="colonscopiaInDH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visionePulizia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sedeRaggiunta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colonscopiaNonCompleta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="presenzaPolipi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="presenzaLesioneSospettaPerCA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="necessitaDiSupportoFarmacologico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="altreAnomalieRilevate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complicanzeImmediate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="necessitaDiAssistenzaOspedaliera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="polipi" type="{http://dma.csi.it/}screeningPolipoColon" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "screeningRefertoColonscopia", propOrder = {
    "colonscopiaInDH",
    "visionePulizia",
    "sedeRaggiunta",
    "colonscopiaNonCompleta",
    "motivo",
    "presenzaPolipi",
    "presenzaLesioneSospettaPerCA",
    "necessitaDiSupportoFarmacologico",
    "altreAnomalieRilevate",
    "complicanzeImmediate",
    "necessitaDiAssistenzaOspedaliera",
    "polipi"
})
public class ScreeningRefertoColonscopia {

    protected String colonscopiaInDH;
    protected String visionePulizia;
    protected String sedeRaggiunta;
    protected String colonscopiaNonCompleta;
    protected String motivo;
    protected String presenzaPolipi;
    protected String presenzaLesioneSospettaPerCA;
    protected String necessitaDiSupportoFarmacologico;
    protected String altreAnomalieRilevate;
    protected String complicanzeImmediate;
    protected String necessitaDiAssistenzaOspedaliera;
    @XmlElement(nillable = true)
    protected List<ScreeningPolipoColon> polipi;

    /**
     * Recupera il valore della proprietà colonscopiaInDH.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColonscopiaInDH() {
        return colonscopiaInDH;
    }

    /**
     * Imposta il valore della proprietà colonscopiaInDH.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColonscopiaInDH(String value) {
        this.colonscopiaInDH = value;
    }

    /**
     * Recupera il valore della proprietà visionePulizia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisionePulizia() {
        return visionePulizia;
    }

    /**
     * Imposta il valore della proprietà visionePulizia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisionePulizia(String value) {
        this.visionePulizia = value;
    }

    /**
     * Recupera il valore della proprietà sedeRaggiunta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSedeRaggiunta() {
        return sedeRaggiunta;
    }

    /**
     * Imposta il valore della proprietà sedeRaggiunta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSedeRaggiunta(String value) {
        this.sedeRaggiunta = value;
    }

    /**
     * Recupera il valore della proprietà colonscopiaNonCompleta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColonscopiaNonCompleta() {
        return colonscopiaNonCompleta;
    }

    /**
     * Imposta il valore della proprietà colonscopiaNonCompleta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColonscopiaNonCompleta(String value) {
        this.colonscopiaNonCompleta = value;
    }

    /**
     * Recupera il valore della proprietà motivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * Imposta il valore della proprietà motivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivo(String value) {
        this.motivo = value;
    }

    /**
     * Recupera il valore della proprietà presenzaPolipi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresenzaPolipi() {
        return presenzaPolipi;
    }

    /**
     * Imposta il valore della proprietà presenzaPolipi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresenzaPolipi(String value) {
        this.presenzaPolipi = value;
    }

    /**
     * Recupera il valore della proprietà presenzaLesioneSospettaPerCA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresenzaLesioneSospettaPerCA() {
        return presenzaLesioneSospettaPerCA;
    }

    /**
     * Imposta il valore della proprietà presenzaLesioneSospettaPerCA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresenzaLesioneSospettaPerCA(String value) {
        this.presenzaLesioneSospettaPerCA = value;
    }

    /**
     * Recupera il valore della proprietà necessitaDiSupportoFarmacologico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNecessitaDiSupportoFarmacologico() {
        return necessitaDiSupportoFarmacologico;
    }

    /**
     * Imposta il valore della proprietà necessitaDiSupportoFarmacologico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNecessitaDiSupportoFarmacologico(String value) {
        this.necessitaDiSupportoFarmacologico = value;
    }

    /**
     * Recupera il valore della proprietà altreAnomalieRilevate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltreAnomalieRilevate() {
        return altreAnomalieRilevate;
    }

    /**
     * Imposta il valore della proprietà altreAnomalieRilevate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltreAnomalieRilevate(String value) {
        this.altreAnomalieRilevate = value;
    }

    /**
     * Recupera il valore della proprietà complicanzeImmediate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplicanzeImmediate() {
        return complicanzeImmediate;
    }

    /**
     * Imposta il valore della proprietà complicanzeImmediate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplicanzeImmediate(String value) {
        this.complicanzeImmediate = value;
    }

    /**
     * Recupera il valore della proprietà necessitaDiAssistenzaOspedaliera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNecessitaDiAssistenzaOspedaliera() {
        return necessitaDiAssistenzaOspedaliera;
    }

    /**
     * Imposta il valore della proprietà necessitaDiAssistenzaOspedaliera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNecessitaDiAssistenzaOspedaliera(String value) {
        this.necessitaDiAssistenzaOspedaliera = value;
    }

    /**
     * Gets the value of the polipi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the polipi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolipi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScreeningPolipoColon }
     * 
     * 
     */
    public List<ScreeningPolipoColon> getPolipi() {
        if (polipi == null) {
            polipi = new ArrayList<ScreeningPolipoColon>();
        }
        return this.polipi;
    }

}
