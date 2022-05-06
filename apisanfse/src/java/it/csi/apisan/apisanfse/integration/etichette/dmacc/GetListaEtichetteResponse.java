/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.etichette.dmacc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import it.csi.apisan.apisanfse.integration.etichette.dma.ListaEtichette;
import it.csi.apisan.apisanfse.integration.etichette.dma.ServiceResponse;


/**
 * <p>Classe Java per GetListaEtichetteResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GetListaEtichetteResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="listaEtichette" type="{http://dma.csi.it/}listaEtichette" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetListaEtichetteResponse", propOrder = {
    "listaEtichette"
})
public class GetListaEtichetteResponse
    extends ServiceResponse
{

    protected ListaEtichette listaEtichette;

    /**
     * Recupera il valore della proprieta' listaEtichette.
     * 
     * @return
     *     possible object is
     *     {@link ListaEtichette }
     *     
     */
    public ListaEtichette getListaEtichette() {
        return listaEtichette;
    }

    /**
     * Imposta il valore della proprieta' listaEtichette.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaEtichette }
     *     
     */
    public void setListaEtichette(ListaEtichette value) {
        this.listaEtichette = value;
    }

}
