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
 * <p>Classe Java per GprEndpointPerGetListaFlussiFRDaInviareGPAResult complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GprEndpointPerGetListaFlussiFRDaInviareGPAResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FLUSSO" type="{http://ws.wso2.org/dataservice}FLUSSO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GprEndpointPerGetListaFlussiFRDaInviareGPAResult", propOrder = {
    "flusso"
})
public class GprEndpointPerGetListaFlussiFRDaInviareGPAResult {

    @XmlElement(name = "FLUSSO")
    protected List<FLUSSO> flusso;

    /**
     * Gets the value of the flusso property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flusso property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFLUSSO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FLUSSO }
     * 
     * 
     */
    public List<FLUSSO> getFLUSSO() {
        if (flusso == null) {
            flusso = new ArrayList<FLUSSO>();
        }
        return this.flusso;
    }

}
