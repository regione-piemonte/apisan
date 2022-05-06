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
 *         &lt;element name="GetImportoTicketResult" type="{http://csi.it}Importi"/>
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
    "getImportoTicketResult"
})
@XmlRootElement(name = "GetImportoTicketResponse")
public class GetImportoTicketResponse {

    @XmlElement(name = "GetImportoTicketResult", required = true)
    protected Importi getImportoTicketResult;

    /**
     * Recupera il valore della proprieta getImportoTicketResult.
     * 
     * @return
     *     possible object is
     *     {@link Importi }
     *     
     */
    public Importi getGetImportoTicketResult() {
        return getImportoTicketResult;
    }

    /**
     * Imposta il valore della proprieta getImportoTicketResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Importi }
     *     
     */
    public void setGetImportoTicketResult(Importi value) {
        this.getImportoTicketResult = value;
    }

}
