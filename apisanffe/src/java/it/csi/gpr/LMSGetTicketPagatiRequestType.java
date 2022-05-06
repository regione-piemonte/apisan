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
 * <p>Classe Java per LMSGetTicketPagatiRequestType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LMSGetTicketPagatiRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODICE_SERVIZIO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NUMERO_SPORTELLO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODICE_ASR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODICE_FISCALE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ANNO_PAGAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LMSGetTicketPagatiRequestType", propOrder = {
    "codiceservizio",
    "numerosportello",
    "uuid",
    "codiceasr",
    "codicefiscale",
    "annopagamento"
})
public class LMSGetTicketPagatiRequestType {

    @XmlElement(name = "CODICE_SERVIZIO", required = true)
    protected String codiceservizio;
    @XmlElement(name = "NUMERO_SPORTELLO", required = true)
    protected String numerosportello;
    @XmlElement(name = "UUID")
    protected String uuid;
    @XmlElement(name = "CODICE_ASR", required = true)
    protected String codiceasr;
    @XmlElement(name = "CODICE_FISCALE", required = true)
    protected String codicefiscale;
    @XmlElement(name = "ANNO_PAGAMENTO", required = true)
    protected String annopagamento;

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
     * Recupera il valore della proprietà codiceasr.
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
     * Imposta il valore della proprietà codiceasr.
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
     * Recupera il valore della proprietà annopagamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANNOPAGAMENTO() {
        return annopagamento;
    }

    /**
     * Imposta il valore della proprietà annopagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANNOPAGAMENTO(String value) {
        this.annopagamento = value;
    }

}
