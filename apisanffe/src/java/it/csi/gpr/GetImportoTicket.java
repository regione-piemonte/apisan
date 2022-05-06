/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="richiesta" type="{http://csi.it}Richiesta" minOccurs="0"/>
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
@XmlRootElement(name = "GetImportoTicket")
public class GetImportoTicket {

    protected Richiesta richiesta;

    /**
     * Recupera il valore della proprietà richiesta.
     * 
     * @return
     *     possible object is
     *     {@link Richiesta }
     *     
     */
    public Richiesta getRichiesta() {
        return richiesta;
    }

    /**
     * Imposta il valore della proprietà richiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link Richiesta }
     *     
     */
    public void setRichiesta(Richiesta value) {
        this.richiesta = value;
    }

}
