/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.farmab.interfacews.msg.farab;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per farmaciaOccasionaleType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="farmaciaOccasionaleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idRich" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataRichiesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codFarmacia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descrFarmacia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indirizzoFarmacia" type="{http://farab.msg.interfacews.farmab.dma.csi.it/}indirizzoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farmaciaOccasionaleType", propOrder = {
    "idRich",
    "dataRichiesta",
    "codFarmacia",
    "descrFarmacia",
    "indirizzoFarmacia"
})
public class FarmaciaOccasionaleType {

    @XmlElement(required = true)
    protected String idRich;
    protected String dataRichiesta;
    protected String codFarmacia;
    protected String descrFarmacia;
    protected IndirizzoType indirizzoFarmacia;

    /**
     * Recupera il valore della proprietà idRich.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRich() {
        return idRich;
    }

    /**
     * Imposta il valore della proprietà idRich.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRich(String value) {
        this.idRich = value;
    }

    /**
     * Recupera il valore della proprietà dataRichiesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRichiesta() {
        return dataRichiesta;
    }

    /**
     * Imposta il valore della proprietà dataRichiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRichiesta(String value) {
        this.dataRichiesta = value;
    }

    /**
     * Recupera il valore della proprietà codFarmacia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodFarmacia() {
        return codFarmacia;
    }

    /**
     * Imposta il valore della proprietà codFarmacia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodFarmacia(String value) {
        this.codFarmacia = value;
    }

    /**
     * Recupera il valore della proprietà descrFarmacia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrFarmacia() {
        return descrFarmacia;
    }

    /**
     * Imposta il valore della proprietà descrFarmacia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrFarmacia(String value) {
        this.descrFarmacia = value;
    }

    /**
     * Recupera il valore della proprietà indirizzoFarmacia.
     * 
     * @return
     *     possible object is
     *     {@link IndirizzoType }
     *     
     */
    public IndirizzoType getIndirizzoFarmacia() {
        return indirizzoFarmacia;
    }

    /**
     * Imposta il valore della proprietà indirizzoFarmacia.
     * 
     * @param value
     *     allowed object is
     *     {@link IndirizzoType }
     *     
     */
    public void setIndirizzoFarmacia(IndirizzoType value) {
        this.indirizzoFarmacia = value;
    }

}
