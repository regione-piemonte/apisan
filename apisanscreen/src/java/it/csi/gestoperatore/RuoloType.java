/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestoperatore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ruoloType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ruoloType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiceRuolo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descrizioneRuolo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoRuolo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ruoloType", propOrder = {
    "codiceRuolo",
    "descrizioneRuolo",
    "tipoRuolo"
})
public class RuoloType {

    protected int codiceRuolo;
    @XmlElement(required = true)
    protected String descrizioneRuolo;
    @XmlElement(required = true)
    protected String tipoRuolo;

    /**
     * Recupera il valore della proprietà codiceRuolo.
     * 
     */
    public int getCodiceRuolo() {
        return codiceRuolo;
    }

    /**
     * Imposta il valore della proprietà codiceRuolo.
     * 
     */
    public void setCodiceRuolo(int value) {
        this.codiceRuolo = value;
    }

    /**
     * Recupera il valore della proprietà descrizioneRuolo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneRuolo() {
        return descrizioneRuolo;
    }

    /**
     * Imposta il valore della proprietà descrizioneRuolo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneRuolo(String value) {
        this.descrizioneRuolo = value;
    }

    /**
     * Recupera il valore della proprietà tipoRuolo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRuolo() {
        return tipoRuolo;
    }

    /**
     * Imposta il valore della proprietà tipoRuolo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRuolo(String value) {
        this.tipoRuolo = value;
    }

}
