/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documenti.dmacc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import it.csi.apisan.apisanfse.integration.documenti.dma.ServiceResponse;


/**
 * <p>Classe Java per GetDettaglioDocumentoResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GetDettaglioDocumentoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="documento" type="{http://dmacc.csi.it/}documento" minOccurs="0" form="unqualified"/>
 *         &lt;element name="documentoAreaRossa" type="{http://dmacc.csi.it/}documentoAreaRossa" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDettaglioDocumentoResponse", propOrder = {
    "documento",
    "documentoAreaRossa"
})
public class GetDettaglioDocumentoResponse
    extends ServiceResponse
{

    protected Documento documento;
    protected DocumentoAreaRossa documentoAreaRossa;

    /**
     * Recupera il valore della proprietà documento.
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
     * Imposta il valore della proprietà documento.
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
     * Recupera il valore della proprietà documentoAreaRossa.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoAreaRossa }
     *     
     */
    public DocumentoAreaRossa getDocumentoAreaRossa() {
        return documentoAreaRossa;
    }

    /**
     * Imposta il valore della proprietà documentoAreaRossa.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoAreaRossa }
     *     
     */
    public void setDocumentoAreaRossa(DocumentoAreaRossa value) {
        this.documentoAreaRossa = value;
    }

}
