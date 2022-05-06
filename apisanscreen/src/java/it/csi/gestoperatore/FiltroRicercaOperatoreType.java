/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestoperatore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FiltroRicercaOperatoreType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FiltroRicercaOperatoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idUtente" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codDipartimento" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codAzienda" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nominativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codOperatore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FiltroRicercaOperatoreType", propOrder = {
    "idUtente",
    "codDipartimento",
    "codAzienda",
    "nominativo",
    "codFiscale",
    "tipo",
    "codOperatore"
})
public class FiltroRicercaOperatoreType {

    protected Long idUtente;
    protected Long codDipartimento;
    protected Long codAzienda;
    protected String nominativo;
    protected String codFiscale;
    protected String tipo;
    protected String codOperatore;

    /**
     * Recupera il valore della proprietà idUtente.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdUtente() {
        return idUtente;
    }

    /**
     * Imposta il valore della proprietà idUtente.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdUtente(Long value) {
        this.idUtente = value;
    }

    /**
     * Recupera il valore della proprietà codDipartimento.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodDipartimento() {
        return codDipartimento;
    }

    /**
     * Imposta il valore della proprietà codDipartimento.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodDipartimento(Long value) {
        this.codDipartimento = value;
    }

    /**
     * Recupera il valore della proprietà codAzienda.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodAzienda() {
        return codAzienda;
    }

    /**
     * Imposta il valore della proprietà codAzienda.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodAzienda(Long value) {
        this.codAzienda = value;
    }

    /**
     * Recupera il valore della proprietà nominativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNominativo() {
        return nominativo;
    }

    /**
     * Imposta il valore della proprietà nominativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNominativo(String value) {
        this.nominativo = value;
    }

    /**
     * Recupera il valore della proprietà codFiscale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodFiscale() {
        return codFiscale;
    }

    /**
     * Imposta il valore della proprietà codFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodFiscale(String value) {
        this.codFiscale = value;
    }

    /**
     * Recupera il valore della proprietà tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Imposta il valore della proprietà tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Recupera il valore della proprietà codOperatore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodOperatore() {
        return codOperatore;
    }

    /**
     * Imposta il valore della proprietà codOperatore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodOperatore(String value) {
        this.codOperatore = value;
    }

}
