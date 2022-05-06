/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.paziente.dmaccbl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import it.csi.apisan.apisanfse.integration.paziente.dma.Paziente;
import it.csi.apisan.apisanfse.integration.paziente.dma.Richiedente;


/**
 * <p>Classe Java per getAccessi complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getAccessi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dma.csi.it/}paziente" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}richiedente" minOccurs="0"/>
 *         &lt;element name="dataInizioRicerca" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="dataFineRicerca" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAccessi", propOrder = {
    "paziente",
    "richiedente",
    "dataInizioRicerca",
    "dataFineRicerca"
})
public class GetAccessi {

    @XmlElement(namespace = "http://dma.csi.it/")
    protected Paziente paziente;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected Richiedente richiedente;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataInizioRicerca;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataFineRicerca;

    /**
     * Recupera il valore della proprietà paziente.
     * 
     * @return
     *     possible object is
     *     {@link Paziente }
     *     
     */
    public Paziente getPaziente() {
        return paziente;
    }

    /**
     * Imposta il valore della proprietà paziente.
     * 
     * @param value
     *     allowed object is
     *     {@link Paziente }
     *     
     */
    public void setPaziente(Paziente value) {
        this.paziente = value;
    }

    /**
     * Recupera il valore della proprietà richiedente.
     * 
     * @return
     *     possible object is
     *     {@link Richiedente }
     *     
     */
    public Richiedente getRichiedente() {
        return richiedente;
    }

    /**
     * Imposta il valore della proprietà richiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link Richiedente }
     *     
     */
    public void setRichiedente(Richiedente value) {
        this.richiedente = value;
    }

    /**
     * Recupera il valore della proprietà dataInizioRicerca.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInizioRicerca() {
        return dataInizioRicerca;
    }

    /**
     * Imposta il valore della proprietà dataInizioRicerca.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInizioRicerca(XMLGregorianCalendar value) {
        this.dataInizioRicerca = value;
    }

    /**
     * Recupera il valore della proprietà dataFineRicerca.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFineRicerca() {
        return dataFineRicerca;
    }

    /**
     * Imposta il valore della proprietà dataFineRicerca.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFineRicerca(XMLGregorianCalendar value) {
        this.dataFineRicerca = value;
    }

}
