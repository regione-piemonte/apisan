/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.sar.brokerservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;


/**
 * <p>Classe Java per decryptXML complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="decryptXML">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idXML" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="type" type="{http://relbl.csi.it/}xmlType" minOccurs="0" form="qualified"/>
 *         &lt;element name="enkey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@javax.xml.bind.annotation.XmlType(name = "decryptXML", propOrder = {
    "idXML",
    "type",
    "enkey"
})
public class DecryptXML {

    protected BigDecimal idXML;
    protected it.csi.apisan.apisanpresc.soap.sar.brokerservice.XmlType type;
    protected String enkey;

    /**
     * Recupera il valore della property idXML.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdXML() {
        return idXML;
    }

    /**
     * Imposta il valore della property idXML.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdXML(BigDecimal value) {
        this.idXML = value;
    }

    /**
     * Recupera il valore della property type.
     * 
     * @return
     *     possible object is
     *     {@link it.csi.apisan.apisanpresc.soap.sar.brokerservice.XmlType }
     *     
     */
    public it.csi.apisan.apisanpresc.soap.sar.brokerservice.XmlType getType() {
        return type;
    }

    /**
     * Imposta il valore della property type.
     * 
     * @param value
     *     allowed object is
     *     {@link it.csi.apisan.apisanpresc.soap.sar.brokerservice.XmlType }
     *     
     */
    public void setType(it.csi.apisan.apisanpresc.soap.sar.brokerservice.XmlType value) {
        this.type = value;
    }

    /**
     * Recupera il valore della property enkey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnkey() {
        return enkey;
    }

    /**
     * Imposta il valore della property enkey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnkey(String value) {
        this.enkey = value;
    }

}
