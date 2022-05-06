/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.vaccinazionesclusa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per DTOVaccinazioneEsclusa complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DTOVaccinazioneEsclusa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodicePaziente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DataVisita" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CodiceVaccinazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescrizioneVaccinazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceMotivoEsclusione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescrizioneMotivoEsclusione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceOperatore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescrizioneOperatore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataScadenza" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CodicePazientePrecedente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodiceUslInserimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FlagVisibilità" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoteAcquisizioneDatiVaccinaliCentrale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataResistrazione" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IdUtenteRegistrazione" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DataModifica" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IdUtenteModifica" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DataEliminAzione" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IdUtenteEliminazione" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="NumeroDose" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTOVaccinazioneEsclusa", propOrder = {
    "codicePaziente",
    "dataVisita",
    "codiceVaccinazione",
    "descrizioneVaccinazione",
    "codiceMotivoEsclusione",
    "descrizioneMotivoEsclusione",
    "codiceOperatore",
    "descrizioneOperatore",
    "dataScadenza",
    "codicePazientePrecedente",
    "codiceUslInserimento",
    "id",
    "flagVisibilita",
    "noteAcquisizioneDatiVaccinaliCentrale",
    "dataResistrazione",
    "idUtenteRegistrazione",
    "dataModifica",
    "idUtenteModifica",
    "dataEliminAzione",
    "idUtenteEliminazione",
    "numeroDose",
    "note"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class DTOVaccinazioneEsclusa {

    @XmlElement(name = "CodicePaziente")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected int codicePaziente;
    @XmlElement(name = "DataVisita", required = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar dataVisita;
    @XmlElement(name = "CodiceVaccinazione")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String codiceVaccinazione;
    @XmlElement(name = "DescrizioneVaccinazione")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String descrizioneVaccinazione;
    @XmlElement(name = "CodiceMotivoEsclusione")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String codiceMotivoEsclusione;
    @XmlElement(name = "DescrizioneMotivoEsclusione")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String descrizioneMotivoEsclusione;
    @XmlElement(name = "CodiceOperatore")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String codiceOperatore;
    @XmlElement(name = "DescrizioneOperatore")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String descrizioneOperatore;
    @XmlElement(name = "DataScadenza", required = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar dataScadenza;
    @XmlElement(name = "CodicePazientePrecedente", required = true, type = Integer.class, nillable = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Integer codicePazientePrecedente;
    @XmlElement(name = "CodiceUslInserimento")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String codiceUslInserimento;
    @XmlElement(name = "Id")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected int id;
    @XmlElement(name = "FlagVisibilita")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String flagVisibilita;
    @XmlElement(name = "NoteAcquisizioneDatiVaccinaliCentrale")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String noteAcquisizioneDatiVaccinaliCentrale;
    @XmlElement(name = "DataResistrazione", required = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar dataResistrazione;
    @XmlElement(name = "IdUtenteRegistrazione")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected long idUtenteRegistrazione;
    @XmlElement(name = "DataModifica", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar dataModifica;
    @XmlElement(name = "IdUtenteModifica", required = true, type = Long.class, nillable = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Long idUtenteModifica;
    @XmlElement(name = "DataEliminAzione", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar dataEliminAzione;
    @XmlElement(name = "IdUtenteEliminazione", required = true, type = Long.class, nillable = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Long idUtenteEliminazione;
    @XmlElement(name = "NumeroDose", required = true, type = Integer.class, nillable = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Integer numeroDose;
    @XmlElement(name = "Note")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String note;

    /**
     * Recupera il valore della proprietà codicePaziente.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public int getCodicePaziente() {
        return codicePaziente;
    }

    /**
     * Imposta il valore della proprietà codicePaziente.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCodicePaziente(int value) {
        this.codicePaziente = value;
    }

    /**
     * Recupera il valore della proprietà dataVisita.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getDataVisita() {
        return dataVisita;
    }

    /**
     * Imposta il valore della proprietà dataVisita.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDataVisita(XMLGregorianCalendar value) {
        this.dataVisita = value;
    }

    /**
     * Recupera il valore della proprietà codiceVaccinazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCodiceVaccinazione() {
        return codiceVaccinazione;
    }

    /**
     * Imposta il valore della proprietà codiceVaccinazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCodiceVaccinazione(String value) {
        this.codiceVaccinazione = value;
    }

    /**
     * Recupera il valore della proprietà descrizioneVaccinazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getDescrizioneVaccinazione() {
        return descrizioneVaccinazione;
    }

    /**
     * Imposta il valore della proprietà descrizioneVaccinazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDescrizioneVaccinazione(String value) {
        this.descrizioneVaccinazione = value;
    }

    /**
     * Recupera il valore della proprietà codiceMotivoEsclusione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCodiceMotivoEsclusione() {
        return codiceMotivoEsclusione;
    }

    /**
     * Imposta il valore della proprietà codiceMotivoEsclusione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCodiceMotivoEsclusione(String value) {
        this.codiceMotivoEsclusione = value;
    }

    /**
     * Recupera il valore della proprietà descrizioneMotivoEsclusione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getDescrizioneMotivoEsclusione() {
        return descrizioneMotivoEsclusione;
    }

    /**
     * Imposta il valore della proprietà descrizioneMotivoEsclusione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDescrizioneMotivoEsclusione(String value) {
        this.descrizioneMotivoEsclusione = value;
    }

    /**
     * Recupera il valore della proprietà codiceOperatore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCodiceOperatore() {
        return codiceOperatore;
    }

    /**
     * Imposta il valore della proprietà codiceOperatore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCodiceOperatore(String value) {
        this.codiceOperatore = value;
    }

    /**
     * Recupera il valore della proprietà descrizioneOperatore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getDescrizioneOperatore() {
        return descrizioneOperatore;
    }

    /**
     * Imposta il valore della proprietà descrizioneOperatore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDescrizioneOperatore(String value) {
        this.descrizioneOperatore = value;
    }

    /**
     * Recupera il valore della proprietà dataScadenza.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDataScadenza(XMLGregorianCalendar value) {
        this.dataScadenza = value;
    }

    /**
     * Recupera il valore della proprietà codicePazientePrecedente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Integer getCodicePazientePrecedente() {
        return codicePazientePrecedente;
    }

    /**
     * Imposta il valore della proprietà codicePazientePrecedente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCodicePazientePrecedente(Integer value) {
        this.codicePazientePrecedente = value;
    }

    /**
     * Recupera il valore della proprietà codiceUslInserimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCodiceUslInserimento() {
        return codiceUslInserimento;
    }

    /**
     * Imposta il valore della proprietà codiceUslInserimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCodiceUslInserimento(String value) {
        this.codiceUslInserimento = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public int getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà flagVisibilità.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getFlagVisibilita() {
        return flagVisibilita;
    }

    /**
     * Imposta il valore della proprietà flagVisibilità.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setFlagVisibilita(String value) {
        this.flagVisibilita = value;
    }

    /**
     * Recupera il valore della proprietà noteAcquisizioneDatiVaccinaliCentrale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getNoteAcquisizioneDatiVaccinaliCentrale() {
        return noteAcquisizioneDatiVaccinaliCentrale;
    }

    /**
     * Imposta il valore della proprietà noteAcquisizioneDatiVaccinaliCentrale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNoteAcquisizioneDatiVaccinaliCentrale(String value) {
        this.noteAcquisizioneDatiVaccinaliCentrale = value;
    }

    /**
     * Recupera il valore della proprietà dataResistrazione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getDataResistrazione() {
        return dataResistrazione;
    }

    /**
     * Imposta il valore della proprietà dataResistrazione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDataResistrazione(XMLGregorianCalendar value) {
        this.dataResistrazione = value;
    }

    /**
     * Recupera il valore della proprietà idUtenteRegistrazione.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public long getIdUtenteRegistrazione() {
        return idUtenteRegistrazione;
    }

    /**
     * Imposta il valore della proprietà idUtenteRegistrazione.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIdUtenteRegistrazione(long value) {
        this.idUtenteRegistrazione = value;
    }

    /**
     * Recupera il valore della proprietà dataModifica.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getDataModifica() {
        return dataModifica;
    }

    /**
     * Imposta il valore della proprietà dataModifica.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDataModifica(XMLGregorianCalendar value) {
        this.dataModifica = value;
    }

    /**
     * Recupera il valore della proprietà idUtenteModifica.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Long getIdUtenteModifica() {
        return idUtenteModifica;
    }

    /**
     * Imposta il valore della proprietà idUtenteModifica.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIdUtenteModifica(Long value) {
        this.idUtenteModifica = value;
    }

    /**
     * Recupera il valore della proprietà dataEliminAzione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getDataEliminAzione() {
        return dataEliminAzione;
    }

    /**
     * Imposta il valore della proprietà dataEliminAzione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDataEliminAzione(XMLGregorianCalendar value) {
        this.dataEliminAzione = value;
    }

    /**
     * Recupera il valore della proprietà idUtenteEliminazione.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Long getIdUtenteEliminazione() {
        return idUtenteEliminazione;
    }

    /**
     * Imposta il valore della proprietà idUtenteEliminazione.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIdUtenteEliminazione(Long value) {
        this.idUtenteEliminazione = value;
    }

    /**
     * Recupera il valore della proprietà numeroDose.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Integer getNumeroDose() {
        return numeroDose;
    }

    /**
     * Imposta il valore della proprietà numeroDose.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNumeroDose(Integer value) {
        this.numeroDose = value;
    }

    /**
     * Recupera il valore della proprietà note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:53+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNote(String value) {
        this.note = value;
    }

}
