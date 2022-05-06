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
 * <p>Classe Java per GET_STRUTTURE_WEB2InParametersType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GET_STRUTTURE_WEB2InParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="I_COD_ID_INTERNO" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="I_PREF_ID_INTERNO" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="I_TIPO_SCREEN" type="{http://www.csi.it/ScreenServiziWebSOL/}tipoScreenType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GET_STRUTTURE_WEB2InParametersType")
public class GETSTRUTTUREWEB2InParametersType {

    @XmlAttribute(name = "I_COD_ID_INTERNO")
    protected Integer icodidinterno;
    @XmlAttribute(name = "I_PREF_ID_INTERNO")
    protected String iprefidinterno;
    @XmlAttribute(name = "I_TIPO_SCREEN")
    protected TipoScreenType itiposcreen;

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

}
