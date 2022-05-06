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
 * <p>Classe Java per LMSRimborsoDettPraticaRicevutaType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LMSRimborsoDettPraticaRicevutaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_RIMBORSO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATA_RIMBORSO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STAMPA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LMSRimborsoDettPraticaRicevutaType", propOrder = {
    "idrimborso",
    "datarimborso",
    "stampa"
})
public class LMSRimborsoDettPraticaRicevutaType {

    @XmlElement(name = "ID_RIMBORSO")
    protected String idrimborso;
    @XmlElement(name = "DATA_RIMBORSO")
    protected String datarimborso;
    @XmlElement(name = "STAMPA")
    protected String stampa;

    /**
     * Recupera il valore della proprieta idrimborso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDRIMBORSO() {
        return idrimborso;
    }

    /**
     * Imposta il valore della proprieta idrimborso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDRIMBORSO(String value) {
        this.idrimborso = value;
    }

    /**
     * Recupera il valore della proprieta datarimborso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATARIMBORSO() {
        return datarimborso;
    }

    /**
     * Imposta il valore della proprieta datarimborso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATARIMBORSO(String value) {
        this.datarimborso = value;
    }

    /**
     * Recupera il valore della proprieta stampa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAMPA() {
        return stampa;
    }

    /**
     * Imposta il valore della proprieta stampa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAMPA(String value) {
        this.stampa = value;
    }

}
