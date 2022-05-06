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
 * <p>Classe Java per LMSGetTicketPagatiResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LMSGetTicketPagatiResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRATICHE_DELEGATO" type="{http://csi.it}LMSPraticheType" minOccurs="0"/>
 *         &lt;element name="PRATICHE_DELEGANTI" type="{http://csi.it}LMSPraticheType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LMSGetTicketPagatiResponseType", propOrder = {
    "pratichedelegato",
    "pratichedeleganti"
})
public class LMSGetTicketPagatiResponseType {

    @XmlElement(name = "PRATICHE_DELEGATO")
    protected LMSPraticheType pratichedelegato;
    @XmlElement(name = "PRATICHE_DELEGANTI")
    protected LMSPraticheType pratichedeleganti;

    /**
     * Recupera il valore della proprieta pratichedelegato.
     * 
     * @return
     *     possible object is
     *     {@link LMSPraticheType }
     *     
     */
    public LMSPraticheType getPRATICHEDELEGATO() {
        return pratichedelegato;
    }

    /**
     * Imposta il valore della proprieta pratichedelegato.
     * 
     * @param value
     *     allowed object is
     *     {@link LMSPraticheType }
     *     
     */
    public void setPRATICHEDELEGATO(LMSPraticheType value) {
        this.pratichedelegato = value;
    }

    /**
     * Recupera il valore della proprieta pratichedeleganti.
     * 
     * @return
     *     possible object is
     *     {@link LMSPraticheType }
     *     
     */
    public LMSPraticheType getPRATICHEDELEGANTI() {
        return pratichedeleganti;
    }

    /**
     * Imposta il valore della proprieta pratichedeleganti.
     * 
     * @param value
     *     allowed object is
     *     {@link LMSPraticheType }
     *     
     */
    public void setPRATICHEDELEGANTI(LMSPraticheType value) {
        this.pratichedeleganti = value;
    }

}
