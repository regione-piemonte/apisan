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
import it.csi.apisan.apisanfse.integration.documenti.dma.Etichetta;


/**
 * <p>Classe Java per filtroDocs complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="filtroDocs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoriaTipologia" type="{http://dmacc.csi.it/}categoriaTipologia" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="tipoEpisodio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="dataInizio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="dataFine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="etichettaAnatomica" type="{http://dma.csi.it/}etichetta" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="etichettaPersonale" type="{http://dma.csi.it/}etichetta" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filtroDocs", propOrder = {
    "categoriaTipologia",
    "tipoEpisodio",
    "dataInizio",
    "dataFine",
    "etichettaAnatomica",
    "etichettaPersonale"
})
public class FiltroDocs {

    @XmlElement(nillable = true)
    protected List<CategoriaTipologia> categoriaTipologia;
    protected String tipoEpisodio;
    protected String dataInizio;
    protected String dataFine;
    @XmlElement(nillable = true)
    protected List<Etichetta> etichettaAnatomica;
    @XmlElement(nillable = true)
    protected List<Etichetta> etichettaPersonale;

    /**
     * Gets the value of the categoriaTipologia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoriaTipologia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoriaTipologia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoriaTipologia }
     * 
     * 
     */
    public List<CategoriaTipologia> getCategoriaTipologia() {
        if (categoriaTipologia == null) {
            categoriaTipologia = new ArrayList<CategoriaTipologia>();
        }
        return this.categoriaTipologia;
    }

    /**
     * Recupera il valore della proprietà tipoEpisodio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEpisodio() {
        return tipoEpisodio;
    }

    /**
     * Imposta il valore della proprietà tipoEpisodio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEpisodio(String value) {
        this.tipoEpisodio = value;
    }

    /**
     * Recupera il valore della proprietà dataInizio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInizio() {
        return dataInizio;
    }

    /**
     * Imposta il valore della proprietà dataInizio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInizio(String value) {
        this.dataInizio = value;
    }

    /**
     * Recupera il valore della proprietà dataFine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataFine() {
        return dataFine;
    }

    /**
     * Imposta il valore della proprietà dataFine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFine(String value) {
        this.dataFine = value;
    }

    /**
     * Gets the value of the etichettaAnatomica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the etichettaAnatomica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEtichettaAnatomica().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Etichetta }
     * 
     * 
     */
    public List<Etichetta> getEtichettaAnatomica() {
        if (etichettaAnatomica == null) {
            etichettaAnatomica = new ArrayList<Etichetta>();
        }
        return this.etichettaAnatomica;
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

}
