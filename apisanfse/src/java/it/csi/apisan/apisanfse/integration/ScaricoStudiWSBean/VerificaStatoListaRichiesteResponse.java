/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.ScaricoStudiWSBean;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per VerificaStatoListaRichiesteResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VerificaStatoListaRichiesteResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="listaStatoRichiestaScarico" type="{http://dmass.csi.it/}statoRichiestaScarico" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificaStatoListaRichiesteResponse", propOrder = {
    "listaStatoRichiestaScarico"
})
public class VerificaStatoListaRichiesteResponse
    extends ServiceResponse
{

    @XmlElement(namespace = "http://dmass.csi.it/")
    protected List<StatoRichiestaScarico> listaStatoRichiestaScarico;

    /**
     * Gets the value of the listaStatoRichiestaScarico property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaStatoRichiestaScarico property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaStatoRichiestaScarico().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatoRichiestaScarico }
     * 
     * 
     */
    public List<StatoRichiestaScarico> getListaStatoRichiestaScarico() {
        if (listaStatoRichiestaScarico == null) {
            listaStatoRichiestaScarico = new ArrayList<StatoRichiestaScarico>();
        }
        return this.listaStatoRichiestaScarico;
    }

}
