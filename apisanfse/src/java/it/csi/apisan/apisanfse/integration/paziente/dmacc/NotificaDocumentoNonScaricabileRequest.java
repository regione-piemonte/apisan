/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.paziente.dmacc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import it.csi.apisan.apisanfse.integration.paziente.dma.EventoNotificaTipoCodice;
import it.csi.apisan.apisanfse.integration.paziente.dma.Richiedente;
import it.csi.apisan.apisanfse.integration.paziente.dma.StrutturaSanitaria;


/**
 * <p>Classe Java per NotificaDocumentoNonScaricabileRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="NotificaDocumentoNonScaricabileRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dma.csi.it/}richiedente" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}idDocumento" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}codiceFiscalePaziente" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}tipoEventoNotifica" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}componenteLocale" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}oscuraDocumento" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}oscuraScaricoCittadino" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}dataEsame" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}tipoDocumento" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}strutturaSanitaria" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}flagScaricabile" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}pagatoTicket" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}ticketPagato" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}ticketDaPagare" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}nreList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}codiceDocumentoDipartimentale" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}consultazione" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificaDocumentoNonScaricabileRequest", propOrder = {
    "richiedente",
    "idDocumento",
    "codiceFiscalePaziente",
    "tipoEventoNotifica",
    "componenteLocale",
    "oscuraDocumento",
    "oscuraScaricoCittadino",
    "dataEsame",
    "tipoDocumento",
    "strutturaSanitaria",
    "flagScaricabile",
    "pagatoTicket",
    "ticketPagato",
    "ticketDaPagare",
    "nreList",
    "codiceDocumentoDipartimentale",
    "consultazione"
})
public class NotificaDocumentoNonScaricabileRequest {

    @XmlElement(namespace = "http://dma.csi.it/")
    protected Richiedente richiedente;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected Long idDocumento;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected String codiceFiscalePaziente;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected EventoNotificaTipoCodice tipoEventoNotifica;
    @XmlElement(namespace = "http://dma.csi.it/", nillable = true)
    protected Object componenteLocale;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected String oscuraDocumento;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected String oscuraScaricoCittadino;
    @XmlElement(namespace = "http://dma.csi.it/")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataEsame;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected String tipoDocumento;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected StrutturaSanitaria strutturaSanitaria;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected String flagScaricabile;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected String pagatoTicket;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected Float ticketPagato;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected Float ticketDaPagare;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected List<String> nreList;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected String codiceDocumentoDipartimentale;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected String consultazione;

    /**
     * Recupera il valore della proprietà richiedente.
     * 
     * @return
     *     possible object is
     *     {@link Richiedente }
     *     
     */
    public Richiedente getRichiedente() {
        return richiedente;
    }

    /**
     * Imposta il valore della proprietà richiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link Richiedente }
     *     
     */
    public void setRichiedente(Richiedente value) {
        this.richiedente = value;
    }

    /**
     * Recupera il valore della proprietà idDocumento.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdDocumento() {
        return idDocumento;
    }

    /**
     * Imposta il valore della proprietà idDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdDocumento(Long value) {
        this.idDocumento = value;
    }

    /**
     * Recupera il valore della proprietà codiceFiscalePaziente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscalePaziente() {
        return codiceFiscalePaziente;
    }

    /**
     * Imposta il valore della proprietà codiceFiscalePaziente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscalePaziente(String value) {
        this.codiceFiscalePaziente = value;
    }

    /**
     * Recupera il valore della proprietà tipoEventoNotifica.
     * 
     * @return
     *     possible object is
     *     {@link EventoNotificaTipoCodice }
     *     
     */
    public EventoNotificaTipoCodice getTipoEventoNotifica() {
        return tipoEventoNotifica;
    }

    /**
     * Imposta il valore della proprietà tipoEventoNotifica.
     * 
     * @param value
     *     allowed object is
     *     {@link EventoNotificaTipoCodice }
     *     
     */
    public void setTipoEventoNotifica(EventoNotificaTipoCodice value) {
        this.tipoEventoNotifica = value;
    }

    /**
     * Recupera il valore della proprietà componenteLocale.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getComponenteLocale() {
        return componenteLocale;
    }

    /**
     * Imposta il valore della proprietà componenteLocale.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setComponenteLocale(Object value) {
        this.componenteLocale = value;
    }

    /**
     * Recupera il valore della proprietà oscuraDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOscuraDocumento() {
        return oscuraDocumento;
    }

    /**
     * Imposta il valore della proprietà oscuraDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOscuraDocumento(String value) {
        this.oscuraDocumento = value;
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
     * Recupera il valore della proprietà dataEsame.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEsame() {
        return dataEsame;
    }

    /**
     * Imposta il valore della proprietà dataEsame.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEsame(XMLGregorianCalendar value) {
        this.dataEsame = value;
    }

    /**
     * Recupera il valore della proprietà tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Imposta il valore della proprietà tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

    /**
     * Recupera il valore della proprietà strutturaSanitaria.
     * 
     * @return
     *     possible object is
     *     {@link StrutturaSanitaria }
     *     
     */
    public StrutturaSanitaria getStrutturaSanitaria() {
        return strutturaSanitaria;
    }

    /**
     * Imposta il valore della proprietà strutturaSanitaria.
     * 
     * @param value
     *     allowed object is
     *     {@link StrutturaSanitaria }
     *     
     */
    public void setStrutturaSanitaria(StrutturaSanitaria value) {
        this.strutturaSanitaria = value;
    }

    /**
     * Recupera il valore della proprietà flagScaricabile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagScaricabile() {
        return flagScaricabile;
    }

    /**
     * Imposta il valore della proprietà flagScaricabile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagScaricabile(String value) {
        this.flagScaricabile = value;
    }

    /**
     * Recupera il valore della proprietà pagatoTicket.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagatoTicket() {
        return pagatoTicket;
    }

    /**
     * Imposta il valore della proprietà pagatoTicket.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagatoTicket(String value) {
        this.pagatoTicket = value;
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
     * Gets the value of the nreList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nreList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNreList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNreList() {
        if (nreList == null) {
            nreList = new ArrayList<String>();
        }
        return this.nreList;
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
     * Recupera il valore della proprietà consultazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsultazione() {
        return consultazione;
    }

    /**
     * Imposta il valore della proprietà consultazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsultazione(String value) {
        this.consultazione = value;
    }

}
