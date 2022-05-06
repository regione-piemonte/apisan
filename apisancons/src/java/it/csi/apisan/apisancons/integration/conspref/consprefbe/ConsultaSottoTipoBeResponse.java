/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisancons.integration.conspref.consprefbe;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per consultaSottoTipoBeResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="consultaSottoTipoBeResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://consprefbe.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="sottotipiConsenso" type="{http://consprefbe.csi.it/}sottoTipoConsenso" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaSottoTipoBeResponse", propOrder = {
    "sottotipiConsenso"
})
public class ConsultaSottoTipoBeResponse
    extends ServiceResponse
{

    @XmlElement(nillable = true)
    protected List<SottoTipoConsenso> sottotipiConsenso;

    /**
     * Gets the value of the sottotipiConsenso property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sottotipiConsenso property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSottotipiConsenso().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SottoTipoConsenso }
     * 
     * 
     */
    public List<SottoTipoConsenso> getSottotipiConsenso() {
        if (sottotipiConsenso == null) {
            sottotipiConsenso = new ArrayList<SottoTipoConsenso>();
        }
        return this.sottotipiConsenso;
    }

}
