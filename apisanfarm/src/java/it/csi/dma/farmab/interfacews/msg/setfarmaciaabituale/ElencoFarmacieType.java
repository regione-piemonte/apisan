/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.farmab.interfacews.msg.setfarmaciaabituale;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per elencoFarmacieType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="elencoFarmacieType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="farmaciaAbituale" type="{http://setfarmaciaabituale.msg.interfacews.farmab.dma.csi.it/}farmacia" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "elencoFarmacieType", propOrder = {
    "farmaciaAbituale"
})
public class ElencoFarmacieType {

    protected Farmacia farmaciaAbituale;

    /**
     * Recupera il valore della proprietà farmaciaAbituale.
     * 
     * @return
     *     possible object is
     *     {@link Farmacia }
     *     
     */
    public Farmacia getFarmaciaAbituale() {
        return farmaciaAbituale;
    }

    /**
     * Imposta il valore della proprietà farmaciaAbituale.
     * 
     * @param value
     *     allowed object is
     *     {@link Farmacia }
     *     
     */
    public void setFarmaciaAbituale(Farmacia value) {
        this.farmaciaAbituale = value;
    }

}
