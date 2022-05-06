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
 * <p>Classe Java per GetListaRimborsiGPRRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GetListaRimborsiGPRRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODICE_FISCALE" type="{http://csi.it}CodiceFiscaleType" minOccurs="0"/>
 *         &lt;element name="ID_ASR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATO_TICKET" type="{http://csi.it}StatoTicketType" minOccurs="0"/>
 *         &lt;element name="IN_EROGAZIONE" type="{http://csi.it}InErogazioneType" minOccurs="0"/>
 *         &lt;element name="MOTIVO_PAGAMENTO" type="{http://csi.it}MotivoPagamentoType" minOccurs="0"/>
 *         &lt;element name="CODICE_VERSAMENTO" type="{http://csi.it}CodiceVersamentoType" minOccurs="0"/>
 *         &lt;element name="CODICE_SERVIZIO" type="{http://csi.it}CodiceServizioType" minOccurs="0"/>
 *         &lt;element name="MODALITA_RIMBORSO" type="{http://csi.it}ModalitaRimborsoType" minOccurs="0"/>
 *         &lt;element name="DATA_DAL" type="{http://csi.it}DataType" minOccurs="0"/>
 *         &lt;element name="DATA_AL" type="{http://csi.it}DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetListaRimborsiGPRRequest", propOrder = {
    "uuid",
    "codicefiscale",
    "idasr",
    "statoticket",
    "inerogazione",
    "motivopagamento",
    "codiceversamento",
    "codiceservizio",
    "modalitarimborso",
    "datadal",
    "dataal"
})
public class GetListaRimborsiGPRRequest {

    @XmlElement(name = "UUID", required = true)
    protected String uuid;
    @XmlElement(name = "CODICE_FISCALE")
    protected String codicefiscale;
    @XmlElementRef(name = "ID_ASR", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idasr;
    @XmlElementRef(name = "STATO_TICKET", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> statoticket;
    @XmlElementRef(name = "IN_EROGAZIONE", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inerogazione;
    @XmlElementRef(name = "MOTIVO_PAGAMENTO", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> motivopagamento;
    @XmlElementRef(name = "CODICE_VERSAMENTO", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codiceversamento;
    @XmlElementRef(name = "CODICE_SERVIZIO", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codiceservizio;
    @XmlElementRef(name = "MODALITA_RIMBORSO", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> modalitarimborso;
    @XmlElementRef(name = "DATA_DAL", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datadal;
    @XmlElementRef(name = "DATA_AL", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataal;

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
     * Recupera il valore della proprieta idasr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIDASR() {
        return idasr;
    }

    /**
     * Imposta il valore della proprieta idasr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIDASR(JAXBElement<String> value) {
        this.idasr = value;
    }

    /**
     * Recupera il valore della proprieta statoticket.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getSTATOTICKET() {
        return statoticket;
    }

    /**
     * Imposta il valore della proprieta statoticket.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setSTATOTICKET(JAXBElement<BigInteger> value) {
        this.statoticket = value;
    }

    /**
     * Recupera il valore della proprieta inerogazione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getINEROGAZIONE() {
        return inerogazione;
    }

    /**
     * Imposta il valore della proprieta inerogazione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setINEROGAZIONE(JAXBElement<String> value) {
        this.inerogazione = value;
    }

    /**
     * Recupera il valore della proprieta motivopagamento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMOTIVOPAGAMENTO() {
        return motivopagamento;
    }

    /**
     * Imposta il valore della proprieta motivopagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMOTIVOPAGAMENTO(JAXBElement<String> value) {
        this.motivopagamento = value;
    }

    /**
     * Recupera il valore della proprieta codiceversamento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCODICEVERSAMENTO() {
        return codiceversamento;
    }

    /**
     * Imposta il valore della proprieta codiceversamento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCODICEVERSAMENTO(JAXBElement<String> value) {
        this.codiceversamento = value;
    }

    /**
     * Recupera il valore della proprieta codiceservizio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCODICESERVIZIO() {
        return codiceservizio;
    }

    /**
     * Imposta il valore della proprieta codiceservizio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCODICESERVIZIO(JAXBElement<String> value) {
        this.codiceservizio = value;
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
     * Recupera il valore della proprieta datadal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDATADAL() {
        return datadal;
    }

    /**
     * Imposta il valore della proprieta datadal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDATADAL(JAXBElement<String> value) {
        this.datadal = value;
    }

    /**
     * Recupera il valore della proprieta dataal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDATAAL() {
        return dataal;
    }

    /**
     * Imposta il valore della proprieta dataal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDATAAL(JAXBElement<String> value) {
        this.dataal = value;
    }

}
