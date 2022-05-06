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
 * <p>Classe Java per TipoSitUOType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TipoSitUOType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pkTipoSituazUo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="desTipoSituazUo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoSitUOType", propOrder = {
    "pkTipoSituazUo",
    "desTipoSituazUo",
    "valido"
})
public class TipoSitUOType {

    @XmlElement(required = true)
    protected String pkTipoSituazUo;
    @XmlElement(required = true)
    protected String desTipoSituazUo;
    @XmlElement(required = true)
    protected String valido;

    /**
     * Recupera il valore della proprietà pkTipoSituazUo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkTipoSituazUo() {
        return pkTipoSituazUo;
    }

    /**
     * Imposta il valore della proprietà pkTipoSituazUo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkTipoSituazUo(String value) {
        this.pkTipoSituazUo = value;
    }

    /**
     * Recupera il valore della proprietà desTipoSituazUo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesTipoSituazUo() {
        return desTipoSituazUo;
    }

    /**
     * Imposta il valore della proprietà desTipoSituazUo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesTipoSituazUo(String value) {
        this.desTipoSituazUo = value;
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
