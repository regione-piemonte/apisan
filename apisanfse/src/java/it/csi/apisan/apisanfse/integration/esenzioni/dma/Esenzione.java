/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.esenzioni.dma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per esenzione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="esenzione">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dma.csi.it/}codifica">
 *       &lt;sequence>
 *         &lt;element name="diagnosi" type="{http://dma.csi.it/}diagnosiEsenzione" minOccurs="0"/>
 *         &lt;element name="enteEmittente" type="{http://dma.csi.it/}enteEmittenteEsenzione" minOccurs="0"/>
 *         &lt;element name="dataEmissione" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="dataScadenza" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="codiceAttestato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oscurato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "esenzione", propOrder = {
    "diagnosi",
    "enteEmittente",
    "dataEmissione",
    "dataScadenza",
    "codiceAttestato",
    "oscurato"
})
public class Esenzione
    extends Codifica
{

    protected DiagnosiEsenzione diagnosi;
    protected EnteEmittenteEsenzione enteEmittente;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataEmissione;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataScadenza;
    protected String codiceAttestato;
    protected String oscurato;

    /**
     * Recupera il valore della proprietà diagnosi.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosiEsenzione }
     *     
     */
    public DiagnosiEsenzione getDiagnosi() {
        return diagnosi;
    }

    /**
     * Imposta il valore della proprietà diagnosi.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosiEsenzione }
     *     
     */
    public void setDiagnosi(DiagnosiEsenzione value) {
        this.diagnosi = value;
    }

    /**
     * Recupera il valore della proprietà enteEmittente.
     * 
     * @return
     *     possible object is
     *     {@link EnteEmittenteEsenzione }
     *     
     */
    public EnteEmittenteEsenzione getEnteEmittente() {
        return enteEmittente;
    }

    /**
     * Imposta il valore della proprietà enteEmittente.
     * 
     * @param value
     *     allowed object is
     *     {@link EnteEmittenteEsenzione }
     *     
     */
    public void setEnteEmittente(EnteEmittenteEsenzione value) {
        this.enteEmittente = value;
    }

    /**
     * Recupera il valore della proprietà dataEmissione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissione() {
        return dataEmissione;
    }

    /**
     * Imposta il valore della proprietà dataEmissione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissione(XMLGregorianCalendar value) {
        this.dataEmissione = value;
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
     * Recupera il valore della proprietà codiceAttestato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceAttestato() {
        return codiceAttestato;
    }

    /**
     * Imposta il valore della proprietà codiceAttestato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceAttestato(String value) {
        this.codiceAttestato = value;
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

}
