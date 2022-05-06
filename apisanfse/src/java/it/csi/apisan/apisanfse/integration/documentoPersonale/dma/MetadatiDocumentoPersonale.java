/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documentoPersonale.dma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import it.csi.apisan.apisanfse.integration.documentoPersonale.dmacc.TipoContributo;
import it.csi.apisan.apisanfse.integration.documentoPersonale.dmacc.TipoDocumento;


/**
 * <p>Classe Java per metadatiDocumentoPersonale complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="metadatiDocumentoPersonale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoDocumento" type="{http://dmacc.csi.it/}tipoDocumento" minOccurs="0"/>
 *         &lt;element name="dataEmissione" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="struttura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoContributo" type="{http://dmacc.csi.it/}tipoContributo" minOccurs="0"/>
 *         &lt;element name="dataOraAggiornamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metadatiDocumentoPersonale", propOrder = {
    "tipoDocumento",
    "dataEmissione",
    "struttura",
    "unita",
    "medico",
    "tipoContributo",
    "dataOraAggiornamento"
})
public class MetadatiDocumentoPersonale {

    protected TipoDocumento tipoDocumento;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataEmissione;
    protected String struttura;
    protected String unita;
    protected String medico;
    protected TipoContributo tipoContributo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataOraAggiornamento;

    /**
     * Recupera il valore della proprieta' tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumento }
     *     
     */
    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Imposta il valore della proprieta' tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumento }
     *     
     */
    public void setTipoDocumento(TipoDocumento value) {
        this.tipoDocumento = value;
    }

    /**
     * Recupera il valore della proprieta' dataEmissione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissione() {
        return dataEmissione;
    }

    /**
     * Imposta il valore della proprieta' dataEmissione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissione(XMLGregorianCalendar value) {
        this.dataEmissione = value;
    }

    /**
     * Recupera il valore della proprieta' struttura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStruttura() {
        return struttura;
    }

    /**
     * Imposta il valore della proprieta' struttura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStruttura(String value) {
        this.struttura = value;
    }

    /**
     * Recupera il valore della proprieta' unita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnita() {
        return unita;
    }

    /**
     * Imposta il valore della proprieta' unita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnita(String value) {
        this.unita = value;
    }

    /**
     * Recupera il valore della proprieta' medico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedico() {
        return medico;
    }

    /**
     * Imposta il valore della proprieta' medico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedico(String value) {
        this.medico = value;
    }

    /**
     * Recupera il valore della proprieta' tipoContributo.
     * 
     * @return
     *     possible object is
     *     {@link TipoContributo }
     *     
     */
    public TipoContributo getTipoContributo() {
        return tipoContributo;
    }

    /**
     * Imposta il valore della proprieta' tipoContributo.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoContributo }
     *     
     */
    public void setTipoContributo(TipoContributo value) {
        this.tipoContributo = value;
    }

    /**
     * Recupera il valore della proprieta' dataOraAggiornamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataOraAggiornamento() {
        return dataOraAggiornamento;
    }

    /**
     * Imposta il valore della proprieta' dataOraAggiornamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataOraAggiornamento(XMLGregorianCalendar value) {
        this.dataOraAggiornamento = value;
    }

}
