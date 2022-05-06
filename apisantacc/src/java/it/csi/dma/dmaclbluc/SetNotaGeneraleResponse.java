/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per setNotaGeneraleResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="setNotaGeneraleResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="notaGenerale" type="{http://dmaclbluc.dma.csi.it/}notaGenerale" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setNotaGeneraleResponse", propOrder = {
    "notaGenerale"
})
public class SetNotaGeneraleResponse
    extends ServiceResponse
{

    protected NotaGenerale notaGenerale;

    /**
     * Recupera il valore della proprietà notaGenerale.
     * 
     * @return
     *     possible object is
     *     {@link NotaGenerale }
     *     
     */
    public NotaGenerale getNotaGenerale() {
        return notaGenerale;
    }

    /**
     * Imposta il valore della proprietà notaGenerale.
     * 
     * @param value
     *     allowed object is
     *     {@link NotaGenerale }
     *     
     */
    public void setNotaGenerale(NotaGenerale value) {
        this.notaGenerale = value;
    }

}
