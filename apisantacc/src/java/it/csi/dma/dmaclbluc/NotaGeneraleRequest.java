/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per notaGeneraleRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="notaGeneraleRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statoSalute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="stileVita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notaGeneraleRequest", propOrder = {
    "statoSalute",
    "stileVita"
})
public class NotaGeneraleRequest {

    protected String statoSalute;
    protected String stileVita;

    /**
     * Recupera il valore della proprietà statoSalute.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatoSalute() {
        return statoSalute;
    }

    /**
     * Imposta il valore della proprietà statoSalute.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatoSalute(String value) {
        this.statoSalute = value;
    }

    /**
     * Recupera il valore della proprietà stileVita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStileVita() {
        return stileVita;
    }

    /**
     * Imposta il valore della proprietà stileVita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStileVita(String value) {
        this.stileVita = value;
    }

}
