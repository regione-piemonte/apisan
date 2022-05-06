/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getDecodificaStrutturaTipoResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getDecodificaStrutturaTipoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="listaStrutturaTipo" type="{http://dmaclbluc.dma.csi.it/}listaStrutturaTipo" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDecodificaStrutturaTipoResponse", propOrder = {
    "listaStrutturaTipo"
})
public class GetDecodificaStrutturaTipoResponse
    extends ServiceResponse
{

    protected ListaStrutturaTipo listaStrutturaTipo;

    /**
     * Recupera il valore della proprietà listaStrutturaTipo.
     * 
     * @return
     *     possible object is
     *     {@link ListaStrutturaTipo }
     *     
     */
    public ListaStrutturaTipo getListaStrutturaTipo() {
        return listaStrutturaTipo;
    }

    /**
     * Imposta il valore della proprietà listaStrutturaTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaStrutturaTipo }
     *     
     */
    public void setListaStrutturaTipo(ListaStrutturaTipo value) {
        this.listaStrutturaTipo = value;
    }

}
