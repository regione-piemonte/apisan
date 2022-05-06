/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per setFarmacoResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="setFarmacoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="assunzioneFarmaco" type="{http://dmaclbluc.dma.csi.it/}assunzioneFarmacoResponse" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setFarmacoResponse", propOrder = {
    "assunzioneFarmaco"
})
public class SetFarmacoResponse
    extends ServiceResponse
{

    protected AssunzioneFarmacoResponse assunzioneFarmaco;

    /**
     * Recupera il valore della proprietà assunzioneFarmaco.
     * 
     * @return
     *     possible object is
     *     {@link AssunzioneFarmacoResponse }
     *     
     */
    public AssunzioneFarmacoResponse getAssunzioneFarmaco() {
        return assunzioneFarmaco;
    }

    /**
     * Imposta il valore della proprietà assunzioneFarmaco.
     * 
     * @param value
     *     allowed object is
     *     {@link AssunzioneFarmacoResponse }
     *     
     */
    public void setAssunzioneFarmaco(AssunzioneFarmacoResponse value) {
        this.assunzioneFarmaco = value;
    }

}
