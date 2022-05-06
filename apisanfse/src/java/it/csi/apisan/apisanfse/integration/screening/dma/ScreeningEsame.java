/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.screening.dma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per screeningEsame complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="screeningEsame">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="tipoEsame" type="{http://dma.csi.it/}screeningEsameTipo" minOccurs="0"/>
 *         &lt;element name="esito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aziendaSanitaria" type="{http://dma.csi.it/}aziendaSanitaria" minOccurs="0"/>
 *         &lt;element name="unitaOperativa" type="{http://dma.csi.it/}unitaOperativaSanitaria" minOccurs="0"/>
 *         &lt;element name="oscurato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dettaglio" type="{http://dma.csi.it/}screeningDettaglio" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "screeningEsame", propOrder = {
    "data",
    "tipoEsame",
    "esito",
    "aziendaSanitaria",
    "unitaOperativa",
    "oscurato",
    "dettaglio"
})
public class ScreeningEsame {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar data;
    protected ScreeningEsameTipo tipoEsame;
    protected String esito;
    protected AziendaSanitaria aziendaSanitaria;
    protected UnitaOperativaSanitaria unitaOperativa;
    protected String oscurato;
    protected ScreeningDettaglio dettaglio;

    /**
     * Recupera il valore della proprietà data.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Imposta il valore della proprietà data.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * Recupera il valore della proprietà tipoEsame.
     * 
     * @return
     *     possible object is
     *     {@link ScreeningEsameTipo }
     *     
     */
    public ScreeningEsameTipo getTipoEsame() {
        return tipoEsame;
    }

    /**
     * Imposta il valore della proprietà tipoEsame.
     * 
     * @param value
     *     allowed object is
     *     {@link ScreeningEsameTipo }
     *     
     */
    public void setTipoEsame(ScreeningEsameTipo value) {
        this.tipoEsame = value;
    }

    /**
     * Recupera il valore della proprietà esito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsito() {
        return esito;
    }

    /**
     * Imposta il valore della proprietà esito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsito(String value) {
        this.esito = value;
    }

    /**
     * Recupera il valore della proprietà aziendaSanitaria.
     * 
     * @return
     *     possible object is
     *     {@link AziendaSanitaria }
     *     
     */
    public AziendaSanitaria getAziendaSanitaria() {
        return aziendaSanitaria;
    }

    /**
     * Imposta il valore della proprietà aziendaSanitaria.
     * 
     * @param value
     *     allowed object is
     *     {@link AziendaSanitaria }
     *     
     */
    public void setAziendaSanitaria(AziendaSanitaria value) {
        this.aziendaSanitaria = value;
    }

    /**
     * Recupera il valore della proprietà unitaOperativa.
     * 
     * @return
     *     possible object is
     *     {@link UnitaOperativaSanitaria }
     *     
     */
    public UnitaOperativaSanitaria getUnitaOperativa() {
        return unitaOperativa;
    }

    /**
     * Imposta il valore della proprietà unitaOperativa.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitaOperativaSanitaria }
     *     
     */
    public void setUnitaOperativa(UnitaOperativaSanitaria value) {
        this.unitaOperativa = value;
    }

    /**
     * Recupera il valore della proprietà oscurato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOscurato() {
        return oscurato;
    }

    /**
     * Imposta il valore della proprietà oscurato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOscurato(String value) {
        this.oscurato = value;
    }

    /**
     * Recupera il valore della proprietà dettaglio.
     * 
     * @return
     *     possible object is
     *     {@link ScreeningDettaglio }
     *     
     */
    public ScreeningDettaglio getDettaglio() {
        return dettaglio;
    }

    /**
     * Imposta il valore della proprietà dettaglio.
     * 
     * @param value
     *     allowed object is
     *     {@link ScreeningDettaglio }
     *     
     */
    public void setDettaglio(ScreeningDettaglio value) {
        this.dettaglio = value;
    }

}
