/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.iccws.dmacc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per verificaFarmacistaRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="verificaFarmacistaRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dma.csi.it/}farmacia" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}codiceFiscaleFarmacista" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verificaFarmacistaRequest", propOrder = {
    "farmacia",
    "codiceFiscaleFarmacista"
})
public class VerificaFarmacistaRequest {

    @XmlElement(namespace = "http://dma.csi.it/")
    protected Farmacia farmacia;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected String codiceFiscaleFarmacista;

    /**
     * Recupera il valore della proprietà farmacia.
     * 
     * @return
     *     possible object is
     *     {@link Farmacia }
     *     
     */
    public Farmacia getFarmacia() {
        return farmacia;
    }

    /**
     * Imposta il valore della proprietà farmacia.
     * 
     * @param value
     *     allowed object is
     *     {@link Farmacia }
     *     
     */
    public void setFarmacia(Farmacia value) {
        this.farmacia = value;
    }

    /**
     * Recupera il valore della proprietà codiceFiscaleFarmacista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscaleFarmacista() {
        return codiceFiscaleFarmacista;
    }

    /**
     * Imposta il valore della proprietà codiceFiscaleFarmacista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscaleFarmacista(String value) {
        this.codiceFiscaleFarmacista = value;
    }

}
