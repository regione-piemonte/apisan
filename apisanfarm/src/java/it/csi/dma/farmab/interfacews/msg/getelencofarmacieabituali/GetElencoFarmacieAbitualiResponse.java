/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.farmab.interfacews.msg.getelencofarmacieabituali;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getElencoFarmacieAbitualiResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getElencoFarmacieAbitualiResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://getelencofarmacieabituali.msg.interfacews.farmab.dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="farmacieAbituali" type="{http://getelencofarmacieabituali.msg.interfacews.farmab.dma.csi.it/}elencoFarmacieType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getElencoFarmacieAbitualiResponse", propOrder = {
    "farmacieAbituali"
})
public class GetElencoFarmacieAbitualiResponse
    extends ServiceResponse
{

    protected ElencoFarmacieType farmacieAbituali;

    /**
     * Recupera il valore della proprietà farmacieAbituali.
     * 
     * @return
     *     possible object is
     *     {@link ElencoFarmacieType }
     *     
     */
    public ElencoFarmacieType getFarmacieAbituali() {
        return farmacieAbituali;
    }

    /**
     * Imposta il valore della proprietà farmacieAbituali.
     * 
     * @param value
     *     allowed object is
     *     {@link ElencoFarmacieType }
     *     
     */
    public void setFarmacieAbituali(ElencoFarmacieType value) {
        this.farmacieAbituali = value;
    }

}
