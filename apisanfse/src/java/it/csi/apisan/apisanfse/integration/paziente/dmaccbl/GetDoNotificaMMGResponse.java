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

import it.csi.apisan.apisanfse.integration.paziente.dma.MetadatiMedicoPaziente;


/**
 * <p>Classe Java per getDoNotificaMMGResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getDoNotificaMMGResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaccbl.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="metadatiMedicoPazienti" type="{http://dma.csi.it/}metadatiMedicoPaziente" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDoNotificaMMGResponse", propOrder = {
    "metadatiMedicoPazienti"
})
public class GetDoNotificaMMGResponse
    extends ServiceResponse
{

    @XmlElement(nillable = true)
    protected List<MetadatiMedicoPaziente> metadatiMedicoPazienti;

    /**
     * Gets the value of the metadatiMedicoPazienti property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadatiMedicoPazienti property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadatiMedicoPazienti().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadatiMedicoPaziente }
     * 
     * 
     */
    public List<MetadatiMedicoPaziente> getMetadatiMedicoPazienti() {
        if (metadatiMedicoPazienti == null) {
            metadatiMedicoPazienti = new ArrayList<MetadatiMedicoPaziente>();
        }
        return this.metadatiMedicoPazienti;
    }

}
