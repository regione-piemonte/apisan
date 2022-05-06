/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.arruolamento.dma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per fascicoloArruolabile complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="fascicoloArruolabile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiceRisposta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="risposta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dettaglioRisposta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fascicoloArruolabile", propOrder = {
    "codiceRisposta",
    "risposta",
    "dettaglioRisposta"
})
public class FascicoloArruolabile {

    @XmlElement(required = true)
    protected String codiceRisposta;
    @XmlElement(required = true)
    protected String risposta;
    @XmlElement(required = true)
    protected String dettaglioRisposta;

    /**
     * Recupera il valore della proprietà codiceRisposta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceRisposta() {
        return codiceRisposta;
    }

    /**
     * Imposta il valore della proprietà codiceRisposta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceRisposta(String value) {
        this.codiceRisposta = value;
    }

    /**
     * Recupera il valore della proprietà risposta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRisposta() {
        return risposta;
    }

    /**
     * Imposta il valore della proprietà risposta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRisposta(String value) {
        this.risposta = value;
    }

    /**
     * Recupera il valore della proprietà dettaglioRisposta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDettaglioRisposta() {
        return dettaglioRisposta;
    }

    /**
     * Imposta il valore della proprietà dettaglioRisposta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDettaglioRisposta(String value) {
        this.dettaglioRisposta = value;
    }

}
