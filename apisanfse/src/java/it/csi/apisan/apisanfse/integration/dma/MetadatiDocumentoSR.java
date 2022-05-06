/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.dma;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per metadatiDocumentoSR complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="metadatiDocumentoSR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataRefertazione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="medicoRefertante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroVolteScaricato" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipoReferto" type="{http://dma.csi.it/}codifica" minOccurs="0"/>
 *         &lt;element name="ticketDaPagare" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="dataDisponibilitaReferto" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataInserimentoROL" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataScadenza" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tipoAssociazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idDocumentoParent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statoReferto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataSostituzione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="elencoPrestazioni" type="{http://dma.csi.it/}prestazione" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="elencoNre" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accessionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceDocumentoDipartimentale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceDocumentoScaricabile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="componenteLocale" type="{http://dma.csi.it/}componenteLocale" minOccurs="0"/>
 *         &lt;element name="dataEpisodio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataValidazione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="firmatoDigitalmente" type="{http://dma.csi.it/}siNo" minOccurs="0"/>
 *         &lt;element name="flagFirmatoDigitalmente" type="{http://dma.csi.it/}siNo" minOccurs="0"/>
 *         &lt;element name="idDocumentoCL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="luogoProduzioneDocumento" type="{http://dma.csi.it/}luogoASU" minOccurs="0"/>
 *         &lt;element name="medicoValidante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numDiDownload" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numeroGiorniDownload" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pagatoTicket" type="{http://dma.csi.it/}pagatoTicketStato"/>
 *         &lt;element ref="{http://dma.csi.it/}paziente" minOccurs="0"/>
 *         &lt;element name="pinBruciato" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="richiestoPinCode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="scaricabileSeTicketNonPagato" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="soggettoALeggiSpeciali" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tipoDocumento" type="{http://dma.csi.it/}tipoDocumento" minOccurs="0"/>
 *         &lt;element name="tipoFileDocumento" type="{http://dma.csi.it/}tipoFileDocumento" minOccurs="0"/>
 *         &lt;element name="oscuraScaricoCittadino" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="scaricabileFinoAl" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataInserimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataAggiornamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataAnnullamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataCancellazione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}accessionNumbers" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metadatiDocumentoSR", propOrder = {
    "dataRefertazione",
    "medicoRefertante",
    "numeroVolteScaricato",
    "tipoReferto",
    "ticketPagato",
    "ticketDaPagare",
    "dataDisponibilitaReferto",
    "dataInserimentoROL",
    "dataScadenza",
    "tipoAssociazione",
    "idDocumentoParent",
    "statoReferto",
    "dataSostituzione",
    "elencoPrestazioni",
    "elencoNre",
    "accessionNumber",
    "codiceDocumentoDipartimentale",
    "codiceDocumentoScaricabile",
    "componenteLocale",
    "dataEpisodio",
    "dataValidazione",
    "firmatoDigitalmente",
    "flagFirmatoDigitalmente",
    "idDocumentoCL",
    "luogoProduzioneDocumento",
    "medicoValidante",
    "numDiDownload",
    "numeroGiorniDownload",
    "pagatoTicket",
    "paziente",
    "pinBruciato",
    "richiestoPinCode",
    "scaricabileSeTicketNonPagato",
    "soggettoALeggiSpeciali",
    "tipoDocumento",
    "tipoFileDocumento",
    "oscuraScaricoCittadino",
    "scaricabileFinoAl",
    "dataInserimento",
    "dataAggiornamento",
    "dataAnnullamento",
    "dataCancellazione",
    "accessionNumbers"
})
public class MetadatiDocumentoSR {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataRefertazione;
    protected String medicoRefertante;
    protected Integer numeroVolteScaricato;
    protected Codifica tipoReferto;
    protected Float ticketPagato;
    protected Float ticketDaPagare;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDisponibilitaReferto;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInserimentoROL;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataScadenza;
    protected String tipoAssociazione;
    protected String idDocumentoParent;
    protected String statoReferto;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataSostituzione;
    @XmlElement(nillable = true)
    protected List<Prestazione> elencoPrestazioni;
    @XmlElement(nillable = true)
    protected List<String> elencoNre;
    protected String accessionNumber;
    protected String codiceDocumentoDipartimentale;
    protected String codiceDocumentoScaricabile;
    protected ComponenteLocale componenteLocale;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataEpisodio;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataValidazione;
    @XmlSchemaType(name = "string")
    protected SiNo firmatoDigitalmente;
    @XmlSchemaType(name = "string")
    protected SiNo flagFirmatoDigitalmente;
    protected String idDocumentoCL;
    protected LuogoASU luogoProduzioneDocumento;
    protected String medicoValidante;
    protected int numDiDownload;
    protected int numeroGiorniDownload;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PagatoTicketStato pagatoTicket;
    protected Paziente paziente;
    protected boolean pinBruciato;
    protected boolean richiestoPinCode;
    protected boolean scaricabileSeTicketNonPagato;
    protected boolean soggettoALeggiSpeciali;
    protected TipoDocumento tipoDocumento;
    protected TipoFileDocumento tipoFileDocumento;
    protected String oscuraScaricoCittadino;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scaricabileFinoAl;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInserimento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAggiornamento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAnnullamento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCancellazione;
    @XmlElement(nillable = true)
    protected List<String> accessionNumbers;

