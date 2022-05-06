/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.celiachia.celiachiabesrv.output.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BasicEsitoOutput complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BasicEsitoOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="esito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messaggioEsito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicEsitoOutput", propOrder = {
    "esito",
    "messaggioEsito"
})
@XmlSeeAlso({
    GetPinAssistitoResponse.class,
    BCKRIGPinGOCResponse.class,
    VerificaSaldoAssistitoResponse.class,
    RigeneraPinResponse.class,
    RicercaErogazioniAssistitoResponse.class,
    UsaPinDaQRCodeGOCResponse.class
})
public class BasicEsitoOutput {

    @XmlElementRef(name = "esito", namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> esito;
    @XmlElementRef(name = "messaggioEsito", namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> messaggioEsito;

    /**
     * Recupera il valore della proprieta esito.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEsito() {
        return esito;
    }

    /**
     * Imposta il valore della proprieta esito.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEsito(JAXBElement<String> value) {
        this.esito = value;
    }

    /**
     * Recupera il valore della proprieta messaggioEsito.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessaggioEsito() {
        return messaggioEsito;
    }

    /**
     * Imposta il valore della proprieta messaggioEsito.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessaggioEsito(JAXBElement<String> value) {
        this.messaggioEsito = value;
    }

}
