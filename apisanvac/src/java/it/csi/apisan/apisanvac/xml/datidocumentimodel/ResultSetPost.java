/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.datidocumentimodel;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ResultSetPost complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ResultSetPost">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultSetPost", propOrder = {
    "success",
    "message"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class ResultSetPost {

    @XmlElement(name = "Success")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected boolean success;
    @XmlElement(name = "Message")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String message;

    /**
     * Recupera il valore della proprietà success.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public boolean isSuccess() {
        return success;
    }

    /**
     * Imposta il valore della proprietà success.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSuccess(boolean value) {
        this.success = value;
    }

    /**
     * Recupera il valore della proprietà message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getMessage() {
        return message;
    }

    /**
     * Imposta il valore della proprietà message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMessage(String value) {
        this.message = value;
    }

}
