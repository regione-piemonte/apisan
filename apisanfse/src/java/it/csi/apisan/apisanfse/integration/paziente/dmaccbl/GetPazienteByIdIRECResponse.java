/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.paziente.dmaccbl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import it.csi.apisan.apisanfse.integration.paziente.dma.Paziente;


/**
 * <p>Classe Java per getPazienteByIdIRECResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getPazienteByIdIRECResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaccbl.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="paziente" type="{http://dma.csi.it/}paziente" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPazienteByIdIRECResponse", propOrder = {
    "paziente"
})
public class GetPazienteByIdIRECResponse
    extends ServiceResponse
{

    @XmlElementRef(name = "paziente", type = JAXBElement.class, required = false)
    protected JAXBElement<Paziente> paziente;

    /**
     * Recupera il valore della proprietà paziente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Paziente }{@code >}
     *     
     */
    public JAXBElement<Paziente> getPaziente() {
        return paziente;
    }

    /**
     * Imposta il valore della proprietà paziente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Paziente }{@code >}
     *     
     */
    public void setPaziente(JAXBElement<Paziente> value) {
        this.paziente = value;
    }

}
