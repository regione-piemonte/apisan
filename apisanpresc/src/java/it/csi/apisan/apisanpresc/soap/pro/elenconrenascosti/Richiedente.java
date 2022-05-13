/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.pro.elenconrenascosti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per richiedente complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="richiedente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="servizioApplicativoChiamante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codiceFiscaleRichiedente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identificativoIpRichiedente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "richiedente", propOrder = {
    "servizioApplicativoChiamante",
    "uuid",
    "codiceFiscaleRichiedente",
    "identificativoIpRichiedente"
})
public class Richiedente {

    @XmlElement(required = true)
    protected String servizioApplicativoChiamante;
    @XmlElement(required = true)
    protected String uuid;
    @XmlElement(required = true)
    protected String codiceFiscaleRichiedente;
    protected String identificativoIpRichiedente;

    /**
     * Recupera il valore della property servizioApplicativoChiamante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServizioApplicativoChiamante() {
        return servizioApplicativoChiamante;
    }

    /**
     * Imposta il valore della property servizioApplicativoChiamante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServizioApplicativoChiamante(String value) {
        this.servizioApplicativoChiamante = value;
    }

    /**
     * Recupera il valore della property uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Imposta il valore della property uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Recupera il valore della property codiceFiscaleRichiedente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscaleRichiedente() {
        return codiceFiscaleRichiedente;
    }

    /**
     * Imposta il valore della property codiceFiscaleRichiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscaleRichiedente(String value) {
        this.codiceFiscaleRichiedente = value;
    }

    /**
     * Recupera il valore della property identificativoIpRichiedente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificativoIpRichiedente() {
        return identificativoIpRichiedente;
    }

    /**
     * Imposta il valore della property identificativoIpRichiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificativoIpRichiedente(String value) {
        this.identificativoIpRichiedente = value;
    }

}
