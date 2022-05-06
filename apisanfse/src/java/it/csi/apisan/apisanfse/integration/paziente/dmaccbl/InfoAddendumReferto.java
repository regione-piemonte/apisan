/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.paziente.dmaccbl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per infoAddendumReferto complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="infoAddendumReferto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dma.csi.it/}codiceDipartimentaleDocumento" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}id" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoAddendumReferto", propOrder = {
    "codiceDipartimentaleDocumento",
    "id"
})
public class InfoAddendumReferto {

    @XmlElement(namespace = "http://dma.csi.it/")
    protected String codiceDipartimentaleDocumento;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected String id;

    /**
     * Recupera il valore della proprietà codiceDipartimentaleDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceDipartimentaleDocumento() {
        return codiceDipartimentaleDocumento;
    }

    /**
     * Imposta il valore della proprietà codiceDipartimentaleDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceDipartimentaleDocumento(String value) {
        this.codiceDipartimentaleDocumento = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
