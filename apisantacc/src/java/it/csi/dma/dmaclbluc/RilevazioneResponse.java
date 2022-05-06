/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per rilevazioneResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="rilevazioneResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}commonInfo">
 *       &lt;sequence>
 *         &lt;element name="rilevazione" type="{http://dmaclbluc.dma.csi.it/}rilevazione" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rilevazioneResponse", propOrder = {
    "rilevazione"
})
public class RilevazioneResponse
    extends CommonInfo
{

    protected Rilevazione rilevazione;

    /**
     * Recupera il valore della proprietà rilevazione.
     * 
     * @return
     *     possible object is
     *     {@link Rilevazione }
     *     
     */
    public Rilevazione getRilevazione() {
        return rilevazione;
    }

    /**
     * Imposta il valore della proprietà rilevazione.
     * 
     * @param value
     *     allowed object is
     *     {@link Rilevazione }
     *     
     */
    public void setRilevazione(Rilevazione value) {
        this.rilevazione = value;
    }

}
