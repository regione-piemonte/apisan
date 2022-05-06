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
 * <p>Classe Java per TipoCritAssUoIiLivType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TipoCritAssUoIiLivType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pkIdCriterio" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="desCriterio" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "TipoCritAssUoIiLivType", propOrder = {
    "pkIdCriterio",
    "desCriterio",
    "valido"
})
public class TipoCritAssUoIiLivType {

    protected long pkIdCriterio;
    @XmlElement(required = true)
    protected String desCriterio;
    @XmlElement(required = true)
    protected String valido;

    /**
     * Recupera il valore della proprietà pkIdCriterio.
     * 
     */
    public long getPkIdCriterio() {
        return pkIdCriterio;
    }

    /**
     * Imposta il valore della proprietà pkIdCriterio.
     * 
     */
    public void setPkIdCriterio(long value) {
        this.pkIdCriterio = value;
    }

    /**
     * Recupera il valore della proprietà desCriterio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesCriterio() {
        return desCriterio;
    }

    /**
     * Imposta il valore della proprietà desCriterio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesCriterio(String value) {
        this.desCriterio = value;
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
