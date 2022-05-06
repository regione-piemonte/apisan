/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per setEventoResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="setEventoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="evento" type="{http://dmaclbluc.dma.csi.it/}eventoResponse" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setEventoResponse", propOrder = {
    "evento"
})
public class SetEventoResponse
    extends ServiceResponse
{

    protected EventoResponse evento;

    /**
     * Recupera il valore della proprietà evento.
     * 
     * @return
     *     possible object is
     *     {@link EventoResponse }
     *     
     */
    public EventoResponse getEvento() {
        return evento;
    }

    /**
     * Imposta il valore della proprietà evento.
     * 
     * @param value
     *     allowed object is
     *     {@link EventoResponse }
     *     
     */
    public void setEvento(EventoResponse value) {
        this.evento = value;
    }

}
