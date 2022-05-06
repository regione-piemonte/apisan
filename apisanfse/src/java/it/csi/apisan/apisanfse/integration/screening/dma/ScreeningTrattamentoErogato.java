/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.screening.dma;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per screeningTrattamentoErogato complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="screeningTrattamentoErogato">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="trattamenti" type="{http://dma.csi.it/}screeningTrattamento" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="strutturaSanitaria" type="{http://dma.csi.it/}strutturaSanitaria" minOccurs="0"/>
 *         &lt;element name="esito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "screeningTrattamentoErogato", propOrder = {
    "data",
    "trattamenti",
    "strutturaSanitaria",
    "esito"
})
public class ScreeningTrattamentoErogato {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar data;
    @XmlElement(nillable = true)
    protected List<ScreeningTrattamento> trattamenti;
    protected StrutturaSanitaria strutturaSanitaria;
    protected String esito;

    /**
     * Recupera il valore della proprietà data.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Imposta il valore della proprietà data.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * Gets the value of the trattamenti property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trattamenti property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrattamenti().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScreeningTrattamento }
     * 
     * 
     */
    public List<ScreeningTrattamento> getTrattamenti() {
        if (trattamenti == null) {
            trattamenti = new ArrayList<ScreeningTrattamento>();
        }
        return this.trattamenti;
    }

    /**
     * Recupera il valore della proprietà strutturaSanitaria.
     * 
     * @return
     *     possible object is
     *     {@link StrutturaSanitaria }
     *     
     */
    public StrutturaSanitaria getStrutturaSanitaria() {
        return strutturaSanitaria;
    }

    /**
     * Imposta il valore della proprietà strutturaSanitaria.
     * 
     * @param value
     *     allowed object is
     *     {@link StrutturaSanitaria }
     *     
     */
    public void setStrutturaSanitaria(StrutturaSanitaria value) {
        this.strutturaSanitaria = value;
    }

    /**
     * Recupera il valore della proprietà esito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsito() {
        return esito;
    }

    /**
     * Imposta il valore della proprietà esito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsito(String value) {
        this.esito = value;
    }

}
