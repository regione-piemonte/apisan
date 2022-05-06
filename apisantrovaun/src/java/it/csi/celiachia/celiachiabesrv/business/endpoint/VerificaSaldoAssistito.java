/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.celiachia.celiachiabesrv.business.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import it.csi.celiachia.celiachiabesrv.input.xsd.SaldoBuonoRequest;


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
 *         &lt;element name="saldoBuonoInput" type="{http://input.celiachiabesrv.celiachia.csi.it/xsd}SaldoBuonoRequest" minOccurs="0"/>
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
    "saldoBuonoInput"
})
@XmlRootElement(name = "verificaSaldoAssistito")
public class VerificaSaldoAssistito {

    @XmlElementRef(name = "saldoBuonoInput", namespace = "http://endpoint.business.celiachiabesrv.celiachia.csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<SaldoBuonoRequest> saldoBuonoInput;

    /**
     * Recupera il valore della proprieta saldoBuonoInput.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SaldoBuonoRequest }{@code >}
     *     
     */
    public JAXBElement<SaldoBuonoRequest> getSaldoBuonoInput() {
        return saldoBuonoInput;
    }

    /**
     * Imposta il valore della proprieta saldoBuonoInput.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SaldoBuonoRequest }{@code >}
     *     
     */
    public void setSaldoBuonoInput(JAXBElement<SaldoBuonoRequest> value) {
        this.saldoBuonoInput = value;
    }

}
