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
 * <p>Classe Java per Scr_Mam_01OutParametersType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Scr_Mam_01OutParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="pDataApp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pOraApp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pLuogoApp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pDataSpedEsit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pDataSpedSoll" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pDataSpedConv" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pCodStatoPaz" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pCodAgendaMam" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pAppVisibile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pCodErrore" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pDesErr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Scr_Mam_01OutParametersType")
public class ScrMam01OutParametersType {

    @XmlAttribute(name = "pDataApp")
    protected String pDataApp;
    @XmlAttribute(name = "pOraApp")
    protected String pOraApp;
    @XmlAttribute(name = "pLuogoApp")
    protected String pLuogoApp;
    @XmlAttribute(name = "pDataSpedEsit")
    protected String pDataSpedEsit;
    @XmlAttribute(name = "pDataSpedSoll")
    protected String pDataSpedSoll;
    @XmlAttribute(name = "pDataSpedConv")
    protected String pDataSpedConv;
    @XmlAttribute(name = "pCodStatoPaz")
    protected String pCodStatoPaz;
    @XmlAttribute(name = "pCodAgendaMam")
    protected Integer pCodAgendaMam;
    @XmlAttribute(name = "pAppVisibile")
    protected String pAppVisibile;
    @XmlAttribute(name = "pCodErrore")
    protected Integer pCodErrore;
    @XmlAttribute(name = "pDesErr")
    protected String pDesErr;

    /**
     * Recupera il valore della proprietà pDataApp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDataApp() {
        return pDataApp;
    }

    /**
     * Imposta il valore della proprietà pDataApp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDataApp(String value) {
        this.pDataApp = value;
    }

    /**
     * Recupera il valore della proprietà pOraApp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOraApp() {
        return pOraApp;
    }

    /**
     * Imposta il valore della proprietà pOraApp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOraApp(String value) {
        this.pOraApp = value;
    }

    /**
     * Recupera il valore della proprietà pLuogoApp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLuogoApp() {
        return pLuogoApp;
    }

    /**
     * Imposta il valore della proprietà pLuogoApp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLuogoApp(String value) {
        this.pLuogoApp = value;
    }

    /**
     * Recupera il valore della proprietà pDataSpedEsit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDataSpedEsit() {
        return pDataSpedEsit;
    }

    /**
     * Imposta il valore della proprietà pDataSpedEsit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDataSpedEsit(String value) {
        this.pDataSpedEsit = value;
    }

    /**
     * Recupera il valore della proprietà pDataSpedSoll.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDataSpedSoll() {
        return pDataSpedSoll;
    }

    /**
     * Imposta il valore della proprietà pDataSpedSoll.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDataSpedSoll(String value) {
        this.pDataSpedSoll = value;
    }

    /**
     * Recupera il valore della proprietà pDataSpedConv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDataSpedConv() {
        return pDataSpedConv;
    }

    /**
     * Imposta il valore della proprietà pDataSpedConv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDataSpedConv(String value) {
        this.pDataSpedConv = value;
    }

    /**
     * Recupera il valore della proprietà pCodStatoPaz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCodStatoPaz() {
        return pCodStatoPaz;
    }

    /**
     * Imposta il valore della proprietà pCodStatoPaz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCodStatoPaz(String value) {
        this.pCodStatoPaz = value;
    }

    /**
     * Recupera il valore della proprietà pCodAgendaMam.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPCodAgendaMam() {
        return pCodAgendaMam;
    }

    /**
     * Imposta il valore della proprietà pCodAgendaMam.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPCodAgendaMam(Integer value) {
        this.pCodAgendaMam = value;
    }

    /**
     * Recupera il valore della proprietà pAppVisibile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAppVisibile() {
        return pAppVisibile;
    }

    /**
     * Imposta il valore della proprietà pAppVisibile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAppVisibile(String value) {
        this.pAppVisibile = value;
    }

    /**
     * Recupera il valore della proprietà pCodErrore.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPCodErrore() {
        return pCodErrore;
    }

    /**
     * Imposta il valore della proprietà pCodErrore.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPCodErrore(Integer value) {
        this.pCodErrore = value;
    }

    /**
     * Recupera il valore della proprietà pDesErr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDesErr() {
        return pDesErr;
    }

    /**
     * Imposta il valore della proprietà pDesErr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDesErr(String value) {
        this.pDesErr = value;
    }

}
