/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.etichette.dmacc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import it.csi.apisan.apisanfse.integration.etichette.dma.RichiedenteInfo;
import it.csi.apisan.apisanfse.integration.etichette.dma.TipoOperazione;


/**
 * <p>Classe Java per updateEtichettaRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="updateEtichettaRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richiedente" type="{http://dma.csi.it/}richiedenteInfo" minOccurs="0"/>
 *         &lt;element name="cfPaziente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idEtichetta" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="testoEtichetta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoOperazione" type="{http://dma.csi.it/}tipoOperazione" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateEtichettaRequest", propOrder = {
    "richiedente",
    "cfPaziente",
    "idEtichetta",
    "testoEtichetta",
    "tipoOperazione"
})
public class UpdateEtichettaRequest {

    protected RichiedenteInfo richiedente;
    protected String cfPaziente;
    protected Long idEtichetta;
    protected String testoEtichetta;
    protected TipoOperazione tipoOperazione;

    /**
     * Recupera il valore della proprieta' richiedente.
     * 
     * @return
     *     possible object is
     *     {@link RichiedenteInfo }
     *     
     */
    public RichiedenteInfo getRichiedente() {
        return richiedente;
    }

    /**
     * Imposta il valore della proprieta' richiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link RichiedenteInfo }
     *     
     */
    public void setRichiedente(RichiedenteInfo value) {
        this.richiedente = value;
    }

    /**
     * Recupera il valore della proprieta' cfPaziente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfPaziente() {
        return cfPaziente;
    }

    /**
     * Imposta il valore della proprieta' cfPaziente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfPaziente(String value) {
        this.cfPaziente = value;
    }

    /**
     * Recupera il valore della proprieta' idEtichetta.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdEtichetta() {
        return idEtichetta;
    }

    /**
     * Imposta il valore della proprieta' idEtichetta.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdEtichetta(Long value) {
        this.idEtichetta = value;
    }

    /**
     * Recupera il valore della proprieta' testoEtichetta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestoEtichetta() {
        return testoEtichetta;
    }

    /**
     * Imposta il valore della proprieta' testoEtichetta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestoEtichetta(String value) {
        this.testoEtichetta = value;
    }

    /**
     * Recupera il valore della proprieta' tipoOperazione.
     * 
     * @return
     *     possible object is
     *     {@link TipoOperazione }
     *     
     */
    public TipoOperazione getTipoOperazione() {
        return tipoOperazione;
    }

    /**
     * Imposta il valore della proprieta' tipoOperazione.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoOperazione }
     *     
     */
    public void setTipoOperazione(TipoOperazione value) {
        this.tipoOperazione = value;
    }

}
