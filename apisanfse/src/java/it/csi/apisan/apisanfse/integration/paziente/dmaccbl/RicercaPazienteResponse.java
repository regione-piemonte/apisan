/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.paziente.dmaccbl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import it.csi.apisan.apisanfse.integration.paziente.dma.Paziente;


/**
 * <p>Classe Java per ricercaPazienteResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ricercaPazienteResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaccbl.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="pazienti" type="{http://dma.csi.it/}paziente" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ricercaPazienteResponse", propOrder = {
    "pazienti"
})
public class RicercaPazienteResponse
    extends ServiceResponse
{

    @XmlElement(nillable = true)
    protected List<Paziente> pazienti;

    /**
     * Gets the value of the pazienti property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pazienti property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPazienti().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Paziente }
     * 
     * 
     */
    public List<Paziente> getPazienti() {
        if (pazienti == null) {
            pazienti = new ArrayList<Paziente>();
        }
        return this.pazienti;
    }

}
