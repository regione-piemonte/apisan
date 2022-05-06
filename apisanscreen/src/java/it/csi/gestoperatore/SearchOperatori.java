/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestoperatore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filtroRicercaOperatore" type="{http://www.csi.it/gestOperatore/}FiltroRicercaOperatoreType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "filtroRicercaOperatore"
})
@XmlRootElement(name = "searchOperatori")
public class SearchOperatori {

    @XmlElement(required = true)
    protected FiltroRicercaOperatoreType filtroRicercaOperatore;

    /**
     * Recupera il valore della proprietà filtroRicercaOperatore.
     * 
     * @return
     *     possible object is
     *     {@link FiltroRicercaOperatoreType }
     *     
     */
    public FiltroRicercaOperatoreType getFiltroRicercaOperatore() {
        return filtroRicercaOperatore;
    }

    /**
     * Imposta il valore della proprietà filtroRicercaOperatore.
     * 
     * @param value
     *     allowed object is
     *     {@link FiltroRicercaOperatoreType }
     *     
     */
    public void setFiltroRicercaOperatore(FiltroRicercaOperatoreType value) {
        this.filtroRicercaOperatore = value;
    }

}
