/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per setDoloreResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="setDoloreResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="dolore" type="{http://dmaclbluc.dma.csi.it/}doloreResponse" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setDoloreResponse", propOrder = {
    "dolore"
})
public class SetDoloreResponse
    extends ServiceResponse
{

    protected DoloreResponse dolore;

    /**
     * Recupera il valore della proprietà dolore.
     * 
     * @return
     *     possible object is
     *     {@link DoloreResponse }
     *     
     */
    public DoloreResponse getDolore() {
        return dolore;
    }

    /**
     * Imposta il valore della proprietà dolore.
     * 
     * @param value
     *     allowed object is
     *     {@link DoloreResponse }
     *     
     */
    public void setDolore(DoloreResponse value) {
        this.dolore = value;
    }

}
