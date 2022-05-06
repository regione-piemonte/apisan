/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestoperatore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per applicazioneType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="applicazioneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiceApplicazione" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descrizioneApplicazione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="abilitato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicazioneType", propOrder = {
    "codiceApplicazione",
    "descrizioneApplicazione",
    "link",
    "tipoLink",
    "abilitato"
})
public class ApplicazioneType {

    protected int codiceApplicazione;
    @XmlElement(required = true)
    protected String descrizioneApplicazione;
    @XmlElement(required = true)
    protected String link;
    @XmlElement(required = true)
    protected String tipoLink;
    @XmlElement(required = true)
    protected String abilitato;

    /**
     * Recupera il valore della proprietà codiceApplicazione.
     * 
     */
    public int getCodiceApplicazione() {
        return codiceApplicazione;
    }

    /**
     * Imposta il valore della proprietà codiceApplicazione.
     * 
     */
    public void setCodiceApplicazione(int value) {
        this.codiceApplicazione = value;
    }

    /**
     * Recupera il valore della proprietà descrizioneApplicazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneApplicazione() {
        return descrizioneApplicazione;
    }

    /**
     * Imposta il valore della proprietà descrizioneApplicazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneApplicazione(String value) {
        this.descrizioneApplicazione = value;
    }

    /**
     * Recupera il valore della proprietà link.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLink() {
        return link;
    }

    /**
     * Imposta il valore della proprietà link.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLink(String value) {
        this.link = value;
    }

    /**
     * Recupera il valore della proprietà tipoLink.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoLink() {
        return tipoLink;
    }

    /**
     * Imposta il valore della proprietà tipoLink.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoLink(String value) {
        this.tipoLink = value;
    }

    /**
     * Recupera il valore della proprietà abilitato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbilitato() {
        return abilitato;
    }

    /**
     * Imposta il valore della proprietà abilitato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbilitato(String value) {
        this.abilitato = value;
    }

}
