/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documentoPersonale.dmacc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import it.csi.apisan.apisanfse.integration.documentoPersonale.dma.DocumentoPersonale;
import it.csi.apisan.apisanfse.integration.documentoPersonale.dma.ServiceResponse;


/**
 * <p>Classe Java per getDocumentoPersonaleResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getDocumentoPersonaleResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="documento" type="{http://dma.csi.it/}documentoPersonale" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDocumentoPersonaleResponse", propOrder = {
    "documento"
})
public class GetDocumentoPersonaleResponse
    extends ServiceResponse
{

    protected DocumentoPersonale documento;

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

}
