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
 * <p>Classe Java per funzioneType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="funzioneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiceFunzionalita" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descrizioneFunzionalita" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descrizioneGruppo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "funzioneType", propOrder = {
    "codiceFunzionalita",
    "descrizioneFunzionalita",
    "descrizioneGruppo"
})
public class FunzioneType {

    @XmlElement(required = true)
    protected String codiceFunzionalita;
    @XmlElement(required = true)
    protected String descrizioneFunzionalita;
    @XmlElement(required = true)
    protected String descrizioneGruppo;

    /**
     * Recupera il valore della proprietà codiceFunzionalita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFunzionalita() {
        return codiceFunzionalita;
    }

    /**
     * Imposta il valore della proprietà codiceFunzionalita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFunzionalita(String value) {
        this.codiceFunzionalita = value;
    }

    /**
     * Recupera il valore della proprietà descrizioneFunzionalita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneFunzionalita() {
        return descrizioneFunzionalita;
    }

    /**
     * Imposta il valore della proprietà descrizioneFunzionalita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneFunzionalita(String value) {
        this.descrizioneFunzionalita = value;
    }

    /**
     * Recupera il valore della proprietà descrizioneGruppo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneGruppo() {
        return descrizioneGruppo;
    }

    /**
     * Imposta il valore della proprietà descrizioneGruppo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneGruppo(String value) {
        this.descrizioneGruppo = value;
    }

}
