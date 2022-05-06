/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.contatticentrivaccinali;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Codice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Indirizzo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ambulatori" type="{}ArrayOfAmbulatorio" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTO", propOrder = {
    "id",
    "codice",
    "descrizione",
    "comune",
    "indirizzo",
    "telefono",
    "mail",
    "note",
    "ambulatori"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class DTO {

    @XmlElement(name = "Id")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String id;
    @XmlElement(name = "Codice")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String codice;
    @XmlElement(name = "Descrizione")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String descrizione;
    @XmlElement(name = "Comune")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String comune;
    @XmlElement(name = "Indirizzo")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String indirizzo;
    @XmlElement(name = "Telefono")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String telefono;
    @XmlElement(name = "Mail")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String mail;
    @XmlElement(name = "Note")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String note;
    @XmlElement(name = "Ambulatori")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ArrayOfAmbulatorio ambulatori;

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà codice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCodice() {
        return codice;
    }

    /**
     * Imposta il valore della proprietà codice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCodice(String value) {
        this.codice = value;
    }

    /**
     * Recupera il valore della proprietà descrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Imposta il valore della proprietà descrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

    /**
     * Recupera il valore della proprietà comune.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getComune() {
        return comune;
    }

    /**
     * Imposta il valore della proprietà comune.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setComune(String value) {
        this.comune = value;
    }

    /**
     * Recupera il valore della proprietà indirizzo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getIndirizzo() {
        return indirizzo;
    }

    /**
     * Imposta il valore della proprietà indirizzo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIndirizzo(String value) {
        this.indirizzo = value;
    }

    /**
     * Recupera il valore della proprietà telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getTelefono() {
        return telefono;
    }

    /**
     * Imposta il valore della proprietà telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Recupera il valore della proprietà mail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getMail() {
        return mail;
    }

    /**
     * Imposta il valore della proprietà mail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMail(String value) {
        this.mail = value;
    }

    /**
     * Recupera il valore della proprietà note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getNote() {
        return note;
    }

    /**
     * Imposta il valore della proprietà note.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Recupera il valore della proprietà ambulatori.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAmbulatorio }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public ArrayOfAmbulatorio getAmbulatori() {
        return ambulatori;
    }

    /**
     * Imposta il valore della proprietà ambulatori.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAmbulatorio }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAmbulatori(ArrayOfAmbulatorio value) {
        this.ambulatori = value;
    }

}
