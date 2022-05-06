/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.farmab.interfacews.msg.setfarmaciaabituale;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per setFarmaciaAbitualeRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="setFarmaciaAbitualeRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://setfarmaciaabituale.msg.interfacews.farmab.dma.csi.it/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="cfCittadino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="azione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idFarmaciaAbituale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceFarmacia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataInizioValidita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataFineValidita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setFarmaciaAbitualeRequest", propOrder = {
    "cfCittadino",
    "azione",
    "idFarmaciaAbituale",
    "codiceFarmacia",
    "dataInizioValidita",
    "dataFineValidita"
})
public class SetFarmaciaAbitualeRequest
    extends ServiceRequest
{

    protected String cfCittadino;
    protected String azione;
    protected String idFarmaciaAbituale;
    protected String codiceFarmacia;
    protected String dataInizioValidita;
    protected String dataFineValidita;

    /**
     * Recupera il valore della proprietà cfCittadino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfCittadino() {
        return cfCittadino;
    }

    /**
     * Imposta il valore della proprietà cfCittadino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfCittadino(String value) {
        this.cfCittadino = value;
    }

    /**
     * Recupera il valore della proprietà azione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAzione() {
        return azione;
    }

    /**
     * Imposta il valore della proprietà azione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAzione(String value) {
        this.azione = value;
    }

    /**
     * Recupera il valore della proprietà idFarmaciaAbituale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFarmaciaAbituale() {
        return idFarmaciaAbituale;
    }

    /**
     * Imposta il valore della proprietà idFarmaciaAbituale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFarmaciaAbituale(String value) {
        this.idFarmaciaAbituale = value;
    }

    /**
     * Recupera il valore della proprietà codiceFarmacia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFarmacia() {
        return codiceFarmacia;
    }

    /**
     * Imposta il valore della proprietà codiceFarmacia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFarmacia(String value) {
        this.codiceFarmacia = value;
    }

    /**
     * Recupera il valore della proprietà dataInizioValidita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInizioValidita() {
        return dataInizioValidita;
    }

    /**
     * Imposta il valore della proprietà dataInizioValidita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInizioValidita(String value) {
        this.dataInizioValidita = value;
    }

    /**
     * Recupera il valore della proprietà dataFineValidita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataFineValidita() {
        return dataFineValidita;
    }

    /**
     * Imposta il valore della proprietà dataFineValidita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFineValidita(String value) {
        this.dataFineValidita = value;
    }

}
