/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestutility;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per SperimentazioneType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SperimentazioneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idSperimentazione" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codDipartimento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipoScreen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoSperim" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codSperim" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codStudio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codGruppo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codSottogruppo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descrizione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codStatoDestinazione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataFineStudio" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="dataInizioStudio" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="flagAttivo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SperimentazioneType", propOrder = {
    "idSperimentazione",
    "codDipartimento",
    "tipoScreen",
    "tipoSperim",
    "codSperim",
    "codStudio",
    "codGruppo",
    "codSottogruppo",
    "descrizione",
    "codStatoDestinazione",
    "dataFineStudio",
    "dataInizioStudio",
    "flagAttivo"
})
public class SperimentazioneType {

    protected int idSperimentazione;
    protected int codDipartimento;
    @XmlElement(required = true)
    protected String tipoScreen;
    @XmlElement(required = true)
    protected String tipoSperim;
    @XmlElement(required = true)
    protected String codSperim;
    @XmlElement(required = true)
    protected String codStudio;
    @XmlElement(required = true)
    protected String codGruppo;
    @XmlElement(required = true)
    protected String codSottogruppo;
    @XmlElement(required = true)
    protected String descrizione;
    @XmlElement(required = true)
    protected String codStatoDestinazione;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataFineStudio;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataInizioStudio;
    protected Integer flagAttivo;

    /**
     * Recupera il valore della proprietà idSperimentazione.
     * 
     */
    public int getIdSperimentazione() {
        return idSperimentazione;
    }

    /**
     * Imposta il valore della proprietà idSperimentazione.
     * 
     */
    public void setIdSperimentazione(int value) {
        this.idSperimentazione = value;
    }

    /**
     * Recupera il valore della proprietà codDipartimento.
     * 
     */
    public int getCodDipartimento() {
        return codDipartimento;
    }

    /**
     * Imposta il valore della proprietà codDipartimento.
     * 
     */
    public void setCodDipartimento(int value) {
        this.codDipartimento = value;
    }

    /**
     * Recupera il valore della proprietà tipoScreen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoScreen() {
        return tipoScreen;
    }

    /**
     * Imposta il valore della proprietà tipoScreen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoScreen(String value) {
        this.tipoScreen = value;
    }

    /**
     * Recupera il valore della proprietà tipoSperim.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoSperim() {
        return tipoSperim;
    }

    /**
     * Imposta il valore della proprietà tipoSperim.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoSperim(String value) {
        this.tipoSperim = value;
    }

    /**
     * Recupera il valore della proprietà codSperim.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodSperim() {
        return codSperim;
    }

    /**
     * Imposta il valore della proprietà codSperim.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodSperim(String value) {
        this.codSperim = value;
    }

    /**
     * Recupera il valore della proprietà codStudio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodStudio() {
        return codStudio;
    }

    /**
     * Imposta il valore della proprietà codStudio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodStudio(String value) {
        this.codStudio = value;
    }

    /**
     * Recupera il valore della proprietà codGruppo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodGruppo() {
        return codGruppo;
    }

    /**
     * Imposta il valore della proprietà codGruppo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodGruppo(String value) {
        this.codGruppo = value;
    }

    /**
     * Recupera il valore della proprietà codSottogruppo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodSottogruppo() {
        return codSottogruppo;
    }

    /**
     * Imposta il valore della proprietà codSottogruppo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodSottogruppo(String value) {
        this.codSottogruppo = value;
    }

    /**
     * Recupera il valore della proprietà descrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

    /**
     * Recupera il valore della proprietà codStatoDestinazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodStatoDestinazione() {
        return codStatoDestinazione;
    }

    /**
     * Imposta il valore della proprietà codStatoDestinazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodStatoDestinazione(String value) {
        this.codStatoDestinazione = value;
    }

    /**
     * Recupera il valore della proprietà dataFineStudio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFineStudio() {
        return dataFineStudio;
    }

    /**
     * Imposta il valore della proprietà dataFineStudio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFineStudio(XMLGregorianCalendar value) {
        this.dataFineStudio = value;
    }

    /**
     * Recupera il valore della proprietà dataInizioStudio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInizioStudio() {
        return dataInizioStudio;
    }

    /**
     * Imposta il valore della proprietà dataInizioStudio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInizioStudio(XMLGregorianCalendar value) {
        this.dataInizioStudio = value;
    }

    /**
     * Recupera il valore della proprietà flagAttivo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlagAttivo() {
        return flagAttivo;
    }

    /**
     * Imposta il valore della proprietà flagAttivo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlagAttivo(Integer value) {
        this.flagAttivo = value;
    }

}
