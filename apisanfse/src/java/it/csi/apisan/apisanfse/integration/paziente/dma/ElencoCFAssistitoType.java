/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.paziente.dma;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per elencoCFAssistitoType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="elencoCFAssistitoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cfAssistito" type="{http://dma.csi.it/}cfAssistitoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "elencoCFAssistitoType", propOrder = {
    "cfAssistito"
})
public class ElencoCFAssistitoType {

    @XmlElement(nillable = true)
    protected List<CfAssistitoType> cfAssistito;

    /**
     * Gets the value of the cfAssistito property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cfAssistito property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCfAssistito().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfAssistitoType }
     * 
     * 
     */
    public List<CfAssistitoType> getCfAssistito() {
        if (cfAssistito == null) {
            cfAssistito = new ArrayList<CfAssistitoType>();
        }
        return this.cfAssistito;
    }

}
