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
 * <p>Classe Java per StatoType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StatoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idStato" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="descStato" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "StatoType", propOrder = {
    "idStato",
    "descStato",
    "valido"
})
public class StatoType {

    protected long idStato;
    @XmlElement(required = true)
    protected String descStato;
    @XmlElement(required = true)
    protected String valido;

    /**
     * Recupera il valore della proprietà idStato.
     * 
     */
    public long getIdStato() {
        return idStato;
    }

    /**
     * Imposta il valore della proprietà idStato.
     * 
     */
    public void setIdStato(long value) {
        this.idStato = value;
    }

    /**
     * Recupera il valore della proprietà descStato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescStato() {
        return descStato;
    }

    /**
     * Imposta il valore della proprietà descStato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescStato(String value) {
        this.descStato = value;
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
