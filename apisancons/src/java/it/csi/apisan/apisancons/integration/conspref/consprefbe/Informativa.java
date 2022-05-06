/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisancons.integration.conspref.consprefbe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per informativa complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="informativa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idInformativa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipoConsenso" type="{http://consprefbe.csi.it/}tipoConsenso" minOccurs="0"/>
 *         &lt;element name="sottoTipoConsenso" type="{http://consprefbe.csi.it/}sottoTipoConsenso" minOccurs="0"/>
 *         &lt;element name="pdfInformativa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataDecorrenza" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataScadenza" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="descInformativa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="htmlInformativa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "informativa", propOrder = {
    "idInformativa",
    "tipoConsenso",
    "sottoTipoConsenso",
    "pdfInformativa",
    "dataDecorrenza",
    "dataScadenza",
    "descInformativa",
    "htmlInformativa"
})
public class Informativa {

    protected Integer idInformativa;
    protected TipoConsenso tipoConsenso;
    protected SottoTipoConsenso sottoTipoConsenso;
    protected String pdfInformativa;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDecorrenza;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataScadenza;
    protected String descInformativa;
    protected String htmlInformativa;

    /**
     * Recupera il valore della proprietà idInformativa.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdInformativa() {
        return idInformativa;
    }

    /**
     * Imposta il valore della proprietà idInformativa.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdInformativa(Integer value) {
        this.idInformativa = value;
    }

    /**
     * Recupera il valore della proprietà tipoConsenso.
     * 
     * @return
     *     possible object is
     *     {@link TipoConsenso }
     *     
     */
    public TipoConsenso getTipoConsenso() {
        return tipoConsenso;
    }

    /**
     * Imposta il valore della proprietà tipoConsenso.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoConsenso }
     *     
     */
    public void setTipoConsenso(TipoConsenso value) {
        this.tipoConsenso = value;
    }

    /**
     * Recupera il valore della proprietà sottoTipoConsenso.
     * 
     * @return
     *     possible object is
     *     {@link SottoTipoConsenso }
     *     
     */
    public SottoTipoConsenso getSottoTipoConsenso() {
        return sottoTipoConsenso;
    }

    /**
     * Imposta il valore della proprietà sottoTipoConsenso.
     * 
     * @param value
     *     allowed object is
     *     {@link SottoTipoConsenso }
     *     
     */
    public void setSottoTipoConsenso(SottoTipoConsenso value) {
        this.sottoTipoConsenso = value;
    }

    /**
     * Recupera il valore della proprietà pdfInformativa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfInformativa() {
        return pdfInformativa;
    }

    /**
     * Imposta il valore della proprietà pdfInformativa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfInformativa(String value) {
        this.pdfInformativa = value;
    }

    /**
     * Recupera il valore della proprietà dataDecorrenza.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDecorrenza() {
        return dataDecorrenza;
    }

    /**
     * Imposta il valore della proprietà dataDecorrenza.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDecorrenza(XMLGregorianCalendar value) {
        this.dataDecorrenza = value;
    }

    /**
     * Recupera il valore della proprietà dataScadenza.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataScadenza() {
        return dataScadenza;
    }

    /**
     * Imposta il valore della proprietà dataScadenza.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataScadenza(XMLGregorianCalendar value) {
        this.dataScadenza = value;
    }

    /**
     * Recupera il valore della proprietà descInformativa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescInformativa() {
        return descInformativa;
    }

    /**
     * Imposta il valore della proprietà descInformativa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescInformativa(String value) {
        this.descInformativa = value;
    }

    /**
     * Recupera il valore della proprietà notaInformativa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmlInformativa() {
        return htmlInformativa;
    }

    /**
     * Imposta il valore della proprietà notaInformativa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmlInformativa(String value) {
        this.htmlInformativa = value;
    }

}
