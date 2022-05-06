/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documenti.dma;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="ablConsOpeAmm" type="{http://dma.csi.it/}siNo" minOccurs="0"/>
 *         &lt;element name="alimentaFse" type="{http://dma.csi.it/}siNo" minOccurs="0"/>
 *         &lt;element name="consensoAllaCostituzioneDMA" type="{http://dma.csi.it/}siNo" minOccurs="0"/>
 *         &lt;element name="consensoMatriceRuoli" type="{http://dma.csi.it/}consensoMatriceRuolo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dataDiAggiornamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataDiValidazione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="derogaEmergenza" type="{http://dma.csi.it/}siNo" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}modalitaDiAlimentazione" minOccurs="0"/>
 *         &lt;element name="pregresso" type="{http://dma.csi.it/}siNo" minOccurs="0"/>
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
    "ablConsOpeAmm",
    "alimentaFse",
    "consensoAllaCostituzioneDMA",
    "consensoMatriceRuoli",
    "dataDiAggiornamento",
    "dataDiValidazione",
    "derogaEmergenza",
    "modalitaDiAlimentazione",
    "pregresso"
})
public class Consenso {

    protected SiNo ablConsOpeAmm;
    protected SiNo alimentaFse;
    protected SiNo consensoAllaCostituzioneDMA;
    @XmlElement(nillable = true)
    protected List<ConsensoMatriceRuolo> consensoMatriceRuoli;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDiAggiornamento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDiValidazione;
    protected SiNo derogaEmergenza;
    protected ModalitaDiAlimentazione modalitaDiAlimentazione;
    protected SiNo pregresso;

    /**
     * Recupera il valore della proprietà ablConsOpeAmm.
     * 
     * @return
     *     possible object is
     *     {@link SiNo }
     *     
     */
    public SiNo getAblConsOpeAmm() {
        return ablConsOpeAmm;
    }

    /**
     * Imposta il valore della proprietà ablConsOpeAmm.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNo }
     *     
     */
    public void setAblConsOpeAmm(SiNo value) {
        this.ablConsOpeAmm = value;
    }

    /**
     * Recupera il valore della proprietà alimentaFse.
     * 
     * @return
     *     possible object is
     *     {@link SiNo }
     *     
     */
    public SiNo getAlimentaFse() {
        return alimentaFse;
    }

    /**
     * Imposta il valore della proprietà alimentaFse.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNo }
     *     
     */
    public void setAlimentaFse(SiNo value) {
        this.alimentaFse = value;
    }

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
     * Gets the value of the consensoMatriceRuoli property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consensoMatriceRuoli property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsensoMatriceRuoli().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsensoMatriceRuolo }
     * 
     * 
     */
    public List<ConsensoMatriceRuolo> getConsensoMatriceRuoli() {
        if (consensoMatriceRuoli == null) {
            consensoMatriceRuoli = new ArrayList<ConsensoMatriceRuolo>();
        }
        return this.consensoMatriceRuoli;
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

    /**
     * Recupera il valore della proprietà pregresso.
     * 
     * @return
     *     possible object is
     *     {@link SiNo }
     *     
     */
    public SiNo getPregresso() {
        return pregresso;
    }

    /**
     * Imposta il valore della proprietà pregresso.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNo }
     *     
     */
    public void setPregresso(SiNo value) {
        this.pregresso = value;
    }

}
