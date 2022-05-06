/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestoperatore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per operatoreType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="operatoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idUtente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codiceOperatore" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="azienda" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dipartimento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cognome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoOperatore" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="struttura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataEliminazione" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="dataModifica" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="pesoCheck" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataInizioAttivita" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="dataFineAttivita" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="idMsg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataLetturaMsg" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="numeroTelefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesoOperatore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codiceLaboratorioFOBT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aziendaLaboratorioFOBT" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dipartimentoLaboratorioFOBT" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="listaAbilitazioni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codRegione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descrRegione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descrDipartimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descrAzienda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceFiscale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descrLaboratorioFOBT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descrTipoOperatore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operatoreType", propOrder = {
    "idUtente",
    "codiceOperatore",
    "azienda",
    "dipartimento",
    "nome",
    "cognome",
    "tipoOperatore",
    "struttura",
    "ente",
    "dataEliminazione",
    "dataModifica",
    "pesoCheck",
    "dataInizioAttivita",
    "dataFineAttivita",
    "idMsg",
    "dataLetturaMsg",
    "numeroTelefono",
    "pesoOperatore",
    "codiceLaboratorioFOBT",
    "aziendaLaboratorioFOBT",
    "dipartimentoLaboratorioFOBT",
    "listaAbilitazioni",
    "codRegione",
    "descrRegione",
    "descrDipartimento",
    "descrAzienda",
    "codiceFiscale",
    "descrLaboratorioFOBT",
    "descrTipoOperatore"
})
public class OperatoreType {

    protected int idUtente;
    @XmlElement(required = true)
    protected String codiceOperatore;
    protected int azienda;
    protected int dipartimento;
    @XmlElement(required = true)
    protected String nome;
    @XmlElement(required = true)
    protected String cognome;
    @XmlElement(required = true)
    protected String tipoOperatore;
    protected String struttura;
    protected String ente;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataEliminazione;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataModifica;
    protected Integer pesoCheck;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataInizioAttivita;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataFineAttivita;
    protected Integer idMsg;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataLetturaMsg;
    protected String numeroTelefono;
    protected Integer pesoOperatore;
    protected String codiceLaboratorioFOBT;
    protected Integer aziendaLaboratorioFOBT;
    protected Integer dipartimentoLaboratorioFOBT;
    protected String listaAbilitazioni;
    protected String codRegione;
    protected String descrRegione;
    protected String descrDipartimento;
    protected String descrAzienda;
    @XmlElement(required = true)
    protected String codiceFiscale;
    protected String descrLaboratorioFOBT;
    protected String descrTipoOperatore;

    /**
     * Recupera il valore della proprietà idUtente.
     * 
     */
    public int getIdUtente() {
        return idUtente;
    }

    /**
     * Imposta il valore della proprietà idUtente.
     * 
     */
    public void setIdUtente(int value) {
        this.idUtente = value;
    }

    /**
     * Recupera il valore della proprietà codiceOperatore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceOperatore() {
        return codiceOperatore;
    }

    /**
     * Imposta il valore della proprietà codiceOperatore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceOperatore(String value) {
        this.codiceOperatore = value;
    }

    /**
     * Recupera il valore della proprietà azienda.
     * 
     */
    public int getAzienda() {
        return azienda;
    }

    /**
     * Imposta il valore della proprietà azienda.
     * 
     */
    public void setAzienda(int value) {
        this.azienda = value;
    }

    /**
     * Recupera il valore della proprietà dipartimento.
     * 
     */
    public int getDipartimento() {
        return dipartimento;
    }

