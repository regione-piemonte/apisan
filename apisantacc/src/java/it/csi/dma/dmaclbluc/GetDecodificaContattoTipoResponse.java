/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getDecodificaContattoTipoResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getDecodificaContattoTipoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="listaContattoTipo" type="{http://dmaclbluc.dma.csi.it/}listaContattoTipo" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDecodificaContattoTipoResponse", propOrder = {
    "listaContattoTipo"
})
public class GetDecodificaContattoTipoResponse
    extends ServiceResponse
{

    protected ListaContattoTipo listaContattoTipo;

    /**
     * Recupera il valore della proprietà listaContattoTipo.
     * 
     * @return
     *     possible object is
     *     {@link ListaContattoTipo }
     *     
     */
    public ListaContattoTipo getListaContattoTipo() {
        return listaContattoTipo;
    }

    /**
     * Imposta il valore della proprietà listaContattoTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaContattoTipo }
     *     
     */
    public void setListaContattoTipo(ListaContattoTipo value) {
        this.listaContattoTipo = value;
    }

}
