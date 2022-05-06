/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per setSintomoResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="setSintomoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="sintomo" type="{http://dmaclbluc.dma.csi.it/}sintomoResponse" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setSintomoResponse", propOrder = {
    "sintomo"
})
public class SetSintomoResponse
    extends ServiceResponse
{

    protected SintomoResponse sintomo;

    /**
     * Recupera il valore della proprietà sintomo.
     * 
     * @return
     *     possible object is
     *     {@link SintomoResponse }
     *     
     */
    public SintomoResponse getSintomo() {
        return sintomo;
    }

    /**
     * Imposta il valore della proprietà sintomo.
     * 
     * @param value
     *     allowed object is
     *     {@link SintomoResponse }
     *     
     */
    public void setSintomo(SintomoResponse value) {
        this.sintomo = value;
    }

}
