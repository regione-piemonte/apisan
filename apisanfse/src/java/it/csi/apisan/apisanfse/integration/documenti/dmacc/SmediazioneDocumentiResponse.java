/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documenti.dmacc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SmediazioneDocumentiResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SmediazioneDocumentiResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmacc.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="elementiSmediazione" type="{http://dmacc.csi.it/}ElementiSmediazione" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmediazioneDocumentiResponse", propOrder = {
    "elementiSmediazione"
})
public class SmediazioneDocumentiResponse
    extends ServiceResponse
{

    protected ElementiSmediazione elementiSmediazione;

    /**
     * Recupera il valore della proprietà elementiSmediazione.
     * 
     * @return
     *     possible object is
     *     {@link ElementiSmediazione }
     *     
     */
    public ElementiSmediazione getElementiSmediazione() {
        return elementiSmediazione;
    }

    /**
     * Imposta il valore della proprietà elementiSmediazione.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementiSmediazione }
     *     
     */
    public void setElementiSmediazione(ElementiSmediazione value) {
        this.elementiSmediazione = value;
    }

}
