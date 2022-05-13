/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.sar.visprescsol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per notaType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="notaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="progrPresc" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="codProdPrest" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="tipoAmbulatorio" type="{http://tipodati.xsd.dem.sanita.finanze.it}maxString10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notaType", propOrder = {
    "progrPresc",
    "codProdPrest",
    "tipoAmbulatorio"
})
public class NotaType {

    protected String progrPresc;
    protected String codProdPrest;
    protected String tipoAmbulatorio;

    /**
     * Recupera il valore della property progrPresc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgrPresc() {
        return progrPresc;
    }

    /**
     * Imposta il valore della property progrPresc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgrPresc(String value) {
        this.progrPresc = value;
    }

    /**
     * Recupera il valore della property codProdPrest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodProdPrest() {
        return codProdPrest;
    }

    /**
     * Imposta il valore della property codProdPrest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodProdPrest(String value) {
        this.codProdPrest = value;
    }

    /**
     * Recupera il valore della property tipoAmbulatorio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAmbulatorio() {
        return tipoAmbulatorio;
    }

    /**
     * Imposta il valore della property tipoAmbulatorio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAmbulatorio(String value) {
        this.tipoAmbulatorio = value;
    }

}
