/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestutility;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TipoAttivitaUOType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TipoAttivitaUOType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pkTipoAttUo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="desTipoAttUo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "TipoAttivitaUOType", propOrder = {
    "pkTipoAttUo",
    "desTipoAttUo",
    "valido"
})
public class TipoAttivitaUOType {

    protected Integer pkTipoAttUo;
    protected String desTipoAttUo;
    protected String valido;

    /**
     * Recupera il valore della proprietà pkTipoAttUo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPkTipoAttUo() {
        return pkTipoAttUo;
    }

    /**
     * Imposta il valore della proprietà pkTipoAttUo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPkTipoAttUo(Integer value) {
        this.pkTipoAttUo = value;
    }

    /**
     * Recupera il valore della proprietà desTipoAttUo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesTipoAttUo() {
        return desTipoAttUo;
    }

    /**
     * Imposta il valore della proprietà desTipoAttUo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesTipoAttUo(String value) {
        this.desTipoAttUo = value;
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
