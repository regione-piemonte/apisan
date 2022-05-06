/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.operatori.def.opessanws.opessan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AssociazioneBody complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AssociazioneBody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="azienda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codiceAssociazione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="indAdesioniAttive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociazioneBody", propOrder = {
    "azienda",
    "codiceAssociazione",
    "indAdesioniAttive",
    "tipo"
})
public class AssociazioneBody {

    @XmlElement(required = true)
    protected String azienda;
    @XmlElement(required = true)
    protected String codiceAssociazione;
    protected String indAdesioniAttive;
    @XmlElement(required = true)
    protected String tipo;

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
     * Recupera il valore della proprieta codiceAssociazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceAssociazione() {
        return codiceAssociazione;
    }

    /**
     * Imposta il valore della proprieta codiceAssociazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceAssociazione(String value) {
        this.codiceAssociazione = value;
    }

    /**
     * Recupera il valore della proprieta indAdesioniAttive.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndAdesioniAttive() {
        return indAdesioniAttive;
    }

    /**
     * Imposta il valore della proprieta indAdesioniAttive.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndAdesioniAttive(String value) {
        this.indAdesioniAttive = value;
    }

    /**
     * Recupera il valore della proprieta tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Imposta il valore della proprieta tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

}
