/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisancons.integration.conspref.consprefbe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import it.csi.apisan.apisancons.integration.conspref.consensocittadino.Consenso;


/**
 * <p>Classe Java per inserisciConsensoBe complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="inserisciConsensoBe">
 *   &lt;complexContent>
 *     &lt;extension base="{http://consprefbe.csi.it/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="operatore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consenso" type="{consensoCittadino}consenso"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inserisciConsensoBe", propOrder = {
    "operatore",
    "consenso"
})
public class InserisciConsensoBe
    extends ServiceRequest
{

    protected String operatore;
    @XmlElement(required = true)
    protected Consenso consenso;

    /**
     * Recupera il valore della proprietà operatore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatore() {
        return operatore;
    }

    /**
     * Imposta il valore della proprietà operatore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatore(String value) {
        this.operatore = value;
    }

    /**
     * Recupera il valore della proprietà consenso.
     * 
     * @return
     *     possible object is
     *     {@link Consenso }
     *     
     */
    public Consenso getConsenso() {
        return consenso;
    }

    /**
     * Imposta il valore della proprietà consenso.
     * 
     * @param value
     *     allowed object is
     *     {@link Consenso }
     *     
     */
    public void setConsenso(Consenso value) {
        this.consenso = value;
    }

}
