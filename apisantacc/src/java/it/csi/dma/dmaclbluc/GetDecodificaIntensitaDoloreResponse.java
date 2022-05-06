/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getDecodificaIntensitaDoloreResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getDecodificaIntensitaDoloreResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="listaIntensitaDolore" type="{http://dmaclbluc.dma.csi.it/}listaIntensitaDolore" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDecodificaIntensitaDoloreResponse", propOrder = {
    "listaIntensitaDolore"
})
public class GetDecodificaIntensitaDoloreResponse
    extends ServiceResponse
{

    protected ListaIntensitaDolore listaIntensitaDolore;

    /**
     * Recupera il valore della proprietà listaIntensitaDolore.
     * 
     * @return
     *     possible object is
     *     {@link ListaIntensitaDolore }
     *     
     */
    public ListaIntensitaDolore getListaIntensitaDolore() {
        return listaIntensitaDolore;
    }

    /**
     * Imposta il valore della proprietà listaIntensitaDolore.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaIntensitaDolore }
     *     
     */
    public void setListaIntensitaDolore(ListaIntensitaDolore value) {
        this.listaIntensitaDolore = value;
    }

}
