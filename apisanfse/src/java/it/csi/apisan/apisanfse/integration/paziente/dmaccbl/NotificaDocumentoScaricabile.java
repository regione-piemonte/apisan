/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.paziente.dmaccbl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import it.csi.apisan.apisanfse.integration.paziente.dma.ComponenteLocale;
import it.csi.apisan.apisanfse.integration.paziente.dma.NotificaDocumentoScaricabileTipo;
import it.csi.apisan.apisanfse.integration.paziente.dma.Richiedente;
import it.csi.apisan.apisanfse.integration.paziente.dma.StrutturaSanitaria;


/**
 * <p>Classe Java per notificaDocumentoScaricabile complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="notificaDocumentoScaricabile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richiedente" type="{http://dma.csi.it/}richiedente" minOccurs="0"/>
 *         &lt;element name="componenteLocale" type="{http://dma.csi.it/}componenteLocale" minOccurs="0"/>
 *         &lt;element name="idDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pinCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceFiscalePaziente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroGiorniDownload" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipoNotifica" type="{http://dma.csi.it/}notificaDocumentoScaricabileTipo" minOccurs="0"/>
 *         &lt;element name="codiceDocumentoDipartimentale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idDocumentoParent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataInizio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataDisponibilitaReferto" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataInserimentoInCL" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataSostituzione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="codiceDipartimentale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceAsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketPagato" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="ticketDaPagare" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="pagatoTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="infoAddendumReferto" type="{http://dmaccbl.csi.it/}infoAddendumReferto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dataEsame" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strutturaSanitaria" type="{http://dma.csi.it/}strutturaSanitaria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificaDocumentoScaricabile", propOrder = {
    "richiedente",
    "componenteLocale",
    "idDocumento",
    "pinCode",
    "codiceFiscalePaziente",
    "numeroGiorniDownload",
    "tipoNotifica",
    "codiceDocumentoDipartimentale",
    "idDocumentoParent",
    "dataInizio",
    "dataDisponibilitaReferto",
    "dataInserimentoInCL",
    "dataSostituzione",
    "codiceDipartimentale",
    "codiceAsr",
    "ticketPagato",
    "ticketDaPagare",
    "pagatoTicket",
    "infoAddendumReferto",
    "dataEsame",
    "tipoDocumento",
    "strutturaSanitaria"
})
public class NotificaDocumentoScaricabile {

    protected Richiedente richiedente;
    protected ComponenteLocale componenteLocale;
    protected String idDocumento;
    protected String pinCode;
    protected String codiceFiscalePaziente;
    protected int numeroGiorniDownload;
    protected NotificaDocumentoScaricabileTipo tipoNotifica;
    protected String codiceDocumentoDipartimentale;
    protected String idDocumentoParent;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInizio;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDisponibilitaReferto;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInserimentoInCL;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataSostituzione;
    protected String codiceDipartimentale;
    protected String codiceAsr;
    protected Float ticketPagato;
    protected Float ticketDaPagare;
    protected String pagatoTicket;
    @XmlElement(nillable = true)
    protected List<InfoAddendumReferto> infoAddendumReferto;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataEsame;
    protected String tipoDocumento;
    protected StrutturaSanitaria strutturaSanitaria;

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
     * Recupera il valore della proprietà idDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDocumento() {
        return idDocumento;
    }

    /**
     * Imposta il valore della proprietà idDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDocumento(String value) {
        this.idDocumento = value;
    }

    /**
     * Recupera il valore della proprietà pinCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinCode() {
        return pinCode;
    }

    /**
     * Imposta il valore della proprietà pinCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinCode(String value) {
        this.pinCode = value;
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
     * Recupera il valore della proprietà tipoNotifica.
     * 
     * @return
     *     possible object is
     *     {@link NotificaDocumentoScaricabileTipo }
     *     
     */
    public NotificaDocumentoScaricabileTipo getTipoNotifica() {
        return tipoNotifica;
    }

    /**
     * Imposta il valore della proprietà tipoNotifica.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificaDocumentoScaricabileTipo }
     *     
     */
    public void setTipoNotifica(NotificaDocumentoScaricabileTipo value) {
        this.tipoNotifica = value;
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
     * Recupera il valore della proprietà dataInizio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInizio() {
        return dataInizio;
    }

    /**
     * Imposta il valore della proprietà dataInizio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInizio(XMLGregorianCalendar value) {
        this.dataInizio = value;
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
     * Recupera il valore della proprietà dataInserimentoInCL.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInserimentoInCL() {
        return dataInserimentoInCL;
    }

    /**
     * Imposta il valore della proprietà dataInserimentoInCL.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInserimentoInCL(XMLGregorianCalendar value) {
        this.dataInserimentoInCL = value;
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
     * Recupera il valore della proprietà codiceDipartimentale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceDipartimentale() {
        return codiceDipartimentale;
    }

    /**
     * Imposta il valore della proprietà codiceDipartimentale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceDipartimentale(String value) {
        this.codiceDipartimentale = value;
    }

    /**
     * Recupera il valore della proprietà codiceAsr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceAsr() {
        return codiceAsr;
    }

    /**
     * Imposta il valore della proprietà codiceAsr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceAsr(String value) {
        this.codiceAsr = value;
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
     * Gets the value of the infoAddendumReferto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infoAddendumReferto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoAddendumReferto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfoAddendumReferto }
     * 
     * 
     */
    public List<InfoAddendumReferto> getInfoAddendumReferto() {
        if (infoAddendumReferto == null) {
            infoAddendumReferto = new ArrayList<InfoAddendumReferto>();
        }
        return this.infoAddendumReferto;
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

}
