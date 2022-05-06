/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per setOscuramentoTaccuinoRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="setOscuramentoTaccuinoRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}requestCommon">
 *       &lt;sequence>
 *         &lt;element name="oscurato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setOscuramentoTaccuinoRequest", propOrder = {
    "oscurato"
})
public class SetOscuramentoTaccuinoRequest
    extends RequestCommon
{

    protected String oscurato;

    /**
     * Recupera il valore della proprietà oscurato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOscurato() {
        return oscurato;
    }

    /**
     * Imposta il valore della proprietà oscurato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOscurato(String value) {
        this.oscurato = value;
    }

}
