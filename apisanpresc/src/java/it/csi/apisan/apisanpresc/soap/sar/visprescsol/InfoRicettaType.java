/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.sar.visprescsol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per infoRicettaType complex type.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 *
 * <pre>
 * &lt;complexType name="infoRicettaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nre" type="{http://tipodati.xsd.dem.sanita.finanze.it}nreType" minOccurs="0"/>
 *         &lt;element name="cfMedico1" type="{http://tipodati.xsd.dem.sanita.finanze.it}cfMedicoType" minOccurs="0"/>
 *         &lt;element name="cfMedico2" type="{http://tipodati.xsd.dem.sanita.finanze.it}cfMedicoType" minOccurs="0"/>
 *         &lt;element name="codRegione" type="{http://tipodati.xsd.dem.sanita.finanze.it}codRegioneType" minOccurs="0"/>
 *         &lt;element name="codASLAo" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="codStruttura" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="codSpecializzazione" type="{http://tipodati.xsd.dem.sanita.finanze.it}codSpecializzazioneType" minOccurs="0"/>
 *         &lt;element name="testata1" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="testata2" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="tipoRic" type="{http://tipodati.xsd.dem.sanita.finanze.it}tipoRicettaType" minOccurs="0"/>
 *         &lt;element name="codiceAss" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="cognNome" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="indirizzo" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="numTessSasn" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="socNavigaz" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="tipoPrescrizione" type="{http://tipodati.xsd.dem.sanita.finanze.it}tipoPrescType" minOccurs="0"/>
 *         &lt;element name="ricettaInterna" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="codEsenzione" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="nonEsente" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="reddito" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="codDiagnosi" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="descrizioneDiagnosi" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="dataCompilazione" type="{http://tipodati.xsd.dem.sanita.finanze.it}dataOraType" minOccurs="0"/>
 *         &lt;element name="tipoVisita" type="{http://tipodati.xsd.dem.sanita.finanze.it}tipoVisitaType" minOccurs="0"/>
 *         &lt;element name="dispReg" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="provAssistito" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="aslAssistito" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="indicazionePrescr" type="{http://tipodati.xsd.dem.sanita.finanze.it}indicPrescType" minOccurs="0"/>
 *         &lt;element name="altro" type="{http://tipodati.xsd.dem.sanita.finanze.it}indicPrescType" minOccurs="0"/>
 *         &lt;element name="classePriorita" type="{http://tipodati.xsd.dem.sanita.finanze.it}prioritaType" minOccurs="0"/>
 *         &lt;element name="statoEstero" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="istituzCompetente" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="numIdentPers" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="numIdentTess" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="dataNascitaEstero" type="{http://tipodati.xsd.dem.sanita.finanze.it}dataOraType" minOccurs="0"/>
 *         &lt;element name="dataScadTessera" type="{http://tipodati.xsd.dem.sanita.finanze.it}dataOraType" minOccurs="0"/>
 *         &lt;element name="statoProcesso" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="ElencoDettagliPrescrizioni" type="{http://tipodati.xsd.dem.sanita.finanze.it}elencoDettagliPrescrizioniType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoRicettaType", propOrder = {
        "nre",
        "cfMedico1",
        "cfMedico2",
        "nomeMedico1",
        "cognomeMedico1",
        "codRegione",
        "codASLAo",
        "codStruttura",
        "codSpecializzazione",
        "testata1",
        "testata2",
        "tipoRic",
        "codiceAss",
        "cognNome",
        "indirizzo",
        "numTessSasn",
        "socNavigaz",
        "tipoPrescrizione",
        "ricettaInterna",
        "codEsenzione",
        "nonEsente",
        "reddito",
        "codDiagnosi",
        "descrizioneDiagnosi",
        "dataCompilazione",
        "tipoVisita",
        "dispReg",
        "provAssistito",
        "aslAssistito",
        "indicazionePrescr",
        "altro",
        "classePriorita",
        "statoEstero",
        "istituzCompetente",
        "numIdentPers",
        "numIdentTess",
        "dataNascitaEstero",
        "dataScadTessera",
        "statoProcesso",
        "elencoDettagliPrescrizioni",
        "oscuramDati",
        "codiceAutenticazione",
        "descrizioneCodiceDiagnosi"
})
public class InfoRicettaType {

