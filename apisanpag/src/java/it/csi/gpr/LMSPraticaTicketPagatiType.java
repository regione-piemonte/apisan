/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per LMSPraticaTicketPagatiType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LMSPraticaTicketPagatiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODICE_FISCALE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NUMERO_PRATICA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_ASR_CUP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESCRIZIONE_ID_ASR_CUP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IMPORTO_PRATICA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IMPORTO_TICKET_PAGATO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MOTIVO_PAGAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CONSENSO_730" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODICE_STATO_PRATICA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESCIZIONE_STATO_PRATICA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DATA_ANNULLAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RICEVUTA_PAGAMENTO" type="{http://csi.it}LMSRicevutePagamentoTicketPagatiType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RIMBORSO_PAGAMENTO" type="{http://csi.it}LMSRicevuteRimborsoPagamentoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IMPORTO_DA_RIMBORSARE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IMPORTO_RIMBORSATO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MODALITA_RIMBORSO" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="RIMBORSI_UTILIZZATI" type="{http://csi.it}LMSRimborsiUtilizzatiType" minOccurs="0"/>
 *         &lt;element name="CODICE_SERVIZIO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODICE_VERSAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LMSPraticaTicketPagatiType", propOrder = {
    "codicefiscale",
    "numeropratica",
    "idasrcup",
    "descrizioneidasrcup",
    "importopratica",
    "importoticketpagato",
    "motivopagamento",
    "consenso730",
    "codicestatopratica",
    "descizionestatopratica",
    "dataannullamento",
    "ricevutapagamento",
    "rimborsopagamento",
    "importodarimborsare",
    "importorimborsato",
    "modalitarimborso",
    "rimborsiutilizzati",
    "codiceservizio",
    "codiceversamento"
})
public class LMSPraticaTicketPagatiType {

