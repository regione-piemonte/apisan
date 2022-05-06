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
 * <p>Classe Java per RichiestaSetCodiceVersamento complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RichiestaSetCodiceVersamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UUID" type="{http://csi.it}String36Type"/>
 *         &lt;element name="TIPO_OPERAZIONE" type="{http://csi.it}TipoOperazioneSetCodiceVersamentoType"/>
 *         &lt;element name="NUMERO_SPORTELLO" type="{http://csi.it}NumeroSportello64AlfanumericoType"/>
 *         &lt;element name="COD_VERSAMENTO" type="{http://csi.it}CodiceVersamentoType"/>
 *         &lt;element name="DESC_VERSAMENTO" type="{http://csi.it}DescVersamentoSetCodiceVersamentoType" minOccurs="0"/>
 *         &lt;element name="ID_ASR" type="{http://csi.it}AsrType"/>
 *         &lt;element name="APPLICATION_ID" type="{http://csi.it}ApplicationIdSetCodiceVersamentoType" minOccurs="0"/>
 *         &lt;element name="COD_TASSONOMIA" type="{http://csi.it}CodTassonomiaSetCodiceVersamentoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RichiestaSetCodiceVersamento", propOrder = {
    "uuid",
    "tipooperazione",
    "numerosportello",
    "codversamento",
    "descversamento",
    "idasr",
    "applicationid",
    "codtassonomia"
})
public class RichiestaSetCodiceVersamento {

    @XmlElement(name = "UUID", required = true)
    protected String uuid;
    @XmlElement(name = "TIPO_OPERAZIONE", required = true)
    protected TipoOperazioneSetCodiceVersamentoType tipooperazione;
    @XmlElement(name = "NUMERO_SPORTELLO", required = true)
    protected String numerosportello;
    @XmlElement(name = "COD_VERSAMENTO", required = true)
    protected String codversamento;
    @XmlElement(name = "DESC_VERSAMENTO")
    protected String descversamento;
    @XmlElement(name = "ID_ASR", required = true)
    protected String idasr;
    @XmlElement(name = "APPLICATION_ID")
    protected String applicationid;
    @XmlElement(name = "COD_TASSONOMIA")
    protected String codtassonomia;

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
     * Recupera il valore della proprietà tipooperazione.
     * 
     * @return
     *     possible object is
     *     {@link TipoOperazioneSetCodiceVersamentoType }
     *     
     */
    public TipoOperazioneSetCodiceVersamentoType getTIPOOPERAZIONE() {
        return tipooperazione;
    }

    /**
     * Imposta il valore della proprietà tipooperazione.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoOperazioneSetCodiceVersamentoType }
     *     
     */
    public void setTIPOOPERAZIONE(TipoOperazioneSetCodiceVersamentoType value) {
        this.tipooperazione = value;
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
     * Recupera il valore della proprietà codversamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODVERSAMENTO() {
        return codversamento;
    }

    /**
     * Imposta il valore della proprietà codversamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODVERSAMENTO(String value) {
        this.codversamento = value;
    }

    /**
     * Recupera il valore della proprietà descversamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCVERSAMENTO() {
        return descversamento;
    }

    /**
     * Imposta il valore della proprietà descversamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCVERSAMENTO(String value) {
        this.descversamento = value;
    }

    /**
     * Recupera il valore della proprietà idasr.
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
     * Imposta il valore della proprietà idasr.
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
     * Recupera il valore della proprietà applicationid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPLICATIONID() {
        return applicationid;
    }

    /**
     * Imposta il valore della proprietà applicationid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPLICATIONID(String value) {
        this.applicationid = value;
    }

    /**
     * Recupera il valore della proprietà codtassonomia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODTASSONOMIA() {
        return codtassonomia;
    }

    /**
     * Imposta il valore della proprietà codtassonomia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODTASSONOMIA(String value) {
        this.codtassonomia = value;
    }

}
