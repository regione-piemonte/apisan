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
 * <p>Classe Java per TipoScreeningType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TipoScreeningType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTipoScreening" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codTipoScreening" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descrTipoScreening" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoScreeningType", propOrder = {
    "idTipoScreening",
    "codTipoScreening",
    "descrTipoScreening"
})
public class TipoScreeningType {

    protected int idTipoScreening;
    @XmlElement(required = true)
    protected String codTipoScreening;
    @XmlElement(required = true)
    protected String descrTipoScreening;

    /**
     * Recupera il valore della proprietà idTipoScreening.
     * 
     */
    public int getIdTipoScreening() {
        return idTipoScreening;
    }

    /**
     * Imposta il valore della proprietà idTipoScreening.
     * 
     */
    public void setIdTipoScreening(int value) {
        this.idTipoScreening = value;
    }

    /**
     * Recupera il valore della proprietà codTipoScreening.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoScreening() {
        return codTipoScreening;
    }

    /**
     * Imposta il valore della proprietà codTipoScreening.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoScreening(String value) {
        this.codTipoScreening = value;
    }

    /**
     * Recupera il valore della proprietà descrTipoScreening.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrTipoScreening() {
        return descrTipoScreening;
    }

    /**
     * Imposta il valore della proprietà descrTipoScreening.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrTipoScreening(String value) {
        this.descrTipoScreening = value;
    }

}
