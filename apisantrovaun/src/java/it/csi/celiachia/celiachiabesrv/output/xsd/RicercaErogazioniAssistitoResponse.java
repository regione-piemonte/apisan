/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.celiachia.celiachiabesrv.output.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per RicercaErogazioniAssistitoResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RicercaErogazioniAssistitoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://output.celiachiabesrv.celiachia.csi.it/xsd}BasicEsitoOutput">
 *       &lt;sequence>
 *         &lt;element name="elencoErogazioni" type="{http://output.celiachiabesrv.celiachia.csi.it/xsd}ElencoErogazioni" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="errore" type="{http://output.celiachiabesrv.celiachia.csi.it/xsd}Errore" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RicercaErogazioniAssistitoResponse", propOrder = {
    "elencoErogazioni",
    "errore"
})
public class RicercaErogazioniAssistitoResponse
    extends BasicEsitoOutput
{

    @XmlElement(nillable = true)
    protected List<ElencoErogazioni> elencoErogazioni;
    @XmlElementRef(name = "errore", namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Errore> errore;

    /**
     * Gets the value of the elencoErogazioni property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elencoErogazioni property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElencoErogazioni().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElencoErogazioni }
     * 
     * 
     */
    public List<ElencoErogazioni> getElencoErogazioni() {
        if (elencoErogazioni == null) {
            elencoErogazioni = new ArrayList<ElencoErogazioni>();
        }
        return this.elencoErogazioni;
    }

    /**
     * Recupera il valore della proprieta errore.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Errore }{@code >}
     *     
     */
    public JAXBElement<Errore> getErrore() {
        return errore;
    }

    /**
     * Imposta il valore della proprieta errore.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Errore }{@code >}
     *     
     */
    public void setErrore(JAXBElement<Errore> value) {
        this.errore = value;
    }

}
