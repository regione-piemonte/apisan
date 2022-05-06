/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documenti.dmacc;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import it.csi.apisan.apisanfse.integration.documenti.dma.Etichetta;


/**
 * <p>Classe Java per documento complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="documento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idDocumentoIlec" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/>
 *         &lt;element name="codiceCL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="categoria" type="{http://dmacc.csi.it/}categoria" minOccurs="0" form="unqualified"/>
 *         &lt;element name="metadatiDocumento" type="{http://dmacc.csi.it/}metadatiDocumento" minOccurs="0" form="unqualified"/>
 *         &lt;element name="medici" type="{http://dmacc.csi.it/}medico" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="episodio" type="{http://dmacc.csi.it/}episodio" minOccurs="0" form="unqualified"/>
 *         &lt;element name="oscurato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="accessionNumber" type="{http://dmacc.csi.it/}accessionNumber" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="etichettaAnatomica" type="{http://dma.csi.it/}etichetta" minOccurs="0" form="unqualified"/>
 *         &lt;element name="etichettaPersonale" type="{http://dma.csi.it/}etichetta" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="nre" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="statoGenerazionePacchetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documento", propOrder = {
    "idDocumentoIlec",
    "codiceCL",
    "categoria",
    "metadatiDocumento",
    "medici",
    "episodio",
    "oscurato",
    "accessionNumber",
    "etichettaAnatomica",
    "etichettaPersonale",
    "nre",
    "statoGenerazionePacchetto"
})
public class Documento {

    protected BigDecimal idDocumentoIlec;
    protected String codiceCL;
    protected Categoria categoria;
    protected MetadatiDocumento metadatiDocumento;
    @XmlElement(nillable = true)
    protected List<Medico> medici;
    protected Episodio episodio;
    protected String oscurato;
    @XmlElement(nillable = true)
    protected List<AccessionNumber> accessionNumber;
    protected Etichetta etichettaAnatomica;
    @XmlElement(nillable = true)
    protected List<Etichetta> etichettaPersonale;
    @XmlElement(nillable = true)
    protected List<String> nre;
    protected String statoGenerazionePacchetto;

    /**
     * Recupera il valore della proprietà idDocumentoIlec.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdDocumentoIlec() {
        return idDocumentoIlec;
    }

    /**
     * Imposta il valore della proprietà idDocumentoIlec.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdDocumentoIlec(BigDecimal value) {
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
     * Recupera il valore della proprietà categoria.
     * 
     * @return
     *     possible object is
     *     {@link Categoria }
     *     
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * Imposta il valore della proprietà categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link Categoria }
     *     
     */
    public void setCategoria(Categoria value) {
        this.categoria = value;
    }

    /**
     * Recupera il valore della proprietà metadatiDocumento.
     * 
     * @return
     *     possible object is
     *     {@link MetadatiDocumento }
     *     
     */
    public MetadatiDocumento getMetadatiDocumento() {
        return metadatiDocumento;
    }

    /**
     * Imposta il valore della proprietà metadatiDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadatiDocumento }
     *     
     */
    public void setMetadatiDocumento(MetadatiDocumento value) {
        this.metadatiDocumento = value;
    }

    /**
     * Gets the value of the medici property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medici property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedici().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Medico }
     * 
     * 
     */
    public List<Medico> getMedici() {
        if (medici == null) {
            medici = new ArrayList<Medico>();
        }
        return this.medici;
    }

    /**
     * Recupera il valore della proprietà episodio.
     * 
     * @return
     *     possible object is
     *     {@link Episodio }
     *     
     */
    public Episodio getEpisodio() {
        return episodio;
    }

    /**
     * Imposta il valore della proprietà episodio.
     * 
     * @param value
     *     allowed object is
     *     {@link Episodio }
     *     
     */
    public void setEpisodio(Episodio value) {
        this.episodio = value;
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
     * Recupera il valore della proprietà etichettaAnatomica.
     * 
     * @return
     *     possible object is
     *     {@link Etichetta }
     *     
     */
    public Etichetta getEtichettaAnatomica() {
        return etichettaAnatomica;
    }

    /**
     * Imposta il valore della proprietà etichettaAnatomica.
     * 
     * @param value
     *     allowed object is
     *     {@link Etichetta }
     *     
     */
    public void setEtichettaAnatomica(Etichetta value) {
        this.etichettaAnatomica = value;
    }

    /**
     * Gets the value of the etichettaPersonale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the etichettaPersonale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEtichettaPersonale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Etichetta }
     * 
     * 
     */
    public List<Etichetta> getEtichettaPersonale() {
        if (etichettaPersonale == null) {
            etichettaPersonale = new ArrayList<Etichetta>();
        }
        return this.etichettaPersonale;
    }

    /**
     * Gets the value of the nre property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nre property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNre().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNre() {
        if (nre == null) {
            nre = new ArrayList<String>();
        }
        return this.nre;
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

}
