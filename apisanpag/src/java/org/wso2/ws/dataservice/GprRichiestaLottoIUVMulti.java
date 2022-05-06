/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package org.wso2.ws.dataservice;

import java.math.BigDecimal;
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
 *         &lt;element name="codice_asr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codice_versamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uuid_gpr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uuid_gpa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iuv_richiesti" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="esito_prec" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "codiceAsr",
    "codiceVersamento",
    "uuidGpr",
    "uuidGpa",
    "iuvRichiesti",
    "esitoPrec"
})
@XmlRootElement(name = "GprRichiestaLottoIUVMulti")
public class GprRichiestaLottoIUVMulti {

    @XmlElement(name = "codice_asr", required = true, nillable = true)
    protected String codiceAsr;
    @XmlElement(name = "codice_versamento", required = true, nillable = true)
    protected String codiceVersamento;
    @XmlElement(name = "uuid_gpr", required = true, nillable = true)
    protected String uuidGpr;
    @XmlElement(name = "uuid_gpa", required = true, nillable = true)
    protected String uuidGpa;
    @XmlElement(name = "iuv_richiesti", required = true, nillable = true)
    protected BigDecimal iuvRichiesti;
    @XmlElement(name = "esito_prec", required = true, nillable = true)
    protected BigDecimal esitoPrec;

    /**
     * Recupera il valore della proprieta codiceAsr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceAsr() {
        return codiceAsr;
    }

    /**
     * Imposta il valore della proprieta codiceAsr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceAsr(String value) {
        this.codiceAsr = value;
    }

    /**
     * Recupera il valore della proprieta codiceVersamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceVersamento() {
        return codiceVersamento;
    }

    /**
     * Imposta il valore della proprieta codiceVersamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceVersamento(String value) {
        this.codiceVersamento = value;
    }

    /**
     * Recupera il valore della proprieta uuidGpr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuidGpr() {
        return uuidGpr;
    }

    /**
     * Imposta il valore della proprieta uuidGpr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuidGpr(String value) {
        this.uuidGpr = value;
    }

    /**
     * Recupera il valore della proprieta uuidGpa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuidGpa() {
        return uuidGpa;
    }

    /**
     * Imposta il valore della proprieta uuidGpa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuidGpa(String value) {
        this.uuidGpa = value;
    }

    /**
     * Recupera il valore della proprieta iuvRichiesti.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIuvRichiesti() {
        return iuvRichiesti;
    }

    /**
     * Imposta il valore della proprieta iuvRichiesti.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIuvRichiesti(BigDecimal value) {
        this.iuvRichiesti = value;
    }

    /**
     * Recupera il valore della proprieta esitoPrec.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEsitoPrec() {
        return esitoPrec;
    }

    /**
     * Imposta il valore della proprieta esitoPrec.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEsitoPrec(BigDecimal value) {
        this.esitoPrec = value;
    }

}
