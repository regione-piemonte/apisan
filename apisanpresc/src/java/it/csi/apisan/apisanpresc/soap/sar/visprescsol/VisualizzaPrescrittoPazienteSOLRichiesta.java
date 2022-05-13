/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.sar.visprescsol;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pinCode" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType"/>
 *         &lt;element name="idRichiesta" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="applicativoChiamante" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="contestoOperativo" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="cfAssistito" type="{http://tipodati.xsd.dem.sanita.finanze.it}cfAssistitoType"/>
 *         &lt;element name="nre" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="tipoRegime" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="tipoRicetta" type="{http://tipodati.xsd.dem.sanita.finanze.it}tipoRicettaPazienteType" minOccurs="0"/>
 *         &lt;element name="tipoPrescrizione" type="{http://tipodati.xsd.dem.sanita.finanze.it}tipoPrescType" minOccurs="0"/>
 *         &lt;element name="codProdPrest" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="codGruppoEquival" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="codRaggrDisp" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="statoProcesso" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dataIniRange" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="dataFineRange" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="richiedente" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType"/>
 *         &lt;element name="ricetteScadute" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="ricErogNonSSN" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *         &lt;element name="regionePrescrizione" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pinCode",
    "idRichiesta",
    "applicativoChiamante",
    "contestoOperativo",
    "cfAssistito",
    "nre",
    "tipoRegime",
    "tipoRicetta",
    "tipoPrescrizione",
    "codProdPrest",
    "codGruppoEquival",
    "codRaggrDisp",
    "statoProcesso",
    "dataIniRange",
    "dataFineRange",
    "richiedente",
    "ricetteScadute",
    "ricErogNonSSN",
    "regionePrescrizione",
    "Ip_chiamante"
})
@XmlRootElement(name = "VisualizzaPrescrittoPazienteSOLRichiesta", namespace = "http://visualizzaprescrittopazientesolrichiesta.xsd.dem.regione.piemonte.it")
public class VisualizzaPrescrittoPazienteSOLRichiesta {

    @XmlElement(namespace = "http://visualizzaprescrittopazientesolrichiesta.xsd.dem.regione.piemonte.it", required = true)
    protected String pinCode;
    @XmlElement(namespace = "http://visualizzaprescrittopazientesolrichiesta.xsd.dem.regione.piemonte.it")
    protected String idRichiesta;
    @XmlElement(namespace = "http://visualizzaprescrittopazientesolrichiesta.xsd.dem.regione.piemonte.it")
    protected String applicativoChiamante;
    @XmlElement(namespace = "http://visualizzaprescrittopazientesolrichiesta.xsd.dem.regione.piemonte.it")
    protected String contestoOperativo;
    @XmlElement(namespace = "http://visualizzaprescrittopazientesolrichiesta.xsd.dem.regione.piemonte.it", required = true)
    protected String cfAssistito;
    @XmlElement(namespace = "http://visualizzaprescrittopazientesolrichiesta.xsd.dem.regione.piemonte.it")
    protected String nre;
    @XmlElement(namespace = "http://visualizzaprescrittopazientesolrichiesta.xsd.dem.regione.piemonte.it")
    protected String tipoRegime;
    @XmlElement(namespace = "http://visualizzaprescrittopazientesolrichiesta.xsd.dem.regione.piemonte.it")
    protected String tipoRicetta;
    @XmlElement(namespace = "http://visualizzaprescrittopazientesolrichiesta.xsd.dem.regione.piemonte.it")
    protected String tipoPrescrizione;
    @XmlElement(namespace = "http://visualizzaprescrittopazientesolrichiesta.xsd.dem.regione.piemonte.it")
    protected List<String> codProdPrest;
    @XmlElement(namespace = "http://visualizzaprescrittopazientesolrichiesta.xsd.dem.regione.piemonte.it")
    protected List<String> codGruppoEquival;
    @XmlElement(namespace = "http://visualizzaprescrittopazientesolrichiesta.xsd.dem.regione.piemonte.it")
    protected List<String> codRaggrDisp;
    @XmlElement(namespace = "http://visualizzaprescrittopazientesolrichiesta.xsd.dem.regione.piemonte.it")
    protected List<String> statoProcesso;
    @XmlElement(namespace = "http://visualizzaprescrittopazientesolrichiesta.xsd.dem.regione.piemonte.it")
    @XmlSchemaType(name = "date")
    protected String dataIniRange;
    @XmlElement(namespace = "http://visualizzaprescrittopazientesolrichiesta.xsd.dem.regione.piemonte.it")
    @XmlSchemaType(name = "date")
    protected String dataFineRange;
    @XmlElement(namespace = "http://visualizzaprescrittopazientesolrichiesta.xsd.dem.regione.piemonte.it", required = true)
    protected String richiedente;
    @XmlElement(namespace = "http://visualizzaprescrittopazientesolrichiesta.xsd.dem.regione.piemonte.it")
    protected String ricetteScadute;
    @XmlElement(namespace = "http://visualizzaprescrittopazientesolrichiesta.xsd.dem.regione.piemonte.it")
    protected String ricErogNonSSN;
    @XmlElement(namespace = "http://visualizzaprescrittopazientesolrichiesta.xsd.dem.regione.piemonte.it")
    protected String regionePrescrizione;
    @XmlElement(namespace = "http://visualizzaprescrittopazientesolrichiesta.xsd.dem.regione.piemonte.it")
    protected String Ip_chiamante;

