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
 * <p>Classe Java per tipoDistribuzioneType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="tipoDistribuzioneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pkTipoDistribuzione" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descTipoDistribuzione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoDistribuzioneType", propOrder = {
    "pkTipoDistribuzione",
    "descTipoDistribuzione",
    "valido"
})
public class TipoDistribuzioneType {

    protected int pkTipoDistribuzione;
    @XmlElement(required = true)
    protected String descTipoDistribuzione;
    protected String valido;

    /**
     * Recupera il valore della proprietà pkTipoDistribuzione.
     * 
     */
    public int getPkTipoDistribuzione() {
        return pkTipoDistribuzione;
    }

    /**
     * Imposta il valore della proprietà pkTipoDistribuzione.
     * 
     */
    public void setPkTipoDistribuzione(int value) {
        this.pkTipoDistribuzione = value;
    }

    /**
     * Recupera il valore della proprietà descTipoDistribuzione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescTipoDistribuzione() {
        return descTipoDistribuzione;
    }

    /**
     * Imposta il valore della proprietà descTipoDistribuzione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescTipoDistribuzione(String value) {
        this.descTipoDistribuzione = value;
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

}
