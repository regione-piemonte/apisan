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
 * <p>Classe Java per richiestaAssociazioneIUVTicket complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="richiestaAssociazioneIUVTicket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AZIONE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODICE_SERVIZIO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODICE_ASR" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="NUMERO_SPORTELLO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NUMERO_PRATICA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODICE_FISCALE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MOTIVO_PAGAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODICE_VERSAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MODELLO_PAGAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AUXDIGIT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="APPLICATION_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "richiestaAssociazioneIUVTicket", propOrder = {
    "uuid",
    "azione",
    "codiceservizio",
    "codiceasr",
    "numerosportello",
    "numeropratica",
    "codicefiscale",
    "motivopagamento",
    "codiceversamento",
    "modellopagamento",
    "auxdigit",
    "applicationcode",
    "iuv"
})
public class RichiestaAssociazioneIUVTicket {

    @XmlElement(name = "UUID", required = true)
    protected String uuid;
    @XmlElement(name = "AZIONE", required = true)
    protected String azione;
    @XmlElement(name = "CODICE_SERVIZIO", required = true)
    protected String codiceservizio;
    @XmlElement(name = "CODICE_ASR")
    protected short codiceasr;
    @XmlElement(name = "NUMERO_SPORTELLO", required = true)
    protected String numerosportello;
    @XmlElement(name = "NUMERO_PRATICA", required = true)
    protected String numeropratica;
    @XmlElement(name = "CODICE_FISCALE", required = true)
    protected String codicefiscale;
    @XmlElement(name = "MOTIVO_PAGAMENTO", required = true)
    protected String motivopagamento;
    @XmlElement(name = "CODICE_VERSAMENTO", required = true)
    protected String codiceversamento;
    @XmlElement(name = "MODELLO_PAGAMENTO", required = true)
    protected String modellopagamento;
    @XmlElement(name = "AUXDIGIT", required = true)
    protected String auxdigit;
    @XmlElement(name = "APPLICATION_CODE", required = true)
    protected String applicationcode;
    @XmlElement(name = "IUV", required = true)
    protected String iuv;

    /**
     * Recupera il valore della proprietà uuid.
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
     * Imposta il valore della proprietà uuid.
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
     * Recupera il valore della proprietà azione.
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
     * Imposta il valore della proprietà azione.
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
     * Recupera il valore della proprietà codiceservizio.
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
     * Imposta il valore della proprietà codiceservizio.
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
     * Recupera il valore della proprietà codiceasr.
     * 
     */
    public short getCODICEASR() {
        return codiceasr;
    }

    /**
     * Imposta il valore della proprietà codiceasr.
     * 
     */
    public void setCODICEASR(short value) {
        this.codiceasr = value;
    }

    /**
     * Recupera il valore della proprietà numerosportello.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROSPORTELLO() {
        return numerosportello;
    }

    /**
     * Imposta il valore della proprietà numerosportello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROSPORTELLO(String value) {
        this.numerosportello = value;
    }

    /**
     * Recupera il valore della proprietà numeropratica.
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
     * Imposta il valore della proprietà numeropratica.
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
     * Recupera il valore della proprietà codicefiscale.
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
     * Imposta il valore della proprietà codicefiscale.
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
     * Recupera il valore della proprietà motivopagamento.
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
     * Imposta il valore della proprietà motivopagamento.
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
     * Recupera il valore della proprietà codiceversamento.
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
     * Imposta il valore della proprietà codiceversamento.
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
     * Recupera il valore della proprietà modellopagamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODELLOPAGAMENTO() {
        return modellopagamento;
    }

    /**
     * Imposta il valore della proprietà modellopagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODELLOPAGAMENTO(String value) {
        this.modellopagamento = value;
    }

    /**
     * Recupera il valore della proprietà auxdigit.
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
     * Imposta il valore della proprietà auxdigit.
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
     * Recupera il valore della proprietà applicationcode.
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
     * Imposta il valore della proprietà applicationcode.
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
     * Recupera il valore della proprietà iuv.
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
     * Imposta il valore della proprietà iuv.
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
