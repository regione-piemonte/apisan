/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.arruolamento.dma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per richiedenteArruolamento complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="richiedenteArruolamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiceFiscale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ruolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDelega" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gradoDelega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceServizio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipRichiedente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "richiedenteArruolamento", propOrder = {
    "codiceFiscale",
    "ruolo",
    "tipoDelega",
    "gradoDelega",
    "requestID",
    "codiceServizio",
    "ipRichiedente"
})
public class RichiedenteArruolamento {

    @XmlElement(required = true)
    protected String codiceFiscale;
    protected String ruolo;
    @XmlElement(required = true)
    protected String tipoDelega;
    protected String gradoDelega;
    protected String requestID;
    protected String codiceServizio;
    protected String ipRichiedente;

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
     * Recupera il valore della proprietà ruolo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuolo() {
        return ruolo;
    }

    /**
     * Imposta il valore della proprietà ruolo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuolo(String value) {
        this.ruolo = value;
    }

    /**
     * Recupera il valore della proprietà tipoDelega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDelega() {
        return tipoDelega;
    }

    /**
     * Imposta il valore della proprietà tipoDelega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDelega(String value) {
        this.tipoDelega = value;
    }

    /**
     * Recupera il valore della proprietà gradoDelega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradoDelega() {
        return gradoDelega;
    }

    /**
     * Imposta il valore della proprietà gradoDelega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradoDelega(String value) {
        this.gradoDelega = value;
    }

    /**
     * Recupera il valore della proprietà requestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Imposta il valore della proprietà requestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Recupera il valore della proprietà codiceServizio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceServizio() {
        return codiceServizio;
    }

    /**
     * Imposta il valore della proprietà codiceServizio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceServizio(String value) {
        this.codiceServizio = value;
    }

    /**
     * Recupera il valore della proprietà ipRichiedente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpRichiedente() {
        return ipRichiedente;
    }

    /**
     * Imposta il valore della proprietà ipRichiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpRichiedente(String value) {
        this.ipRichiedente = value;
    }

}
