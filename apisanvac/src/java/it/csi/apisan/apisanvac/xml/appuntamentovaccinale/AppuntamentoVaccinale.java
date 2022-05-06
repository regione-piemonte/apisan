/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.appuntamentovaccinale;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;


/**
 * <p>Classe Java per AppuntamentoVaccinale complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AppuntamentoVaccinale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppuntamentiVaccinali" type="{}ArrayOfDTOAppuntamento" minOccurs="0"/>
 *         &lt;element name="StampaAppuntamento" type="{}DTOAppuntamentoStampa" minOccurs="0"/>
 *         &lt;element name="GenericResult" type="{}ResultSetPost" minOccurs="0"/>
 *         &lt;element name="PropostaVac" type="{}PropostaVaccinazione" minOccurs="0"/>
 *         &lt;element name="PropostaVar" type="{}PropostaVariazione" minOccurs="0"/>
 *         &lt;element name="RicercaPeriodiLiberi" type="{}ArrayOfDTOPropostaDiAppuntamento" minOccurs="0"/>
 *         &lt;element name="PropAppuntamento" type="{}DTOPropostaDateSpostamento" minOccurs="0"/>
 *         &lt;element name="Prenotazione" type="{}DTOPrenotazione" minOccurs="0"/>
 *         &lt;element name="Spostamento" type="{}DTOPrenotazione" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppuntamentoVaccinale", propOrder = {
    "appuntamentiVaccinali",
    "stampaAppuntamento",
    "genericResult",
    "propostaVac",
    "propostaVar",
    "ricercaPeriodiLiberi",
    "propAppuntamento",
    "prenotazione",
    "spostamento"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
@XmlRootElement(name = "AppuntamentoVaccinale")
public class AppuntamentoVaccinale {

    @XmlElement(name = "AppuntamentiVaccinali")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ArrayOfDTOAppuntamento appuntamentiVaccinali;
    @XmlElement(name = "StampaAppuntamento")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DTOAppuntamentoStampa stampaAppuntamento;
    @XmlElement(name = "GenericResult")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ResultSetPost genericResult;
    @XmlElement(name = "PropostaVac")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected PropostaVaccinazione propostaVac;
    @XmlElement(name = "PropostaVar")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected PropostaVariazione propostaVar;
    @XmlElement(name = "RicercaPeriodiLiberi")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ArrayOfDTOPropostaDiAppuntamento ricercaPeriodiLiberi;
    @XmlElement(name = "PropAppuntamento")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DTOPropostaDateSpostamento propAppuntamento;
    @XmlElement(name = "Prenotazione")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DTOPrenotazione prenotazione;
    @XmlElement(name = "Spostamento")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DTOPrenotazione spostamento;

    /**
     * Recupera il valore della proprietà appuntamentiVaccinali.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDTOAppuntamento }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public ArrayOfDTOAppuntamento getAppuntamentiVaccinali() {
        return appuntamentiVaccinali;
    }

    /**
     * Imposta il valore della proprietà appuntamentiVaccinali.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDTOAppuntamento }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAppuntamentiVaccinali(ArrayOfDTOAppuntamento value) {
        this.appuntamentiVaccinali = value;
    }

    /**
     * Recupera il valore della proprietà stampaAppuntamento.
     * 
     * @return
     *     possible object is
     *     {@link DTOAppuntamentoStampa }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DTOAppuntamentoStampa getStampaAppuntamento() {
        return stampaAppuntamento;
    }

    /**
     * Imposta il valore della proprietà stampaAppuntamento.
     * 
     * @param value
     *     allowed object is
     *     {@link DTOAppuntamentoStampa }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setStampaAppuntamento(DTOAppuntamentoStampa value) {
        this.stampaAppuntamento = value;
    }

    /**
     * Recupera il valore della proprietà genericResult.
     * 
     * @return
     *     possible object is
     *     {@link ResultSetPost }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public ResultSetPost getGenericResult() {
        return genericResult;
    }

    /**
     * Imposta il valore della proprietà genericResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultSetPost }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setGenericResult(ResultSetPost value) {
        this.genericResult = value;
    }

    /**
     * Recupera il valore della proprietà propostaVac.
     * 
     * @return
     *     possible object is
     *     {@link PropostaVaccinazione }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public PropostaVaccinazione getPropostaVac() {
        return propostaVac;
    }

    /**
     * Imposta il valore della proprietà propostaVac.
     * 
     * @param value
     *     allowed object is
     *     {@link PropostaVaccinazione }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPropostaVac(PropostaVaccinazione value) {
        this.propostaVac = value;
    }

    /**
     * Recupera il valore della proprietà propostaVar.
     * 
     * @return
     *     possible object is
     *     {@link PropostaVariazione }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public PropostaVariazione getPropostaVar() {
        return propostaVar;
    }

    /**
     * Imposta il valore della proprietà propostaVar.
     * 
     * @param value
     *     allowed object is
     *     {@link PropostaVariazione }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPropostaVar(PropostaVariazione value) {
        this.propostaVar = value;
    }

    /**
     * Recupera il valore della proprietà ricercaPeriodiLiberi.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDTOPropostaDiAppuntamento }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public ArrayOfDTOPropostaDiAppuntamento getRicercaPeriodiLiberi() {
        return ricercaPeriodiLiberi;
    }

    /**
     * Imposta il valore della proprietà ricercaPeriodiLiberi.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDTOPropostaDiAppuntamento }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setRicercaPeriodiLiberi(ArrayOfDTOPropostaDiAppuntamento value) {
        this.ricercaPeriodiLiberi = value;
    }

    /**
     * Recupera il valore della proprietà propAppuntamento.
     * 
     * @return
     *     possible object is
     *     {@link DTOPropostaDateSpostamento }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DTOPropostaDateSpostamento getPropAppuntamento() {
        return propAppuntamento;
    }

    /**
     * Imposta il valore della proprietà propAppuntamento.
     * 
     * @param value
     *     allowed object is
     *     {@link DTOPropostaDateSpostamento }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPropAppuntamento(DTOPropostaDateSpostamento value) {
        this.propAppuntamento = value;
    }

    /**
     * Recupera il valore della proprietà prenotazione.
     * 
     * @return
     *     possible object is
     *     {@link DTOPrenotazione }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DTOPrenotazione getPrenotazione() {
        return prenotazione;
    }

    /**
     * Imposta il valore della proprietà prenotazione.
     * 
     * @param value
     *     allowed object is
     *     {@link DTOPrenotazione }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPrenotazione(DTOPrenotazione value) {
        this.prenotazione = value;
    }

    /**
     * Recupera il valore della proprietà spostamento.
     * 
     * @return
     *     possible object is
     *     {@link DTOPrenotazione }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DTOPrenotazione getSpostamento() {
        return spostamento;
    }

    /**
     * Imposta il valore della proprietà spostamento.
     * 
     * @param value
     *     allowed object is
     *     {@link DTOPrenotazione }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSpostamento(DTOPrenotazione value) {
        this.spostamento = value;
    }

}
