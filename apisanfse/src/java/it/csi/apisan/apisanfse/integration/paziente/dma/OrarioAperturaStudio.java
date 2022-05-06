/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.paziente.dma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per orarioAperturaStudio complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="orarioAperturaStudio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orarioFine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orarioInizio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orarioAperturaStudio", propOrder = {
    "nota",
    "orarioFine",
    "orarioInizio"
})
public class OrarioAperturaStudio {

    protected String nota;
    protected String orarioFine;
    protected String orarioInizio;

    /**
     * Recupera il valore della proprietà nota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNota() {
        return nota;
    }

    /**
     * Imposta il valore della proprietà nota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNota(String value) {
        this.nota = value;
    }

    /**
     * Recupera il valore della proprietà orarioFine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrarioFine() {
        return orarioFine;
    }

    /**
     * Imposta il valore della proprietà orarioFine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrarioFine(String value) {
        this.orarioFine = value;
    }

    /**
     * Recupera il valore della proprietà orarioInizio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrarioInizio() {
        return orarioInizio;
    }

    /**
     * Imposta il valore della proprietà orarioInizio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrarioInizio(String value) {
        this.orarioInizio = value;
    }

}
