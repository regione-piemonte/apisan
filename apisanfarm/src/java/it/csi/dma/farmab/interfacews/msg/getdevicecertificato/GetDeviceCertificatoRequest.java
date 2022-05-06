/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.farmab.interfacews.msg.getdevicecertificato;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getDeviceCertificatoRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getDeviceCertificatoRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://getdevicecertificato.msg.interfacews.farmab.dma.csi.it/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="cfCittadino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDeviceCertificatoRequest", propOrder = {
    "cfCittadino"
})
public class GetDeviceCertificatoRequest
    extends ServiceRequest
{

    @XmlElement(namespace = "http://getdevicecertificato.msg.interfacews.farmab.dma.csi.it/")
    protected String cfCittadino;

    /**
     * Recupera il valore della proprietà cfCittadino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfCittadino() {
        return cfCittadino;
    }

    /**
     * Imposta il valore della proprietà cfCittadino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfCittadino(String value) {
        this.cfCittadino = value;
    }

}
