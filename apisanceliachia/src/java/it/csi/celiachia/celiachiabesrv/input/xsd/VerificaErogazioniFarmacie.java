/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.celiachia.celiachiabesrv.input.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per VerificaErogazioniFarmacie complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VerificaErogazioniFarmacie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="elencoCnu" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="richiedente" type="{http://input.celiachiabesrv.celiachia.csi.it/xsd}Richiedente" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificaErogazioniFarmacie", propOrder = {
    "elencoCnu",
    "richiedente"
})
public class VerificaErogazioniFarmacie {

    @XmlElement(nillable = true)
    protected List<String> elencoCnu;
    @XmlElementRef(name = "richiedente", namespace = "http://input.celiachiabesrv.celiachia.csi.it/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Richiedente> richiedente;

    /**
     * Gets the value of the elencoCnu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elencoCnu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElencoCnu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getElencoCnu() {
        if (elencoCnu == null) {
            elencoCnu = new ArrayList<String>();
        }
        return this.elencoCnu;
    }

    /**
     * Recupera il valore della proprieta richiedente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Richiedente }{@code >}
     *     
     */
    public JAXBElement<Richiedente> getRichiedente() {
        return richiedente;
    }

    /**
     * Imposta il valore della proprieta richiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Richiedente }{@code >}
     *     
     */
    public void setRichiedente(JAXBElement<Richiedente> value) {
        this.richiedente = value;
    }

}
