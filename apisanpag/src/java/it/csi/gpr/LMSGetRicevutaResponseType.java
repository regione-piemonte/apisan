/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per LMSGetRicevutaResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LMSGetRicevutaResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRATICA" type="{http://csi.it}LMSPraticaRicevutaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LMSGetRicevutaResponseType", propOrder = {
    "pratica"
})
public class LMSGetRicevutaResponseType {

    @XmlElement(name = "PRATICA")
    protected LMSPraticaRicevutaType pratica;

    /**
     * Recupera il valore della proprieta pratica.
     * 
     * @return
     *     possible object is
     *     {@link LMSPraticaRicevutaType }
     *     
     */
    public LMSPraticaRicevutaType getPRATICA() {
        return pratica;
    }

    /**
     * Imposta il valore della proprieta pratica.
     * 
     * @param value
     *     allowed object is
     *     {@link LMSPraticaRicevutaType }
     *     
     */
    public void setPRATICA(LMSPraticaRicevutaType value) {
        this.pratica = value;
    }

}