    protected String nre;
    protected String cfMedico1;
    protected String cfMedico2;
    //protected String nomeMedico2;
    //protected String cognomeMedico2;
    protected String nomeMedico1;
    protected String cognomeMedico1;
    protected String codRegione;
    protected String codASLAo;
    protected String codStruttura;
    protected String codSpecializzazione;
    protected String testata1;
    protected String testata2;
    protected String tipoRic;
    protected String codiceAss;
    protected String cognNome;
    protected String indirizzo;
    protected String numTessSasn;
    protected String socNavigaz;
    protected String tipoPrescrizione;
    protected String ricettaInterna;
    protected String codEsenzione;
    protected String nonEsente;
    protected String reddito;
    protected String codDiagnosi;
    protected String descrizioneDiagnosi;
    protected String dataCompilazione;
    protected String tipoVisita;
    protected String dispReg;
    protected String provAssistito;
    protected String aslAssistito;
    protected String indicazionePrescr;
    protected String altro;
    protected String classePriorita;
    protected String statoEstero;
    protected String istituzCompetente;
    protected String numIdentPers;
    protected String numIdentTess;
    protected String dataNascitaEstero;
    protected String dataScadTessera;
    protected String statoProcesso;
    protected String oscuramDati;
    protected String codiceAutenticazione;
    protected String descrizioneCodiceDiagnosi;

    @XmlElement(name = "ElencoDettagliPrescrizioni")
    protected ElencoDettagliPrescrizioniType elencoDettagliPrescrizioni;

    /**
     * Recupera il valore della property nre.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNre() {
        return nre;
    }

    /**
     * Imposta il valore della property nre.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNre(String value) {
        this.nre = value;
    }

    /**
     * Recupera il valore della property cfMedico1.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCfMedico1() {
        return cfMedico1;
    }

    /**
     * Imposta il valore della property cfMedico1.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCfMedico1(String value) {
        this.cfMedico1 = value;
    }

    /**
     * Recupera il valore della property cfMedico2.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCfMedico2() {
        return cfMedico2;
    }

    /**
     * Imposta il valore della property cfMedico2.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCfMedico2(String value) {
        this.cfMedico2 = value;
    }

    /**
     * Recupera il valore della property codRegione.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCodRegione() {
        return codRegione;
    }

    /**
     * Imposta il valore della property codRegione.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCodRegione(String value) {
        this.codRegione = value;
    }

    /**
     * Recupera il valore della property codASLAo.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCodASLAo() {
        return codASLAo;
    }

    /**
     * Imposta il valore della property codASLAo.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCodASLAo(String value) {
        this.codASLAo = value;
    }

    /**
     * Recupera il valore della property codStruttura.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCodStruttura() {
        return codStruttura;
    }

    /**
     * Imposta il valore della property codStruttura.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCodStruttura(String value) {
        this.codStruttura = value;
    }

    /**
     * Recupera il valore della property codSpecializzazione.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCodSpecializzazione() {
        return codSpecializzazione;
    }

    /**
     * Imposta il valore della property codSpecializzazione.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCodSpecializzazione(String value) {
        this.codSpecializzazione = value;
    }

    /**
     * Recupera il valore della property testata1.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTestata1() {
        return testata1;
    }

    /**
     * Imposta il valore della property testata1.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTestata1(String value) {
        this.testata1 = value;
    }

    /**
     * Recupera il valore della property testata2.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTestata2() {
        return testata2;
    }

    /**
     * Imposta il valore della property testata2.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTestata2(String value) {
        this.testata2 = value;
    }

    /**
     * Recupera il valore della property tipoRic.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTipoRic() {
        return tipoRic;
    }

    /**
     * Imposta il valore della property tipoRic.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTipoRic(String value) {
        this.tipoRic = value;
    }

    /**
     * Recupera il valore della property codiceAss.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCodiceAss() {
        return codiceAss;
    }

    /**
     * Imposta il valore della property codiceAss.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCodiceAss(String value) {
        this.codiceAss = value;
    }

    /**
     * Recupera il valore della property cognNome.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCognNome() {
        return cognNome;
    }

    /**
     * Imposta il valore della property cognNome.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCognNome(String value) {
        this.cognNome = value;
    }

    /**
     * Recupera il valore della property indirizzo.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIndirizzo() {
        return indirizzo;
    }

    /**
     * Imposta il valore della property indirizzo.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIndirizzo(String value) {
        this.indirizzo = value;
    }

    /**
     * Recupera il valore della property numTessSasn.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNumTessSasn() {
        return numTessSasn;
    }

    /**
     * Imposta il valore della property numTessSasn.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNumTessSasn(String value) {
        this.numTessSasn = value;
    }

    /**
     * Recupera il valore della property socNavigaz.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSocNavigaz() {
        return socNavigaz;
    }

    /**
     * Imposta il valore della property socNavigaz.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSocNavigaz(String value) {
        this.socNavigaz = value;
    }

    /**
     * Recupera il valore della property tipoPrescrizione.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTipoPrescrizione() {
        return tipoPrescrizione;
    }

    /**
     * Imposta il valore della property tipoPrescrizione.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTipoPrescrizione(String value) {
        this.tipoPrescrizione = value;
    }

    /**
     * Recupera il valore della property ricettaInterna.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRicettaInterna() {
        return ricettaInterna;
    }

    /**
     * Imposta il valore della property ricettaInterna.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRicettaInterna(String value) {
        this.ricettaInterna = value;
    }

    /**
     * Recupera il valore della property codEsenzione.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCodEsenzione() {
        return codEsenzione;
    }

    /**
     * Imposta il valore della property codEsenzione.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCodEsenzione(String value) {
        this.codEsenzione = value;
    }

    /**
     * Recupera il valore della property nonEsente.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNonEsente() {
        return nonEsente;
    }

    /**
     * Imposta il valore della property nonEsente.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNonEsente(String value) {
        this.nonEsente = value;
    }

    /**
     * Recupera il valore della property reddito.
     *
     * @return possible object is
     * {@link String }
     */
    public String getReddito() {
        return reddito;
    }

