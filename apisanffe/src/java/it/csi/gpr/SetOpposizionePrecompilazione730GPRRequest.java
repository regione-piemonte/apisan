/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SetOpposizionePrecompilazione730GPRRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SetOpposizionePrecompilazione730GPRRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UUID" type="{http://csi.it}UuidType730"/>
 *         &lt;element name="NUMERO_PRATICA" type="{http://csi.it}NumeroPraticaType730" minOccurs="0"/>
 *         &lt;element name="NUMERO_SPORTELLO" type="{http://csi.it}NumeroSportelloType" minOccurs="0"/>
 *         &lt;element name="OPPOSIZIONE_730" type="{http://csi.it}Opposizione730Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetOpposizionePrecompilazione730GPRRequest", propOrder = {
    "uuid",
    "numeropratica",
    "numerosportello",
    "opposizione730"
})
public class SetOpposizionePrecompilazione730GPRRequest {

    @XmlElement(name = "UUID", required = true)
    protected String uuid;
    @XmlElement(name = "NUMERO_PRATICA")
    protected String numeropratica;
    @XmlElement(name = "NUMERO_SPORTELLO")
    protected String numerosportello;
    @XmlElement(name = "OPPOSIZIONE_730")
    protected BigInteger opposizione730;

    /**
     * Recupera il valore della proprietà uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Imposta il valore della proprietà uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Recupera il valore della proprietà numeropratica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROPRATICA() {
        return numeropratica;
    }

    /**
     * Imposta il valore della proprietà numeropratica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROPRATICA(String value) {
        this.numeropratica = value;
    }

    /**
     * Recupera il valore della proprietà numerosportello.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROSPORTELLO() {
        return numerosportello;
    }

    /**
     * Imposta il valore della proprietà numerosportello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROSPORTELLO(String value) {
        this.numerosportello = value;
    }

    /**
     * Recupera il valore della proprietà opposizione730.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOPPOSIZIONE730() {
        return opposizione730;
    }

    /**
     * Imposta il valore della proprietà opposizione730.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOPPOSIZIONE730(BigInteger value) {
        this.opposizione730 = value;
    }

}
