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
 * <p>Classe Java per VaccinazioneEseguita complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VaccinazioneEseguita">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Somministrazione" type="{}DTO" minOccurs="0"/>
 *         &lt;element name="SomministrazioneDaPagare" type="{}DTOPagato" minOccurs="0"/>
 *         &lt;element name="SetPagato" type="{}PostResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VaccinazioneEseguita", propOrder = {
    "somministrazione",
    "somministrazioneDaPagare",
    "setPagato"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class VaccinazioneEseguita {

    @XmlElement(name = "Somministrazione")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DTO somministrazione;
    @XmlElement(name = "SomministrazioneDaPagare")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DTOPagato somministrazioneDaPagare;
    @XmlElement(name = "SetPagato")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected PostResult setPagato;

    /**
     * Recupera il valore della proprietà somministrazione.
     * 
     * @return
     *     possible object is
     *     {@link DTO }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DTO getSomministrazione() {
        return somministrazione;
    }

    /**
     * Imposta il valore della proprietà somministrazione.
     * 
     * @param value
     *     allowed object is
     *     {@link DTO }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSomministrazione(DTO value) {
        this.somministrazione = value;
    }

    /**
     * Recupera il valore della proprietà somministrazioneDaPagare.
     * 
     * @return
     *     possible object is
     *     {@link DTOPagato }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DTOPagato getSomministrazioneDaPagare() {
        return somministrazioneDaPagare;
    }

    /**
     * Imposta il valore della proprietà somministrazioneDaPagare.
     * 
     * @param value
     *     allowed object is
     *     {@link DTOPagato }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSomministrazioneDaPagare(DTOPagato value) {
        this.somministrazioneDaPagare = value;
    }

    /**
     * Recupera il valore della proprietà setPagato.
     * 
     * @return
     *     possible object is
     *     {@link PostResult }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public PostResult getSetPagato() {
        return setPagato;
    }

    /**
     * Imposta il valore della proprietà setPagato.
     * 
     * @param value
     *     allowed object is
     *     {@link PostResult }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSetPagato(PostResult value) {
        this.setPagato = value;
    }

}
