/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documenti.dmacc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import it.csi.apisan.apisanfse.integration.documenti.dma.RichiedenteInfo;
import it.csi.apisan.apisanfse.integration.documenti.dma.TipoCorrelazioneDocumento;


/**
 * <p>Classe Java per getDocumentiCorrelatiRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getDocumentiCorrelatiRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richiedente" type="{http://dma.csi.it/}richiedenteInfo" minOccurs="0" form="unqualified"/>
 *         &lt;element name="cfPaziente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="documento" type="{http://dmacc.csi.it/}identificativoDocumento" minOccurs="0" form="unqualified"/>
 *         &lt;element name="tipoCorrelazioneDocumento" type="{http://dma.csi.it/}tipoCorrelazioneDocumento" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDocumentiCorrelatiRequest", propOrder = {
    "richiedente",
    "cfPaziente",
    "documento",
    "tipoCorrelazioneDocumento"
})
public class GetDocumentiCorrelatiRequest {

    protected RichiedenteInfo richiedente;
    protected String cfPaziente;
    protected IdentificativoDocumento documento;
    protected TipoCorrelazioneDocumento tipoCorrelazioneDocumento;

    /**
     * Recupera il valore della proprietà richiedente.
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
     * Imposta il valore della proprietà richiedente.
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
     * Recupera il valore della proprietà cfPaziente.
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
     * Imposta il valore della proprietà cfPaziente.
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
     * Recupera il valore della proprietà documento.
     * 
     * @return
     *     possible object is
     *     {@link IdentificativoDocumento }
     *     
     */
    public IdentificativoDocumento getDocumento() {
        return documento;
    }

    /**
     * Imposta il valore della proprietà documento.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificativoDocumento }
     *     
     */
    public void setDocumento(IdentificativoDocumento value) {
        this.documento = value;
    }

    /**
     * Recupera il valore della proprietà tipoCorrelazioneDocumento.
     * 
     * @return
     *     possible object is
     *     {@link TipoCorrelazioneDocumento }
     *     
     */
    public TipoCorrelazioneDocumento getTipoCorrelazioneDocumento() {
        return tipoCorrelazioneDocumento;
    }

    /**
     * Imposta il valore della proprietà tipoCorrelazioneDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCorrelazioneDocumento }
     *     
     */
    public void setTipoCorrelazioneDocumento(TipoCorrelazioneDocumento value) {
        this.tipoCorrelazioneDocumento = value;
    }

}
