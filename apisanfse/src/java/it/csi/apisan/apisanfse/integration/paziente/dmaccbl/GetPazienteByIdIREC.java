/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.paziente.dmaccbl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import it.csi.apisan.apisanfse.integration.paziente.dma.Richiedente;


/**
 * <p>Classe Java per getPazienteByIdIREC complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getPazienteByIdIREC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pazienteIdIrec" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="richiedente" type="{http://dma.csi.it/}richiedente" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPazienteByIdIREC", propOrder = {
    "pazienteIdIrec",
    "richiedente"
})
public class GetPazienteByIdIREC {

    protected Long pazienteIdIrec;
    protected Richiedente richiedente;

    /**
     * Recupera il valore della proprietà pazienteIdIrec.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPazienteIdIrec() {
        return pazienteIdIrec;
    }

    /**
     * Imposta il valore della proprietà pazienteIdIrec.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPazienteIdIrec(Long value) {
        this.pazienteIdIrec = value;
    }

    /**
     * Recupera il valore della proprietà richiedente.
     * 
     * @return
     *     possible object is
     *     {@link Richiedente }
     *     
     */
    public Richiedente getRichiedente() {
        return richiedente;
    }

    /**
     * Imposta il valore della proprietà richiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link Richiedente }
     *     
     */
    public void setRichiedente(Richiedente value) {
        this.richiedente = value;
    }

}
