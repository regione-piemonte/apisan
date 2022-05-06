/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.esenzioni.dmacc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import it.csi.apisan.apisanfse.integration.esenzioni.dma.Esenzione;


/**
 * <p>Classe Java per esenzioniResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="esenzioniResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmacc.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="esenzioni" type="{http://dma.csi.it/}esenzione" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="oscuramentoEsenzioni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "esenzioniResponse", propOrder = {
    "esenzioni",
    "oscuramentoEsenzioni"
})
public class EsenzioniResponse
    extends ServiceResponse
{

    @XmlElement(nillable = true)
    protected List<Esenzione> esenzioni;
    protected String oscuramentoEsenzioni;

    /**
     * Gets the value of the esenzioni property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the esenzioni property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEsenzioni().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Esenzione }
     * 
     * 
     */
    public List<Esenzione> getEsenzioni() {
        if (esenzioni == null) {
            esenzioni = new ArrayList<Esenzione>();
        }
        return this.esenzioni;
    }

    /**
     * Recupera il valore della proprietà oscuramentoEsenzioni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOscuramentoEsenzioni() {
        return oscuramentoEsenzioni;
    }

    /**
     * Imposta il valore della proprietà oscuramentoEsenzioni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOscuramentoEsenzioni(String value) {
        this.oscuramentoEsenzioni = value;
    }

}
