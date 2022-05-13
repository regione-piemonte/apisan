/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.dma.elencoricetteservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per ricetta complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ricetta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiceFiscalePaziente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="completa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataCompilazione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="livelloCondifidenzialita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medicoPrescrittore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regionePrescrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stato" type="{http://dma.csi.it/}statoRicetta" minOccurs="0"/>
 *         &lt;element name="tipologia" type="{http://dma.csi.it/}tipoRicetta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ricetta", propOrder = {
    "codiceFiscalePaziente",
    "completa",
    "dataCompilazione",
    "livelloCondifidenzialita",
    "medicoPrescrittore",
    "nre",
    "oid",
    "regionePrescrizione",
    "stato",
    "tipologia"
})
public class Ricetta {

    protected String codiceFiscalePaziente;
    protected String completa;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCompilazione;
    protected String livelloCondifidenzialita;
    protected String medicoPrescrittore;
    protected String nre;
    protected String oid;
    protected String regionePrescrizione;
    protected StatoRicetta stato;
    protected TipoRicetta tipologia;

    /**
     * Recupera il valore della property codiceFiscalePaziente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscalePaziente() {
        return codiceFiscalePaziente;
    }

    /**
     * Imposta il valore della property codiceFiscalePaziente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscalePaziente(String value) {
        this.codiceFiscalePaziente = value;
    }

    /**
     * Recupera il valore della property completa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompleta() {
        return completa;
    }

    /**
     * Imposta il valore della property completa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompleta(String value) {
        this.completa = value;
    }

    /**
     * Recupera il valore della property dataCompilazione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCompilazione() {
        return dataCompilazione;
    }

    /**
     * Imposta il valore della property dataCompilazione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCompilazione(XMLGregorianCalendar value) {
        this.dataCompilazione = value;
    }

    /**
     * Recupera il valore della property livelloCondifidenzialita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLivelloCondifidenzialita() {
        return livelloCondifidenzialita;
    }

    /**
     * Imposta il valore della property livelloCondifidenzialita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLivelloCondifidenzialita(String value) {
        this.livelloCondifidenzialita = value;
    }

    /**
     * Recupera il valore della property medicoPrescrittore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicoPrescrittore() {
        return medicoPrescrittore;
    }

    /**
     * Imposta il valore della property medicoPrescrittore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicoPrescrittore(String value) {
        this.medicoPrescrittore = value;
    }

    /**
     * Recupera il valore della property nre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNre() {
        return nre;
    }

    /**
     * Imposta il valore della property nre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNre(String value) {
        this.nre = value;
    }

    /**
     * Recupera il valore della property oid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOid() {
        return oid;
    }

    /**
     * Imposta il valore della property oid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOid(String value) {
        this.oid = value;
    }

    /**
     * Recupera il valore della property regionePrescrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionePrescrizione() {
        return regionePrescrizione;
    }

    /**
     * Imposta il valore della property regionePrescrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionePrescrizione(String value) {
        this.regionePrescrizione = value;
    }

    /**
     * Recupera il valore della property stato.
     * 
     * @return
     *     possible object is
     *     {@link StatoRicetta }
     *     
     */
    public StatoRicetta getStato() {
        return stato;
    }

    /**
     * Imposta il valore della property stato.
     * 
     * @param value
     *     allowed object is
     *     {@link StatoRicetta }
     *     
     */
    public void setStato(StatoRicetta value) {
        this.stato = value;
    }

    /**
     * Recupera il valore della property tipologia.
     * 
     * @return
     *     possible object is
     *     {@link TipoRicetta }
     *     
     */
    public TipoRicetta getTipologia() {
        return tipologia;
    }

    /**
     * Imposta il valore della property tipologia.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoRicetta }
     *     
     */
    public void setTipologia(TipoRicetta value) {
        this.tipologia = value;
    }

}
