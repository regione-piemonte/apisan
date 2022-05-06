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
 * <p>Classe Java per Prestazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Prestazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODICE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCRIZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATA_APPUNTAMENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORA_APPUNTAMENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOTE_APPUNTAMENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COMUNE_APPUNTAMENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INDIRIZZO_APPUNTAMENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROVINCIA_APPUNTAMENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAP_APPUNTAMENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prestazione", propOrder = {
    "codice",
    "descrizione",
    "dataappuntamento",
    "oraappuntamento",
    "noteappuntamento",
    "comuneappuntamento",
    "indirizzoappuntamento",
    "provinciaappuntamento",
    "capappuntamento"
})
public class Prestazione {

    @XmlElement(name = "CODICE")
    protected String codice;
    @XmlElement(name = "DESCRIZIONE")
    protected String descrizione;
    @XmlElement(name = "DATA_APPUNTAMENTO")
    protected String dataappuntamento;
    @XmlElement(name = "ORA_APPUNTAMENTO")
    protected String oraappuntamento;
    @XmlElement(name = "NOTE_APPUNTAMENTO")
    protected String noteappuntamento;
    @XmlElement(name = "COMUNE_APPUNTAMENTO")
    protected String comuneappuntamento;
    @XmlElement(name = "INDIRIZZO_APPUNTAMENTO")
    protected String indirizzoappuntamento;
    @XmlElement(name = "PROVINCIA_APPUNTAMENTO")
    protected String provinciaappuntamento;
    @XmlElement(name = "CAP_APPUNTAMENTO")
    protected String capappuntamento;

    /**
     * Recupera il valore della proprietà codice.
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
     * Imposta il valore della proprietà codice.
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
     * Recupera il valore della proprietà descrizione.
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
     * Imposta il valore della proprietà descrizione.
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
     * Recupera il valore della proprietà dataappuntamento.
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
     * Imposta il valore della proprietà dataappuntamento.
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
     * Recupera il valore della proprietà oraappuntamento.
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
     * Imposta il valore della proprietà oraappuntamento.
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
     * Recupera il valore della proprietà noteappuntamento.
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
     * Imposta il valore della proprietà noteappuntamento.
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
     * Recupera il valore della proprietà comuneappuntamento.
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
     * Imposta il valore della proprietà comuneappuntamento.
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
     * Recupera il valore della proprietà indirizzoappuntamento.
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
     * Imposta il valore della proprietà indirizzoappuntamento.
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
     * Recupera il valore della proprietà provinciaappuntamento.
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
     * Imposta il valore della proprietà provinciaappuntamento.
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
     * Recupera il valore della proprietà capappuntamento.
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
     * Imposta il valore della proprietà capappuntamento.
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
