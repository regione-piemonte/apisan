/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per errore complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="errore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiceEsito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esitoErrore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fonte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoErrore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "errore", propOrder = {
    "codiceEsito",
    "esitoErrore",
    "fonte",
    "tipoErrore"
})
public class Errore {

    protected String codiceEsito;
    protected String esitoErrore;
    protected String fonte;
    protected String tipoErrore;

    /**
     * Recupera il valore della property codiceEsito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceEsito() {
        return codiceEsito;
    }

    /**
     * Imposta il valore della property codiceEsito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceEsito(String value) {
        this.codiceEsito = value;
    }

    /**
     * Recupera il valore della property esitoErrore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsitoErrore() {
        return esitoErrore;
    }

    /**
     * Imposta il valore della property esitoErrore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsitoErrore(String value) {
        this.esitoErrore = value;
    }

    /**
     * Recupera il valore della property fonte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFonte() {
        return fonte;
    }

    /**
     * Imposta il valore della property fonte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFonte(String value) {
        this.fonte = value;
    }

    /**
     * Recupera il valore della property tipoErrore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoErrore() {
        return tipoErrore;
    }

    /**
     * Imposta il valore della property tipoErrore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoErrore(String value) {
        this.tipoErrore = value;
    }

}
