/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.scaricostudi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per statoRichiestaScarico complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="statoRichiestaScarico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dimensione" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idPacchetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idReferto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statoRichiesta" type="{http://dma.csi.it/}statoRichiesta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statoRichiestaScarico", namespace = "http://dma.csi.it/", propOrder = {
    "dimensione",
    "idPacchetto",
    "idReferto",
    "statoRichiesta"
})
public class StatoRichiestaScarico {

    @XmlElement(namespace = "http://dma.csi.it/")
    protected Long dimensione;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected String idPacchetto;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected String idReferto;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected StatoRichiesta statoRichiesta;

    /**
     * Recupera il valore della proprieta dimensione.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDimensione() {
        return dimensione;
    }

    /**
     * Imposta il valore della proprieta dimensione.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDimensione(Long value) {
        this.dimensione = value;
    }

    /**
     * Recupera il valore della proprieta idPacchetto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPacchetto() {
        return idPacchetto;
    }

    /**
     * Imposta il valore della proprieta idPacchetto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPacchetto(String value) {
        this.idPacchetto = value;
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
     * Recupera il valore della proprieta statoRichiesta.
     * 
     * @return
     *     possible object is
     *     {@link StatoRichiesta }
     *     
     */
    public StatoRichiesta getStatoRichiesta() {
        return statoRichiesta;
    }

    /**
     * Imposta il valore della proprieta statoRichiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link StatoRichiesta }
     *     
     */
    public void setStatoRichiesta(StatoRichiesta value) {
        this.statoRichiesta = value;
    }

}
