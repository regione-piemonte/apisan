/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documenti.dmacc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per prestazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="prestazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPrestazione" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/>
 *         &lt;element name="codicePrestazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="descrizionePrestazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="dataOra" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/>
 *         &lt;element name="branca" type="{http://dmacc.csi.it/}branca" minOccurs="0" form="unqualified"/>
 *         &lt;element name="quantita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prestazione", propOrder = {
    "idPrestazione",
    "codicePrestazione",
    "descrizionePrestazione",
    "dataOra",
    "branca",
    "quantita"
})
public class Prestazione {

    protected Long idPrestazione;
    protected String codicePrestazione;
    protected String descrizionePrestazione;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataOra;
    protected Branca branca;
    protected String quantita;

    /**
     * Recupera il valore della proprietà idPrestazione.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdPrestazione() {
        return idPrestazione;
    }

    /**
     * Imposta il valore della proprietà idPrestazione.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdPrestazione(Long value) {
        this.idPrestazione = value;
    }

    /**
     * Recupera il valore della proprietà codicePrestazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodicePrestazione() {
        return codicePrestazione;
    }

    /**
     * Imposta il valore della proprietà codicePrestazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodicePrestazione(String value) {
        this.codicePrestazione = value;
    }

    /**
     * Recupera il valore della proprietà descrizionePrestazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizionePrestazione() {
        return descrizionePrestazione;
    }

    /**
     * Imposta il valore della proprietà descrizionePrestazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizionePrestazione(String value) {
        this.descrizionePrestazione = value;
    }

    /**
     * Recupera il valore della proprietà dataOra.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataOra() {
        return dataOra;
    }

    /**
     * Imposta il valore della proprietà dataOra.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataOra(XMLGregorianCalendar value) {
        this.dataOra = value;
    }

    /**
     * Recupera il valore della proprietà branca.
     * 
     * @return
     *     possible object is
     *     {@link Branca }
     *     
     */
    public Branca getBranca() {
        return branca;
    }

    /**
     * Imposta il valore della proprietà branca.
     * 
     * @param value
     *     allowed object is
     *     {@link Branca }
     *     
     */
    public void setBranca(Branca value) {
        this.branca = value;
    }

    /**
     * Recupera il valore della proprietà quantita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantita() {
        return quantita;
    }

    /**
     * Imposta il valore della proprietà quantita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantita(String value) {
        this.quantita = value;
    }

}
