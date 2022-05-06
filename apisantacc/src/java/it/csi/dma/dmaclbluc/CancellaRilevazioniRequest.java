/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per cancellaRilevazioniRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="cancellaRilevazioniRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}requestCommon">
 *       &lt;sequence>
 *         &lt;element name="idRilevazione" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancellaRilevazioniRequest", propOrder = {
    "idRilevazione"
})
public class CancellaRilevazioniRequest
    extends RequestCommon
{

    @XmlElement(type = Long.class)
    protected List<Long> idRilevazione;

    /**
     * Gets the value of the idRilevazione property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idRilevazione property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdRilevazione().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getIdRilevazione() {
        if (idRilevazione == null) {
            idRilevazione = new ArrayList<Long>();
        }
        return this.idRilevazione;
    }

}
