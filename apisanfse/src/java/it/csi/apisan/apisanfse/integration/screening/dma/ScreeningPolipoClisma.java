/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.screening.dma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per screeningPolipoClisma complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="screeningPolipoClisma">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="polipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sede" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dimensione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lesioneSospettaCA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "screeningPolipoClisma", propOrder = {
    "polipo",
    "sede",
    "dimensione",
    "lesioneSospettaCA"
})
public class ScreeningPolipoClisma {

    protected String polipo;
    protected String sede;
    protected String dimensione;
    protected String lesioneSospettaCA;

    /**
     * Recupera il valore della proprietà polipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolipo() {
        return polipo;
    }

    /**
     * Imposta il valore della proprietà polipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolipo(String value) {
        this.polipo = value;
    }

    /**
     * Recupera il valore della proprietà sede.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSede() {
        return sede;
    }

    /**
     * Imposta il valore della proprietà sede.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSede(String value) {
        this.sede = value;
    }

    /**
     * Recupera il valore della proprietà dimensione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensione() {
        return dimensione;
    }

    /**
     * Imposta il valore della proprietà dimensione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensione(String value) {
        this.dimensione = value;
    }

    /**
     * Recupera il valore della proprietà lesioneSospettaCA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLesioneSospettaCA() {
        return lesioneSospettaCA;
    }

    /**
     * Imposta il valore della proprietà lesioneSospettaCA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLesioneSospettaCA(String value) {
        this.lesioneSospettaCA = value;
    }

}
