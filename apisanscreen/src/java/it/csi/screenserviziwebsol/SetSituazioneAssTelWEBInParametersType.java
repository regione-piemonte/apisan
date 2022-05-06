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
 * <p>Classe Java per Set_Situazione_Ass_Tel_WEBInParametersType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Set_Situazione_Ass_Tel_WEBInParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="I_COD_ID_INTERNO" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="I_PREF_ID_INTERNO" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="I_TIPO_SCREENING" type="{http://www.csi.it/ScreenServiziWebSOL/}tipoScreenType" />
 *       &lt;attribute name="I_TEL_ALRT_RES" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="I_TEL_ALT_DOM" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="I_E_MAIL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="I_ID_UTENTE" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="I_UTENTE_UVOS" type="{http://www.w3.org/2001/XMLSchema}int" />
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
@XmlType(name = "Set_Situazione_Ass_Tel_WEBInParametersType")
public class SetSituazioneAssTelWEBInParametersType {

    @XmlAttribute(name = "I_COD_ID_INTERNO")
    protected Integer icodidinterno;
    @XmlAttribute(name = "I_PREF_ID_INTERNO")
    protected String iprefidinterno;
    @XmlAttribute(name = "I_TIPO_SCREENING")
    protected TipoScreenType itiposcreening;
    @XmlAttribute(name = "I_TEL_ALRT_RES")
    protected String itelalrtres;
    @XmlAttribute(name = "I_TEL_ALT_DOM")
    protected String itelaltdom;
    @XmlAttribute(name = "I_E_MAIL")
    protected String iemail;
    @XmlAttribute(name = "I_ID_UTENTE")
    protected Integer iidutente;
    @XmlAttribute(name = "I_UTENTE_UVOS")
    protected Integer iutenteuvos;
    @XmlAttribute(name = "O_COD_ERRORE")
    protected Integer ocoderrore;
    @XmlAttribute(name = "O_DESCR_ERRORE")
    protected String odescrerrore;

    /**
     * Recupera il valore della proprietà icodidinterno.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getICODIDINTERNO() {
        return icodidinterno;
    }

    /**
     * Imposta il valore della proprietà icodidinterno.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setICODIDINTERNO(Integer value) {
        this.icodidinterno = value;
    }

    /**
     * Recupera il valore della proprietà iprefidinterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPREFIDINTERNO() {
        return iprefidinterno;
    }

    /**
     * Imposta il valore della proprietà iprefidinterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPREFIDINTERNO(String value) {
        this.iprefidinterno = value;
    }

    /**
     * Recupera il valore della proprietà itiposcreening.
     * 
     * @return
     *     possible object is
     *     {@link TipoScreenType }
     *     
     */
    public TipoScreenType getITIPOSCREENING() {
        return itiposcreening;
    }

    /**
     * Imposta il valore della proprietà itiposcreening.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoScreenType }
     *     
     */
    public void setITIPOSCREENING(TipoScreenType value) {
        this.itiposcreening = value;
    }

    /**
     * Recupera il valore della proprietà itelalrtres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITELALRTRES() {
        return itelalrtres;
    }

    /**
     * Imposta il valore della proprietà itelalrtres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITELALRTRES(String value) {
        this.itelalrtres = value;
    }

    /**
     * Recupera il valore della proprietà itelaltdom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITELALTDOM() {
        return itelaltdom;
    }

    /**
     * Imposta il valore della proprietà itelaltdom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITELALTDOM(String value) {
        this.itelaltdom = value;
    }

    /**
     * Recupera il valore della proprietà iemail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIEMAIL() {
        return iemail;
    }

    /**
     * Imposta il valore della proprietà iemail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIEMAIL(String value) {
        this.iemail = value;
    }

    /**
     * Recupera il valore della proprietà iidutente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIIDUTENTE() {
        return iidutente;
    }

    /**
     * Imposta il valore della proprietà iidutente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIIDUTENTE(Integer value) {
        this.iidutente = value;
    }

    /**
     * Recupera il valore della proprietà iutenteuvos.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIUTENTEUVOS() {
        return iutenteuvos;
    }

    /**
     * Imposta il valore della proprietà iutenteuvos.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIUTENTEUVOS(Integer value) {
        this.iutenteuvos = value;
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
