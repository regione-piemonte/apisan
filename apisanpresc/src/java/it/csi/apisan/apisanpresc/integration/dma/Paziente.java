/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.integration.dma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per paziente complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="paziente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiceFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cognome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comuneDiNascita" type="{http://dma.csi.it/}comuneDiNascita" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}consenso" minOccurs="0"/>
 *         &lt;element name="dataDiNascita" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idAura" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idIrec" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="mailPerAccessoDMA" type="{http://dma.csi.it/}siNo" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sesso" type="{http://dma.csi.it/}sesso" minOccurs="0"/>
 *         &lt;element name="statoDiNascita" type="{http://dma.csi.it/}statoDiNascita" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paziente", propOrder = {
    "codiceFiscale",
    "cognome",
    "comuneDiNascita",
    "consenso",
    "dataDiNascita",
    "idAura",
    "idIrec",
    "mailPerAccessoDMA",
    "nome",
    "sesso",
    "statoDiNascita"
})
@XmlSeeAlso({
    PazienteOncologico.class,
    PazienteROPVA.class
})
public class Paziente {

    protected String codiceFiscale;
    protected String cognome;
    protected ComuneDiNascita comuneDiNascita;
    protected Consenso consenso;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDiNascita;
    protected Long idAura;
    protected Long idIrec;
    @XmlSchemaType(name = "string")
    protected SiNo mailPerAccessoDMA;
    protected String nome;
    @XmlSchemaType(name = "string")
    protected Sesso sesso;
    protected StatoDiNascita statoDiNascita;

    /**
     * Recupera il valore della property codiceFiscale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    /**
     * Imposta il valore della property codiceFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscale(String value) {
        this.codiceFiscale = value;
    }

    /**
     * Recupera il valore della property cognome.
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
     * Imposta il valore della property cognome.
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
     * Recupera il valore della property comuneDiNascita.
     * 
     * @return
     *     possible object is
     *     {@link ComuneDiNascita }
     *     
     */
    public ComuneDiNascita getComuneDiNascita() {
        return comuneDiNascita;
    }

    /**
     * Imposta il valore della property comuneDiNascita.
     * 
     * @param value
     *     allowed object is
     *     {@link ComuneDiNascita }
     *     
     */
    public void setComuneDiNascita(ComuneDiNascita value) {
        this.comuneDiNascita = value;
    }

    /**
     * Recupera il valore della property consenso.
     * 
     * @return
     *     possible object is
     *     {@link Consenso }
     *     
     */
    public Consenso getConsenso() {
        return consenso;
    }

    /**
     * Imposta il valore della property consenso.
     * 
     * @param value
     *     allowed object is
     *     {@link Consenso }
     *     
     */
    public void setConsenso(Consenso value) {
        this.consenso = value;
    }

    /**
     * Recupera il valore della property dataDiNascita.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDiNascita() {
        return dataDiNascita;
    }

    /**
     * Imposta il valore della property dataDiNascita.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDiNascita(XMLGregorianCalendar value) {
        this.dataDiNascita = value;
    }

    /**
     * Recupera il valore della property idAura.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAura() {
        return idAura;
    }

    /**
     * Imposta il valore della property idAura.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAura(Long value) {
        this.idAura = value;
    }

    /**
     * Recupera il valore della property idIrec.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdIrec() {
        return idIrec;
    }

    /**
     * Imposta il valore della property idIrec.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdIrec(Long value) {
        this.idIrec = value;
    }

    /**
     * Recupera il valore della property mailPerAccessoDMA.
     * 
     * @return
     *     possible object is
     *     {@link SiNo }
     *     
     */
    public SiNo getMailPerAccessoDMA() {
        return mailPerAccessoDMA;
    }

    /**
     * Imposta il valore della property mailPerAccessoDMA.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNo }
     *     
     */
    public void setMailPerAccessoDMA(SiNo value) {
        this.mailPerAccessoDMA = value;
    }

    /**
     * Recupera il valore della property nome.
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
     * Imposta il valore della property nome.
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
     * Recupera il valore della property sesso.
     * 
     * @return
     *     possible object is
     *     {@link Sesso }
     *     
     */
    public Sesso getSesso() {
        return sesso;
    }

    /**
     * Imposta il valore della property sesso.
     * 
     * @param value
     *     allowed object is
     *     {@link Sesso }
     *     
     */
    public void setSesso(Sesso value) {
        this.sesso = value;
    }

    /**
     * Recupera il valore della property statoDiNascita.
     * 
     * @return
     *     possible object is
     *     {@link StatoDiNascita }
     *     
     */
    public StatoDiNascita getStatoDiNascita() {
        return statoDiNascita;
    }

    /**
     * Imposta il valore della property statoDiNascita.
     * 
     * @param value
     *     allowed object is
     *     {@link StatoDiNascita }
     *     
     */
    public void setStatoDiNascita(StatoDiNascita value) {
        this.statoDiNascita = value;
    }

}
