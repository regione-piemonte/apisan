/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.sar.brokerservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per serviceInfoResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="serviceInfoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sinfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceInfoResponse", propOrder = {
    "sinfo"
})
public class ServiceInfoResponse {

    protected String sinfo;

    /**
     * Recupera il valore della property sinfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSinfo() {
        return sinfo;
    }

    /**
     * Imposta il valore della property sinfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSinfo(String value) {
        this.sinfo = value;
    }

}
