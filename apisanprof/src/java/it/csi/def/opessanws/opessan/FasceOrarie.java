/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.def.opessanws.opessan;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per FasceOrarie complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FasceOrarie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orario" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="orarioInizio" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *                   &lt;element name="orarioFine" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *                   &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FasceOrarie", propOrder = {
    "orario"
})
public class FasceOrarie {

    @XmlElement(nillable = true)
    protected List<FasceOrarie.Orario> orario;

    /**
     * Gets the value of the orario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FasceOrarie.Orario }
     * 
     * 
     */
    public List<FasceOrarie.Orario> getOrario() {
        if (orario == null) {
            orario = new ArrayList<FasceOrarie.Orario>();
        }
        return this.orario;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="orarioInizio" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
     *         &lt;element name="orarioFine" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
     *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orarioInizio",
        "orarioFine",
        "note"
    })
    public static class Orario {

        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar orarioInizio;
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar orarioFine;
        protected String note;

        /**
         * Recupera il valore della proprietà orarioInizio.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getOrarioInizio() {
            return orarioInizio;
        }

        /**
         * Imposta il valore della proprietà orarioInizio.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setOrarioInizio(XMLGregorianCalendar value) {
            this.orarioInizio = value;
        }

        /**
         * Recupera il valore della proprietà orarioFine.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getOrarioFine() {
            return orarioFine;
        }

        /**
         * Imposta il valore della proprietà orarioFine.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setOrarioFine(XMLGregorianCalendar value) {
            this.orarioFine = value;
        }

        /**
         * Recupera il valore della proprietà note.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNote() {
            return note;
        }

        /**
         * Imposta il valore della proprietà note.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNote(String value) {
            this.note = value;
        }

    }

}
