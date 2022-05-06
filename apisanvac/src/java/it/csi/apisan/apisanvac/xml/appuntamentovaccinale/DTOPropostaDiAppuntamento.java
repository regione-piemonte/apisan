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
 * <p>Classe Java per DTOPropostaDiAppuntamento complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DTOPropostaDiAppuntamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataAppuntamento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DataFineAppuntamento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Vaccinazioni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Codice" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTOPropostaDiAppuntamento", propOrder = {
    "dataAppuntamento",
    "dataFineAppuntamento",
    "vaccinazioni",
    "codice",
    "descrizione"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class DTOPropostaDiAppuntamento {

    @XmlElement(name = "DataAppuntamento", required = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar dataAppuntamento;
    @XmlElement(name = "DataFineAppuntamento", required = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar dataFineAppuntamento;
    @XmlElement(name = "Vaccinazioni")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String vaccinazioni;
    @XmlElement(name = "Codice")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected int codice;
    @XmlElement(name = "Descrizione")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String descrizione;

    /**
     * Recupera il valore della proprietà dataAppuntamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getDataAppuntamento() {
        return dataAppuntamento;
    }

    /**
     * Imposta il valore della proprietà dataAppuntamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDataAppuntamento(XMLGregorianCalendar value) {
        this.dataAppuntamento = value;
    }

    /**
     * Recupera il valore della proprietà dataFineAppuntamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getDataFineAppuntamento() {
        return dataFineAppuntamento;
    }

    /**
     * Imposta il valore della proprietà dataFineAppuntamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDataFineAppuntamento(XMLGregorianCalendar value) {
        this.dataFineAppuntamento = value;
    }

    /**
     * Recupera il valore della proprietà vaccinazioni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getVaccinazioni() {
        return vaccinazioni;
    }

    /**
     * Imposta il valore della proprietà vaccinazioni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setVaccinazioni(String value) {
        this.vaccinazioni = value;
    }

    /**
     * Recupera il valore della proprietà codice.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public int getCodice() {
        return codice;
    }

    /**
     * Imposta il valore della proprietà codice.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCodice(int value) {
        this.codice = value;
    }

    /**
     * Recupera il valore della proprietà descrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Imposta il valore della proprietà descrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:15:48+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

}
