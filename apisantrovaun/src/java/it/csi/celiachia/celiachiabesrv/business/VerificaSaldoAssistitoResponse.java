/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.celiachia.celiachiabesrv.business;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://output.celiachiabesrv.celiachia.csi.it/xsd}VerificaSaldoAssistitoResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "_return"
})
@XmlRootElement(name = "verificaSaldoAssistitoResponse")
public class VerificaSaldoAssistitoResponse {

    @XmlElementRef(name = "return", namespace = "http://business.celiachiabesrv.celiachia.csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<it.csi.celiachia.celiachiabesrv.output.xsd.VerificaSaldoAssistitoResponse> _return;

    /**
     * Recupera il valore della proprieta return.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link it.csi.celiachia.celiachiabesrv.output.xsd.VerificaSaldoAssistitoResponse }{@code >}
     *     
     */
    public JAXBElement<it.csi.celiachia.celiachiabesrv.output.xsd.VerificaSaldoAssistitoResponse> getReturn() {
        return _return;
    }

    /**
     * Imposta il valore della proprieta return.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link it.csi.celiachia.celiachiabesrv.output.xsd.VerificaSaldoAssistitoResponse }{@code >}
     *     
     */
    public void setReturn(JAXBElement<it.csi.celiachia.celiachiabesrv.output.xsd.VerificaSaldoAssistitoResponse> value) {
        this._return = value;
    }

}
