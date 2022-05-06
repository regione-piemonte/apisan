/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package org.wso2.ws.dataservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per GprRichiestaLottoIUVMultiResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GprRichiestaLottoIUVMultiResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LOTTO_IUV" type="{http://ws.wso2.org/dataservice}LOTTO_IUV" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GprRichiestaLottoIUVMultiResponse", propOrder = {
    "lottoiuv"
})
public class GprRichiestaLottoIUVMultiResponse {

    @XmlElement(name = "LOTTO_IUV")
    protected List<LOTTOIUV> lottoiuv;

    /**
     * Gets the value of the lottoiuv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lottoiuv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLOTTOIUV().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LOTTOIUV }
     * 
     * 
     */
    public List<LOTTOIUV> getLOTTOIUV() {
        if (lottoiuv == null) {
            lottoiuv = new ArrayList<LOTTOIUV>();
        }
        return this.lottoiuv;
    }

}
