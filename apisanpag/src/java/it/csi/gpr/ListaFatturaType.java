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
 * <p>Classe Java per ListaFatturaType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ListaFatturaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ELENCO_PAGAMENTI" type="{http://csi.it}ElencoPagamentiType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaFatturaType", propOrder = {
    "elencopagamenti"
})
public class ListaFatturaType {

    @XmlElement(name = "ELENCO_PAGAMENTI")
    protected ElencoPagamentiType elencopagamenti;

    /**
     * Recupera il valore della proprieta elencopagamenti.
     * 
     * @return
     *     possible object is
     *     {@link ElencoPagamentiType }
     *     
     */
    public ElencoPagamentiType getELENCOPAGAMENTI() {
        return elencopagamenti;
    }

    /**
     * Imposta il valore della proprieta elencopagamenti.
     * 
     * @param value
     *     allowed object is
     *     {@link ElencoPagamentiType }
     *     
     */
    public void setELENCOPAGAMENTI(ElencoPagamentiType value) {
        this.elencopagamenti = value;
    }

}