    /**
     * Recupera il valore della proprietà dataRefertazione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRefertazione() {
        return dataRefertazione;
    }

    /**
     * Imposta il valore della proprietà dataRefertazione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRefertazione(XMLGregorianCalendar value) {
        this.dataRefertazione = value;
    }

    /**
     * Recupera il valore della proprietà medicoRefertante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicoRefertante() {
        return medicoRefertante;
    }

    /**
     * Imposta il valore della proprietà medicoRefertante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicoRefertante(String value) {
        this.medicoRefertante = value;
    }

    /**
     * Recupera il valore della proprietà numeroVolteScaricato.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroVolteScaricato() {
        return numeroVolteScaricato;
    }

    /**
     * Imposta il valore della proprietà numeroVolteScaricato.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroVolteScaricato(Integer value) {
        this.numeroVolteScaricato = value;
    }

    /**
     * Recupera il valore della proprietà tipoReferto.
     * 
     * @return
     *     possible object is
     *     {@link Codifica }
     *     
     */
    public Codifica getTipoReferto() {
        return tipoReferto;
    }

    /**
     * Imposta il valore della proprietà tipoReferto.
     * 
     * @param value
     *     allowed object is
     *     {@link Codifica }
     *     
     */
    public void setTipoReferto(Codifica value) {
        this.tipoReferto = value;
    }

    /**
     * Recupera il valore della proprietà ticketDaPagare.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTicketDaPagare() {
        return ticketDaPagare;
    }

    /**
     * Imposta il valore della proprietà ticketDaPagare.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */   
    public void setTicketDaPagare(Float value) {
        this.ticketDaPagare = value;
    }
    
