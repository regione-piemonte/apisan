/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per setDietaRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="setDietaRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}requestCommon">
 *       &lt;sequence>
 *         &lt;element name="dieta" type="{http://dmaclbluc.dma.csi.it/}dieta" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setDietaRequest", propOrder = {
    "dieta"
})
public class SetDietaRequest
    extends RequestCommon
{

    protected Dieta dieta;

    /**
     * Recupera il valore della proprietà dieta.
     * 
     * @return
     *     possible object is
     *     {@link Dieta }
     *     
     */
    public Dieta getDieta() {
        return dieta;
    }

    /**
     * Imposta il valore della proprietà dieta.
     * 
     * @param value
     *     allowed object is
     *     {@link Dieta }
     *     
     */
    public void setDieta(Dieta value) {
        this.dieta = value;
    }

}
