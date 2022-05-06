/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SetModalitaErogazioneRimborsoGPRRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SetModalitaErogazioneRimborsoGPRRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UUID" type="{http://csi.it}UuidType"/>
 *         &lt;element name="NUMERO_PRATICA" type="{http://csi.it}NumeroPraticaType" minOccurs="0"/>
 *         &lt;element name="MODALITA_RIMBORSO" type="{http://csi.it}ModalitaRimborsoType2" minOccurs="0"/>
 *         &lt;element name="IBAN" type="{http://csi.it}IBANType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetModalitaErogazioneRimborsoGPRRequest", propOrder = {
    "uuid",
    "numeropratica",
    "modalitarimborso",
    "iban"
})
public class SetModalitaErogazioneRimborsoGPRRequest {

    @XmlElement(name = "UUID", required = true)
    protected String uuid;
    @XmlElement(name = "NUMERO_PRATICA")
    protected String numeropratica;
    @XmlElement(name = "MODALITA_RIMBORSO")
    protected BigInteger modalitarimborso;
    @XmlElementRef(name = "IBAN", namespace = "http://csi.it", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iban;

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
     * Recupera il valore della proprietà modalitarimborso.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMODALITARIMBORSO() {
        return modalitarimborso;
    }

    /**
     * Imposta il valore della proprietà modalitarimborso.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMODALITARIMBORSO(BigInteger value) {
        this.modalitarimborso = value;
    }

    /**
     * Recupera il valore della proprietà iban.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIBAN() {
        return iban;
    }

    /**
     * Imposta il valore della proprietà iban.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIBAN(JAXBElement<String> value) {
        this.iban = value;
    }

}
