/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getDecodificheModalitaRilevazioneResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getDecodificheModalitaRilevazioneResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="listaModalitaRilevazione" type="{http://dmaclbluc.dma.csi.it/}listaModalitaRilevazione" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDecodificheModalitaRilevazioneResponse", propOrder = {
    "listaModalitaRilevazione"
})
public class GetDecodificheModalitaRilevazioneResponse
    extends ServiceResponse
{

    protected ListaModalitaRilevazione listaModalitaRilevazione;

    /**
     * Recupera il valore della proprietà listaModalitaRilevazione.
     * 
     * @return
     *     possible object is
     *     {@link ListaModalitaRilevazione }
     *     
     */
    public ListaModalitaRilevazione getListaModalitaRilevazione() {
        return listaModalitaRilevazione;
    }

    /**
     * Imposta il valore della proprietà listaModalitaRilevazione.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaModalitaRilevazione }
     *     
     */
    public void setListaModalitaRilevazione(ListaModalitaRilevazione value) {
        this.listaModalitaRilevazione = value;
    }

}
