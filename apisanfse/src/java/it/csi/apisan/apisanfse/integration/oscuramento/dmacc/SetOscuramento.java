/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.oscuramento.dmacc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import it.csi.apisan.apisanfse.integration.oscuramento.dma.Oscuramento;
import it.csi.apisan.apisanfse.integration.oscuramento.dma.Paziente;
import it.csi.apisan.apisanfse.integration.oscuramento.dma.Richiedente;


/**
 * <p>Classe Java per SetOscuramento complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SetOscuramento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oscuramento" type="{http://dma.csi.it/}oscuramento" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="paziente" type="{http://dma.csi.it/}paziente" minOccurs="0"/>
 *         &lt;element name="richiedente" type="{http://dma.csi.it/}richiedente" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetOscuramento", propOrder = {
    "oscuramento",
    "paziente",
    "richiedente"
})
public class SetOscuramento {

    @XmlElement(nillable = true)
    protected List<Oscuramento> oscuramento;
    protected Paziente paziente;
    protected Richiedente richiedente;

    /**
     * Gets the value of the oscuramento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oscuramento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOscuramento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Oscuramento }
     * 
     * 
     */
    public List<Oscuramento> getOscuramento() {
        if (oscuramento == null) {
            oscuramento = new ArrayList<Oscuramento>();
        }
        return this.oscuramento;
    }

    /**
     * Recupera il valore della proprieta paziente.
     * 
     * @return
     *     possible object is
     *     {@link Paziente }
     *     
     */
    public Paziente getPaziente() {
        return paziente;
    }

    /**
     * Imposta il valore della proprieta paziente.
     * 
     * @param value
     *     allowed object is
     *     {@link Paziente }
     *     
     */
    public void setPaziente(Paziente value) {
        this.paziente = value;
    }

    /**
     * Recupera il valore della proprieta richiedente.
     * 
     * @return
     *     possible object is
     *     {@link Richiedente }
     *     
     */
    public Richiedente getRichiedente() {
        return richiedente;
    }

    /**
     * Imposta il valore della proprieta richiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link Richiedente }
     *     
     */
    public void setRichiedente(Richiedente value) {
        this.richiedente = value;
    }

}
