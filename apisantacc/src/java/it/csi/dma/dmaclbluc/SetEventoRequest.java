/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per setEventoRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="setEventoRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}requestCommon">
 *       &lt;sequence>
 *         &lt;element name="evento" type="{http://dmaclbluc.dma.csi.it/}evento" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setEventoRequest", propOrder = {
    "evento"
})
public class SetEventoRequest
    extends RequestCommon
{

    protected Evento evento;

    /**
     * Recupera il valore della proprietà evento.
     * 
     * @return
     *     possible object is
     *     {@link Evento }
     *     
     */
    public Evento getEvento() {
        return evento;
    }

    /**
     * Imposta il valore della proprietà evento.
     * 
     * @param value
     *     allowed object is
     *     {@link Evento }
     *     
     */
    public void setEvento(Evento value) {
        this.evento = value;
    }

}
