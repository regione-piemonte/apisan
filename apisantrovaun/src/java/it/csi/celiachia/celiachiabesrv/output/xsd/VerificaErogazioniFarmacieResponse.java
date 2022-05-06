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
 * <p>Classe Java per VerificaErogazioniFarmacieResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VerificaErogazioniFarmacieResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="elencoErogazioniFarmacia" type="{http://output.celiachiabesrv.celiachia.csi.it/xsd}ErogazioneFarmacia" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="esito" type="{http://output.celiachiabesrv.celiachia.csi.it/xsd}Esito" minOccurs="0"/>
 *         &lt;element name="listaErrori" type="{http://output.celiachiabesrv.celiachia.csi.it/xsd}Errore" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificaErogazioniFarmacieResponse", propOrder = {
    "elencoErogazioniFarmacia",
    "esito",
    "listaErrori"
})
public class VerificaErogazioniFarmacieResponse {

    @XmlElement(nillable = true)
    protected List<ErogazioneFarmacia> elencoErogazioniFarmacia;
    @XmlElementRef(name = "esito", namespace = "http://output.celiachiabesrv.celiachia.csi.it/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Esito> esito;
    @XmlElement(nillable = true)
    protected List<Errore> listaErrori;

    /**
     * Gets the value of the elencoErogazioniFarmacia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elencoErogazioniFarmacia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElencoErogazioniFarmacia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErogazioneFarmacia }
     * 
     * 
     */
    public List<ErogazioneFarmacia> getElencoErogazioniFarmacia() {
        if (elencoErogazioniFarmacia == null) {
            elencoErogazioniFarmacia = new ArrayList<ErogazioneFarmacia>();
        }
        return this.elencoErogazioniFarmacia;
    }

    /**
     * Recupera il valore della proprieta esito.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Esito }{@code >}
     *     
     */
    public JAXBElement<Esito> getEsito() {
        return esito;
    }

    /**
     * Imposta il valore della proprieta esito.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Esito }{@code >}
     *     
     */
    public void setEsito(JAXBElement<Esito> value) {
        this.esito = value;
    }

    /**
     * Gets the value of the listaErrori property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaErrori property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaErrori().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Errore }
     * 
     * 
     */
    public List<Errore> getListaErrori() {
        if (listaErrori == null) {
            listaErrori = new ArrayList<Errore>();
        }
        return this.listaErrori;
    }

}
