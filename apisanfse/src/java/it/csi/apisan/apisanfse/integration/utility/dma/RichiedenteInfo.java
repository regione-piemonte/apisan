/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.utility.dma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import it.csi.apisan.apisanfse.integration.utility.dmacc.ApplicativoVerticale;
import it.csi.apisan.apisanfse.integration.utility.dmacc.ApplicazioneRichiedente;


/**
 * <p>Classe Java per richiedenteInfo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="richiedenteInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicativoVerticale" type="{http://dmacc.csi.it/}applicativoVerticale" minOccurs="0"/>
 *         &lt;element name="applicazione" type="{http://dmacc.csi.it/}applicazioneRichiedente" minOccurs="0"/>
 *         &lt;element name="codiceFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroTransazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ruolo" type="{http://dma.csi.it/}ruolo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "richiedenteInfo", propOrder = {
    "applicativoVerticale",
    "applicazione",
    "codiceFiscale",
    "ip",
    "numeroTransazione",
    "ruolo"
})
public class RichiedenteInfo {

    protected ApplicativoVerticale applicativoVerticale;
    protected ApplicazioneRichiedente applicazione;
    protected String codiceFiscale;
    protected String ip;
    protected String numeroTransazione;
    protected Ruolo ruolo;

    /**
     * Recupera il valore della proprietà applicativoVerticale.
     * 
     * @return
     *     possible object is
     *     {@link ApplicativoVerticale }
     *     
     */
    public ApplicativoVerticale getApplicativoVerticale() {
        return applicativoVerticale;
    }

    /**
     * Imposta il valore della proprietà applicativoVerticale.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicativoVerticale }
     *     
     */
    public void setApplicativoVerticale(ApplicativoVerticale value) {
        this.applicativoVerticale = value;
    }

    /**
     * Recupera il valore della proprietà applicazione.
     * 
     * @return
     *     possible object is
     *     {@link ApplicazioneRichiedente }
     *     
     */
    public ApplicazioneRichiedente getApplicazione() {
        return applicazione;
    }

    /**
     * Imposta il valore della proprietà applicazione.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicazioneRichiedente }
     *     
     */
    public void setApplicazione(ApplicazioneRichiedente value) {
        this.applicazione = value;
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
     * Recupera il valore della proprietà ip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIp() {
        return ip;
    }

    /**
     * Imposta il valore della proprietà ip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIp(String value) {
        this.ip = value;
    }

    /**
     * Recupera il valore della proprietà numeroTransazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTransazione() {
        return numeroTransazione;
    }

    /**
     * Imposta il valore della proprietà numeroTransazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTransazione(String value) {
        this.numeroTransazione = value;
    }

    /**
     * Recupera il valore della proprietà ruolo.
     * 
     * @return
     *     possible object is
     *     {@link Ruolo }
     *     
     */
    public Ruolo getRuolo() {
        return ruolo;
    }

    /**
     * Imposta il valore della proprietà ruolo.
     * 
     * @param value
     *     allowed object is
     *     {@link Ruolo }
     *     
     */
    public void setRuolo(Ruolo value) {
        this.ruolo = value;
    }

}
