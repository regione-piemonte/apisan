/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisancons.integration.conspref.consprefbe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import it.csi.apisan.apisancons.integration.conspref.fontecittadino.Fonte;


/**
 * <p>Classe Java per modificaConsensoBe complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="modificaConsensoBe">
 *   &lt;complexContent>
 *     &lt;extension base="{http://consprefbe.csi.it/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="cfCittadino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idAura" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cfDelegato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatore" type="{http://consprefbe.csi.it/}operatore"/>
 *         &lt;element name="fonte" type="{fonteCittadino}fonte"/>
 *         &lt;element name="dataAcquisizione" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="idInformativa" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipoStato" type="{http://consprefbe.csi.it/}tipoStato"/>
 *         &lt;element name="valoreConsenso" type="{http://consprefbe.csi.it/}valoreConsenso" minOccurs="0"/>
 *         &lt;element name="asr" type="{http://consprefbe.csi.it/}tipoASR"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificaConsensoBe", propOrder = {
    "cfCittadino",
    "idAura",
    "cfDelegato",
    "operatore",
    "fonte",
    "dataAcquisizione",
    "idInformativa",
    "tipoStato",
    "valoreConsenso",
    "asr"
})
public class ModificaConsensoBe
    extends ServiceRequest
{

    @XmlElement(required = true)
    protected String cfCittadino;
    @XmlElement(required = true)
    protected String idAura;
    protected String cfDelegato;
    @XmlElement(required = true)
    protected Operatore operatore;
    @XmlElement(required = true)
    protected Fonte fonte;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAcquisizione;
    protected int idInformativa;
    @XmlElement(required = true)
    protected TipoStato tipoStato;
    protected ValoreConsenso valoreConsenso;
    @XmlElement(required = true)
    protected TipoASR asr;

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
     * Recupera il valore della proprietà idAura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAura() {
        return idAura;
    }

    /**
     * Imposta il valore della proprietà idAura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAura(String value) {
        this.idAura = value;
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
     * Recupera il valore della proprietà dataAcquisizione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAcquisizione() {
        return dataAcquisizione;
    }

    /**
     * Imposta il valore della proprietà dataAcquisizione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAcquisizione(XMLGregorianCalendar value) {
        this.dataAcquisizione = value;
    }

    /**
     * Recupera il valore della proprietà idInformativa.
     * 
     */
    public int getIdInformativa() {
        return idInformativa;
    }

    /**
     * Imposta il valore della proprietà idInformativa.
     * 
     */
    public void setIdInformativa(int value) {
        this.idInformativa = value;
    }

    /**
     * Recupera il valore della proprietà tipoStato.
     * 
     * @return
     *     possible object is
     *     {@link TipoStato }
     *     
     */
    public TipoStato getTipoStato() {
        return tipoStato;
    }

    /**
     * Imposta il valore della proprietà tipoStato.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoStato }
     *     
     */
    public void setTipoStato(TipoStato value) {
        this.tipoStato = value;
    }

    /**
     * Recupera il valore della proprietà valoreConsenso.
     * 
     * @return
     *     possible object is
     *     {@link ValoreConsenso }
     *     
     */
    public ValoreConsenso getValoreConsenso() {
        return valoreConsenso;
    }

    /**
     * Imposta il valore della proprietà valoreConsenso.
     * 
     * @param value
     *     allowed object is
     *     {@link ValoreConsenso }
     *     
     */
    public void setValoreConsenso(ValoreConsenso value) {
        this.valoreConsenso = value;
    }

    /**
     * Recupera il valore della proprietà asr.
     * 
     * @return
     *     possible object is
     *     {@link TipoASR }
     *     
     */
    public TipoASR getAsr() {
        return asr;
    }

    /**
     * Imposta il valore della proprietà asr.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoASR }
     *     
     */
    public void setAsr(TipoASR value) {
        this.asr = value;
    }

}
