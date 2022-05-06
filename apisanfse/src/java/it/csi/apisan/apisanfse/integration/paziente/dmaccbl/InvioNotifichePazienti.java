/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.paziente.dmaccbl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import it.csi.apisan.apisanfse.integration.paziente.dma.Richiedente;


/**
 * <p>Classe Java per invioNotifichePazienti complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="invioNotifichePazienti">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richiedente" type="{http://dma.csi.it/}richiedente" minOccurs="0"/>
 *         &lt;element name="tipoOperazioneNotifica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invioNotifichePazienti", propOrder = {
    "richiedente",
    "tipoOperazioneNotifica"
})
public class InvioNotifichePazienti {

    protected Richiedente richiedente;
    protected String tipoOperazioneNotifica;

    /**
     * Recupera il valore della proprietà richiedente.
     * 
     * @return
     *     possible object is
     *     {@link Richiedente }
     *     
     */
    public Richiedente getRichiedente() {
        return richiedente;
    }

    /**
     * Imposta il valore della proprietà richiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link Richiedente }
     *     
     */
    public void setRichiedente(Richiedente value) {
        this.richiedente = value;
    }

    /**
     * Recupera il valore della proprietà tipoOperazioneNotifica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOperazioneNotifica() {
        return tipoOperazioneNotifica;
    }

    /**
     * Imposta il valore della proprietà tipoOperazioneNotifica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOperazioneNotifica(String value) {
        this.tipoOperazioneNotifica = value;
    }

}
