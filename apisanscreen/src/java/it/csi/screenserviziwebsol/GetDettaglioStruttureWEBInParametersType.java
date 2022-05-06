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
 * <p>Classe Java per Get_Dettaglio_Strutture_WEBInParametersType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Get_Dettaglio_Strutture_WEBInParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="I_COD_ID_INTERNO" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="I_PREF_ID_INTERNO" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="I_TIPO_SCREEN" type="{http://www.csi.it/ScreenServiziWebSOL/}tipoScreenType" />
 *       &lt;attribute name="I_COD_AZIENDA" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="I_ISTAT" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="I_COD_UNPR" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Get_Dettaglio_Strutture_WEBInParametersType")
public class GetDettaglioStruttureWEBInParametersType {

    @XmlAttribute(name = "I_COD_ID_INTERNO")
    protected Integer icodidinterno;
    @XmlAttribute(name = "I_PREF_ID_INTERNO")
    protected String iprefidinterno;
    @XmlAttribute(name = "I_TIPO_SCREEN")
    protected TipoScreenType itiposcreen;
    @XmlAttribute(name = "I_COD_AZIENDA")
    protected Integer icodazienda;
    @XmlAttribute(name = "I_ISTAT")
    protected String iistat;
    @XmlAttribute(name = "I_COD_UNPR")
    protected String icodunpr;

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
     * Recupera il valore della proprietà iistat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIISTAT() {
        return iistat;
    }

    /**
     * Imposta il valore della proprietà iistat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIISTAT(String value) {
        this.iistat = value;
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

}
