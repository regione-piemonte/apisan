/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.paziente.dma;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per gruppoMisurazioni complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="gruppoMisurazioni">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idGruppoMisurazioni" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descrizioneBreve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="icona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descrittoriMisurazioni" type="{http://dma.csi.it/}descrittoreMisurazione" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gruppoMisurazioni", propOrder = {
    "idGruppoMisurazioni",
    "descrizione",
    "descrizioneBreve",
    "colore",
    "icona",
    "descrittoriMisurazioni"
})
public class GruppoMisurazioni {

    protected Long idGruppoMisurazioni;
    protected String descrizione;
    protected String descrizioneBreve;
    protected String colore;
    protected String icona;
    @XmlElement(nillable = true)
    protected List<DescrittoreMisurazione> descrittoriMisurazioni;

    /**
     * Recupera il valore della proprietà idGruppoMisurazioni.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdGruppoMisurazioni() {
        return idGruppoMisurazioni;
    }

    /**
     * Imposta il valore della proprietà idGruppoMisurazioni.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdGruppoMisurazioni(Long value) {
        this.idGruppoMisurazioni = value;
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
     * Recupera il valore della proprietà descrizioneBreve.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneBreve() {
        return descrizioneBreve;
    }

    /**
     * Imposta il valore della proprietà descrizioneBreve.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneBreve(String value) {
        this.descrizioneBreve = value;
    }

    /**
     * Recupera il valore della proprietà colore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColore() {
        return colore;
    }

    /**
     * Imposta il valore della proprietà colore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColore(String value) {
        this.colore = value;
    }

    /**
     * Recupera il valore della proprietà icona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcona() {
        return icona;
    }

    /**
     * Imposta il valore della proprietà icona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcona(String value) {
        this.icona = value;
    }

    /**
     * Gets the value of the descrittoriMisurazioni property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descrittoriMisurazioni property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescrittoriMisurazioni().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescrittoreMisurazione }
     * 
     * 
     */
    public List<DescrittoreMisurazione> getDescrittoriMisurazioni() {
        if (descrittoriMisurazioni == null) {
            descrittoriMisurazioni = new ArrayList<DescrittoreMisurazione>();
        }
        return this.descrittoriMisurazioni;
    }

}
