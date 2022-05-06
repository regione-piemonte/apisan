/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.operatori.def.opessanws.opessan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per RapportoLavoro complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RapportoLavoro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="azienda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datainizioRapporto" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="qualifica" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataFineRapporto" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataInizioAdesione" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dataFineAdesione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RapportoLavoro", propOrder = {
    "azienda",
    "datainizioRapporto",
    "qualifica",
    "dataFineRapporto",
    "dataInizioAdesione",
    "dataFineAdesione"
})
public class RapportoLavoro {

    @XmlElement(required = true)
    protected String azienda;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datainizioRapporto;
    @XmlElement(required = true)
    protected String qualifica;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFineRapporto;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInizioAdesione;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFineAdesione;

    /**
     * Recupera il valore della proprieta azienda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAzienda() {
        return azienda;
    }

    /**
     * Imposta il valore della proprieta azienda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAzienda(String value) {
        this.azienda = value;
    }

    /**
     * Recupera il valore della proprieta datainizioRapporto.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatainizioRapporto() {
        return datainizioRapporto;
    }

    /**
     * Imposta il valore della proprieta datainizioRapporto.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatainizioRapporto(XMLGregorianCalendar value) {
        this.datainizioRapporto = value;
    }

    /**
     * Recupera il valore della proprieta qualifica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifica() {
        return qualifica;
    }

    /**
     * Imposta il valore della proprieta qualifica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifica(String value) {
        this.qualifica = value;
    }

    /**
     * Recupera il valore della proprieta dataFineRapporto.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFineRapporto() {
        return dataFineRapporto;
    }

    /**
     * Imposta il valore della proprieta dataFineRapporto.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFineRapporto(XMLGregorianCalendar value) {
        this.dataFineRapporto = value;
    }

    /**
     * Recupera il valore della proprieta dataInizioAdesione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInizioAdesione() {
        return dataInizioAdesione;
    }

    /**
     * Imposta il valore della proprieta dataInizioAdesione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInizioAdesione(XMLGregorianCalendar value) {
        this.dataInizioAdesione = value;
    }

    /**
     * Recupera il valore della proprieta dataFineAdesione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFineAdesione() {
        return dataFineAdesione;
    }

    /**
     * Imposta il valore della proprieta dataFineAdesione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFineAdesione(XMLGregorianCalendar value) {
        this.dataFineAdesione = value;
    }

}
