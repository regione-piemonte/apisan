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
 * <p>Classe Java per doloreResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="doloreResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}commonInfo">
 *       &lt;sequence>
 *         &lt;element name="dolore" type="{http://dmaclbluc.dma.csi.it/}dolore" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doloreResponse", propOrder = {
    "dolore"
})
public class DoloreResponse
    extends CommonInfo
{

    @XmlElement(namespace = "")
    protected Dolore dolore;

    /**
     * Recupera il valore della proprietà dolore.
     * 
     * @return
     *     possible object is
     *     {@link Dolore }
     *     
     */
    public Dolore getDolore() {
        return dolore;
    }

    /**
     * Imposta il valore della proprietà dolore.
     * 
     * @param value
     *     allowed object is
     *     {@link Dolore }
     *     
     */
    public void setDolore(Dolore value) {
        this.dolore = value;
    }

}
