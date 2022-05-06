/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.def.opessanws.opessan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per GiornoApertura complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GiornoApertura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="giorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orari" type="{http://opessan.opessanws.def.csi.it/}FasceOrarie" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiornoApertura", propOrder = {
    "giorno",
    "orari"
})
public class GiornoApertura {

    protected String giorno;
    protected FasceOrarie orari;

    /**
     * Recupera il valore della proprietà giorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiorno() {
        return giorno;
    }

    /**
     * Imposta il valore della proprietà giorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiorno(String value) {
        this.giorno = value;
    }

    /**
     * Recupera il valore della proprietà orari.
     * 
     * @return
     *     possible object is
     *     {@link FasceOrarie }
     *     
     */
    public FasceOrarie getOrari() {
        return orari;
    }

    /**
     * Imposta il valore della proprietà orari.
     * 
     * @param value
     *     allowed object is
     *     {@link FasceOrarie }
     *     
     */
    public void setOrari(FasceOrarie value) {
        this.orari = value;
    }

}
