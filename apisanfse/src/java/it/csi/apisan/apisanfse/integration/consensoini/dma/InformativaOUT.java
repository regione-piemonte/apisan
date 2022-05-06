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
 * <p>Classe Java per informativaOUT complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="informativaOUT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificativoInformativa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="informativa" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="modulistica" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="opzioniResponse" type="{http://dma.csi.it/}opzioniType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tipoMimeInformativa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoMimeModulistica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "informativaOUT", propOrder = {
    "identificativoInformativa",
    "informativa",
    "modulistica",
    "opzioniResponse",
    "tipoMimeInformativa",
    "tipoMimeModulistica"
})
public class InformativaOUT {

    protected String identificativoInformativa;
    protected byte[] informativa;
    protected byte[] modulistica;
    @XmlElement(nillable = true)
    protected List<OpzioniType> opzioniResponse;
    protected String tipoMimeInformativa;
    protected String tipoMimeModulistica;

    /**
     * Recupera il valore della proprieta identificativoInformativa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificativoInformativa() {
        return identificativoInformativa;
    }

    /**
     * Imposta il valore della proprieta identificativoInformativa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificativoInformativa(String value) {
        this.identificativoInformativa = value;
    }

    /**
     * Recupera il valore della proprieta informativa.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getInformativa() {
        return informativa;
    }

    /**
     * Imposta il valore della proprieta informativa.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setInformativa(byte[] value) {
        this.informativa = value;
    }

    /**
     * Recupera il valore della proprieta modulistica.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getModulistica() {
        return modulistica;
    }

    /**
     * Imposta il valore della proprieta modulistica.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setModulistica(byte[] value) {
        this.modulistica = value;
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

    /**
     * Recupera il valore della proprieta tipoMimeInformativa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMimeInformativa() {
        return tipoMimeInformativa;
    }

    /**
     * Imposta il valore della proprieta tipoMimeInformativa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMimeInformativa(String value) {
        this.tipoMimeInformativa = value;
    }

    /**
     * Recupera il valore della proprieta tipoMimeModulistica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMimeModulistica() {
        return tipoMimeModulistica;
    }

    /**
     * Imposta il valore della proprieta tipoMimeModulistica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMimeModulistica(String value) {
        this.tipoMimeModulistica = value;
    }

}
