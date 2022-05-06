/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.screenserviziwebsol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CredenzialiType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CredenzialiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="IdOperatore" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="CodiceFiscaleDelegante" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CodiceFiscaleDelegato" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CredenzialiType")
public class CredenzialiType {

    @XmlAttribute(name = "IdOperatore")
    protected Integer idOperatore;
    @XmlAttribute(name = "CodiceFiscaleDelegante")
    protected String codiceFiscaleDelegante;
    @XmlAttribute(name = "CodiceFiscaleDelegato")
    protected String codiceFiscaleDelegato;

    /**
     * Recupera il valore della proprietà idOperatore.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdOperatore() {
        return idOperatore;
    }

    /**
     * Imposta il valore della proprietà idOperatore.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdOperatore(Integer value) {
        this.idOperatore = value;
    }

    /**
     * Recupera il valore della proprietà codiceFiscaleDelegante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscaleDelegante() {
        return codiceFiscaleDelegante;
    }

    /**
     * Imposta il valore della proprietà codiceFiscaleDelegante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscaleDelegante(String value) {
        this.codiceFiscaleDelegante = value;
    }

    /**
     * Recupera il valore della proprietà codiceFiscaleDelegato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscaleDelegato() {
        return codiceFiscaleDelegato;
    }

    /**
     * Imposta il valore della proprietà codiceFiscaleDelegato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscaleDelegato(String value) {
        this.codiceFiscaleDelegato = value;
    }

}
