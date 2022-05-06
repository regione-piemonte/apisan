/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documentoPersonale.dmacc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import it.csi.apisan.apisanfse.integration.documentoPersonale.dma.DocumentoPersonale;
import it.csi.apisan.apisanfse.integration.documentoPersonale.dma.MetadatiDocumentoPersonale;
import it.csi.apisan.apisanfse.integration.documentoPersonale.dma.RichiedenteInfo;


/**
 * <p>Classe Java per setDocumentoPersonale complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="setDocumentoPersonale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richiedente" type="{http://dma.csi.it/}richiedenteInfo" minOccurs="0"/>
 *         &lt;element name="cfPaziente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documento" type="{http://dma.csi.it/}documentoPersonale" minOccurs="0"/>
 *         &lt;element name="metadatiDocumento" type="{http://dma.csi.it/}metadatiDocumentoPersonale" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setDocumentoPersonale", propOrder = {
    "richiedente",
    "cfPaziente",
    "documento",
    "metadatiDocumento"
})
public class SetDocumentoPersonale {

    protected RichiedenteInfo richiedente;
    protected String cfPaziente;
    protected DocumentoPersonale documento;
    protected MetadatiDocumentoPersonale metadatiDocumento;

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
     *     {@link DocumentoPersonale }
     *     
     */
    public DocumentoPersonale getDocumento() {
        return documento;
    }

    /**
     * Imposta il valore della proprieta' documento.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoPersonale }
     *     
     */
    public void setDocumento(DocumentoPersonale value) {
        this.documento = value;
    }

    /**
     * Recupera il valore della proprieta' metadatiDocumento.
     * 
     * @return
     *     possible object is
     *     {@link MetadatiDocumentoPersonale }
     *     
     */
    public MetadatiDocumentoPersonale getMetadatiDocumento() {
        return metadatiDocumento;
    }

    /**
     * Imposta il valore della proprieta' metadatiDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadatiDocumentoPersonale }
     *     
     */
    public void setMetadatiDocumento(MetadatiDocumentoPersonale value) {
        this.metadatiDocumento = value;
    }

}
