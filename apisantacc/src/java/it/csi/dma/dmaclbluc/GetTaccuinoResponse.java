/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getTaccuinoResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getTaccuinoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="taccuino" type="{http://dmaclbluc.dma.csi.it/}taccuino" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTaccuinoResponse", propOrder = {
    "taccuino"
})
public class GetTaccuinoResponse
    extends ServiceResponse
{

    protected Taccuino taccuino;

    /**
     * Recupera il valore della proprietà taccuino.
     * 
     * @return
     *     possible object is
     *     {@link Taccuino }
     *     
     */
    public Taccuino getTaccuino() {
        return taccuino;
    }

    /**
     * Imposta il valore della proprietà taccuino.
     * 
     * @param value
     *     allowed object is
     *     {@link Taccuino }
     *     
     */
    public void setTaccuino(Taccuino value) {
        this.taccuino = value;
    }

}
