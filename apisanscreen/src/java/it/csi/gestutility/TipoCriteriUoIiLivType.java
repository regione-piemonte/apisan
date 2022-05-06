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
 * <p>Classe Java per TipoCriteriUoIiLivType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TipoCriteriUoIiLivType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTipoCriteri" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="desTipoCriteri" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "TipoCriteriUoIiLivType", propOrder = {
    "idTipoCriteri",
    "desTipoCriteri",
    "valido"
})
public class TipoCriteriUoIiLivType {

    protected long idTipoCriteri;
    @XmlElement(required = true)
    protected String desTipoCriteri;
    @XmlElement(required = true)
    protected String valido;

    /**
     * Recupera il valore della proprietà idTipoCriteri.
     * 
     */
    public long getIdTipoCriteri() {
        return idTipoCriteri;
    }

    /**
     * Imposta il valore della proprietà idTipoCriteri.
     * 
     */
    public void setIdTipoCriteri(long value) {
        this.idTipoCriteri = value;
    }

    /**
     * Recupera il valore della proprietà desTipoCriteri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesTipoCriteri() {
        return desTipoCriteri;
    }

    /**
     * Imposta il valore della proprietà desTipoCriteri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesTipoCriteri(String value) {
        this.desTipoCriteri = value;
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
