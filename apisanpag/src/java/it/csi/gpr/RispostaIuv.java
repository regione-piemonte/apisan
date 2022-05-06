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
 * <p>Classe Java per rispostaIuv complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="rispostaIuv">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODICE_FISCALE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MOTIVO_PAGAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODICE_SERVIZIO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NUMERO_PRATICA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODICE_VERSAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AUXDIGIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="APPLICATION_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IUV" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rispostaIuv", propOrder = {
    "uuid",
    "codicefiscale",
    "motivopagamento",
    "codiceservizio",
    "numeropratica",
    "codiceversamento",
    "auxdigit",
    "applicationcode",
    "iuv"
})
public class RispostaIuv {

    @XmlElement(name = "UUID", required = true)
    protected String uuid;
    @XmlElement(name = "CODICE_FISCALE", required = true)
    protected String codicefiscale;
    @XmlElement(name = "MOTIVO_PAGAMENTO", required = true)
    protected String motivopagamento;
    @XmlElement(name = "CODICE_SERVIZIO", required = true)
    protected String codiceservizio;
    @XmlElement(name = "NUMERO_PRATICA", required = true)
    protected String numeropratica;
    @XmlElement(name = "CODICE_VERSAMENTO", required = true)
    protected String codiceversamento;
    @XmlElement(name = "AUXDIGIT")
    protected String auxdigit;
    @XmlElement(name = "APPLICATION_CODE")
    protected String applicationcode;
    @XmlElement(name = "IUV", required = true)
    protected String iuv;

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
     * Recupera il valore della proprieta codicefiscale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICEFISCALE() {
        return codicefiscale;
    }

    /**
     * Imposta il valore della proprieta codicefiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICEFISCALE(String value) {
        this.codicefiscale = value;
    }

    /**
     * Recupera il valore della proprieta motivopagamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOTIVOPAGAMENTO() {
        return motivopagamento;
    }

    /**
     * Imposta il valore della proprieta motivopagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOTIVOPAGAMENTO(String value) {
        this.motivopagamento = value;
    }

    /**
     * Recupera il valore della proprieta codiceservizio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICESERVIZIO() {
        return codiceservizio;
    }

    /**
     * Imposta il valore della proprieta codiceservizio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICESERVIZIO(String value) {
        this.codiceservizio = value;
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
     * Recupera il valore della proprieta auxdigit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUXDIGIT() {
        return auxdigit;
    }

    /**
     * Imposta il valore della proprieta auxdigit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUXDIGIT(String value) {
        this.auxdigit = value;
    }

    /**
     * Recupera il valore della proprieta applicationcode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPLICATIONCODE() {
        return applicationcode;
    }

    /**
     * Imposta il valore della proprieta applicationcode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPLICATIONCODE(String value) {
        this.applicationcode = value;
    }

    /**
     * Recupera il valore della proprieta iuv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIUV() {
        return iuv;
    }

    /**
     * Imposta il valore della proprieta iuv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIUV(String value) {
        this.iuv = value;
    }

}
