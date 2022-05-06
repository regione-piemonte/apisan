/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.consensoini.dmacc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import it.csi.apisan.apisanfse.integration.consensoini.dma.OpzioniType;


/**
 * <p>Classe Java per comunicazioneConsensiResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="comunicazioneConsensiResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmacc.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="opzioniResponse" type="{http://dma.csi.it/}opzioniType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="regioneAssistenza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comunicazioneConsensiResponse", propOrder = {
    "opzioniResponse",
    "regioneAssistenza"
})
public class ComunicazioneConsensiResponse
    extends ServiceResponse
{

    @XmlElement(nillable = true)
    protected List<OpzioniType> opzioniResponse;
    protected String regioneAssistenza;

    /**
     * Gets the value of the opzioniResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opzioniResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpzioniResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpzioniType }
     * 
     * 
     */
    public List<OpzioniType> getOpzioniResponse() {
        if (opzioniResponse == null) {
            opzioniResponse = new ArrayList<OpzioniType>();
        }
        return this.opzioniResponse;
    }

    /**
     * Recupera il valore della proprieta regioneAssistenza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegioneAssistenza() {
        return regioneAssistenza;
    }

    /**
     * Imposta il valore della proprieta regioneAssistenza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegioneAssistenza(String value) {
        this.regioneAssistenza = value;
    }

}
