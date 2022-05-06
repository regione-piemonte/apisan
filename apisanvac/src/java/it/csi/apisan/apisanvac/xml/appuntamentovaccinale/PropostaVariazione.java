/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.appuntamentovaccinale;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PropostaVariazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PropostaVariazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdAppuntamento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cognome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodiceFiscaleDelVaccinato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Motivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropostaVariazione", propOrder = {
    "idAppuntamento",
    "cognome",
    "nome",
    "codiceFiscale",
    "tipo",
    "codiceFiscaleDelVaccinato",
    "telefono",
    "mail",
    "note",
    "motivo"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class PropostaVariazione {

    @XmlElement(name = "IdAppuntamento")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected int idAppuntamento;
    @XmlElement(name = "Cognome")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String cognome;
    @XmlElement(name = "Nome")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String nome;
    @XmlElement(name = "CodiceFiscale")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String codiceFiscale;
    @XmlElement(name = "Tipo")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected int tipo;
    @XmlElement(name = "CodiceFiscaleDelVaccinato")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String codiceFiscaleDelVaccinato;
    @XmlElement(name = "Telefono")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String telefono;
    @XmlElement(name = "Mail")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String mail;
    @XmlElement(name = "Note")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String note;
    @XmlElement(name = "Motivo")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String motivo;

    /**
     * Recupera il valore della proprietà idAppuntamento.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public int getIdAppuntamento() {
        return idAppuntamento;
    }

    /**
     * Imposta il valore della proprietà idAppuntamento.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIdAppuntamento(int value) {
        this.idAppuntamento = value;
    }

    /**
     * Recupera il valore della proprietà cognome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Recupera il valore della proprietà codiceFiscale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCodiceFiscale(String value) {
        this.codiceFiscale = value;
    }

    /**
     * Recupera il valore della proprietà tipo.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public int getTipo() {
        return tipo;
    }

    /**
     * Imposta il valore della proprietà tipo.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTipo(int value) {
        this.tipo = value;
    }

    /**
     * Recupera il valore della proprietà codiceFiscaleDelVaccinato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCodiceFiscaleDelVaccinato() {
        return codiceFiscaleDelVaccinato;
    }

    /**
     * Imposta il valore della proprietà codiceFiscaleDelVaccinato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCodiceFiscaleDelVaccinato(String value) {
        this.codiceFiscaleDelVaccinato = value;
    }

    /**
     * Recupera il valore della proprietà telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Recupera il valore della proprietà motivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getMotivo() {
        return motivo;
    }

    /**
     * Imposta il valore della proprietà motivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMotivo(String value) {
        this.motivo = value;
    }

}
