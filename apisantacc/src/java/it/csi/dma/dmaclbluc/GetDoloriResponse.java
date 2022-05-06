/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getDoloriResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getDoloriResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="listaDolori" type="{http://dmaclbluc.dma.csi.it/}listaDolori" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDoloriResponse", propOrder = {
    "listaDolori"
})
public class GetDoloriResponse
    extends ServiceResponse
{

    protected ListaDolori listaDolori;

    /**
     * Recupera il valore della proprietà listaDolori.
     * 
     * @return
     *     possible object is
     *     {@link ListaDolori }
     *     
     */
    public ListaDolori getListaDolori() {
        return listaDolori;
    }

    /**
     * Imposta il valore della proprietà listaDolori.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaDolori }
     *     
     */
    public void setListaDolori(ListaDolori value) {
        this.listaDolori = value;
    }

}
