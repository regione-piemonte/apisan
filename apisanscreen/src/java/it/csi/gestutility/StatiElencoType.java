/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestutility;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per StatiElencoType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StatiElencoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoElenco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descTipoElenco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoScreen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatiElencoType", propOrder = {
    "tipoElenco",
    "descTipoElenco",
    "valido",
    "tipoScreen"
})
public class StatiElencoType {

    @XmlElement(required = true)
    protected String tipoElenco;
    @XmlElement(required = true)
    protected String descTipoElenco;
    @XmlElement(required = true)
    protected String valido;
    @XmlElement(required = true)
    protected String tipoScreen;

    /**
     * Recupera il valore della proprietà tipoElenco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoElenco() {
        return tipoElenco;
    }

    /**
     * Imposta il valore della proprietà tipoElenco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoElenco(String value) {
        this.tipoElenco = value;
    }

    /**
     * Recupera il valore della proprietà descTipoElenco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescTipoElenco() {
        return descTipoElenco;
    }

    /**
     * Imposta il valore della proprietà descTipoElenco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescTipoElenco(String value) {
        this.descTipoElenco = value;
    }

    /**
     * Recupera il valore della proprietà valido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValido() {
        return valido;
    }

    /**
     * Imposta il valore della proprietà valido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValido(String value) {
        this.valido = value;
    }

    /**
     * Recupera il valore della proprietà tipoScreen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoScreen() {
        return tipoScreen;
    }

    /**
     * Imposta il valore della proprietà tipoScreen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoScreen(String value) {
        this.tipoScreen = value;
    }

}
