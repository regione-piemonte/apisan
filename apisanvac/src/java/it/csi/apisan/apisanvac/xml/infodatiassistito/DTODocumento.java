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
 * <p>Classe Java per DTODocumento complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DTODocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DataArchiviazione" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tipologia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomeDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatoDocumentoDescrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatoDocumentoId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Documento64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTODocumento", propOrder = {
    "id",
    "dataArchiviazione",
    "descrizione",
    "tipologia",
    "nomeDocumento",
    "statoDocumentoDescrizione",
    "statoDocumentoId",
    "documento64"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class DTODocumento {

    @XmlElement(name = "ID")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected int id;
    @XmlElement(name = "DataArchiviazione", required = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar dataArchiviazione;
    @XmlElement(name = "Descrizione")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String descrizione;
    @XmlElement(name = "Tipologia")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String tipologia;
    @XmlElement(name = "NomeDocumento")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String nomeDocumento;
    @XmlElement(name = "StatoDocumentoDescrizione")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String statoDocumentoDescrizione;
    @XmlElement(name = "StatoDocumentoId")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected int statoDocumentoId;
    @XmlElement(name = "Documento64")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String documento64;

    /**
     * Recupera il valore della proprietà id.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public int getID() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà dataArchiviazione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getDataArchiviazione() {
        return dataArchiviazione;
    }

    /**
     * Imposta il valore della proprietà dataArchiviazione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDataArchiviazione(XMLGregorianCalendar value) {
        this.dataArchiviazione = value;
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
     * Recupera il valore della proprietà tipologia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getTipologia() {
        return tipologia;
    }

    /**
     * Imposta il valore della proprietà tipologia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTipologia(String value) {
        this.tipologia = value;
    }

    /**
     * Recupera il valore della proprietà nomeDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getNomeDocumento() {
        return nomeDocumento;
    }

    /**
     * Imposta il valore della proprietà nomeDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNomeDocumento(String value) {
        this.nomeDocumento = value;
    }

    /**
     * Recupera il valore della proprietà statoDocumentoDescrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getStatoDocumentoDescrizione() {
        return statoDocumentoDescrizione;
    }

    /**
     * Imposta il valore della proprietà statoDocumentoDescrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setStatoDocumentoDescrizione(String value) {
        this.statoDocumentoDescrizione = value;
    }

    /**
     * Recupera il valore della proprietà statoDocumentoId.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public int getStatoDocumentoId() {
        return statoDocumentoId;
    }

    /**
     * Imposta il valore della proprietà statoDocumentoId.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setStatoDocumentoId(int value) {
        this.statoDocumentoId = value;
    }

    /**
     * Recupera il valore della proprietà documento64.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getDocumento64() {
        return documento64;
    }

    /**
     * Imposta il valore della proprietà documento64.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDocumento64(String value) {
        this.documento64 = value;
    }

}
