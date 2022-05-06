/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.celiachia.celiachiabesrv.output.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BCKRIGPinGOCResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BCKRIGPinGOCResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://output.celiachiabesrv.celiachia.csi.it/xsd}BasicEsitoOutput">
 *       &lt;sequence>
 *         &lt;element name="errore" type="{http://output.celiachiabesrv.celiachia.csi.it/xsd}Errore" minOccurs="0"/>
 *         &lt;element name="pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BCKRIGPinGOCResponse", propOrder = {
    "errore",
    "pin"
})
public class BCKRIGPinGOCResponse
    extends BasicEsitoOutput
{

    @XmlElementRef(name = "errore", namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Errore> errore;
    @XmlElementRef(name = "pin", namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pin;

    /**
     * Recupera il valore della proprieta errore.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Errore }{@code >}
     *     
     */
    public JAXBElement<Errore> getErrore() {
        return errore;
    }

    /**
     * Imposta il valore della proprieta errore.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Errore }{@code >}
     *     
     */
    public void setErrore(JAXBElement<Errore> value) {
        this.errore = value;
    }

    /**
     * Recupera il valore della proprieta pin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPin() {
        return pin;
    }

    /**
     * Imposta il valore della proprieta pin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPin(JAXBElement<String> value) {
        this.pin = value;
    }

}
