/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documenti.dmacc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import it.csi.apisan.apisanfse.integration.documenti.dma.ComponenteLocaleRisposta;
import it.csi.apisan.apisanfse.integration.documenti.dma.ServiceResponse;


/**
 * <p>Classe Java per getDocumentoResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getDocumentoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="documento" type="{http://dmacc.csi.it/}documentoDMA" minOccurs="0" form="unqualified"/>
 *         &lt;element name="componenteLocaleRisposta" type="{http://dma.csi.it/}componenteLocaleRisposta" minOccurs="0" form="unqualified"/>
 *         &lt;element name="urlDocumentoDipartimentale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="authDocumentoDipartimentale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="documentoSuDipartimentale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDocumentoResponse", propOrder = {
    "documento",
    "componenteLocaleRisposta",
    "urlDocumentoDipartimentale",
    "authDocumentoDipartimentale",
    "documentoSuDipartimentale"
})
public class GetDocumentoResponse
    extends ServiceResponse
{

    protected DocumentoDMA documento;
    protected ComponenteLocaleRisposta componenteLocaleRisposta;
    protected String urlDocumentoDipartimentale;
    protected String authDocumentoDipartimentale;
    protected String documentoSuDipartimentale;

    /**
     * Recupera il valore della proprietà documento.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoDMA }
     *     
     */
    public DocumentoDMA getDocumento() {
        return documento;
    }

    /**
     * Imposta il valore della proprietà documento.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoDMA }
     *     
     */
    public void setDocumento(DocumentoDMA value) {
        this.documento = value;
    }

    /**
     * Recupera il valore della proprietà componenteLocaleRisposta.
     * 
     * @return
     *     possible object is
     *     {@link ComponenteLocaleRisposta }
     *     
     */
    public ComponenteLocaleRisposta getComponenteLocaleRisposta() {
        return componenteLocaleRisposta;
    }

    /**
     * Imposta il valore della proprietà componenteLocaleRisposta.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponenteLocaleRisposta }
     *     
     */
    public void setComponenteLocaleRisposta(ComponenteLocaleRisposta value) {
        this.componenteLocaleRisposta = value;
    }

    /**
     * Recupera il valore della proprietà urlDocumentoDipartimentale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlDocumentoDipartimentale() {
        return urlDocumentoDipartimentale;
    }

    /**
     * Imposta il valore della proprietà urlDocumentoDipartimentale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlDocumentoDipartimentale(String value) {
        this.urlDocumentoDipartimentale = value;
    }

    /**
     * Recupera il valore della proprietà authDocumentoDipartimentale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthDocumentoDipartimentale() {
        return authDocumentoDipartimentale;
    }

    /**
     * Imposta il valore della proprietà authDocumentoDipartimentale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthDocumentoDipartimentale(String value) {
        this.authDocumentoDipartimentale = value;
    }

    /**
     * Recupera il valore della proprietà documentoSuDipartimentale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentoSuDipartimentale() {
        return documentoSuDipartimentale;
    }

    /**
     * Imposta il valore della proprietà documentoSuDipartimentale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentoSuDipartimentale(String value) {
        this.documentoSuDipartimentale = value;
    }

}