    /**
     * Recupera il valore della proprietà ticketPagato.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTicketPagato() {
        return ticketPagato;
    }

    /**
     * Imposta il valore della proprietà ticketPagato.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTicketPagato(Float value) {
        this.ticketPagato = value;
    }
    
    /**
     * Recupera il valore della proprietà dataDisponibilitaReferto.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDisponibilitaReferto() {
        return dataDisponibilitaReferto;
    }

    /**
     * Imposta il valore della proprietà dataDisponibilitaReferto.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDisponibilitaReferto(XMLGregorianCalendar value) {
        this.dataDisponibilitaReferto = value;
    }

    /**
     * Recupera il valore della proprietà dataInserimentoROL.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInserimentoROL() {
        return dataInserimentoROL;
    }

    /**
     * Imposta il valore della proprietà dataInserimentoROL.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInserimentoROL(XMLGregorianCalendar value) {
        this.dataInserimentoROL = value;
    }

    /**
     * Recupera il valore della proprietà dataScadenza.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
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
    public void setDataScadenza(XMLGregorianCalendar value) {
        this.dataScadenza = value;
    }

    /**
     * Recupera il valore della proprietà tipoAssociazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAssociazione() {
        return tipoAssociazione;
    }

    /**
     * Imposta il valore della proprietà tipoAssociazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAssociazione(String value) {
        this.tipoAssociazione = value;
    }

    /**
     * Recupera il valore della proprietà idDocumentoParent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDocumentoParent() {
        return idDocumentoParent;
    }

    /**
     * Imposta il valore della proprietà idDocumentoParent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDocumentoParent(String value) {
        this.idDocumentoParent = value;
    }

    /**
     * Recupera il valore della proprietà statoReferto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatoReferto() {
        return statoReferto;
    }

    /**
     * Imposta il valore della proprietà statoReferto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatoReferto(String value) {
        this.statoReferto = value;
    }

    /**
     * Recupera il valore della proprietà dataSostituzione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataSostituzione() {
        return dataSostituzione;
    }

    /**
     * Imposta il valore della proprietà dataSostituzione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataSostituzione(XMLGregorianCalendar value) {
        this.dataSostituzione = value;
    }

    /**
     * Gets the value of the elencoPrestazioni property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elencoPrestazioni property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElencoPrestazioni().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Prestazione }
     * 
     * 
     */
    public List<Prestazione> getElencoPrestazioni() {
        if (elencoPrestazioni == null) {
            elencoPrestazioni = new ArrayList<Prestazione>();
        }
        return this.elencoPrestazioni;
    }

    /**
     * Gets the value of the elencoNre property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elencoNre property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElencoNre().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getElencoNre() {
        if (elencoNre == null) {
            elencoNre = new ArrayList<String>();
        }
        return this.elencoNre;
    }

    /**
     * Recupera il valore della proprietà accessionNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessionNumber() {
        return accessionNumber;
    }

    /**
     * Imposta il valore della proprietà accessionNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessionNumber(String value) {
        this.accessionNumber = value;
    }

    /**
     * Recupera il valore della proprietà codiceDocumentoDipartimentale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceDocumentoDipartimentale() {
        return codiceDocumentoDipartimentale;
    }

    /**
     * Imposta il valore della proprietà codiceDocumentoDipartimentale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceDocumentoDipartimentale(String value) {
        this.codiceDocumentoDipartimentale = value;
    }

    /**
     * Recupera il valore della proprietà codiceDocumentoScaricabile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceDocumentoScaricabile() {
        return codiceDocumentoScaricabile;
    }

    /**
     * Imposta il valore della proprietà codiceDocumentoScaricabile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceDocumentoScaricabile(String value) {
        this.codiceDocumentoScaricabile = value;
    }

    /**
     * Recupera il valore della proprietà componenteLocale.
     * 
     * @return
     *     possible object is
     *     {@link ComponenteLocale }
     *     
     */
    public ComponenteLocale getComponenteLocale() {
        return componenteLocale;
    }

    /**
     * Imposta il valore della proprietà componenteLocale.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponenteLocale }
     *     
     */
    public void setComponenteLocale(ComponenteLocale value) {
        this.componenteLocale = value;
    }

    /**
     * Recupera il valore della proprietà dataEpisodio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEpisodio() {
        return dataEpisodio;
    }

    /**
     * Imposta il valore della proprietà dataEpisodio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEpisodio(XMLGregorianCalendar value) {
        this.dataEpisodio = value;
    }

    /**
     * Recupera il valore della proprietà dataValidazione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataValidazione() {
        return dataValidazione;
    }

    /**
     * Imposta il valore della proprietà dataValidazione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataValidazione(XMLGregorianCalendar value) {
        this.dataValidazione = value;
    }

    /**
     * Recupera il valore della proprietà firmatoDigitalmente.
     * 
     * @return
     *     possible object is
     *     {@link SiNo }
     *     
     */
    public SiNo getFirmatoDigitalmente() {
        return firmatoDigitalmente;
    }

