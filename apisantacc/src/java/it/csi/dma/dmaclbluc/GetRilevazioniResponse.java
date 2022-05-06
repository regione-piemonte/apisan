/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getRilevazioniResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getRilevazioniResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="listaRilevazioni" type="{http://dmaclbluc.dma.csi.it/}listaRilevazioni" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRilevazioniResponse", propOrder = {
    "listaRilevazioni"
})
public class GetRilevazioniResponse
    extends ServiceResponse
{

    protected ListaRilevazioni listaRilevazioni;

    /**
     * Recupera il valore della proprietà listaRilevazioni.
     * 
     * @return
     *     possible object is
     *     {@link ListaRilevazioni }
     *     
     */
    public ListaRilevazioni getListaRilevazioni() {
        return listaRilevazioni;
    }

    /**
     * Imposta il valore della proprietà listaRilevazioni.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaRilevazioni }
     *     
     */
    public void setListaRilevazioni(ListaRilevazioni value) {
        this.listaRilevazioni = value;
    }

}