    /**
     * Imposta il valore della proprietà dipartimento.
     * 
     */
    public void setDipartimento(int value) {
        this.dipartimento = value;
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
     * Recupera il valore della proprietà tipoOperatore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOperatore() {
        return tipoOperatore;
    }

    /**
     * Imposta il valore della proprietà tipoOperatore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOperatore(String value) {
        this.tipoOperatore = value;
    }

    /**
     * Recupera il valore della proprietà struttura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStruttura() {
        return struttura;
    }

    /**
     * Imposta il valore della proprietà struttura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStruttura(String value) {
        this.struttura = value;
    }

    /**
     * Recupera il valore della proprietà ente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnte() {
        return ente;
    }

    /**
     * Imposta il valore della proprietà ente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnte(String value) {
        this.ente = value;
    }

    /**
     * Recupera il valore della proprietà dataEliminazione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEliminazione() {
        return dataEliminazione;
    }

    /**
     * Imposta il valore della proprietà dataEliminazione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEliminazione(XMLGregorianCalendar value) {
        this.dataEliminazione = value;
    }

    /**
     * Recupera il valore della proprietà dataModifica.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataModifica() {
        return dataModifica;
    }

    /**
     * Imposta il valore della proprietà dataModifica.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataModifica(XMLGregorianCalendar value) {
        this.dataModifica = value;
    }

    /**
     * Recupera il valore della proprietà pesoCheck.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPesoCheck() {
        return pesoCheck;
    }

    /**
     * Imposta il valore della proprietà pesoCheck.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPesoCheck(Integer value) {
        this.pesoCheck = value;
    }

    /**
     * Recupera il valore della proprietà dataInizioAttivita.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInizioAttivita() {
        return dataInizioAttivita;
    }

    /**
     * Imposta il valore della proprietà dataInizioAttivita.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInizioAttivita(XMLGregorianCalendar value) {
        this.dataInizioAttivita = value;
    }

    /**
     * Recupera il valore della proprietà dataFineAttivita.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFineAttivita() {
        return dataFineAttivita;
    }

    /**
     * Imposta il valore della proprietà dataFineAttivita.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFineAttivita(XMLGregorianCalendar value) {
        this.dataFineAttivita = value;
    }

    /**
     * Recupera il valore della proprietà idMsg.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdMsg() {
        return idMsg;
    }

    /**
     * Imposta il valore della proprietà idMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdMsg(Integer value) {
        this.idMsg = value;
    }

    /**
     * Recupera il valore della proprietà dataLetturaMsg.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataLetturaMsg() {
        return dataLetturaMsg;
    }

    /**
     * Imposta il valore della proprietà dataLetturaMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataLetturaMsg(XMLGregorianCalendar value) {
        this.dataLetturaMsg = value;
    }

    /**
     * Recupera il valore della proprietà numeroTelefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    /**
     * Imposta il valore della proprietà numeroTelefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTelefono(String value) {
        this.numeroTelefono = value;
    }

    /**
     * Recupera il valore della proprietà pesoOperatore.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPesoOperatore() {
        return pesoOperatore;
    }

    /**
     * Imposta il valore della proprietà pesoOperatore.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPesoOperatore(Integer value) {
        this.pesoOperatore = value;
    }

    /**
     * Recupera il valore della proprietà codiceLaboratorioFOBT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceLaboratorioFOBT() {
        return codiceLaboratorioFOBT;
    }

    /**
     * Imposta il valore della proprietà codiceLaboratorioFOBT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceLaboratorioFOBT(String value) {
        this.codiceLaboratorioFOBT = value;
    }

    /**
     * Recupera il valore della proprietà aziendaLaboratorioFOBT.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAziendaLaboratorioFOBT() {
        return aziendaLaboratorioFOBT;
    }

    /**
     * Imposta il valore della proprietà aziendaLaboratorioFOBT.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAziendaLaboratorioFOBT(Integer value) {
        this.aziendaLaboratorioFOBT = value;
    }

    /**
     * Recupera il valore della proprietà dipartimentoLaboratorioFOBT.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDipartimentoLaboratorioFOBT() {
        return dipartimentoLaboratorioFOBT;
    }

    /**
     * Imposta il valore della proprietà dipartimentoLaboratorioFOBT.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDipartimentoLaboratorioFOBT(Integer value) {
        this.dipartimentoLaboratorioFOBT = value;
    }

    /**
     * Recupera il valore della proprietà listaAbilitazioni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListaAbilitazioni() {
        return listaAbilitazioni;
    }

    /**
     * Imposta il valore della proprietà listaAbilitazioni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListaAbilitazioni(String value) {
        this.listaAbilitazioni = value;
    }

    /**
     * Recupera il valore della proprietà codRegione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRegione() {
        return codRegione;
    }

    /**
     * Imposta il valore della proprietà codRegione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRegione(String value) {
        this.codRegione = value;
    }

    /**
     * Recupera il valore della proprietà descrRegione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrRegione() {
        return descrRegione;
    }

    /**
     * Imposta il valore della proprietà descrRegione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrRegione(String value) {
        this.descrRegione = value;
    }

    /**
     * Recupera il valore della proprietà descrDipartimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrDipartimento() {
        return descrDipartimento;
    }

    /**
     * Imposta il valore della proprietà descrDipartimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrDipartimento(String value) {
        this.descrDipartimento = value;
    }

    /**
     * Recupera il valore della proprietà descrAzienda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrAzienda() {
        return descrAzienda;
    }

    /**
     * Imposta il valore della proprietà descrAzienda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrAzienda(String value) {
        this.descrAzienda = value;
    }

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
     * Recupera il valore della proprietà descrLaboratorioFOBT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrLaboratorioFOBT() {
        return descrLaboratorioFOBT;
    }

    /**
     * Imposta il valore della proprietà descrLaboratorioFOBT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrLaboratorioFOBT(String value) {
        this.descrLaboratorioFOBT = value;
    }

    /**
     * Recupera il valore della proprietà descrTipoOperatore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrTipoOperatore() {
        return descrTipoOperatore;
    }

    /**
     * Imposta il valore della proprietà descrTipoOperatore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrTipoOperatore(String value) {
        this.descrTipoOperatore = value;
    }

}
