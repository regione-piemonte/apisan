/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per setDietaResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="setDietaResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="dieta" type="{http://dmaclbluc.dma.csi.it/}dietaResponse" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setDietaResponse", propOrder = {
    "dieta"
})
public class SetDietaResponse
    extends ServiceResponse
{

    protected DietaResponse dieta;

    /**
     * Recupera il valore della proprietà dieta.
     * 
     * @return
     *     possible object is
     *     {@link DietaResponse }
     *     
     */
    public DietaResponse getDieta() {
        return dieta;
    }

    /**
     * Imposta il valore della proprietà dieta.
     * 
     * @param value
     *     allowed object is
     *     {@link DietaResponse }
     *     
     */
    public void setDieta(DietaResponse value) {
        this.dieta = value;
    }

}
