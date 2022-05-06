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
import it.csi.apisan.apisanfse.integration.documenti.dma.LinkImmagine;
import it.csi.apisan.apisanfse.integration.documenti.dma.LinkImmagineStazioneRefertante;
import it.csi.apisan.apisanfse.integration.documenti.dma.SiNo;


/**
 * <p>Classe Java per documentoDMA complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="documentoDMA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dma.csi.it/}accessionNumber" minOccurs="0"/>
 *         &lt;element name="codiceEpisodioDipartimentale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="codicePazienteDipartimentale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element ref="{http://dma.csi.it/}documento" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}firmatoDigitalmente" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}idDipartimentale" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}idDocumento" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}idEpisodio" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}linkImmagini" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}linkImmaginiStazioneRefertante" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}listaNre" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}oscurato" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentoDMA", propOrder = {
    "accessionNumber",
    "codiceEpisodioDipartimentale",
    "codicePazienteDipartimentale",
    "documento",
    "firmatoDigitalmente",
    "idDipartimentale",
    "idDocumento",
    "idEpisodio",
    "linkImmagini",
    "linkImmaginiStazioneRefertante",
    "listaNre",
    "oscurato"
})
public class DocumentoDMA {

    @XmlElement(namespace = "http://dma.csi.it/")
    protected String accessionNumber;
    protected String codiceEpisodioDipartimentale;
    protected String codicePazienteDipartimentale;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected byte[] documento;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected SiNo firmatoDigitalmente;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected String idDipartimentale;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected String idDocumento;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected String idEpisodio;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected List<LinkImmagine> linkImmagini;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected List<LinkImmagineStazioneRefertante> linkImmaginiStazioneRefertante;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected List<String> listaNre;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected String oscurato;

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
     * Recupera il valore della proprietà codiceEpisodioDipartimentale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceEpisodioDipartimentale() {
        return codiceEpisodioDipartimentale;
    }

    /**
     * Imposta il valore della proprietà codiceEpisodioDipartimentale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceEpisodioDipartimentale(String value) {
        this.codiceEpisodioDipartimentale = value;
    }

    /**
     * Recupera il valore della proprietà codicePazienteDipartimentale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodicePazienteDipartimentale() {
        return codicePazienteDipartimentale;
    }

    /**
     * Imposta il valore della proprietà codicePazienteDipartimentale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodicePazienteDipartimentale(String value) {
        this.codicePazienteDipartimentale = value;
    }

    /**
     * Recupera il valore della proprietà documento.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDocumento() {
        return documento;
    }

    /**
     * Imposta il valore della proprietà documento.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDocumento(byte[] value) {
        this.documento = value;
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
     * Recupera il valore della proprietà idDipartimentale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDipartimentale() {
        return idDipartimentale;
    }

    /**
     * Imposta il valore della proprietà idDipartimentale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDipartimentale(String value) {
        this.idDipartimentale = value;
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
     * Recupera il valore della proprietà idEpisodio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdEpisodio() {
        return idEpisodio;
    }

    /**
     * Imposta il valore della proprietà idEpisodio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdEpisodio(String value) {
        this.idEpisodio = value;
    }

    /**
     * Gets the value of the linkImmagini property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkImmagini property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkImmagini().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkImmagine }
     * 
     * 
     */
    public List<LinkImmagine> getLinkImmagini() {
        if (linkImmagini == null) {
            linkImmagini = new ArrayList<LinkImmagine>();
        }
        return this.linkImmagini;
    }

    /**
     * Gets the value of the linkImmaginiStazioneRefertante property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkImmaginiStazioneRefertante property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkImmaginiStazioneRefertante().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkImmagineStazioneRefertante }
     * 
     * 
     */
    public List<LinkImmagineStazioneRefertante> getLinkImmaginiStazioneRefertante() {
        if (linkImmaginiStazioneRefertante == null) {
            linkImmaginiStazioneRefertante = new ArrayList<LinkImmagineStazioneRefertante>();
        }
        return this.linkImmaginiStazioneRefertante;
    }

    /**
     * Gets the value of the listaNre property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaNre property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaNre().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListaNre() {
        if (listaNre == null) {
            listaNre = new ArrayList<String>();
        }
        return this.listaNre;
    }

    /**
     * Recupera il valore della proprietà oscurato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOscurato() {
        return oscurato;
    }

    /**
     * Imposta il valore della proprietà oscurato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOscurato(String value) {
        this.oscurato = value;
    }

}
