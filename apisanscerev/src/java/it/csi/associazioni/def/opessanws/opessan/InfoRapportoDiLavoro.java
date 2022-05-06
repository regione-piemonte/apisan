/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.associazioni.def.opessanws.opessan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per InfoRapportoDiLavoro complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InfoRapportoDiLavoro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="azienda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataInizioRappLavoro" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="qualifica" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="associazioniAggregazioni" type="{http://opessan.opessanws.def.csi.it/}Associazioni" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoRapportoDiLavoro", propOrder = {
    "azienda",
    "dataInizioRappLavoro",
    "qualifica",
    "associazioniAggregazioni"
})
public class InfoRapportoDiLavoro {

    @XmlElement(required = true)
    protected String azienda;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInizioRappLavoro;
    @XmlElement(required = true)
    protected String qualifica;
    protected Associazioni associazioniAggregazioni;

    /**
     * Recupera il valore della proprieta azienda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAzienda() {
        return azienda;
    }

    /**
     * Imposta il valore della proprieta azienda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAzienda(String value) {
        this.azienda = value;
    }

    /**
     * Recupera il valore della proprieta dataInizioRappLavoro.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInizioRappLavoro() {
        return dataInizioRappLavoro;
    }

    /**
     * Imposta il valore della proprieta dataInizioRappLavoro.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInizioRappLavoro(XMLGregorianCalendar value) {
        this.dataInizioRappLavoro = value;
    }

    /**
     * Recupera il valore della proprieta qualifica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifica() {
        return qualifica;
    }

    /**
     * Imposta il valore della proprieta qualifica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifica(String value) {
        this.qualifica = value;
    }

    /**
     * Recupera il valore della proprieta associazioniAggregazioni.
     * 
     * @return
     *     possible object is
     *     {@link Associazioni }
     *     
     */
    public Associazioni getAssociazioniAggregazioni() {
        return associazioniAggregazioni;
    }

    /**
     * Imposta il valore della proprieta associazioniAggregazioni.
     * 
     * @param value
     *     allowed object is
     *     {@link Associazioni }
     *     
     */
    public void setAssociazioniAggregazioni(Associazioni value) {
        this.associazioniAggregazioni = value;
    }

}
