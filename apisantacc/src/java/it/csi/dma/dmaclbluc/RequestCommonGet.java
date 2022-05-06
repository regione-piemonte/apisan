/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per requestCommonGet complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="requestCommonGet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}requestCommon">
 *       &lt;sequence>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="qualified"/>
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="qualified"/>
 *         &lt;element name="ordinamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="dataDa" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="dataA" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestCommonGet", propOrder = {
    "limit",
    "offset",
    "ordinamento",
    "dataDa",
    "dataA"
})
@XmlSeeAlso({
    GetEventiRequest.class,
    GetContattiStruttureRequest.class,
    GetSintomiRequest.class,
    GetFarmaciRequest.class,
    GetTaccuinoRequest.class,
    GetDieteRequest.class,
    GetDoloriRequest.class,
    GetRilevazioniRequest.class
})
public class RequestCommonGet
    extends RequestCommon
{

    protected Integer limit;
    protected Integer offset;
    protected String ordinamento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDa;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataA;

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
     * Recupera il valore della proprietà offset.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * Imposta il valore della proprietà offset.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffset(Integer value) {
        this.offset = value;
    }

    /**
     * Recupera il valore della proprietà ordinamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdinamento() {
        return ordinamento;
    }

    /**
     * Imposta il valore della proprietà ordinamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdinamento(String value) {
        this.ordinamento = value;
    }

    /**
     * Recupera il valore della proprietà dataDa.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDa() {
        return dataDa;
    }

    /**
     * Imposta il valore della proprietà dataDa.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDa(XMLGregorianCalendar value) {
        this.dataDa = value;
    }

    /**
     * Recupera il valore della proprietà dataA.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataA() {
        return dataA;
    }

    /**
     * Imposta il valore della proprietà dataA.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataA(XMLGregorianCalendar value) {
        this.dataA = value;
    }

}
