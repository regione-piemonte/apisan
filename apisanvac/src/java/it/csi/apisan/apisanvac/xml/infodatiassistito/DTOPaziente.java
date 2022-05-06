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
 * <p>Classe Java per DTOPaziente complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DTOPaziente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodicePaziente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cognome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sesso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Codice_Fiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tessera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataDiNascita" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ComuneDiNascita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CittadinanzaCodice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CittadinanzaDescrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComuneResidenza" type="{}Localita" minOccurs="0"/>
 *         &lt;element name="ComuneDomicilio" type="{}Localita" minOccurs="0"/>
 *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UslResidenzaCodice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UslResidenzaDescrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Stato" type="{}StatiVaccinaliEnum"/>
 *         &lt;element name="DataInserimento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CentroVaccinale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTOPaziente", propOrder = {
    "codicePaziente",
    "cognome",
    "nome",
    "sesso",
    "codiceFiscale",
    "tessera",
    "dataDiNascita",
    "comuneDiNascita",
    "cittadinanzaCodice",
    "cittadinanzaDescrizione",
    "comuneResidenza",
    "comuneDomicilio",
    "telefono",
    "uslResidenzaCodice",
    "uslResidenzaDescrizione",
    "stato",
    "dataInserimento",
    "centroVaccinale"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class DTOPaziente {

    @XmlElement(name = "CodicePaziente")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String codicePaziente;
    @XmlElement(name = "Cognome")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String cognome;
    @XmlElement(name = "Nome")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String nome;
    @XmlElement(name = "Sesso")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String sesso;
    @XmlElement(name = "Codice_Fiscale")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String codiceFiscale;
    @XmlElement(name = "Tessera")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String tessera;
    @XmlElement(name = "DataDiNascita", required = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar dataDiNascita;
    @XmlElement(name = "ComuneDiNascita")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String comuneDiNascita;
    @XmlElement(name = "CittadinanzaCodice")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String cittadinanzaCodice;
    @XmlElement(name = "CittadinanzaDescrizione")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String cittadinanzaDescrizione;
    @XmlElement(name = "ComuneResidenza")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Localita comuneResidenza;
    @XmlElement(name = "ComuneDomicilio")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Localita comuneDomicilio;
    @XmlElement(name = "Telefono")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String telefono;
    @XmlElement(name = "UslResidenzaCodice")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String uslResidenzaCodice;
    @XmlElement(name = "UslResidenzaDescrizione")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String uslResidenzaDescrizione;
    @XmlElement(name = "Stato", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected StatiVaccinaliEnum stato;
    @XmlElement(name = "DataInserimento", required = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar dataInserimento;
    @XmlElement(name = "CentroVaccinale")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String centroVaccinale;

    /**
     * Recupera il valore della proprietà codicePaziente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCodicePaziente() {
        return codicePaziente;
    }

    /**
     * Imposta il valore della proprietà codicePaziente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCodicePaziente(String value) {
        this.codicePaziente = value;
    }

    /**
     * Recupera il valore della proprietà cognome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCognome() {
        return cognome;
    }

    /**
     * Imposta il valore della proprietà cognome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCognome(String value) {
        this.cognome = value;
    }

    /**
     * Recupera il valore della proprietà nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il valore della proprietà nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Recupera il valore della proprietà sesso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getSesso() {
        return sesso;
    }

    /**
     * Imposta il valore della proprietà sesso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSesso(String value) {
        this.sesso = value;
    }

    /**
     * Recupera il valore della proprietà codiceFiscale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    /**
     * Imposta il valore della proprietà codiceFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCodiceFiscale(String value) {
        this.codiceFiscale = value;
    }

    /**
     * Recupera il valore della proprietà tessera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getTessera() {
        return tessera;
    }

    /**
     * Imposta il valore della proprietà tessera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTessera(String value) {
        this.tessera = value;
    }

    /**
     * Recupera il valore della proprietà dataDiNascita.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getDataDiNascita() {
        return dataDiNascita;
    }

    /**
     * Imposta il valore della proprietà dataDiNascita.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDataDiNascita(XMLGregorianCalendar value) {
        this.dataDiNascita = value;
    }

    /**
     * Recupera il valore della proprietà comuneDiNascita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getComuneDiNascita() {
        return comuneDiNascita;
    }

    /**
     * Imposta il valore della proprietà comuneDiNascita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setComuneDiNascita(String value) {
        this.comuneDiNascita = value;
    }

    /**
     * Recupera il valore della proprietà cittadinanzaCodice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCittadinanzaCodice() {
        return cittadinanzaCodice;
    }

    /**
     * Imposta il valore della proprietà cittadinanzaCodice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCittadinanzaCodice(String value) {
        this.cittadinanzaCodice = value;
    }

    /**
     * Recupera il valore della proprietà cittadinanzaDescrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCittadinanzaDescrizione() {
        return cittadinanzaDescrizione;
    }

    /**
     * Imposta il valore della proprietà cittadinanzaDescrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCittadinanzaDescrizione(String value) {
        this.cittadinanzaDescrizione = value;
    }

    /**
     * Recupera il valore della proprietà comuneResidenza.
     * 
     * @return
     *     possible object is
     *     {@link Localita }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Localita getComuneResidenza() {
        return comuneResidenza;
    }

    /**
     * Imposta il valore della proprietà comuneResidenza.
     * 
     * @param value
     *     allowed object is
     *     {@link Localita }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setComuneResidenza(Localita value) {
        this.comuneResidenza = value;
    }

    /**
     * Recupera il valore della proprietà comuneDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link Localita }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Localita getComuneDomicilio() {
        return comuneDomicilio;
    }

    /**
     * Imposta il valore della proprietà comuneDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link Localita }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setComuneDomicilio(Localita value) {
        this.comuneDomicilio = value;
    }

    /**
     * Recupera il valore della proprietà telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Recupera il valore della proprietà uslResidenzaCodice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getUslResidenzaCodice() {
        return uslResidenzaCodice;
    }

    /**
     * Imposta il valore della proprietà uslResidenzaCodice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setUslResidenzaCodice(String value) {
        this.uslResidenzaCodice = value;
    }

    /**
     * Recupera il valore della proprietà uslResidenzaDescrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getUslResidenzaDescrizione() {
        return uslResidenzaDescrizione;
    }

    /**
     * Imposta il valore della proprietà uslResidenzaDescrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setUslResidenzaDescrizione(String value) {
        this.uslResidenzaDescrizione = value;
    }

    /**
     * Recupera il valore della proprietà stato.
     * 
     * @return
     *     possible object is
     *     {@link StatiVaccinaliEnum }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public StatiVaccinaliEnum getStato() {
        return stato;
    }

    /**
     * Imposta il valore della proprietà stato.
     * 
     * @param value
     *     allowed object is
     *     {@link StatiVaccinaliEnum }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setStato(StatiVaccinaliEnum value) {
        this.stato = value;
    }

    /**
     * Recupera il valore della proprietà dataInserimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getDataInserimento() {
        return dataInserimento;
    }

    /**
     * Imposta il valore della proprietà dataInserimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDataInserimento(XMLGregorianCalendar value) {
        this.dataInserimento = value;
    }

    /**
     * Recupera il valore della proprietà centroVaccinale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCentroVaccinale() {
        return centroVaccinale;
    }

    /**
     * Imposta il valore della proprietà centroVaccinale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCentroVaccinale(String value) {
        this.centroVaccinale = value;
    }

}
