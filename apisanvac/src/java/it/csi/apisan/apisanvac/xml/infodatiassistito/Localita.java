/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.infodatiassistito;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per Localita complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Localita">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Indirizzo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Codice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataInizio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DataFine" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Localita", propOrder = {
    "indirizzo",
    "codice",
    "descrizione",
    "provincia",
    "cap",
    "dataInizio",
    "dataFine"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Localita {

    @XmlElement(name = "Indirizzo")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String indirizzo;
    @XmlElement(name = "Codice")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String codice;
    @XmlElement(name = "Descrizione")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String descrizione;
    @XmlElement(name = "Provincia")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String provincia;
    @XmlElement(name = "Cap")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String cap;
    @XmlElement(name = "DataInizio", required = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar dataInizio;
    @XmlElement(name = "DataFine", required = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar dataFine;

    /**
     * Recupera il valore della proprietà indirizzo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIndirizzo(String value) {
        this.indirizzo = value;
    }

    /**
     * Recupera il valore della proprietà codice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

    /**
     * Recupera il valore della proprietà provincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getProvincia() {
        return provincia;
    }

    /**
     * Imposta il valore della proprietà provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setProvincia(String value) {
        this.provincia = value;
    }

    /**
     * Recupera il valore della proprietà cap.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCap() {
        return cap;
    }

    /**
     * Imposta il valore della proprietà cap.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCap(String value) {
        this.cap = value;
    }

    /**
     * Recupera il valore della proprietà dataInizio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getDataInizio() {
        return dataInizio;
    }

    /**
     * Imposta il valore della proprietà dataInizio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDataInizio(XMLGregorianCalendar value) {
        this.dataInizio = value;
    }

    /**
     * Recupera il valore della proprietà dataFine.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getDataFine() {
        return dataFine;
    }

    /**
     * Imposta il valore della proprietà dataFine.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDataFine(XMLGregorianCalendar value) {
        this.dataFine = value;
    }

}
