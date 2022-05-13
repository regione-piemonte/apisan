/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per scaricaPdfRicettaResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="scaricaPdfRicettaResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmacc.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="pdf" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scaricaPdfRicettaResponse", propOrder = {
    "pdf"
})
public class ScaricaPdfRicettaResponse
    extends ServiceResponse
{

    protected byte[] pdf;

    /**
     * Recupera il valore della property pdf.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPdf() {
        return pdf;
    }

    /**
     * Imposta il valore della property pdf.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPdf(byte[] value) {
        this.pdf = value;
    }

}
