/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.screening.dma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per delega complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="delega">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiceServizio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataFineDelega" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataInizioDelega" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="gradoDelega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statoDelega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDelega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delega", propOrder = {
    "codiceServizio",
    "dataFineDelega",
    "dataInizioDelega",
    "gradoDelega",
    "statoDelega",
    "tipoDelega"
})
public class Delega {

    protected String codiceServizio;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFineDelega;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInizioDelega;
    protected String gradoDelega;
    protected String statoDelega;
    protected String tipoDelega;

    /**
     * Recupera il valore della proprietà codiceServizio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceServizio() {
        return codiceServizio;
    }

    /**
     * Imposta il valore della proprietà codiceServizio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceServizio(String value) {
        this.codiceServizio = value;
    }

    /**
     * Recupera il valore della proprietà dataFineDelega.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFineDelega() {
        return dataFineDelega;
    }

    /**
     * Imposta il valore della proprietà dataFineDelega.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFineDelega(XMLGregorianCalendar value) {
        this.dataFineDelega = value;
    }

    /**
     * Recupera il valore della proprietà dataInizioDelega.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInizioDelega() {
        return dataInizioDelega;
    }

    /**
     * Imposta il valore della proprietà dataInizioDelega.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInizioDelega(XMLGregorianCalendar value) {
        this.dataInizioDelega = value;
    }

    /**
     * Recupera il valore della proprietà gradoDelega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradoDelega() {
        return gradoDelega;
    }

    /**
     * Imposta il valore della proprietà gradoDelega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradoDelega(String value) {
        this.gradoDelega = value;
    }

    /**
     * Recupera il valore della proprietà statoDelega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatoDelega() {
        return statoDelega;
    }

    /**
     * Imposta il valore della proprietà statoDelega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatoDelega(String value) {
        this.statoDelega = value;
    }

    /**
     * Recupera il valore della proprietà tipoDelega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDelega() {
        return tipoDelega;
    }

    /**
     * Imposta il valore della proprietà tipoDelega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDelega(String value) {
        this.tipoDelega = value;
    }

}