    /**
     * Imposta il valore della proprietà firmatoDigitalmente.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNo }
     *     
     */
    public void setFirmatoDigitalmente(SiNo value) {
        this.firmatoDigitalmente = value;
    }

    /**
     * Recupera il valore della proprietà flagFirmatoDigitalmente.
     * 
     * @return
     *     possible object is
     *     {@link SiNo }
     *     
     */
    public SiNo getFlagFirmatoDigitalmente() {
        return flagFirmatoDigitalmente;
    }

    /**
     * Imposta il valore della proprietà flagFirmatoDigitalmente.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNo }
     *     
     */
    public void setFlagFirmatoDigitalmente(SiNo value) {
        this.flagFirmatoDigitalmente = value;
    }

    /**
     * Recupera il valore della proprietà idDocumentoCL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDocumentoCL() {
        return idDocumentoCL;
    }

    /**
     * Imposta il valore della proprietà idDocumentoCL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDocumentoCL(String value) {
        this.idDocumentoCL = value;
    }

    /**
     * Recupera il valore della proprietà luogoProduzioneDocumento.
     * 
     * @return
     *     possible object is
     *     {@link LuogoASU }
     *     
     */
    public LuogoASU getLuogoProduzioneDocumento() {
        return luogoProduzioneDocumento;
    }

    /**
     * Imposta il valore della proprietà luogoProduzioneDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link LuogoASU }
     *     
     */
    public void setLuogoProduzioneDocumento(LuogoASU value) {
        this.luogoProduzioneDocumento = value;
    }

    /**
     * Recupera il valore della proprietà medicoValidante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicoValidante() {
        return medicoValidante;
    }

    /**
     * Imposta il valore della proprietà medicoValidante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicoValidante(String value) {
        this.medicoValidante = value;
    }

    /**
     * Recupera il valore della proprietà numDiDownload.
     * 
     */
    public int getNumDiDownload() {
        return numDiDownload;
    }

    /**
     * Imposta il valore della proprietà numDiDownload.
     * 
     */
    public void setNumDiDownload(int value) {
        this.numDiDownload = value;
    }

    /**
     * Recupera il valore della proprietà numeroGiorniDownload.
     * 
     */
    public int getNumeroGiorniDownload() {
        return numeroGiorniDownload;
    }

    /**
     * Imposta il valore della proprietà numeroGiorniDownload.
     * 
     */
    public void setNumeroGiorniDownload(int value) {
        this.numeroGiorniDownload = value;
    }

    /**
     * Recupera il valore della proprietà pagatoTicket.
     * 
     * @return
     *     possible object is
     *     {@link PagatoTicketStato }
     *     
     */
    public PagatoTicketStato getPagatoTicket() {
        return pagatoTicket;
    }

    /**
     * Imposta il valore della proprietà pagatoTicket.
     * 
     * @param value
     *     allowed object is
     *     {@link PagatoTicketStato }
     *     
     */
    public void setPagatoTicket(PagatoTicketStato value) {
        this.pagatoTicket = value;
    }

    /**
     * Recupera il valore della proprietà paziente.
     * 
     * @return
     *     possible object is
     *     {@link Paziente }
     *     
     */
    public Paziente getPaziente() {
        return paziente;
    }

    /**
     * Imposta il valore della proprietà paziente.
     * 
     * @param value
     *     allowed object is
     *     {@link Paziente }
     *     
     */
    public void setPaziente(Paziente value) {
        this.paziente = value;
    }

    /**
     * Recupera il valore della proprietà pinBruciato.
     * 
     */
    public boolean isPinBruciato() {
        return pinBruciato;
    }

    /**
     * Imposta il valore della proprietà pinBruciato.
     * 
     */
    public void setPinBruciato(boolean value) {
        this.pinBruciato = value;
    }

