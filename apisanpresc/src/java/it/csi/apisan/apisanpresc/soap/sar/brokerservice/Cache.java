/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.sar.brokerservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per cache complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="cache">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operation" type="{http://relbl.csi.it/}cacheOperation" minOccurs="0" form="qualified"/>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cache", propOrder = {
    "operation",
    "key"
})
public class Cache {

    protected CacheOperation operation;
    protected String key;

    /**
     * Recupera il valore della property operation.
     * 
     * @return
     *     possible object is
     *     {@link CacheOperation }
     *     
     */
    public CacheOperation getOperation() {
        return operation;
    }

    /**
     * Imposta il valore della property operation.
     * 
     * @param value
     *     allowed object is
     *     {@link CacheOperation }
     *     
     */
    public void setOperation(CacheOperation value) {
        this.operation = value;
    }

    /**
     * Recupera il valore della property key.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Imposta il valore della property key.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

}
