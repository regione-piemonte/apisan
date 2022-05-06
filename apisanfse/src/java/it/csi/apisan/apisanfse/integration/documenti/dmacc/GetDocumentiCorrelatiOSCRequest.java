/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documenti.dmacc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import it.csi.apisan.apisanfse.integration.documenti.dma.RichiedenteInfo;
import it.csi.apisan.apisanfse.integration.documenti.dma.TipoAzione;


/**
 * <p>Classe Java per getDocumentiCorrelatiOSCRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getDocumentiCorrelatiOSCRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richiedente" type="{http://dma.csi.it/}richiedenteInfo" minOccurs="0" form="unqualified"/>
 *         &lt;element name="cfPaziente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="documento" type="{http://dmacc.csi.it/}identificativoDocumento" minOccurs="0" form="unqualified"/>
 *         &lt;element name="tipoAzione" type="{http://dma.csi.it/}tipoAzione" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDocumentiCorrelatiOSCRequest", propOrder = {
    "richiedente",
    "cfPaziente",
    "documento",
    "tipoAzione"
})
public class GetDocumentiCorrelatiOSCRequest {

    protected RichiedenteInfo richiedente;
    protected String cfPaziente;
    protected IdentificativoDocumento documento;
    protected TipoAzione tipoAzione;

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
     * Recupera il valore della proprietà tipoAzione.
     * 
     * @return
     *     possible object is
     *     {@link TipoAzione }
     *     
     */
    public TipoAzione getTipoAzione() {
        return tipoAzione;
    }

    /**
     * Imposta il valore della proprietà tipoAzione.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoAzione }
     *     
     */
    public void setTipoAzione(TipoAzione value) {
        this.tipoAzione = value;
    }

}
