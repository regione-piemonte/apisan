/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.dma.elencoricetteservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per informazioniRichiedente complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="informazioniRichiedente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiceFiscaleUtente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ruoloUtente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificativoIpRichiedente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contestoOperativo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "informazioniRichiedente", namespace = "http://dmacc.csi.it/", propOrder = {
    "codiceFiscaleUtente",
    "ruoloUtente",
    "identificativoIpRichiedente",
    "contestoOperativo"
})
public class InformazioniRichiedente {

    @XmlElement(required = true)
    protected String codiceFiscaleUtente;
    protected String ruoloUtente;
    protected String identificativoIpRichiedente;
    @XmlElement(required = true)
    protected String contestoOperativo;

    /**
     * Recupera il valore della property codiceFiscaleUtente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscaleUtente() {
        return codiceFiscaleUtente;
    }

    /**
     * Imposta il valore della property codiceFiscaleUtente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscaleUtente(String value) {
        this.codiceFiscaleUtente = value;
    }

    /**
     * Recupera il valore della property ruoloUtente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuoloUtente() {
        return ruoloUtente;
    }

    /**
     * Imposta il valore della property ruoloUtente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuoloUtente(String value) {
        this.ruoloUtente = value;
    }

    /**
     * Recupera il valore della property identificativoIpRichiedente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificativoIpRichiedente() {
        return identificativoIpRichiedente;
    }

    /**
     * Imposta il valore della property identificativoIpRichiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificativoIpRichiedente(String value) {
        this.identificativoIpRichiedente = value;
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

}
