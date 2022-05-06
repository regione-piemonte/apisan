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
 * <p>Classe Java per Check_Eta_ScreeningInParametersType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Check_Eta_ScreeningInParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="pCodInterno" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pPrefInterno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tipoScreen" type="{http://www.csi.it/ScreenServiziWebSOL/}tipoScreenType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Check_Eta_ScreeningInParametersType")
public class CheckEtaScreeningInParametersType {

    @XmlAttribute(name = "pCodInterno")
    protected Integer pCodInterno;
    @XmlAttribute(name = "pPrefInterno")
    protected String pPrefInterno;
    @XmlAttribute(name = "tipoScreen")
    protected TipoScreenType tipoScreen;

    /**
     * Recupera il valore della proprietà pCodInterno.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPCodInterno() {
        return pCodInterno;
    }

    /**
     * Imposta il valore della proprietà pCodInterno.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPCodInterno(Integer value) {
        this.pCodInterno = value;
    }

    /**
     * Recupera il valore della proprietà pPrefInterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPrefInterno() {
        return pPrefInterno;
    }

    /**
     * Imposta il valore della proprietà pPrefInterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPrefInterno(String value) {
        this.pPrefInterno = value;
    }

    /**
     * Recupera il valore della proprietà tipoScreen.
     * 
     * @return
     *     possible object is
     *     {@link TipoScreenType }
     *     
     */
    public TipoScreenType getTipoScreen() {
        return tipoScreen;
    }

    /**
     * Imposta il valore della proprietà tipoScreen.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoScreenType }
     *     
     */
    public void setTipoScreen(TipoScreenType value) {
        this.tipoScreen = value;
    }

}
