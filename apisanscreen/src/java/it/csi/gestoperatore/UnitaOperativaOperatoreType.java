/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestoperatore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per UnitaOperativaOperatoreType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UnitaOperativaOperatoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codAzienda" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="codDipartimento" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="codUnpr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descrUo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indirizzoUo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="civicoUo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comuneUo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codScreening" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desScreening" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataEliminazione" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="swiAttivita" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="livello" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitaOperativaOperatoreType", propOrder = {
    "codAzienda",
    "codDipartimento",
    "codUnpr",
    "descrUo",
    "indirizzoUo",
    "civicoUo",
    "comuneUo",
    "codScreening",
    "desScreening",
    "dataEliminazione",
    "swiAttivita",
    "livello"
})
public class UnitaOperativaOperatoreType {

    protected long codAzienda;
    protected long codDipartimento;
    @XmlElement(required = true)
    protected String codUnpr;
    protected String descrUo;
    protected String indirizzoUo;
    protected String civicoUo;
    protected String comuneUo;
    protected String codScreening;
    protected String desScreening;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataEliminazione;
    @XmlElement(required = true)
    protected String swiAttivita;
    @XmlElement(required = true)
    protected String livello;

    /**
     * Recupera il valore della proprietà codAzienda.
     * 
     */
    public long getCodAzienda() {
        return codAzienda;
    }

    /**
     * Imposta il valore della proprietà codAzienda.
     * 
     */
    public void setCodAzienda(long value) {
        this.codAzienda = value;
    }

    /**
     * Recupera il valore della proprietà codDipartimento.
     * 
     */
    public long getCodDipartimento() {
        return codDipartimento;
    }

    /**
     * Imposta il valore della proprietà codDipartimento.
     * 
     */
    public void setCodDipartimento(long value) {
        this.codDipartimento = value;
    }

    /**
     * Recupera il valore della proprietà codUnpr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodUnpr() {
        return codUnpr;
    }

    /**
     * Imposta il valore della proprietà codUnpr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodUnpr(String value) {
        this.codUnpr = value;
    }

    /**
     * Recupera il valore della proprietà descrUo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrUo() {
        return descrUo;
    }

    /**
     * Imposta il valore della proprietà descrUo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrUo(String value) {
        this.descrUo = value;
    }

    /**
     * Recupera il valore della proprietà indirizzoUo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndirizzoUo() {
        return indirizzoUo;
    }

    /**
     * Imposta il valore della proprietà indirizzoUo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndirizzoUo(String value) {
        this.indirizzoUo = value;
    }

    /**
     * Recupera il valore della proprietà civicoUo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivicoUo() {
        return civicoUo;
    }

    /**
     * Imposta il valore della proprietà civicoUo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivicoUo(String value) {
        this.civicoUo = value;
    }

    /**
     * Recupera il valore della proprietà comuneUo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComuneUo() {
        return comuneUo;
    }

    /**
     * Imposta il valore della proprietà comuneUo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComuneUo(String value) {
        this.comuneUo = value;
    }

    /**
     * Recupera il valore della proprietà codScreening.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodScreening() {
        return codScreening;
    }

    /**
     * Imposta il valore della proprietà codScreening.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodScreening(String value) {
        this.codScreening = value;
    }

    /**
     * Recupera il valore della proprietà desScreening.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesScreening() {
        return desScreening;
    }

    /**
     * Imposta il valore della proprietà desScreening.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesScreening(String value) {
        this.desScreening = value;
    }

    /**
     * Recupera il valore della proprietà dataEliminazione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEliminazione() {
        return dataEliminazione;
    }

    /**
     * Imposta il valore della proprietà dataEliminazione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEliminazione(XMLGregorianCalendar value) {
        this.dataEliminazione = value;
    }

    /**
     * Recupera il valore della proprietà swiAttivita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwiAttivita() {
        return swiAttivita;
    }

    /**
     * Imposta il valore della proprietà swiAttivita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwiAttivita(String value) {
        this.swiAttivita = value;
    }

    /**
     * Recupera il valore della proprietà livello.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLivello() {
        return livello;
    }

    /**
     * Imposta il valore della proprietà livello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLivello(String value) {
        this.livello = value;
    }

}
