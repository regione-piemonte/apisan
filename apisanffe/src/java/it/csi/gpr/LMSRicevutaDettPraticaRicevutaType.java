/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per LMSRicevutaDettPraticaRicevutaType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LMSRicevutaDettPraticaRicevutaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_RICEVUTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATA_PAGAMENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STAMPA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LMSRicevutaDettPraticaRicevutaType", propOrder = {
    "idricevuta",
    "datapagamento",
    "stampa"
})
public class LMSRicevutaDettPraticaRicevutaType {

    @XmlElement(name = "ID_RICEVUTA")
    protected String idricevuta;
    @XmlElement(name = "DATA_PAGAMENTO")
    protected String datapagamento;
    @XmlElement(name = "STAMPA")
    protected String stampa;

    /**
     * Recupera il valore della proprietà idricevuta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDRICEVUTA() {
        return idricevuta;
    }

    /**
     * Imposta il valore della proprietà idricevuta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDRICEVUTA(String value) {
        this.idricevuta = value;
    }

    /**
     * Recupera il valore della proprietà datapagamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAPAGAMENTO() {
        return datapagamento;
    }

    /**
     * Imposta il valore della proprietà datapagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAPAGAMENTO(String value) {
        this.datapagamento = value;
    }

    /**
     * Recupera il valore della proprietà stampa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAMPA() {
        return stampa;
    }

    /**
     * Imposta il valore della proprietà stampa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAMPA(String value) {
        this.stampa = value;
    }

}
