/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package org.wso2.ws.dataservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CONFIGURAZIONE_LOTTI complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CONFIGURAZIONE_LOTTI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODICE_ASR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODICE_VERSAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NUM_OCCORRENZE_IUV" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NUM_SOGLIA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DATA_INIZIO_VALIDITA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DATA_FINE_VALIDITA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONFIGURAZIONE_LOTTI", propOrder = {
    "codiceasr",
    "codiceversamento",
    "numoccorrenzeiuv",
    "numsoglia",
    "datainiziovalidita",
    "datafinevalidita"
})
public class CONFIGURAZIONELOTTI {

    @XmlElement(name = "CODICE_ASR", required = true, nillable = true)
    protected String codiceasr;
    @XmlElement(name = "CODICE_VERSAMENTO", required = true, nillable = true)
    protected String codiceversamento;
    @XmlElement(name = "NUM_OCCORRENZE_IUV", required = true, nillable = true)
    protected String numoccorrenzeiuv;
    @XmlElement(name = "NUM_SOGLIA", required = true, nillable = true)
    protected String numsoglia;
    @XmlElement(name = "DATA_INIZIO_VALIDITA", required = true, nillable = true)
    protected String datainiziovalidita;
    @XmlElement(name = "DATA_FINE_VALIDITA", required = true, nillable = true)
    protected String datafinevalidita;

    /**
     * Recupera il valore della proprieta codiceasr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICEASR() {
        return codiceasr;
    }

    /**
     * Imposta il valore della proprieta codiceasr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICEASR(String value) {
        this.codiceasr = value;
    }

    /**
     * Recupera il valore della proprieta codiceversamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICEVERSAMENTO() {
        return codiceversamento;
    }

    /**
     * Imposta il valore della proprieta codiceversamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICEVERSAMENTO(String value) {
        this.codiceversamento = value;
    }

    /**
     * Recupera il valore della proprieta numoccorrenzeiuv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMOCCORRENZEIUV() {
        return numoccorrenzeiuv;
    }

    /**
     * Imposta il valore della proprieta numoccorrenzeiuv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMOCCORRENZEIUV(String value) {
        this.numoccorrenzeiuv = value;
    }

    /**
     * Recupera il valore della proprieta numsoglia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMSOGLIA() {
        return numsoglia;
    }

    /**
     * Imposta il valore della proprieta numsoglia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMSOGLIA(String value) {
        this.numsoglia = value;
    }

    /**
     * Recupera il valore della proprieta datainiziovalidita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAINIZIOVALIDITA() {
        return datainiziovalidita;
    }

    /**
     * Imposta il valore della proprieta datainiziovalidita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAINIZIOVALIDITA(String value) {
        this.datainiziovalidita = value;
    }

    /**
     * Recupera il valore della proprieta datafinevalidita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAFINEVALIDITA() {
        return datafinevalidita;
    }

    /**
     * Imposta il valore della proprieta datafinevalidita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAFINEVALIDITA(String value) {
        this.datafinevalidita = value;
    }

}
