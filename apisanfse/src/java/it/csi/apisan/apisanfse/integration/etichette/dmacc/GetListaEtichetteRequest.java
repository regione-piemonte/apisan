/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.etichette.dmacc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import it.csi.apisan.apisanfse.integration.etichette.dma.RichiedenteInfo;
import it.csi.apisan.apisanfse.integration.etichette.dma.TipoEtichetta;


/**
 * <p>Classe Java per getListaEtichetteRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getListaEtichetteRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richiedente" type="{http://dma.csi.it/}richiedenteInfo" minOccurs="0"/>
 *         &lt;element name="cfPaziente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoEtichetta" type="{http://dma.csi.it/}tipoEtichetta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getListaEtichetteRequest", propOrder = {
    "richiedente",
    "cfPaziente",
    "tipoEtichetta"
})
public class GetListaEtichetteRequest {

    protected RichiedenteInfo richiedente;
    protected String cfPaziente;
    protected TipoEtichetta tipoEtichetta;

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
     * Recupera il valore della proprieta' tipoEtichetta.
     * 
     * @return
     *     possible object is
     *     {@link TipoEtichetta }
     *     
     */
    public TipoEtichetta getTipoEtichetta() {
        return tipoEtichetta;
    }

    /**
     * Imposta il valore della proprieta' tipoEtichetta.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEtichetta }
     *     
     */
    public void setTipoEtichetta(TipoEtichetta value) {
        this.tipoEtichetta = value;
    }

}
