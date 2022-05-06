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
 * <p>Classe Java per Get_Appuntamenti_WEBInParametersType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Get_Appuntamenti_WEBInParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="I_COD_AGENDA" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="I_DATA_RIF" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="I_UTENTE_UVOS" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="I_ID_UTENTE" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="I_ADESIONE_SPONTANEA" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="I_TIPO_SCREEN" type="{http://www.csi.it/ScreenServiziWebSOL/}tipoScreenType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Get_Appuntamenti_WEBInParametersType")
public class GetAppuntamentiWEBInParametersType {

    @XmlAttribute(name = "I_COD_AGENDA")
    protected Integer icodagenda;
    @XmlAttribute(name = "I_DATA_RIF")
    protected String idatarif;
    @XmlAttribute(name = "I_UTENTE_UVOS")
    protected Integer iutenteuvos;
    @XmlAttribute(name = "I_ID_UTENTE")
    protected Integer iidutente;
    @XmlAttribute(name = "I_ADESIONE_SPONTANEA")
    protected Integer iadesionespontanea;
    @XmlAttribute(name = "I_TIPO_SCREEN")
    protected TipoScreenType itiposcreen;

    /**
     * Recupera il valore della proprietà icodagenda.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getICODAGENDA() {
        return icodagenda;
    }

    /**
     * Imposta il valore della proprietà icodagenda.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setICODAGENDA(Integer value) {
        this.icodagenda = value;
    }

    /**
     * Recupera il valore della proprietà idatarif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDATARIF() {
        return idatarif;
    }

    /**
     * Imposta il valore della proprietà idatarif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDATARIF(String value) {
        this.idatarif = value;
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
     * Recupera il valore della proprietà iadesionespontanea.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIADESIONESPONTANEA() {
        return iadesionespontanea;
    }

    /**
     * Imposta il valore della proprietà iadesionespontanea.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIADESIONESPONTANEA(Integer value) {
        this.iadesionespontanea = value;
    }

    /**
     * Recupera il valore della proprietà itiposcreen.
     * 
     * @return
     *     possible object is
     *     {@link TipoScreenType }
     *     
     */
    public TipoScreenType getITIPOSCREEN() {
        return itiposcreen;
    }

    /**
     * Imposta il valore della proprietà itiposcreen.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoScreenType }
     *     
     */
    public void setITIPOSCREEN(TipoScreenType value) {
        this.itiposcreen = value;
    }

}
