/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.associazioni.def.opessanws.opessan;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per AssociazioniAggregazioniBody complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AssociazioniAggregazioniBody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAura" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="azienda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataInizio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="qualifica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indAdesioniAttive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociazioniAggregazioniBody", propOrder = {
    "idAura",
    "azienda",
    "dataInizio",
    "qualifica",
    "indAdesioniAttive"
})
public class AssociazioniAggregazioniBody {

    @XmlElement(required = true)
    protected String idAura;
    protected String azienda;
    @XmlElementRef(name = "dataInizio", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataInizio;
    protected String qualifica;
    protected String indAdesioniAttive;

    /**
     * Recupera il valore della proprieta idAura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAura() {
        return idAura;
    }

    /**
     * Imposta il valore della proprieta idAura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAura(String value) {
        this.idAura = value;
    }

    /**
     * Recupera il valore della proprieta azienda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAzienda() {
        return azienda;
    }

    /**
     * Imposta il valore della proprieta azienda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAzienda(String value) {
        this.azienda = value;
    }

    /**
     * Recupera il valore della proprieta dataInizio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataInizio() {
        return dataInizio;
    }

    /**
     * Imposta il valore della proprieta dataInizio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataInizio(JAXBElement<XMLGregorianCalendar> value) {
        this.dataInizio = value;
    }

    /**
     * Recupera il valore della proprieta qualifica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifica() {
        return qualifica;
    }

    /**
     * Imposta il valore della proprieta qualifica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifica(String value) {
        this.qualifica = value;
    }

    /**
     * Recupera il valore della proprieta indAdesioniAttive.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndAdesioniAttive() {
        return indAdesioniAttive;
    }

    /**
     * Imposta il valore della proprieta indAdesioniAttive.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndAdesioniAttive(String value) {
        this.indAdesioniAttive = value;
    }

}