    /**
     * Recupera il valore della proprietà richiestoPinCode.
     * 
     */
    public boolean isRichiestoPinCode() {
        return richiestoPinCode;
    }

    /**
     * Imposta il valore della proprietà richiestoPinCode.
     * 
     */
    public void setRichiestoPinCode(boolean value) {
        this.richiestoPinCode = value;
    }

    /**
     * Recupera il valore della proprietà scaricabileSeTicketNonPagato.
     * 
     */
    public boolean isScaricabileSeTicketNonPagato() {
        return scaricabileSeTicketNonPagato;
    }

    /**
     * Imposta il valore della proprietà scaricabileSeTicketNonPagato.
     * 
     */
    public void setScaricabileSeTicketNonPagato(boolean value) {
        this.scaricabileSeTicketNonPagato = value;
    }

    /**
     * Recupera il valore della proprietà soggettoALeggiSpeciali.
     * 
     */
    public boolean isSoggettoALeggiSpeciali() {
        return soggettoALeggiSpeciali;
    }

    /**
     * Imposta il valore della proprietà soggettoALeggiSpeciali.
     * 
     */
    public void setSoggettoALeggiSpeciali(boolean value) {
        this.soggettoALeggiSpeciali = value;
    }

    /**
     * Recupera il valore della proprietà tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumento }
     *     
     */
    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Imposta il valore della proprietà tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumento }
     *     
     */
    public void setTipoDocumento(TipoDocumento value) {
        this.tipoDocumento = value;
    }

    /**
     * Recupera il valore della proprietà tipoFileDocumento.
     * 
     * @return
     *     possible object is
     *     {@link TipoFileDocumento }
     *     
     */
    public TipoFileDocumento getTipoFileDocumento() {
        return tipoFileDocumento;
    }

    /**
     * Imposta il valore della proprietà tipoFileDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoFileDocumento }
     *     
     */
    public void setTipoFileDocumento(TipoFileDocumento value) {
        this.tipoFileDocumento = value;
    }

    /**
     * Recupera il valore della proprietà oscuraScaricoCittadino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOscuraScaricoCittadino() {
        return oscuraScaricoCittadino;
    }

    /**
     * Imposta il valore della proprietà oscuraScaricoCittadino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOscuraScaricoCittadino(String value) {
        this.oscuraScaricoCittadino = value;
    }

    /**
     * Recupera il valore della proprietà scaricabileFinoAl.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScaricabileFinoAl() {
        return scaricabileFinoAl;
    }

    /**
     * Imposta il valore della proprietà scaricabileFinoAl.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScaricabileFinoAl(XMLGregorianCalendar value) {
        this.scaricabileFinoAl = value;
    }

    /**
     * Recupera il valore della proprietà dataInserimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
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
    public void setDataInserimento(XMLGregorianCalendar value) {
        this.dataInserimento = value;
    }

    /**
     * Recupera il valore della proprietà dataAggiornamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAggiornamento() {
        return dataAggiornamento;
    }

    /**
     * Imposta il valore della proprietà dataAggiornamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAggiornamento(XMLGregorianCalendar value) {
        this.dataAggiornamento = value;
    }

    /**
     * Recupera il valore della proprietà dataAnnullamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAnnullamento() {
        return dataAnnullamento;
    }

    /**
     * Imposta il valore della proprietà dataAnnullamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAnnullamento(XMLGregorianCalendar value) {
        this.dataAnnullamento = value;
    }

    /**
     * Recupera il valore della proprietà dataCancellazione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCancellazione() {
        return dataCancellazione;
    }

    /**
     * Imposta il valore della proprietà dataCancellazione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCancellazione(XMLGregorianCalendar value) {
        this.dataCancellazione = value;
    }

    /**
     * Gets the value of the accessionNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessionNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessionNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAccessionNumbers() {
        if (accessionNumbers == null) {
            accessionNumbers = new ArrayList<String>();
        }
        return this.accessionNumbers;
    }

    
}
