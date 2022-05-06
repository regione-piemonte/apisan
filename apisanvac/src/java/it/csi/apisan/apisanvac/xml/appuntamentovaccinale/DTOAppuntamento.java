/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.appuntamentovaccinale;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per DTOAppuntamento complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DTOAppuntamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdAppuntamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vaccini" type="{}ArrayOfDTOVaccino" minOccurs="0"/>
 *         &lt;element name="ResultMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Luogo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTOAppuntamento", propOrder = {
    "idAppuntamento",
    "vaccini",
    "resultMessage",
    "data",
    "luogo"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class DTOAppuntamento {

    @XmlElement(name = "IdAppuntamento")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String idAppuntamento;
    @XmlElement(name = "Vaccini")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ArrayOfDTOVaccino vaccini;
    @XmlElement(name = "ResultMessage")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String resultMessage;
    @XmlElement(name = "Data", required = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar data;
    @XmlElement(name = "Luogo")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String luogo;

    /**
     * Recupera il valore della proprietà idAppuntamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getIdAppuntamento() {
        return idAppuntamento;
    }

    /**
     * Imposta il valore della proprietà idAppuntamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIdAppuntamento(String value) {
        this.idAppuntamento = value;
    }

    /**
     * Recupera il valore della proprietà vaccini.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDTOVaccino }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public ArrayOfDTOVaccino getVaccini() {
        return vaccini;
    }

    /**
     * Imposta il valore della proprietà vaccini.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDTOVaccino }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setVaccini(ArrayOfDTOVaccino value) {
        this.vaccini = value;
    }

    /**
     * Recupera il valore della proprietà resultMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getResultMessage() {
        return resultMessage;
    }

    /**
     * Imposta il valore della proprietà resultMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setResultMessage(String value) {
        this.resultMessage = value;
    }

    /**
     * Recupera il valore della proprietà data.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Imposta il valore della proprietà data.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * Recupera il valore della proprietà luogo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getLuogo() {
        return luogo;
    }

    /**
     * Imposta il valore della proprietà luogo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLuogo(String value) {
        this.luogo = value;
    }

}
