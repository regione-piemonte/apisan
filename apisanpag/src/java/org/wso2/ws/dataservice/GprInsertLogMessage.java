/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package org.wso2.ws.dataservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_asr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cod_stato" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="stringa_xml" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cod_servizio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="azione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numero_sportello" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numero_pratica" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codice_fiscale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uuid_ptb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idAsr",
    "uuid",
    "codStato",
    "stringaXml",
    "codServizio",
    "azione",
    "numeroSportello",
    "numeroPratica",
    "codiceFiscale",
    "uuidPtb"
})
@XmlRootElement(name = "GprInsertLogMessage")
public class GprInsertLogMessage {

    @XmlElement(name = "id_asr", required = true, nillable = true)
    protected String idAsr;
    @XmlElement(required = true, nillable = true)
    protected String uuid;
    @XmlElement(name = "cod_stato", required = true, nillable = true)
    protected BigDecimal codStato;
    @XmlElement(name = "stringa_xml", required = true, nillable = true)
    protected String stringaXml;
    @XmlElement(name = "cod_servizio", required = true, nillable = true)
    protected String codServizio;
    @XmlElement(required = true, nillable = true)
    protected String azione;
    @XmlElement(name = "numero_sportello", required = true, nillable = true)
    protected String numeroSportello;
    @XmlElement(name = "numero_pratica", required = true, nillable = true)
    protected String numeroPratica;
    @XmlElement(name = "codice_fiscale", required = true, nillable = true)
    protected String codiceFiscale;
    @XmlElement(name = "uuid_ptb", required = true, nillable = true)
    protected String uuidPtb;

    /**
     * Recupera il valore della proprieta idAsr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAsr() {
        return idAsr;
    }

    /**
     * Imposta il valore della proprieta idAsr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAsr(String value) {
        this.idAsr = value;
    }

    /**
     * Recupera il valore della proprieta uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Imposta il valore della proprieta uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Recupera il valore della proprieta codStato.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCodStato() {
        return codStato;
    }

    /**
     * Imposta il valore della proprieta codStato.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCodStato(BigDecimal value) {
        this.codStato = value;
    }

    /**
     * Recupera il valore della proprieta stringaXml.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringaXml() {
        return stringaXml;
    }

    /**
     * Imposta il valore della proprieta stringaXml.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringaXml(String value) {
        this.stringaXml = value;
    }

    /**
     * Recupera il valore della proprieta codServizio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodServizio() {
        return codServizio;
    }

    /**
     * Imposta il valore della proprieta codServizio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodServizio(String value) {
        this.codServizio = value;
    }

    /**
     * Recupera il valore della proprieta azione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAzione() {
        return azione;
    }

    /**
     * Imposta il valore della proprieta azione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAzione(String value) {
        this.azione = value;
    }

    /**
     * Recupera il valore della proprieta numeroSportello.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroSportello() {
        return numeroSportello;
    }

    /**
     * Imposta il valore della proprieta numeroSportello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroSportello(String value) {
        this.numeroSportello = value;
    }

    /**
     * Recupera il valore della proprieta numeroPratica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPratica() {
        return numeroPratica;
    }

    /**
     * Imposta il valore della proprieta numeroPratica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPratica(String value) {
        this.numeroPratica = value;
    }

    /**
     * Recupera il valore della proprieta codiceFiscale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    /**
     * Imposta il valore della proprieta codiceFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscale(String value) {
        this.codiceFiscale = value;
    }

    /**
     * Recupera il valore della proprieta uuidPtb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuidPtb() {
        return uuidPtb;
    }

    /**
     * Imposta il valore della proprieta uuidPtb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuidPtb(String value) {
        this.uuidPtb = value;
    }

}
