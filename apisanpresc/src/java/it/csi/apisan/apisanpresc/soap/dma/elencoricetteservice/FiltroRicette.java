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
 * <p>Classe Java per filtroRicette complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="filtroRicette">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoPrescrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regionePrescrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataInizio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataFine" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ricetteScadute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filtroRicette", propOrder = {
    "tipoPrescrizione",
    "regionePrescrizione",
    "dataInizio",
    "dataFine",
    "ricetteScadute"
})
public class FiltroRicette {

    protected String tipoPrescrizione;
    protected String regionePrescrizione;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInizio;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFine;
    protected String ricetteScadute;

    /**
     * Recupera il valore della property tipoPrescrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPrescrizione() {
        return tipoPrescrizione;
    }

    /**
     * Imposta il valore della property tipoPrescrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPrescrizione(String value) {
        this.tipoPrescrizione = value;
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
     * Recupera il valore della property dataInizio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInizio() {
        return dataInizio;
    }

    /**
     * Imposta il valore della property dataInizio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInizio(XMLGregorianCalendar value) {
        this.dataInizio = value;
    }

    /**
     * Recupera il valore della property dataFine.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFine() {
        return dataFine;
    }

    /**
     * Imposta il valore della property dataFine.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFine(XMLGregorianCalendar value) {
        this.dataFine = value;
    }

    /**
     * Recupera il valore della property ricetteScadute.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRicetteScadute() {
        return ricetteScadute;
    }

    /**
     * Imposta il valore della property ricetteScadute.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRicetteScadute(String value) {
        this.ricetteScadute = value;
    }

}
