/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.pro.elenconrenascosti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per elencoNreNascostiResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="elencoNreNascostiResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmapro.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="listaNre" type="{http://dmapro.csi.it/}ListaNreType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "elencoNreNascostiResponse", propOrder = {
    "listaNre"
})
public class ElencoNreNascostiResponse
    extends ServiceResponse
{

    protected ListaNreType listaNre;

    /**
     * Recupera il valore della property listaNre.
     * 
     * @return
     *     possible object is
     *     {@link ListaNreType }
     *     
     */
    public ListaNreType getListaNre() {
        return listaNre;
    }

    /**
     * Imposta il valore della property listaNre.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaNreType }
     *     
     */
    public void setListaNre(ListaNreType value) {
        this.listaNre = value;
    }

}
