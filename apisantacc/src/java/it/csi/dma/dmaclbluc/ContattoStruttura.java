/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per contattoStruttura complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="contattoStruttura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipologiaStruttura" type="{http://dmaclbluc.dma.csi.it/}tipologiaStruttura" minOccurs="0"/>
 *         &lt;element name="denominazioneStruttura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataInizioContatto" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataFineContatto" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="motivazioneContatto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipologiaContatto" type="{http://dmaclbluc.dma.csi.it/}tipologiaContatto" minOccurs="0"/>
 *         &lt;element name="tipoContattoMedNonConvenz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contattoStruttura", propOrder = {
    "tipologiaStruttura",
    "denominazioneStruttura",
    "dataInizioContatto",
    "dataFineContatto",
    "motivazioneContatto",
    "tipologiaContatto",
    "tipoContattoMedNonConvenz"
})
public class ContattoStruttura {

    @XmlElement(namespace = "")
    protected TipologiaStruttura tipologiaStruttura;
    @XmlElement(namespace = "")
    protected String denominazioneStruttura;
    @XmlElement(namespace = "")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInizioContatto;
    @XmlElement(namespace = "")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFineContatto;
    @XmlElement(namespace = "")
    protected String motivazioneContatto;
    @XmlElement(namespace = "")
    protected TipologiaContatto tipologiaContatto;
    @XmlElement(namespace = "")
    protected String tipoContattoMedNonConvenz;

    /**
     * Recupera il valore della proprietà tipologiaStruttura.
     * 
     * @return
     *     possible object is
     *     {@link TipologiaStruttura }
     *     
     */
    public TipologiaStruttura getTipologiaStruttura() {
        return tipologiaStruttura;
    }

    /**
     * Imposta il valore della proprietà tipologiaStruttura.
     * 
     * @param value
     *     allowed object is
     *     {@link TipologiaStruttura }
     *     
     */
    public void setTipologiaStruttura(TipologiaStruttura value) {
        this.tipologiaStruttura = value;
    }

    /**
     * Recupera il valore della proprietà denominazioneStruttura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenominazioneStruttura() {
        return denominazioneStruttura;
    }

    /**
     * Imposta il valore della proprietà denominazioneStruttura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenominazioneStruttura(String value) {
        this.denominazioneStruttura = value;
    }

    /**
     * Recupera il valore della proprietà dataInizioContatto.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInizioContatto() {
        return dataInizioContatto;
    }

    /**
     * Imposta il valore della proprietà dataInizioContatto.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInizioContatto(XMLGregorianCalendar value) {
        this.dataInizioContatto = value;
    }

    /**
     * Recupera il valore della proprietà dataFineContatto.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFineContatto() {
        return dataFineContatto;
    }

    /**
     * Imposta il valore della proprietà dataFineContatto.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFineContatto(XMLGregorianCalendar value) {
        this.dataFineContatto = value;
    }

    /**
     * Recupera il valore della proprietà motivazioneContatto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivazioneContatto() {
        return motivazioneContatto;
    }

    /**
     * Imposta il valore della proprietà motivazioneContatto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivazioneContatto(String value) {
        this.motivazioneContatto = value;
    }

    /**
     * Recupera il valore della proprietà tipologiaContatto.
     * 
     * @return
     *     possible object is
     *     {@link TipologiaContatto }
     *     
     */
    public TipologiaContatto getTipologiaContatto() {
        return tipologiaContatto;
    }

    /**
     * Imposta il valore della proprietà tipologiaContatto.
     * 
     * @param value
     *     allowed object is
     *     {@link TipologiaContatto }
     *     
     */
    public void setTipologiaContatto(TipologiaContatto value) {
        this.tipologiaContatto = value;
    }

    /**
     * Recupera il valore della proprietà tipoContattoMedNonConvenz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoContattoMedNonConvenz() {
        return tipoContattoMedNonConvenz;
    }

    /**
     * Imposta il valore della proprietà tipoContattoMedNonConvenz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoContattoMedNonConvenz(String value) {
        this.tipoContattoMedNonConvenz = value;
    }

}
