/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Quietanza complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Quietanza">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODICE_FISCALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NUMERO_PRATICA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IMPORTO_PRATICA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NUMERO_QUIETANZA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATA_QUIETANZA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NUMERO_RICEVUTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATA_RICEVUTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ERRORE" type="{http://csi.it}Errore"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quietanza", propOrder = {
    "codicefiscale",
    "numeropratica",
    "importopratica",
    "numeroquietanza",
    "dataquietanza",
    "numeroricevuta",
    "dataricevuta",
    "errore"
})
public class Quietanza {

    @XmlElement(name = "CODICE_FISCALE")
    protected String codicefiscale;
    @XmlElement(name = "NUMERO_PRATICA")
    protected String numeropratica;
    @XmlElement(name = "IMPORTO_PRATICA")
    protected String importopratica;
    @XmlElement(name = "NUMERO_QUIETANZA")
    protected String numeroquietanza;
    @XmlElement(name = "DATA_QUIETANZA")
    protected String dataquietanza;
    @XmlElement(name = "NUMERO_RICEVUTA")
    protected String numeroricevuta;
    @XmlElement(name = "DATA_RICEVUTA")
    protected String dataricevuta;
    @XmlElement(name = "ERRORE", required = true)
    protected Errore errore;

    /**
     * Recupera il valore della proprieta codicefiscale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICEFISCALE() {
        return codicefiscale;
    }

    /**
     * Imposta il valore della proprieta codicefiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICEFISCALE(String value) {
        this.codicefiscale = value;
    }

    /**
     * Recupera il valore della proprieta numeropratica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROPRATICA() {
        return numeropratica;
    }

    /**
     * Imposta il valore della proprieta numeropratica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROPRATICA(String value) {
        this.numeropratica = value;
    }

    /**
     * Recupera il valore della proprieta importopratica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPORTOPRATICA() {
        return importopratica;
    }

    /**
     * Imposta il valore della proprieta importopratica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPORTOPRATICA(String value) {
        this.importopratica = value;
    }

    /**
     * Recupera il valore della proprieta numeroquietanza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROQUIETANZA() {
        return numeroquietanza;
    }

    /**
     * Imposta il valore della proprieta numeroquietanza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROQUIETANZA(String value) {
        this.numeroquietanza = value;
    }

    /**
     * Recupera il valore della proprieta dataquietanza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAQUIETANZA() {
        return dataquietanza;
    }

    /**
     * Imposta il valore della proprieta dataquietanza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAQUIETANZA(String value) {
        this.dataquietanza = value;
    }

    /**
     * Recupera il valore della proprieta numeroricevuta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERORICEVUTA() {
        return numeroricevuta;
    }

    /**
     * Imposta il valore della proprieta numeroricevuta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERORICEVUTA(String value) {
        this.numeroricevuta = value;
    }

    /**
     * Recupera il valore della proprieta dataricevuta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATARICEVUTA() {
        return dataricevuta;
    }

    /**
     * Imposta il valore della proprieta dataricevuta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATARICEVUTA(String value) {
        this.dataricevuta = value;
    }

    /**
     * Recupera il valore della proprieta errore.
     * 
     * @return
     *     possible object is
     *     {@link Errore }
     *     
     */
    public Errore getERRORE() {
        return errore;
    }

    /**
     * Imposta il valore della proprieta errore.
     * 
     * @param value
     *     allowed object is
     *     {@link Errore }
     *     
     */
    public void setERRORE(Errore value) {
        this.errore = value;
    }

}
