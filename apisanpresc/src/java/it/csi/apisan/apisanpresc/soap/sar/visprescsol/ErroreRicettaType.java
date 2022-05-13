/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.sar.visprescsol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per erroreRicettaType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="erroreRicettaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codEsito" type="{http://tipodati.xsd.dem.sanita.finanze.it}codEsitoType"/>
 *         &lt;element name="esito" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="progPresc" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="tipoErrore" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "erroreRicettaType", propOrder = {
    "codEsito",
    "esito",
    "progPresc",
    "tipoErrore"
})
public class ErroreRicettaType {

    @XmlElement(required = true)
    protected String codEsito;
    protected String esito;
    protected String progPresc;
    protected String tipoErrore;

    /**
     * Recupera il valore della property codEsito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEsito() {
        return codEsito;
    }

    /**
     * Imposta il valore della property codEsito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEsito(String value) {
        this.codEsito = value;
    }

    /**
     * Recupera il valore della property esito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsito() {
        return esito;
    }

    /**
     * Imposta il valore della property esito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsito(String value) {
        this.esito = value;
    }

    /**
     * Recupera il valore della property progPresc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgPresc() {
        return progPresc;
    }

    /**
     * Imposta il valore della property progPresc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgPresc(String value) {
        this.progPresc = value;
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
