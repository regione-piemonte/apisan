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
 * <p>Classe Java per TipoPrelievoUoType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TipoPrelievoUoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pkTipoPrelUo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="desTipoPrelUo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "TipoPrelievoUoType", propOrder = {
    "pkTipoPrelUo",
    "desTipoPrelUo",
    "valido"
})
public class TipoPrelievoUoType {

    protected int pkTipoPrelUo;
    @XmlElement(required = true)
    protected String desTipoPrelUo;
    @XmlElement(required = true)
    protected String valido;

    /**
     * Recupera il valore della proprietà pkTipoPrelUo.
     * 
     */
    public int getPkTipoPrelUo() {
        return pkTipoPrelUo;
    }

    /**
     * Imposta il valore della proprietà pkTipoPrelUo.
     * 
     */
    public void setPkTipoPrelUo(int value) {
        this.pkTipoPrelUo = value;
    }

    /**
     * Recupera il valore della proprietà desTipoPrelUo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesTipoPrelUo() {
        return desTipoPrelUo;
    }

    /**
     * Imposta il valore della proprietà desTipoPrelUo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesTipoPrelUo(String value) {
        this.desTipoPrelUo = value;
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