    /**
     * Recupera il valore della property pinCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinCode() {
        return pinCode;
    }

    /**
     * Imposta il valore della property pinCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinCode(String value) {
        this.pinCode = value;
    }

    /**
     * Recupera il valore della property idRichiesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRichiesta() {
        return idRichiesta;
    }

    /**
     * Imposta il valore della property idRichiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRichiesta(String value) {
        this.idRichiesta = value;
    }

    /**
     * Recupera il valore della property applicativoChiamante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicativoChiamante() {
        return applicativoChiamante;
    }

    /**
     * Imposta il valore della property applicativoChiamante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicativoChiamante(String value) {
        this.applicativoChiamante = value;
    }

    /**
     * Recupera il valore della property contestoOperativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContestoOperativo() {
        return contestoOperativo;
    }

    /**
     * Imposta il valore della property contestoOperativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContestoOperativo(String value) {
        this.contestoOperativo = value;
    }

    /**
     * Recupera il valore della property cfAssistito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfAssistito() {
        return cfAssistito;
    }

    /**
     * Imposta il valore della property cfAssistito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfAssistito(String value) {
        this.cfAssistito = value;
    }

    /**
     * Recupera il valore della property nre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNre() {
        return nre;
    }

    /**
     * Imposta il valore della property nre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNre(String value) {
        this.nre = value;
    }

    /**
     * Recupera il valore della property tipoRegime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRegime() {
        return tipoRegime;
    }

    /**
     * Imposta il valore della property tipoRegime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRegime(String value) {
        this.tipoRegime = value;
    }

    /**
     * Recupera il valore della property tipoRicetta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRicetta() {
        return tipoRicetta;
    }

    /**
     * Imposta il valore della property tipoRicetta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRicetta(String value) {
        this.tipoRicetta = value;
    }

    /**
     * Recupera il valore della property tipoPrescrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPrescrizione() {
        return tipoPrescrizione;
    }

    /**
     * Imposta il valore della property tipoPrescrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPrescrizione(String value) {
        this.tipoPrescrizione = value;
    }

    /**
     * Gets the value of the codProdPrest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codProdPrest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodProdPrest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCodProdPrest() {
        if (codProdPrest == null) {
            codProdPrest = new ArrayList<String>();
        }
        return this.codProdPrest;
    }

    /**
     * Gets the value of the codGruppoEquival property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codGruppoEquival property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodGruppoEquival().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCodGruppoEquival() {
        if (codGruppoEquival == null) {
            codGruppoEquival = new ArrayList<String>();
        }
        return this.codGruppoEquival;
    }

    /**
     * Gets the value of the codRaggrDisp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codRaggrDisp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodRaggrDisp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCodRaggrDisp() {
        if (codRaggrDisp == null) {
            codRaggrDisp = new ArrayList<String>();
        }
        return this.codRaggrDisp;
    }

    /**
     * Gets the value of the statoProcesso property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statoProcesso property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatoProcesso().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStatoProcesso() {
        if (statoProcesso == null) {
            statoProcesso = new ArrayList<String>();
        }
        return this.statoProcesso;
    }

    /**
     * Recupera il valore della property dataIniRange.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getDataIniRange() {
        return dataIniRange;
    }

    /**
     * Imposta il valore della property dataIniRange.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataIniRange(String value) {
        this.dataIniRange = value;
    }

    /**
     * Recupera il valore della property dataFineRange.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getDataFineRange() {
        return dataFineRange;
    }

    /**
     * Imposta il valore della property dataFineRange.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFineRange(String value) {
        this.dataFineRange = value;
    }

    /**
     * Recupera il valore della property richiedente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRichiedente() {
        return richiedente;
    }

    /**
     * Imposta il valore della property richiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRichiedente(String value) {
        this.richiedente = value;
    }

    /**
     * Recupera il valore della property ricetteScadute.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRicetteScadute() {
        return ricetteScadute;
    }

    /**
     * Imposta il valore della property ricetteScadute.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRicetteScadute(String value) {
        this.ricetteScadute = value;
    }

    /**
     * Recupera il valore della property ricErogNonSSN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRicErogNonSSN() {
        return ricErogNonSSN;
    }

    /**
     * Imposta il valore della property ricErogNonSSN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRicErogNonSSN(String value) {
        this.ricErogNonSSN = value;
    }

    /**
     * Recupera il valore della property regionePrescrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionePrescrizione() {
        return regionePrescrizione;
    }

    /**
     * Imposta il valore della property regionePrescrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionePrescrizione(String value) {
        this.regionePrescrizione = value;
    }

	public String getIp_chiamante() {
		return Ip_chiamante;
	}

	public void setIp_chiamante(String ip_chiamante) {
		Ip_chiamante = ip_chiamante;
	}

    
}
