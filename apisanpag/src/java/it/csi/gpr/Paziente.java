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
 * <p>Classe Java per Paziente complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Paziente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COGNOME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATA_NASCITA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODICE_FISCALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INDIRIZZO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COMUNE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROVINCIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Paziente", propOrder = {
    "cognome",
    "nome",
    "datanascita",
    "codicefiscale",
    "indirizzo",
    "comune",
    "provincia",
    "cap"
})
public class Paziente {

    @XmlElement(name = "COGNOME")
    protected String cognome;
    @XmlElement(name = "NOME")
    protected String nome;
    @XmlElement(name = "DATA_NASCITA")
    protected String datanascita;
    @XmlElement(name = "CODICE_FISCALE")
    protected String codicefiscale;
    @XmlElement(name = "INDIRIZZO")
    protected String indirizzo;
    @XmlElement(name = "COMUNE")
    protected String comune;
    @XmlElement(name = "PROVINCIA")
    protected String provincia;
    @XmlElement(name = "CAP")
    protected String cap;

    /**
     * Recupera il valore della proprieta cognome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOGNOME() {
        return cognome;
    }

    /**
     * Imposta il valore della proprieta cognome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOGNOME(String value) {
        this.cognome = value;
    }

    /**
     * Recupera il valore della proprieta nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOME() {
        return nome;
    }

    /**
     * Imposta il valore della proprieta nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOME(String value) {
        this.nome = value;
    }

    /**
     * Recupera il valore della proprieta datanascita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATANASCITA() {
        return datanascita;
    }

    /**
     * Imposta il valore della proprieta datanascita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATANASCITA(String value) {
        this.datanascita = value;
    }

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
     * Recupera il valore della proprieta indirizzo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDIRIZZO() {
        return indirizzo;
    }

    /**
     * Imposta il valore della proprieta indirizzo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDIRIZZO(String value) {
        this.indirizzo = value;
    }

    /**
     * Recupera il valore della proprieta comune.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMUNE() {
        return comune;
    }

    /**
     * Imposta il valore della proprieta comune.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMUNE(String value) {
        this.comune = value;
    }

    /**
     * Recupera il valore della proprieta provincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVINCIA() {
        return provincia;
    }

    /**
     * Imposta il valore della proprieta provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVINCIA(String value) {
        this.provincia = value;
    }

    /**
     * Recupera il valore della proprieta cap.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAP() {
        return cap;
    }

    /**
     * Imposta il valore della proprieta cap.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAP(String value) {
        this.cap = value;
    }

}
