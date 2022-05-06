/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.farmab.interfacews.msg.farab;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per serviceResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="serviceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="esito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="elencoErrori" type="{http://farab.msg.interfacews.farmab.dma.csi.it/}elencoErroriType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceResponse", propOrder = {
    "esito",
    "elencoErrori"
})
@XmlSeeAlso({
    CertificaDeviceConOtpResponse.class,
    CertificaDeviceResponse.class,
    AutorizzaFarmaciaOccasionaleResponse.class,
    GetFarmaciaOccasionaleResponse.class
})
public class ServiceResponse {

    @XmlElement(namespace = "http://farab.msg.interfacews.farmab.dma.csi.it/")
    protected String esito;
    protected ElencoErroriType elencoErrori;

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

    /**
     * Recupera il valore della proprietà elencoErrori.
     * 
     * @return
     *     possible object is
     *     {@link ElencoErroriType }
     *     
     */
    public ElencoErroriType getElencoErrori() {
        return elencoErrori;
    }

    /**
     * Imposta il valore della proprietà elencoErrori.
     * 
     * @param value
     *     allowed object is
     *     {@link ElencoErroriType }
     *     
     */
    public void setElencoErrori(ElencoErroriType value) {
        this.elencoErrori = value;
    }

}
