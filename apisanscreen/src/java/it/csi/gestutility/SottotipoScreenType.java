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
 * <p>Classe Java per SottotipoScreenType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SottotipoScreenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idSottotipoScreen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descSottotipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idTipoScreen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SottotipoScreenType", propOrder = {
    "idSottotipoScreen",
    "descSottotipo",
    "idTipoScreen"
})
public class SottotipoScreenType {

    protected int idSottotipoScreen;
    @XmlElement(required = true)
    protected String descSottotipo;
    protected int idTipoScreen;

    /**
     * Recupera il valore della proprietà idSottotipoScreen.
     * 
     */
    public int getIdSottotipoScreen() {
        return idSottotipoScreen;
    }

    /**
     * Imposta il valore della proprietà idSottotipoScreen.
     * 
     */
    public void setIdSottotipoScreen(int value) {
        this.idSottotipoScreen = value;
    }

    /**
     * Recupera il valore della proprietà descSottotipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescSottotipo() {
        return descSottotipo;
    }

    /**
     * Imposta il valore della proprietà descSottotipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescSottotipo(String value) {
        this.descSottotipo = value;
    }

    /**
     * Recupera il valore della proprietà idTipoScreen.
     * 
     */
    public int getIdTipoScreen() {
        return idTipoScreen;
    }

    /**
     * Imposta il valore della proprietà idTipoScreen.
     * 
     */
    public void setIdTipoScreen(int value) {
        this.idTipoScreen = value;
    }

}
