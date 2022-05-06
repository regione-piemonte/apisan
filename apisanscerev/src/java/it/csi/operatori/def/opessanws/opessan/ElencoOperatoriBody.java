/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.operatori.def.opessanws.opessan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ElencoOperatoriBody complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ElencoOperatoriBody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="associazione" type="{http://opessan.opessanws.def.csi.it/}Associazione"/>
 *         &lt;element name="elencoOperatori" type="{http://opessan.opessanws.def.csi.it/}ElencoOperatori"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElencoOperatoriBody", propOrder = {
    "associazione",
    "elencoOperatori"
})
public class ElencoOperatoriBody {

    @XmlElement(required = true)
    protected Associazione associazione;
    @XmlElement(required = true)
    protected ElencoOperatori elencoOperatori;

    /**
     * Recupera il valore della proprieta associazione.
     * 
     * @return
     *     possible object is
     *     {@link Associazione }
     *     
     */
    public Associazione getAssociazione() {
        return associazione;
    }

    /**
     * Imposta il valore della proprieta associazione.
     * 
     * @param value
     *     allowed object is
     *     {@link Associazione }
     *     
     */
    public void setAssociazione(Associazione value) {
        this.associazione = value;
    }

    /**
     * Recupera il valore della proprieta elencoOperatori.
     * 
     * @return
     *     possible object is
     *     {@link ElencoOperatori }
     *     
     */
    public ElencoOperatori getElencoOperatori() {
        return elencoOperatori;
    }

    /**
     * Imposta il valore della proprieta elencoOperatori.
     * 
     * @param value
     *     allowed object is
     *     {@link ElencoOperatori }
     *     
     */
    public void setElencoOperatori(ElencoOperatori value) {
        this.elencoOperatori = value;
    }

}
