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
 * <p>Classe Java per Scr_Ana_01InParametersType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Scr_Ana_01InParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="pCodFiscale" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Scr_Ana_01InParametersType")
public class ScrAna01InParametersType {

    @XmlAttribute(name = "pCodFiscale")
    protected String pCodFiscale;

    /**
     * Recupera il valore della proprietà pCodFiscale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCodFiscale() {
        return pCodFiscale;
    }

    /**
     * Imposta il valore della proprietà pCodFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCodFiscale(String value) {
        this.pCodFiscale = value;
    }

}
