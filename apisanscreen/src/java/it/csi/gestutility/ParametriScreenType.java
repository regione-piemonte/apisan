/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestutility;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ParametriScreenType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ParametriScreenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="minGiorniInvitoPrimoLiv" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="minGiorniInvitoPrimoLivSigmo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParametriScreenType", propOrder = {
    "minGiorniInvitoPrimoLiv",
    "minGiorniInvitoPrimoLivSigmo"
})
public class ParametriScreenType {

    protected Integer minGiorniInvitoPrimoLiv;
    protected Integer minGiorniInvitoPrimoLivSigmo;

    /**
     * Recupera il valore della proprietà minGiorniInvitoPrimoLiv.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinGiorniInvitoPrimoLiv() {
        return minGiorniInvitoPrimoLiv;
    }

    /**
     * Imposta il valore della proprietà minGiorniInvitoPrimoLiv.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinGiorniInvitoPrimoLiv(Integer value) {
        this.minGiorniInvitoPrimoLiv = value;
    }

    /**
     * Recupera il valore della proprietà minGiorniInvitoPrimoLivSigmo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinGiorniInvitoPrimoLivSigmo() {
        return minGiorniInvitoPrimoLivSigmo;
    }

    /**
     * Imposta il valore della proprietà minGiorniInvitoPrimoLivSigmo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinGiorniInvitoPrimoLivSigmo(Integer value) {
        this.minGiorniInvitoPrimoLivSigmo = value;
    }

}
