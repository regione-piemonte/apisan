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
 * <p>Classe Java per Pagamento complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Pagamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NUMERO_SPORTELLO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NUMERO_PRATICA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NUMERO_RICEVUTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATA_RICEVUTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IMPORTO_PRATICA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODICE_FISCALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pagamento", propOrder = {
    "uuid",
    "azione",
    "asr",
    "numerosportello",
    "numeropratica",
    "numeroricevuta",
    "dataricevuta",
    "importopratica",
    "codicefiscale"
})
public class Pagamento {

    @XmlElement(name = "UUID")
    protected String uuid;
    @XmlElement(name = "AZIONE")
    protected String azione;
    @XmlElement(name = "ASR")
    protected String asr;
    @XmlElement(name = "NUMERO_SPORTELLO")
    protected String numerosportello;
    @XmlElement(name = "NUMERO_PRATICA")
    protected String numeropratica;
    @XmlElement(name = "NUMERO_RICEVUTA")
    protected String numeroricevuta;
    @XmlElement(name = "DATA_RICEVUTA")
    protected String dataricevuta;
    @XmlElement(name = "IMPORTO_PRATICA")
    protected String importopratica;
    @XmlElement(name = "CODICE_FISCALE")
    protected String codicefiscale;

    /**
     * Recupera il valore della proprietà uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Imposta il valore della proprietà uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Recupera il valore della proprietà azione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZIONE() {
        return azione;
    }

    /**
     * Imposta il valore della proprietà azione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZIONE(String value) {
        this.azione = value;
    }

    /**
     * Recupera il valore della proprietà asr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASR() {
        return asr;
    }

    /**
     * Imposta il valore della proprietà asr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASR(String value) {
        this.asr = value;
    }

    /**
     * Recupera il valore della proprietà numerosportello.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROSPORTELLO() {
        return numerosportello;
    }

    /**
     * Imposta il valore della proprietà numerosportello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROSPORTELLO(String value) {
        this.numerosportello = value;
    }

    /**
     * Recupera il valore della proprietà numeropratica.
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
     * Imposta il valore della proprietà numeropratica.
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
     * Recupera il valore della proprietà numeroricevuta.
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
     * Imposta il valore della proprietà numeroricevuta.
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
     * Recupera il valore della proprietà dataricevuta.
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
     * Imposta il valore della proprietà dataricevuta.
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
     * Recupera il valore della proprietà importopratica.
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
     * Imposta il valore della proprietà importopratica.
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
     * Recupera il valore della proprietà codicefiscale.
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
     * Imposta il valore della proprietà codicefiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICEFISCALE(String value) {
        this.codicefiscale = value;
    }

}
