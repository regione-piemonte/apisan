/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.paziente.dma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per notificaAPaziente complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="notificaAPaziente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="canaleNotifica" type="{http://dma.csi.it/}canaleNotifica" minOccurs="0"/>
 *         &lt;element name="eventoNotifica" type="{http://dma.csi.it/}eventoNotifica" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificaAPaziente", propOrder = {
    "canaleNotifica",
    "eventoNotifica"
})
public class NotificaAPaziente {

    protected CanaleNotifica canaleNotifica;
    protected EventoNotifica eventoNotifica;

    /**
     * Recupera il valore della proprietà canaleNotifica.
     * 
     * @return
     *     possible object is
     *     {@link CanaleNotifica }
     *     
     */
    public CanaleNotifica getCanaleNotifica() {
        return canaleNotifica;
    }

    /**
     * Imposta il valore della proprietà canaleNotifica.
     * 
     * @param value
     *     allowed object is
     *     {@link CanaleNotifica }
     *     
     */
    public void setCanaleNotifica(CanaleNotifica value) {
        this.canaleNotifica = value;
    }

    /**
     * Recupera il valore della proprietà eventoNotifica.
     * 
     * @return
     *     possible object is
     *     {@link EventoNotifica }
     *     
     */
    public EventoNotifica getEventoNotifica() {
        return eventoNotifica;
    }

    /**
     * Imposta il valore della proprietà eventoNotifica.
     * 
     * @param value
     *     allowed object is
     *     {@link EventoNotifica }
     *     
     */
    public void setEventoNotifica(EventoNotifica value) {
        this.eventoNotifica = value;
    }

}
