/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.paziente.dma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per presenzaDatiILECRuolo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="presenzaDatiILECRuolo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiceRuolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numDocumenti" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numEpisodi" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "presenzaDatiILECRuolo", propOrder = {
    "codiceRuolo",
    "numDocumenti",
    "numEpisodi"
})
public class PresenzaDatiILECRuolo {

    protected String codiceRuolo;
    protected int numDocumenti;
    protected int numEpisodi;

    /**
     * Recupera il valore della proprietà codiceRuolo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceRuolo() {
        return codiceRuolo;
    }

    /**
     * Imposta il valore della proprietà codiceRuolo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceRuolo(String value) {
        this.codiceRuolo = value;
    }

    /**
     * Recupera il valore della proprietà numDocumenti.
     * 
     */
    public int getNumDocumenti() {
        return numDocumenti;
    }

    /**
     * Imposta il valore della proprietà numDocumenti.
     * 
     */
    public void setNumDocumenti(int value) {
        this.numDocumenti = value;
    }

    /**
     * Recupera il valore della proprietà numEpisodi.
     * 
     */
    public int getNumEpisodi() {
        return numEpisodi;
    }

    /**
     * Imposta il valore della proprietà numEpisodi.
     * 
     */
    public void setNumEpisodi(int value) {
        this.numEpisodi = value;
    }

}
