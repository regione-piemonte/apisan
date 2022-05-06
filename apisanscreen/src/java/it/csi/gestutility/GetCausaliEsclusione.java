/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestutility;

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
 *         &lt;element name="tipoScreening" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sottotipoScreening" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "tipoScreening",
    "sottotipoScreening"
})
@XmlRootElement(name = "getCausaliEsclusione")
public class GetCausaliEsclusione {

    @XmlElement(required = true)
    protected String tipoScreening;
    @XmlElement(required = true)
    protected String sottotipoScreening;

    /**
     * Recupera il valore della proprietà tipoScreening.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoScreening() {
        return tipoScreening;
    }

    /**
     * Imposta il valore della proprietà tipoScreening.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoScreening(String value) {
        this.tipoScreening = value;
    }

    /**
     * Recupera il valore della proprietà sottotipoScreening.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSottotipoScreening() {
        return sottotipoScreening;
    }

    /**
     * Imposta il valore della proprietà sottotipoScreening.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSottotipoScreening(String value) {
        this.sottotipoScreening = value;
    }

}
