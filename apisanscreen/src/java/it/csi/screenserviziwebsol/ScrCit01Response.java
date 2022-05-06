/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.screenserviziwebsol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import it.csi.gestutility.ErroriType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Errori" type="{http://www.csi.it/GestUtility/}ErroriType"/>
 *         &lt;element name="Scr_Cit_01OutParameters" type="{http://www.csi.it/ScreenServiziWebSOL/}Scr_Cit_01OutParametersType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "errori",
    "scrCit01OutParameters"
})
@XmlRootElement(name = "Scr_Cit_01Response")
public class ScrCit01Response {

    @XmlElement(name = "Errori", required = true)
    protected ErroriType errori;
    @XmlElement(name = "Scr_Cit_01OutParameters", required = true)
    protected ScrCit01OutParametersType scrCit01OutParameters;

    /**
     * Recupera il valore della proprietà errori.
     * 
     * @return
     *     possible object is
     *     {@link ErroriType }
     *     
     */
    public ErroriType getErrori() {
        return errori;
    }

    /**
     * Imposta il valore della proprietà errori.
     * 
     * @param value
     *     allowed object is
     *     {@link ErroriType }
     *     
     */
    public void setErrori(ErroriType value) {
        this.errori = value;
    }

    /**
     * Recupera il valore della proprietà scrCit01OutParameters.
     * 
     * @return
     *     possible object is
     *     {@link ScrCit01OutParametersType }
     *     
     */
    public ScrCit01OutParametersType getScrCit01OutParameters() {
        return scrCit01OutParameters;
    }

    /**
     * Imposta il valore della proprietà scrCit01OutParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link ScrCit01OutParametersType }
     *     
     */
    public void setScrCit01OutParameters(ScrCit01OutParametersType value) {
        this.scrCit01OutParameters = value;
    }

}
