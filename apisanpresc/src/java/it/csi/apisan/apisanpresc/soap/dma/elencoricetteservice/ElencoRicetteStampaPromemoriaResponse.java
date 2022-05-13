/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.dma.elencoricetteservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per elencoRicetteStampaPromemoriaResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="elencoRicetteStampaPromemoriaResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmacc.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="listaRicette" type="{http://dma.csi.it/}ListaRicetteType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "elencoRicetteStampaPromemoriaResponse", namespace = "http://dmacc.csi.it/", propOrder = {
    "listaRicette"
})
public class ElencoRicetteStampaPromemoriaResponse
    extends ServiceResponse
{

    protected ListaRicetteType listaRicette;

    /**
     * Recupera il valore della property listaRicette.
     * 
     * @return
     *     possible object is
     *     {@link ListaRicetteType }
     *     
     */
    public ListaRicetteType getListaRicette() {
        return listaRicette;
    }

    /**
     * Imposta il valore della property listaRicette.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaRicetteType }
     *     
     */
    public void setListaRicette(ListaRicetteType value) {
        this.listaRicette = value;
    }

}
