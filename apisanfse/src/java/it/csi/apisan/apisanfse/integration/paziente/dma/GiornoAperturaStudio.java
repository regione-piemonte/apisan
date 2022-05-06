/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.paziente.dma;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per giornoAperturaStudio complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="giornoAperturaStudio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="giorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orari" type="{http://dma.csi.it/}orarioAperturaStudio" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "giornoAperturaStudio", propOrder = {
    "giorno",
    "orari"
})
public class GiornoAperturaStudio {

    protected String giorno;
    @XmlElement(nillable = true)
    protected List<OrarioAperturaStudio> orari;

    /**
     * Recupera il valore della proprietà giorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiorno() {
        return giorno;
    }

    /**
     * Imposta il valore della proprietà giorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiorno(String value) {
        this.giorno = value;
    }

    /**
     * Gets the value of the orari property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orari property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrari().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrarioAperturaStudio }
     * 
     * 
     */
    public List<OrarioAperturaStudio> getOrari() {
        if (orari == null) {
            orari = new ArrayList<OrarioAperturaStudio>();
        }
        return this.orari;
    }

}
