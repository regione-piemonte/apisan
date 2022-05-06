/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisancons.integration.conspref.consprefbe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per entita complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="entita">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataCreazione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataModifica" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataCancellazione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="loginOperazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ruoloOperazione" type="{http://consprefbe.csi.it/}ruoloOperazione" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entita", propOrder = {
    "dataCreazione",
    "dataModifica",
    "dataCancellazione",
    "loginOperazione",
    "ruoloOperazione"
})
@XmlSeeAlso({
    Codifica.class
})
public abstract class Entita {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCreazione;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataModifica;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCancellazione;
    protected String loginOperazione;
    protected RuoloOperazione ruoloOperazione;

    /**
     * Recupera il valore della proprietà dataCreazione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCreazione() {
        return dataCreazione;
    }

    /**
     * Imposta il valore della proprietà dataCreazione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCreazione(XMLGregorianCalendar value) {
        this.dataCreazione = value;
    }

    /**
     * Recupera il valore della proprietà dataModifica.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataModifica() {
        return dataModifica;
    }

    /**
     * Imposta il valore della proprietà dataModifica.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataModifica(XMLGregorianCalendar value) {
        this.dataModifica = value;
    }

    /**
     * Recupera il valore della proprietà dataCancellazione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCancellazione() {
        return dataCancellazione;
    }

    /**
     * Imposta il valore della proprietà dataCancellazione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCancellazione(XMLGregorianCalendar value) {
        this.dataCancellazione = value;
    }

    /**
     * Recupera il valore della proprietà loginOperazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginOperazione() {
        return loginOperazione;
    }

    /**
     * Imposta il valore della proprietà loginOperazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginOperazione(String value) {
        this.loginOperazione = value;
    }

    /**
     * Recupera il valore della proprietà ruoloOperazione.
     * 
     * @return
     *     possible object is
     *     {@link RuoloOperazione }
     *     
     */
    public RuoloOperazione getRuoloOperazione() {
        return ruoloOperazione;
    }

    /**
     * Imposta il valore della proprietà ruoloOperazione.
     * 
     * @param value
     *     allowed object is
     *     {@link RuoloOperazione }
     *     
     */
    public void setRuoloOperazione(RuoloOperazione value) {
        this.ruoloOperazione = value;
    }

}
