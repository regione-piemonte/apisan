/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.sar.visprescsol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ElencoRicette" type="{http://tipodati.xsd.dem.sanita.finanze.it}elencoRicetteType" minOccurs="0"/>
 *         &lt;element name="codEsitoVisualizzazione" type="{http://tipodati.xsd.dem.sanita.finanze.it}codEsitoType"/>
 *         &lt;element name="ElencoErroriRicette" type="{http://tipodati.xsd.dem.sanita.finanze.it}elencoErroriRicetteType" minOccurs="0"/>
 *         &lt;element name="ElencoComunicazioni" type="{http://tipodati.xsd.dem.sanita.finanze.it}elencoComunicazioniType" minOccurs="0"/>
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
    "elencoRicette",
    "codEsitoVisualizzazione",
    "elencoErroriRicette",
    "elencoComunicazioni"
})
@XmlRootElement(name = "VisualizzaPrescrittoPazienteSOLRicevuta", namespace = "http://visualizzaprescrittopazientesolricevuta.xsd.dem.regione.piemonte.it")
public class VisualizzaPrescrittoPazienteSOLRicevuta {

    @XmlElement(name = "ElencoRicette", namespace = "http://visualizzaprescrittopazientesolricevuta.xsd.dem.regione.piemonte.it")
    protected ElencoRicetteType elencoRicette;
    @XmlElement(namespace = "http://visualizzaprescrittopazientesolricevuta.xsd.dem.regione.piemonte.it", required = true)
    protected String codEsitoVisualizzazione;
    @XmlElement(name = "ElencoErroriRicette", namespace = "http://visualizzaprescrittopazientesolricevuta.xsd.dem.regione.piemonte.it")
    protected ElencoErroriRicetteType elencoErroriRicette;
    @XmlElement(name = "ElencoComunicazioni", namespace = "http://visualizzaprescrittopazientesolricevuta.xsd.dem.regione.piemonte.it")
    protected ElencoComunicazioniType elencoComunicazioni;

    /**
     * Recupera il valore della property elencoRicette.
     * 
     * @return
     *     possible object is
     *     {@link ElencoRicetteType }
     *     
     */
    public ElencoRicetteType getElencoRicette() {
        return elencoRicette;
    }

    /**
     * Imposta il valore della property elencoRicette.
     * 
     * @param value
     *     allowed object is
     *     {@link ElencoRicetteType }
     *     
     */
    public void setElencoRicette(ElencoRicetteType value) {
        this.elencoRicette = value;
    }

    /**
     * Recupera il valore della property codEsitoVisualizzazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEsitoVisualizzazione() {
        return codEsitoVisualizzazione;
    }

    /**
     * Imposta il valore della property codEsitoVisualizzazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEsitoVisualizzazione(String value) {
        this.codEsitoVisualizzazione = value;
    }

    /**
     * Recupera il valore della property elencoErroriRicette.
     * 
     * @return
     *     possible object is
     *     {@link ElencoErroriRicetteType }
     *     
     */
    public ElencoErroriRicetteType getElencoErroriRicette() {
        return elencoErroriRicette;
    }

    /**
     * Imposta il valore della property elencoErroriRicette.
     * 
     * @param value
     *     allowed object is
     *     {@link ElencoErroriRicetteType }
     *     
     */
    public void setElencoErroriRicette(ElencoErroriRicetteType value) {
        this.elencoErroriRicette = value;
    }

    /**
     * Recupera il valore della property elencoComunicazioni.
     * 
     * @return
     *     possible object is
     *     {@link ElencoComunicazioniType }
     *     
     */
    public ElencoComunicazioniType getElencoComunicazioni() {
        return elencoComunicazioni;
    }

    /**
     * Imposta il valore della property elencoComunicazioni.
     * 
     * @param value
     *     allowed object is
     *     {@link ElencoComunicazioniType }
     *     
     */
    public void setElencoComunicazioni(ElencoComunicazioniType value) {
        this.elencoComunicazioni = value;
    }

}
