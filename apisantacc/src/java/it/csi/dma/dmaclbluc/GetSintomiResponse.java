/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getSintomiResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getSintomiResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="listaSintomi" type="{http://dmaclbluc.dma.csi.it/}listaSintomi" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSintomiResponse", propOrder = {
    "listaSintomi"
})
public class GetSintomiResponse
    extends ServiceResponse
{

    protected ListaSintomi listaSintomi;

    /**
     * Recupera il valore della proprietà listaSintomi.
     * 
     * @return
     *     possible object is
     *     {@link ListaSintomi }
     *     
     */
    public ListaSintomi getListaSintomi() {
        return listaSintomi;
    }

    /**
     * Imposta il valore della proprietà listaSintomi.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaSintomi }
     *     
     */
    public void setListaSintomi(ListaSintomi value) {
        this.listaSintomi = value;
    }

}
