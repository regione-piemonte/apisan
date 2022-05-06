/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.aura.auraws.services.central.anagrafesanitaria;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per InfoEsenzione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InfoEsenzione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codEsenzione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descEsenzione" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codDiagnosi" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="diagnosi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fineValEsenzione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idEsenzione" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="inizioValEsenzione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataEmissione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataScadenza" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataSospensione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="codAttestato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fonte" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoEsenzione", propOrder = {
    "codEsenzione",
    "descEsenzione",
    "codDiagnosi",
    "diagnosi",
    "fineValEsenzione",
    "idEsenzione",
    "inizioValEsenzione",
    "dataEmissione",
    "dataScadenza",
    "dataSospensione",
    "codAttestato",
    "fonte"
})
public class InfoEsenzione {

    protected String codEsenzione;
    protected String descEsenzione;
    protected String codDiagnosi;
    protected String diagnosi;
    protected String fineValEsenzione;
    protected BigDecimal idEsenzione;
    protected String inizioValEsenzione;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataEmissione;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataScadenza;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataSospensione;
    protected String codAttestato;
    protected String fonte;

    /**
     * Recupera il valore della proprietà codEsenzione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEsenzione() {
        return codEsenzione;
    }

    /**
     * Imposta il valore della proprietà codEsenzione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEsenzione(String value) {
        this.codEsenzione = value;
    }

    /**
     * Recupera il valore della proprietà descEsenzione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescEsenzione() {
        return descEsenzione;
    }

    /**
     * Imposta il valore della proprietà descEsenzione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescEsenzione(String value) {
        this.descEsenzione = value;
    }

    /**
     * Recupera il valore della proprietà codDiagnosi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodDiagnosi() {
        return codDiagnosi;
    }

    /**
     * Imposta il valore della proprietà codDiagnosi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodDiagnosi(String value) {
        this.codDiagnosi = value;
    }

    /**
     * Recupera il valore della proprietà diagnosi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosi() {
        return diagnosi;
    }

    /**
     * Imposta il valore della proprietà diagnosi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosi(String value) {
        this.diagnosi = value;
    }

    /**
     * Recupera il valore della proprietà fineValEsenzione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFineValEsenzione() {
        return fineValEsenzione;
    }

    /**
     * Imposta il valore della proprietà fineValEsenzione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFineValEsenzione(String value) {
        this.fineValEsenzione = value;
    }

    /**
     * Recupera il valore della proprietà idEsenzione.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdEsenzione() {
        return idEsenzione;
    }

    /**
     * Imposta il valore della proprietà idEsenzione.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdEsenzione(BigDecimal value) {
        this.idEsenzione = value;
    }

    /**
     * Recupera il valore della proprietà inizioValEsenzione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInizioValEsenzione() {
        return inizioValEsenzione;
    }

    /**
     * Imposta il valore della proprietà inizioValEsenzione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInizioValEsenzione(String value) {
        this.inizioValEsenzione = value;
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
     * Recupera il valore della proprietà dataSospensione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataSospensione() {
        return dataSospensione;
    }

    /**
     * Imposta il valore della proprietà dataSospensione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataSospensione(XMLGregorianCalendar value) {
        this.dataSospensione = value;
    }

    /**
     * Recupera il valore della proprietà codAttestato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAttestato() {
        return codAttestato;
    }

    /**
     * Imposta il valore della proprietà codAttestato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAttestato(String value) {
        this.codAttestato = value;
    }

    /**
     * Recupera il valore della proprietà fonte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFonte() {
        return fonte;
    }

    /**
     * Imposta il valore della proprietà fonte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFonte(String value) {
        this.fonte = value;
    }

}
