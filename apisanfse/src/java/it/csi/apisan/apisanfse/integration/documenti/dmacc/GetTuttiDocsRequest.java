/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documenti.dmacc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import it.csi.apisan.apisanfse.integration.documenti.dma.RichiedenteInfo;


/**
 * <p>Classe Java per getTuttiDocsRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getTuttiDocsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richiedente" type="{http://dma.csi.it/}richiedenteInfo" minOccurs="0" form="unqualified"/>
 *         &lt;element name="cfPaziente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="filtroDocs" type="{http://dmacc.csi.it/}filtroDocs" minOccurs="0" form="unqualified"/>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/>
 *         &lt;element name="offSet" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTuttiDocsRequest", propOrder = {
    "richiedente",
    "cfPaziente",
    "area",
    "filtroDocs",
    "limit",
    "offSet"
})
public class GetTuttiDocsRequest {

    protected RichiedenteInfo richiedente;
    protected String cfPaziente;
    protected String area;
    protected FiltroDocs filtroDocs;
    protected Integer limit;
    protected Integer offSet;

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
     * Recupera il valore della proprietà area.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArea() {
        return area;
    }

    /**
     * Imposta il valore della proprietà area.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * Recupera il valore della proprietà filtroDocs.
     * 
     * @return
     *     possible object is
     *     {@link FiltroDocs }
     *     
     */
    public FiltroDocs getFiltroDocs() {
        return filtroDocs;
    }

    /**
     * Imposta il valore della proprietà filtroDocs.
     * 
     * @param value
     *     allowed object is
     *     {@link FiltroDocs }
     *     
     */
    public void setFiltroDocs(FiltroDocs value) {
        this.filtroDocs = value;
    }

    /**
     * Recupera il valore della proprietà limit.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Imposta il valore della proprietà limit.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLimit(Integer value) {
        this.limit = value;
    }

    /**
     * Recupera il valore della proprietà offSet.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffSet() {
        return offSet;
    }

    /**
     * Imposta il valore della proprietà offSet.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffSet(Integer value) {
        this.offSet = value;
    }

}
