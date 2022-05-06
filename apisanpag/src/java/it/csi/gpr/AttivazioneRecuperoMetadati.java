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
 *         &lt;element name="ASR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATA_RECUPERO_DA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DATA_RECUPERO_A" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "asr",
    "datarecuperoda",
    "datarecuperoa"
})
@XmlRootElement(name = "AttivazioneRecuperoMetadati")
public class AttivazioneRecuperoMetadati {

    @XmlElement(name = "ASR")
    protected String asr;
    @XmlElement(name = "DATA_RECUPERO_DA", required = true)
    protected String datarecuperoda;
    @XmlElement(name = "DATA_RECUPERO_A", required = true)
    protected String datarecuperoa;

    /**
     * Recupera il valore della proprieta asr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASR() {
        return asr;
    }

    /**
     * Imposta il valore della proprieta asr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASR(String value) {
        this.asr = value;
    }

    /**
     * Recupera il valore della proprieta datarecuperoda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATARECUPERODA() {
        return datarecuperoda;
    }

    /**
     * Imposta il valore della proprieta datarecuperoda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATARECUPERODA(String value) {
        this.datarecuperoda = value;
    }

    /**
     * Recupera il valore della proprieta datarecuperoa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATARECUPEROA() {
        return datarecuperoa;
    }

    /**
     * Imposta il valore della proprieta datarecuperoa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATARECUPEROA(String value) {
        this.datarecuperoa = value;
    }

}
