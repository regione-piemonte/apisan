/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package org.wso2.ws.dataservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FLUSSO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FLUSSO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_QUEUE_FLUSSI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_MSG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="URL_GPA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_ASR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MESSAGGIO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FLUSSO", propOrder = {
    "idqueueflussi",
    "idmsg",
    "urlgpa",
    "uuid",
    "idasr",
    "messaggio"
})
public class FLUSSO {

    @XmlElement(name = "ID_QUEUE_FLUSSI", required = true, nillable = true)
    protected String idqueueflussi;
    @XmlElement(name = "ID_MSG", required = true, nillable = true)
    protected String idmsg;
    @XmlElement(name = "URL_GPA", required = true, nillable = true)
    protected String urlgpa;
    @XmlElement(name = "UUID", required = true, nillable = true)
    protected String uuid;
    @XmlElement(name = "ID_ASR", required = true, nillable = true)
    protected String idasr;
    @XmlElement(name = "MESSAGGIO", required = true, nillable = true)
    protected String messaggio;

    /**
     * Recupera il valore della proprieta idqueueflussi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDQUEUEFLUSSI() {
        return idqueueflussi;
    }

    /**
     * Imposta il valore della proprieta idqueueflussi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDQUEUEFLUSSI(String value) {
        this.idqueueflussi = value;
    }

    /**
     * Recupera il valore della proprieta idmsg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDMSG() {
        return idmsg;
    }

    /**
     * Imposta il valore della proprieta idmsg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDMSG(String value) {
        this.idmsg = value;
    }

    /**
     * Recupera il valore della proprieta urlgpa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLGPA() {
        return urlgpa;
    }

    /**
     * Imposta il valore della proprieta urlgpa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLGPA(String value) {
        this.urlgpa = value;
    }

    /**
     * Recupera il valore della proprieta uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Imposta il valore della proprieta uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Recupera il valore della proprieta idasr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDASR() {
        return idasr;
    }

    /**
     * Imposta il valore della proprieta idasr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDASR(String value) {
        this.idasr = value;
    }

    /**
     * Recupera il valore della proprieta messaggio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESSAGGIO() {
        return messaggio;
    }

    /**
     * Imposta il valore della proprieta messaggio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESSAGGIO(String value) {
        this.messaggio = value;
    }

}
