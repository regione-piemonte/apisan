/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.vaccinazionieseguite;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per DTOSegnalazioneReazioniAvverse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DTOSegnalazioneReazioniAvverse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceFiscaleSegnalatore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CognomeSegnalatore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomeSegnalatore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelefonoSegnalatore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailSegnalatore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CFAssistito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FarmacoConcomitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoteSegnalazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataReazione" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Tipologia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoteRisposta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdUtenteVariazione" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodVaccinazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdRichiesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTOSegnalazioneReazioniAvverse", propOrder = {
    "codiceFiscaleSegnalatore",
    "cognomeSegnalatore",
    "nomeSegnalatore",
    "telefonoSegnalatore",
    "emailSegnalatore",
    "cfAssistito",
    "farmacoConcomitante",
    "noteSegnalazione",
    "dataReazione",
    "tipologia",
    "noteRisposta",
    "idUtenteVariazione",
    "codVaccinazione",
    "idRichiesta",
    "descrizione"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class DTOSegnalazioneReazioniAvverse {

    @XmlElement(name = "CodiceFiscaleSegnalatore")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String codiceFiscaleSegnalatore;
    @XmlElement(name = "CognomeSegnalatore")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String cognomeSegnalatore;
    @XmlElement(name = "NomeSegnalatore")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String nomeSegnalatore;
    @XmlElement(name = "TelefonoSegnalatore")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String telefonoSegnalatore;
    @XmlElement(name = "EmailSegnalatore")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String emailSegnalatore;
    @XmlElement(name = "CFAssistito")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String cfAssistito;
    @XmlElement(name = "FarmacoConcomitante")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String farmacoConcomitante;
    @XmlElement(name = "NoteSegnalazione")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String noteSegnalazione;
    @XmlElement(name = "DataReazione", required = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar dataReazione;
    @XmlElement(name = "Tipologia")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String tipologia;
    @XmlElement(name = "NoteRisposta")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String noteRisposta;
    @XmlElement(name = "IdUtenteVariazione")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected int idUtenteVariazione;
    @XmlElement(name = "CodVaccinazione")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String codVaccinazione;
    @XmlElement(name = "IdRichiesta")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String idRichiesta;
    @XmlElement(name = "Descrizione")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String descrizione;

    /**
     * Recupera il valore della proprietà codiceFiscaleSegnalatore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCodiceFiscaleSegnalatore() {
        return codiceFiscaleSegnalatore;
    }

    /**
     * Imposta il valore della proprietà codiceFiscaleSegnalatore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCodiceFiscaleSegnalatore(String value) {
        this.codiceFiscaleSegnalatore = value;
    }

    /**
     * Recupera il valore della proprietà cognomeSegnalatore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCognomeSegnalatore() {
        return cognomeSegnalatore;
    }

    /**
     * Imposta il valore della proprietà cognomeSegnalatore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCognomeSegnalatore(String value) {
        this.cognomeSegnalatore = value;
    }

    /**
     * Recupera il valore della proprietà nomeSegnalatore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getNomeSegnalatore() {
        return nomeSegnalatore;
    }

    /**
     * Imposta il valore della proprietà nomeSegnalatore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNomeSegnalatore(String value) {
        this.nomeSegnalatore = value;
    }

    /**
     * Recupera il valore della proprietà telefonoSegnalatore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getTelefonoSegnalatore() {
        return telefonoSegnalatore;
    }

    /**
     * Imposta il valore della proprietà telefonoSegnalatore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTelefonoSegnalatore(String value) {
        this.telefonoSegnalatore = value;
    }

    /**
     * Recupera il valore della proprietà emailSegnalatore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getEmailSegnalatore() {
        return emailSegnalatore;
    }

    /**
     * Imposta il valore della proprietà emailSegnalatore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setEmailSegnalatore(String value) {
        this.emailSegnalatore = value;
    }

    /**
     * Recupera il valore della proprietà cfAssistito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCFAssistito() {
        return cfAssistito;
    }

    /**
     * Imposta il valore della proprietà cfAssistito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCFAssistito(String value) {
        this.cfAssistito = value;
    }

    /**
     * Recupera il valore della proprietà farmacoConcomitante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getFarmacoConcomitante() {
        return farmacoConcomitante;
    }

    /**
     * Imposta il valore della proprietà farmacoConcomitante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setFarmacoConcomitante(String value) {
        this.farmacoConcomitante = value;
    }

    /**
     * Recupera il valore della proprietà noteSegnalazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getNoteSegnalazione() {
        return noteSegnalazione;
    }

    /**
     * Imposta il valore della proprietà noteSegnalazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNoteSegnalazione(String value) {
        this.noteSegnalazione = value;
    }

    /**
     * Recupera il valore della proprietà dataReazione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getDataReazione() {
        return dataReazione;
    }

    /**
     * Imposta il valore della proprietà dataReazione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDataReazione(XMLGregorianCalendar value) {
        this.dataReazione = value;
    }

    /**
     * Recupera il valore della proprietà tipologia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTipologia(String value) {
        this.tipologia = value;
    }

    /**
     * Recupera il valore della proprietà noteRisposta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getNoteRisposta() {
        return noteRisposta;
    }

    /**
     * Imposta il valore della proprietà noteRisposta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNoteRisposta(String value) {
        this.noteRisposta = value;
    }

    /**
     * Recupera il valore della proprietà idUtenteVariazione.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public int getIdUtenteVariazione() {
        return idUtenteVariazione;
    }

    /**
     * Imposta il valore della proprietà idUtenteVariazione.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIdUtenteVariazione(int value) {
        this.idUtenteVariazione = value;
    }

    /**
     * Recupera il valore della proprietà codVaccinazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCodVaccinazione() {
        return codVaccinazione;
    }

    /**
     * Imposta il valore della proprietà codVaccinazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCodVaccinazione(String value) {
        this.codVaccinazione = value;
    }

    /**
     * Recupera il valore della proprietà idRichiesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getIdRichiesta() {
        return idRichiesta;
    }

    /**
     * Imposta il valore della proprietà idRichiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIdRichiesta(String value) {
        this.idRichiesta = value;
    }

    /**
     * Recupera il valore della proprietà descrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:18:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

}
