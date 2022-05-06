/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dto.opessanws.opessan.common.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Header complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Header">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiceRitorno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idAsr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="receiver" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="messageID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header", propOrder = {
    "codiceRitorno",
    "sender",
    "idAsr",
    "receiver",
    "messageID"
})
public class Header {

    protected int codiceRitorno;
    @XmlElement(required = true)
    protected String sender;
    @XmlElement(required = true)
    protected String idAsr;
    @XmlElement(required = true)
    protected String receiver;
    @XmlElement(required = true)
    protected String messageID;

    /**
     * Recupera il valore della proprietà codiceRitorno.
     * 
     */
    public int getCodiceRitorno() {
        return codiceRitorno;
    }

    /**
     * Imposta il valore della proprietà codiceRitorno.
     * 
     */
    public void setCodiceRitorno(int value) {
        this.codiceRitorno = value;
    }

    /**
     * Recupera il valore della proprietà sender.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Imposta il valore della proprietà sender.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * Recupera il valore della proprietà idAsr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAsr() {
        return idAsr;
    }

    /**
     * Imposta il valore della proprietà idAsr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAsr(String value) {
        this.idAsr = value;
    }

    /**
     * Recupera il valore della proprietà receiver.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * Imposta il valore della proprietà receiver.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiver(String value) {
        this.receiver = value;
    }

    /**
     * Recupera il valore della proprietà messageID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * Imposta il valore della proprietà messageID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageID(String value) {
        this.messageID = value;
    }

}
