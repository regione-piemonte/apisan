/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documenti.dma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per linkImmagine complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="linkImmagine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="series" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="study" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "linkImmagine", propOrder = {
    "accessionNumber",
    "objectNumber",
    "series",
    "study"
})
public class LinkImmagine {

    protected String accessionNumber;
    protected String objectNumber;
    protected String series;
    protected String study;

    /**
     * Recupera il valore della proprietà accessionNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessionNumber() {
        return accessionNumber;
    }

    /**
     * Imposta il valore della proprietà accessionNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessionNumber(String value) {
        this.accessionNumber = value;
    }

    /**
     * Recupera il valore della proprietà objectNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectNumber() {
        return objectNumber;
    }

    /**
     * Imposta il valore della proprietà objectNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectNumber(String value) {
        this.objectNumber = value;
    }

    /**
     * Recupera il valore della proprietà series.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeries() {
        return series;
    }

    /**
     * Imposta il valore della proprietà series.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeries(String value) {
        this.series = value;
    }

    /**
     * Recupera il valore della proprietà study.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudy() {
        return study;
    }

    /**
     * Imposta il valore della proprietà study.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudy(String value) {
        this.study = value;
    }

}
