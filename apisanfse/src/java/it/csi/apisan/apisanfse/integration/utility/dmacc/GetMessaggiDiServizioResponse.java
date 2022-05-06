/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.utility.dmacc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import it.csi.apisan.apisanfse.integration.utility.dma.ServiceResponse;


/**
 * <p>Classe Java per GetMessaggiDiServizioResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GetMessaggiDiServizioResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="messaggi" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMessaggiDiServizioResponse", propOrder = {
    "messaggi"
})
public class GetMessaggiDiServizioResponse
    extends ServiceResponse
{

    @XmlElement(nillable = true)
    protected List<String> messaggi;

    /**
     * Gets the value of the messaggi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messaggi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessaggi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMessaggi() {
        if (messaggi == null) {
            messaggi = new ArrayList<String>();
        }
        return this.messaggi;
    }

}
