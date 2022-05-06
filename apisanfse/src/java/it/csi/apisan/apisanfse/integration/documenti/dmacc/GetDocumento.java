/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documenti.dmacc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import it.csi.apisan.apisanfse.integration.documenti.dma.MetadatiDocumento;
import it.csi.apisan.apisanfse.integration.documenti.dma.RichiedenteInfo;
import it.csi.apisan.apisanfse.integration.documenti.dma.SiNo;


/**
 * <p>Classe Java per getDocumento complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richiedente" type="{http://dma.csi.it/}richiedenteInfo" minOccurs="0" form="unqualified"/>
 *         &lt;element name="cfPaziente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element ref="{http://dma.csi.it/}metadatiDocumento" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}firmatoDigitalmente" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}criptato" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDocumento", propOrder = {
    "richiedente",
    "cfPaziente",
    "metadatiDocumento",
    "firmatoDigitalmente",
    "criptato"
})
public class GetDocumento {

    protected RichiedenteInfo richiedente;
    protected String cfPaziente;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected MetadatiDocumento metadatiDocumento;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected SiNo firmatoDigitalmente;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected SiNo criptato;

    /**
     * Recupera il valore della proprietà richiedente.
     * 
     * @return
     *     possible object is
     *     {@link RichiedenteInfo }
     *     
     */
    public RichiedenteInfo getRichiedente() {
        return richiedente;
    }

    /**
     * Imposta il valore della proprietà richiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link RichiedenteInfo }
     *     
     */
    public void setRichiedente(RichiedenteInfo value) {
        this.richiedente = value;
    }

    /**
     * Recupera il valore della proprietà cfPaziente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfPaziente() {
        return cfPaziente;
    }

    /**
     * Imposta il valore della proprietà cfPaziente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfPaziente(String value) {
        this.cfPaziente = value;
    }

    /**
     * Recupera il valore della proprietà metadatiDocumento.
     * 
     * @return
     *     possible object is
     *     {@link MetadatiDocumento }
     *     
     */
    public MetadatiDocumento getMetadatiDocumento() {
        return metadatiDocumento;
    }

    /**
     * Imposta il valore della proprietà metadatiDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadatiDocumento }
     *     
     */
    public void setMetadatiDocumento(MetadatiDocumento value) {
        this.metadatiDocumento = value;
    }

    /**
     * Recupera il valore della proprietà firmatoDigitalmente.
     * 
     * @return
     *     possible object is
     *     {@link SiNo }
     *     
     */
    public SiNo getFirmatoDigitalmente() {
        return firmatoDigitalmente;
    }

    /**
     * Imposta il valore della proprietà firmatoDigitalmente.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNo }
     *     
     */
    public void setFirmatoDigitalmente(SiNo value) {
        this.firmatoDigitalmente = value;
    }

    /**
     * Recupera il valore della proprietà criptato.
     * 
     * @return
     *     possible object is
     *     {@link SiNo }
     *     
     */
    public SiNo getCriptato() {
        return criptato;
    }

    /**
     * Imposta il valore della proprietà criptato.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNo }
     *     
     */
    public void setCriptato(SiNo value) {
        this.criptato = value;
    }

}
