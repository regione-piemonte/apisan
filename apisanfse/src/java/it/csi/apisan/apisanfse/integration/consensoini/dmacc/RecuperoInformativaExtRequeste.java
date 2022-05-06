/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.consensoini.dmacc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import it.csi.apisan.apisanfse.integration.consensoini.dma.InformativaIN;
import it.csi.apisan.apisanfse.integration.consensoini.dma.RichiedenteExt;


/**
 * <p>Classe Java per recuperoInformativaExtRequeste complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="recuperoInformativaExtRequeste">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informativaIN" type="{http://dma.csi.it/}informativaIN" minOccurs="0"/>
 *         &lt;element name="richiedente" type="{http://dma.csi.it/}richiedenteExt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recuperoInformativaExtRequeste", propOrder = {
    "informativaIN",
    "richiedente"
})
public class RecuperoInformativaExtRequeste {

    protected InformativaIN informativaIN;
    protected RichiedenteExt richiedente;

    /**
     * Recupera il valore della proprieta informativaIN.
     * 
     * @return
     *     possible object is
     *     {@link InformativaIN }
     *     
     */
    public InformativaIN getInformativaIN() {
        return informativaIN;
    }

    /**
     * Imposta il valore della proprieta informativaIN.
     * 
     * @param value
     *     allowed object is
     *     {@link InformativaIN }
     *     
     */
    public void setInformativaIN(InformativaIN value) {
        this.informativaIN = value;
    }

    /**
     * Recupera il valore della proprieta richiedente.
     * 
     * @return
     *     possible object is
     *     {@link RichiedenteExt }
     *     
     */
    public RichiedenteExt getRichiedente() {
        return richiedente;
    }

    /**
     * Imposta il valore della proprieta richiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link RichiedenteExt }
     *     
     */
    public void setRichiedente(RichiedenteExt value) {
        this.richiedente = value;
    }

}
