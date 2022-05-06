/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiceFiscale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codiceFiscaleDelgante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="annoPagamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "codiceFiscale",
    "codiceFiscaleDelgante",
    "annoPagamento"
})
@XmlRootElement(name = "LmsGetTicketPagatiFunc")
public class LmsGetTicketPagatiFunc {

    @XmlElement(required = true, nillable = true)
    protected String codiceFiscale;
    @XmlElement(required = true, nillable = true)
    protected String codiceFiscaleDelgante;
    @XmlElement(required = true, nillable = true)
    protected String annoPagamento;

    /**
     * Recupera il valore della proprieta codiceFiscale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    /**
     * Imposta il valore della proprieta codiceFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscale(String value) {
        this.codiceFiscale = value;
    }

    /**
     * Recupera il valore della proprieta codiceFiscaleDelgante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscaleDelgante() {
        return codiceFiscaleDelgante;
    }

    /**
     * Imposta il valore della proprieta codiceFiscaleDelgante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscaleDelgante(String value) {
        this.codiceFiscaleDelgante = value;
    }

    /**
     * Recupera il valore della proprieta annoPagamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoPagamento() {
        return annoPagamento;
    }

    /**
     * Imposta il valore della proprieta annoPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoPagamento(String value) {
        this.annoPagamento = value;
    }

}
