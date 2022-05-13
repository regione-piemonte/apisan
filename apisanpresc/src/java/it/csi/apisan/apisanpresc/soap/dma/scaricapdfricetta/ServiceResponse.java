/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="esito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errori" type="{http://dma.csi.it/}ListaErroriType" minOccurs="0"/>
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
    "errori"
})
@XmlSeeAlso({
    ScaricaPdfRicettaResponse.class
})
public class ServiceResponse {

    protected String esito;
    protected ListaErroriType errori;

    /**
     * Recupera il valore della property esito.
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
     * Imposta il valore della property esito.
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
     * Recupera il valore della property errori.
     * 
     * @return
     *     possible object is
     *     {@link ListaErroriType }
     *     
     */
    public ListaErroriType getErrori() {
        return errori;
    }

    /**
     * Imposta il valore della property errori.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaErroriType }
     *     
     */
    public void setErrori(ListaErroriType value) {
        this.errori = value;
    }

}
