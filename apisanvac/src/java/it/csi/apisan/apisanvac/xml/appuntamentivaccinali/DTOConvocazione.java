/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.appuntamentivaccinali;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per DTOConvocazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DTOConvocazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodicePaziente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DataConvocazione" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CodiceConsultorio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceAmbulatorio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Vaccini" type="{}ArrayOfDTOVaccino" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTOConvocazione", propOrder = {
    "codicePaziente",
    "dataConvocazione",
    "codiceConsultorio",
    "codiceAmbulatorio",
    "vaccini"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:26+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class DTOConvocazione {

    @XmlElement(name = "CodicePaziente")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:26+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected int codicePaziente;
    @XmlElement(name = "DataConvocazione", required = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:26+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar dataConvocazione;
    @XmlElement(name = "CodiceConsultorio")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:26+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String codiceConsultorio;
    @XmlElement(name = "CodiceAmbulatorio")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:26+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected int codiceAmbulatorio;
    @XmlElement(name = "Vaccini")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:26+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ArrayOfDTOVaccino vaccini;

    /**
     * Recupera il valore della proprietà codicePaziente.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:26+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public int getCodicePaziente() {
        return codicePaziente;
    }

    /**
     * Imposta il valore della proprietà codicePaziente.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:26+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCodicePaziente(int value) {
        this.codicePaziente = value;
    }

    /**
     * Recupera il valore della proprietà dataConvocazione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:26+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getDataConvocazione() {
        return dataConvocazione;
    }

    /**
     * Imposta il valore della proprietà dataConvocazione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:26+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDataConvocazione(XMLGregorianCalendar value) {
        this.dataConvocazione = value;
    }

    /**
     * Recupera il valore della proprietà codiceConsultorio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:26+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCodiceConsultorio() {
        return codiceConsultorio;
    }

    /**
     * Imposta il valore della proprietà codiceConsultorio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:26+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCodiceConsultorio(String value) {
        this.codiceConsultorio = value;
    }

    /**
     * Recupera il valore della proprietà codiceAmbulatorio.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:26+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public int getCodiceAmbulatorio() {
        return codiceAmbulatorio;
    }

    /**
     * Imposta il valore della proprietà codiceAmbulatorio.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:26+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCodiceAmbulatorio(int value) {
        this.codiceAmbulatorio = value;
    }

    /**
     * Recupera il valore della proprietà vaccini.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDTOVaccino }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:26+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:26+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setVaccini(ArrayOfDTOVaccino value) {
        this.vaccini = value;
    }

}
