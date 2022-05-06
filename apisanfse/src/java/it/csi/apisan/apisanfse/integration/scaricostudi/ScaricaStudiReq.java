/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.scaricostudi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ScaricaStudiReq complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ScaricaStudiReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmacc.csi.it/}Ens_Request">
 *       &lt;sequence>
 *         &lt;element name="codiceFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fuoriRegione" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="idReferto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="periodoConservazione" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strutturaSanitaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sistemaOperativo" type="{http://dma.csi.it/}sistemaOperativo" minOccurs="0"/>
 *         &lt;element name="accessionNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="asr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScaricaStudiReq", propOrder = {
    "codiceFiscale",
    "email",
    "fuoriRegione",
    "idReferto",
    "periodoConservazione",
    "pin",
    "strutturaSanitaria",
    "sistemaOperativo",
    "accessionNumbers",
    "asr"
})
public class ScaricaStudiReq
    extends EnsRequest
{

    protected String codiceFiscale;
    protected String email;
    protected Boolean fuoriRegione;
    protected String idReferto;
    protected Integer periodoConservazione;
    protected String pin;
    protected String strutturaSanitaria;
    protected SistemaOperativo sistemaOperativo;
    protected String accessionNumbers;
    protected String asr;

    /**
     * Recupera il valore della proprieta codiceFiscale.
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
     * Imposta il valore della proprieta codiceFiscale.
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
     * Recupera il valore della proprieta email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Imposta il valore della proprieta email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Recupera il valore della proprieta fuoriRegione.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFuoriRegione() {
        return fuoriRegione;
    }

    /**
     * Imposta il valore della proprieta fuoriRegione.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFuoriRegione(Boolean value) {
        this.fuoriRegione = value;
    }

    /**
     * Recupera il valore della proprieta idReferto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdReferto() {
        return idReferto;
    }

    /**
     * Imposta il valore della proprieta idReferto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdReferto(String value) {
        this.idReferto = value;
    }

    /**
     * Recupera il valore della proprieta periodoConservazione.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodoConservazione() {
        return periodoConservazione;
    }

    /**
     * Imposta il valore della proprieta periodoConservazione.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodoConservazione(Integer value) {
        this.periodoConservazione = value;
    }

    /**
     * Recupera il valore della proprieta pin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Imposta il valore della proprieta pin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
    }

    /**
     * Recupera il valore della proprieta strutturaSanitaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrutturaSanitaria() {
        return strutturaSanitaria;
    }

    /**
     * Imposta il valore della proprieta strutturaSanitaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrutturaSanitaria(String value) {
        this.strutturaSanitaria = value;
    }

    /**
     * Recupera il valore della proprieta sistemaOperativo.
     * 
     * @return
     *     possible object is
     *     {@link SistemaOperativo }
     *     
     */
    public SistemaOperativo getSistemaOperativo() {
        return sistemaOperativo;
    }

    /**
     * Imposta il valore della proprieta sistemaOperativo.
     * 
     * @param value
     *     allowed object is
     *     {@link SistemaOperativo }
     *     
     */
    public void setSistemaOperativo(SistemaOperativo value) {
        this.sistemaOperativo = value;
    }

    /**
     * Recupera il valore della proprieta accessionNumbers.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessionNumbers() {
        return accessionNumbers;
    }

    /**
     * Imposta il valore della proprieta accessionNumbers.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessionNumbers(String value) {
        this.accessionNumbers = value;
    }

    /**
     * Recupera il valore della proprieta asr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsr() {
        return asr;
    }

    /**
     * Imposta il valore della proprieta asr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsr(String value) {
        this.asr = value;
    }

}
