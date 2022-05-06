/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per setFarmacoRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="setFarmacoRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}requestCommon">
 *       &lt;sequence>
 *         &lt;element name="assunzioneFarmaco" type="{http://dmaclbluc.dma.csi.it/}assunzioneFarmaco" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setFarmacoRequest", propOrder = {
    "assunzioneFarmaco"
})
public class SetFarmacoRequest
    extends RequestCommon
{

    protected AssunzioneFarmaco assunzioneFarmaco;

    /**
     * Recupera il valore della proprietà assunzioneFarmaco.
     * 
     * @return
     *     possible object is
     *     {@link AssunzioneFarmaco }
     *     
     */
    public AssunzioneFarmaco getAssunzioneFarmaco() {
        return assunzioneFarmaco;
    }

    /**
     * Imposta il valore della proprietà assunzioneFarmaco.
     * 
     * @param value
     *     allowed object is
     *     {@link AssunzioneFarmaco }
     *     
     */
    public void setAssunzioneFarmaco(AssunzioneFarmaco value) {
        this.assunzioneFarmaco = value;
    }

}
