/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getDieteResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getDieteResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="listaDiete" type="{http://dmaclbluc.dma.csi.it/}listaDiete" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDieteResponse", propOrder = {
    "listaDiete"
})
public class GetDieteResponse
    extends ServiceResponse
{

    protected ListaDiete listaDiete;

    /**
     * Recupera il valore della proprietà listaDiete.
     * 
     * @return
     *     possible object is
     *     {@link ListaDiete }
     *     
     */
    public ListaDiete getListaDiete() {
        return listaDiete;
    }

    /**
     * Imposta il valore della proprietà listaDiete.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaDiete }
     *     
     */
    public void setListaDiete(ListaDiete value) {
        this.listaDiete = value;
    }

}
