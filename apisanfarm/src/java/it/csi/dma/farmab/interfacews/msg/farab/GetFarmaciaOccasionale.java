/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.farmab.interfacews.msg.farab;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://farab.msg.interfacews.farmab.dma.csi.it/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="uuidDevice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "uuidDevice"
})
@XmlRootElement(name = "getFarmaciaOccasionale")
public class GetFarmaciaOccasionale
    extends ServiceRequest
{

    protected String uuidDevice;

    /**
     * Recupera il valore della proprietà uuidDevice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuidDevice() {
        return uuidDevice;
    }

    /**
     * Imposta il valore della proprietà uuidDevice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuidDevice(String value) {
        this.uuidDevice = value;
    }

}
