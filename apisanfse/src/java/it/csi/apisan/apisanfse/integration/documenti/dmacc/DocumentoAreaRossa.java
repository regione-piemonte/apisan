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


/**
 * <p>Classe Java per documentoAreaRossa complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="documentoAreaRossa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idDocumentoIlec" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/>
 *         &lt;element name="codiceCL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="data_inserimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="data_emissione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="tipoDocumento" type="{http://dmacc.csi.it/}tipoDocumento" minOccurs="0" form="unqualified"/>
 *         &lt;element name="descrizioneStruttura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="azienda" type="{http://dma.csi.it/}azienda" minOccurs="0" form="unqualified"/>
 *         &lt;element name="importoPagato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="importoDaPagare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="pagatoTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="gg_download" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="dataScadenza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="rol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="prestazioni" type="{http://dmacc.csi.it/}prestazione" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="accessionNumber" type="{http://dmacc.csi.it/}accessionNumber" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="statoGenerazionePacchetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="idEpisodio" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/>
 *         &lt;element name="codiceDocumentoDipartimentale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentoAreaRossa", propOrder = {
    "idDocumentoIlec",
    "codiceCL",
    "dataInserimento",
    "dataEmissione",
    "tipoDocumento",
    "descrizioneStruttura",
    "azienda",
    "importoPagato",
    "importoDaPagare",
    "pagatoTicket",
    "ggDownload",
    "dataScadenza",
    "rol",
    "prestazioni",
    "accessionNumber",
    "statoGenerazionePacchetto",
    "idEpisodio",
    "codiceDocumentoDipartimentale"
})
public class DocumentoAreaRossa {

    protected Long idDocumentoIlec;
    protected String codiceCL;
    @XmlElement(name = "data_inserimento")
    protected String dataInserimento;
    @XmlElement(name = "data_emissione")
    protected String dataEmissione;
    protected TipoDocumento tipoDocumento;
    protected String descrizioneStruttura;
    protected Azienda azienda;
    protected String importoPagato;
    protected String importoDaPagare;
    protected String pagatoTicket;
    @XmlElement(name = "gg_download")
    protected String ggDownload;
    protected String dataScadenza;
    protected String rol;
    @XmlElement(nillable = true)
    protected List<Prestazione> prestazioni;
    @XmlElement(nillable = true)
    protected List<AccessionNumber> accessionNumber;
    protected String statoGenerazionePacchetto;
    protected Long idEpisodio;
    protected String codiceDocumentoDipartimentale;

    /**
     * Recupera il valore della proprietà idDocumentoIlec.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdDocumentoIlec() {
        return idDocumentoIlec;
    }

    /**
     * Imposta il valore della proprietà idDocumentoIlec.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdDocumentoIlec(Long value) {
        this.idDocumentoIlec = value;
    }

    /**
     * Recupera il valore della proprietà codiceCL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceCL() {
        return codiceCL;
    }

    /**
     * Imposta il valore della proprietà codiceCL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceCL(String value) {
        this.codiceCL = value;
    }

    /**
     * Recupera il valore della proprietà dataInserimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInserimento() {
        return dataInserimento;
    }

    /**
     * Imposta il valore della proprietà dataInserimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInserimento(String value) {
        this.dataInserimento = value;
    }

    /**
     * Recupera il valore della proprietà dataEmissione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEmissione() {
        return dataEmissione;
    }

    /**
     * Imposta il valore della proprietà dataEmissione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEmissione(String value) {
        this.dataEmissione = value;
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
     * Recupera il valore della proprietà importoPagato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportoPagato() {
        return importoPagato;
    }

    /**
     * Imposta il valore della proprietà importoPagato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportoPagato(String value) {
        this.importoPagato = value;
    }

    /**
     * Recupera il valore della proprietà importoDaPagare.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportoDaPagare() {
        return importoDaPagare;
    }

    /**
     * Imposta il valore della proprietà importoDaPagare.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportoDaPagare(String value) {
        this.importoDaPagare = value;
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
     * Recupera il valore della proprietà ggDownload.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGgDownload() {
        return ggDownload;
    }

    /**
     * Imposta il valore della proprietà ggDownload.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGgDownload(String value) {
        this.ggDownload = value;
    }

    /**
     * Recupera il valore della proprietà dataScadenza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataScadenza() {
        return dataScadenza;
    }

    /**
     * Imposta il valore della proprietà dataScadenza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataScadenza(String value) {
        this.dataScadenza = value;
    }

    /**
     * Recupera il valore della proprietà rol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRol() {
        return rol;
    }

    /**
     * Imposta il valore della proprietà rol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRol(String value) {
        this.rol = value;
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
     * Gets the value of the accessionNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessionNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessionNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessionNumber }
     * 
     * 
     */
    public List<AccessionNumber> getAccessionNumber() {
        if (accessionNumber == null) {
            accessionNumber = new ArrayList<AccessionNumber>();
        }
        return this.accessionNumber;
    }

    /**
     * Recupera il valore della proprietà statoGenerazionePacchetto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatoGenerazionePacchetto() {
        return statoGenerazionePacchetto;
    }

    /**
     * Imposta il valore della proprietà statoGenerazionePacchetto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatoGenerazionePacchetto(String value) {
        this.statoGenerazionePacchetto = value;
    }

    /**
     * Recupera il valore della proprietà idEpisodio.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdEpisodio() {
        return idEpisodio;
    }

    /**
     * Imposta il valore della proprietà idEpisodio.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdEpisodio(Long value) {
        this.idEpisodio = value;
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

}
