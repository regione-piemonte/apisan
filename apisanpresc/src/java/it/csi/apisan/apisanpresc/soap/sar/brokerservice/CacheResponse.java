/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.sar.brokerservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per cacheResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="cacheResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cinfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cacheResponse", propOrder = {
    "cinfo"
})
public class CacheResponse {

    protected String cinfo;

    /**
     * Recupera il valore della property cinfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCinfo() {
        return cinfo;
    }

    /**
     * Imposta il valore della property cinfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCinfo(String value) {
        this.cinfo = value;
    }

}
