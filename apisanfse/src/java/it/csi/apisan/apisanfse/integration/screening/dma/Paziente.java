/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.screening.dma;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="codiceFiscaleMMG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cognome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comuneDiNascita" type="{http://dma.csi.it/}comuneDiNascita" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}consenso" minOccurs="0"/>
 *         &lt;element name="dataDecesso" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataDiNascita" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataRiconduzione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deleghe" type="{http://dma.csi.it/}delega" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="flag_registry_incarico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idAsr" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idAura" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idIlec" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idIrec" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idPazienteRicondotto" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "codiceFiscaleMMG",
    "cognome",
    "comuneDiNascita",
    "consenso",
    "dataDecesso",
    "dataDiNascita",
    "dataRiconduzione",
    "deleghe",
    "flagRegistryIncarico",
    "idAsr",
    "idAura",
    "idIlec",
    "idIrec",
    "idPazienteRicondotto",
    "mailPerAccessoDMA",
    "nome",
    "sesso",
    "statoDiNascita"
})
@XmlSeeAlso({
    PazienteScreening.class
})
public class Paziente {

    protected String codiceFiscale;
    protected String codiceFiscaleMMG;
    protected String cognome;
    protected ComuneDiNascita comuneDiNascita;
    protected Consenso consenso;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDecesso;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDiNascita;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataRiconduzione;
    @XmlElement(nillable = true)
    protected List<Delega> deleghe;
    @XmlElement(name = "flag_registry_incarico")
    protected String flagRegistryIncarico;
    protected Long idAsr;
    protected Long idAura;
    protected Long idIlec;
    protected Long idIrec;
    protected Long idPazienteRicondotto;
    protected SiNo mailPerAccessoDMA;
    protected String nome;
    protected Sesso sesso;
    protected StatoDiNascita statoDiNascita;

    /**
     * Recupera il valore della proprietà codiceFiscale.
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
     * Imposta il valore della proprietà codiceFiscale.
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
     * Recupera il valore della proprietà codiceFiscaleMMG.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscaleMMG() {
        return codiceFiscaleMMG;
    }

    /**
     * Imposta il valore della proprietà codiceFiscaleMMG.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscaleMMG(String value) {
        this.codiceFiscaleMMG = value;
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
     * Recupera il valore della proprietà comuneDiNascita.
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
     * Imposta il valore della proprietà comuneDiNascita.
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
     * Recupera il valore della proprietà consenso.
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
     * Imposta il valore della proprietà consenso.
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
     * Recupera il valore della proprietà dataDecesso.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDecesso() {
        return dataDecesso;
    }

    /**
     * Imposta il valore della proprietà dataDecesso.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDecesso(XMLGregorianCalendar value) {
        this.dataDecesso = value;
    }

    /**
     * Recupera il valore della proprietà dataDiNascita.
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
     * Imposta il valore della proprietà dataDiNascita.
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
     * Recupera il valore della proprietà dataRiconduzione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRiconduzione() {
        return dataRiconduzione;
    }

    /**
     * Imposta il valore della proprietà dataRiconduzione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRiconduzione(XMLGregorianCalendar value) {
        this.dataRiconduzione = value;
    }

    /**
     * Gets the value of the deleghe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleghe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeleghe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Delega }
     * 
     * 
     */
    public List<Delega> getDeleghe() {
        if (deleghe == null) {
            deleghe = new ArrayList<Delega>();
        }
        return this.deleghe;
    }

    /**
     * Recupera il valore della proprietà flagRegistryIncarico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagRegistryIncarico() {
        return flagRegistryIncarico;
    }

    /**
     * Imposta il valore della proprietà flagRegistryIncarico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagRegistryIncarico(String value) {
        this.flagRegistryIncarico = value;
    }

    /**
     * Recupera il valore della proprietà idAsr.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAsr() {
        return idAsr;
    }

    /**
     * Imposta il valore della proprietà idAsr.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAsr(Long value) {
        this.idAsr = value;
    }

    /**
     * Recupera il valore della proprietà idAura.
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
     * Imposta il valore della proprietà idAura.
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
     * Recupera il valore della proprietà idIlec.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdIlec() {
        return idIlec;
    }

    /**
     * Imposta il valore della proprietà idIlec.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdIlec(Long value) {
        this.idIlec = value;
    }

    /**
     * Recupera il valore della proprietà idIrec.
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
     * Imposta il valore della proprietà idIrec.
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
     * Recupera il valore della proprietà idPazienteRicondotto.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdPazienteRicondotto() {
        return idPazienteRicondotto;
    }

    /**
     * Imposta il valore della proprietà idPazienteRicondotto.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdPazienteRicondotto(Long value) {
        this.idPazienteRicondotto = value;
    }

    /**
     * Recupera il valore della proprietà mailPerAccessoDMA.
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
     * Imposta il valore della proprietà mailPerAccessoDMA.
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
     * Recupera il valore della proprietà sesso.
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
     * Imposta il valore della proprietà sesso.
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
     * Recupera il valore della proprietà statoDiNascita.
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
     * Imposta il valore della proprietà statoDiNascita.
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
