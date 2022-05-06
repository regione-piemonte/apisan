/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.centrivaccinali;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Ambulatorio complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Ambulatorio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codice" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Orari" type="{}ArrayOfOrario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ambulatorio", propOrder = {
    "codice",
    "descrizione",
    "orari"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:04+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Ambulatorio {

    @XmlElement(name = "Codice")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:04+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected int codice;
    @XmlElement(name = "Descrizione")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:04+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String descrizione;
    @XmlElement(name = "Orari")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:04+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ArrayOfOrario orari;

    /**
     * Recupera il valore della proprietà codice.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:04+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public int getCodice() {
        return codice;
    }

    /**
     * Imposta il valore della proprietà codice.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:04+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:04+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:04+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

    /**
     * Recupera il valore della proprietà orari.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrario }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:04+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public ArrayOfOrario getOrari() {
        return orari;
    }

    /**
     * Imposta il valore della proprietà orari.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrario }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:16:04+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setOrari(ArrayOfOrario value) {
        this.orari = value;
    }

}
