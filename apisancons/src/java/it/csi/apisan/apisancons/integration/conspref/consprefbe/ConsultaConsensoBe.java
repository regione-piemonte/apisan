/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisancons.integration.conspref.consprefbe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import it.csi.apisan.apisancons.integration.conspref.fontecittadino.Fonte;


/**
 * <p>Classe Java per consultaConsensoBe complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="consultaConsensoBe">
 *   &lt;complexContent>
 *     &lt;extension base="{http://consprefbe.csi.it/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="cfCittadino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cfDelegato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatore" type="{http://consprefbe.csi.it/}operatore" minOccurs="0"/>
 *         &lt;element name="fonte" type="{fonteCittadino}fonte"/>
 *         &lt;element name="codiceTipoConsenso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceSottotipoConsenso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idInformativa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codAsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verificaAura" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaConsensoBe", propOrder = {
    "cfCittadino",
    "cfDelegato",
    "operatore",
    "fonte",
    "codiceTipoConsenso",
    "codiceSottotipoConsenso",
    "idInformativa",
    "codAsr",
    "verificaAura"
})
public class ConsultaConsensoBe
    extends ServiceRequest
{

    @XmlElement(required = true)
    protected String cfCittadino;
    protected String cfDelegato;
    protected Operatore operatore;
    @XmlElement(required = true)
    protected Fonte fonte;
    protected String codiceTipoConsenso;
    protected String codiceSottotipoConsenso;
    protected String idInformativa;
    protected String codAsr;
    protected boolean verificaAura;

    /**
     * Recupera il valore della proprietà cfCittadino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfCittadino() {
        return cfCittadino;
    }

    /**
     * Imposta il valore della proprietà cfCittadino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfCittadino(String value) {
        this.cfCittadino = value;
    }

    /**
     * Recupera il valore della proprietà cfDelegato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfDelegato() {
        return cfDelegato;
    }

    /**
     * Imposta il valore della proprietà cfDelegato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfDelegato(String value) {
        this.cfDelegato = value;
    }

    /**
     * Recupera il valore della proprietà operatore.
     * 
     * @return
     *     possible object is
     *     {@link Operatore }
     *     
     */
    public Operatore getOperatore() {
        return operatore;
    }

    /**
     * Imposta il valore della proprietà operatore.
     * 
     * @param value
     *     allowed object is
     *     {@link Operatore }
     *     
     */
    public void setOperatore(Operatore value) {
        this.operatore = value;
    }

    /**
     * Recupera il valore della proprietà fonte.
     * 
     * @return
     *     possible object is
     *     {@link Fonte }
     *     
     */
    public Fonte getFonte() {
        return fonte;
    }

    /**
     * Imposta il valore della proprietà fonte.
     * 
     * @param value
     *     allowed object is
     *     {@link Fonte }
     *     
     */
    public void setFonte(Fonte value) {
        this.fonte = value;
    }

    /**
     * Recupera il valore della proprietà codiceTipoConsenso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceTipoConsenso() {
        return codiceTipoConsenso;
    }

    /**
     * Imposta il valore della proprietà codiceTipoConsenso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceTipoConsenso(String value) {
        this.codiceTipoConsenso = value;
    }

    /**
     * Recupera il valore della proprietà codiceSottotipoConsenso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceSottotipoConsenso() {
        return codiceSottotipoConsenso;
    }

    /**
     * Imposta il valore della proprietà codiceSottotipoConsenso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceSottotipoConsenso(String value) {
        this.codiceSottotipoConsenso = value;
    }

    /**
     * Recupera il valore della proprietà idInformativa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdInformativa() {
        return idInformativa;
    }

    /**
     * Imposta il valore della proprietà idInformativa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdInformativa(String value) {
        this.idInformativa = value;
    }

    /**
     * Recupera il valore della proprietà codAsr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAsr() {
        return codAsr;
    }

    /**
     * Imposta il valore della proprietà codAsr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAsr(String value) {
        this.codAsr = value;
    }

    /**
     * Recupera il valore della proprietà verificaAura.
     * 
     */
    public boolean isVerificaAura() {
        return verificaAura;
    }

    /**
     * Imposta il valore della proprietà verificaAura.
     * 
     */
    public void setVerificaAura(boolean value) {
        this.verificaAura = value;
    }

}
