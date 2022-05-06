/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.screenserviziwebsol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per GET_STRUTTURE_WEB2OutParametersType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GET_STRUTTURE_WEB2OutParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="codiceDiRitorno" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="O_ELENCO1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="O_NUM_ELEMENTI1" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="O_ELENCO2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="O_NUM_ELEMENTI2" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="O_COD_ERRORE" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="O_DESCR_ERRORE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_STRUTTURE_WEB2OutParametersType")
public class GETSTRUTTUREWEB2OutParametersType {

    @XmlAttribute(name = "codiceDiRitorno")
    protected Integer codiceDiRitorno;
    @XmlAttribute(name = "O_ELENCO1")
    protected String oelenco1;
    @XmlAttribute(name = "O_NUM_ELEMENTI1")
    protected Integer onumelementi1;
    @XmlAttribute(name = "O_ELENCO2")
    protected String oelenco2;
    @XmlAttribute(name = "O_NUM_ELEMENTI2")
    protected Integer onumelementi2;
    @XmlAttribute(name = "O_COD_ERRORE")
    protected Integer ocoderrore;
    @XmlAttribute(name = "O_DESCR_ERRORE")
    protected String odescrerrore;

    /**
     * Recupera il valore della proprietà codiceDiRitorno.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodiceDiRitorno() {
        return codiceDiRitorno;
    }

    /**
     * Imposta il valore della proprietà codiceDiRitorno.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodiceDiRitorno(Integer value) {
        this.codiceDiRitorno = value;
    }

    /**
     * Recupera il valore della proprietà oelenco1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOELENCO1() {
        return oelenco1;
    }

    /**
     * Imposta il valore della proprietà oelenco1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOELENCO1(String value) {
        this.oelenco1 = value;
    }

    /**
     * Recupera il valore della proprietà onumelementi1.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getONUMELEMENTI1() {
        return onumelementi1;
    }

    /**
     * Imposta il valore della proprietà onumelementi1.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setONUMELEMENTI1(Integer value) {
        this.onumelementi1 = value;
    }

    /**
     * Recupera il valore della proprietà oelenco2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOELENCO2() {
        return oelenco2;
    }

    /**
     * Imposta il valore della proprietà oelenco2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOELENCO2(String value) {
        this.oelenco2 = value;
    }

    /**
     * Recupera il valore della proprietà onumelementi2.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getONUMELEMENTI2() {
        return onumelementi2;
    }

    /**
     * Imposta il valore della proprietà onumelementi2.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setONUMELEMENTI2(Integer value) {
        this.onumelementi2 = value;
    }

    /**
     * Recupera il valore della proprietà ocoderrore.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOCODERRORE() {
        return ocoderrore;
    }

    /**
     * Imposta il valore della proprietà ocoderrore.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOCODERRORE(Integer value) {
        this.ocoderrore = value;
    }

    /**
     * Recupera il valore della proprietà odescrerrore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getODESCRERRORE() {
        return odescrerrore;
    }

    /**
     * Imposta il valore della proprietà odescrerrore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setODESCRERRORE(String value) {
        this.odescrerrore = value;
    }

}