    /**
     * Imposta il valore della property reddito.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setReddito(String value) {
        this.reddito = value;
    }

    /**
     * Recupera il valore della property codDiagnosi.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCodDiagnosi() {
        return codDiagnosi;
    }

    /**
     * Imposta il valore della property codDiagnosi.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCodDiagnosi(String value) {
        this.codDiagnosi = value;
    }

    /**
     * Recupera il valore della property descrizioneDiagnosi.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescrizioneDiagnosi() {
        return descrizioneDiagnosi;
    }

    /**
     * Imposta il valore della property descrizioneDiagnosi.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescrizioneDiagnosi(String value) {
        this.descrizioneDiagnosi = value;
    }

    /**
     * Recupera il valore della property dataCompilazione.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDataCompilazione() {
        return dataCompilazione;
    }

    /**
     * Imposta il valore della property dataCompilazione.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDataCompilazione(String value) {
        this.dataCompilazione = value;
    }

    /**
     * Recupera il valore della property tipoVisita.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTipoVisita() {
        return tipoVisita;
    }

    /**
     * Imposta il valore della property tipoVisita.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTipoVisita(String value) {
        this.tipoVisita = value;
    }

    /**
     * Recupera il valore della property dispReg.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDispReg() {
        return dispReg;
    }

    /**
     * Imposta il valore della property dispReg.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDispReg(String value) {
        this.dispReg = value;
    }

    /**
     * Recupera il valore della property provAssistito.
     *
     * @return possible object is
     * {@link String }
     */
    public String getProvAssistito() {
        return provAssistito;
    }

