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
 * <p>Classe Java per Get_Date_Disponibili_WEBInParametersType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Get_Date_Disponibili_WEBInParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="I_COD_AGENDA" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="I_DATA" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pIdUtente" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pTipoScreen" type="{http://www.csi.it/ScreenServiziWebSOL/}tipoScreenType" />
 *       &lt;attribute name="pUtenteUvos" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="I_ADESIONE_SPONTANEA" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Get_Date_Disponibili_WEBInParametersType")
public class GetDateDisponibiliWEBInParametersType {

    @XmlAttribute(name = "I_COD_AGENDA")
    protected Integer icodagenda;
    @XmlAttribute(name = "I_DATA")
    protected String idata;
    @XmlAttribute(name = "pIdUtente")
    protected Integer pIdUtente;
    @XmlAttribute(name = "pTipoScreen")
    protected TipoScreenType pTipoScreen;
    @XmlAttribute(name = "pUtenteUvos")
    protected Integer pUtenteUvos;
    @XmlAttribute(name = "I_ADESIONE_SPONTANEA")
    protected Integer iadesionespontanea;

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
     * Recupera il valore della proprietà idata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDATA() {
        return idata;
    }

    /**
     * Imposta il valore della proprietà idata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDATA(String value) {
        this.idata = value;
    }

    /**
     * Recupera il valore della proprietà pIdUtente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPIdUtente() {
        return pIdUtente;
    }

    /**
     * Imposta il valore della proprietà pIdUtente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPIdUtente(Integer value) {
        this.pIdUtente = value;
    }

    /**
     * Recupera il valore della proprietà pTipoScreen.
     * 
     * @return
     *     possible object is
     *     {@link TipoScreenType }
     *     
     */
    public TipoScreenType getPTipoScreen() {
        return pTipoScreen;
    }

    /**
     * Imposta il valore della proprietà pTipoScreen.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoScreenType }
     *     
     */
    public void setPTipoScreen(TipoScreenType value) {
        this.pTipoScreen = value;
    }

    /**
     * Recupera il valore della proprietà pUtenteUvos.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPUtenteUvos() {
        return pUtenteUvos;
    }

    /**
     * Imposta il valore della proprietà pUtenteUvos.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPUtenteUvos(Integer value) {
        this.pUtenteUvos = value;
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

}
