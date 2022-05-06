/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.consensoini.dma;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per statoConsensiOUT complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="statoConsensiOUT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consensoAlimentazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consensoConsultazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consensoPregresso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificativoAssistitoConsenso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificativoInformativaConsensi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificativoInformativaCorrente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opzioniResponse" type="{http://dma.csi.it/}opzioniType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statoConsensiOUT", propOrder = {
    "consensoAlimentazione",
    "consensoConsultazione",
    "consensoPregresso",
    "identificativoAssistitoConsenso",
    "identificativoInformativaConsensi",
    "identificativoInformativaCorrente",
    "opzioniResponse"
})
public class StatoConsensiOUT {

    protected String consensoAlimentazione;
    protected String consensoConsultazione;
    protected String consensoPregresso;
    protected String identificativoAssistitoConsenso;
    protected String identificativoInformativaConsensi;
    protected String identificativoInformativaCorrente;
    @XmlElement(nillable = true)
    protected List<OpzioniType> opzioniResponse;

    /**
     * Recupera il valore della proprieta consensoAlimentazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsensoAlimentazione() {
        return consensoAlimentazione;
    }

    /**
     * Imposta il valore della proprieta consensoAlimentazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsensoAlimentazione(String value) {
        this.consensoAlimentazione = value;
    }

    /**
     * Recupera il valore della proprieta consensoConsultazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsensoConsultazione() {
        return consensoConsultazione;
    }

    /**
     * Imposta il valore della proprieta consensoConsultazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsensoConsultazione(String value) {
        this.consensoConsultazione = value;
    }

    /**
     * Recupera il valore della proprieta consensoPregresso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsensoPregresso() {
        return consensoPregresso;
    }

    /**
     * Imposta il valore della proprieta consensoPregresso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsensoPregresso(String value) {
        this.consensoPregresso = value;
    }

    /**
     * Recupera il valore della proprieta identificativoAssistitoConsenso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificativoAssistitoConsenso() {
        return identificativoAssistitoConsenso;
    }

    /**
     * Imposta il valore della proprieta identificativoAssistitoConsenso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificativoAssistitoConsenso(String value) {
        this.identificativoAssistitoConsenso = value;
    }

    /**
     * Recupera il valore della proprieta identificativoInformativaConsensi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificativoInformativaConsensi() {
        return identificativoInformativaConsensi;
    }

    /**
     * Imposta il valore della proprieta identificativoInformativaConsensi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificativoInformativaConsensi(String value) {
        this.identificativoInformativaConsensi = value;
    }

    /**
     * Recupera il valore della proprieta identificativoInformativaCorrente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificativoInformativaCorrente() {
        return identificativoInformativaCorrente;
    }

    /**
     * Imposta il valore della proprieta identificativoInformativaCorrente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificativoInformativaCorrente(String value) {
        this.identificativoInformativaCorrente = value;
    }

    /**
     * Gets the value of the opzioniResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opzioniResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpzioniResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpzioniType }
     * 
     * 
     */
    public List<OpzioniType> getOpzioniResponse() {
        if (opzioniResponse == null) {
            opzioniResponse = new ArrayList<OpzioniType>();
        }
        return this.opzioniResponse;
    }

}
