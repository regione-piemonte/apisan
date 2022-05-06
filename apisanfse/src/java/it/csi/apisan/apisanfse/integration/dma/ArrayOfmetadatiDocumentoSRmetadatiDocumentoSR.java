/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.dma;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfmetadatiDocumentoSRmetadatiDocumentoSR complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfmetadatiDocumentoSRmetadatiDocumentoSR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="metadatiDocumentoSR" type="{http://dma.csi.it/}metadatiDocumentoSR" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfmetadatiDocumentoSRmetadatiDocumentoSR", propOrder = {
    "metadatiDocumentoSR"
})
public class ArrayOfmetadatiDocumentoSRmetadatiDocumentoSR {

    @XmlElement(nillable = true)
    protected List<MetadatiDocumentoSR> metadatiDocumentoSR;

    /**
     * Gets the value of the metadatiDocumentoSR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadatiDocumentoSR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadatiDocumentoSR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadatiDocumentoSR }
     * 
     * 
     */
    public List<MetadatiDocumentoSR> getMetadatiDocumentoSR() {
        if (metadatiDocumentoSR == null) {
            metadatiDocumentoSR = new ArrayList<MetadatiDocumentoSR>();
        }
        return this.metadatiDocumentoSR;
    }

}
