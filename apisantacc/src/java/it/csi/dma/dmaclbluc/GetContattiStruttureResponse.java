/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getContattiStruttureResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getContattiStruttureResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="listaContattiStrutture" type="{http://dmaclbluc.dma.csi.it/}listaContattiStrutture" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getContattiStruttureResponse", propOrder = {
    "listaContattiStrutture"
})
public class GetContattiStruttureResponse
    extends ServiceResponse
{

    protected ListaContattiStrutture listaContattiStrutture;

    /**
     * Recupera il valore della proprietà listaContattiStrutture.
     * 
     * @return
     *     possible object is
     *     {@link ListaContattiStrutture }
     *     
     */
    public ListaContattiStrutture getListaContattiStrutture() {
        return listaContattiStrutture;
    }

    /**
     * Imposta il valore della proprietà listaContattiStrutture.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaContattiStrutture }
     *     
     */
    public void setListaContattiStrutture(ListaContattiStrutture value) {
        this.listaContattiStrutture = value;
    }

}
