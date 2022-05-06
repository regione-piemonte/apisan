/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.vaccinazione;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Vaccinazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Vaccinazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dose" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vaccinazione", propOrder = {
    "codice",
    "descrizione",
    "dose"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Vaccinazione {

    @XmlElement(name = "Codice")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String codice;
    @XmlElement(name = "Descrizione")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String descrizione;
    @XmlElement(name = "Dose")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected int dose;

    /**
     * Recupera il valore della proprietà codice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCodice() {
        return codice;
    }

    /**
     * Imposta il valore della proprietà codice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCodice(String value) {
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

    /**
     * Recupera il valore della proprietà dose.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public int getDose() {
        return dose;
    }

    /**
     * Imposta il valore della proprietà dose.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDose(int value) {
        this.dose = value;
    }

}
