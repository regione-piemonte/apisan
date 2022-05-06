/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per LMSAttRicRimbPraticaRicevutaType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LMSAttRicRimbPraticaRicevutaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STAMPA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MODALITA_RIMBORSO" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="INVIATO_DA_ASR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LMSAttRicRimbPraticaRicevutaType", propOrder = {
    "stampa",
    "modalitarimborso",
    "inviatodaasr"
})
public class LMSAttRicRimbPraticaRicevutaType {

    @XmlElement(name = "STAMPA", required = true)
    protected String stampa;
    @XmlElement(name = "MODALITA_RIMBORSO")
    protected BigInteger modalitarimborso;
    @XmlElement(name = "INVIATO_DA_ASR")
    protected BigInteger inviatodaasr;

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

    /**
     * Recupera il valore della proprieta modalitarimborso.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMODALITARIMBORSO() {
        return modalitarimborso;
    }

    /**
     * Imposta il valore della proprieta modalitarimborso.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMODALITARIMBORSO(BigInteger value) {
        this.modalitarimborso = value;
    }

    /**
     * Recupera il valore della proprieta inviatodaasr.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getINVIATODAASR() {
        return inviatodaasr;
    }

    /**
     * Imposta il valore della proprieta inviatodaasr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setINVIATODAASR(BigInteger value) {
        this.inviatodaasr = value;
    }

}
