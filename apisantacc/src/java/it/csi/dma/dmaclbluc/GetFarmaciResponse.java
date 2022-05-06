/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getFarmaciResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getFarmaciResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="listaAssunzioneFarmaci" type="{http://dmaclbluc.dma.csi.it/}listaAssunzioneFarmaci" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFarmaciResponse", propOrder = {
    "listaAssunzioneFarmaci"
})
public class GetFarmaciResponse
    extends ServiceResponse
{

    protected ListaAssunzioneFarmaci listaAssunzioneFarmaci;

    /**
     * Recupera il valore della proprietà listaAssunzioneFarmaci.
     * 
     * @return
     *     possible object is
     *     {@link ListaAssunzioneFarmaci }
     *     
     */
    public ListaAssunzioneFarmaci getListaAssunzioneFarmaci() {
        return listaAssunzioneFarmaci;
    }

    /**
     * Imposta il valore della proprietà listaAssunzioneFarmaci.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaAssunzioneFarmaci }
     *     
     */
    public void setListaAssunzioneFarmaci(ListaAssunzioneFarmaci value) {
        this.listaAssunzioneFarmaci = value;
    }

}
