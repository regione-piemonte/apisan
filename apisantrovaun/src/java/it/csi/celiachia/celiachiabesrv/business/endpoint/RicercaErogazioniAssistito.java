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
import it.csi.celiachia.celiachiabesrv.input.xsd.ElencoErogRequest;


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
 *         &lt;element name="elencoErogInput" type="{http://input.celiachiabesrv.celiachia.csi.it/xsd}ElencoErogRequest" minOccurs="0"/>
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
    "elencoErogInput"
})
@XmlRootElement(name = "ricercaErogazioniAssistito")
public class RicercaErogazioniAssistito {

    @XmlElementRef(name = "elencoErogInput", namespace = "http://endpoint.business.celiachiabesrv.celiachia.csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<ElencoErogRequest> elencoErogInput;

    /**
     * Recupera il valore della proprieta elencoErogInput.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElencoErogRequest }{@code >}
     *     
     */
    public JAXBElement<ElencoErogRequest> getElencoErogInput() {
        return elencoErogInput;
    }

    /**
     * Imposta il valore della proprieta elencoErogInput.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElencoErogRequest }{@code >}
     *     
     */
    public void setElencoErogInput(JAXBElement<ElencoErogRequest> value) {
        this.elencoErogInput = value;
    }

}