    @XmlElement(name = "CODICE_FISCALE", required = true)
    protected String codicefiscale;
    @XmlElement(name = "NUMERO_PRATICA", required = true)
    protected String numeropratica;
    @XmlElement(name = "ID_ASR_CUP", required = true)
    protected String idasrcup;
    @XmlElement(name = "DESCRIZIONE_ID_ASR_CUP", required = true)
    protected String descrizioneidasrcup;
    @XmlElement(name = "IMPORTO_PRATICA", required = true)
    protected String importopratica;
    @XmlElement(name = "IMPORTO_TICKET_PAGATO", required = true)
    protected String importoticketpagato;
    @XmlElement(name = "MOTIVO_PAGAMENTO", required = true)
    protected String motivopagamento;
    @XmlElement(name = "CONSENSO_730", required = true, nillable = true)
    protected String consenso730;
    @XmlElement(name = "CODICE_STATO_PRATICA", required = true)
    protected String codicestatopratica;
    @XmlElement(name = "DESCIZIONE_STATO_PRATICA", required = true)
    protected String descizionestatopratica;
    @XmlElement(name = "DATA_ANNULLAMENTO", required = true, nillable = true)
    protected String dataannullamento;
    @XmlElement(name = "RICEVUTA_PAGAMENTO")
    protected List<LMSRicevutePagamentoTicketPagatiType> ricevutapagamento;
    @XmlElement(name = "RIMBORSO_PAGAMENTO")
    protected List<LMSRicevuteRimborsoPagamentoType> rimborsopagamento;
    @XmlElementRef(name = "IMPORTO_DA_RIMBORSARE", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> importodarimborsare;
    @XmlElementRef(name = "IMPORTO_RIMBORSATO", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> importorimborsato;
    @XmlElementRef(name = "MODALITA_RIMBORSO", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> modalitarimborso;
    @XmlElement(name = "RIMBORSI_UTILIZZATI")
    protected LMSRimborsiUtilizzatiType rimborsiutilizzati;
    @XmlElement(name = "CODICE_SERVIZIO", required = true)
    protected String codiceservizio;
    @XmlElement(name = "CODICE_VERSAMENTO", required = true)
    protected String codiceversamento;

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
     * Recupera il valore della proprieta idasrcup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDASRCUP() {
        return idasrcup;
    }

    /**
     * Imposta il valore della proprieta idasrcup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDASRCUP(String value) {
        this.idasrcup = value;
    }

    /**
     * Recupera il valore della proprieta descrizioneidasrcup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIZIONEIDASRCUP() {
        return descrizioneidasrcup;
    }

    /**
     * Imposta il valore della proprieta descrizioneidasrcup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIZIONEIDASRCUP(String value) {
        this.descrizioneidasrcup = value;
    }

    /**
     * Recupera il valore della proprieta importopratica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPORTOPRATICA() {
        return importopratica;
    }

    /**
     * Imposta il valore della proprieta importopratica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPORTOPRATICA(String value) {
        this.importopratica = value;
    }

    /**
     * Recupera il valore della proprieta importoticketpagato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPORTOTICKETPAGATO() {
        return importoticketpagato;
    }

    /**
     * Imposta il valore della proprieta importoticketpagato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPORTOTICKETPAGATO(String value) {
        this.importoticketpagato = value;
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
     * Recupera il valore della proprieta consenso730.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONSENSO730() {
        return consenso730;
    }

    /**
     * Imposta il valore della proprieta consenso730.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONSENSO730(String value) {
        this.consenso730 = value;
    }

    /**
     * Recupera il valore della proprieta codicestatopratica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICESTATOPRATICA() {
        return codicestatopratica;
    }

    /**
     * Imposta il valore della proprieta codicestatopratica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICESTATOPRATICA(String value) {
        this.codicestatopratica = value;
    }

    /**
     * Recupera il valore della proprieta descizionestatopratica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCIZIONESTATOPRATICA() {
        return descizionestatopratica;
    }

    /**
     * Imposta il valore della proprieta descizionestatopratica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCIZIONESTATOPRATICA(String value) {
        this.descizionestatopratica = value;
    }

    /**
     * Recupera il valore della proprieta dataannullamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAANNULLAMENTO() {
        return dataannullamento;
    }

    /**
     * Imposta il valore della proprieta dataannullamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAANNULLAMENTO(String value) {
        this.dataannullamento = value;
    }

    /**
     * Gets the value of the ricevutapagamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ricevutapagamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRICEVUTAPAGAMENTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LMSRicevutePagamentoTicketPagatiType }
     * 
     * 
     */
    public List<LMSRicevutePagamentoTicketPagatiType> getRICEVUTAPAGAMENTO() {
        if (ricevutapagamento == null) {
            ricevutapagamento = new ArrayList<LMSRicevutePagamentoTicketPagatiType>();
        }
        return this.ricevutapagamento;
    }

    /**
     * Gets the value of the rimborsopagamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rimborsopagamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRIMBORSOPAGAMENTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LMSRicevuteRimborsoPagamentoType }
     * 
     * 
     */
    public List<LMSRicevuteRimborsoPagamentoType> getRIMBORSOPAGAMENTO() {
        if (rimborsopagamento == null) {
            rimborsopagamento = new ArrayList<LMSRicevuteRimborsoPagamentoType>();
        }
        return this.rimborsopagamento;
    }

    /**
     * Recupera il valore della proprieta importodarimborsare.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIMPORTODARIMBORSARE() {
        return importodarimborsare;
    }

    /**
     * Imposta il valore della proprieta importodarimborsare.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIMPORTODARIMBORSARE(JAXBElement<String> value) {
        this.importodarimborsare = value;
    }

    /**
     * Recupera il valore della proprieta importorimborsato.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIMPORTORIMBORSATO() {
        return importorimborsato;
    }

    /**
     * Imposta il valore della proprieta importorimborsato.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIMPORTORIMBORSATO(JAXBElement<String> value) {
        this.importorimborsato = value;
    }

    /**
     * Recupera il valore della proprieta modalitarimborso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getMODALITARIMBORSO() {
        return modalitarimborso;
    }

    /**
     * Imposta il valore della proprieta modalitarimborso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setMODALITARIMBORSO(JAXBElement<BigInteger> value) {
        this.modalitarimborso = value;
    }

    /**
     * Recupera il valore della proprieta rimborsiutilizzati.
     * 
     * @return
     *     possible object is
     *     {@link LMSRimborsiUtilizzatiType }
     *     
     */
    public LMSRimborsiUtilizzatiType getRIMBORSIUTILIZZATI() {
        return rimborsiutilizzati;
    }

    /**
     * Imposta il valore della proprieta rimborsiutilizzati.
     * 
     * @param value
     *     allowed object is
     *     {@link LMSRimborsiUtilizzatiType }
     *     
     */
    public void setRIMBORSIUTILIZZATI(LMSRimborsiUtilizzatiType value) {
        this.rimborsiutilizzati = value;
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

}
