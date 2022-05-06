/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documenti.dmacc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import it.csi.apisan.apisanfse.integration.documenti.dma.Azienda;
import it.csi.apisan.apisanfse.integration.documenti.dma.TipoFirma;


/**
 * <p>Classe Java per metadatiDocumento complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="metadatiDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiceDocumentoDipartimentale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="azienda" type="{http://dma.csi.it/}azienda" minOccurs="0" form="unqualified"/>
 *         &lt;element name="descrizioneStruttura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="descrizioneUnitaOperativa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="matricolaUpDipartimentale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="dataValidazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="tipoDocumento" type="{http://dmacc.csi.it/}tipoDocumento" minOccurs="0" form="unqualified"/>
 *         &lt;element name="tipoFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="codiceDipartimentale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="codiceTipoDocumentoAlto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="assettoOrganizzativo" type="{http://dmacc.csi.it/}assettoOrganizzativo" minOccurs="0" form="unqualified"/>
 *         &lt;element name="idRepositoryCL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="tipoFirma" type="{http://dma.csi.it/}tipoFirma" minOccurs="0" form="unqualified"/>
 *         &lt;element name="ticketPagato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="ticketDaPagare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="pagatoTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="coccarda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="flagEpisodiCollegati" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="flagAssociazioniNre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="flagAssociazioniAppend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="dataPrimoScarico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="dataRitiroDeVisu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="recuperoPregresso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="descrizioneTipoFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="prestazioni" type="{http://dmacc.csi.it/}prestazione" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="tipoContributo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metadatiDocumento", propOrder = {
    "codiceDocumentoDipartimentale",
    "azienda",
    "descrizioneStruttura",
    "descrizioneUnitaOperativa",
    "matricolaUpDipartimentale",
    "dataValidazione",
    "tipoDocumento",
    "tipoFile",
    "codiceDipartimentale",
    "codiceTipoDocumentoAlto",
    "assettoOrganizzativo",
    "idRepositoryCL",
    "tipoFirma",
    "ticketPagato",
    "ticketDaPagare",
    "pagatoTicket",
    "coccarda",
    "flagEpisodiCollegati",
    "flagAssociazioniNre",
    "flagAssociazioniAppend",
    "dataPrimoScarico",
    "dataRitiroDeVisu",
    "recuperoPregresso",
    "descrizioneTipoFile",
    "prestazioni",
    "tipoContributo"
})
public class MetadatiDocumento {

    protected String codiceDocumentoDipartimentale;
    protected Azienda azienda;
    protected String descrizioneStruttura;
    protected String descrizioneUnitaOperativa;
    protected String matricolaUpDipartimentale;
    protected String dataValidazione;
    protected TipoDocumento tipoDocumento;
    protected String tipoFile;
    protected String codiceDipartimentale;
    protected String codiceTipoDocumentoAlto;
    protected AssettoOrganizzativo assettoOrganizzativo;
    protected String idRepositoryCL;
    protected TipoFirma tipoFirma;
    protected String ticketPagato;
    protected String ticketDaPagare;
    protected String pagatoTicket;
    protected String coccarda;
    protected String flagEpisodiCollegati;
    protected String flagAssociazioniNre;
    protected String flagAssociazioniAppend;
    protected String dataPrimoScarico;
    protected String dataRitiroDeVisu;
    protected String recuperoPregresso;
    protected String descrizioneTipoFile;
    @XmlElement(nillable = true)
    protected List<Prestazione> prestazioni;
    protected String tipoContributo;

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
     * Recupera il valore della proprietà azienda.
     * 
     * @return
     *     possible object is
     *     {@link Azienda }
     *     
     */
    public Azienda getAzienda() {
        return azienda;
    }

    /**
     * Imposta il valore della proprietà azienda.
     * 
     * @param value
     *     allowed object is
     *     {@link Azienda }
     *     
     */
    public void setAzienda(Azienda value) {
        this.azienda = value;
    }

    /**
     * Recupera il valore della proprietà descrizioneStruttura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneStruttura() {
        return descrizioneStruttura;
    }

    /**
     * Imposta il valore della proprietà descrizioneStruttura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneStruttura(String value) {
        this.descrizioneStruttura = value;
    }

    /**
     * Recupera il valore della proprietà descrizioneUnitaOperativa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneUnitaOperativa() {
        return descrizioneUnitaOperativa;
    }

    /**
     * Imposta il valore della proprietà descrizioneUnitaOperativa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneUnitaOperativa(String value) {
        this.descrizioneUnitaOperativa = value;
    }

    /**
     * Recupera il valore della proprietà matricolaUpDipartimentale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricolaUpDipartimentale() {
        return matricolaUpDipartimentale;
    }

    /**
     * Imposta il valore della proprietà matricolaUpDipartimentale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricolaUpDipartimentale(String value) {
        this.matricolaUpDipartimentale = value;
    }

    /**
     * Recupera il valore della proprietà dataValidazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataValidazione() {
        return dataValidazione;
    }

    /**
     * Imposta il valore della proprietà dataValidazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataValidazione(String value) {
        this.dataValidazione = value;
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
     * Recupera il valore della proprietà tipoFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoFile() {
        return tipoFile;
    }

    /**
     * Imposta il valore della proprietà tipoFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoFile(String value) {
        this.tipoFile = value;
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
     * Recupera il valore della proprietà codiceTipoDocumentoAlto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceTipoDocumentoAlto() {
        return codiceTipoDocumentoAlto;
    }

    /**
     * Imposta il valore della proprietà codiceTipoDocumentoAlto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceTipoDocumentoAlto(String value) {
        this.codiceTipoDocumentoAlto = value;
    }

    /**
     * Recupera il valore della proprietà assettoOrganizzativo.
     * 
     * @return
     *     possible object is
     *     {@link AssettoOrganizzativo }
     *     
     */
    public AssettoOrganizzativo getAssettoOrganizzativo() {
        return assettoOrganizzativo;
    }

    /**
     * Imposta il valore della proprietà assettoOrganizzativo.
     * 
     * @param value
     *     allowed object is
     *     {@link AssettoOrganizzativo }
     *     
     */
    public void setAssettoOrganizzativo(AssettoOrganizzativo value) {
        this.assettoOrganizzativo = value;
    }

    /**
     * Recupera il valore della proprietà idRepositoryCL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRepositoryCL() {
        return idRepositoryCL;
    }

    /**
     * Imposta il valore della proprietà idRepositoryCL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRepositoryCL(String value) {
        this.idRepositoryCL = value;
    }

    /**
     * Recupera il valore della proprietà tipoFirma.
     * 
     * @return
     *     possible object is
     *     {@link TipoFirma }
     *     
     */
    public TipoFirma getTipoFirma() {
        return tipoFirma;
    }

    /**
     * Imposta il valore della proprietà tipoFirma.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoFirma }
     *     
     */
    public void setTipoFirma(TipoFirma value) {
        this.tipoFirma = value;
    }

    /**
     * Recupera il valore della proprietà ticketPagato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketPagato() {
        return ticketPagato;
    }

    /**
     * Imposta il valore della proprietà ticketPagato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketPagato(String value) {
        this.ticketPagato = value;
    }

    /**
     * Recupera il valore della proprietà ticketDaPagare.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketDaPagare() {
        return ticketDaPagare;
    }

    /**
     * Imposta il valore della proprietà ticketDaPagare.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketDaPagare(String value) {
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
     * Recupera il valore della proprietà coccarda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoccarda() {
        return coccarda;
    }

    /**
     * Imposta il valore della proprietà coccarda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoccarda(String value) {
        this.coccarda = value;
    }

    /**
     * Recupera il valore della proprietà flagEpisodiCollegati.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagEpisodiCollegati() {
        return flagEpisodiCollegati;
    }

    /**
     * Imposta il valore della proprietà flagEpisodiCollegati.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagEpisodiCollegati(String value) {
        this.flagEpisodiCollegati = value;
    }

    /**
     * Recupera il valore della proprietà flagAssociazioniNre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagAssociazioniNre() {
        return flagAssociazioniNre;
    }

    /**
     * Imposta il valore della proprietà flagAssociazioniNre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagAssociazioniNre(String value) {
        this.flagAssociazioniNre = value;
    }

    /**
     * Recupera il valore della proprietà flagAssociazioniAppend.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagAssociazioniAppend() {
        return flagAssociazioniAppend;
    }

    /**
     * Imposta il valore della proprietà flagAssociazioniAppend.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagAssociazioniAppend(String value) {
        this.flagAssociazioniAppend = value;
    }

    /**
     * Recupera il valore della proprietà dataPrimoScarico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPrimoScarico() {
        return dataPrimoScarico;
    }

    /**
     * Imposta il valore della proprietà dataPrimoScarico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPrimoScarico(String value) {
        this.dataPrimoScarico = value;
    }

    /**
     * Recupera il valore della proprietà dataRitiroDeVisu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRitiroDeVisu() {
        return dataRitiroDeVisu;
    }

    /**
     * Imposta il valore della proprietà dataRitiroDeVisu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRitiroDeVisu(String value) {
        this.dataRitiroDeVisu = value;
    }

    /**
     * Recupera il valore della proprietà recuperoPregresso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecuperoPregresso() {
        return recuperoPregresso;
    }

    /**
     * Imposta il valore della proprietà recuperoPregresso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecuperoPregresso(String value) {
        this.recuperoPregresso = value;
    }

    /**
     * Recupera il valore della proprietà descrizioneTipoFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneTipoFile() {
        return descrizioneTipoFile;
    }

    /**
     * Imposta il valore della proprietà descrizioneTipoFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneTipoFile(String value) {
        this.descrizioneTipoFile = value;
    }

    /**
     * Gets the value of the prestazioni property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prestazioni property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrestazioni().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Prestazione }
     * 
     * 
     */
    public List<Prestazione> getPrestazioni() {
        if (prestazioni == null) {
            prestazioni = new ArrayList<Prestazione>();
        }
        return this.prestazioni;
    }

    /**
     * Recupera il valore della proprietà tipoContributo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoContributo() {
        return tipoContributo;
    }

    /**
     * Imposta il valore della proprietà tipoContributo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoContributo(String value) {
        this.tipoContributo = value;
    }

}
