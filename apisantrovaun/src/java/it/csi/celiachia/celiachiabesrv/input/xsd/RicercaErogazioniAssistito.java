/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.celiachia.celiachiabesrv.input.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per RicercaErogazioniAssistito complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RicercaErogazioniAssistito">
 *   &lt;complexContent>
 *     &lt;extension base="{http://input.celiachiabesrv.celiachia.csi.it/xsd}BasicInfoInput">
 *       &lt;sequence>
 *         &lt;element name="citId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataFine" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="dataInizio" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RicercaErogazioniAssistito", propOrder = {
    "citId",
    "dataFine",
    "dataInizio"
})
public class RicercaErogazioniAssistito
    extends BasicInfoInput
{

    @XmlElementRef(name = "citId", namespace = "http://input.celiachiabesrv.celiachia.csi.it/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> citId;
    @XmlElementRef(name = "dataFine", namespace = "http://input.celiachiabesrv.celiachia.csi.it/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataFine;
    @XmlElementRef(name = "dataInizio", namespace = "http://input.celiachiabesrv.celiachia.csi.it/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataInizio;

    /**
     * Recupera il valore della proprieta citId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCitId() {
        return citId;
    }

    /**
     * Imposta il valore della proprieta citId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCitId(JAXBElement<String> value) {
        this.citId = value;
    }

    /**
     * Recupera il valore della proprieta dataFine.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataFine() {
        return dataFine;
    }

    /**
     * Imposta il valore della proprieta dataFine.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataFine(JAXBElement<XMLGregorianCalendar> value) {
        this.dataFine = value;
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

}
