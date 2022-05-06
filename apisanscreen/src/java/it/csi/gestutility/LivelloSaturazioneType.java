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
 * <p>Classe Java per LivelloSaturazioneType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LivelloSaturazioneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idLivelloSaturazione" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="desLivelloSaturazione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codiceColore" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="percentuale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codDipartimento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descDipartimento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codAzienda" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descAzienda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoUO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descTipoUO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LivelloSaturazioneType", propOrder = {
    "idLivelloSaturazione",
    "desLivelloSaturazione",
    "codiceColore",
    "percentuale",
    "codDipartimento",
    "descDipartimento",
    "codAzienda",
    "descAzienda",
    "tipoUO",
    "descTipoUO"
})
public class LivelloSaturazioneType {

    protected int idLivelloSaturazione;
    @XmlElement(required = true)
    protected String desLivelloSaturazione;
    @XmlElement(required = true)
    protected String codiceColore;
    protected int percentuale;
    protected int codDipartimento;
    @XmlElement(required = true)
    protected String descDipartimento;
    protected int codAzienda;
    @XmlElement(required = true)
    protected String descAzienda;
    protected int tipoUO;
    @XmlElement(required = true)
    protected String descTipoUO;

    /**
     * Recupera il valore della proprietà idLivelloSaturazione.
     * 
     */
    public int getIdLivelloSaturazione() {
        return idLivelloSaturazione;
    }

    /**
     * Imposta il valore della proprietà idLivelloSaturazione.
     * 
     */
    public void setIdLivelloSaturazione(int value) {
        this.idLivelloSaturazione = value;
    }

    /**
     * Recupera il valore della proprietà desLivelloSaturazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesLivelloSaturazione() {
        return desLivelloSaturazione;
    }

    /**
     * Imposta il valore della proprietà desLivelloSaturazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesLivelloSaturazione(String value) {
        this.desLivelloSaturazione = value;
    }

    /**
     * Recupera il valore della proprietà codiceColore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceColore() {
        return codiceColore;
    }

    /**
     * Imposta il valore della proprietà codiceColore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceColore(String value) {
        this.codiceColore = value;
    }

    /**
     * Recupera il valore della proprietà percentuale.
     * 
     */
    public int getPercentuale() {
        return percentuale;
    }

    /**
     * Imposta il valore della proprietà percentuale.
     * 
     */
    public void setPercentuale(int value) {
        this.percentuale = value;
    }

    /**
     * Recupera il valore della proprietà codDipartimento.
     * 
     */
    public int getCodDipartimento() {
        return codDipartimento;
    }

    /**
     * Imposta il valore della proprietà codDipartimento.
     * 
     */
    public void setCodDipartimento(int value) {
        this.codDipartimento = value;
    }

    /**
     * Recupera il valore della proprietà descDipartimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescDipartimento() {
        return descDipartimento;
    }

    /**
     * Imposta il valore della proprietà descDipartimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescDipartimento(String value) {
        this.descDipartimento = value;
    }

    /**
     * Recupera il valore della proprietà codAzienda.
     * 
     */
    public int getCodAzienda() {
        return codAzienda;
    }

    /**
     * Imposta il valore della proprietà codAzienda.
     * 
     */
    public void setCodAzienda(int value) {
        this.codAzienda = value;
    }

    /**
     * Recupera il valore della proprietà descAzienda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescAzienda() {
        return descAzienda;
    }

    /**
     * Imposta il valore della proprietà descAzienda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescAzienda(String value) {
        this.descAzienda = value;
    }

    /**
     * Recupera il valore della proprietà tipoUO.
     * 
     */
    public int getTipoUO() {
        return tipoUO;
    }

    /**
     * Imposta il valore della proprietà tipoUO.
     * 
     */
    public void setTipoUO(int value) {
        this.tipoUO = value;
    }

    /**
     * Recupera il valore della proprietà descTipoUO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescTipoUO() {
        return descTipoUO;
    }

    /**
     * Imposta il valore della proprietà descTipoUO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescTipoUO(String value) {
        this.descTipoUO = value;
    }

}
