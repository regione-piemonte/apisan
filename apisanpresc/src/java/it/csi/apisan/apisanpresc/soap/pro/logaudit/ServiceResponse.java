/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.pro.logaudit;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per serviceResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="serviceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dma.csi.it/}esito" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}errori" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceResponse", namespace = "http://dmapro.csi.it/", propOrder = {
    "esito",
    "errori"
})
@XmlSeeAlso({
    LogAuditResponse.class
})
public class ServiceResponse {

    @XmlElement(namespace = "http://dma.csi.it/")
    protected String esito;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected List<Errore> errori;

    /**
     * Recupera il valore della property esito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsito() {
        return esito;
    }

    /**
     * Imposta il valore della property esito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsito(String value) {
        this.esito = value;
    }

    /**
     * Gets the value of the errori property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errori property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrori().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Errore }
     * 
     * 
     */
    public List<Errore> getErrori() {
        if (errori == null) {
            errori = new ArrayList<Errore>();
        }
        return this.errori;
    }

}
