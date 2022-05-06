/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.iccws.dmacc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getFarmacieAderentiResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getFarmacieAderentiResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmacc.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element ref="{http://dma.csi.it/}farmacie" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFarmacieAderentiResponse", propOrder = {
    "farmacie"
})
public class GetFarmacieAderentiResponse
    extends ServiceResponse
{

    @XmlElement(namespace = "http://dma.csi.it/")
    protected Farmacie farmacie;

    /**
     * Recupera il valore della proprietà farmacie.
     * 
     * @return
     *     possible object is
     *     {@link Farmacie }
     *     
     */
    public Farmacie getFarmacie() {
        return farmacie;
    }

    /**
     * Imposta il valore della proprietà farmacie.
     * 
     * @param value
     *     allowed object is
     *     {@link Farmacie }
     *     
     */
    public void setFarmacie(Farmacie value) {
        this.farmacie = value;
    }

}
