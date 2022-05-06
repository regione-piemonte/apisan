/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.farmab.interfacews.msg.farab;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *     &lt;extension base="{http://farab.msg.interfacews.farmab.dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="farmaciaOccasionale" type="{http://farab.msg.interfacews.farmab.dma.csi.it/}farmaciaOccasionaleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "farmaciaOccasionale"
})
@XmlRootElement(name = "autorizzaFarmaciaOccasionaleResponse")
public class AutorizzaFarmaciaOccasionaleResponse
    extends ServiceResponse
{

    protected FarmaciaOccasionaleType farmaciaOccasionale;

    /**
     * Recupera il valore della proprietà farmaciaOccasionale.
     * 
     * @return
     *     possible object is
     *     {@link FarmaciaOccasionaleType }
     *     
     */
    public FarmaciaOccasionaleType getFarmaciaOccasionale() {
        return farmaciaOccasionale;
    }

    /**
     * Imposta il valore della proprietà farmaciaOccasionale.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmaciaOccasionaleType }
     *     
     */
    public void setFarmaciaOccasionale(FarmaciaOccasionaleType value) {
        this.farmaciaOccasionale = value;
    }

}
