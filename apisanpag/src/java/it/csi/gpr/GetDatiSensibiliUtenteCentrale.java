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
 *         &lt;element name="ASR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AZIONE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NUMERO_PRATICA" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "uuid",
    "azione",
    "numeropratica"
})
@XmlRootElement(name = "GetDatiSensibiliUtenteCentrale")
public class GetDatiSensibiliUtenteCentrale {

    @XmlElement(name = "ASR", required = true)
    protected String asr;
    @XmlElement(name = "UUID", required = true)
    protected String uuid;
    @XmlElement(name = "AZIONE", required = true)
    protected String azione;
    @XmlElement(name = "NUMERO_PRATICA", required = true)
    protected String numeropratica;

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
     * Recupera il valore della proprieta uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Imposta il valore della proprieta uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Recupera il valore della proprieta azione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZIONE() {
        return azione;
    }

    /**
     * Imposta il valore della proprieta azione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZIONE(String value) {
        this.azione = value;
    }

    /**
     * Recupera il valore della proprieta numeropratica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROPRATICA() {
        return numeropratica;
    }

    /**
     * Imposta il valore della proprieta numeropratica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROPRATICA(String value) {
        this.numeropratica = value;
    }

}