    /**
     * Imposta il valore della property provAssistito.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProvAssistito(String value) {
        this.provAssistito = value;
    }

    /**
     * Recupera il valore della property aslAssistito.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAslAssistito() {
        return aslAssistito;
    }

    /**
     * Imposta il valore della property aslAssistito.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAslAssistito(String value) {
        this.aslAssistito = value;
    }

    /**
     * Recupera il valore della property indicazionePrescr.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIndicazionePrescr() {
        return indicazionePrescr;
    }

    /**
     * Imposta il valore della property indicazionePrescr.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIndicazionePrescr(String value) {
        this.indicazionePrescr = value;
    }

    /**
     * Recupera il valore della property altro.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAltro() {
        return altro;
    }

    /**
     * Imposta il valore della property altro.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAltro(String value) {
        this.altro = value;
    }

    /**
     * Recupera il valore della property classePriorita.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClassePriorita() {
        return classePriorita;
    }

    /**
     * Imposta il valore della property classePriorita.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClassePriorita(String value) {
        this.classePriorita = value;
    }

    /**
     * Recupera il valore della property statoEstero.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStatoEstero() {
        return statoEstero;
    }

    /**
     * Imposta il valore della property statoEstero.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStatoEstero(String value) {
        this.statoEstero = value;
    }

    /**
     * Recupera il valore della property istituzCompetente.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIstituzCompetente() {
        return istituzCompetente;
    }

    /**
     * Imposta il valore della property istituzCompetente.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIstituzCompetente(String value) {
        this.istituzCompetente = value;
    }

    /**
     * Recupera il valore della property numIdentPers.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNumIdentPers() {
        return numIdentPers;
    }

    /**
     * Imposta il valore della property numIdentPers.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNumIdentPers(String value) {
        this.numIdentPers = value;
    }

    /**
     * Recupera il valore della property numIdentTess.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNumIdentTess() {
        return numIdentTess;
    }

    /**
     * Imposta il valore della property numIdentTess.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNumIdentTess(String value) {
        this.numIdentTess = value;
    }

    /**
     * Recupera il valore della property dataNascitaEstero.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDataNascitaEstero() {
        return dataNascitaEstero;
    }

    /**
     * Imposta il valore della property dataNascitaEstero.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDataNascitaEstero(String value) {
        this.dataNascitaEstero = value;
    }

    /**
     * Recupera il valore della property dataScadTessera.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDataScadTessera() {
        return dataScadTessera;
    }

    /**
     * Imposta il valore della property dataScadTessera.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDataScadTessera(String value) {
        this.dataScadTessera = value;
    }

    /**
     * Recupera il valore della property statoProcesso.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStatoProcesso() {
        return statoProcesso;
    }

    /**
     * Imposta il valore della property statoProcesso.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStatoProcesso(String value) {
        this.statoProcesso = value;
    }

    /**
     * Recupera il valore della property elencoDettagliPrescrizioni.
     *
     * @return possible object is
     * {@link ElencoDettagliPrescrizioniType }
     */
    public ElencoDettagliPrescrizioniType getElencoDettagliPrescrizioni() {
        return elencoDettagliPrescrizioni;
    }

    /**
     * Imposta il valore della property elencoDettagliPrescrizioni.
     *
     * @param value allowed object is
     *              {@link ElencoDettagliPrescrizioniType }
     */
    public void setElencoDettagliPrescrizioni(ElencoDettagliPrescrizioniType value) {
        this.elencoDettagliPrescrizioni = value;
    }

    public String getNomeMedico1() {
        return nomeMedico1;
    }

    public void setNomeMedico1(String nomeMedico1) {
        this.nomeMedico1 = nomeMedico1;
    }

    public String getCognomeMedico1() {
        return cognomeMedico1;
    }

    public void setCognomeMedico1(String cognomeMedico1) {
        this.cognomeMedico1 = cognomeMedico1;
    }

    public String getOscuramDati() {
        return oscuramDati;
    }

    public void setOscuramDati(String oscuramDati) {
        this.oscuramDati = oscuramDati;
    }

    public String getCodiceAutenticazione() {
        return codiceAutenticazione;
    }

    public void setCodiceAutenticazione(String codiceAutenticazione) {
        this.codiceAutenticazione = codiceAutenticazione;
    }

    public String getDescrizioneCodiceDiagnosi() {
        return descrizioneCodiceDiagnosi;
    }

    public void setDescrizioneCodiceDiagnosi(String descrizioneCodiceDiagnosi) {
        this.descrizioneCodiceDiagnosi = descrizioneCodiceDiagnosi;
    }
}
