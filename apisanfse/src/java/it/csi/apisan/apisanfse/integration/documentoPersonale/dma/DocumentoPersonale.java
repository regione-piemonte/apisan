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


/**
 * <p>Classe Java per documentoPersonale complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="documentoPersonale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allegato" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="tipoAllegato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trascrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "documentoPersonale", propOrder = {
    "allegato",
    "tipoAllegato",
    "trascrizione",
    "dataOraAggiornamento"
})
public class DocumentoPersonale {

    protected byte[] allegato;
    protected String tipoAllegato;
    protected String trascrizione;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataOraAggiornamento;

    /**
     * Recupera il valore della proprieta' allegato.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAllegato() {
        return allegato;
    }

    /**
     * Imposta il valore della proprieta' allegato.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAllegato(byte[] value) {
        this.allegato = value;
    }

    /**
     * Recupera il valore della proprieta' tipoAllegato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAllegato() {
        return tipoAllegato;
    }

    /**
     * Imposta il valore della proprieta' tipoAllegato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAllegato(String value) {
        this.tipoAllegato = value;
    }

    /**
     * Recupera il valore della proprieta' trascrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrascrizione() {
        return trascrizione;
    }

    /**
     * Imposta il valore della proprieta' trascrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrascrizione(String value) {
        this.trascrizione = value;
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
