/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ListaModalitaErogazioneType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ListaModalitaErogazioneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MODALITA_AMMISSIBILE" type="{http://csi.it}ModalitaAmmissibileType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaModalitaErogazioneType", propOrder = {
    "modalitaammissibile"
})
public class ListaModalitaErogazioneType {

    @XmlElement(name = "MODALITA_AMMISSIBILE")
    protected List<ModalitaAmmissibileType> modalitaammissibile;

    /**
     * Gets the value of the modalitaammissibile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modalitaammissibile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMODALITAAMMISSIBILE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModalitaAmmissibileType }
     * 
     * 
     */
    public List<ModalitaAmmissibileType> getMODALITAAMMISSIBILE() {
        if (modalitaammissibile == null) {
            modalitaammissibile = new ArrayList<ModalitaAmmissibileType>();
        }
        return this.modalitaammissibile;
    }

}
