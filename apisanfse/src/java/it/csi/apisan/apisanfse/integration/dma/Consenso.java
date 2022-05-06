/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.dma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per consenso complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="consenso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consensoAllaCostituzioneDMA" type="{http://dma.csi.it/}siNo" minOccurs="0"/>
 *         &lt;element name="dataDiAggiornamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataDiValidazione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="derogaEmergenza" type="{http://dma.csi.it/}siNo" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}modalitaDiAlimentazione" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consenso", propOrder = {
    "consensoAllaCostituzioneDMA",
    "dataDiAggiornamento",
    "dataDiValidazione",
    "derogaEmergenza",
    "modalitaDiAlimentazione"
})
public class Consenso {

    @XmlSchemaType(name = "string")
    protected SiNo consensoAllaCostituzioneDMA;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDiAggiornamento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDiValidazione;
    @XmlSchemaType(name = "string")
    protected SiNo derogaEmergenza;
    protected ModalitaDiAlimentazione modalitaDiAlimentazione;

    /**
     * Recupera il valore della proprietà consensoAllaCostituzioneDMA.
     * 
     * @return
     *     possible object is
     *     {@link SiNo }
     *     
     */
    public SiNo getConsensoAllaCostituzioneDMA() {
        return consensoAllaCostituzioneDMA;
    }

    /**
     * Imposta il valore della proprietà consensoAllaCostituzioneDMA.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNo }
     *     
     */
    public void setConsensoAllaCostituzioneDMA(SiNo value) {
        this.consensoAllaCostituzioneDMA = value;
    }

    /**
     * Recupera il valore della proprietà dataDiAggiornamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDiAggiornamento() {
        return dataDiAggiornamento;
    }

    /**
     * Imposta il valore della proprietà dataDiAggiornamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDiAggiornamento(XMLGregorianCalendar value) {
        this.dataDiAggiornamento = value;
    }

    /**
     * Recupera il valore della proprietà dataDiValidazione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDiValidazione() {
        return dataDiValidazione;
    }

    /**
     * Imposta il valore della proprietà dataDiValidazione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDiValidazione(XMLGregorianCalendar value) {
        this.dataDiValidazione = value;
    }

    /**
     * Recupera il valore della proprietà derogaEmergenza.
     * 
     * @return
     *     possible object is
     *     {@link SiNo }
     *     
     */
    public SiNo getDerogaEmergenza() {
        return derogaEmergenza;
    }

    /**
     * Imposta il valore della proprietà derogaEmergenza.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNo }
     *     
     */
    public void setDerogaEmergenza(SiNo value) {
        this.derogaEmergenza = value;
    }

    /**
     * Recupera il valore della proprietà modalitaDiAlimentazione.
     * 
     * @return
     *     possible object is
     *     {@link ModalitaDiAlimentazione }
     *     
     */
    public ModalitaDiAlimentazione getModalitaDiAlimentazione() {
        return modalitaDiAlimentazione;
    }

    /**
     * Imposta il valore della proprietà modalitaDiAlimentazione.
     * 
     * @param value
     *     allowed object is
     *     {@link ModalitaDiAlimentazione }
     *     
     */
    public void setModalitaDiAlimentazione(ModalitaDiAlimentazione value) {
        this.modalitaDiAlimentazione = value;
    }

}
