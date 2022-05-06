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
 * <p>Classe Java per funzioneApplicazioneType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="funzioneApplicazioneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiceFunzionalita" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descrizioneFunzionalita" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descrizioneGruppo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descrizioneSottogruppo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codApplicazione" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ord" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codGruppo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="attiva" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "funzioneApplicazioneType", propOrder = {
    "codiceFunzionalita",
    "descrizioneFunzionalita",
    "descrizioneGruppo",
    "descrizioneSottogruppo",
    "codApplicazione",
    "ord",
    "codGruppo",
    "attiva"
})
public class FunzioneApplicazioneType {

    @XmlElement(required = true)
    protected String codiceFunzionalita;
    @XmlElement(required = true)
    protected String descrizioneFunzionalita;
    @XmlElement(required = true)
    protected String descrizioneGruppo;
    protected String descrizioneSottogruppo;
    protected int codApplicazione;
    protected int ord;
    protected int codGruppo;
    protected boolean attiva;

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

    /**
     * Recupera il valore della proprietà descrizioneSottogruppo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneSottogruppo() {
        return descrizioneSottogruppo;
    }

    /**
     * Imposta il valore della proprietà descrizioneSottogruppo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneSottogruppo(String value) {
        this.descrizioneSottogruppo = value;
    }

    /**
     * Recupera il valore della proprietà codApplicazione.
     * 
     */
    public int getCodApplicazione() {
        return codApplicazione;
    }

    /**
     * Imposta il valore della proprietà codApplicazione.
     * 
     */
    public void setCodApplicazione(int value) {
        this.codApplicazione = value;
    }

    /**
     * Recupera il valore della proprietà ord.
     * 
     */
    public int getOrd() {
        return ord;
    }

    /**
     * Imposta il valore della proprietà ord.
     * 
     */
    public void setOrd(int value) {
        this.ord = value;
    }

    /**
     * Recupera il valore della proprietà codGruppo.
     * 
     */
    public int getCodGruppo() {
        return codGruppo;
    }

    /**
     * Imposta il valore della proprietà codGruppo.
     * 
     */
    public void setCodGruppo(int value) {
        this.codGruppo = value;
    }

    /**
     * Recupera il valore della proprietà attiva.
     * 
     */
    public boolean isAttiva() {
        return attiva;
    }

    /**
     * Imposta il valore della proprietà attiva.
     * 
     */
    public void setAttiva(boolean value) {
        this.attiva = value;
    }

}
