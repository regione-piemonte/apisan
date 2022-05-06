/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.vaccinazione;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OraEsecuzione" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CentroVaccinale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndirizzoCentro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComuneCentro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelefonoCentro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ambulatorio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lotto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomeCommerciale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MedicoResponsabile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vaccinatore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SitoInoculazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ViaSomministrazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsFittizia" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PazienteCodice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PazienteNome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PazienteCognome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PazienteDataNascita" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Associazioni" type="{}ArrayOfAssociazione" minOccurs="0"/>
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
    "data",
    "oraEsecuzione",
    "centroVaccinale",
    "indirizzoCentro",
    "comuneCentro",
    "telefonoCentro",
    "ambulatorio",
    "lotto",
    "nomeCommerciale",
    "medicoResponsabile",
    "vaccinatore",
    "sitoInoculazione",
    "viaSomministrazione",
    "isFittizia",
    "pazienteCodice",
    "pazienteNome",
    "pazienteCognome",
    "pazienteDataNascita",
    "associazioni"
})
@XmlSeeAlso({
    DTOPagato.class
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class DTO {

    @XmlElement(name = "Id")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String id;
    @XmlElement(name = "Data", required = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar data;
    @XmlElement(name = "OraEsecuzione", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar oraEsecuzione;
    @XmlElement(name = "CentroVaccinale")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String centroVaccinale;
    @XmlElement(name = "IndirizzoCentro")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String indirizzoCentro;
    @XmlElement(name = "ComuneCentro")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String comuneCentro;
    @XmlElement(name = "TelefonoCentro")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String telefonoCentro;
    @XmlElement(name = "Ambulatorio")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String ambulatorio;
    @XmlElement(name = "Lotto")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String lotto;
    @XmlElement(name = "NomeCommerciale")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String nomeCommerciale;
    @XmlElement(name = "MedicoResponsabile")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String medicoResponsabile;
    @XmlElement(name = "Vaccinatore")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String vaccinatore;
    @XmlElement(name = "SitoInoculazione")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String sitoInoculazione;
    @XmlElement(name = "ViaSomministrazione")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String viaSomministrazione;
    @XmlElement(name = "IsFittizia")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected boolean isFittizia;
    @XmlElement(name = "PazienteCodice")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String pazienteCodice;
    @XmlElement(name = "PazienteNome")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String pazienteNome;
    @XmlElement(name = "PazienteCognome")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String pazienteCognome;
    @XmlElement(name = "PazienteDataNascita", required = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar pazienteDataNascita;
    @XmlElement(name = "Associazioni")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ArrayOfAssociazione associazioni;

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà data.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Imposta il valore della proprietà data.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * Recupera il valore della proprietà oraEsecuzione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getOraEsecuzione() {
        return oraEsecuzione;
    }

    /**
     * Imposta il valore della proprietà oraEsecuzione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setOraEsecuzione(XMLGregorianCalendar value) {
        this.oraEsecuzione = value;
    }

    /**
     * Recupera il valore della proprietà centroVaccinale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCentroVaccinale(String value) {
        this.centroVaccinale = value;
    }

    /**
     * Recupera il valore della proprietà indirizzoCentro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getIndirizzoCentro() {
        return indirizzoCentro;
    }

    /**
     * Imposta il valore della proprietà indirizzoCentro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIndirizzoCentro(String value) {
        this.indirizzoCentro = value;
    }

    /**
     * Recupera il valore della proprietà comuneCentro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getComuneCentro() {
        return comuneCentro;
    }

    /**
     * Imposta il valore della proprietà comuneCentro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setComuneCentro(String value) {
        this.comuneCentro = value;
    }

    /**
     * Recupera il valore della proprietà telefonoCentro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getTelefonoCentro() {
        return telefonoCentro;
    }

    /**
     * Imposta il valore della proprietà telefonoCentro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTelefonoCentro(String value) {
        this.telefonoCentro = value;
    }

    /**
     * Recupera il valore della proprietà ambulatorio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getAmbulatorio() {
        return ambulatorio;
    }

    /**
     * Imposta il valore della proprietà ambulatorio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAmbulatorio(String value) {
        this.ambulatorio = value;
    }

    /**
     * Recupera il valore della proprietà lotto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getLotto() {
        return lotto;
    }

    /**
     * Imposta il valore della proprietà lotto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLotto(String value) {
        this.lotto = value;
    }

    /**
     * Recupera il valore della proprietà nomeCommerciale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getNomeCommerciale() {
        return nomeCommerciale;
    }

    /**
     * Imposta il valore della proprietà nomeCommerciale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNomeCommerciale(String value) {
        this.nomeCommerciale = value;
    }

    /**
     * Recupera il valore della proprietà medicoResponsabile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getMedicoResponsabile() {
        return medicoResponsabile;
    }

    /**
     * Imposta il valore della proprietà medicoResponsabile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMedicoResponsabile(String value) {
        this.medicoResponsabile = value;
    }

    /**
     * Recupera il valore della proprietà vaccinatore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getVaccinatore() {
        return vaccinatore;
    }

    /**
     * Imposta il valore della proprietà vaccinatore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setVaccinatore(String value) {
        this.vaccinatore = value;
    }

    /**
     * Recupera il valore della proprietà sitoInoculazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getSitoInoculazione() {
        return sitoInoculazione;
    }

    /**
     * Imposta il valore della proprietà sitoInoculazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSitoInoculazione(String value) {
        this.sitoInoculazione = value;
    }

    /**
     * Recupera il valore della proprietà viaSomministrazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getViaSomministrazione() {
        return viaSomministrazione;
    }

    /**
     * Imposta il valore della proprietà viaSomministrazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setViaSomministrazione(String value) {
        this.viaSomministrazione = value;
    }

    /**
     * Recupera il valore della proprietà isFittizia.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public boolean isIsFittizia() {
        return isFittizia;
    }

    /**
     * Imposta il valore della proprietà isFittizia.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIsFittizia(boolean value) {
        this.isFittizia = value;
    }

    /**
     * Recupera il valore della proprietà pazienteCodice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getPazienteCodice() {
        return pazienteCodice;
    }

    /**
     * Imposta il valore della proprietà pazienteCodice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPazienteCodice(String value) {
        this.pazienteCodice = value;
    }

    /**
     * Recupera il valore della proprietà pazienteNome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getPazienteNome() {
        return pazienteNome;
    }

    /**
     * Imposta il valore della proprietà pazienteNome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPazienteNome(String value) {
        this.pazienteNome = value;
    }

    /**
     * Recupera il valore della proprietà pazienteCognome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getPazienteCognome() {
        return pazienteCognome;
    }

    /**
     * Imposta il valore della proprietà pazienteCognome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPazienteCognome(String value) {
        this.pazienteCognome = value;
    }

    /**
     * Recupera il valore della proprietà pazienteDataNascita.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getPazienteDataNascita() {
        return pazienteDataNascita;
    }

    /**
     * Imposta il valore della proprietà pazienteDataNascita.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPazienteDataNascita(XMLGregorianCalendar value) {
        this.pazienteDataNascita = value;
    }

    /**
     * Recupera il valore della proprietà associazioni.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssociazione }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public ArrayOfAssociazione getAssociazioni() {
        return associazioni;
    }

    /**
     * Imposta il valore della proprietà associazioni.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssociazione }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAssociazioni(ArrayOfAssociazione value) {
        this.associazioni = value;
    }

}
