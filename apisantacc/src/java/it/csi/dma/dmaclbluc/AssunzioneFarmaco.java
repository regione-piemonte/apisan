/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per assunzioneFarmaco complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="assunzioneFarmaco">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="farmaco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="quantita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="dataAssunzione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assunzioneFarmaco", propOrder = {
    "farmaco",
    "quantita",
    "dataAssunzione"
})
public class AssunzioneFarmaco {

    protected String farmaco;
    protected String quantita;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAssunzione;

    /**
     * Recupera il valore della proprietà farmaco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFarmaco() {
        return farmaco;
    }

    /**
     * Imposta il valore della proprietà farmaco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFarmaco(String value) {
        this.farmaco = value;
    }

    /**
     * Recupera il valore della proprietà quantita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantita() {
        return quantita;
    }

    /**
     * Imposta il valore della proprietà quantita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantita(String value) {
        this.quantita = value;
    }

    /**
     * Recupera il valore della proprietà dataAssunzione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAssunzione() {
        return dataAssunzione;
    }

    /**
     * Imposta il valore della proprietà dataAssunzione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAssunzione(XMLGregorianCalendar value) {
        this.dataAssunzione = value;
    }

}
