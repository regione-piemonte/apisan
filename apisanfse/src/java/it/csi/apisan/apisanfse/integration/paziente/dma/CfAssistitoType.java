/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.paziente.dma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per cfAssistitoType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="cfAssistitoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cfAssistitoType", propOrder = {
    "attivo",
    "cf"
})
public class CfAssistitoType {

    protected String attivo;
    protected String cf;

    /**
     * Recupera il valore della proprietà attivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttivo() {
        return attivo;
    }

    /**
     * Imposta il valore della proprietà attivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttivo(String value) {
        this.attivo = value;
    }

    /**
     * Recupera il valore della proprietà cf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCf() {
        return cf;
    }

    /**
     * Imposta il valore della proprietà cf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCf(String value) {
        this.cf = value;
    }

}
