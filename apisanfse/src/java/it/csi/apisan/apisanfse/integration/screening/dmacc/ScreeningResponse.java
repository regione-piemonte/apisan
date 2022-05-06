/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.screening.dmacc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import it.csi.apisan.apisanfse.integration.screening.dma.InformazioniSistemiScreening;


/**
 * <p>Classe Java per screeningResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="screeningResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmacc.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="informazioniSistemiScreening" type="{http://dma.csi.it/}informazioniSistemiScreening" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "screeningResponse", propOrder = {
    "informazioniSistemiScreening"
})
public class ScreeningResponse
    extends ServiceResponse
{

    @XmlElement(nillable = true)
    protected List<InformazioniSistemiScreening> informazioniSistemiScreening;

    /**
     * Gets the value of the informazioniSistemiScreening property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informazioniSistemiScreening property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformazioniSistemiScreening().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformazioniSistemiScreening }
     * 
     * 
     */
    public List<InformazioniSistemiScreening> getInformazioniSistemiScreening() {
        if (informazioniSistemiScreening == null) {
            informazioniSistemiScreening = new ArrayList<InformazioniSistemiScreening>();
        }
        return this.informazioniSistemiScreening;
    }

}
