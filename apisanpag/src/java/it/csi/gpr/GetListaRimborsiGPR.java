/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

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
 *         &lt;element name="richiesta" type="{http://csi.it}GetListaRimborsiGPRRequest"/>
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
    "richiesta"
})
@XmlRootElement(name = "GetListaRimborsiGPR")
public class GetListaRimborsiGPR {

    @XmlElement(required = true)
    protected GetListaRimborsiGPRRequest richiesta;

    /**
     * Recupera il valore della proprieta richiesta.
     * 
     * @return
     *     possible object is
     *     {@link GetListaRimborsiGPRRequest }
     *     
     */
    public GetListaRimborsiGPRRequest getRichiesta() {
        return richiesta;
    }

    /**
     * Imposta il valore della proprieta richiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link GetListaRimborsiGPRRequest }
     *     
     */
    public void setRichiesta(GetListaRimborsiGPRRequest value) {
        this.richiesta = value;
    }

}
