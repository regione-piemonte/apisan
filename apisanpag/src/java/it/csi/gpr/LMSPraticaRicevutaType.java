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
 * <p>Classe Java per LMSPraticaRicevutaType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LMSPraticaRicevutaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODICE_FISCALE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NUMERO_PRATICA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_ASR_CUP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ELENCO_RICEVUTE_STAMPA_ASR" type="{http://csi.it}LMSDettPraticaRicevutaType" minOccurs="0"/>
 *         &lt;element name="ELENCO_RICEVUTE_CORTESIA" type="{http://csi.it}LMSDettPraticaRicevutaType" minOccurs="0"/>
 *         &lt;element name="ELENCO_RICEVUTE_STAMPA_REGIONALE" type="{http://csi.it}LMSDettPraticaRicevutaType" minOccurs="0"/>
 *         &lt;element name="ELENCO_RICEVUTE_TELEMATICHE" type="{http://csi.it}LMSDettRicTelPraticaRicevutaType" minOccurs="0"/>
 *         &lt;element name="ELENCO_ESITI_PAGAMENTO" type="{http://csi.it}LMSDettEsitiPagPraticaRicevutaType" minOccurs="0"/>
 *         &lt;element name="ATTESTATO_RICHIESTA_RIMBORSO" type="{http://csi.it}LMSAttRicRimbPraticaRicevutaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LMSPraticaRicevutaType", propOrder = {
    "codicefiscale",
    "numeropratica",
    "idasrcup",
    "elencoricevutestampaasr",
    "elencoricevutecortesia",
    "elencoricevutestamparegionale",
    "elencoricevutetelematiche",
    "elencoesitipagamento",
    "attestatorichiestarimborso"
})
public class LMSPraticaRicevutaType {

    @XmlElement(name = "CODICE_FISCALE", required = true)
    protected String codicefiscale;
    @XmlElement(name = "NUMERO_PRATICA", required = true)
    protected String numeropratica;
    @XmlElement(name = "ID_ASR_CUP", required = true)
    protected String idasrcup;
    @XmlElement(name = "ELENCO_RICEVUTE_STAMPA_ASR")
    protected LMSDettPraticaRicevutaType elencoricevutestampaasr;
    @XmlElement(name = "ELENCO_RICEVUTE_CORTESIA")
    protected LMSDettPraticaRicevutaType elencoricevutecortesia;
    @XmlElement(name = "ELENCO_RICEVUTE_STAMPA_REGIONALE")
    protected LMSDettPraticaRicevutaType elencoricevutestamparegionale;
    @XmlElement(name = "ELENCO_RICEVUTE_TELEMATICHE")
    protected LMSDettRicTelPraticaRicevutaType elencoricevutetelematiche;
    @XmlElement(name = "ELENCO_ESITI_PAGAMENTO")
    protected LMSDettEsitiPagPraticaRicevutaType elencoesitipagamento;
    @XmlElement(name = "ATTESTATO_RICHIESTA_RIMBORSO")
    protected LMSAttRicRimbPraticaRicevutaType attestatorichiestarimborso;

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
     * Recupera il valore della proprieta elencoricevutestampaasr.
     * 
     * @return
     *     possible object is
     *     {@link LMSDettPraticaRicevutaType }
     *     
     */
    public LMSDettPraticaRicevutaType getELENCORICEVUTESTAMPAASR() {
        return elencoricevutestampaasr;
    }

    /**
     * Imposta il valore della proprieta elencoricevutestampaasr.
     * 
     * @param value
     *     allowed object is
     *     {@link LMSDettPraticaRicevutaType }
     *     
     */
    public void setELENCORICEVUTESTAMPAASR(LMSDettPraticaRicevutaType value) {
        this.elencoricevutestampaasr = value;
    }

    /**
     * Recupera il valore della proprieta elencoricevutecortesia.
     * 
     * @return
     *     possible object is
     *     {@link LMSDettPraticaRicevutaType }
     *     
     */
    public LMSDettPraticaRicevutaType getELENCORICEVUTECORTESIA() {
        return elencoricevutecortesia;
    }

    /**
     * Imposta il valore della proprieta elencoricevutecortesia.
     * 
     * @param value
     *     allowed object is
     *     {@link LMSDettPraticaRicevutaType }
     *     
     */
    public void setELENCORICEVUTECORTESIA(LMSDettPraticaRicevutaType value) {
        this.elencoricevutecortesia = value;
    }

    /**
     * Recupera il valore della proprieta elencoricevutestamparegionale.
     * 
     * @return
     *     possible object is
     *     {@link LMSDettPraticaRicevutaType }
     *     
     */
    public LMSDettPraticaRicevutaType getELENCORICEVUTESTAMPAREGIONALE() {
        return elencoricevutestamparegionale;
    }

    /**
     * Imposta il valore della proprieta elencoricevutestamparegionale.
     * 
     * @param value
     *     allowed object is
     *     {@link LMSDettPraticaRicevutaType }
     *     
     */
    public void setELENCORICEVUTESTAMPAREGIONALE(LMSDettPraticaRicevutaType value) {
        this.elencoricevutestamparegionale = value;
    }

    /**
     * Recupera il valore della proprieta elencoricevutetelematiche.
     * 
     * @return
     *     possible object is
     *     {@link LMSDettRicTelPraticaRicevutaType }
     *     
     */
    public LMSDettRicTelPraticaRicevutaType getELENCORICEVUTETELEMATICHE() {
        return elencoricevutetelematiche;
    }

    /**
     * Imposta il valore della proprieta elencoricevutetelematiche.
     * 
     * @param value
     *     allowed object is
     *     {@link LMSDettRicTelPraticaRicevutaType }
     *     
     */
    public void setELENCORICEVUTETELEMATICHE(LMSDettRicTelPraticaRicevutaType value) {
        this.elencoricevutetelematiche = value;
    }

    /**
     * Recupera il valore della proprieta elencoesitipagamento.
     * 
     * @return
     *     possible object is
     *     {@link LMSDettEsitiPagPraticaRicevutaType }
     *     
     */
    public LMSDettEsitiPagPraticaRicevutaType getELENCOESITIPAGAMENTO() {
        return elencoesitipagamento;
    }

    /**
     * Imposta il valore della proprieta elencoesitipagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link LMSDettEsitiPagPraticaRicevutaType }
     *     
     */
    public void setELENCOESITIPAGAMENTO(LMSDettEsitiPagPraticaRicevutaType value) {
        this.elencoesitipagamento = value;
    }

    /**
     * Recupera il valore della proprieta attestatorichiestarimborso.
     * 
     * @return
     *     possible object is
     *     {@link LMSAttRicRimbPraticaRicevutaType }
     *     
     */
    public LMSAttRicRimbPraticaRicevutaType getATTESTATORICHIESTARIMBORSO() {
        return attestatorichiestarimborso;
    }

    /**
     * Imposta il valore della proprieta attestatorichiestarimborso.
     * 
     * @param value
     *     allowed object is
     *     {@link LMSAttRicRimbPraticaRicevutaType }
     *     
     */
    public void setATTESTATORICHIESTARIMBORSO(LMSAttRicRimbPraticaRicevutaType value) {
        this.attestatorichiestarimborso = value;
    }

}
