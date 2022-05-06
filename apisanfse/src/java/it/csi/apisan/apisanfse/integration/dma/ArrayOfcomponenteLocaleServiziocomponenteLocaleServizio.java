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
 * <p>Classe Java per ArrayOfcomponenteLocaleServiziocomponenteLocaleServizio complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfcomponenteLocaleServiziocomponenteLocaleServizio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="componenteLocaleServizio" type="{http://dma.csi.it/}componenteLocaleServizio" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfcomponenteLocaleServiziocomponenteLocaleServizio", propOrder = {
    "componenteLocaleServizio"
})
public class ArrayOfcomponenteLocaleServiziocomponenteLocaleServizio {

    @XmlElement(nillable = true)
    protected List<ComponenteLocaleServizio> componenteLocaleServizio;

    /**
     * Gets the value of the componenteLocaleServizio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componenteLocaleServizio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponenteLocaleServizio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponenteLocaleServizio }
     * 
     * 
     */
    public List<ComponenteLocaleServizio> getComponenteLocaleServizio() {
        if (componenteLocaleServizio == null) {
            componenteLocaleServizio = new ArrayList<ComponenteLocaleServizio>();
        }
        return this.componenteLocaleServizio;
    }

}
