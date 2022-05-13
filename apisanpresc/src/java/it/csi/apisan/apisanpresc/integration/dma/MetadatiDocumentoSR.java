/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.integration.dma;

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
     * Recupera il valore della property dataRefertazione.
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
     * Imposta il valore della property dataRefertazione.
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
     * Recupera il valore della property medicoRefertante.
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
     * Imposta il valore della property medicoRefertante.
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
     * Recupera il valore della property numeroVolteScaricato.
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
     * Imposta il valore della property numeroVolteScaricato.
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
     * Recupera il valore della property tipoReferto.
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
     * Imposta il valore della property tipoReferto.
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
     * Recupera il valore della property ticketDaPagare.
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
     * Imposta il valore della property ticketDaPagare.
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
     * Recupera il valore della property dataDisponibilitaReferto.
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
     * Imposta il valore della property dataDisponibilitaReferto.
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
     * Recupera il valore della property dataInserimentoROL.
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
     * Imposta il valore della property dataInserimentoROL.
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
     * Recupera il valore della property dataScadenza.
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
     * Imposta il valore della property dataScadenza.
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
     * Recupera il valore della property tipoAssociazione.
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
     * Imposta il valore della property tipoAssociazione.
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
     * Recupera il valore della property idDocumentoParent.
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
     * Imposta il valore della property idDocumentoParent.
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
     * Recupera il valore della property statoReferto.
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
     * Imposta il valore della property statoReferto.
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
     * Recupera il valore della property dataSostituzione.
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
     * Imposta il valore della property dataSostituzione.
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
     * Recupera il valore della property accessionNumber.
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
     * Imposta il valore della property accessionNumber.
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
     * Recupera il valore della property codiceDocumentoDipartimentale.
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
     * Imposta il valore della property codiceDocumentoDipartimentale.
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
     * Recupera il valore della property codiceDocumentoScaricabile.
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
     * Imposta il valore della property codiceDocumentoScaricabile.
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
     * Recupera il valore della property componenteLocale.
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
     * Imposta il valore della property componenteLocale.
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
     * Recupera il valore della property dataEpisodio.
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
     * Imposta il valore della property dataEpisodio.
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
     * Recupera il valore della property dataValidazione.
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
     * Imposta il valore della property dataValidazione.
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
     * Recupera il valore della property firmatoDigitalmente.
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
     * Imposta il valore della property firmatoDigitalmente.
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
     * Recupera il valore della property flagFirmatoDigitalmente.
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
     * Imposta il valore della property flagFirmatoDigitalmente.
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
     * Recupera il valore della property idDocumentoCL.
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
     * Imposta il valore della property idDocumentoCL.
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
     * Recupera il valore della property luogoProduzioneDocumento.
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
     * Imposta il valore della property luogoProduzioneDocumento.
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
     * Recupera il valore della property medicoValidante.
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
     * Imposta il valore della property medicoValidante.
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
     * Recupera il valore della property numDiDownload.
     * 
     */
    public int getNumDiDownload() {
        return numDiDownload;
    }

    /**
     * Imposta il valore della property numDiDownload.
     * 
     */
    public void setNumDiDownload(int value) {
        this.numDiDownload = value;
    }

    /**
     * Recupera il valore della property numeroGiorniDownload.
     * 
     */
    public int getNumeroGiorniDownload() {
        return numeroGiorniDownload;
    }

    /**
     * Imposta il valore della property numeroGiorniDownload.
     * 
     */
    public void setNumeroGiorniDownload(int value) {
        this.numeroGiorniDownload = value;
    }

    /**
     * Recupera il valore della property pagatoTicket.
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
     * Imposta il valore della property pagatoTicket.
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
     * Recupera il valore della property paziente.
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
     * Imposta il valore della property paziente.
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
     * Recupera il valore della property pinBruciato.
     * 
     */
    public boolean isPinBruciato() {
        return pinBruciato;
    }

    /**
     * Imposta il valore della property pinBruciato.
     * 
     */
    public void setPinBruciato(boolean value) {
        this.pinBruciato = value;
    }

    /**
     * Recupera il valore della property richiestoPinCode.
     * 
     */
    public boolean isRichiestoPinCode() {
        return richiestoPinCode;
    }

    /**
     * Imposta il valore della property richiestoPinCode.
     * 
     */
    public void setRichiestoPinCode(boolean value) {
        this.richiestoPinCode = value;
    }

    /**
     * Recupera il valore della property scaricabileSeTicketNonPagato.
     * 
     */
    public boolean isScaricabileSeTicketNonPagato() {
        return scaricabileSeTicketNonPagato;
    }

    /**
     * Imposta il valore della property scaricabileSeTicketNonPagato.
     * 
     */
    public void setScaricabileSeTicketNonPagato(boolean value) {
        this.scaricabileSeTicketNonPagato = value;
    }

    /**
     * Recupera il valore della property soggettoALeggiSpeciali.
     * 
     */
    public boolean isSoggettoALeggiSpeciali() {
        return soggettoALeggiSpeciali;
    }

    /**
     * Imposta il valore della property soggettoALeggiSpeciali.
     * 
     */
    public void setSoggettoALeggiSpeciali(boolean value) {
        this.soggettoALeggiSpeciali = value;
    }

    /**
     * Recupera il valore della property tipoDocumento.
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
     * Imposta il valore della property tipoDocumento.
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
     * Recupera il valore della property tipoFileDocumento.
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
     * Imposta il valore della property tipoFileDocumento.
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
     * Recupera il valore della property oscuraScaricoCittadino.
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
     * Imposta il valore della property oscuraScaricoCittadino.
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
     * Recupera il valore della property scaricabileFinoAl.
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
     * Imposta il valore della property scaricabileFinoAl.
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
     * Recupera il valore della property dataInserimento.
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
     * Imposta il valore della property dataInserimento.
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
     * Recupera il valore della property dataAggiornamento.
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
     * Imposta il valore della property dataAggiornamento.
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
     * Recupera il valore della property dataAnnullamento.
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
     * Imposta il valore della property dataAnnullamento.
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
     * Recupera il valore della property dataCancellazione.
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
     * Imposta il valore della property dataCancellazione.
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
