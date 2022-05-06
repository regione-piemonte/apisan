/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per sintomoResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="sintomoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}commonInfo">
 *       &lt;sequence>
 *         &lt;element name="sintomo" type="{http://dmaclbluc.dma.csi.it/}sintomo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sintomoResponse", propOrder = {
    "sintomo"
})
public class SintomoResponse
    extends CommonInfo
{

    @XmlElement(namespace = "")
    protected Sintomo sintomo;

    /**
     * Recupera il valore della proprietà sintomo.
     * 
     * @return
     *     possible object is
     *     {@link Sintomo }
     *     
     */
    public Sintomo getSintomo() {
        return sintomo;
    }

    /**
     * Imposta il valore della proprietà sintomo.
     * 
     * @param value
     *     allowed object is
     *     {@link Sintomo }
     *     
     */
    public void setSintomo(Sintomo value) {
        this.sintomo = value;
    }

}
