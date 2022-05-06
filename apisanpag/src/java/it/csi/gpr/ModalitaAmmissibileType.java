/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ModalitaAmmissibileType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ModalitaAmmissibileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ASR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODICE_SERVIZIO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODICE_VERSAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MOTIVO_PAGAMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MODALITA_EROGAZIONE" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="IMPORTO_MIN_BONIFICO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModalitaAmmissibileType", propOrder = {
    "idasr",
    "codiceservizio",
    "codiceversamento",
    "motivopagamento",
    "modalitaerogazione",
    "importominbonifico"
})
public class ModalitaAmmissibileType {

    @XmlElement(name = "ID_ASR", required = true)
    protected String idasr;
    @XmlElement(name = "CODICE_SERVIZIO", required = true)
    protected String codiceservizio;
    @XmlElement(name = "CODICE_VERSAMENTO", required = true)
    protected String codiceversamento;
    @XmlElement(name = "MOTIVO_PAGAMENTO", required = true)
    protected String motivopagamento;
    @XmlElement(name = "MODALITA_EROGAZIONE", required = true)
    protected BigInteger modalitaerogazione;
    @XmlElementRef(name = "IMPORTO_MIN_BONIFICO", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> importominbonifico;

    /**
     * Recupera il valore della proprieta idasr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDASR() {
        return idasr;
    }

    /**
     * Imposta il valore della proprieta idasr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDASR(String value) {
        this.idasr = value;
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
     * Recupera il valore della proprieta modalitaerogazione.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMODALITAEROGAZIONE() {
        return modalitaerogazione;
    }

    /**
     * Imposta il valore della proprieta modalitaerogazione.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMODALITAEROGAZIONE(BigInteger value) {
        this.modalitaerogazione = value;
    }

    /**
     * Recupera il valore della proprieta importominbonifico.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIMPORTOMINBONIFICO() {
        return importominbonifico;
    }

    /**
     * Imposta il valore della proprieta importominbonifico.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIMPORTOMINBONIFICO(JAXBElement<String> value) {
        this.importominbonifico = value;
    }

}
