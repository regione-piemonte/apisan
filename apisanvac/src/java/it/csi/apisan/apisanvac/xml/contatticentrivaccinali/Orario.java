/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.contatticentrivaccinali;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per Orario complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Orario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Giorno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OraInizioAM" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OraFineAM" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OraInizioPM" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OraFinePM" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Orario", propOrder = {
    "giorno",
    "oraInizioAM",
    "oraFineAM",
    "oraInizioPM",
    "oraFinePM"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Orario {

    @XmlElement(name = "Giorno")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected int giorno;
    @XmlElement(name = "OraInizioAM", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar oraInizioAM;
    @XmlElement(name = "OraFineAM", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar oraFineAM;
    @XmlElement(name = "OraInizioPM", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar oraInizioPM;
    @XmlElement(name = "OraFinePM", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar oraFinePM;

    /**
     * Recupera il valore della proprietà giorno.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public int getGiorno() {
        return giorno;
    }

    /**
     * Imposta il valore della proprietà giorno.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setGiorno(int value) {
        this.giorno = value;
    }

    /**
     * Recupera il valore della proprietà oraInizioAM.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getOraInizioAM() {
        return oraInizioAM;
    }

    /**
     * Imposta il valore della proprietà oraInizioAM.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setOraInizioAM(XMLGregorianCalendar value) {
        this.oraInizioAM = value;
    }

    /**
     * Recupera il valore della proprietà oraFineAM.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getOraFineAM() {
        return oraFineAM;
    }

    /**
     * Imposta il valore della proprietà oraFineAM.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setOraFineAM(XMLGregorianCalendar value) {
        this.oraFineAM = value;
    }

    /**
     * Recupera il valore della proprietà oraInizioPM.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getOraInizioPM() {
        return oraInizioPM;
    }

    /**
     * Imposta il valore della proprietà oraInizioPM.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setOraInizioPM(XMLGregorianCalendar value) {
        this.oraInizioPM = value;
    }

    /**
     * Recupera il valore della proprietà oraFinePM.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getOraFinePM() {
        return oraFinePM;
    }

    /**
     * Imposta il valore della proprietà oraFinePM.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:19+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setOraFinePM(XMLGregorianCalendar value) {
        this.oraFinePM = value;
    }

}
