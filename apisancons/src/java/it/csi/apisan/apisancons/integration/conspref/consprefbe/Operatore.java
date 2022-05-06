/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisancons.integration.conspref.consprefbe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per operatore complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="operatore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoOperatore" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codiceOperatore" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operatore", propOrder = {
    "tipoOperatore",
    "codiceOperatore"
})
public class Operatore {

    @XmlElement(required = true)
    protected String tipoOperatore;
    @XmlElement(required = true)
    protected String codiceOperatore;

    /**
     * Recupera il valore della proprietà tipoOperatore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOperatore() {
        return tipoOperatore;
    }

    /**
     * Imposta il valore della proprietà tipoOperatore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOperatore(String value) {
        this.tipoOperatore = value;
    }

    /**
     * Recupera il valore della proprietà codiceOperatore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceOperatore() {
        return codiceOperatore;
    }

    /**
     * Imposta il valore della proprietà codiceOperatore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceOperatore(String value) {
        this.codiceOperatore = value;
    }

}
