/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per estremiRicetta complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="estremiRicetta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoPrescrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regionePrescrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estremiRicetta", propOrder = {
    "tipoPrescrizione",
    "regionePrescrizione",
    "nre"
})
public class EstremiRicetta {

    protected String tipoPrescrizione;
    protected String regionePrescrizione;
    @XmlElement(required = true)
    protected String nre;

    /**
     * Recupera il valore della property tipoPrescrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPrescrizione() {
        return tipoPrescrizione;
    }

    /**
     * Imposta il valore della property tipoPrescrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPrescrizione(String value) {
        this.tipoPrescrizione = value;
    }

    /**
     * Recupera il valore della property regionePrescrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionePrescrizione() {
        return regionePrescrizione;
    }

    /**
     * Imposta il valore della property regionePrescrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionePrescrizione(String value) {
        this.regionePrescrizione = value;
    }

    /**
     * Recupera il valore della property nre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNre() {
        return nre;
    }

    /**
     * Imposta il valore della property nre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNre(String value) {
        this.nre = value;
    }

}
