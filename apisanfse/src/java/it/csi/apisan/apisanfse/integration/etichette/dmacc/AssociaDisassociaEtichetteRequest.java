/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.etichette.dmacc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import it.csi.apisan.apisanfse.integration.etichette.dma.Documento;
import it.csi.apisan.apisanfse.integration.etichette.dma.ListaIdEtichette;
import it.csi.apisan.apisanfse.integration.etichette.dma.RichiedenteInfo;
import it.csi.apisan.apisanfse.integration.etichette.dma.TipoOperazione;


/**
 * <p>Classe Java per associaDisassociaEtichetteRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="associaDisassociaEtichetteRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richiedente" type="{http://dma.csi.it/}richiedenteInfo" minOccurs="0"/>
 *         &lt;element name="cfPaziente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documento" type="{http://dma.csi.it/}documento" minOccurs="0"/>
 *         &lt;element name="idTagFisso" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="listaIdEtichette" type="{http://dma.csi.it/}listaIdEtichette" minOccurs="0"/>
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
@XmlType(name = "associaDisassociaEtichetteRequest", propOrder = {
    "richiedente",
    "cfPaziente",
    "documento",
    "idTagFisso",
    "listaIdEtichette",
    "tipoOperazione"
})
public class AssociaDisassociaEtichetteRequest {

    protected RichiedenteInfo richiedente;
    protected String cfPaziente;
    protected Documento documento;
    protected Long idTagFisso;
    protected ListaIdEtichette listaIdEtichette;
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
     * Recupera il valore della proprieta' documento.
     * 
     * @return
     *     possible object is
     *     {@link Documento }
     *     
     */
    public Documento getDocumento() {
        return documento;
    }

    /**
     * Imposta il valore della proprieta' documento.
     * 
     * @param value
     *     allowed object is
     *     {@link Documento }
     *     
     */
    public void setDocumento(Documento value) {
        this.documento = value;
    }

    /**
     * Recupera il valore della proprieta' idTagFisso.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdTagFisso() {
        return idTagFisso;
    }

    /**
     * Imposta il valore della proprieta' idTagFisso.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdTagFisso(Long value) {
        this.idTagFisso = value;
    }

    /**
     * Recupera il valore della proprieta' listaIdEtichette.
     * 
     * @return
     *     possible object is
     *     {@link ListaIdEtichette }
     *     
     */
    public ListaIdEtichette getListaIdEtichette() {
        return listaIdEtichette;
    }

    /**
     * Imposta il valore della proprieta' listaIdEtichette.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaIdEtichette }
     *     
     */
    public void setListaIdEtichette(ListaIdEtichette value) {
        this.listaIdEtichette = value;
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
