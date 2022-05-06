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
 * <p>Classe Java per Crea_Appuntamento_WEBOutParametersType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Crea_Appuntamento_WEBOutParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="codiceDiRitorno" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="I_COD_DIPARTIMENTO" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="I_COD_AZIENDA" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="I_COD_UNPR" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="O_ESITO" type="{http://www.w3.org/2001/XMLSchema}int" />
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
@XmlType(name = "Crea_Appuntamento_WEBOutParametersType")
public class CreaAppuntamentoWEBOutParametersType {

    @XmlAttribute(name = "codiceDiRitorno")
    protected Integer codiceDiRitorno;
    @XmlAttribute(name = "I_COD_DIPARTIMENTO")
    protected Integer icoddipartimento;
    @XmlAttribute(name = "I_COD_AZIENDA")
    protected Integer icodazienda;
    @XmlAttribute(name = "I_COD_UNPR")
    protected String icodunpr;
    @XmlAttribute(name = "O_ESITO")
    protected Integer oesito;
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
     * Recupera il valore della proprietà icoddipartimento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getICODDIPARTIMENTO() {
        return icoddipartimento;
    }

    /**
     * Imposta il valore della proprietà icoddipartimento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setICODDIPARTIMENTO(Integer value) {
        this.icoddipartimento = value;
    }

    /**
     * Recupera il valore della proprietà icodazienda.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getICODAZIENDA() {
        return icodazienda;
    }

    /**
     * Imposta il valore della proprietà icodazienda.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setICODAZIENDA(Integer value) {
        this.icodazienda = value;
    }

    /**
     * Recupera il valore della proprietà icodunpr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICODUNPR() {
        return icodunpr;
    }

    /**
     * Imposta il valore della proprietà icodunpr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICODUNPR(String value) {
        this.icodunpr = value;
    }

    /**
     * Recupera il valore della proprietà oesito.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOESITO() {
        return oesito;
    }

    /**
     * Imposta il valore della proprietà oesito.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOESITO(Integer value) {
        this.oesito = value;
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
