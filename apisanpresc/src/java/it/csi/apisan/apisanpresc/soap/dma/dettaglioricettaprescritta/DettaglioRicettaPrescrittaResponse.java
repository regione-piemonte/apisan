/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per dettaglioRicettaPrescrittaResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="dettaglioRicettaPrescrittaResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmacc.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="ricetta" type="{http://dma.csi.it/}ricetta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dettaglioRicettaPrescrittaResponse", namespace = "http://dmacc.csi.it/", propOrder = {
    "ricetta"
})
public class DettaglioRicettaPrescrittaResponse
    extends ServiceResponse
{

    protected Ricetta ricetta;

    /**
     * Recupera il valore della property ricetta.
     * 
     * @return
     *     possible object is
     *     {@link Ricetta }
     *     
     */
    public Ricetta getRicetta() {
        return ricetta;
    }

    /**
     * Imposta il valore della property ricetta.
     * 
     * @param value
     *     allowed object is
     *     {@link Ricetta }
     *     
     */
    public void setRicetta(Ricetta value) {
        this.ricetta = value;
    }

}
