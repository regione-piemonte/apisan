/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.paziente.dmaccbl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import it.csi.apisan.apisanfse.integration.paziente.dma.RiepilogoPaziente;


/**
 * <p>Classe Java per getRiepilogoResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getRiepilogoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaccbl.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="riepilogoPaziente" type="{http://dma.csi.it/}riepilogoPaziente" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRiepilogoResponse", propOrder = {
    "riepilogoPaziente"
})
public class GetRiepilogoResponse
    extends ServiceResponse
{

    protected RiepilogoPaziente riepilogoPaziente;

    /**
     * Recupera il valore della proprietà riepilogoPaziente.
     * 
     * @return
     *     possible object is
     *     {@link RiepilogoPaziente }
     *     
     */
    public RiepilogoPaziente getRiepilogoPaziente() {
        return riepilogoPaziente;
    }

    /**
     * Imposta il valore della proprietà riepilogoPaziente.
     * 
     * @param value
     *     allowed object is
     *     {@link RiepilogoPaziente }
     *     
     */
    public void setRiepilogoPaziente(RiepilogoPaziente value) {
        this.riepilogoPaziente = value;
    }

}
