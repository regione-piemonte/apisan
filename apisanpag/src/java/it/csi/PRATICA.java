/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PRATICA complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PRATICA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ORDERCOL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODICE_FISCALE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_PRENOTAZIONE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NUMERO_PRATICA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_ASR_CUP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESCRIZIONE_ID_ASR_CUP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IMPORTO_PRATICA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IMPORTO_TICKET_PAGATO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MOTIVO_PAGAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CONSENSO_730" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODICE_STATO_PRATICA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESCIZIONE_STATO_PRATICA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DATA_ANNULLAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRATICA", propOrder = {
    "ordercol",
    "codicefiscale",
    "idprenotazione",
    "numeropratica",
    "idasrcup",
    "descrizioneidasrcup",
    "importopratica",
    "importoticketpagato",
    "motivopagamento",
    "consenso730",
    "codicestatopratica",
    "descizionestatopratica",
    "dataannullamento"
})
public class PRATICA {

    @XmlElement(name = "ORDERCOL", required = true, nillable = true)
    protected String ordercol;
    @XmlElement(name = "CODICE_FISCALE", required = true, nillable = true)
    protected String codicefiscale;
    @XmlElement(name = "ID_PRENOTAZIONE", required = true, nillable = true)
    protected String idprenotazione;
    @XmlElement(name = "NUMERO_PRATICA", required = true, nillable = true)
    protected String numeropratica;
    @XmlElement(name = "ID_ASR_CUP", required = true, nillable = true)
    protected String idasrcup;
    @XmlElement(name = "DESCRIZIONE_ID_ASR_CUP", required = true, nillable = true)
    protected String descrizioneidasrcup;
    @XmlElement(name = "IMPORTO_PRATICA", required = true, nillable = true)
    protected String importopratica;
    @XmlElement(name = "IMPORTO_TICKET_PAGATO", required = true, nillable = true)
    protected String importoticketpagato;
    @XmlElement(name = "MOTIVO_PAGAMENTO", required = true, nillable = true)
    protected String motivopagamento;
    @XmlElement(name = "CONSENSO_730", required = true, nillable = true)
    protected String consenso730;
    @XmlElement(name = "CODICE_STATO_PRATICA", required = true, nillable = true)
    protected String codicestatopratica;
    @XmlElement(name = "DESCIZIONE_STATO_PRATICA", required = true, nillable = true)
    protected String descizionestatopratica;
    @XmlElement(name = "DATA_ANNULLAMENTO", required = true, nillable = true)
    protected String dataannullamento;

    /**
     * Recupera il valore della proprieta ordercol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERCOL() {
        return ordercol;
    }

    /**
     * Imposta il valore della proprieta ordercol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERCOL(String value) {
        this.ordercol = value;
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
     * Recupera il valore della proprieta idprenotazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDPRENOTAZIONE() {
        return idprenotazione;
    }

    /**
     * Imposta il valore della proprieta idprenotazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDPRENOTAZIONE(String value) {
        this.idprenotazione = value;
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
     * Recupera il valore della proprieta idasrcup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDASRCUP() {
        return idasrcup;
    }

    /**
     * Imposta il valore della proprieta idasrcup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDASRCUP(String value) {
        this.idasrcup = value;
    }

    /**
     * Recupera il valore della proprieta descrizioneidasrcup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIZIONEIDASRCUP() {
        return descrizioneidasrcup;
    }

    /**
     * Imposta il valore della proprieta descrizioneidasrcup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIZIONEIDASRCUP(String value) {
        this.descrizioneidasrcup = value;
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
     * Recupera il valore della proprieta importoticketpagato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPORTOTICKETPAGATO() {
        return importoticketpagato;
    }

    /**
     * Imposta il valore della proprieta importoticketpagato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPORTOTICKETPAGATO(String value) {
        this.importoticketpagato = value;
    }

    /**
     * Recupera il valore della proprieta motivopagamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOTIVOPAGAMENTO() {
        return motivopagamento;
    }

    /**
     * Imposta il valore della proprieta motivopagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOTIVOPAGAMENTO(String value) {
        this.motivopagamento = value;
    }

    /**
     * Recupera il valore della proprieta consenso730.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONSENSO730() {
        return consenso730;
    }

    /**
     * Imposta il valore della proprieta consenso730.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONSENSO730(String value) {
        this.consenso730 = value;
    }

    /**
     * Recupera il valore della proprieta codicestatopratica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICESTATOPRATICA() {
        return codicestatopratica;
    }

    /**
     * Imposta il valore della proprieta codicestatopratica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICESTATOPRATICA(String value) {
        this.codicestatopratica = value;
    }

    /**
     * Recupera il valore della proprieta descizionestatopratica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCIZIONESTATOPRATICA() {
        return descizionestatopratica;
    }

    /**
     * Imposta il valore della proprieta descizionestatopratica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCIZIONESTATOPRATICA(String value) {
        this.descizionestatopratica = value;
    }

    /**
     * Recupera il valore della proprieta dataannullamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAANNULLAMENTO() {
        return dataannullamento;
    }

    /**
     * Imposta il valore della proprieta dataannullamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAANNULLAMENTO(String value) {
        this.dataannullamento = value;
    }

}
