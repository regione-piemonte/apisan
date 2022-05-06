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
 * <p>Classe Java per consensoPerRuolo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="consensoPerRuolo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conferimentoConsenso" type="{http://dma.csi.it/}siNo" minOccurs="0"/>
 *         &lt;element name="dataDiAggiornamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ruoloDMA" type="{http://dma.csi.it/}ruoloDMA" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consensoPerRuolo", propOrder = {
    "conferimentoConsenso",
    "dataDiAggiornamento",
    "ruoloDMA"
})
public class ConsensoPerRuolo {

    @XmlSchemaType(name = "string")
    protected SiNo conferimentoConsenso;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDiAggiornamento;
    protected RuoloDMA ruoloDMA;

    /**
     * Recupera il valore della proprietà conferimentoConsenso.
     * 
     * @return
     *     possible object is
     *     {@link SiNo }
     *     
     */
    public SiNo getConferimentoConsenso() {
        return conferimentoConsenso;
    }

    /**
     * Imposta il valore della proprietà conferimentoConsenso.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNo }
     *     
     */
    public void setConferimentoConsenso(SiNo value) {
        this.conferimentoConsenso = value;
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
     * Recupera il valore della proprietà ruoloDMA.
     * 
     * @return
     *     possible object is
     *     {@link RuoloDMA }
     *     
     */
    public RuoloDMA getRuoloDMA() {
        return ruoloDMA;
    }

    /**
     * Imposta il valore della proprietà ruoloDMA.
     * 
     * @param value
     *     allowed object is
     *     {@link RuoloDMA }
     *     
     */
    public void setRuoloDMA(RuoloDMA value) {
        this.ruoloDMA = value;
    }

}
