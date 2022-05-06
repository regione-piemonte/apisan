/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per setImpostazioniTaccuinoResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="setImpostazioniTaccuinoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="listaPreferenze" type="{http://dmaclbluc.dma.csi.it/}listaPreferenze" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setImpostazioniTaccuinoResponse", propOrder = {
    "listaPreferenze"
})
public class SetImpostazioniTaccuinoResponse
    extends ServiceResponse
{

    protected ListaPreferenze listaPreferenze;

    /**
     * Recupera il valore della proprietà listaPreferenze.
     * 
     * @return
     *     possible object is
     *     {@link ListaPreferenze }
     *     
     */
    public ListaPreferenze getListaPreferenze() {
        return listaPreferenze;
    }

    /**
     * Imposta il valore della proprietà listaPreferenze.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaPreferenze }
     *     
     */
    public void setListaPreferenze(ListaPreferenze value) {
        this.listaPreferenze = value;
    }

}
