/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisancons.integration.conspref.consensocittadino;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import it.csi.apisan.apisancons.integration.conspref.fontecittadino.Fonte;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.Informativa;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.Operatore;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.TipoASR;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.TipoStato;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ValoreConsenso;


/**
 * <p>Classe Java per consenso complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="consenso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cfCittadino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cfDelegato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idAura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cognome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataAcquisizione" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="operatore" type="{http://consprefbe.csi.it/}operatore" minOccurs="0"/>
 *         &lt;element name="fonte" type="{fonteCittadino}fonte"/>
 *         &lt;element name="tipoStato" type="{http://consprefbe.csi.it/}tipoStato"/>
 *         &lt;element name="informativa" type="{http://consprefbe.csi.it/}informativa" minOccurs="0"/>
 *         &lt;element name="valoreConsenso" type="{http://consprefbe.csi.it/}valoreConsenso" minOccurs="0"/>
 *         &lt;element name="tipoAsr" type="{http://consprefbe.csi.it/}tipoASR" minOccurs="0"/>
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consenso", propOrder = {
    "cfCittadino",
    "cfDelegato",
    "idAura",
    "nome",
    "cognome",
    "dataAcquisizione",
    "operatore",
    "fonte",
    "tipoStato",
    "informativa",
    "valoreConsenso",
    "tipoAsr",
    "uuid"
})
public class Consenso {

    @XmlElement(required = true)
    protected String cfCittadino;
    protected String cfDelegato;
    protected String idAura;
    protected String nome;
    protected String cognome;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAcquisizione;
    protected Operatore operatore;
    @XmlElement(required = true)
    protected Fonte fonte;
    @XmlElement(required = true)
    protected TipoStato tipoStato;
    protected Informativa informativa;
    protected ValoreConsenso valoreConsenso;
    protected TipoASR tipoAsr;
    protected String uuid;

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
     * Recupera il valore della proprietà nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il valore della proprietà nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Recupera il valore della proprietà cognome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Imposta il valore della proprietà cognome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCognome(String value) {
        this.cognome = value;
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
     * Recupera il valore della proprietà informativa.
     * 
     * @return
     *     possible object is
     *     {@link Informativa }
     *     
     */
    public Informativa getInformativa() {
        return informativa;
    }

    /**
     * Imposta il valore della proprietà informativa.
     * 
     * @param value
     *     allowed object is
     *     {@link Informativa }
     *     
     */
    public void setInformativa(Informativa value) {
        this.informativa = value;
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
     * Recupera il valore della proprietà tipoAsr.
     * 
     * @return
     *     possible object is
     *     {@link TipoASR }
     *     
     */
    public TipoASR getTipoAsr() {
        return tipoAsr;
    }

    /**
     * Imposta il valore della proprietà tipoAsr.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoASR }
     *     
     */
    public void setTipoAsr(TipoASR value) {
        this.tipoAsr = value;
    }

    /**
     * Recupera il valore della proprietà uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Imposta il valore della proprietà uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
