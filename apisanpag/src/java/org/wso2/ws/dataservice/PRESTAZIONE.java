/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package org.wso2.ws.dataservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PRESTAZIONE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PRESTAZIONE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODICE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESCRIZIONE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IMPORTO_PRESTAZIONE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DATA_APPUNTAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ORA_APPUNTAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LUOGO_APPUNTAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NOTE_APPUNTAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COMUNE_APPUNTAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INDIRIZZO_APPUNTAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PROVINCIA_APPUNTAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CAP_APPUNTAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRESTAZIONE", propOrder = {
    "codice",
    "descrizione",
    "importoprestazione",
    "dataappuntamento",
    "oraappuntamento",
    "luogoappuntamento",
    "noteappuntamento",
    "comuneappuntamento",
    "indirizzoappuntamento",
    "provinciaappuntamento",
    "capappuntamento"
})
public class PRESTAZIONE {

    @XmlElement(name = "CODICE", required = true, nillable = true)
    protected String codice;
    @XmlElement(name = "DESCRIZIONE", required = true, nillable = true)
    protected String descrizione;
    @XmlElement(name = "IMPORTO_PRESTAZIONE", required = true, nillable = true)
    protected String importoprestazione;
    @XmlElement(name = "DATA_APPUNTAMENTO", required = true, nillable = true)
    protected String dataappuntamento;
    @XmlElement(name = "ORA_APPUNTAMENTO", required = true, nillable = true)
    protected String oraappuntamento;
    @XmlElement(name = "LUOGO_APPUNTAMENTO", required = true, nillable = true)
    protected String luogoappuntamento;
    @XmlElement(name = "NOTE_APPUNTAMENTO", required = true, nillable = true)
    protected String noteappuntamento;
    @XmlElement(name = "COMUNE_APPUNTAMENTO", required = true, nillable = true)
    protected String comuneappuntamento;
    @XmlElement(name = "INDIRIZZO_APPUNTAMENTO", required = true, nillable = true)
    protected String indirizzoappuntamento;
    @XmlElement(name = "PROVINCIA_APPUNTAMENTO", required = true, nillable = true)
    protected String provinciaappuntamento;
    @XmlElement(name = "CAP_APPUNTAMENTO", required = true, nillable = true)
    protected String capappuntamento;

    /**
     * Recupera il valore della proprieta codice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICE() {
        return codice;
    }

    /**
     * Imposta il valore della proprieta codice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICE(String value) {
        this.codice = value;
    }

    /**
     * Recupera il valore della proprieta descrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIZIONE() {
        return descrizione;
    }

    /**
     * Imposta il valore della proprieta descrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIZIONE(String value) {
        this.descrizione = value;
    }

    /**
     * Recupera il valore della proprieta importoprestazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPORTOPRESTAZIONE() {
        return importoprestazione;
    }

    /**
     * Imposta il valore della proprieta importoprestazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPORTOPRESTAZIONE(String value) {
        this.importoprestazione = value;
    }

    /**
     * Recupera il valore della proprieta dataappuntamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAAPPUNTAMENTO() {
        return dataappuntamento;
    }

    /**
     * Imposta il valore della proprieta dataappuntamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAAPPUNTAMENTO(String value) {
        this.dataappuntamento = value;
    }

    /**
     * Recupera il valore della proprieta oraappuntamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORAAPPUNTAMENTO() {
        return oraappuntamento;
    }

    /**
     * Imposta il valore della proprieta oraappuntamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORAAPPUNTAMENTO(String value) {
        this.oraappuntamento = value;
    }

    /**
     * Recupera il valore della proprieta luogoappuntamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLUOGOAPPUNTAMENTO() {
        return luogoappuntamento;
    }

    /**
     * Imposta il valore della proprieta luogoappuntamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLUOGOAPPUNTAMENTO(String value) {
        this.luogoappuntamento = value;
    }

    /**
     * Recupera il valore della proprieta noteappuntamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTEAPPUNTAMENTO() {
        return noteappuntamento;
    }

    /**
     * Imposta il valore della proprieta noteappuntamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTEAPPUNTAMENTO(String value) {
        this.noteappuntamento = value;
    }

    /**
     * Recupera il valore della proprieta comuneappuntamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMUNEAPPUNTAMENTO() {
        return comuneappuntamento;
    }

    /**
     * Imposta il valore della proprieta comuneappuntamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMUNEAPPUNTAMENTO(String value) {
        this.comuneappuntamento = value;
    }

    /**
     * Recupera il valore della proprieta indirizzoappuntamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDIRIZZOAPPUNTAMENTO() {
        return indirizzoappuntamento;
    }

    /**
     * Imposta il valore della proprieta indirizzoappuntamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDIRIZZOAPPUNTAMENTO(String value) {
        this.indirizzoappuntamento = value;
    }

    /**
     * Recupera il valore della proprieta provinciaappuntamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVINCIAAPPUNTAMENTO() {
        return provinciaappuntamento;
    }

    /**
     * Imposta il valore della proprieta provinciaappuntamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVINCIAAPPUNTAMENTO(String value) {
        this.provinciaappuntamento = value;
    }

    /**
     * Recupera il valore della proprieta capappuntamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPAPPUNTAMENTO() {
        return capappuntamento;
    }

    /**
     * Imposta il valore della proprieta capappuntamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPAPPUNTAMENTO(String value) {
        this.capappuntamento = value;
    }

}
