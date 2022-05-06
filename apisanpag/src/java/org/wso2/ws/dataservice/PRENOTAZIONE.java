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
 * <p>Classe Java per PRENOTAZIONE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PRENOTAZIONE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUMERO_PRATICA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NUMERO_PRATICA_ALTERNATIVO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODICE_SPECIALITA_EROGATA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IMPORTO_DA_PAGARE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IMPORTO_PAGATO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://ws.wso2.org/dataservice}ELENCO_PRESTAZIONI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRENOTAZIONE", propOrder = {
    "numeropratica",
    "numeropraticaalternativo",
    "codicespecialitaerogata",
    "importodapagare",
    "importopagato",
    "elencoprestazioni"
})
public class PRENOTAZIONE {

    @XmlElement(name = "NUMERO_PRATICA", required = true, nillable = true)
    protected String numeropratica;
    @XmlElement(name = "NUMERO_PRATICA_ALTERNATIVO", required = true, nillable = true)
    protected String numeropraticaalternativo;
    @XmlElement(name = "CODICE_SPECIALITA_EROGATA", required = true, nillable = true)
    protected String codicespecialitaerogata;
    @XmlElement(name = "IMPORTO_DA_PAGARE", required = true, nillable = true)
    protected String importodapagare;
    @XmlElement(name = "IMPORTO_PAGATO", required = true, nillable = true)
    protected String importopagato;
    @XmlElement(name = "ELENCO_PRESTAZIONI", required = true)
    protected ELENCOPRESTAZIONI elencoprestazioni;

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
     * Recupera il valore della proprieta numeropraticaalternativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROPRATICAALTERNATIVO() {
        return numeropraticaalternativo;
    }

    /**
     * Imposta il valore della proprieta numeropraticaalternativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROPRATICAALTERNATIVO(String value) {
        this.numeropraticaalternativo = value;
    }

    /**
     * Recupera il valore della proprieta codicespecialitaerogata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICESPECIALITAEROGATA() {
        return codicespecialitaerogata;
    }

    /**
     * Imposta il valore della proprieta codicespecialitaerogata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICESPECIALITAEROGATA(String value) {
        this.codicespecialitaerogata = value;
    }

    /**
     * Recupera il valore della proprieta importodapagare.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPORTODAPAGARE() {
        return importodapagare;
    }

    /**
     * Imposta il valore della proprieta importodapagare.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPORTODAPAGARE(String value) {
        this.importodapagare = value;
    }

    /**
     * Recupera il valore della proprieta importopagato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPORTOPAGATO() {
        return importopagato;
    }

    /**
     * Imposta il valore della proprieta importopagato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPORTOPAGATO(String value) {
        this.importopagato = value;
    }

    /**
     * Recupera il valore della proprieta elencoprestazioni.
     * 
     * @return
     *     possible object is
     *     {@link ELENCOPRESTAZIONI }
     *     
     */
    public ELENCOPRESTAZIONI getELENCOPRESTAZIONI() {
        return elencoprestazioni;
    }

    /**
     * Imposta il valore della proprieta elencoprestazioni.
     * 
     * @param value
     *     allowed object is
     *     {@link ELENCOPRESTAZIONI }
     *     
     */
    public void setELENCOPRESTAZIONI(ELENCOPRESTAZIONI value) {
        this.elencoprestazioni = value;
    }

}
