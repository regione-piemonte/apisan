/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per setNotaGeneraleRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="setNotaGeneraleRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}requestCommon">
 *       &lt;sequence>
 *         &lt;element name="notaGenerale" type="{http://dmaclbluc.dma.csi.it/}notaGeneraleRequest" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setNotaGeneraleRequest", propOrder = {
    "notaGenerale"
})
public class SetNotaGeneraleRequest
    extends RequestCommon
{

    protected NotaGeneraleRequest notaGenerale;

    /**
     * Recupera il valore della proprietà notaGenerale.
     * 
     * @return
     *     possible object is
     *     {@link NotaGeneraleRequest }
     *     
     */
    public NotaGeneraleRequest getNotaGenerale() {
        return notaGenerale;
    }

    /**
     * Imposta il valore della proprietà notaGenerale.
     * 
     * @param value
     *     allowed object is
     *     {@link NotaGeneraleRequest }
     *     
     */
    public void setNotaGenerale(NotaGeneraleRequest value) {
        this.notaGenerale = value;
    }

}
