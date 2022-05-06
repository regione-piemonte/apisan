/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.dma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per documentoSR complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="documentoSR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentoFirmato" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="documentoNonFirmato" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="metadatiDocumento" type="{http://dma.csi.it/}metadatiDocumentoSR" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentoSR", propOrder = {
    "documentoFirmato",
    "documentoNonFirmato",
    "metadatiDocumento"
})
public class DocumentoSR {

    protected byte[] documentoFirmato;
    protected byte[] documentoNonFirmato;
    protected MetadatiDocumentoSR metadatiDocumento;

    /**
     * Recupera il valore della proprietà documentoFirmato.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDocumentoFirmato() {
        return documentoFirmato;
    }

    /**
     * Imposta il valore della proprietà documentoFirmato.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDocumentoFirmato(byte[] value) {
        this.documentoFirmato = value;
    }

    /**
     * Recupera il valore della proprietà documentoNonFirmato.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDocumentoNonFirmato() {
        return documentoNonFirmato;
    }

    /**
     * Imposta il valore della proprietà documentoNonFirmato.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDocumentoNonFirmato(byte[] value) {
        this.documentoNonFirmato = value;
    }

    /**
     * Recupera il valore della proprietà metadatiDocumento.
     * 
     * @return
     *     possible object is
     *     {@link MetadatiDocumentoSR }
     *     
     */
    public MetadatiDocumentoSR getMetadatiDocumento() {
        return metadatiDocumento;
    }

    /**
     * Imposta il valore della proprietà metadatiDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadatiDocumentoSR }
     *     
     */
    public void setMetadatiDocumento(MetadatiDocumentoSR value) {
        this.metadatiDocumento = value;
    }

}
