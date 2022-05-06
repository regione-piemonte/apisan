/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per listaIntensitaDolore complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="listaIntensitaDolore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="intensitaDolore" type="{http://dmaclbluc.dma.csi.it/}intensitaDolore" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaIntensitaDolore", propOrder = {
    "intensitaDolore"
})
public class ListaIntensitaDolore {

    protected List<IntensitaDolore> intensitaDolore;

    /**
     * Gets the value of the intensitaDolore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intensitaDolore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntensitaDolore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntensitaDolore }
     * 
     * 
     */
    public List<IntensitaDolore> getIntensitaDolore() {
        if (intensitaDolore == null) {
            intensitaDolore = new ArrayList<IntensitaDolore>();
        }
        return this.intensitaDolore;
    }

}
