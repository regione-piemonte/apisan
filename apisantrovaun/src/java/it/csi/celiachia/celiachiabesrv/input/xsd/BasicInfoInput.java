/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.celiachia.celiachiabesrv.input.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BasicInfoInput complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BasicInfoInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shibIdentitaCodiceFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xCodiceServizio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xForwardedFor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xRequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicInfoInput", propOrder = {
    "shibIdentitaCodiceFiscale",
    "xCodiceServizio",
    "xForwardedFor",
    "xRequestId"
})
@XmlSeeAlso({
    BCKRIGPinGOC.class,
    RicercaErogazioniAssistito.class,
    GetPinAssistito.class,
    VerificaSaldoAssistito.class,
    UsaPinDaQRCodeGOC.class,
    RigeneraPinRequest.class,
    Richiedente.class
})
public class BasicInfoInput {

    @XmlElementRef(name = "shibIdentitaCodiceFiscale", namespace = "http://input.celiachiabesrv.celiachia.csi.it/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shibIdentitaCodiceFiscale;
    @XmlElementRef(name = "xCodiceServizio", namespace = "http://input.celiachiabesrv.celiachia.csi.it/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xCodiceServizio;
    @XmlElementRef(name = "xForwardedFor", namespace = "http://input.celiachiabesrv.celiachia.csi.it/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xForwardedFor;
    @XmlElementRef(name = "xRequestId", namespace = "http://input.celiachiabesrv.celiachia.csi.it/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xRequestId;

    /**
     * Recupera il valore della proprieta shibIdentitaCodiceFiscale.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShibIdentitaCodiceFiscale() {
        return shibIdentitaCodiceFiscale;
    }

    /**
     * Imposta il valore della proprieta shibIdentitaCodiceFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShibIdentitaCodiceFiscale(JAXBElement<String> value) {
        this.shibIdentitaCodiceFiscale = value;
    }

    /**
     * Recupera il valore della proprieta xCodiceServizio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXCodiceServizio() {
        return xCodiceServizio;
    }

    /**
     * Imposta il valore della proprieta xCodiceServizio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXCodiceServizio(JAXBElement<String> value) {
        this.xCodiceServizio = value;
    }

    /**
     * Recupera il valore della proprieta xForwardedFor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXForwardedFor() {
        return xForwardedFor;
    }

    /**
     * Imposta il valore della proprieta xForwardedFor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXForwardedFor(JAXBElement<String> value) {
        this.xForwardedFor = value;
    }

    /**
     * Recupera il valore della proprieta xRequestId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXRequestId() {
        return xRequestId;
    }

    /**
     * Imposta il valore della proprieta xRequestId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXRequestId(JAXBElement<String> value) {
        this.xRequestId = value;
    }

}
